package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzck implements zzby {
    public static final zzck zza = new zzck();

    private zzck() {
    }

    public final void zza(int i10, zzbl zzbl, Object... objArr) throws zzt {
        if (objArr.length == 1) {
            String str = objArr[0];
            if (true != (str instanceof String)) {
                str = null;
            }
            String str2 = str;
            if (str2 != null) {
                zzbl.zzf(str2);
                return;
            }
            throw new zzt(4, 5, (Throwable) null);
        }
        throw new zzt(4, 3, (Throwable) null);
    }
}
