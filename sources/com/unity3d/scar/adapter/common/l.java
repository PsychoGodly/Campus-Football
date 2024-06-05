package com.unity3d.scar.adapter.common;

import android.os.Handler;
import android.os.Looper;

/* compiled from: Utils */
public class l {
    public static void a(Runnable runnable) {
        b(runnable, 0);
    }

    public static void b(Runnable runnable, long j10) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, j10);
    }
}
