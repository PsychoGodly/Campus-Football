package com.startapp;

import android.os.HandlerThread;

/* compiled from: Sta */
public class x2 extends HandlerThread {

    /* renamed from: a  reason: collision with root package name */
    public final Object f17529a = new Object();

    public x2(String str) {
        super(str);
    }

    public void onLooperPrepared() {
        synchronized (this.f17529a) {
            this.f17529a.notifyAll();
        }
    }

    public void start() {
        synchronized (this.f17529a) {
            super.start();
            try {
                this.f17529a.wait();
            } catch (InterruptedException e10) {
                throw new RuntimeException(e10);
            }
        }
    }
}
