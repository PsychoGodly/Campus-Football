package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzak  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zzak<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zza = new Object[0];

    zzak() {
    }

    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    public final Object[] toArray() {
        return toArray(zza);
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i10) {
        zzbc zzbc = (zzbc) iterator();
        while (zzbc.hasNext()) {
            objArr[i10] = zzbc.next();
            i10++;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public int zzb() {
        throw new UnsupportedOperationException();
    }

    public zzap<E> zzc() {
        return isEmpty() ? zzap.zzh() : zzap.zza(toArray());
    }

    /* renamed from: zzd */
    public abstract zzbc<E> iterator();

    /* access modifiers changed from: package-private */
    public abstract boolean zze();

    /* access modifiers changed from: package-private */
    public Object[] zzf() {
        return null;
    }

    public final <T> T[] toArray(T[] tArr) {
        zzy.zza(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] zzf = zzf();
            if (zzf != null) {
                return Arrays.copyOfRange(zzf, zzb(), zza(), tArr.getClass());
            }
            if (tArr.length != 0) {
                tArr = Arrays.copyOf(tArr, 0);
            }
            tArr = Arrays.copyOf(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        zza(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: package-private */
    public int zza() {
        throw new UnsupportedOperationException();
    }
}
