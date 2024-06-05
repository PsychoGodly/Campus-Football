package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
abstract class zzhg<E> extends AbstractList<E> implements zzjf<E> {
    private boolean zza;

    zzhg() {
        this(true);
    }

    public void add(int i10, E e10) {
        zza();
        super.add(i10, e10);
    }

    public boolean addAll(Collection<? extends E> collection) {
        zza();
        return super.addAll(collection);
    }

    public void clear() {
        zza();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public final void i_() {
        if (this.zza) {
            this.zza = false;
        }
    }

    public E remove(int i10) {
        zza();
        return super.remove(i10);
    }

    public boolean removeAll(Collection<?> collection) {
        zza();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        zza();
        return super.retainAll(collection);
    }

    public E set(int i10, E e10) {
        zza();
        return super.set(i10, e10);
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean zzc() {
        return this.zza;
    }

    zzhg(boolean z10) {
        this.zza = z10;
    }

    public boolean add(E e10) {
        zza();
        return super.add(e10);
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        zza();
        return super.addAll(i10, collection);
    }

    public boolean remove(Object obj) {
        zza();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
