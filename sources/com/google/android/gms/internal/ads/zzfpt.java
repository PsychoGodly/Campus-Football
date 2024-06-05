package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfpt extends AbstractCollection {
    final /* synthetic */ zzfpu zza;

    zzfpt(zzfpu zzfpu) {
        this.zza = zzfpu;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final Iterator iterator() {
        zzfpu zzfpu = this.zza;
        Map zzj = zzfpu.zzj();
        if (zzj != null) {
            return zzj.values().iterator();
        }
        return new zzfpo(zzfpu);
    }

    public final int size() {
        return this.zza.size();
    }
}
