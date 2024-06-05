package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcne implements Runnable {
    public final /* synthetic */ zzcei zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzcne(zzcei zzcei, JSONObject jSONObject) {
        this.zza = zzcei;
        this.zzb = jSONObject;
    }

    public final void run() {
        this.zza.zzl("AFMA_updateActiveView", this.zzb);
    }
}
