package com.google.firebase.installations;

import android.text.TextUtils;
import c8.e;
import c8.g;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.d;
import e7.x;
import e8.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import y6.f;
import z7.i;

/* compiled from: FirebaseInstallations */
public class c implements e {

    /* renamed from: m  reason: collision with root package name */
    private static final Object f26669m = new Object();

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadFactory f26670n = new a();

    /* renamed from: a  reason: collision with root package name */
    private final f f26671a;

    /* renamed from: b  reason: collision with root package name */
    private final f8.c f26672b;

    /* renamed from: c  reason: collision with root package name */
    private final e8.c f26673c;

    /* renamed from: d  reason: collision with root package name */
    private final i f26674d;

    /* renamed from: e  reason: collision with root package name */
    private final x<e8.b> f26675e;

    /* renamed from: f  reason: collision with root package name */
    private final g f26676f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f26677g;

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f26678h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f26679i;

    /* renamed from: j  reason: collision with root package name */
    private String f26680j;

    /* renamed from: k  reason: collision with root package name */
    private Set<d8.a> f26681k;

    /* renamed from: l  reason: collision with root package name */
    private final List<h> f26682l;

    /* compiled from: FirebaseInstallations */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f26683a = new AtomicInteger(1);

        a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f26683a.getAndIncrement())}));
        }
    }

    /* compiled from: FirebaseInstallations */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26684a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f26685b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                f8.f$b[] r0 = f8.f.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26685b = r0
                r1 = 1
                f8.f$b r2 = f8.f.b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f26685b     // Catch:{ NoSuchFieldError -> 0x001d }
                f8.f$b r3 = f8.f.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f26685b     // Catch:{ NoSuchFieldError -> 0x0028 }
                f8.f$b r3 = f8.f.b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                f8.d$b[] r2 = f8.d.b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f26684a = r2
                f8.d$b r3 = f8.d.b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f26684a     // Catch:{ NoSuchFieldError -> 0x0043 }
                f8.d$b r2 = f8.d.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.b.<clinit>():void");
        }
    }

    c(f fVar, b8.b<i> bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, fVar, new f8.c(fVar.m(), bVar), new e8.c(fVar), i.c(), new x(new c8.a(fVar)), new g());
    }

    private String A(d dVar) {
        if ((!this.f26671a.q().equals("CHIME_ANDROID_SDK") && !this.f26671a.y()) || !dVar.m()) {
            return this.f26676f.a();
        }
        String f10 = o().f();
        return TextUtils.isEmpty(f10) ? this.f26676f.a() : f10;
    }

    private d B(d dVar) throws d {
        f8.d d10 = this.f26672b.d(l(), dVar.d(), t(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i10 = b.f26684a[d10.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(d10.c(), d10.d(), this.f26674d.b(), d10.b().c(), d10.b().d());
        } else if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
    }

    private void C(Exception exc) {
        synchronized (this.f26677g) {
            Iterator<h> it = this.f26682l.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    private void D(e8.d dVar) {
        synchronized (this.f26677g) {
            Iterator<h> it = this.f26682l.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void E(String str) {
        this.f26680j = str;
    }

    private synchronized void F(e8.d dVar, e8.d dVar2) {
        if (this.f26681k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            for (d8.a a10 : this.f26681k) {
                a10.a(dVar2.d());
            }
        }
    }

    private Task<g> f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new e(this.f26674d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<String> g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new f(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void h(h hVar) {
        synchronized (this.f26677g) {
            this.f26682l.add(hVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(boolean r3) {
        /*
            r2 = this;
            e8.d r0 = r2.r()
            boolean r1 = r0.i()     // Catch:{ d -> 0x005f }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.l()     // Catch:{ d -> 0x005f }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.i r3 = r2.f26674d     // Catch:{ d -> 0x005f }
            boolean r3 = r3.f(r0)     // Catch:{ d -> 0x005f }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            e8.d r3 = r2.k(r0)     // Catch:{ d -> 0x005f }
            goto L_0x0026
        L_0x0022:
            e8.d r3 = r2.B(r0)     // Catch:{ d -> 0x005f }
        L_0x0026:
            r2.u(r3)
            r2.F(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r3.d()
            r2.E(r0)
        L_0x0039:
            boolean r0 = r3.i()
            if (r0 == 0) goto L_0x004a
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.d.a.BAD_CONFIG
            r3.<init>(r0)
            r2.C(r3)
            goto L_0x005e
        L_0x004a:
            boolean r0 = r3.j()
            if (r0 == 0) goto L_0x005b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.C(r3)
            goto L_0x005e
        L_0x005b:
            r2.D(r3)
        L_0x005e:
            return
        L_0x005f:
            r3 = move-exception
            r2.C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.v(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void x(boolean z10) {
        e8.d s10 = s();
        if (z10) {
            s10 = s10.p();
        }
        D(s10);
        this.f26679i.execute(new c8.c(this, z10));
    }

    private e8.d k(e8.d dVar) throws d {
        f8.f e10 = this.f26672b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.f26685b[e10.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(e10.c(), e10.d(), this.f26674d.b());
        } else if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            if (i10 == 3) {
                E((String) null);
                return dVar.r();
            }
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
    }

    private synchronized String n() {
        return this.f26680j;
    }

    private e8.b o() {
        return this.f26675e.get();
    }

    public static c p() {
        return q(f.o());
    }

    public static c q(f fVar) {
        q.b(fVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) fVar.k(e.class);
    }

    private e8.d r() {
        e8.d d10;
        synchronized (f26669m) {
            b a10 = b.a(this.f26671a.m(), "generatefid.lock");
            try {
                d10 = this.f26673c.d();
                if (a10 != null) {
                    a10.b();
                }
            } catch (Throwable th) {
                if (a10 != null) {
                    a10.b();
                }
                throw th;
            }
        }
        return d10;
    }

    private e8.d s() {
        e8.d d10;
        synchronized (f26669m) {
            b a10 = b.a(this.f26671a.m(), "generatefid.lock");
            try {
                d10 = this.f26673c.d();
                if (d10.j()) {
                    d10 = this.f26673c.b(d10.t(A(d10)));
                }
                if (a10 != null) {
                    a10.b();
                }
            } catch (Throwable th) {
                if (a10 != null) {
                    a10.b();
                }
                throw th;
            }
        }
        return d10;
    }

    private void u(e8.d dVar) {
        synchronized (f26669m) {
            b a10 = b.a(this.f26671a.m(), "generatefid.lock");
            try {
                this.f26673c.b(dVar);
                if (a10 != null) {
                    a10.b();
                }
            } catch (Throwable th) {
                if (a10 != null) {
                    a10.b();
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w() {
        x(false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ e8.b y(f fVar) {
        return new e8.b(fVar);
    }

    private void z() {
        q.h(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        q.h(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        q.h(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        q.b(i.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        q.b(i.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public Task<g> a(boolean z10) {
        z();
        Task<g> f10 = f();
        this.f26678h.execute(new c8.d(this, z10));
        return f10;
    }

    public Task<String> getId() {
        z();
        String n10 = n();
        if (n10 != null) {
            return Tasks.forResult(n10);
        }
        Task<String> g10 = g();
        this.f26678h.execute(new c8.b(this));
        return g10;
    }

    /* access modifiers changed from: package-private */
    public String l() {
        return this.f26671a.r().b();
    }

    /* access modifiers changed from: package-private */
    public String m() {
        return this.f26671a.r().c();
    }

    /* access modifiers changed from: package-private */
    public String t() {
        return this.f26671a.r().g();
    }

    c(ExecutorService executorService, Executor executor, f fVar, f8.c cVar, e8.c cVar2, i iVar, x<e8.b> xVar, g gVar) {
        this.f26677g = new Object();
        this.f26681k = new HashSet();
        this.f26682l = new ArrayList();
        this.f26671a = fVar;
        this.f26672b = cVar;
        this.f26673c = cVar2;
        this.f26674d = iVar;
        this.f26675e = xVar;
        this.f26676f = gVar;
        this.f26678h = executorService;
        this.f26679i = executor;
    }
}
