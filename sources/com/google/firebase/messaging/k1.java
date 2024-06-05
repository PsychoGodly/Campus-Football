package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n5.b;

/* compiled from: WithinAppServiceConnection */
class k1 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Context f26832a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f26833b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f26834c;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<a> f26835d;

    /* renamed from: f  reason: collision with root package name */
    private h1 f26836f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f26837g;

    /* compiled from: WithinAppServiceConnection */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        final Intent f26838a;

        /* renamed from: b  reason: collision with root package name */
        private final TaskCompletionSource<Void> f26839b = new TaskCompletionSource<>();

        a(Intent intent) {
            this.f26838a = intent;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f26838a.getAction() + " finishing.");
            d();
        }

        /* access modifiers changed from: package-private */
        public void c(ScheduledExecutorService scheduledExecutorService) {
            e().addOnCompleteListener((Executor) scheduledExecutorService, new i1(scheduledExecutorService.schedule(new j1(this), 20, TimeUnit.SECONDS)));
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f26839b.trySetResult(null);
        }

        /* access modifiers changed from: package-private */
        public Task<Void> e() {
            return this.f26839b.getTask();
        }
    }

    k1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private void a() {
        while (!this.f26835d.isEmpty()) {
            this.f26835d.poll().d();
        }
    }

    private synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f26835d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            h1 h1Var = this.f26836f;
            if (h1Var == null || !h1Var.isBinderAlive()) {
                d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f26836f.c(this.f26835d.poll());
        }
    }

    private void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f26837g);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (!this.f26837g) {
            this.f26837g = true;
            try {
                if (!l5.a.b().a(this.f26832a, this.f26833b, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f26837g = false;
                    a();
                }
            } catch (SecurityException e10) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized Task<Void> c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.c(this.f26834c);
        this.f26835d.add(aVar);
        b();
        return aVar.e();
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f26837g = false;
        if (!(iBinder instanceof h1)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            a();
            return;
        }
        this.f26836f = (h1) iBinder;
        b();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }

    k1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f26835d = new ArrayDeque();
        this.f26837g = false;
        Context applicationContext = context.getApplicationContext();
        this.f26832a = applicationContext;
        this.f26833b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f26834c = scheduledExecutorService;
    }
}
