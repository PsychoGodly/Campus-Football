package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzmi<E extends Enum<E>, O> {
    private final Map<E, O> zza;
    private final Map<O, E> zzb;

    private zzmi(Map<E, O> map, Map<O, E> map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public static <E extends Enum<E>, O> zzml<E, O> zza() {
        return new zzml<>();
    }

    public final E zza(O o10) throws GeneralSecurityException {
        E e10 = (Enum) this.zzb.get(o10);
        if (e10 != null) {
            return e10;
        }
        String valueOf = String.valueOf(o10);
        throw new GeneralSecurityException("Unable to convert object enum: " + valueOf);
    }

    public final O zza(E e10) throws GeneralSecurityException {
        O o10 = this.zza.get(e10);
        if (o10 != null) {
            return o10;
        }
        String valueOf = String.valueOf(e10);
        throw new GeneralSecurityException("Unable to convert proto enum: " + valueOf);
    }
}
