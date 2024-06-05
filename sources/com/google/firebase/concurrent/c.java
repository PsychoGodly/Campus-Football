package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f26360a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f26361b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f26362c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f26363d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f26364e;

    public /* synthetic */ c(o oVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f26360a = oVar;
        this.f26361b = runnable;
        this.f26362c = j10;
        this.f26363d = j11;
        this.f26364e = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f26360a.v(this.f26361b, this.f26362c, this.f26363d, this.f26364e, bVar);
    }
}
