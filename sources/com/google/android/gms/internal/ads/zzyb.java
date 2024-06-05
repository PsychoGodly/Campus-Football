package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzyb implements DisplayManager.DisplayListener, zzxz {
    private final DisplayManager zza;
    private zzxx zzb;

    private zzyb(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    public static zzxz zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new zzyb(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    public final void onDisplayAdded(int i10) {
    }

    public final void onDisplayChanged(int i10) {
        zzxx zzxx = this.zzb;
        if (zzxx != null && i10 == 0) {
            zzyd.zzb(zzxx.zza, zzd());
        }
    }

    public final void onDisplayRemoved(int i10) {
    }

    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    public final void zzb(zzxx zzxx) {
        this.zzb = zzxx;
        this.zza.registerDisplayListener(this, zzew.zzD((Handler.Callback) null));
        zzyd.zzb(zzxx.zza, zzd());
    }
}
