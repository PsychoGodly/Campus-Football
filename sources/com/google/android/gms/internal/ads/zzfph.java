package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfph extends AbstractCollection {
    final /* synthetic */ zzfpi zza;

    zzfph(zzfpi zzfpi) {
        this.zza = zzfpi;
    }

    public final void clear() {
        this.zza.zzr();
    }

    public final boolean contains(Object obj) {
        for (Collection contains : this.zza.zzu().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Iterator iterator() {
        return this.zza.zzj();
    }

    public final int size() {
        return this.zza.zzh();
    }
}
