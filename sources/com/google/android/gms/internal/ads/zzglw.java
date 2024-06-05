package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzglw extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzglw zzb;
    private String zzd = MaxReward.DEFAULT_LABEL;

    static {
        zzglw zzglw = new zzglw();
        zzb = zzglw;
        zzgqm.zzaT(zzglw.class, zzglw);
    }

    private zzglw() {
    }

    public static zzglw zzc() {
        return zzb;
    }

    public static zzglw zzd(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzglw) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zzglw();
        } else {
            if (i11 == 4) {
                return new zzglv((zzglu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zze() {
        return this.zzd;
    }
}
