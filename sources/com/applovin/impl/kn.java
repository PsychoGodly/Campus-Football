package com.applovin.impl;

import com.applovin.impl.sdk.k;

public class kn extends xl {

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f9061h;

    public kn(k kVar, String str, Runnable runnable) {
        this(kVar, false, str, runnable);
    }

    public void run() {
        this.f9061h.run();
    }

    public kn(k kVar, boolean z10, String str, Runnable runnable) {
        super("TaskRunnable:" + str, kVar, z10);
        this.f9061h = runnable;
    }
}
