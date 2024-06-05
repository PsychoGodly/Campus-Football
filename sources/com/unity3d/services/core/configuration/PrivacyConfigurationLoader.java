package com.unity3d.services.core.configuration;

import com.unity3d.services.core.extensions.AbortRetryException;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.mapper.WebRequestToHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class PrivacyConfigurationLoader implements IConfigurationLoader {
    private final IConfigurationLoader _configurationLoader;
    private final ConfigurationRequestFactory _configurationRequestFactory;
    private final HttpClient _httpClient;
    /* access modifiers changed from: private */
    public final PrivacyConfigStorage _privacyConfigStorage;

    public PrivacyConfigurationLoader(IConfigurationLoader iConfigurationLoader, ConfigurationRequestFactory configurationRequestFactory, PrivacyConfigStorage privacyConfigStorage, HttpClient httpClient) {
        this._configurationLoader = iConfigurationLoader;
        this._configurationRequestFactory = configurationRequestFactory;
        this._privacyConfigStorage = privacyConfigStorage;
        this._httpClient = httpClient;
    }

    private void load(IPrivacyConfigurationListener iPrivacyConfigurationListener) throws Exception {
        try {
            HttpRequest httpRequest = WebRequestToHttpRequestKt.toHttpRequest(this._configurationRequestFactory.getWebRequest());
            InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestStart();
            HttpResponse executeBlocking = this._httpClient.executeBlocking(httpRequest);
            try {
                if (executeBlocking.getStatusCode() / 100 == 2) {
                    InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(true);
                    iPrivacyConfigurationListener.onSuccess(new PrivacyConfig(new JSONObject(executeBlocking.getBody().toString())));
                } else if (executeBlocking.getStatusCode() == 423) {
                    InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
                    PrivacyCallError privacyCallError = PrivacyCallError.LOCKED_423;
                    iPrivacyConfigurationListener.onError(privacyCallError, "Game ID is disabled " + ClientProperties.getGameId());
                } else {
                    InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
                    PrivacyCallError privacyCallError2 = PrivacyCallError.NETWORK_ISSUE;
                    iPrivacyConfigurationListener.onError(privacyCallError2, "Privacy request failed with code: " + executeBlocking.getStatusCode());
                }
            } catch (Exception unused) {
                InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
                iPrivacyConfigurationListener.onError(PrivacyCallError.NETWORK_ISSUE, "Could not create web request");
            }
        } catch (Exception e10) {
            PrivacyCallError privacyCallError3 = PrivacyCallError.NETWORK_ISSUE;
            iPrivacyConfigurationListener.onError(privacyCallError3, "Could not create web request: " + e10);
        }
    }

    public Configuration getLocalConfiguration() {
        return this._configurationLoader.getLocalConfiguration();
    }

    public void loadConfiguration(IConfigurationLoaderListener iConfigurationLoaderListener) throws Exception {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (this._privacyConfigStorage.getPrivacyConfig().getPrivacyStatus() == PrivacyConfigStatus.UNKNOWN) {
            load(new IPrivacyConfigurationListener() {
                public void onError(PrivacyCallError privacyCallError, String str) {
                    DeviceLog.warning("Couldn't fetch privacy configuration: " + str);
                    PrivacyConfigurationLoader.this._privacyConfigStorage.setPrivacyConfig(new PrivacyConfig());
                    if (privacyCallError == PrivacyCallError.LOCKED_423) {
                        atomicBoolean.set(true);
                    }
                }

                public void onSuccess(PrivacyConfig privacyConfig) {
                    PrivacyConfigurationLoader.this._privacyConfigStorage.setPrivacyConfig(privacyConfig);
                }
            });
        }
        if (!atomicBoolean.get()) {
            this._configurationLoader.loadConfiguration(iConfigurationLoaderListener);
            return;
        }
        throw new AbortRetryException("Game is disabled");
    }
}
