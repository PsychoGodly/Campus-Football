package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzch;
import com.google.android.gms.internal.p001firebaseauthapi.zzov;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zznz<ParametersT extends zzch, SerializationT extends zzov> {
    private final Class<ParametersT> zza;
    private final Class<SerializationT> zzb;

    private zznz(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static <ParametersT extends zzch, SerializationT extends zzov> zznz<ParametersT, SerializationT> zza(zzob<ParametersT, SerializationT> zzob, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new zzoc(cls, cls2, zzob);
    }

    public abstract SerializationT zza(ParametersT parameterst) throws GeneralSecurityException;

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    public final Class<ParametersT> zza() {
        return this.zza;
    }
}
