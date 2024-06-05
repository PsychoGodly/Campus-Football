package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcnp implements Runnable {
    public final /* synthetic */ zzcnq zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzcnp(zzcnq zzcnq, JSONObject jSONObject) {
        this.zza = zzcnq;
        this.zzb = jSONObject;
    }

    public final void run() {
        this.zza.zzd(this.zzb);
    }
}
