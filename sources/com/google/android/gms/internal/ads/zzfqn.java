package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzfqn implements Map, Serializable {
    private transient zzfqp zza;
    private transient zzfqp zzb;
    private transient zzfqf zzc;

    zzfqn() {
    }

    public static zzfqn zzc(Map map) {
        Set entrySet = map.entrySet();
        zzfqm zzfqm = new zzfqm(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfqm.zzb(entrySet);
        return zzfqm.zzc();
    }

    public static zzfqn zzd() {
        return zzfry.zza;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(Object obj) {
        return zzfrf.zzb(this, obj);
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public final int hashCode() {
        return zzfsf.zza(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfpj.zza(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public abstract zzfqf zza();

    /* renamed from: zzb */
    public final zzfqf values() {
        zzfqf zzfqf = this.zzc;
        if (zzfqf != null) {
            return zzfqf;
        }
        zzfqf zza2 = zza();
        this.zzc = zza2;
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public abstract zzfqp zze();

    /* access modifiers changed from: package-private */
    public abstract zzfqp zzf();

    /* renamed from: zzg */
    public final zzfqp entrySet() {
        zzfqp zzfqp = this.zza;
        if (zzfqp != null) {
            return zzfqp;
        }
        zzfqp zze = zze();
        this.zza = zze;
        return zze;
    }

    /* renamed from: zzh */
    public final zzfqp keySet() {
        zzfqp zzfqp = this.zzb;
        if (zzfqp != null) {
            return zzfqp;
        }
        zzfqp zzf = zzf();
        this.zzb = zzf;
        return zzf;
    }
}
