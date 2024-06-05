package p8;

import dd.c;
import dd.d;
import dd.z0;
import kd.b;

/* compiled from: FirestoreGrpc */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static volatile z0<d, e> f29587a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile z0<h, i> f29588b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile z0<w, x> f29589c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile z0<f0, g0> f29590d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile z0<s, t> f29591e;

    /* compiled from: FirestoreGrpc */
    class a implements b.a<b> {
        a() {
        }

        /* renamed from: b */
        public b a(d dVar, c cVar) {
            return new b(dVar, cVar, (a) null);
        }
    }

    /* compiled from: FirestoreGrpc */
    public static final class b extends kd.a<b> {
        /* synthetic */ b(d dVar, c cVar, a aVar) {
            this(dVar, cVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public b a(d dVar, c cVar) {
            return new b(dVar, cVar);
        }

        private b(d dVar, c cVar) {
            super(dVar, cVar);
        }
    }

    private r() {
    }

    public static z0<d, e> a() {
        z0<d, e> z0Var = f29587a;
        if (z0Var == null) {
            synchronized (r.class) {
                z0Var = f29587a;
                if (z0Var == null) {
                    z0Var = z0.g().f(z0.d.SERVER_STREAMING).b(z0.b("google.firestore.v1.Firestore", "BatchGetDocuments")).e(true).c(jd.b.b(d.j0())).d(jd.b.b(e.f0())).a();
                    f29587a = z0Var;
                }
            }
        }
        return z0Var;
    }

    public static z0<h, i> b() {
        z0<h, i> z0Var = f29588b;
        if (z0Var == null) {
            synchronized (r.class) {
                z0Var = f29588b;
                if (z0Var == null) {
                    z0Var = z0.g().f(z0.d.UNARY).b(z0.b("google.firestore.v1.Firestore", "Commit")).e(true).c(jd.b.b(h.j0())).d(jd.b.b(i.g0())).a();
                    f29588b = z0Var;
                }
            }
        }
        return z0Var;
    }

    public static z0<s, t> c() {
        z0<s, t> z0Var = f29591e;
        if (z0Var == null) {
            synchronized (r.class) {
                z0Var = f29591e;
                if (z0Var == null) {
                    z0Var = z0.g().f(z0.d.BIDI_STREAMING).b(z0.b("google.firestore.v1.Firestore", "Listen")).e(true).c(jd.b.b(s.j0())).d(jd.b.b(t.f0())).a();
                    f29591e = z0Var;
                }
            }
        }
        return z0Var;
    }

    public static z0<w, x> d() {
        z0<w, x> z0Var = f29589c;
        if (z0Var == null) {
            synchronized (r.class) {
                z0Var = f29589c;
                if (z0Var == null) {
                    z0Var = z0.g().f(z0.d.SERVER_STREAMING).b(z0.b("google.firestore.v1.Firestore", "RunAggregationQuery")).e(true).c(jd.b.b(w.h0())).d(jd.b.b(x.f0())).a();
                    f29589c = z0Var;
                }
            }
        }
        return z0Var;
    }

    public static z0<f0, g0> e() {
        z0<f0, g0> z0Var = f29590d;
        if (z0Var == null) {
            synchronized (r.class) {
                z0Var = f29590d;
                if (z0Var == null) {
                    z0Var = z0.g().f(z0.d.BIDI_STREAMING).b(z0.b("google.firestore.v1.Firestore", "Write")).e(true).c(jd.b.b(f0.k0())).d(jd.b.b(g0.g0())).a();
                    f29590d = z0Var;
                }
            }
        }
        return z0Var;
    }

    public static b f(d dVar) {
        return (b) kd.a.e(new a(), dVar);
    }
}
