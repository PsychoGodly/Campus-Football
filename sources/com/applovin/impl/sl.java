package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public class sl implements j3 {
    protected sl() {
    }

    public long a() {
        return SystemClock.uptimeMillis();
    }

    public void b() {
    }

    public long c() {
        return SystemClock.elapsedRealtime();
    }

    public ha a(Looper looper, Handler.Callback callback) {
        return new tl(new Handler(looper, callback));
    }
}
