package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgqh implements zzgru {
    private static final zzgqh zza = new zzgqh();

    private zzgqh() {
    }

    public static zzgqh zza() {
        return zza;
    }

    public final zzgrt zzb(Class cls) {
        Class<zzgqm> cls2 = zzgqm.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzgrt) zzgqm.zzaC(cls.asSubclass(cls2)).zzb(3, (Object) null, (Object) null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    public final boolean zzc(Class cls) {
        return zzgqm.class.isAssignableFrom(cls);
    }
}
