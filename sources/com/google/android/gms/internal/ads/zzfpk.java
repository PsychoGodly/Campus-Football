package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
class zzfpk extends AbstractCollection {
    final Collection zza;
    final zzfnv zzb;

    zzfpk(Collection collection, zzfnv zzfnv) {
        this.zza = collection;
        this.zzb = zzfnv;
    }

    public final boolean add(Object obj) {
        zzfnu.zze(this.zzb.zza(obj));
        return this.zza.add(obj);
    }

    public final boolean addAll(Collection collection) {
        for (Object zza2 : collection) {
            zzfnu.zze(this.zzb.zza(zza2));
        }
        return this.zza.addAll(collection);
    }

    public final void clear() {
        zzfqq.zza(this.zza, this.zzb);
    }

    public final boolean contains(Object obj) {
        if (zzfpl.zza(this.zza, obj)) {
            return this.zzb.zza(obj);
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        Collection<Object> collection = this.zza;
        zzfnv zzfnv = this.zzb;
        zzfnu.zzc(zzfnv, "predicate");
        int i10 = 0;
        for (Object zza2 : collection) {
            if (!zzfnv.zza(zza2)) {
                i10++;
            } else if (i10 != -1) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public final Iterator iterator() {
        Iterator it = this.zza.iterator();
        zzfnv zzfnv = this.zzb;
        Objects.requireNonNull(it);
        Objects.requireNonNull(zzfnv);
        return new zzfqr(it, zzfnv);
    }

    public final boolean remove(Object obj) {
        return contains(obj) && this.zza.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = this.zza.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.zzb.zza(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = this.zza.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.zzb.zza(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public final int size() {
        int i10 = 0;
        for (Object zza2 : this.zza) {
            if (this.zzb.zza(zza2)) {
                i10++;
            }
        }
        return i10;
    }

    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzfqu.zzc(arrayList, it);
        return arrayList.toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzfqu.zzc(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
