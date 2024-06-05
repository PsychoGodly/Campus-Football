package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.n1;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzczw implements Runnable {
    public final /* synthetic */ zzczx zza;
    public final /* synthetic */ Object zzb;

    public /* synthetic */ zzczw(zzczx zzczx, Object obj) {
        this.zza = zzczx;
        this.zzb = obj;
    }

    public final void run() {
        try {
            this.zza.zza(this.zzb);
        } catch (Throwable th) {
            t.q().zzt(th, "EventEmitter.notify");
            n1.b("Event emitter exception.", th);
        }
    }
}
