package io.grpc.internal;

import dd.j0;
import dd.j1;
import dd.k;
import dd.n1;
import dd.r;
import dd.r0;
import dd.y0;
import dd.z0;
import io.grpc.internal.k1;
import io.grpc.internal.r;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: DelayedClientTransport */
final class a0 implements k1 {

    /* renamed from: a  reason: collision with root package name */
    private final j0 f34705a = j0.a(a0.class, (String) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f34706b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f34707c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final n1 f34708d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f34709e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Runnable f34710f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Runnable f34711g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public k1.a f34712h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public Collection<e> f34713i = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public j1 f34714j;

    /* renamed from: k  reason: collision with root package name */
    private r0.i f34715k;

    /* renamed from: l  reason: collision with root package name */
    private long f34716l;

    /* compiled from: DelayedClientTransport */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.a f34717a;

        a(k1.a aVar) {
            this.f34717a = aVar;
        }

        public void run() {
            this.f34717a.d(true);
        }
    }

    /* compiled from: DelayedClientTransport */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.a f34719a;

        b(k1.a aVar) {
            this.f34719a = aVar;
        }

        public void run() {
            this.f34719a.d(false);
        }
    }

    /* compiled from: DelayedClientTransport */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.a f34721a;

        c(k1.a aVar) {
            this.f34721a = aVar;
        }

        public void run() {
            this.f34721a.c();
        }
    }

    /* compiled from: DelayedClientTransport */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j1 f34723a;

        d(j1 j1Var) {
            this.f34723a = j1Var;
        }

        public void run() {
            a0.this.f34712h.a(this.f34723a);
        }
    }

    /* compiled from: DelayedClientTransport */
    private class e extends b0 {
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public final r0.f f34725j;

        /* renamed from: k  reason: collision with root package name */
        private final r f34726k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public final k[] f34727l;

        /* synthetic */ e(a0 a0Var, r0.f fVar, k[] kVarArr, a aVar) {
            this(fVar, kVarArr);
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: private */
        public Runnable A(s sVar) {
            r b10 = this.f34726k.b();
            try {
                q c10 = sVar.c(this.f34725j.c(), this.f34725j.b(), this.f34725j.a(), this.f34727l);
                this.f34726k.f(b10);
                return w(c10);
            } catch (Throwable th) {
                this.f34726k.f(b10);
                throw th;
            }
        }

        public void b(j1 j1Var) {
            super.b(j1Var);
            synchronized (a0.this.f34706b) {
                if (a0.this.f34711g != null) {
                    boolean remove = a0.this.f34713i.remove(this);
                    if (!a0.this.q() && remove) {
                        a0.this.f34708d.b(a0.this.f34710f);
                        if (a0.this.f34714j != null) {
                            a0.this.f34708d.b(a0.this.f34711g);
                            Runnable unused = a0.this.f34711g = null;
                        }
                    }
                }
            }
            a0.this.f34708d.a();
        }

        public void n(x0 x0Var) {
            if (this.f34725j.a().j()) {
                x0Var.a("wait_for_ready");
            }
            super.n(x0Var);
        }

        /* access modifiers changed from: protected */
        public void u(j1 j1Var) {
            for (k i10 : this.f34727l) {
                i10.i(j1Var);
            }
        }

        private e(r0.f fVar, k[] kVarArr) {
            this.f34726k = r.e();
            this.f34725j = fVar;
            this.f34727l = kVarArr;
        }
    }

    a0(Executor executor, n1 n1Var) {
        this.f34707c = executor;
        this.f34708d = n1Var;
    }

    private e o(r0.f fVar, k[] kVarArr) {
        e eVar = new e(this, fVar, kVarArr, (a) null);
        this.f34713i.add(eVar);
        if (p() == 1) {
            this.f34708d.b(this.f34709e);
        }
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r3.f34708d.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(dd.j1 r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f34706b
            monitor-enter(r0)
            dd.j1 r1 = r3.f34714j     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x0009:
            r3.f34714j = r4     // Catch:{ all -> 0x002e }
            dd.n1 r1 = r3.f34708d     // Catch:{ all -> 0x002e }
            io.grpc.internal.a0$d r2 = new io.grpc.internal.a0$d     // Catch:{ all -> 0x002e }
            r2.<init>(r4)     // Catch:{ all -> 0x002e }
            r1.b(r2)     // Catch:{ all -> 0x002e }
            boolean r4 = r3.q()     // Catch:{ all -> 0x002e }
            if (r4 != 0) goto L_0x0027
            java.lang.Runnable r4 = r3.f34711g     // Catch:{ all -> 0x002e }
            if (r4 == 0) goto L_0x0027
            dd.n1 r1 = r3.f34708d     // Catch:{ all -> 0x002e }
            r1.b(r4)     // Catch:{ all -> 0x002e }
            r4 = 0
            r3.f34711g = r4     // Catch:{ all -> 0x002e }
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            dd.n1 r4 = r3.f34708d
            r4.a()
            return
        L_0x002e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.a0.b(dd.j1):void");
    }

    public final q c(z0<?, ?> z0Var, y0 y0Var, dd.c cVar, k[] kVarArr) {
        q f0Var;
        try {
            t1 t1Var = new t1(z0Var, y0Var, cVar);
            r0.i iVar = null;
            long j10 = -1;
            while (true) {
                synchronized (this.f34706b) {
                    if (this.f34714j == null) {
                        r0.i iVar2 = this.f34715k;
                        if (iVar2 != null) {
                            if (iVar != null && j10 == this.f34716l) {
                                f0Var = o(t1Var, kVarArr);
                                break;
                            }
                            j10 = this.f34716l;
                            s j11 = r0.j(iVar2.a(t1Var), cVar.j());
                            if (j11 != null) {
                                f0Var = j11.c(t1Var.c(), t1Var.b(), t1Var.a(), kVarArr);
                                break;
                            }
                            iVar = iVar2;
                        } else {
                            f0Var = o(t1Var, kVarArr);
                            break;
                        }
                    } else {
                        f0Var = new f0(this.f34714j, kVarArr);
                        break;
                    }
                }
            }
            this.f34708d.a();
            return f0Var;
        } catch (Throwable th) {
            this.f34708d.a();
            throw th;
        }
    }

    public final void d(j1 j1Var) {
        Collection<e> collection;
        Runnable runnable;
        b(j1Var);
        synchronized (this.f34706b) {
            collection = this.f34713i;
            runnable = this.f34711g;
            this.f34711g = null;
            if (!collection.isEmpty()) {
                this.f34713i = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (e next : collection) {
                Runnable w10 = next.w(new f0(j1Var, r.a.REFUSED, next.f34727l));
                if (w10 != null) {
                    w10.run();
                }
            }
            this.f34708d.execute(runnable);
        }
    }

    public final Runnable e(k1.a aVar) {
        this.f34712h = aVar;
        this.f34709e = new a(aVar);
        this.f34710f = new b(aVar);
        this.f34711g = new c(aVar);
        return null;
    }

    public j0 g() {
        return this.f34705a;
    }

    /* access modifiers changed from: package-private */
    public final int p() {
        int size;
        synchronized (this.f34706b) {
            size = this.f34713i.size();
        }
        return size;
    }

    public final boolean q() {
        boolean z10;
        synchronized (this.f34706b) {
            z10 = !this.f34713i.isEmpty();
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = new java.util.ArrayList();
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r1.hasNext() == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r2 = (io.grpc.internal.a0.e) r1.next();
        r3 = r8.a(io.grpc.internal.a0.e.y(r2));
        r4 = io.grpc.internal.a0.e.y(r2).a();
        r3 = io.grpc.internal.r0.j(r3, r4.j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r3 == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        r5 = r7.f34707c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r4.e() == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        r5 = r4.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r3 = io.grpc.internal.a0.e.z(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r3 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        r5.execute(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        r0.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        r8 = r7.f34706b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (q() != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        r7.f34713i.removeAll(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        if (r7.f34713i.isEmpty() == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        r7.f34713i = new java.util.LinkedHashSet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (q() != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
        r7.f34708d.b(r7.f34710f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0094, code lost:
        if (r7.f34714j == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        r0 = r7.f34711g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        if (r0 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
        r7.f34708d.b(r0);
        r7.f34711g = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        r7.f34708d.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(dd.r0.i r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f34706b
            monitor-enter(r0)
            r7.f34715k = r8     // Catch:{ all -> 0x00ae }
            long r1 = r7.f34716l     // Catch:{ all -> 0x00ae }
            r3 = 1
            long r1 = r1 + r3
            r7.f34716l = r1     // Catch:{ all -> 0x00ae }
            if (r8 == 0) goto L_0x00ac
            boolean r1 = r7.q()     // Catch:{ all -> 0x00ae }
            if (r1 != 0) goto L_0x0016
            goto L_0x00ac
        L_0x0016:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00ae }
            java.util.Collection<io.grpc.internal.a0$e> r2 = r7.f34713i     // Catch:{ all -> 0x00ae }
            r1.<init>(r2)     // Catch:{ all -> 0x00ae }
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0066
            java.lang.Object r2 = r1.next()
            io.grpc.internal.a0$e r2 = (io.grpc.internal.a0.e) r2
            dd.r0$f r3 = r2.f34725j
            dd.r0$e r3 = r8.a(r3)
            dd.r0$f r4 = r2.f34725j
            dd.c r4 = r4.a()
            boolean r5 = r4.j()
            io.grpc.internal.s r3 = io.grpc.internal.r0.j(r3, r5)
            if (r3 == 0) goto L_0x0027
            java.util.concurrent.Executor r5 = r7.f34707c
            java.util.concurrent.Executor r6 = r4.e()
            if (r6 == 0) goto L_0x0059
            java.util.concurrent.Executor r5 = r4.e()
        L_0x0059:
            java.lang.Runnable r3 = r2.A(r3)
            if (r3 == 0) goto L_0x0062
            r5.execute(r3)
        L_0x0062:
            r0.add(r2)
            goto L_0x0027
        L_0x0066:
            java.lang.Object r8 = r7.f34706b
            monitor-enter(r8)
            boolean r1 = r7.q()     // Catch:{ all -> 0x00a9 }
            if (r1 != 0) goto L_0x0071
            monitor-exit(r8)     // Catch:{ all -> 0x00a9 }
            return
        L_0x0071:
            java.util.Collection<io.grpc.internal.a0$e> r1 = r7.f34713i     // Catch:{ all -> 0x00a9 }
            r1.removeAll(r0)     // Catch:{ all -> 0x00a9 }
            java.util.Collection<io.grpc.internal.a0$e> r0 = r7.f34713i     // Catch:{ all -> 0x00a9 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0085
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch:{ all -> 0x00a9 }
            r0.<init>()     // Catch:{ all -> 0x00a9 }
            r7.f34713i = r0     // Catch:{ all -> 0x00a9 }
        L_0x0085:
            boolean r0 = r7.q()     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x00a2
            dd.n1 r0 = r7.f34708d     // Catch:{ all -> 0x00a9 }
            java.lang.Runnable r1 = r7.f34710f     // Catch:{ all -> 0x00a9 }
            r0.b(r1)     // Catch:{ all -> 0x00a9 }
            dd.j1 r0 = r7.f34714j     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a2
            java.lang.Runnable r0 = r7.f34711g     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a2
            dd.n1 r1 = r7.f34708d     // Catch:{ all -> 0x00a9 }
            r1.b(r0)     // Catch:{ all -> 0x00a9 }
            r0 = 0
            r7.f34711g = r0     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            monitor-exit(r8)     // Catch:{ all -> 0x00a9 }
            dd.n1 r8 = r7.f34708d
            r8.a()
            return
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00a9 }
            throw r0
        L_0x00ac:
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x00ae:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.a0.r(dd.r0$i):void");
    }
}
