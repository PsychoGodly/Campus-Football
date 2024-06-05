package com.google.android.recaptcha.internal;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzmb extends zzgo implements zzhz {
    /* access modifiers changed from: private */
    public static final zzmb zzb;
    private String zzd = MaxReward.DEFAULT_LABEL;
    private String zze = MaxReward.DEFAULT_LABEL;

    static {
        zzmb zzmb = new zzmb();
        zzb = zzmb;
        zzgo.zzC(zzmb.class, zzmb);
    }

    private zzmb() {
    }

    public static zzma zzf() {
        return (zzma) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzmb zzmb, String str) {
        str.getClass();
        zzmb.zzd = str;
    }

    static /* synthetic */ void zzj(zzmb zzmb, String str) {
        str.getClass();
        zzmb.zze = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzmb();
        } else {
            if (i11 == 4) {
                return new zzma((zzlv) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
