package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.q;
import java.io.UnsupportedEncodingException;
import java.util.List;
import m5.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzafp {
    public static long zza(String str) {
        zzafo zzb = zzb(str);
        return zzb.zza().longValue() - zzb.zzb().longValue();
    }

    private static zzafo zzb(String str) {
        q.g(str);
        List<String> zza = zzab.zza('.').zza((CharSequence) str);
        if (zza.size() >= 2) {
            try {
                return zzafo.zza(new String(c.b(zza.get(1)), "UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("Unable to decode token", e10);
            }
        } else {
            throw new RuntimeException("Invalid idToken " + str);
        }
    }
}
