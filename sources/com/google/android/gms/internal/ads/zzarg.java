package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzarg implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzarh zza;

    zzarg(zzarh zzarh) {
        this.zza = zzarh;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        if (z10) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        zzarh zzarh = this.zza;
        if (zzarh.zzc > 0 && currentTimeMillis >= zzarh.zzc) {
            zzarh.zzd = currentTimeMillis - zzarh.zzc;
        }
        this.zza.zze = false;
    }
}
