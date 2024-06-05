package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f26379a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f26380b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f26381c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f26382d;

    public /* synthetic */ h(o oVar, Callable callable, long j10, TimeUnit timeUnit) {
        this.f26379a = oVar;
        this.f26380b = callable;
        this.f26381c = j10;
        this.f26382d = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f26379a.s(this.f26380b, this.f26381c, this.f26382d, bVar);
    }
}
