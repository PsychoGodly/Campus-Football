package com.onesignal;

import android.os.SystemClock;

/* compiled from: OSTimeImpl */
public class d3 implements c3 {
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    public long b() {
        return System.currentTimeMillis();
    }
}
