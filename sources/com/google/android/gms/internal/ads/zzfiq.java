package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfiq extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzfiq zzb;
    private int zzd;
    private int zze;
    private String zzf = MaxReward.DEFAULT_LABEL;
    private String zzg = MaxReward.DEFAULT_LABEL;
    private zzfim zzh;

    static {
        zzfiq zzfiq = new zzfiq();
        zzb = zzfiq;
        zzgqm.zzaT(zzfiq.class, zzfiq);
    }

    private zzfiq() {
    }

    public static zzfio zza() {
        return (zzfio) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzfiq zzfiq, String str) {
        str.getClass();
        zzfiq.zzd |= 2;
        zzfiq.zzf = str;
    }

    static /* synthetic */ void zze(zzfiq zzfiq, zzfim zzfim) {
        zzfim.getClass();
        zzfiq.zzh = zzfim;
        zzfiq.zzd |= 8;
    }

    static /* synthetic */ void zzf(zzfiq zzfiq, int i10) {
        zzfiq.zze = 1;
        zzfiq.zzd = 1 | zzfiq.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", zzfip.zza, "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzfiq();
        } else {
            if (i11 == 4) {
                return new zzfio((zzfin) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
