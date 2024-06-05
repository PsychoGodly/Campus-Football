package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcaf implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcan zzb;

    zzcaf(zzcan zzcan, MediaPlayer mediaPlayer) {
        this.zzb = zzcan;
        this.zza = mediaPlayer;
    }

    public final void run() {
        zzcan.zzl(this.zzb, this.zza);
        zzcan zzcan = this.zzb;
        if (zzcan.zzr != null) {
            zzcan.zzr.zzf();
        }
    }
}
