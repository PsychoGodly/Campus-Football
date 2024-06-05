package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzwq {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzwr zzwr) {
        zzc(zzwr);
        this.zza.add(new zzwp(handler, zzwr));
    }

    public final void zzb(int i10, long j10, long j11) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzwp zzwp = (zzwp) it.next();
            if (!zzwp.zzc) {
                zzwp.zza.post(new zzwo(zzwp, i10, j10, j11));
            }
        }
    }

    public final void zzc(zzwr zzwr) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzwp zzwp = (zzwp) it.next();
            if (zzwp.zzb == zzwr) {
                zzwp.zzc();
                this.zza.remove(zzwp);
            }
        }
    }
}
