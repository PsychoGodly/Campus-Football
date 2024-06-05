package com.google.firebase.iid;

import a8.a;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import b8.b;
import c8.e;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import l8.i;
import y6.f;
import z7.j;

@Deprecated
/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public class FirebaseInstanceId {

    /* renamed from: i  reason: collision with root package name */
    private static final long f26592i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j  reason: collision with root package name */
    private static u f26593j;

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f26594k = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: l  reason: collision with root package name */
    static ScheduledExecutorService f26595l;

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f26596m = 0;

    /* renamed from: a  reason: collision with root package name */
    final Executor f26597a;

    /* renamed from: b  reason: collision with root package name */
    private final f f26598b;

    /* renamed from: c  reason: collision with root package name */
    private final n f26599c;

    /* renamed from: d  reason: collision with root package name */
    private final k f26600d;

    /* renamed from: e  reason: collision with root package name */
    private final s f26601e;

    /* renamed from: f  reason: collision with root package name */
    private final e f26602f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f26603g;

    /* renamed from: h  reason: collision with root package name */
    private final List<a.C0255a> f26604h;

    FirebaseInstanceId(f fVar, n nVar, Executor executor, Executor executor2, b<i> bVar, b<j> bVar2, e eVar) {
        this.f26603g = false;
        this.f26604h = new ArrayList();
        if (n.c(fVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f26593j == null) {
                    f26593j = new u(fVar.m());
                }
            }
            this.f26598b = fVar;
            this.f26599c = nVar;
            this.f26600d = new k(fVar, nVar, bVar, bVar2, eVar);
            this.f26597a = executor2;
            this.f26601e = new s(executor);
            this.f26602f = eVar;
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    private <T> T b(Task<T> task) throws IOException {
        try {
            return Tasks.await(task, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    A();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e10);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    private static <T> T c(Task<T> task) throws InterruptedException {
        q.l(task, "Task must not be null");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.addOnCompleteListener(d.f26611a, (OnCompleteListener<T>) new e(countDownLatch));
        countDownLatch.await(30000, TimeUnit.MILLISECONDS);
        return l(task);
    }

    private static void e(f fVar) {
        q.h(fVar.r().g(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        q.h(fVar.r().c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        q.h(fVar.r().b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        q.b(t(fVar.r().c()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        q.b(s(fVar.r().b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Keep
    public static FirebaseInstanceId getInstance(f fVar) {
        e(fVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) fVar.k(FirebaseInstanceId.class);
        q.l(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    private Task<l> k(String str, String str2) {
        return Tasks.forResult(null).continueWithTask(this.f26597a, new c(this, str, z(str2)));
    }

    private static <T> T l(Task<T> task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        } else if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        } else {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    private String m() {
        if ("[DEFAULT]".equals(this.f26598b.q())) {
            return MaxReward.DEFAULT_LABEL;
        }
        return this.f26598b.s();
    }

    static boolean q() {
        if (Log.isLoggable("FirebaseInstanceId", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3))) {
            return true;
        }
        return false;
    }

    static boolean s(String str) {
        return f26594k.matcher(str).matches();
    }

    static boolean t(String str) {
        return str.contains(":");
    }

    private static String z(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* access modifiers changed from: package-private */
    public synchronized void A() {
        f26593j.d();
    }

    /* access modifiers changed from: package-private */
    public synchronized void B(boolean z10) {
        this.f26603g = z10;
    }

    /* access modifiers changed from: package-private */
    public synchronized void C() {
        if (!this.f26603g) {
            D(0);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void D(long j10) {
        g(new v(this, Math.min(Math.max(30, j10 + j10), f26592i)), j10);
        this.f26603g = true;
    }

    /* access modifiers changed from: package-private */
    public boolean E(u.a aVar) {
        return aVar == null || aVar.c(this.f26599c.a());
    }

    /* access modifiers changed from: package-private */
    public void a(a.C0255a aVar) {
        this.f26604h.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public String d() throws IOException {
        return getToken(n.c(this.f26598b), "*");
    }

    @Deprecated
    public void f(String str, String str2) throws IOException {
        e(this.f26598b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String z10 = z(str2);
            b(this.f26600d.b(i(), str, z10));
            f26593j.e(m(), str, z10);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    public void g(Runnable runnable, long j10) {
        synchronized (FirebaseInstanceId.class) {
            if (f26595l == null) {
                f26595l = new ScheduledThreadPoolExecutor(1, new n5.b("FirebaseInstanceId"));
            }
            f26595l.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    @Deprecated
    public String getToken(String str, String str2) throws IOException {
        e(this.f26598b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((l) b(k(str, str2))).getToken();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    public f h() {
        return this.f26598b;
    }

    /* access modifiers changed from: package-private */
    public String i() {
        try {
            f26593j.j(this.f26598b.s());
            return (String) c(this.f26602f.getId());
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Deprecated
    public Task<l> j() {
        e(this.f26598b);
        return k(n.c(this.f26598b), "*");
    }

    @Deprecated
    public String n() {
        e(this.f26598b);
        u.a o10 = o();
        if (E(o10)) {
            C();
        }
        return u.a.b(o10);
    }

    /* access modifiers changed from: package-private */
    public u.a o() {
        return p(n.c(this.f26598b), "*");
    }

    /* access modifiers changed from: package-private */
    public u.a p(String str, String str2) {
        return f26593j.g(m(), str, str2);
    }

    public boolean r() {
        return this.f26599c.g();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task v(String str, String str2, String str3, String str4) throws Exception {
        f26593j.i(m(), str, str2, str4, this.f26599c.a());
        return Tasks.forResult(new m(str3, str4));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void w(u.a aVar, l lVar) {
        String token = lVar.getToken();
        if (aVar == null || !token.equals(aVar.f26653a)) {
            for (a.C0255a a10 : this.f26604h) {
                a10.a(token);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task x(String str, String str2, String str3, u.a aVar) {
        return this.f26600d.e(str, str2, str3).onSuccessTask(this.f26597a, new g(this, str2, str3, str)).addOnSuccessListener(h.f26622a, new i(this, aVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task y(String str, String str2, Task task) throws Exception {
        String i10 = i();
        u.a p10 = p(str, str2);
        if (!E(p10)) {
            return Tasks.forResult(new m(i10, p10.f26653a));
        }
        return this.f26601e.a(str, str2, new f(this, i10, str, str2, p10));
    }

    FirebaseInstanceId(f fVar, b<i> bVar, b<j> bVar2, e eVar) {
        this(fVar, new n(fVar.m()), b.b(), b.b(), bVar, bVar2, eVar);
    }
}
