package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzgh implements zzhw {
    private static final zzgh zza = new zzgh();

    private zzgh() {
    }

    public static zzgh zza() {
        return zza;
    }

    public final zzhv zzb(Class cls) {
        Class<zzgo> cls2 = zzgo.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzhv) zzgo.zzr(cls.asSubclass(cls2)).zzh(3, (Object) null, (Object) null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    public final boolean zzc(Class cls) {
        return zzgo.class.isAssignableFrom(cls);
    }
}
