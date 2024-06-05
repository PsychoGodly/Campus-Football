package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzbv implements zzby {
    public static final zzbv zza = new zzbv();

    private zzbv() {
    }

    public final void zza(int i10, zzbl zzbl, Object... objArr) throws zzt {
        if (objArr.length == 2) {
            String str = objArr[0];
            if (true != (str instanceof Object)) {
                str = null;
            }
            if (str != null) {
                Integer num = objArr[1];
                if (true != (num instanceof Integer)) {
                    num = null;
                }
                Integer num2 = num;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    try {
                        if (str instanceof String) {
                            str = zzbx.zza(this, str, zzbl.zza());
                        }
                        zzbl.zzc().zzf(i10, Array.newInstance(zzbk.zza(str), intValue));
                    } catch (Exception e10) {
                        throw new zzt(6, 21, e10);
                    }
                } else {
                    throw new zzt(4, 5, (Throwable) null);
                }
            } else {
                throw new zzt(4, 5, (Throwable) null);
            }
        } else {
            throw new zzt(4, 3, (Throwable) null);
        }
    }
}
