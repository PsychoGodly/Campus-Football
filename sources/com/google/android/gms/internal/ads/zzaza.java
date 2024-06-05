package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaza extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzaza zzb;
    private int zzd;
    private String zze = MaxReward.DEFAULT_LABEL;
    private int zzf;
    private zzazc zzg;

    static {
        zzaza zzaza = new zzaza();
        zzb = zzaza;
        zzgqm.zzaT(zzaza.class, zzaza);
    }

    private zzaza() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzaxr.zza, "zzg"});
        } else if (i11 == 3) {
            return new zzaza();
        } else {
            if (i11 == 4) {
                return new zzayz((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
