package com.startapp;

import android.os.Handler;

/* compiled from: Sta */
public class w2 implements v2 {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f17482a;

    public w2(Handler handler) {
        this.f17482a = handler;
    }

    public void a(Runnable runnable, long j10) {
        this.f17482a.postDelayed(runnable, j10);
    }

    public void execute(Runnable runnable) {
        this.f17482a.post(runnable);
    }

    public void a(Runnable runnable) {
        this.f17482a.removeCallbacks(runnable);
    }
}
