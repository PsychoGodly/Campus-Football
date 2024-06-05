package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzfw extends zzgo implements zzhz {
    /* access modifiers changed from: private */
    public static final zzfw zzb;
    /* access modifiers changed from: private */
    public long zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzfw zzfw = new zzfw();
        zzb = zzfw;
        zzgo.zzC(zzfw.class, zzfw);
    }

    private zzfw() {
    }

    public static zzfv zzi() {
        return (zzfv) zzb.zzp();
    }

    public final int zzf() {
        return this.zze;
    }

    public final long zzg() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new zzij(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzfw();
        } else {
            if (i11 == 4) {
                return new zzfv((zzfu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
