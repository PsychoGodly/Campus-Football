package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzkg extends zzgo implements zzhz {
    /* access modifiers changed from: private */
    public static final zzkg zzb;
    private int zzd;
    private zzfw zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzkg zzkg = new zzkg();
        zzb = zzkg;
        zzgo.zzC(zzkg.class, zzkg);
    }

    private zzkg() {
    }

    public static zzkf zzf() {
        return (zzkf) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzkg zzkg, zzfw zzfw) {
        zzfw.getClass();
        zzkg.zze = zzfw;
        zzkg.zzd |= 1;
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzkg();
        } else {
            if (i11 == 4) {
                return new zzkf((zzke) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
