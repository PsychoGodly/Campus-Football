package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgmc extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgmc zzb;
    private String zzd = MaxReward.DEFAULT_LABEL;
    private zzgld zze;

    static {
        zzgmc zzgmc = new zzgmc();
        zzb = zzgmc;
        zzgqm.zzaT(zzgmc.class, zzgmc);
    }

    private zzgmc() {
    }

    public static zzgmc zzd() {
        return zzb;
    }

    public static zzgmc zze(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzgmc) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    public final zzgld zza() {
        zzgld zzgld = this.zze;
        return zzgld == null ? zzgld.zzd() : zzgld;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzgmc();
        } else {
            if (i11 == 4) {
                return new zzgmb((zzgma) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zze != null;
    }
}
