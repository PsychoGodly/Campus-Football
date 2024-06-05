package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgdf {
    private static final zzgdf zza = new zzgdf();
    private final AtomicReference zzb = new AtomicReference(new zzgei(new zzgec(), (zzgeh) null));

    public static zzgdf zzb() {
        return zza;
    }

    public final zzfvx zza(zzgdz zzgdz, zzfxg zzfxg) throws GeneralSecurityException {
        if (((zzgei) this.zzb.get()).zzf(zzgdz)) {
            return ((zzgei) this.zzb.get()).zza(zzgdz, zzfxg);
        }
        try {
            return new zzgcw(zzgdz, zzfxg);
        } catch (GeneralSecurityException e10) {
            throw new zzgej("Creating a LegacyProtoKey failed", e10);
        }
    }

    public final synchronized void zzc(zzgcn zzgcn) throws GeneralSecurityException {
        zzgec zzgec = new zzgec((zzgei) this.zzb.get());
        zzgec.zza(zzgcn);
        this.zzb.set(new zzgei(zzgec, (zzgeh) null));
    }

    public final synchronized void zzd(zzgcr zzgcr) throws GeneralSecurityException {
        zzgec zzgec = new zzgec((zzgei) this.zzb.get());
        zzgec.zzb(zzgcr);
        this.zzb.set(new zzgei(zzgec, (zzgeh) null));
    }

    public final synchronized void zze(zzgdj zzgdj) throws GeneralSecurityException {
        zzgec zzgec = new zzgec((zzgei) this.zzb.get());
        zzgec.zzc(zzgdj);
        this.zzb.set(new zzgei(zzgec, (zzgeh) null));
    }

    public final synchronized void zzf(zzgdn zzgdn) throws GeneralSecurityException {
        zzgec zzgec = new zzgec((zzgei) this.zzb.get());
        zzgec.zzd(zzgdn);
        this.zzb.set(new zzgei(zzgec, (zzgeh) null));
    }
}
