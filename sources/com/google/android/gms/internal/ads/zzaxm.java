package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaxm extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzaxm zzb;
    private int zzd;
    private String zze = MaxReward.DEFAULT_LABEL;
    private zzazc zzf;
    private int zzg;
    private zzaze zzh;
    private int zzi;
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        zzaxm zzaxm = new zzaxm();
        zzb = zzaxm;
        zzgqm.zzaT(zzaxm.class, zzaxm);
    }

    private zzaxm() {
    }

    public static zzaxm zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzaxm zzaxm, String str) {
        zzaxm.zzd |= 1;
        zzaxm.zze = str;
    }

    static /* synthetic */ void zze(zzaxm zzaxm, zzaze zzaze) {
        zzaze.getClass();
        zzaxm.zzh = zzaze;
        zzaxm.zzd |= 8;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgqq zzgqq = zzaxr.zza;
            return zzgqm.zzaQ(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgqq, "zzk", zzgqq, "zzl", zzgqq});
        } else if (i11 == 3) {
            return new zzaxm();
        } else {
            if (i11 == 4) {
                return new zzaxl((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
