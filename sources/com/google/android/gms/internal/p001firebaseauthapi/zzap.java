package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzap  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zzap<E> extends zzak<E> implements List<E>, RandomAccess {
    private static final zzbf<Object> zza = new zzar(zzax.zza, 0);

    zzap() {
    }

    static <E> zzap<E> zzb(Object[] objArr, int i10) {
        if (i10 == 0) {
            return zzax.zza;
        }
        return new zzax(objArr, i10);
    }

    public static <E> zzao<E> zzg() {
        return new zzao<>();
    }

    public static <E> zzap<E> zzh() {
        return zzax.zza;
    }

    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == zzy.zza(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i10 = 0;
                    while (i10 < size) {
                        if (zzw.zza(get(i10), list.get(i10))) {
                            i10++;
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator it = list.iterator();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object obj2 = get(i11);
                        i11++;
                        if (!zzw.zza(obj2, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public /* synthetic */ ListIterator listIterator() {
        return (zzbf) listIterator(0);
    }

    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Deprecated
    public final zzap<E> zzc() {
        return this;
    }

    public final zzbc<E> zzd() {
        return (zzbf) listIterator();
    }

    public /* synthetic */ ListIterator listIterator(int i10) {
        zzy.zzb(i10, size());
        if (isEmpty()) {
            return zza;
        }
        return new zzar(this, i10);
    }

    static <E> zzap<E> zza(Object[] objArr) {
        return zzb(objArr, objArr.length);
    }

    private static <E> zzap<E> zzb(Object... objArr) {
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (objArr[i10] != null) {
                i10++;
            } else {
                throw new NullPointerException("at index " + i10);
            }
        }
        return zzb(objArr, objArr.length);
    }

    public static <E> zzap<E> zza(Collection<? extends E> collection) {
        if (!(collection instanceof zzak)) {
            return zzb(collection.toArray());
        }
        zzap<E> zzc = ((zzak) collection).zzc();
        if (!zzc.zze()) {
            return zzc;
        }
        Object[] array = zzc.toArray();
        return zzb(array, array.length);
    }

    public static <E> zzap<E> zza(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17) {
        return zzb(e10, e11, e12, e13, e14, e15, e16, e17);
    }

    /* renamed from: zza */
    public zzap<E> subList(int i10, int i11) {
        zzy.zza(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return zzax.zza;
        }
        return new zzaq(this, i10, i12);
    }
}
