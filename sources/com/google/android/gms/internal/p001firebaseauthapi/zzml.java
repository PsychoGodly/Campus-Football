package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzml  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzml<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    private zzml() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzml<E, O> zza(E e10, O o10) {
        this.zza.put(e10, o10);
        this.zzb.put(o10, e10);
        return this;
    }

    public final zzmi<E, O> zza() {
        return new zzmi<>(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb));
    }
}
