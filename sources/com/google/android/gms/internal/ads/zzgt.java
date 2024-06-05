package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgt extends BroadcastReceiver implements Runnable {
    final /* synthetic */ zzgv zza;
    private final zzgu zzb;
    private final Handler zzc;

    public zzgt(zzgv zzgv, Handler handler, zzgu zzgu) {
        this.zza = zzgv;
        this.zzc = handler;
        this.zzb = zzgu;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zzc.post(this);
        }
    }

    public final void run() {
    }
}
