package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzqj extends Handler {
    final /* synthetic */ zzql zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzqj(zzql zzql, Looper looper) {
        super(looper);
        this.zza = zzql;
    }

    public final void handleMessage(Message message) {
        zzql.zza(this.zza, message);
    }
}
