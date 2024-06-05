package com.google.firebase.messaging;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import c8.e;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.x0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l8.i;
import o7.b;
import o7.d;
import y6.f;
import z1.g;
import z7.j;

public class FirebaseMessaging {

    /* renamed from: o  reason: collision with root package name */
    private static final long f26702o = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: p  reason: collision with root package name */
    private static x0 f26703p;

    /* renamed from: q  reason: collision with root package name */
    static g f26704q;

    /* renamed from: r  reason: collision with root package name */
    static ScheduledExecutorService f26705r;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final f f26706a;

    /* renamed from: b  reason: collision with root package name */
    private final a8.a f26707b;

    /* renamed from: c  reason: collision with root package name */
    private final e f26708c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f26709d;

    /* renamed from: e  reason: collision with root package name */
    private final e0 f26710e;

    /* renamed from: f  reason: collision with root package name */
    private final s0 f26711f;

    /* renamed from: g  reason: collision with root package name */
    private final a f26712g;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f26713h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f26714i;

    /* renamed from: j  reason: collision with root package name */
    private final Executor f26715j;

    /* renamed from: k  reason: collision with root package name */
    private final Task<c1> f26716k;

    /* renamed from: l  reason: collision with root package name */
    private final j0 f26717l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f26718m;

    /* renamed from: n  reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f26719n;

    private class a {

        /* renamed from: a  reason: collision with root package name */
        private final d f26720a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f26721b;

        /* renamed from: c  reason: collision with root package name */
        private b<y6.b> f26722c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f26723d;

