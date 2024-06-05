package bf;

import com.applovin.mediation.MaxReward;
import ff.c;
import ff.j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p002if.g;

/* compiled from: RealCall */
final class w implements d {

    /* renamed from: a  reason: collision with root package name */
    final u f31900a;

    /* renamed from: b  reason: collision with root package name */
    final j f31901b;

    /* renamed from: c  reason: collision with root package name */
    final lf.a f31902c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public o f31903d;

    /* renamed from: f  reason: collision with root package name */
    final x f31904f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f31905g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f31906h;

    /* compiled from: RealCall */
    class a extends lf.a {
        a() {
        }

        /* access modifiers changed from: protected */
        public void t() {
            w.this.b();
        }
    }

    /* compiled from: RealCall */
    final class b extends cf.b {

        /* renamed from: b  reason: collision with root package name */
        private final e f31908b;

        static {
            Class<w> cls = w.class;
        }

        b(e eVar) {
            super("OkHttp %s", w.this.i());
            this.f31908b = eVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0030 A[Catch:{ IOException -> 0x004e, all -> 0x0026, all -> 0x008d }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059 A[Catch:{ IOException -> 0x004e, all -> 0x0026, all -> 0x008d }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0079 A[Catch:{ IOException -> 0x004e, all -> 0x0026, all -> 0x008d }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void k() {
            /*
                r5 = this;
                bf.w r0 = bf.w.this
                lf.a r0 = r0.f31902c
                r0.k()
                r0 = 0
                bf.w r1 = bf.w.this     // Catch:{ IOException -> 0x004e, all -> 0x0026 }
                bf.z r0 = r1.e()     // Catch:{ IOException -> 0x004e, all -> 0x0026 }
                r1 = 1
                bf.e r2 = r5.f31908b     // Catch:{ IOException -> 0x0024, all -> 0x0022 }
                bf.w r3 = bf.w.this     // Catch:{ IOException -> 0x0024, all -> 0x0022 }
                r2.onResponse(r3, r0)     // Catch:{ IOException -> 0x0024, all -> 0x0022 }
            L_0x0016:
                bf.w r0 = bf.w.this
                bf.u r0 = r0.f31900a
                bf.m r0 = r0.i()
                r0.c(r5)
                goto L_0x008c
            L_0x0022:
                r0 = move-exception
                goto L_0x0029
            L_0x0024:
                r0 = move-exception
                goto L_0x0051
            L_0x0026:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x0029:
                bf.w r2 = bf.w.this     // Catch:{ all -> 0x008d }
                r2.b()     // Catch:{ all -> 0x008d }
                if (r1 != 0) goto L_0x004d
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x008d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
                r2.<init>()     // Catch:{ all -> 0x008d }
                java.lang.String r3 = "canceled due to "
                r2.append(r3)     // Catch:{ all -> 0x008d }
                r2.append(r0)     // Catch:{ all -> 0x008d }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008d }
                r1.<init>(r2)     // Catch:{ all -> 0x008d }
                bf.e r2 = r5.f31908b     // Catch:{ all -> 0x008d }
                bf.w r3 = bf.w.this     // Catch:{ all -> 0x008d }
                r2.onFailure(r3, r1)     // Catch:{ all -> 0x008d }
            L_0x004d:
                throw r0     // Catch:{ all -> 0x008d }
            L_0x004e:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x0051:
                bf.w r2 = bf.w.this     // Catch:{ all -> 0x008d }
                java.io.IOException r0 = r2.j(r0)     // Catch:{ all -> 0x008d }
                if (r1 == 0) goto L_0x0079
                if.g r1 = p002if.g.l()     // Catch:{ all -> 0x008d }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
                r3.<init>()     // Catch:{ all -> 0x008d }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x008d }
                bf.w r4 = bf.w.this     // Catch:{ all -> 0x008d }
                java.lang.String r4 = r4.k()     // Catch:{ all -> 0x008d }
                r3.append(r4)     // Catch:{ all -> 0x008d }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x008d }
                r1.s(r2, r3, r0)     // Catch:{ all -> 0x008d }
                goto L_0x0016
            L_0x0079:
                bf.w r1 = bf.w.this     // Catch:{ all -> 0x008d }
                bf.o r1 = r1.f31903d     // Catch:{ all -> 0x008d }
                bf.w r2 = bf.w.this     // Catch:{ all -> 0x008d }
                r1.b(r2, r0)     // Catch:{ all -> 0x008d }
                bf.e r1 = r5.f31908b     // Catch:{ all -> 0x008d }
                bf.w r2 = bf.w.this     // Catch:{ all -> 0x008d }
                r1.onFailure(r2, r0)     // Catch:{ all -> 0x008d }
                goto L_0x0016
            L_0x008c:
                return
            L_0x008d:
                r0 = move-exception
                bf.w r1 = bf.w.this
                bf.u r1 = r1.f31900a
                bf.m r1 = r1.i()
                r1.c(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: bf.w.b.k():void");
        }

        /* access modifiers changed from: package-private */
        public void l(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e10) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e10);
                w.this.f31903d.b(w.this, interruptedIOException);
                this.f31908b.onFailure(w.this, interruptedIOException);
                w.this.f31900a.i().c(this);
            } catch (Throwable th) {
                w.this.f31900a.i().c(this);
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        public w m() {
            return w.this;
        }

        /* access modifiers changed from: package-private */
        public String n() {
            return w.this.f31904f.h().l();
        }
    }

    private w(u uVar, x xVar, boolean z10) {
        this.f31900a = uVar;
        this.f31904f = xVar;
        this.f31905g = z10;
        this.f31901b = new j(uVar, z10);
        a aVar = new a();
        this.f31902c = aVar;
        aVar.g((long) uVar.b(), TimeUnit.MILLISECONDS);
    }

    private void c() {
        this.f31901b.k(g.l().o("response.body().close()"));
    }

    static w g(u uVar, x xVar, boolean z10) {
        w wVar = new w(uVar, xVar, z10);
        wVar.f31903d = uVar.k().a(wVar);
        return wVar;
    }

    public void b() {
        this.f31901b.b();
    }

    /* renamed from: d */
    public w clone() {
        return g(this.f31900a, this.f31904f, this.f31905g);
    }

    /* access modifiers changed from: package-private */
    public z e() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f31900a.p());
        arrayList.add(this.f31901b);
        arrayList.add(new ff.a(this.f31900a.g()));
        arrayList.add(new df.a(this.f31900a.r()));
        arrayList.add(new ef.a(this.f31900a));
        if (!this.f31905g) {
            arrayList.addAll(this.f31900a.s());
        }
        arrayList.add(new ff.b(this.f31905g));
        z d10 = new ff.g(arrayList, (ef.g) null, (c) null, (ef.c) null, 0, this.f31904f, this, this.f31903d, this.f31900a.d(), this.f31900a.D(), this.f31900a.H()).d(this.f31904f);
        if (!this.f31901b.e()) {
            return d10;
        }
        cf.c.g(d10);
        throw new IOException("Canceled");
    }

    public boolean f() {
        return this.f31901b.e();
    }

    public x h() {
        return this.f31904f;
    }

    /* access modifiers changed from: package-private */
    public String i() {
        return this.f31904f.h().z();
    }

    /* access modifiers changed from: package-private */
    public IOException j(IOException iOException) {
        if (!this.f31902c.n()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: package-private */
    public String k() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f() ? "canceled " : MaxReward.DEFAULT_LABEL);
        sb2.append(this.f31905g ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(i());
        return sb2.toString();
    }

    public void n(e eVar) {
        synchronized (this) {
            if (!this.f31906h) {
                this.f31906h = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        c();
        this.f31903d.c(this);
        this.f31900a.i().a(new b(eVar));
    }
}
