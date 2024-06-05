package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzffj {
    private boolean zza;

    /* access modifiers changed from: package-private */
    public final void zza(Context context) {
        zzfgr.zzb(context, "Application Context cannot be null");
        if (!this.zza) {
            this.zza = true;
            zzfgf.zzb().zzc(context);
            zzfga zza2 = zzfga.zza();
            if (context instanceof Application) {
                ((Application) context).registerActivityLifecycleCallbacks(zza2);
            }
            zzfgp.zzg(context);
            zzfgc.zzb().zzc(context);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzb() {
        return this.zza;
    }
}
