package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzlp extends zzgo implements zzhz {
    /* access modifiers changed from: private */
    public static final zzlp zzb;
    private zzgv zzd = zzgo.zzw();

    static {
        zzlp zzlp = new zzlp();
        zzb = zzlp;
        zzgo.zzC(zzlp.class, zzlp);
    }

    private zzlp() {
    }

    public static zzlp zzg() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zzlp();
        } else {
            if (i11 == 4) {
                return new zzlo((zzln) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final List zzi() {
        return this.zzd;
    }
}
