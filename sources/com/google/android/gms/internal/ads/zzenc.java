package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzenc implements zzepm {
    public final zzeyb zza;

    public zzenc(zzeyb zzeyb) {
        this.zza = zzeyb;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzeyb zzeyb = this.zza;
        if (zzeyb != null) {
            bundle.putBoolean("render_in_browser", zzeyb.zzd());
            bundle.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}
