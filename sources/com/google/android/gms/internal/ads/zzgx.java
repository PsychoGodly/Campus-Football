package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgx implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzgz zza;
    private final Handler zzb;

    public zzgx(zzgz zzgz, Handler handler) {
        this.zza = zzgz;
        this.zzb = handler;
    }

    public final void onAudioFocusChange(int i10) {
        this.zzb.post(new zzgw(this, i10));
    }
}
