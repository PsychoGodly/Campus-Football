package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zznr {
    private static zznr zza = new zznr();
    private final AtomicReference<zzok> zzb = new AtomicReference<>(new zzoj().zza());

    zznr() {
    }

    public static zznr zza() {
        return zza;
    }

    public final <WrapperPrimitiveT> Class<?> zza(Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        return this.zzb.get().zza((Class<?>) cls);
    }

    public final <KeyT extends zzbt, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        return this.zzb.get().zza(keyt, cls);
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzcg<InputPrimitiveT> zzcg, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        return this.zzb.get().zza(zzcg, cls);
    }

    public final synchronized <KeyT extends zzbt, PrimitiveT> void zza(zzod<KeyT, PrimitiveT> zzod) throws GeneralSecurityException {
        this.zzb.set(zzok.zza(this.zzb.get()).zza(zzod).zza());
    }

    public final synchronized <InputPrimitiveT, WrapperPrimitiveT> void zza(zzcp<InputPrimitiveT, WrapperPrimitiveT> zzcp) throws GeneralSecurityException {
        this.zzb.set(zzok.zza(this.zzb.get()).zza(zzcp).zza());
    }
}
