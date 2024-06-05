package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfga implements Application.ActivityLifecycleCallbacks {
    private static final zzfga zza = new zzfga();
    private boolean zzb;
    private boolean zzc;
    private zzfgf zzd;

    private zzfga() {
    }

    public static zzfga zza() {
        return zza;
    }

    private final void zze() {
        boolean z10 = this.zzc;
        for (zzffo zzg : zzffz.zza().zzc()) {
            zzfgl zzg2 = zzg.zzg();
            if (zzg2.zzk()) {
                zzfge.zza().zzb(zzg2.zza(), "setState", true != z10 ? "foregrounded" : "backgrounded");
            }
        }
    }

    private final void zzf(boolean z10) {
        if (this.zzc != z10) {
            this.zzc = z10;
            if (this.zzb) {
                zze();
                if (this.zzd == null) {
                    return;
                }
                if (!z10) {
                    zzfhb.zzd().zzi();
                } else {
                    zzfhb.zzd().zzh();
                }
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        zzf(false);
    }

    public final void onActivityStopped(Activity activity) {
        View zzf;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i10 = runningAppProcessInfo.importance;
        boolean z10 = true;
        boolean z11 = true;
        for (zzffo zzffo : zzffz.zza().zzb()) {
            if (zzffo.zzj() && (zzf = zzffo.zzf()) != null && zzf.hasWindowFocus()) {
                z11 = false;
            }
        }
        if (i10 == 100 || !z11) {
            z10 = false;
        }
        zzf(z10);
    }

    public final void zzb() {
        this.zzb = true;
        this.zzc = false;
        zze();
    }

    public final void zzc() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = null;
    }

    public final void zzd(zzfgf zzfgf) {
        this.zzd = zzfgf;
    }
}
