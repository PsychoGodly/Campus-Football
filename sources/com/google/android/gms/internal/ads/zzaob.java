package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaob extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzaob zzb;
    private int zzd;
    private long zze;
    private String zzf = MaxReward.DEFAULT_LABEL;
    private zzgpe zzg = zzgpe.zzb;

    static {
        zzaob zzaob = new zzaob();
        zzb = zzaob;
        zzgqm.zzaT(zzaob.class, zzaob);
    }

    private zzaob() {
    }

    public static zzaob zzd() {
        return zzb;
    }

    public final long zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzaob();
        } else {
            if (i11 == 4) {
                return new zzaoa((zzamu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zze() {
        return (this.zzd & 1) != 0;
    }
}
