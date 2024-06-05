package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzfqk extends zzfqf implements List, RandomAccess {
    private static final zzfsk zza = new zzfqi(zzfrt.zza, 0);

    zzfqk() {
    }

    public static zzfqh zzi() {
        return new zzfqh(4);
    }

    static zzfqk zzj(Object[] objArr) {
        return zzk(objArr, objArr.length);
    }

    static zzfqk zzk(Object[] objArr, int i10) {
        if (i10 == 0) {
            return zzfrt.zza;
        }
        return new zzfrt(objArr, i10);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzfqk zzl(java.lang.Iterable r0) {
        /*
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzfqk r0 = zzm(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfqk.zzl(java.lang.Iterable):com.google.android.gms.internal.ads.zzfqk");
    }

    public static zzfqk zzm(Collection collection) {
        if (collection instanceof zzfqf) {
            zzfqk zzd = ((zzfqf) collection).zzd();
            if (!zzd.zzf()) {
                return zzd;
            }
            Object[] array = zzd.toArray();
            return zzk(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzfrr.zzb(array2, length);
        return zzk(array2, length);
    }

    public static zzfqk zzn(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfrt.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfrr.zzb(objArr2, length);
        return zzk(objArr2, length);
    }

    public static zzfqk zzo() {
        return zzfrt.zza;
    }

    public static zzfqk zzp(Object obj) {
        Object[] objArr = {obj};
        zzfrr.zzb(objArr, 1);
        return zzk(objArr, 1);
    }

    public static zzfqk zzq(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfrr.zzb(objArr, 2);
        return zzk(objArr, 2);
    }

    public static zzfqk zzr(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzfrr.zzb(objArr, 3);
        return zzk(objArr, 3);
    }

    public static zzfqk zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfrr.zzb(objArr, 5);
        return zzk(objArr, 5);
    }

    public static zzfqk zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfrr.zzb(objArr, 6);
        return zzk(objArr, 6);
    }

    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i10 = 0;
                    while (i10 < size) {
                        if (zzfnp.zza(get(i10), list.get(i10))) {
                            i10++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzfnp.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public final int indexOf(Object obj) {
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

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
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

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i10, Object obj) {
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
    public final zzfqk zzd() {
        return this;
    }

    public final zzfsj zze() {
        return listIterator(0);
    }

    /* renamed from: zzh */
    public zzfqk subList(int i10, int i11) {
        zzfnu.zzg(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return zzfrt.zza;
        }
        return new zzfqj(this, i10, i12);
    }

    /* renamed from: zzu */
    public final zzfsk listIterator(int i10) {
        zzfnu.zzb(i10, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzfqi(this, i10);
    }
}
