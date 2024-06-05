package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzcc implements zzby {
    public static final zzcc zza = new zzcc();

    private zzcc() {
    }

    public final void zza(int i10, zzbl zzbl, Object... objArr) throws zzt {
        Class<?> cls;
        if (objArr.length == 2) {
            Class<?> cls2 = objArr[0];
            if (true != (cls2 instanceof Object)) {
                cls2 = null;
            }
            if (cls2 != null) {
                if (cls2 instanceof Class) {
                    cls = cls2;
                } else {
                    cls = cls2.getClass();
                }
                String str = objArr[1];
                if (true != (str instanceof String)) {
                    str = null;
                }
                String str2 = str;
                if (str2 != null) {
                    try {
                        zzbl.zzc().zzf(i10, cls.getField(zzbx.zza(this, str2, zzbl.zza())));
                    } catch (Exception e10) {
                        throw new zzt(6, 10, e10);
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
