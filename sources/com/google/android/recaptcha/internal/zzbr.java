package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.m;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzbr implements zzby {
    public static final zzbr zza = new zzbr();

    private zzbr() {
    }

    public final void zza(int i10, zzbl zzbl, Object... objArr) throws zzt {
        if (objArr.length == 3) {
            Integer num = objArr[0];
            if (true != (num instanceof Integer)) {
                num = null;
            }
            Integer num2 = num;
            if (num2 != null) {
                int intValue = num2.intValue();
                if (intValue != 0) {
                    Object obj = objArr[1];
                    if (true != (obj instanceof Object)) {
                        obj = null;
                    }
                    if (obj != null) {
                        Object obj2 = objArr[2];
                        if (true != (obj2 instanceof Object)) {
                            obj2 = null;
                        }
                        if (obj2 == null) {
                            throw new zzt(4, 5, (Throwable) null);
                        } else if (m.a(obj, obj2)) {
                            zzbl.zzg(zzbl.zzb() + intValue);
                        }
                    } else {
                        throw new zzt(4, 5, (Throwable) null);
                    }
                } else {
                    throw new zzt(4, 6, (Throwable) null);
                }
            } else {
                throw new zzt(4, 5, (Throwable) null);
            }
        } else {
            throw new zzt(4, 3, (Throwable) null);
        }
    }
}
