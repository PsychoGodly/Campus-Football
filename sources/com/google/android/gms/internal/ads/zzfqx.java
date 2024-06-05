package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfqx extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzfnj zzb;

    zzfqx(List list, zzfnj zzfnj) {
        this.zza = list;
        this.zzb = zzfnj;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final ListIterator listIterator(int i10) {
        return new zzfqw(this, this.zza.listIterator(i10));
    }

    public final int size() {
        return this.zza.size();
    }
}
