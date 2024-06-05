package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgun extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgun zzb;
    private int zzd;
    private String zze = MaxReward.DEFAULT_LABEL;

    static {
        zzgun zzgun = new zzgun();
        zzb = zzgun;
        zzgqm.zzaT(zzgun.class, zzgun);
    }

    private zzgun() {
    }

    public static zzgum zza() {
        return (zzgum) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgun zzgun, String str) {
        zzgun.zzd |= 1;
        zzgun.zze = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzgun();
        } else {
            if (i11 == 4) {
                return new zzgum((zzgub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
