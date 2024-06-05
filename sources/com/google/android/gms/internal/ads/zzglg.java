package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzglg extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzglg zzb;
    private String zzd = MaxReward.DEFAULT_LABEL;
    private String zze = MaxReward.DEFAULT_LABEL;
    private int zzf;
    private boolean zzg;
    private String zzh = MaxReward.DEFAULT_LABEL;

    static {
        zzglg zzglg = new zzglg();
        zzb = zzglg;
        zzgqm.zzaT(zzglg.class, zzglg);
    }

    private zzglg() {
    }

    public final int zza() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzglg();
        } else {
            if (i11 == 4) {
                return new zzglf((zzgle) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzg;
    }
}
