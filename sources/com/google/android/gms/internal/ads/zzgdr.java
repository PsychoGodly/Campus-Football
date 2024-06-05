package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzgdr {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgdr(Class cls, Class cls2, zzgdq zzgdq) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgdr zzb(zzgdp zzgdp, Class cls, Class cls2) {
        return new zzgdo(cls, cls2, zzgdp);
    }

    public abstract Object zza(zzfvx zzfvx) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
