package com.google.android.recaptcha.internal;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzlx extends zzgo implements zzhz {
    /* access modifiers changed from: private */
    public static final zzlx zzb;
    private String zzd = MaxReward.DEFAULT_LABEL;
    private String zze = MaxReward.DEFAULT_LABEL;
    private String zzf = MaxReward.DEFAULT_LABEL;

    static {
        zzlx zzlx = new zzlx();
        zzb = zzlx;
        zzgo.zzC(zzlx.class, zzlx);
    }

    private zzlx() {
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzlx();
        } else {
            if (i11 == 4) {
                return new zzlw((zzlv) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
