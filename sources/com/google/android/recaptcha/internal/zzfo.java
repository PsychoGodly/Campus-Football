package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzfo extends zzgk {
    /* access modifiers changed from: private */
    public static final zzfo zzd;
    private int zze;
    private boolean zzf;
    private zzgv zzg = zzii.zze();
    private byte zzh = 2;

    static {
        zzfo zzfo = new zzfo();
        zzd = zzfo;
        zzgo.zzC(zzfo.class, zzfo);
    }

    private zzfo() {
    }

    public static zzfo zzg() {
        return zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return new zzij(zzd, "\u0001\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0001\u0001ဇ\u0000ϧЛ", new Object[]{"zze", "zzf", "zzg", zzfs.class});
        } else if (i11 == 3) {
            return new zzfo();
        } else {
            if (i11 == 4) {
                return new zzfn((zzfm) null);
            }
            if (i11 == 5) {
                return zzd;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzh = b10;
            return null;
        }
    }
}
