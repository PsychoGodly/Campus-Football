package com.startapp;

import android.content.Context;
import android.webkit.JavascriptInterface;

/* compiled from: Sta */
public class k4 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16033a = false;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f16034b = null;

    public k4(Context context, Runnable runnable) {
        this.f16034b = runnable;
    }

    @JavascriptInterface
    public void closeSplash() {
        if (!this.f16033a) {
            this.f16033a = true;
            this.f16034b.run();
        }
    }
}
