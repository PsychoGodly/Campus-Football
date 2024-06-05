package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.OpenAdvertisingId;
import java.util.UUID;
import kotlin.jvm.internal.m;
import se.k0;
import se.v;
import vb.k2;
import vb.m2;

/* compiled from: AndroidPrivacyDeviceInfoDataSource.kt */
public final class AndroidPrivacyDeviceInfoDataSource implements PrivacyDeviceInfoDataSource {
    private final Context context;
    private final v<Boolean> idfaInitialized = k0.a(Boolean.FALSE);

    public AndroidPrivacyDeviceInfoDataSource(Context context2) {
        m.e(context2, "context");
        this.context = context2;
    }

    private final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? MaxReward.DEFAULT_LABEL : advertisingTrackingId;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? MaxReward.DEFAULT_LABEL : openAdvertisingTrackingId;
    }

    public m2 fetch(vb.v vVar) {
        m.e(vVar, "allowed");
        if (!this.idfaInitialized.getValue().booleanValue()) {
            this.idfaInitialized.setValue(Boolean.TRUE);
            AdvertisingId.init(this.context);
            OpenAdvertisingId.init(this.context);
        }
        k2.a aVar = k2.f38996b;
        m2.a j02 = m2.j0();
        m.d(j02, "newBuilder()");
        k2 a10 = aVar.a(j02);
        if (vVar.i0()) {
            String advertisingTrackingId = getAdvertisingTrackingId();
            boolean z10 = true;
            if (advertisingTrackingId.length() > 0) {
                UUID fromString = UUID.fromString(advertisingTrackingId);
                m.d(fromString, "fromString(adId)");
                a10.b(ProtobufExtensionsKt.toByteString(fromString));
            }
            String openAdvertisingTrackingId = getOpenAdvertisingTrackingId();
            if (openAdvertisingTrackingId.length() <= 0) {
                z10 = false;
            }
            if (z10) {
                UUID fromString2 = UUID.fromString(openAdvertisingTrackingId);
                m.d(fromString2, "fromString(openAdId)");
                a10.c(ProtobufExtensionsKt.toByteString(fromString2));
            }
        }
        return a10.a();
    }
}
