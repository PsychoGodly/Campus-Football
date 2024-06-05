package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfpr extends AbstractSet {
    final /* synthetic */ zzfpu zza;

    zzfpr(zzfpu zzfpu) {
        this.zza = zzfpu;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    public final Iterator iterator() {
        zzfpu zzfpu = this.zza;
        Map zzj = zzfpu.zzj();
        if (zzj != null) {
            return zzj.keySet().iterator();
        }
        return new zzfpm(zzfpu);
    }

    public final boolean remove(Object obj) {
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.keySet().remove(obj);
        }
        return this.zza.zzr(obj) != zzfpu.zzd;
    }

    public final int size() {
        return this.zza.size();
    }
}
