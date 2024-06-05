package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgvy extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgvy zzb;
    private int zzd;
    private int zze;
    private String zzf = MaxReward.DEFAULT_LABEL;
    private zzgqr zzg = zzgqm.zzaJ();
    private int zzh;
    private zzgqv zzi = zzgqm.zzaM();
    private zzgpe zzj = zzgpe.zzb;

    static {
        zzgvy zzgvy = new zzgvy();
        zzb = zzgvy;
        zzgqm.zzaT(zzgvy.class, zzgvy);
    }

    private zzgvy() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzgvw.class, "zzj"});
        } else if (i11 == 3) {
            return new zzgvy();
        } else {
            if (i11 == 4) {
                return new zzgvx((zzgub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
