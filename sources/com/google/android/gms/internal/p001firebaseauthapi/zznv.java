package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzov;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zznv<SerializationT extends zzov> {
    private final zzxt zza;
    private final Class<SerializationT> zzb;

    private zznv(zzxt zzxt, Class<SerializationT> cls) {
        this.zza = zzxt;
        this.zzb = cls;
    }

    public static <SerializationT extends zzov> zznv<SerializationT> zza(zznx<SerializationT> zznx, zzxt zzxt, Class<SerializationT> cls) {
        return new zzny(zzxt, cls, zznx);
    }

    public abstract zzch zza(SerializationT serializationt) throws GeneralSecurityException;

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    public final zzxt zza() {
        return this.zza;
    }
}
