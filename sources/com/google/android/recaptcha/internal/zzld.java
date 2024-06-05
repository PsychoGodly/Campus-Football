package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzld extends zzgo implements zzhz {
    /* access modifiers changed from: private */
    public static final zzld zzb;
    private int zzd = 0;
    private Object zze;
    private zzlg zzf;
    private int zzg;
    private zzkm zzh;

    static {
        zzld zzld = new zzld();
        zzb = zzld;
        zzgo.zzC(zzld.class, zzld);
    }

    private zzld() {
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0017\u0001\u0000\u0001\u0017\u0017\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t\u0004?\u0000\u0005?\u0000\u0006?\u0000\u0007?\u0000\b?\u0000\t?\u0000\n?\u0000\u000b?\u0000\f?\u0000\r?\u0000\u000e?\u0000\u000f?\u0000\u0010?\u0000\u0011?\u0000\u0012?\u0000\u0013?\u0000\u0014?\u0000\u0015?\u0000\u0016?\u0000\u0017?\u0000", new Object[]{"zze", "zzd", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzld();
        } else {
            if (i11 == 4) {
                return new zzlc((zzlb) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
