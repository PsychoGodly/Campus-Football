package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzgcn {
    private final zzgoj zza;
    private final Class zzb;

    /* synthetic */ zzgcn(zzgoj zzgoj, Class cls, zzgcm zzgcm) {
        this.zza = zzgoj;
        this.zzb = cls;
    }

    public static zzgcn zzb(zzgcl zzgcl, zzgoj zzgoj, Class cls) {
        return new zzgck(zzgoj, cls, zzgcl);
    }

    public abstract zzfvx zza(zzgeb zzgeb, zzfxg zzfxg) throws GeneralSecurityException;

    public final zzgoj zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
