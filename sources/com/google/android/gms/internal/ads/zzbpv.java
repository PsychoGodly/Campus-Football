package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbpv implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbpx zza;

    zzbpv(zzbpx zzbpx) {
        this.zza = zzbpx;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        Intent zzb = this.zza.zzb();
        t.r();
        b2.q(this.zza.zzb, zzb);
    }
}
