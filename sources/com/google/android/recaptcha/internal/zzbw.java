package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzbw implements zzby {
    public static final zzbw zza = new zzbw();

    private zzbw() {
    }

    public final void zza(int i10, zzbl zzbl, Object... objArr) throws zzt {
        Object obj;
        if (objArr.length == 2) {
            Number number = objArr[0];
            if (true != (number instanceof Object)) {
                number = null;
            }
            if (number != null) {
                Integer num = objArr[1];
                if (true != (num instanceof Integer)) {
                    num = null;
                }
                Integer num2 = num;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    try {
                        if (number instanceof Integer) {
                            obj = Integer.valueOf(number.intValue() / intValue);
                        } else if (number instanceof int[]) {
                            ArrayList arrayList = new ArrayList(r4);
                            for (int i11 : (int[]) number) {
                                arrayList.add(Integer.valueOf(i11 / intValue));
                            }
                            obj = (Serializable) arrayList.toArray(new Integer[0]);
                        } else {
                            throw new zzt(4, 5, (Throwable) null);
                        }
                        zzbl.zzc().zzf(i10, obj);
                    } catch (ArithmeticException e10) {
                        throw new zzt(4, 6, e10);
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
