package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcbe implements Runnable {
    zzcbe(zzcbg zzcbg) {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
