package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f26389a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f26390b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p.b f26391c;

    public /* synthetic */ k(o oVar, Runnable runnable, p.b bVar) {
        this.f26389a = oVar;
        this.f26390b = runnable;
        this.f26391c = bVar;
    }

    public final void run() {
        this.f26389a.w(this.f26390b, this.f26391c);
    }
}
