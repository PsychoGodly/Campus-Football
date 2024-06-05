package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfou implements Iterator {
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzfov zzc;

    zzfou(zzfov zzfov, Iterator it) {
        this.zzc = zzfov;
        this.zzb = it;
    }

    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    public final void remove() {
        zzfnu.zzi(this.zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzfpf.zzg(this.zzc.zza, collection.size());
        collection.clear();
        this.zza = null;
    }
}
