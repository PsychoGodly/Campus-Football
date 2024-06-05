package com.facebook.ads.internal.bridge.gms;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

@Nullsafe(Nullsafe.Mode.LOCAL)
@Keep
public class AdvertisingId {
    private final String mId;
    private final boolean mLimitAdTracking;

    public AdvertisingId(String str, boolean z10) {
        this.mId = str;
        this.mLimitAdTracking = z10;
    }

    public static AdvertisingId getAdvertisingIdInfoDirectly(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                return new AdvertisingId(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getId() {
        return this.mId;
    }

    public boolean isLimitAdTracking() {
        return this.mLimitAdTracking;
    }
}
