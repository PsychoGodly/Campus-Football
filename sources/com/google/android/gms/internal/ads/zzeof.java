package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeof implements zzepm {
    private final String zza;
    private final String zzb;

    public zzeof(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) a0.c().zzb(zzbar.zzgy)).booleanValue()) {
            bundle.putString("request_id", this.zzb);
        } else {
            bundle.putString("request_id", this.zza);
        }
    }
}
