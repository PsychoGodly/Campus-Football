package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzkx extends BroadcastReceiver {
    final /* synthetic */ zzky zza;

    /* synthetic */ zzkx(zzky zzky, zzkw zzkw) {
        this.zza = zzky;
    }

    public final void onReceive(Context context, Intent intent) {
        zzky zzky = this.zza;
        zzky.zzb.post(new zzkv(zzky));
    }
}
