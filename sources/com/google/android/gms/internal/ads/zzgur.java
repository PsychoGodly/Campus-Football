package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgur extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgur zzb;
    private int zzd;
    private String zze = MaxReward.DEFAULT_LABEL;
    private zzguq zzf;
    private long zzg;
    private String zzh = MaxReward.DEFAULT_LABEL;

    static {
        zzgur zzgur = new zzgur();
        zzb = zzgur;
        zzgqm.zzaT(zzgur.class, zzgur);
    }

    private zzgur() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzgur();
        } else {
            if (i11 == 4) {
                return new zzguo((zzgub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
