package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.collection.a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: TopicsSubscriber */
class c1 {

    /* renamed from: i  reason: collision with root package name */
    private static final long f26766i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a  reason: collision with root package name */
    private final Context f26767a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f26768b;

    /* renamed from: c  reason: collision with root package name */
    private final e0 f26769c;

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseMessaging f26770d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f26771e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f26772f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f26773g = false;

    /* renamed from: h  reason: collision with root package name */
    private final a1 f26774h;

    private c1(FirebaseMessaging firebaseMessaging, j0 j0Var, a1 a1Var, e0 e0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f26770d = firebaseMessaging;
        this.f26768b = j0Var;
        this.f26774h = a1Var;
        this.f26769c = e0Var;
        this.f26767a = context;
        this.f26772f = scheduledExecutorService;
    }

    private void b(z0 z0Var, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque arrayDeque;
        synchronized (this.f26771e) {
            String e10 = z0Var.e();
            if (this.f26771e.containsKey(e10)) {
                arrayDeque = this.f26771e.get(e10);
            } else {
                ArrayDeque arrayDeque2 = new ArrayDeque();
                this.f26771e.put(e10, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(taskCompletionSource);
        }
    }

    private static <T> void c(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e10);
            }
        } catch (InterruptedException | TimeoutException e11) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e11);
        }
    }

    private void d(String str) throws IOException {
        c(this.f26769c.l(this.f26770d.n(), str));
    }

    private void e(String str) throws IOException {
        c(this.f26769c.m(this.f26770d.n(), str));
    }

    static Task<c1> f(FirebaseMessaging firebaseMessaging, j0 j0Var, e0 e0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new b1(context, scheduledExecutorService, firebaseMessaging, j0Var, e0Var));
    }

    static boolean h() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ c1 j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, j0 j0Var, e0 e0Var) throws Exception {
        return new c1(firebaseMessaging, j0Var, a1.b(context, scheduledExecutorService), e0Var, context, scheduledExecutorService);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k(com.google.firebase.messaging.z0 r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r0 = r4.f26771e
            monitor-enter(r0)
            java.lang.String r5 = r5.e()     // Catch:{ all -> 0x0032 }
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r1 = r4.f26771e     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0011:
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r1 = r4.f26771e     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r1.poll()     // Catch:{ all -> 0x0032 }
            com.google.android.gms.tasks.TaskCompletionSource r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0025
            r3 = 0
            r2.setResult(r3)     // Catch:{ all -> 0x0032 }
        L_0x0025:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r1 = r4.f26771e     // Catch:{ all -> 0x0032 }
            r1.remove(r5)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.c1.k(com.google.firebase.messaging.z0):void");
    }

    private void p() {
        if (!i()) {
            t(0);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.f26774h.c() != null;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean i() {
        return this.f26773g;
    }

    /* access modifiers changed from: package-private */
    public boolean l(z0 z0Var) throws IOException {
        try {
            String b10 = z0Var.b();
            char c10 = 65535;
            int hashCode = b10.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85) {
                    if (b10.equals("U")) {
                        c10 = 1;
                    }
                }
            } else if (b10.equals("S")) {
                c10 = 0;
            }
            if (c10 == 0) {
                d(z0Var.c());
                if (h()) {
                    Log.d("FirebaseMessaging", "Subscribe to topic: " + z0Var.c() + " succeeded.");
                }
            } else if (c10 == 1) {
                e(z0Var.c());
                if (h()) {
                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + z0Var.c() + " succeeded.");
                }
            } else if (h()) {
                Log.d("FirebaseMessaging", "Unknown topic operation" + z0Var + ".");
            }
            return true;
        } catch (IOException e10) {
            if ("SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e10.getMessage())) {
                Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
                return false;
            } else if (e10.getMessage() == null) {
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            } else {
                throw e10;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m(Runnable runnable, long j10) {
        this.f26772f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    public Task<Void> n(z0 z0Var) {
        this.f26774h.a(z0Var);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        b(z0Var, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    public synchronized void o(boolean z10) {
        this.f26773g = z10;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        if (g()) {
            p();
        }
    }

    /* access modifiers changed from: package-private */
    public Task<Void> r(String str) {
        Task<Void> n10 = n(z0.f(str));
        q();
        return n10;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (l(r0) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean s() throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            com.google.firebase.messaging.a1 r0 = r2.f26774h     // Catch:{ all -> 0x002b }
            com.google.firebase.messaging.z0 r0 = r0.c()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0019
            boolean r0 = h()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x002b }
        L_0x0016:
            r0 = 1
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            return r0
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            boolean r1 = r2.l(r0)
            if (r1 != 0) goto L_0x0022
            r0 = 0
            return r0
        L_0x0022:
            com.google.firebase.messaging.a1 r1 = r2.f26774h
            r1.e(r0)
            r2.k(r0)
            goto L_0x0000
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.c1.s():boolean");
    }

    /* access modifiers changed from: package-private */
    public void t(long j10) {
        m(new d1(this, this.f26767a, this.f26768b, Math.min(Math.max(30, 2 * j10), f26766i)), j10);
        o(true);
    }

    /* access modifiers changed from: package-private */
    public Task<Void> u(String str) {
        Task<Void> n10 = n(z0.g(str));
        q();
        return n10;
    }
}
