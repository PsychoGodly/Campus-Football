package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzov;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zzmu<SerializationT extends zzov> {
    private final zzxt zza;
    private final Class<SerializationT> zzb;

    private zzmu(zzxt zzxt, Class<SerializationT> cls) {
        this.zza = zzxt;
        this.zzb = cls;
    }

    public static <SerializationT extends zzov> zzmu<SerializationT> zza(zzmv<SerializationT> zzmv, zzxt zzxt, Class<SerializationT> cls) {
        return new zzmw(zzxt, cls, zzmv);
    }

    public abstract zzbt zza(SerializationT serializationt, zzcs zzcs) throws GeneralSecurityException;

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    public final zzxt zza() {
        return this.zza;
    }
}