        a(d dVar) {
            this.f26720a = dVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(o7.a aVar) {
            if (c()) {
                FirebaseMessaging.this.Q();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context m10 = FirebaseMessaging.this.f26706a.m();
            SharedPreferences sharedPreferences = m10.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m10.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(m10.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void b() {
            if (!this.f26721b) {
                Boolean e10 = e();
                this.f26723d = e10;
                if (e10 == null) {
                    b0 b0Var = new b0(this);
                    this.f26722c = b0Var;
                    this.f26720a.d(y6.b.class, b0Var);
                }
                this.f26721b = true;
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean c() {
            boolean z10;
            b();
            Boolean bool = this.f26723d;
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                z10 = FirebaseMessaging.this.f26706a.x();
            }
            return z10;
        }

        /* access modifiers changed from: package-private */
        public synchronized void f(boolean z10) {
            b();
            b<y6.b> bVar = this.f26722c;
            if (bVar != null) {
                this.f26720a.c(y6.b.class, bVar);
                this.f26722c = null;
            }
            SharedPreferences.Editor edit = FirebaseMessaging.this.f26706a.m().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z10);
            edit.apply();
            if (z10) {
                FirebaseMessaging.this.Q();
            }
            this.f26723d = Boolean.valueOf(z10);
        }
    }

    FirebaseMessaging(f fVar, a8.a aVar, b8.b<i> bVar, b8.b<j> bVar2, e eVar, g gVar, d dVar) {
        this(fVar, aVar, bVar, bVar2, eVar, gVar, dVar, new j0(fVar.m()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task A(String str, x0.a aVar) {
        return this.f26710e.f().onSuccessTask(this.f26715j, new t(this, str, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task B(String str, x0.a aVar, String str2) throws Exception {
        s(this.f26709d).g(t(), str, str2, this.f26717l.a());
        if (aVar == null || !str2.equals(aVar.f26916a)) {
            F(str2);
        }
        return Tasks.forResult(str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void C(TaskCompletionSource taskCompletionSource) {
        try {
            this.f26707b.a(j0.c(this.f26706a), "FCM");
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void D(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(this.f26710e.c());
            s(this.f26709d).d(t(), j0.c(this.f26706a));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(n());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G() {
        if (y()) {
            Q();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(c1 c1Var) {
        if (y()) {
            c1Var.q();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I() {
        n0.c(this.f26709d);
    }

    private synchronized void P() {
        if (!this.f26718m) {
            S(0);
        }
    }

    /* access modifiers changed from: private */
    public void Q() {
        a8.a aVar = this.f26707b;
        if (aVar != null) {
            aVar.getToken();
        } else if (T(v())) {
            P();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(f fVar) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) fVar.k(cls);
            q.l(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging r() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(f.o());
        }
        return instance;
    }

    private static synchronized x0 s(Context context) {
        x0 x0Var;
        synchronized (FirebaseMessaging.class) {
            if (f26703p == null) {
                f26703p = new x0(context);
            }
            x0Var = f26703p;
        }
        return x0Var;
    }

    private String t() {
        if ("[DEFAULT]".equals(this.f26706a.q())) {
            return MaxReward.DEFAULT_LABEL;
        }
        return this.f26706a.s();
    }

    public static g w() {
        return f26704q;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void F(String str) {
        if ("[DEFAULT]".equals(this.f26706a.q())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f26706a.q());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new m(this.f26709d).k(intent);
        }
    }

    @Deprecated
    public void L(p0 p0Var) {
        if (!TextUtils.isEmpty(p0Var.K())) {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", PendingIntent.getBroadcast(this.f26709d, 0, intent2, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
            intent.setPackage("com.google.android.gms");
            p0Var.Y(intent);
            this.f26709d.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void M(boolean z10) {
        this.f26712g.f(z10);
    }

    public void N(boolean z10) {
        i0.y(z10);
    }

    /* access modifiers changed from: package-private */
    public synchronized void O(boolean z10) {
        this.f26718m = z10;
    }

    public Task<Void> R(String str) {
        return this.f26716k.onSuccessTask(new v(str));
    }

    /* access modifiers changed from: package-private */
    public synchronized void S(long j10) {
        p(new y0(this, Math.min(Math.max(30, 2 * j10), f26702o)), j10);
        this.f26718m = true;
    }

    /* access modifiers changed from: package-private */
    public boolean T(x0.a aVar) {
        return aVar == null || aVar.b(this.f26717l.a());
    }

    public Task<Void> U(String str) {
        return this.f26716k.onSuccessTask(new u(str));
    }

    /* access modifiers changed from: package-private */
    public String n() throws IOException {
        a8.a aVar = this.f26707b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.c());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        } else {
            x0.a v10 = v();
            if (!T(v10)) {
                return v10.f26916a;
            }
            String c10 = j0.c(this.f26706a);
            try {
                return (String) Tasks.await(this.f26711f.b(c10, new w(this, c10, v10)));
            } catch (InterruptedException | ExecutionException e11) {
                throw new IOException(e11);
            }
        }
    }

    public Task<Void> o() {
        if (this.f26707b != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f26713h.execute(new z(this, taskCompletionSource));
            return taskCompletionSource.getTask();
        } else if (v() == null) {
            return Tasks.forResult(null);
        } else {
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            n.e().execute(new r(this, taskCompletionSource2));
            return taskCompletionSource2.getTask();
        }
    }

    /* access modifiers changed from: package-private */
    public void p(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f26705r == null) {
                f26705r = new ScheduledThreadPoolExecutor(1, new n5.b("TAG"));
            }
            f26705r.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    public Context q() {
        return this.f26709d;
    }

    public Task<String> u() {
        a8.a aVar = this.f26707b;
        if (aVar != null) {
            return aVar.c();
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f26713h.execute(new a0(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    public x0.a v() {
        return s(this.f26709d).e(t(), j0.c(this.f26706a));
    }

    public boolean y() {
        return this.f26712g.c();
    }

    /* access modifiers changed from: package-private */
    public boolean z() {
        return this.f26717l.g();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FirebaseMessaging(y6.f r12, a8.a r13, b8.b<l8.i> r14, b8.b<z7.j> r15, c8.e r16, z1.g r17, o7.d r18, com.google.firebase.messaging.j0 r19) {
        /*
            r11 = this;
            com.google.firebase.messaging.e0 r7 = new com.google.firebase.messaging.e0
            r0 = r7
            r1 = r12
            r2 = r19
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r8 = com.google.firebase.messaging.n.f()
            java.util.concurrent.ScheduledExecutorService r9 = com.google.firebase.messaging.n.c()
            java.util.concurrent.Executor r10 = com.google.firebase.messaging.n.b()
            r0 = r11
            r2 = r13
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.<init>(y6.f, a8.a, b8.b, b8.b, c8.e, z1.g, o7.d, com.google.firebase.messaging.j0):void");
    }

    FirebaseMessaging(f fVar, a8.a aVar, e eVar, g gVar, d dVar, j0 j0Var, e0 e0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f26718m = false;
        f26704q = gVar;
        this.f26706a = fVar;
        this.f26707b = aVar;
        this.f26708c = eVar;
        this.f26712g = new a(dVar);
        Context m10 = fVar.m();
        this.f26709d = m10;
        p pVar = new p();
        this.f26719n = pVar;
        this.f26717l = j0Var;
        this.f26714i = executor;
        this.f26710e = e0Var;
        this.f26711f = new s0(executor);
        this.f26713h = executor2;
        this.f26715j = executor3;
        Context m11 = fVar.m();
        if (m11 instanceof Application) {
            ((Application) m11).registerActivityLifecycleCallbacks(pVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + m11 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.b(new q(this));
        }
        executor2.execute(new y(this));
        Task<c1> f10 = c1.f(this, j0Var, e0Var, m10, n.g());
        this.f26716k = f10;
        f10.addOnSuccessListener(executor2, (OnSuccessListener<? super c1>) new s(this));
        executor2.execute(new x(this));
    }
}
