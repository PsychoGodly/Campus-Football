package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import e8.d;

/* compiled from: GetAuthTokenListener */
class e implements h {

    /* renamed from: a  reason: collision with root package name */
    private final i f26691a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource<g> f26692b;

    public e(i iVar, TaskCompletionSource<g> taskCompletionSource) {
        this.f26691a = iVar;
        this.f26692b = taskCompletionSource;
    }

    public boolean a(Exception exc) {
        this.f26692b.trySetException(exc);
        return true;
    }

    public boolean b(d dVar) {
        if (!dVar.k() || this.f26691a.f(dVar)) {
            return false;
        }
        this.f26692b.setResult(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
