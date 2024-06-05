package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzya implements zzxz {
    private final WindowManager zza;

    private zzya(WindowManager windowManager) {
        this.zza = windowManager;
    }

    public static zzxz zzc(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzya(windowManager);
        }
        return null;
    }

    public final void zza() {
    }

    public final void zzb(zzxx zzxx) {
        zzyd.zzb(zzxx.zza, this.zza.getDefaultDisplay());
    }
}
