package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfsf {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzb(Set set, zzfnv zzfnv) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof zzfsc) {
                zzfsc zzfsc = (zzfsc) sortedSet;
                return new zzfsd((SortedSet) zzfsc.zza, zzfny.zza(zzfsc.zzb, zzfnv));
            }
            Objects.requireNonNull(sortedSet);
            Objects.requireNonNull(zzfnv);
            return new zzfsd(sortedSet, zzfnv);
        } else if (set instanceof zzfsc) {
            zzfsc zzfsc2 = (zzfsc) set;
            return new zzfsc(zzfsc2.zza, zzfny.zza(zzfsc2.zzb, zzfnv));
        } else {
            Objects.requireNonNull(set);
            Objects.requireNonNull(zzfnv);
            return new zzfsc(set, zzfnv);
        }
    }

    static boolean zzc(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    static boolean zzd(Set set, Collection collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof zzfrp) {
            collection = ((zzfrp) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    static boolean zze(Set set, Iterator it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
