package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzpt {
    public final int zza;
    public final zzss zzb;
    private final CopyOnWriteArrayList zzc;

    public zzpt() {
        this(new CopyOnWriteArrayList(), 0, (zzss) null);
    }

    private zzpt(CopyOnWriteArrayList copyOnWriteArrayList, int i10, zzss zzss) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzss;
    }

    public final zzpt zza(int i10, zzss zzss) {
        return new zzpt(this.zzc, 0, zzss);
    }

    public final void zzb(Handler handler, zzpu zzpu) {
        this.zzc.add(new zzps(handler, zzpu));
    }

    public final void zzc(zzpu zzpu) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzps zzps = (zzps) it.next();
            if (zzps.zzb == zzpu) {
                this.zzc.remove(zzps);
            }
        }
    }
}
