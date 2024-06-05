package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgdz implements zzgeb {
    private final String zza;
    private final zzgoj zzb;
    private final zzgpe zzc;
    private final zzgkx zzd;
    private final zzgme zze;
    private final Integer zzf;

    private zzgdz(String str, zzgpe zzgpe, zzgkx zzgkx, zzgme zzgme, Integer num) {
        this.zza = str;
        this.zzb = zzgek.zzb(str);
        this.zzc = zzgpe;
        this.zzd = zzgkx;
        this.zze = zzgme;
        this.zzf = num;
    }

    public static zzgdz zza(String str, zzgpe zzgpe, zzgkx zzgkx, zzgme zzgme, Integer num) throws GeneralSecurityException {
        if (zzgme == zzgme.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgdz(str, zzgpe, zzgkx, zzgme, num);
    }

    public final zzgkx zzb() {
        return this.zzd;
    }

    public final zzgme zzc() {
        return this.zze;
    }

    public final zzgoj zzd() {
        return this.zzb;
    }

    public final zzgpe zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
