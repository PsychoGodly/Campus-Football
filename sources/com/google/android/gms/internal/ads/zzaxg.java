package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaxg extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzaxg zzb;
    private int zzd;
    private String zze = MaxReward.DEFAULT_LABEL;
    private zzgqv zzf = zzgqm.zzaM();
    private int zzg;

    static {
        zzaxg zzaxg = new zzaxg();
        zzb = zzaxg;
        zzgqm.zzaT(zzaxg.class, zzaxg);
    }

    private zzaxg() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zzd", "zze", "zzf", zzaxe.class, "zzg", zzaxr.zza});
        } else if (i11 == 3) {
            return new zzaxg();
        } else {
            if (i11 == 4) {
                return new zzaxf((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
