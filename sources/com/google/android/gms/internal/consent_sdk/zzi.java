package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.FormError;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzi extends Exception {
    private final int zza;

    public zzi(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public final FormError zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", getMessage());
        } else {
            Log.w("UserMessagingPlatform", getMessage(), getCause());
        }
        return new FormError(this.zza, getMessage());
    }

    public zzi(int i10, String str, Throwable th) {
        super(str, th);
        this.zza = i10;
    }
}
