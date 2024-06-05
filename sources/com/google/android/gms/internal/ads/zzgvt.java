package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgvt extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgvt zzb;
    private int zzd;
    private String zze = MaxReward.DEFAULT_LABEL;
    private zzgpe zzf = zzgpe.zzb;

    static {
        zzgvt zzgvt = new zzgvt();
        zzb = zzgvt;
        zzgqm.zzaT(zzgvt.class, zzgvt);
    }

    private zzgvt() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgvt();
        } else {
            if (i11 == 4) {
                return new zzgvs((zzgub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
