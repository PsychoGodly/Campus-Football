package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzoq {
    public static void zza(AudioTrack audioTrack, zzno zzno) {
        LogSessionId zza = zzno.zza();
        if (!zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(zza);
        }
    }
}
