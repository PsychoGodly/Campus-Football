package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaxw extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzaxw zzb;
    private int zzd;
    private String zze = MaxReward.DEFAULT_LABEL;
    private int zzf;
    private zzgqr zzg = zzgqm.zzaJ();
    private zzazc zzh;

    static {
        zzaxw zzaxw = new zzaxw();
        zzb = zzaxw;
        zzgqm.zzaT(zzaxw.class, zzaxw);
    }

    private zzaxw() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzaxr.zza, "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzaxw();
        } else {
            if (i11 == 4) {
                return new zzaxv((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
