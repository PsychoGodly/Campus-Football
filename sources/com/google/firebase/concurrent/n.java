package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f26396a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p.b f26397b;

    public /* synthetic */ n(Runnable runnable, p.b bVar) {
        this.f26396a = runnable;
        this.f26397b = bVar;
    }

    public final void run() {
        o.y(this.f26396a, this.f26397b);
    }
}
