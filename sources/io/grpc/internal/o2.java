package io.grpc.internal;

import r6.o;

/* compiled from: TransportTracer */
public final class o2 {

    /* renamed from: l  reason: collision with root package name */
    private static final b f35224l = new b(l2.f35171a);

    /* renamed from: a  reason: collision with root package name */
    private final l2 f35225a;

    /* renamed from: b  reason: collision with root package name */
    private long f35226b;

    /* renamed from: c  reason: collision with root package name */
    private long f35227c;

    /* renamed from: d  reason: collision with root package name */
    private long f35228d;

    /* renamed from: e  reason: collision with root package name */
    private long f35229e;

    /* renamed from: f  reason: collision with root package name */
    private long f35230f;

    /* renamed from: g  reason: collision with root package name */
    private c f35231g;

    /* renamed from: h  reason: collision with root package name */
    private long f35232h;

    /* renamed from: i  reason: collision with root package name */
    private long f35233i;

    /* renamed from: j  reason: collision with root package name */
    private final e1 f35234j;

    /* renamed from: k  reason: collision with root package name */
    private volatile long f35235k;

    /* compiled from: TransportTracer */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final l2 f35236a;

        public b(l2 l2Var) {
            this.f35236a = l2Var;
        }

        public o2 a() {
            return new o2(this.f35236a);
        }
    }

    /* compiled from: TransportTracer */
    public interface c {
    }

    public static b a() {
        return f35224l;
    }

    public void b() {
        this.f35230f++;
    }

    public void c() {
        this.f35226b++;
        this.f35227c = this.f35225a.a();
    }

    public void d() {
        this.f35234j.a(1);
        this.f35235k = this.f35225a.a();
    }

    public void e(int i10) {
        if (i10 != 0) {
            this.f35232h += (long) i10;
            this.f35233i = this.f35225a.a();
        }
    }

    public void f(boolean z10) {
        if (z10) {
            this.f35228d++;
        } else {
            this.f35229e++;
        }
    }

    public void g(c cVar) {
        this.f35231g = (c) o.o(cVar);
    }

    public o2() {
        this.f35234j = f1.a();
        this.f35225a = l2.f35171a;
    }

    private o2(l2 l2Var) {
        this.f35234j = f1.a();
        this.f35225a = l2Var;
    }
}
