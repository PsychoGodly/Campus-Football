package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f26392a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p.b f26393b;

    public /* synthetic */ l(Runnable runnable, p.b bVar) {
        this.f26392a = runnable;
        this.f26393b = bVar;
    }

    public final void run() {
        o.n(this.f26392a, this.f26393b);
    }
}
