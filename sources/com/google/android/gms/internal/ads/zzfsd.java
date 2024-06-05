package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfsd extends zzfsc implements SortedSet {
    zzfsd(SortedSet sortedSet, zzfnv zzfnv) {
        super(sortedSet, zzfnv);
    }

    public final Comparator comparator() {
        return ((SortedSet) this.zza).comparator();
    }

    public final Object first() {
        Iterator it = this.zza.iterator();
        zzfnv zzfnv = this.zzb;
        Objects.requireNonNull(it);
        Objects.requireNonNull(zzfnv);
        while (it.hasNext()) {
            Object next = it.next();
            if (zzfnv.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public final SortedSet headSet(Object obj) {
        return new zzfsd(((SortedSet) this.zza).headSet(obj), this.zzb);
    }

    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.zza;
        while (true) {
            Object last = sortedSet.last();
            if (this.zzb.zza(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return new zzfsd(((SortedSet) this.zza).subSet(obj, obj2), this.zzb);
    }

    public final SortedSet tailSet(Object obj) {
        return new zzfsd(((SortedSet) this.zza).tailSet(obj), this.zzb);
    }
}
