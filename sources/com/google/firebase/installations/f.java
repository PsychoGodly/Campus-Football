package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import e8.d;

/* compiled from: GetIdListener */
class f implements h {

    /* renamed from: a  reason: collision with root package name */
    final TaskCompletionSource<String> f26693a;

    public f(TaskCompletionSource<String> taskCompletionSource) {
        this.f26693a = taskCompletionSource;
    }

    public boolean a(Exception exc) {
        return false;
    }

    public boolean b(d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f26693a.trySetResult(dVar.d());
        return true;
    }
}
