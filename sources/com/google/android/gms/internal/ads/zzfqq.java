package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfqq {
    public static boolean zza(Iterable iterable, zzfnv zzfnv) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            Objects.requireNonNull(zzfnv);
            boolean z10 = false;
            while (it.hasNext()) {
                if (zzfnv.zza(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        Objects.requireNonNull(zzfnv);
        return zzc((List) iterable, zzfnv);
    }

    private static void zzb(List list, zzfnv zzfnv, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (zzfnv.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 >= i10) {
                list.remove(i11);
            } else {
                return;
            }
        }
    }

    private static boolean zzc(List list, zzfnv zzfnv) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!zzfnv.zza(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (UnsupportedOperationException unused) {
                        zzb(list, zzfnv, i11, i10);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        zzb(list, zzfnv, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }
}
