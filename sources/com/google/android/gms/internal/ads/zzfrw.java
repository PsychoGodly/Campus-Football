package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfrw extends zzfqp {
    private final transient zzfqn zza;
    private final transient zzfqk zzb;

    zzfrw(zzfqn zzfqn, zzfqk zzfqk) {
        this.zza = zzfqn;
        this.zzb = zzfqk;
    }

    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    public final int size() {
        return this.zza.size();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        return this.zzb.zza(objArr, i10);
    }

    public final zzfqk zzd() {
        return this.zzb;
    }

    public final zzfsj zze() {
        return this.zzb.listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        throw null;
    }
}
