package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaxp extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzaxp zzb;
    private int zzd;
    private int zze;
    private zzaze zzf;
    private String zzg = MaxReward.DEFAULT_LABEL;
    private String zzh = MaxReward.DEFAULT_LABEL;

    static {
        zzaxp zzaxp = new zzaxp();
        zzb = zzaxp;
        zzgqm.zzaT(zzaxp.class, zzaxp);
    }

    private zzaxp() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzd", "zze", zzaxo.zza, "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzaxp();
        } else {
            if (i11 == 4) {
                return new zzaxn((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
