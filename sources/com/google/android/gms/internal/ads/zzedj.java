package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzedj implements Callable {
    public final /* synthetic */ zzedo zza;
    public final /* synthetic */ zzfut zzb;
    public final /* synthetic */ zzfut zzc;
    public final /* synthetic */ zzeyo zzd;
    public final /* synthetic */ zzeyc zze;
    public final /* synthetic */ JSONObject zzf;

    public /* synthetic */ zzedj(zzedo zzedo, zzfut zzfut, zzfut zzfut2, zzeyo zzeyo, zzeyc zzeyc, JSONObject jSONObject) {
        this.zza = zzedo;
        this.zzb = zzfut;
        this.zzc = zzfut2;
        this.zzd = zzeyo;
        this.zze = zzeyc;
        this.zzf = jSONObject;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
