package com.google.android.recaptcha.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zziw extends AbstractSet {
    final /* synthetic */ zziy zza;

    /* synthetic */ zziw(zziy zziy, zziv zziv) {
        this.zza = zziy;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zza.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zza.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value || (obj2 != null && obj2.equals(value))) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new zziu(this.zza, (zzit) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zza.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.zza.size();
    }
}
