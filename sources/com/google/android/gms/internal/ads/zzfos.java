package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
class zzfos extends zzfre {
    final transient Map zza;
    final /* synthetic */ zzfpf zzb;

    zzfos(zzfpf zzfpf, Map map) {
        this.zzb = zzfpf;
        this.zza = map;
    }

    public final void clear() {
        Map map = this.zza;
        zzfpf zzfpf = this.zzb;
        if (map == zzfpf.zza) {
            zzfpf.zzr();
        } else {
            zzfqu.zzb(new zzfor(this));
        }
    }

    public final boolean containsKey(Object obj) {
        Map map = this.zza;
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzfrf.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzc(obj, collection);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public Set keySet() {
        return this.zzb.zzv();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection zza2 = this.zzb.zza();
        zza2.addAll(collection);
        zzfpf.zzg(this.zzb, collection.size());
        collection.clear();
        return zza2;
    }

    public final int size() {
        return this.zza.size();
    }

    public final String toString() {
        return this.zza.toString();
    }

    /* access modifiers changed from: package-private */
    public final Map.Entry zza(Map.Entry entry) {
        Object key = entry.getKey();
        return new zzfqg(key, this.zzb.zzc(key, (Collection) entry.getValue()));
    }

    /* access modifiers changed from: protected */
    public final Set zzb() {
        return new zzfoq(this);
    }
}
