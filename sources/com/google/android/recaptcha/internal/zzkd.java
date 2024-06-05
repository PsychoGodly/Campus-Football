package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzkd extends zzgo implements zzhz {
    /* access modifiers changed from: private */
    public static final zzkd zzb;
    private zzgv zzd = zzgo.zzw();
    private zzfw zze;

    static {
        zzkd zzkd = new zzkd();
        zzb = zzkd;
        zzgo.zzC(zzkd.class, zzkd);
    }

    private zzkd() {
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0002\u0000\u0000\f\r\u0002\u0000\u0001\u0000\f\u001b\r\t", new Object[]{"zzd", zzlm.class, "zze"});
        } else if (i11 == 3) {
            return new zzkd();
        } else {
            if (i11 == 4) {
                return new zzkc((zzkb) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
