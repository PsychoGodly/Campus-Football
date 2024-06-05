package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfwc implements zzfwe {
    final /* synthetic */ zzgcu zza;

    zzfwc(zzgcu zzgcu) {
        this.zza = zzgcu;
    }

    public final zzfvy zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzfwa(this.zza, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    public final zzfvy zzb() {
        zzgcu zzgcu = this.zza;
        return new zzfwa(zzgcu, zzgcu.zzi());
    }

    public final Class zzc() {
        return this.zza.getClass();
    }

    public final Class zzd() {
        return null;
    }

    public final Set zze() {
        return this.zza.zzl();
    }
}
