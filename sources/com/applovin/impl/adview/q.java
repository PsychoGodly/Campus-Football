package com.applovin.impl.adview;

import android.view.MotionEvent;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f6491a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MotionEvent f6492b;

    public /* synthetic */ q(a aVar, MotionEvent motionEvent) {
        this.f6491a = aVar;
        this.f6492b = motionEvent;
    }

    public final void run() {
        this.f6491a.b(this.f6492b);
    }
}
