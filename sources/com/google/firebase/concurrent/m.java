package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f26394a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p.b f26395b;

    public /* synthetic */ m(Runnable runnable, p.b bVar) {
        this.f26394a = runnable;
        this.f26395b = bVar;
    }

    public final void run() {
        o.t(this.f26394a, this.f26395b);
    }
}
