package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzoo implements Runnable {
    public final /* synthetic */ AudioTrack zza;
    public final /* synthetic */ zzdo zzb;

    public /* synthetic */ zzoo(AudioTrack audioTrack, zzdo zzdo) {
        this.zza = audioTrack;
        this.zzb = zzdo;
    }

    public final void run() {
        zzpf.zzD(this.zza, this.zzb);
    }
}
