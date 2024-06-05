package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzell implements Callable {
    public final /* synthetic */ zzelm zza;

    public /* synthetic */ zzell(zzelm zzelm) {
        this.zza = zzelm;
    }

    public final Object call() {
        return new zzeln(Long.valueOf(t.b().a() - t.q().zzh().zzh().zza()).longValue());
    }
}
