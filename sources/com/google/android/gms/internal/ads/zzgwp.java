package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgwp extends AbstractList {
    private static final zzgwq zzc = zzgwq.zzb(zzgwp.class);
    final List zza;
    final Iterator zzb;

    public zzgwp(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    public final Object get(int i10) {
        if (this.zza.size() > i10) {
            return this.zza.get(i10);
        }
        if (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
            return get(i10);
        }
        throw new NoSuchElementException();
    }

    public final Iterator iterator() {
        return new zzgwo(this);
    }

    public final int size() {
        zzgwq zzgwq = zzc;
        zzgwq.zza("potentially expensive size() call");
        zzgwq.zza("blowup running");
        while (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
        }
        return this.zza.size();
    }
}
