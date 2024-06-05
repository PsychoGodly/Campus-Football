package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import java.util.List;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgmh extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgmh zzb;
    private String zzd = MaxReward.DEFAULT_LABEL;
    private zzgqv zze = zzgqm.zzaM();

    static {
        zzgmh zzgmh = new zzgmh();
        zzb = zzgmh;
        zzgqm.zzaT(zzgmh.class, zzgmh);
    }

    private zzgmh() {
    }

    public static zzgmh zzc() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzglg.class});
        } else if (i11 == 3) {
            return new zzgmh();
        } else {
            if (i11 == 4) {
                return new zzgmg((zzgmf) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final List zzd() {
        return this.zze;
    }
}
