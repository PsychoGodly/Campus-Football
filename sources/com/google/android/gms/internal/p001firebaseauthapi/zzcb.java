package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzvg;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzcb {
    private final zzvg.zza zza;

    private zzcb(zzvg.zza zza2) {
        this.zza = zza2;
    }

    private final synchronized int zza(zzvb zzvb, boolean z10) throws GeneralSecurityException {
        zzvg.zzb zza2;
        zza2 = zza(zzvb);
        this.zza.zza(zza2);
        return zza2.zza();
    }

    public static zzcb zzb() {
        return new zzcb(zzvg.zzc());
    }

    private final synchronized int zzc() {
        int zza2;
        zza2 = zzpf.zza();
        while (zzb(zza2)) {
            zza2 = zzpf.zza();
        }
        return zza2;
    }

    private final synchronized boolean zzb(int i10) {
        for (zzvg.zzb zza2 : this.zza.zzb()) {
            if (zza2.zza() == i10) {
                return true;
            }
        }
        return false;
    }

    public final synchronized zzbx zza() throws GeneralSecurityException {
        return zzbx.zza((zzvg) ((zzajc) this.zza.zzf()));
    }

    public final synchronized zzcb zza(zzbu zzbu) throws GeneralSecurityException {
        zza(zzbu.zza(), false);
        return this;
    }

    public final synchronized zzcb zza(int i10) throws GeneralSecurityException {
        int i11 = 0;
        while (i11 < this.zza.zza()) {
            zzvg.zzb zzb = this.zza.zzb(i11);
            if (zzb.zza() != i10) {
                i11++;
            } else if (zzb.zzc().equals(zzuz.ENABLED)) {
                this.zza.zza(i10);
            } else {
                throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }

    public static zzcb zza(zzbx zzbx) {
        return new zzcb((zzvg.zza) zzbx.zzb().zzn());
    }

    private final synchronized zzvg.zzb zza(zzuy zzuy, zzvs zzvs) throws GeneralSecurityException {
        int zzc;
        zzc = zzc();
        if (zzvs != zzvs.UNKNOWN_PREFIX) {
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (zzvg.zzb) ((zzajc) zzvg.zzb.zzd().zza(zzuy).zza(zzc).zza(zzuz.ENABLED).zza(zzvs).zzf());
    }

    private final synchronized zzvg.zzb zza(zzvb zzvb) throws GeneralSecurityException {
        return zza(zzct.zza(zzvb), zzvb.zzd());
    }
}
