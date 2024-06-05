package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzcc {
    public static final int zza;
    private static final int zzb;

    static {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 0;
        zzb = i10 >= 23 ? 67108864 : 0;
        if (i10 >= 31) {
            i11 = 33554432;
        }
        zza = i11;
    }

    public static PendingIntent zza(Context context, int i10, Intent intent, int i11) {
        return PendingIntent.getBroadcast(context, 0, intent, i11);
    }
}
