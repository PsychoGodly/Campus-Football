package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdxd implements Callable {
    public final /* synthetic */ zzfut zza;
    public final /* synthetic */ zzfut zzb;

    public /* synthetic */ zzdxd(zzfut zzfut, zzfut zzfut2) {
        this.zza = zzfut;
        this.zzb = zzfut2;
    }

    public final Object call() {
        return new zzdyf((JSONObject) this.zza.get(), (zzbtq) this.zzb.get());
    }
}
