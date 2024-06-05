package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public abstract class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TaskCompletionSource f26081a;

    o() {
        this.f26081a = null;
    }

    public o(TaskCompletionSource taskCompletionSource) {
        this.f26081a = taskCompletionSource;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f26081a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: package-private */
    public final TaskCompletionSource c() {
        return this.f26081a;
    }

    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }
}
