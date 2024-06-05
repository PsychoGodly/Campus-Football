package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfwd implements zzfwe {
    final /* synthetic */ zzgdy zza;
    final /* synthetic */ zzgcu zzb;

    zzfwd(zzgdy zzgdy, zzgcu zzgcu) {
        this.zza = zzgdy;
        this.zzb = zzgcu;
    }

    public final zzfvy zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzfxd(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    public final zzfvy zzb() {
        zzgdy zzgdy = this.zza;
        return new zzfxd(zzgdy, this.zzb, zzgdy.zzi());
    }

    public final Class zzc() {
        return this.zza.getClass();
    }

    public final Class zzd() {
        return this.zzb.getClass();
    }

    public final Set zze() {
        return this.zza.zzl();
    }
}
