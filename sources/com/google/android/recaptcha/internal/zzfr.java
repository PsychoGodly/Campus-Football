package com.google.android.recaptcha.internal;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzfr extends zzgo implements zzhz {
    /* access modifiers changed from: private */
    public static final zzfr zzb;
    private int zzd;
    private String zze = MaxReward.DEFAULT_LABEL;
    private boolean zzf;
    private byte zzg = 2;

    static {
        zzfr zzfr = new zzfr();
        zzb = zzfr;
        zzgo.zzC(zzfr.class, zzfr);
    }

    private zzfr() {
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return new zzij(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzfr();
        } else {
            if (i11 == 4) {
                return new zzfq((zzfm) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzg = b10;
            return null;
        }
    }
}
