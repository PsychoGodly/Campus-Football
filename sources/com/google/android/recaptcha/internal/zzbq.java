package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzbq implements zzby {
    public static final zzbq zza = new zzbq();

    private zzbq() {
    }

    public final void zza(int i10, zzbl zzbl, Object... objArr) throws zzt {
        if (objArr.length == 3) {
            Object obj = objArr[0];
            if (true != (obj instanceof Object)) {
                obj = null;
            }
            if (obj != null) {
                Integer num = objArr[1];
                if (true != (num instanceof Integer)) {
                    num = null;
                }
                Integer num2 = num;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    Object obj2 = objArr[2];
                    if (true != (obj2 instanceof Object)) {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        try {
                            Array.set(obj, intValue, obj2);
                        } catch (Exception e10) {
                            if (e10 instanceof ArrayIndexOutOfBoundsException) {
                                throw new zzt(4, 22, e10);
                            }
                            throw new zzt(4, 25, e10);
                        }
                    } else {
                        throw new zzt(4, 5, (Throwable) null);
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
