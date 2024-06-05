package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzflw extends zzfmi {
    final /* synthetic */ zzflx zza;
    private final zzfmc zzb;

    zzflw(zzflx zzflx, zzfmc zzfmc) {
        this.zza = zzflx;
        this.zzb = zzfmc;
    }

    public final void zzb(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfma zzc = zzfmb.zzc();
        zzc.zzb(i10);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i10 == 8157) {
            this.zza.zzc();
        }
    }
}
