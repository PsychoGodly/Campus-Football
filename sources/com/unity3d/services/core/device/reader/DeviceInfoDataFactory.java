package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderPrivacyBuilder;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;

public class DeviceInfoDataFactory {
    private final SDKMetricsSender _sdkMetricsSender;

    /* renamed from: com.unity3d.services.core.device.reader.DeviceInfoDataFactory$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$configuration$InitRequestType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.unity3d.services.core.configuration.InitRequestType[] r0 = com.unity3d.services.core.configuration.InitRequestType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$unity3d$services$core$configuration$InitRequestType = r0
                com.unity3d.services.core.configuration.InitRequestType r1 = com.unity3d.services.core.configuration.InitRequestType.TOKEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$unity3d$services$core$configuration$InitRequestType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.configuration.InitRequestType r1 = com.unity3d.services.core.configuration.InitRequestType.PRIVACY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.reader.DeviceInfoDataFactory.AnonymousClass1.<clinit>():void");
        }
    }

    public DeviceInfoDataFactory(SDKMetricsSender sDKMetricsSender) {
        this._sdkMetricsSender = sDKMetricsSender;
    }

    private IDeviceInfoDataContainer getPrivacyDeviceInfoData() {
        return new DeviceInfoReaderCompressor(new DeviceInfoReaderPrivacyBuilder(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance()).build());
    }

    private IDeviceInfoDataContainer getTokenDeviceInfoData() {
        return new DeviceInfoReaderCompressorWithMetrics(new DeviceInfoReaderCompressor(new DeviceInfoReaderBuilder(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance()).build()), this._sdkMetricsSender);
    }

    public IDeviceInfoDataContainer getDeviceInfoData(InitRequestType initRequestType) {
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$services$core$configuration$InitRequestType[initRequestType.ordinal()];
        if (i10 == 1) {
            return getTokenDeviceInfoData();
        }
        if (i10 != 2) {
            return null;
        }
        return getPrivacyDeviceInfoData();
    }
}
