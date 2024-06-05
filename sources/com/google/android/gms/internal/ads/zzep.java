package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzep implements zzdm {
    protected zzep() {
    }

    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    public final zzdv zzb(Looper looper, Handler.Callback callback) {
        return new zzes(new Handler(looper, callback));
    }
}
