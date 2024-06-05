package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import h5.f;
import h5.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzacm {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int j10 = f.h().j(context, j.f18843a);
            zza = Boolean.valueOf(j10 == 0 || j10 == 2);
        }
        return zza.booleanValue();
    }
}
