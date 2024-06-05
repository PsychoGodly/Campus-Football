package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzbp implements zzby {
    public static final zzbp zza = new zzbp();

    private zzbp() {
    }

    public final void zza(int i10, zzbl zzbl, Object... objArr) throws zzt {
        Object obj;
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
                            obj = String.valueOf(str.charAt(intValue));
                        } else if (str instanceof List) {
                            obj = ((List) str).get(intValue);
                        } else {
                            obj = Array.get(str, intValue);
                        }
                        zzbl.zzc().zzf(i10, obj);
                    } catch (Exception e10) {
                        if (e10 instanceof ArrayIndexOutOfBoundsException) {
                            throw new zzt(4, 22, e10);
                        }
                        throw new zzt(4, 23, e10);
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
