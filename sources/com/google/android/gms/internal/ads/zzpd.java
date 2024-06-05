package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzpd {
    final /* synthetic */ zzpf zza;
    private final Handler zzb = new Handler(Looper.myLooper());
    private final AudioTrack.StreamEventCallback zzc;

    public zzpd(zzpf zzpf) {
        this.zza = zzpf;
        this.zzc = new zzpc(this, zzpf);
    }

    public final void zza(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(new zzpb(this.zzb), this.zzc);
    }

    public final void zzb(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages((Object) null);
    }
}
