package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgtk implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzgtl zzb;

    zzgtk(zzgtl zzgtl) {
        this.zzb = zzgtl;
        this.zza = zzgtl.zza.iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
