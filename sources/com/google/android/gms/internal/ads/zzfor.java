package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfor implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzfos zzc;

    zzfor(zzfos zzfos) {
        this.zzc = zzfos;
        this.zza = zzfos.zza.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    public final void remove() {
        zzfnu.zzi(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfpf.zzg(this.zzc.zzb, this.zzb.size());
        this.zzb.clear();
        this.zzb = null;
    }
}
