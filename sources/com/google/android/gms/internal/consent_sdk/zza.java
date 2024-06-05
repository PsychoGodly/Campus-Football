package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import h5.g;
import h5.h;
import java.io.IOException;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
final class zza {
    private final Application zza;

    public zza(Application application) {
        this.zza = application;
    }

    public final String zza() {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.zza).getId();
        } catch (g | h | IOException e10) {
            Log.d("UserMessagingPlatform", "Failed to get ad id.", e10);
            return null;
        }
    }
}
