package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfqu {
    static Object zza(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    static void zzb(Iterator it) {
        Objects.requireNonNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean zzc(Collection collection, Iterator it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }
}
