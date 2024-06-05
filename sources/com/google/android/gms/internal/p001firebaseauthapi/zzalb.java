package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzalb {
    private static final zzalb zza = new zzalb();
    private final zzale zzb = new zzakb();
    private final ConcurrentMap<Class<?>, zzalf<?>> zzc = new ConcurrentHashMap();

    private zzalb() {
    }

    public static zzalb zza() {
        return zza;
    }

    public final <T> zzalf<T> zza(Class<T> cls) {
        zzajf.zza(cls, "messageType");
        zzalf<T> zzalf = (zzalf) this.zzc.get(cls);
        if (zzalf != null) {
            return zzalf;
        }
        zzalf<T> zza2 = this.zzb.zza(cls);
        zzajf.zza(cls, "messageType");
        zzajf.zza(zza2, "schema");
        zzalf<T> putIfAbsent = this.zzc.putIfAbsent(cls, zza2);
        return putIfAbsent != null ? putIfAbsent : zza2;
    }

    public final <T> zzalf<T> zza(T t10) {
        return zza(t10.getClass());
    }
}
