package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgrq extends LinkedHashMap {
    private static final zzgrq zza;
    private boolean zzb = true;

    static {
        zzgrq zzgrq = new zzgrq();
        zza = zzgrq;
        zzgrq.zzb = false;
    }

    private zzgrq() {
    }

    public static zzgrq zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            return zzgqw.zzb((byte[]) obj);
        }
        if (!(obj instanceof zzgqo)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private final void zzg() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        zzg();
        super.clear();
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z10 = value.equals(obj2);
                continue;
            } else {
                z10 = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry entry : entrySet()) {
            i10 += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i10;
    }

    public final Object put(Object obj, Object obj2) {
        zzg();
        zzgqw.zze(obj);
        zzgqw.zze(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        zzg();
        for (Object next : map.keySet()) {
            zzgqw.zze(next);
            zzgqw.zze(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzgrq zzb() {
        return isEmpty() ? new zzgrq() : new zzgrq(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzgrq zzgrq) {
        zzg();
        if (!zzgrq.isEmpty()) {
            putAll(zzgrq);
        }
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzgrq(Map map) {
        super(map);
    }
}
