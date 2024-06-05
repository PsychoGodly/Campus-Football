package com.applovin.impl;

import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class t80 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f12287a;

    public /* synthetic */ t80(String str) {
        this.f12287a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return yp.a(this.f12287a, runnable);
    }
}
