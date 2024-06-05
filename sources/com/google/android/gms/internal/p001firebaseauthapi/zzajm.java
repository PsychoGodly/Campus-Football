package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzajm<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzajn> zza;

    private zzajm(Map.Entry<K, zzajn> entry) {
        this.zza = entry;
    }

    public final K getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        return zzajn.zza();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzakn) {
            return this.zza.getValue().zza((zzakn) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzajn zza() {
        return this.zza.getValue();
    }
}
