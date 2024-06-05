package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
class zzfov extends zzfrc {
    final /* synthetic */ zzfpf zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfov(zzfpf zzfpf, Map map) {
        super(map);
        this.zza = zzfpf;
    }

    public final void clear() {
        zzfqu.zzb(iterator());
    }

    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new zzfou(this, this.zzd.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzfpf.zzg(this.zza, size);
        return size > 0;
    }
}
