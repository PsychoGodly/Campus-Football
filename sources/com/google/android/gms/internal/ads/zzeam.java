package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;
import t4.r;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzeam extends TimerTask {
    final /* synthetic */ AlertDialog zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ r zzc;

    zzeam(AlertDialog alertDialog, Timer timer, r rVar) {
        this.zza = alertDialog;
        this.zzb = timer;
        this.zzc = rVar;
    }

    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        r rVar = this.zzc;
        if (rVar != null) {
            rVar.zzb();
        }
    }
}
