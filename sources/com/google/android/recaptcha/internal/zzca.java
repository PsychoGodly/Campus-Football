package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzca implements zzby {
    public static final zzca zza = new zzca();

    private zzca() {
    }

    public final void zza(int i10, zzbl zzbl, Object... objArr) throws zzt {
        if (objArr.length == 1) {
            String str = objArr[0];
            if (true != (str instanceof Object)) {
                str = null;
            }
            if (str != null) {
                try {
                    if (str instanceof String) {
                        str = zzbx.zza(this, str, zzbl.zza());
                    }
                    zzbl.zzc().zzf(i10, zzbk.zza(str));
                } catch (Exception e10) {
                    throw new zzt(6, 8, e10);
                }
            } else {
                throw new zzt(4, 5, (Throwable) null);
            }
        } else {
            throw new zzt(4, 3, (Throwable) null);
        }
    }
}
