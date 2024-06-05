package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbpw implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbpx zza;

    zzbpw(zzbpx zzbpx) {
        this.zza = zzbpx;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzg("Operation denied by user.");
    }
}
