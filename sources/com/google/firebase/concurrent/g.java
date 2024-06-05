package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f26375a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f26376b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f26377c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f26378d;

    public /* synthetic */ g(o oVar, Runnable runnable, long j10, TimeUnit timeUnit) {
        this.f26375a = oVar;
        this.f26376b = runnable;
        this.f26377c = j10;
        this.f26378d = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f26375a.p(this.f26376b, this.f26377c, this.f26378d, bVar);
    }
}
