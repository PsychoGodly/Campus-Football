package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zznu {
    private static final zznu zza = ((zznu) zzpd.zza(zznt.zza));
    private final AtomicReference<zzoy> zzb = new AtomicReference<>(new zzox().zza());

    public final zzbt zza(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        if (!this.zzb.get().zzb(zzos)) {
            return new zznd(zzos, zzcs);
        }
        return this.zzb.get().zza(zzos, zzcs);
    }

    public final <SerializationT extends zzov> boolean zzb(SerializationT serializationt) {
        return this.zzb.get().zzc(serializationt);
    }

    public final <SerializationT extends zzov> zzch zza(SerializationT serializationt) throws GeneralSecurityException {
        return this.zzb.get().zza(serializationt);
    }

    public static zznu zza() {
        return zza;
    }

    public final <ParametersT extends zzch, SerializationT extends zzov> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        return this.zzb.get().zza(parameterst, cls);
    }

    public final synchronized <SerializationT extends zzov> void zza(zzmu<SerializationT> zzmu) throws GeneralSecurityException {
        this.zzb.set(new zzox(this.zzb.get()).zza(zzmu).zza());
    }

    public final synchronized <KeyT extends zzbt, SerializationT extends zzov> void zza(zzmx<KeyT, SerializationT> zzmx) throws GeneralSecurityException {
        this.zzb.set(new zzox(this.zzb.get()).zza(zzmx).zza());
    }

    public final synchronized <SerializationT extends zzov> void zza(zznv<SerializationT> zznv) throws GeneralSecurityException {
        this.zzb.set(new zzox(this.zzb.get()).zza(zznv).zza());
    }

    public final synchronized <ParametersT extends zzch, SerializationT extends zzov> void zza(zznz<ParametersT, SerializationT> zznz) throws GeneralSecurityException {
        this.zzb.set(new zzox(this.zzb.get()).zza(zznz).zza());
    }
}
