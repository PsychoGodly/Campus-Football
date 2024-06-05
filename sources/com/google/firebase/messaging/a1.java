package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: TopicsStore */
final class a1 {

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference<a1> f26749d;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f26750a;

    /* renamed from: b  reason: collision with root package name */
    private w0 f26751b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f26752c;

    private a1(SharedPreferences sharedPreferences, Executor executor) {
        this.f26752c = executor;
        this.f26750a = sharedPreferences;
    }

    public static synchronized a1 b(Context context, Executor executor) {
        a1 a1Var;
        synchronized (a1.class) {
            a1Var = null;
            WeakReference<a1> weakReference = f26749d;
            if (weakReference != null) {
                a1Var = (a1) weakReference.get();
            }
            if (a1Var == null) {
                a1Var = new a1(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                a1Var.d();
                f26749d = new WeakReference<>(a1Var);
            }
        }
        return a1Var;
    }

    private synchronized void d() {
        this.f26751b = w0.d(this.f26750a, "topic_operation_queue", ",", this.f26752c);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean a(z0 z0Var) {
        return this.f26751b.b(z0Var.e());
    }

    /* access modifiers changed from: package-private */
    public synchronized z0 c() {
        return z0.a(this.f26751b.f());
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean e(z0 z0Var) {
        return this.f26751b.g(z0Var.e());
    }
}
