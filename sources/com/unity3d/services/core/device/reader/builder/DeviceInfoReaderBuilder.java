package com.unity3d.services.core.device.reader.builder;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.reader.DeviceInfoReaderExtended;
import com.unity3d.services.core.device.reader.DeviceInfoReaderFilterProvider;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithAuid;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithFilter;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithLifecycle;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithMetrics;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithPrivacy;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithRequestType;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithSessionId;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithStorageInfo;
import com.unity3d.services.core.device.reader.IDeviceInfoReader;
import com.unity3d.services.core.device.reader.IGameSessionIdReader;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.device.reader.MinimalDeviceInfoReader;
import com.unity3d.services.core.device.reader.pii.PiiDataProvider;
import com.unity3d.services.core.device.reader.pii.PiiTrackingStatusReader;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.misc.IJsonStorageReader;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import com.unity3d.services.core.misc.JsonStorageAggregator;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.Session;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.Arrays;
import java.util.Collections;

public class DeviceInfoReaderBuilder {
    private final ConfigurationReader _configurationReader;
    private final IGameSessionIdReader _gameSessionIdReader;
    private final PrivacyConfigStorage _privacyConfigStorage;

    public DeviceInfoReaderBuilder(ConfigurationReader configurationReader, PrivacyConfigStorage privacyConfigStorage, IGameSessionIdReader iGameSessionIdReader) {
        this._configurationReader = configurationReader;
        this._privacyConfigStorage = privacyConfigStorage;
        this._gameSessionIdReader = iGameSessionIdReader;
    }

    private JsonFlattenerRules getTsiRequestStorageRules() {
        return new JsonFlattenerRules(Arrays.asList(new String[]{"privacy", "gdpr", "framework", "adapter", "mediation", "unity", "pipl", "configuration", "user", JsonStorageKeyNames.UNIFIED_CONFIG_KEY}), Collections.singletonList("value"), Arrays.asList(new String[]{"ts", "exclude", "pii", "nonBehavioral", "nonbehavioral"}));
    }

    public IDeviceInfoReader build() {
        Storage storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
        Storage storage2 = StorageManager.getStorage(StorageManager.StorageType.PUBLIC);
        JsonStorageAggregator jsonStorageAggregator = new JsonStorageAggregator(Arrays.asList(new IJsonStorageReader[]{storage2, storage}));
        DeviceInfoReaderFilterProvider deviceInfoReaderFilterProvider = new DeviceInfoReaderFilterProvider(storage);
        return new DeviceInfoReaderWithMetrics(new DeviceInfoReaderWithFilter(new DeviceInfoReaderWithPrivacy(new DeviceInfoReaderWithStorageInfo(new DeviceInfoReaderWithLifecycle(new DeviceInfoReaderExtended(new DeviceInfoReaderWithAuid(new DeviceInfoReaderWithSessionId(buildWithRequestType(InitRequestType.TOKEN), Session.Default))), CachedLifecycle.getLifecycleListener()), getTsiRequestStorageRules(), storage, storage2), this._privacyConfigStorage, new PiiDataProvider(), new PiiTrackingStatusReader(jsonStorageAggregator)), deviceInfoReaderFilterProvider.getFilterList()), (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class));
    }

    /* access modifiers changed from: protected */
    public IDeviceInfoReader buildWithRequestType(InitRequestType initRequestType) {
        return new DeviceInfoReaderWithRequestType(new MinimalDeviceInfoReader(this._gameSessionIdReader), initRequestType);
    }
}
