package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzhs extends LinkedHashMap {
    private static final zzhs zza;
    private boolean zzb = true;

    static {
        zzhs zzhs = new zzhs();
        zza = zzhs;
        zzhs.zzb = false;
    }

    private zzhs() {
    }

    public static zzhs zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = zzgw.zzd;
            int length = bArr.length;
            int zzb2 = zzgw.zzb(length, bArr, 0, length);
            if (zzb2 == 0) {
                return 1;
            }
            return zzb2;
        } else if (!(obj instanceof zzgq)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
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
        byte[] bArr = zzgw.zzd;
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        zzg();
        for (Object next : map.keySet()) {
            byte[] bArr = zzgw.zzd;
            Objects.requireNonNull(next);
            Objects.requireNonNull(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzhs zzb() {
        return isEmpty() ? new zzhs() : new zzhs(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzhs zzhs) {
        zzg();
        if (!zzhs.isEmpty()) {
            putAll(zzhs);
        }
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzhs(Map map) {
        super(map);
    }
}
