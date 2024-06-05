package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzbk {
    public static final zzbk zza = new zzbk();

    private zzbk() {
    }

    public static final Class zza(Object obj) {
        Class cls;
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (obj instanceof Integer) {
            int intValue = ((Number) obj).intValue();
            if (intValue == 1) {
                cls = Integer.TYPE;
            } else {
                cls = intValue == 2 ? Short.TYPE : intValue == 3 ? Byte.TYPE : intValue == 4 ? Long.TYPE : intValue == 5 ? Character.TYPE : intValue == 6 ? Float.TYPE : intValue == 7 ? Double.TYPE : intValue == 8 ? Boolean.TYPE : intValue == 9 ? zzcr.class : null;
            }
            if (cls != null) {
                return cls;
            }
            throw new zzt(4, 6, (Throwable) null);
        } else if (obj instanceof String) {
            String str = (String) obj;
            if (zzbj.zzc(str)) {
                try {
                    return Class.forName(str);
                } catch (Exception e10) {
                    throw new zzt(6, 8, e10);
                }
            } else {
                throw new zzt(6, 47, (Throwable) null);
            }
        } else {
            throw new zzt(6, 8, (Throwable) null);
        }
    }
}
