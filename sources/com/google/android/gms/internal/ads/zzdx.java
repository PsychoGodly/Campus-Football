package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdx implements Runnable {
    public final /* synthetic */ CopyOnWriteArraySet zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzdy zzc;

    public /* synthetic */ zzdx(CopyOnWriteArraySet copyOnWriteArraySet, int i10, zzdy zzdy) {
        this.zza = copyOnWriteArraySet;
        this.zzb = i10;
        this.zzc = zzdy;
    }

    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.zza;
        int i10 = this.zzb;
        zzdy zzdy = this.zzc;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((zzea) it.next()).zza(i10, zzdy);
        }
    }
}
