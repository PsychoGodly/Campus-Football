package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import t4.r;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzeai implements DialogInterface.OnCancelListener {
    public final /* synthetic */ r zza;

    public /* synthetic */ zzeai(r rVar) {
        this.zza = rVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        r rVar = this.zza;
        if (rVar != null) {
            rVar.zzb();
        }
    }
}
