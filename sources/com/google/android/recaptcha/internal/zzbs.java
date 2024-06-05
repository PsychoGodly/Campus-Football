package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzbs implements zzby {
    public static final zzbs zza = new zzbs();

    private zzbs() {
    }

    public final void zza(int i10, zzbl zzbl, Object... objArr) throws zzt {
        if (objArr.length == 2) {
            String str = objArr[0];
            if (true != (str instanceof String)) {
                str = null;
            }
            String str2 = str;
            if (str2 != null) {
                String str3 = objArr[1];
                if (true != (str3 instanceof String)) {
                    str3 = null;
                }
                String str4 = str3;
                if (str4 != null) {
                    zzbl.zzc().zzf(i10, str2.concat(str4));
                    return;
                }
                throw new zzt(4, 5, (Throwable) null);
            }
            throw new zzt(4, 5, (Throwable) null);
        }
        throw new zzt(4, 3, (Throwable) null);
    }
}
