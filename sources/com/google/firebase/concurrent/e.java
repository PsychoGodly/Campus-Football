package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f26367a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f26368b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p.b f26369c;

    public /* synthetic */ e(o oVar, Callable callable, p.b bVar) {
        this.f26367a = oVar;
        this.f26368b = callable;
        this.f26369c = bVar;
    }

    public final Object call() {
        return this.f26367a.r(this.f26368b, this.f26369c);
    }
}
