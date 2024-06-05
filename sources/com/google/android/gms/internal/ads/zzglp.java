package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzglp extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzglp zzb;
    private String zzd = MaxReward.DEFAULT_LABEL;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzglp zzglp = new zzglp();
        zzb = zzglp;
        zzgqm.zzaT(zzglp.class, zzglp);
    }

    private zzglp() {
    }

    public static zzglo zza() {
        return (zzglo) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzglp zzglp, String str) {
        str.getClass();
        zzglp.zzd = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzglp();
        } else {
            if (i11 == 4) {
                return new zzglo((zzglm) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
