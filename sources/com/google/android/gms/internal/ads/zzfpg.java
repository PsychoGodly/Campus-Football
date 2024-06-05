package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzfpg implements Map.Entry {
    zzfpg() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!zzfnp.zza(getKey(), entry.getKey()) || !zzfnp.zza(getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public abstract Object getKey();

    public abstract Object getValue();

    public final int hashCode() {
        int i10;
        Object key = getKey();
        Object value = getValue();
        int i11 = 0;
        if (key == null) {
            i10 = 0;
        } else {
            i10 = key.hashCode();
        }
        if (value != null) {
            i11 = value.hashCode();
        }
        return i10 ^ i11;
    }

    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
