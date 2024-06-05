package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzqy {
    public static void zza(zzqs zzqs, zzno zzno) {
        LogSessionId zza = zzno.zza();
        if (!zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            zzqs.zzb.setString("log-session-id", zza.getStringId());
        }
    }
}
