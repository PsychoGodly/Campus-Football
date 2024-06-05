package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzelz implements zzepm {
    private final String zza;
    private final String zzb;
    private final Bundle zzc;

    /* synthetic */ zzelz(String str, String str2, Bundle bundle, zzely zzely) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.zza);
        bundle.putString("fc_consent", this.zzb);
        bundle.putBundle("iab_consent_info", this.zzc);
    }
}
