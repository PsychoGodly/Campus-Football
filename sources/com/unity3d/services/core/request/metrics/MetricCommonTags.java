package com.unity3d.services.core.request.metrics;

import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.PrivacyConfig;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.IObserver;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.HashMap;
import java.util.Map;

public class MetricCommonTags {
    private static final String METRIC_COMMON_TAG_CONFIG_SOURCE = "src";
    private static final String METRIC_COMMON_TAG_COUNTRY_ISO = "iso";
    private static final String METRIC_COMMON_TAG_MEDIATION_ADAPTER = "m_ad_ver";
    private static final String METRIC_COMMON_TAG_MEDIATION_NAME = "m_name";
    private static final String METRIC_COMMON_TAG_MEDIATION_VERSION = "m_ver";
    private static final String METRIC_COMMON_TAG_PLATFORM = "plt";
    public static final String METRIC_COMMON_TAG_PLATFORM_ANDROID = "android";
    private static final String METRIC_COMMON_TAG_PRIVACY_MODE = "prvc";
    private static final String METRIC_COMMON_TAG_SDK_VERSION = "sdk";
    private static final String METRIC_COMMON_TAG_SYSTEM_VERSION = "system";
    private static final String METRIC_COMMON_TAG_TEST_MODE = "tm";
    private String _configSrc;
    private final String _countryISO = Device.getNetworkCountryISO();
    private Map<String, String> _experiments;
    private String _mediationAdapter;
    private String _mediationName;
    private String _mediationVersion;
    private final String _platform = "android";
    /* access modifiers changed from: private */
    public String _privacyMode = PrivacyConfigStorage.getInstance().getPrivacyConfig().getPrivacyStatus().toLowerCase();
    private final IObserver<PrivacyConfig> _privacyObserver;
    private final String _sdkVersion = SdkProperties.getVersionName();
    private final String _systemVersion = Device.getOsVersion();
    private final boolean _testMode = SdkProperties.isTestMode();

    public MetricCommonTags() {
        AnonymousClass1 r02 = new IObserver<PrivacyConfig>() {
            public void updated(PrivacyConfig privacyConfig) {
                String unused = MetricCommonTags.this._privacyMode = privacyConfig.getPrivacyStatus().toString().toLowerCase();
            }
        };
        this._privacyObserver = r02;
        PrivacyConfigStorage.getInstance().registerObserver(r02);
    }

    private boolean mediationIsEmpty() {
        String str = this._mediationName;
        return str == null || str.isEmpty();
    }

    private void refreshMediationData() {
        try {
            Storage storage = StorageManager.getStorage(StorageManager.StorageType.PUBLIC);
            if (storage != null && storage.initStorage()) {
                this._mediationName = (String) storage.get(AndroidMediationDataSource.MEDIATION_NAME_KEY);
                this._mediationVersion = (String) storage.get(AndroidMediationDataSource.MEDIATION_VERSION_KEY);
                this._mediationAdapter = (String) storage.get("mediation.adapter_version.value");
            }
        } catch (Exception e10) {
            DeviceLog.debug("Failed to refreshMediationData: %s", e10.getLocalizedMessage());
        }
    }

    public void shutdown() {
        PrivacyConfigStorage.getInstance().unregisterObserver(this._privacyObserver);
    }

    public Map<String, String> toMap() {
        if (mediationIsEmpty()) {
            refreshMediationData();
        }
        HashMap hashMap = new HashMap();
        String str = this._countryISO;
        if (str != null) {
            hashMap.put(METRIC_COMMON_TAG_COUNTRY_ISO, str);
        }
        String str2 = this._platform;
        if (str2 != null) {
            hashMap.put(METRIC_COMMON_TAG_PLATFORM, str2);
        }
        String str3 = this._sdkVersion;
        if (str3 != null) {
            hashMap.put("sdk", str3);
        }
        String str4 = this._systemVersion;
        if (str4 != null) {
            hashMap.put(METRIC_COMMON_TAG_SYSTEM_VERSION, str4);
        }
        String str5 = this._privacyMode;
        if (str5 != null) {
            hashMap.put(METRIC_COMMON_TAG_PRIVACY_MODE, str5);
        }
        String str6 = this._configSrc;
        if (str6 != null) {
            hashMap.put(METRIC_COMMON_TAG_CONFIG_SOURCE, str6);
        }
        String str7 = this._mediationName;
        if (str7 != null) {
            hashMap.put(METRIC_COMMON_TAG_MEDIATION_NAME, str7);
        }
        String str8 = this._mediationVersion;
        if (str8 != null) {
            hashMap.put(METRIC_COMMON_TAG_MEDIATION_VERSION, str8);
        }
        String str9 = this._mediationAdapter;
        if (str9 != null) {
            hashMap.put(METRIC_COMMON_TAG_MEDIATION_ADAPTER, str9);
        }
        Map<String, String> map = this._experiments;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(METRIC_COMMON_TAG_TEST_MODE, String.valueOf(this._testMode));
        return hashMap;
    }

    public void updateWithConfig(Configuration configuration) {
        this._configSrc = configuration.getSrc();
        if (configuration.getExperiments() != null) {
            this._experiments = configuration.getExperiments().getExperimentTags();
        }
    }
}
