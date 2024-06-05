package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzop {
    public static void zza(AudioTrack audioTrack, zzor zzor) {
        audioTrack.setPreferredDevice(zzor == null ? null : zzor.zza);
    }
}
