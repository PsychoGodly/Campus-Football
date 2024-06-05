package com.onesignal;

import kotlin.jvm.internal.m;

/* compiled from: OSBackgroundManager.kt */
public class s0 {
    public final void d(Runnable runnable, String str) {
        m.e(runnable, "runnable");
        m.e(str, "threadName");
        if (OSUtils.H()) {
            new Thread(runnable, str).start();
        } else {
            runnable.run();
        }
    }
}
