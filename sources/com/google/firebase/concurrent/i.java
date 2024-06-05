package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f26383a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f26384b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p.b f26385c;

    public /* synthetic */ i(o oVar, Runnable runnable, p.b bVar) {
        this.f26383a = oVar;
        this.f26384b = runnable;
        this.f26385c = bVar;
    }

    public final void run() {
        this.f26383a.o(this.f26384b, this.f26385c);
    }
}
