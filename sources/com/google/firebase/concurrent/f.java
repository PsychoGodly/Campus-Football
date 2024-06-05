package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f26370a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f26371b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f26372c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f26373d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f26374e;

    public /* synthetic */ f(o oVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f26370a = oVar;
        this.f26371b = runnable;
        this.f26372c = j10;
        this.f26373d = j11;
        this.f26374e = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f26370a.x(this.f26371b, this.f26372c, this.f26373d, this.f26374e, bVar);
    }
}
