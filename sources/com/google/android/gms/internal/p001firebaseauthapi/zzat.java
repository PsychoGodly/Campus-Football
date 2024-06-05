package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzat  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zzat<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] zza = new Map.Entry[0];
    private transient zzau<Map.Entry<K, V>> zzb;
    private transient zzau<K> zzc;
    private transient zzak<V> zzd;

    zzat() {
    }

    public static <K, V> zzat<K, V> zza(Map<? extends K, ? extends V> map) {
        if (!(map instanceof zzat) || (map instanceof SortedMap)) {
            Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
            zzas zzas = new zzas(entrySet instanceof Collection ? entrySet.size() : 4);
            zzas.zza(entrySet);
            return zzas.zza();
        }
        zzat<K, V> zzat = (zzat) map;
        zzat.zzd();
        return zzat;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return ((zzak) values()).contains(obj);
    }

    public /* synthetic */ Set entrySet() {
        zzau<Map.Entry<K, V>> zzau = this.zzb;
        if (zzau != null) {
            return zzau;
        }
        zzau<Map.Entry<K, V>> zzb2 = zzb();
        this.zzb = zzb2;
        return zzb2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    public int hashCode() {
        return zzbd.zza((zzau) entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public /* synthetic */ Set keySet() {
        zzau<K> zzau = this.zzc;
        if (zzau != null) {
            return zzau;
        }
        zzau<K> zzc2 = zzc();
        this.zzc = zzc2;
        return zzc2;
    }

    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        zzai.zza(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            z10 = false;
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb2.append('}');
        return sb2.toString();
    }

    public /* synthetic */ Collection values() {
        zzak<V> zzak = this.zzd;
        if (zzak != null) {
            return zzak;
        }
        zzak<V> zza2 = zza();
        this.zzd = zza2;
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public abstract zzak<V> zza();

    /* access modifiers changed from: package-private */
    public abstract zzau<Map.Entry<K, V>> zzb();

    /* access modifiers changed from: package-private */
    public abstract zzau<K> zzc();

    /* access modifiers changed from: package-private */
    public abstract boolean zzd();
}
