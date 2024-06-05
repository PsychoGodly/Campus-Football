package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgxg {
    public static Object zza(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    public static Object zzb(Object obj) {
        Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }

    public static void zzc(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
