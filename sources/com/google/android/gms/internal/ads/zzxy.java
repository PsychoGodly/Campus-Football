package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzxy {
    public static void zza(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            zzee.zzc("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
