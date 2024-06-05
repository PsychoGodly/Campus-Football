package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
abstract class zzahj<E> extends AbstractList<E> implements zzajj<E> {
    private boolean zza;

    zzahj() {
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

    public final void zzb() {
        if (this.zza) {
            this.zza = false;
        }
    }

    public boolean zzc() {
        return this.zza;
    }

    zzahj(boolean z10) {
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
