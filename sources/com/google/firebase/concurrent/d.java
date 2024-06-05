package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable f26365a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p.b f26366b;

    public /* synthetic */ d(Callable callable, p.b bVar) {
        this.f26365a = callable;
        this.f26366b = bVar;
    }

    public final void run() {
        o.q(this.f26365a, this.f26366b);
    }
}
