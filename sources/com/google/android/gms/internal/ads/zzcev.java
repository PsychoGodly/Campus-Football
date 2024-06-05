package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcev implements Runnable {
    public final /* synthetic */ a zza;

    public /* synthetic */ zzcev(a aVar) {
        this.zza = aVar;
    }

    public final void run() {
        a aVar = this.zza;
        t.a();
        if (((Boolean) a0.c().zzb(zzbar.zzeC)).booleanValue() && zzffi.zzb()) {
            Object A1 = b.A1(aVar);
            if (A1 instanceof zzffk) {
                ((zzffk) A1).zzc();
            }
        }
    }
}
