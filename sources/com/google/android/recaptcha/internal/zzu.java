package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import h5.f;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzu {
    public static final zzu zza = new zzu();
    private static final String zzb = String.valueOf(Build.VERSION.SDK_INT);
    private static final f zzc = f.h();

    private zzu() {
    }

    public static final String zza(Context context) {
        int i10 = zzc.i(context);
        return (i10 == 1 || i10 == 3 || i10 == 9) ? "ANDROID_OFFPLAY" : "ANDROID_ONPLAY";
    }

    public static final String zzb() {
        return zzb;
    }
}
