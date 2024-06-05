package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfoq extends zzfrb {
    final /* synthetic */ zzfos zza;

    zzfoq(zzfos zzfos) {
        this.zza = zzfos;
    }

    public final boolean contains(Object obj) {
        return zzfpl.zza(this.zza.zza.entrySet(), obj);
    }

    public final Iterator iterator() {
        return new zzfor(this.zza);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzfpf.zzq(this.zza.zzb, entry.getKey());
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Map zza() {
        return this.zza;
    }
}
