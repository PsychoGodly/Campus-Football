package com.unity3d.services.core.configuration;

import com.unity3d.services.core.device.reader.IDeviceInfoDataContainer;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.WebRequest;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.HashMap;

public class ConfigurationRequestFactory {
    private final Configuration _configuration;
    private final IDeviceInfoDataContainer _deviceInfoDataContainer;

    public ConfigurationRequestFactory(Configuration configuration) {
        this(configuration, (IDeviceInfoDataContainer) null);
    }

    public Configuration getConfiguration() {
        return this._configuration;
    }

    public WebRequest getWebRequest() throws MalformedURLException {
        String configUrl = this._configuration.getConfigUrl();
        if (configUrl != null) {
            StringBuilder sb2 = new StringBuilder(configUrl);
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Encoding", Collections.singletonList("gzip"));
            WebRequest webRequest = new WebRequest(sb2.toString(), "POST", hashMap);
            IDeviceInfoDataContainer iDeviceInfoDataContainer = this._deviceInfoDataContainer;
            webRequest.setBody(iDeviceInfoDataContainer != null ? iDeviceInfoDataContainer.getDeviceData() : null);
            DeviceLog.debug("Requesting configuration with: " + sb2);
            return webRequest;
        }
        throw new MalformedURLException("Base URL is null");
    }

    public ConfigurationRequestFactory(Configuration configuration, IDeviceInfoDataContainer iDeviceInfoDataContainer) {
        this._configuration = configuration;
        this._deviceInfoDataContainer = iDeviceInfoDataContainer;
    }
}
