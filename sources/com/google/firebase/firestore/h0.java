package com.google.firebase.firestore;

import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.firestore.i0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import y7.b;

/* compiled from: LoadBundleTask */
public class h0 extends Task<i0> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f26471a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private i0 f26472b = i0.f26481g;

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource<i0> f26473c;

    /* renamed from: d  reason: collision with root package name */
    private final Task<i0> f26474d;

    /* renamed from: e  reason: collision with root package name */
    private final Queue<a> f26475e;

    /* compiled from: LoadBundleTask */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        Executor f26476a;

        /* renamed from: b  reason: collision with root package name */
        p0<i0> f26477b;

        a(Executor executor, p0<i0> p0Var) {
            this.f26476a = executor == null ? TaskExecutors.MAIN_THREAD : executor;
            this.f26477b = p0Var;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(i0 i0Var) {
            this.f26477b.a(i0Var);
        }

        public void b(i0 i0Var) {
            this.f26476a.execute(new g0(this, i0Var));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f26477b.equals(((a) obj).f26477b);
        }

        public int hashCode() {
            return this.f26477b.hashCode();
        }
    }

    public h0() {
        TaskCompletionSource<i0> taskCompletionSource = new TaskCompletionSource<>();
        this.f26473c = taskCompletionSource;
        this.f26474d = taskCompletionSource.getTask();
        this.f26475e = new ArrayDeque();
    }

    public h0 a(p0<i0> p0Var) {
        a aVar = new a((Executor) null, p0Var);
        synchronized (this.f26471a) {
            this.f26475e.add(aVar);
        }
        return this;
    }

    public Task<i0> addOnCanceledListener(OnCanceledListener onCanceledListener) {
        return this.f26474d.addOnCanceledListener(onCanceledListener);
    }

    public Task<i0> addOnCompleteListener(OnCompleteListener<i0> onCompleteListener) {
        return this.f26474d.addOnCompleteListener(onCompleteListener);
    }

    public Task<i0> addOnFailureListener(OnFailureListener onFailureListener) {
        return this.f26474d.addOnFailureListener(onFailureListener);
    }

    public Task<i0> addOnSuccessListener(OnSuccessListener<? super i0> onSuccessListener) {
        return this.f26474d.addOnSuccessListener(onSuccessListener);
    }

    /* renamed from: b */
    public i0 getResult() {
        return this.f26474d.getResult();
    }

    /* renamed from: c */
    public <X extends Throwable> i0 getResult(Class<X> cls) throws Throwable {
        return this.f26474d.getResult(cls);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<i0, TContinuationResult> continuation) {
        return this.f26474d.continueWith(continuation);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<i0, Task<TContinuationResult>> continuation) {
        return this.f26474d.continueWithTask(continuation);
    }

    public void d(Exception exc) {
        synchronized (this.f26471a) {
            i0 i0Var = new i0(this.f26472b.d(), this.f26472b.g(), this.f26472b.c(), this.f26472b.f(), exc, i0.a.ERROR);
            this.f26472b = i0Var;
            for (a b10 : this.f26475e) {
                b10.b(i0Var);
            }
            this.f26475e.clear();
        }
        this.f26473c.setException(exc);
    }

    public void e(i0 i0Var) {
        boolean equals = i0Var.e().equals(i0.a.SUCCESS);
        b.d(equals, "Expected success, but was " + i0Var.e(), new Object[0]);
        synchronized (this.f26471a) {
            this.f26472b = i0Var;
            for (a b10 : this.f26475e) {
                b10.b(this.f26472b);
            }
            this.f26475e.clear();
        }
        this.f26473c.setResult(i0Var);
    }

    public void f(i0 i0Var) {
        synchronized (this.f26471a) {
            this.f26472b = i0Var;
            for (a b10 : this.f26475e) {
                b10.b(i0Var);
            }
        }
    }

    public Exception getException() {
        return this.f26474d.getException();
    }

    public boolean isCanceled() {
        return this.f26474d.isCanceled();
    }

    public boolean isComplete() {
        return this.f26474d.isComplete();
    }

    public boolean isSuccessful() {
        return this.f26474d.isSuccessful();
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(SuccessContinuation<i0, TContinuationResult> successContinuation) {
        return this.f26474d.onSuccessTask(successContinuation);
    }

    public Task<i0> addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        return this.f26474d.addOnCanceledListener(executor, onCanceledListener);
    }

    public Task<i0> addOnCompleteListener(Executor executor, OnCompleteListener<i0> onCompleteListener) {
        return this.f26474d.addOnCompleteListener(executor, onCompleteListener);
    }

    public Task<i0> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        return this.f26474d.addOnFailureListener(executor, onFailureListener);
    }

    public Task<i0> addOnSuccessListener(Executor executor, OnSuccessListener<? super i0> onSuccessListener) {
        return this.f26474d.addOnSuccessListener(executor, onSuccessListener);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Executor executor, Continuation<i0, TContinuationResult> continuation) {
        return this.f26474d.continueWith(executor, continuation);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor executor, Continuation<i0, Task<TContinuationResult>> continuation) {
        return this.f26474d.continueWithTask(executor, continuation);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, SuccessContinuation<i0, TContinuationResult> successContinuation) {
        return this.f26474d.onSuccessTask(executor, successContinuation);
    }

    public Task<i0> addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        return this.f26474d.addOnCanceledListener(activity, onCanceledListener);
    }

    public Task<i0> addOnCompleteListener(Activity activity, OnCompleteListener<i0> onCompleteListener) {
        return this.f26474d.addOnCompleteListener(activity, onCompleteListener);
    }

    public Task<i0> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        return this.f26474d.addOnFailureListener(activity, onFailureListener);
    }

    public Task<i0> addOnSuccessListener(Activity activity, OnSuccessListener<? super i0> onSuccessListener) {
        return this.f26474d.addOnSuccessListener(activity, onSuccessListener);
    }
}
