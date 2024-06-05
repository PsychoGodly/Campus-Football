package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzpc extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzpf zza;
    final /* synthetic */ zzpd zzb;

    zzpc(zzpd zzpd, zzpf zzpf) {
        this.zzb = zzpd;
        this.zza = zzpf;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        if (audioTrack.equals(this.zzb.zza.zzu)) {
            zzpf zzpf = this.zzb.zza;
            if (zzpf.zzq != null && zzpf.zzP) {
                zzpf.zzq.zzb();
            }
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.zzb.zza.zzu)) {
            zzpf zzpf = this.zzb.zza;
            if (zzpf.zzq != null && zzpf.zzP) {
                zzpf.zzq.zzb();
            }
        }
    }
}
