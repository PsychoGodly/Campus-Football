package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzflx {
    /* access modifiers changed from: private */
    public static final zzfmk zzb = new zzfmk("OverlayDisplayService");
    private static final Intent zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzfmv zza;
    /* access modifiers changed from: private */
    public final String zzd;

    zzflx(Context context) {
        if (zzfmy.zza(context)) {
            this.zza = new zzfmv(context.getApplicationContext(), zzb, "OverlayDisplayService", zzc, zzfls.zza, (zzfmq) null, (byte[]) null);
        } else {
            this.zza = null;
        }
        this.zzd = context.getPackageName();
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        if (this.zza != null) {
            zzb.zzc("unbind LMD display overlay service", new Object[0]);
            this.zza.zzu();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzd(zzflo zzflo, zzfmc zzfmc) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzflu(this, taskCompletionSource, zzflo, zzfmc, taskCompletionSource), taskCompletionSource);
    }

    /* access modifiers changed from: package-private */
    public final void zze(zzflz zzflz, zzfmc zzfmc) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else if (zzflz.zzg() == null) {
            zzb.zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfma zzc2 = zzfmb.zzc();
            zzc2.zzb(8160);
            zzfmc.zza(zzc2.zzc());
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzflt(this, taskCompletionSource, zzflz, zzfmc, taskCompletionSource), taskCompletionSource);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzf(zzfme zzfme, zzfmc zzfmc, int i10) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzflv(this, taskCompletionSource, zzfme, i10, zzfmc, taskCompletionSource), taskCompletionSource);
    }
}
