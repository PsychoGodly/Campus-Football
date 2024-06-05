package io.grpc.internal;

import dd.b;
import dd.c;
import dd.j1;
import dd.k;
import dd.r;
import dd.y0;
import dd.z0;
import r6.o;

/* compiled from: MetadataApplierImpl */
final class n1 extends b.a {

    /* renamed from: a  reason: collision with root package name */
    private final s f35202a;

    /* renamed from: b  reason: collision with root package name */
    private final z0<?, ?> f35203b;

    /* renamed from: c  reason: collision with root package name */
    private final y0 f35204c;

    /* renamed from: d  reason: collision with root package name */
    private final c f35205d;

    /* renamed from: e  reason: collision with root package name */
    private final r f35206e;

    /* renamed from: f  reason: collision with root package name */
    private final a f35207f;

    /* renamed from: g  reason: collision with root package name */
    private final k[] f35208g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f35209h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private q f35210i;

    /* renamed from: j  reason: collision with root package name */
    boolean f35211j;

    /* renamed from: k  reason: collision with root package name */
    b0 f35212k;

    /* compiled from: MetadataApplierImpl */
    public interface a {
        void a();
    }

    n1(s sVar, z0<?, ?> z0Var, y0 y0Var, c cVar, a aVar, k[] kVarArr) {
        this.f35202a = sVar;
        this.f35203b = z0Var;
        this.f35204c = y0Var;
        this.f35205d = cVar;
        this.f35206e = r.e();
        this.f35207f = aVar;
        this.f35208g = kVarArr;
    }

    private void c(q qVar) {
        boolean z10;
        boolean z11 = true;
        o.v(!this.f35211j, "already finalized");
        this.f35211j = true;
        synchronized (this.f35209h) {
            if (this.f35210i == null) {
                this.f35210i = qVar;
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            this.f35207f.a();
            return;
        }
        if (this.f35212k == null) {
            z11 = false;
        }
        o.v(z11, "delayedStream is null");
        Runnable w10 = this.f35212k.w(qVar);
        if (w10 != null) {
            w10.run();
        }
        this.f35207f.a();
    }

    /* JADX INFO: finally extract failed */
    public void a(y0 y0Var) {
        o.v(!this.f35211j, "apply() or fail() already called");
        o.p(y0Var, "headers");
        this.f35204c.m(y0Var);
        r b10 = this.f35206e.b();
        try {
            q c10 = this.f35202a.c(this.f35203b, this.f35204c, this.f35205d, this.f35208g);
            this.f35206e.f(b10);
            c(c10);
        } catch (Throwable th) {
            this.f35206e.f(b10);
            throw th;
        }
    }

    public void b(j1 j1Var) {
        o.e(!j1Var.o(), "Cannot fail with OK status");
        o.v(!this.f35211j, "apply() or fail() already called");
        c(new f0(r0.n(j1Var), this.f35208g));
    }

    /* access modifiers changed from: package-private */
    public q d() {
        synchronized (this.f35209h) {
            q qVar = this.f35210i;
            if (qVar != null) {
                return qVar;
            }
            b0 b0Var = new b0();
            this.f35212k = b0Var;
            this.f35210i = b0Var;
            return b0Var;
        }
    }
}
