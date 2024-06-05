package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaxi extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzaxi zzb;
    private int zzd;
    private String zze = MaxReward.DEFAULT_LABEL;
    private zzgqv zzf = zzgqm.zzaM();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        zzaxi zzaxi = new zzaxi();
        zzb = zzaxi;
        zzgqm.zzaT(zzaxi.class, zzaxi);
    }

    private zzaxi() {
    }

    public static zzaxi zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzaxi zzaxi, String str) {
        str.getClass();
        zzaxi.zzd |= 1;
        zzaxi.zze = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgqq zzgqq = zzaxr.zza;
            return zzgqm.zzaQ(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzd", "zze", "zzf", zzaxe.class, "zzg", zzgqq, "zzh", zzgqq, "zzi", zzgqq});
        } else if (i11 == 3) {
            return new zzaxi();
        } else {
            if (i11 == 4) {
                return new zzaxh((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
