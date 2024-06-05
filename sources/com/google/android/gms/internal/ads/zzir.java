package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzir {
    public static zzno zza(Context context, zzjc zzjc, boolean z10) {
        zznk zzb = zznk.zzb(context);
        if (zzb == null) {
            zzee.zze("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzno(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z10) {
            zzjc.zzC(zzb);
        }
        return new zzno(zzb.zza());
    }
}
