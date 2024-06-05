package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgwo implements Iterator {
    int zza = 0;
    final /* synthetic */ zzgwp zzb;

    zzgwo(zzgwp zzgwp) {
        this.zzb = zzgwp;
    }

    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            List list = this.zzb.zza;
            int i10 = this.zza;
            this.zza = i10 + 1;
            return list.get(i10);
        }
        zzgwp zzgwp = this.zzb;
        zzgwp.zza.add(zzgwp.zzb.next());
        return next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
