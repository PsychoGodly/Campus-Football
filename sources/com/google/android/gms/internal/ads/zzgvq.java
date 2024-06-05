package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgvq extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgvq zzb;
    private int zzd;
    private String zze = MaxReward.DEFAULT_LABEL;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zzi = MaxReward.DEFAULT_LABEL;
    private String zzj = MaxReward.DEFAULT_LABEL;

    static {
        zzgvq zzgvq = new zzgvq();
        zzb = zzgvq;
        zzgqm.zzaT(zzgvq.class, zzgvq);
    }

    private zzgvq() {
    }

    public static zzgvp zza() {
        return (zzgvp) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgvq zzgvq, String str) {
        zzgvq.zzd |= 1;
        zzgvq.zze = str;
    }

    static /* synthetic */ void zze(zzgvq zzgvq, long j10) {
        zzgvq.zzd |= 2;
        zzgvq.zzf = j10;
    }

    static /* synthetic */ void zzf(zzgvq zzgvq, boolean z10) {
        zzgvq.zzd |= 4;
        zzgvq.zzg = z10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzgvr.zza, "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzgvq();
        } else {
            if (i11 == 4) {
                return new zzgvp((zzgub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
