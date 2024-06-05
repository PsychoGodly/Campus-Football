package com.google.android.recaptcha.internal;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzlz extends zzgo implements zzhz {
    /* access modifiers changed from: private */
    public static final zzlz zzb;
    private String zzd = MaxReward.DEFAULT_LABEL;
    private String zze = MaxReward.DEFAULT_LABEL;
    private int zzf;
    private int zzg;

    static {
        zzlz zzlz = new zzlz();
        zzb = zzlz;
        zzgo.zzC(zzlz.class, zzlz);
    }

    private zzlz() {
    }

    public static zzlz zzg(byte[] bArr) throws zzgy {
        return (zzlz) zzgo.zzu(zzb, bArr);
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzlz();
        } else {
            if (i11 == 4) {
                return new zzly((zzlv) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzmf zzi() {
        zzmf zzb2 = zzmf.zzb(this.zzf);
        return zzb2 == null ? zzmf.UNRECOGNIZED : zzb2;
    }

    public final String zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zze;
    }
}
