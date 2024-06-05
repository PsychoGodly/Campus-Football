package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzfqa extends zzfqb implements Map {
    protected zzfqa() {
    }

    public final void clear() {
        zzb().clear();
    }

    public boolean containsKey(Object obj) {
        return zzb().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return zzb().containsValue(obj);
    }

    public Set entrySet() {
        return zzb().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || zzb().equals(obj);
    }

    public Object get(Object obj) {
        return zzb().get(obj);
    }

    public int hashCode() {
        return zzb().hashCode();
    }

    public boolean isEmpty() {
        return zzb().isEmpty();
    }

    public Set keySet() {
        return zzb().keySet();
    }

    public final Object put(Object obj, Object obj2) {
        return zzb().put(obj, obj2);
    }

    public final void putAll(Map map) {
        zzb().putAll(map);
    }

    public final Object remove(Object obj) {
        return zzb().remove(obj);
    }

    public int size() {
        return zzb().size();
    }

    public final Collection values() {
        return zzb().values();
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract Map zzb();

    /* access modifiers changed from: protected */
    public final int zzc() {
        return zzfsf.zza(entrySet());
    }

    /* access modifiers changed from: protected */
    public final boolean zzd(Object obj) {
        zzfra zzfra = new zzfra(entrySet().iterator());
        if (obj == null) {
            while (zzfra.hasNext()) {
                if (zzfra.next() == null) {
                    return true;
                }
            }
        } else {
            while (zzfra.hasNext()) {
                if (obj.equals(zzfra.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean zze(Object obj) {
        return zzfrf.zzb(this, obj);
    }
}
