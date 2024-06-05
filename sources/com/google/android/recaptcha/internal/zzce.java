package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzce implements zzby {
    public static final zzce zza = new zzce();

    private zzce() {
    }

    public final void zza(int i10, zzbl zzbl, Object... objArr) throws zzt {
        int length = objArr.length;
        if (length >= 2) {
            Method method = objArr[0];
            if (true != (method instanceof Method)) {
                method = null;
            }
            Method method2 = method;
            if (method2 != null) {
                Object obj = objArr[1];
                Object[] array = m.R(objArr).subList(2, length).toArray(new Object[0]);
                try {
                    zzbl.zzc().zzf(i10, method2.invoke(obj, Arrays.copyOf(array, array.length)));
                } catch (Exception e10) {
                    throw new zzt(6, 15, e10);
                }
            } else {
                throw new zzt(4, 5, (Throwable) null);
            }
        } else {
            throw new zzt(4, 3, (Throwable) null);
        }
    }
}
