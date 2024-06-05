package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbqb implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbqc zza;

    zzbqb(zzbqc zzbqc) {
        this.zza = zzbqc;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzg("User canceled the download.");
    }
}
