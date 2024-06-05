package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzfsh implements Iterator {
    final Iterator zzb;

    zzfsh(Iterator it) {
        Objects.requireNonNull(it);
        this.zzb = it;
    }

    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    public final Object next() {
        return zza(this.zzb.next());
    }

    public final void remove() {
        this.zzb.remove();
    }

    /* access modifiers changed from: package-private */
    public abstract Object zza(Object obj);
}
