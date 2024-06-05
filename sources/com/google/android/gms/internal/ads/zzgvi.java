package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgvi extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgvi zzb;
    private int zzd;
    private int zze;
    private String zzf = MaxReward.DEFAULT_LABEL;
    private zzgpe zzg;
    private zzgpe zzh;

    static {
        zzgvi zzgvi = new zzgvi();
        zzb = zzgvi;
        zzgqm.zzaT(zzgvi.class, zzgvi);
    }

    private zzgvi() {
        zzgpe zzgpe = zzgpe.zzb;
        this.zzg = zzgpe;
        this.zzh = zzgpe;
    }

    public static zzgvg zza() {
        return (zzgvg) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgvi zzgvi, String str) {
        zzgvi.zzd |= 2;
        zzgvi.zzf = "image/png";
    }

    static /* synthetic */ void zze(zzgvi zzgvi, zzgpe zzgpe) {
        zzgpe.getClass();
        zzgvi.zzd |= 4;
        zzgvi.zzg = zzgpe;
    }

    static /* synthetic */ void zzf(zzgvi zzgvi, int i10) {
        zzgvi.zze = 1;
        zzgvi.zzd = 1 | zzgvi.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", zzgvh.zza, "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzgvi();
        } else {
            if (i11 == 4) {
                return new zzgvg((zzgub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
