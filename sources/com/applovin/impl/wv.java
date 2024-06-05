package com.applovin.impl;

import com.applovin.impl.cc;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class wv implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CopyOnWriteArraySet f13183a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13184b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ cc.a f13185c;

    public /* synthetic */ wv(CopyOnWriteArraySet copyOnWriteArraySet, int i10, cc.a aVar) {
        this.f13183a = copyOnWriteArraySet;
        this.f13184b = i10;
        this.f13185c = aVar;
    }

    public final void run() {
        cc.a(this.f13183a, this.f13184b, this.f13185c);
    }
}
