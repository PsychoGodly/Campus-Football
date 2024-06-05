package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzert implements Callable {
    public final /* synthetic */ zzfut zza;
    public final /* synthetic */ zzfut zzb;

    public /* synthetic */ zzert(zzfut zzfut, zzfut zzfut2) {
        this.zza = zzfut;
        this.zzb = zzfut2;
    }

    public final Object call() {
        return new zzerv((String) this.zza.get(), (String) this.zzb.get());
    }
}
