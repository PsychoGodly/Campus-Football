package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f26386a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f26387b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p.b f26388c;

    public /* synthetic */ j(o oVar, Runnable runnable, p.b bVar) {
        this.f26386a = oVar;
        this.f26387b = runnable;
        this.f26388c = bVar;
    }

    public final void run() {
        this.f26386a.u(this.f26387b, this.f26388c);
    }
}
