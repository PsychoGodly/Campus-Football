package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdxe implements Callable {
    public final /* synthetic */ zzfut zza;
    public final /* synthetic */ zzfut zzb;
    public final /* synthetic */ zzfut zzc;

    public /* synthetic */ zzdxe(zzfut zzfut, zzfut zzfut2, zzfut zzfut3) {
        this.zza = zzfut;
        this.zzb = zzfut2;
        this.zzc = zzfut3;
    }

    public final Object call() {
        return new zzdxo((zzdyc) this.zza.get(), (JSONObject) this.zzb.get(), (zzbtq) this.zzc.get());
    }
}
