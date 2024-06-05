package bf;

import bf.q;
import java.io.Closeable;

/* compiled from: Response */
public final class z implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    final x f31925a;

    /* renamed from: b  reason: collision with root package name */
    final v f31926b;

    /* renamed from: c  reason: collision with root package name */
    final int f31927c;

    /* renamed from: d  reason: collision with root package name */
    final String f31928d;

    /* renamed from: f  reason: collision with root package name */
    final p f31929f;

    /* renamed from: g  reason: collision with root package name */
    final q f31930g;

    /* renamed from: h  reason: collision with root package name */
    final a0 f31931h;

    /* renamed from: i  reason: collision with root package name */
    final z f31932i;

    /* renamed from: j  reason: collision with root package name */
    final z f31933j;

    /* renamed from: k  reason: collision with root package name */
    final z f31934k;

    /* renamed from: l  reason: collision with root package name */
    final long f31935l;

    /* renamed from: m  reason: collision with root package name */
    final long f31936m;

    /* renamed from: n  reason: collision with root package name */
    private volatile c f31937n;

    z(a aVar) {
        this.f31925a = aVar.f31938a;
        this.f31926b = aVar.f31939b;
        this.f31927c = aVar.f31940c;
        this.f31928d = aVar.f31941d;
        this.f31929f = aVar.f31942e;
        this.f31930g = aVar.f31943f.d();
        this.f31931h = aVar.f31944g;
        this.f31932i = aVar.f31945h;
        this.f31933j = aVar.f31946i;
        this.f31934k = aVar.f31947j;
        this.f31935l = aVar.f31948k;
        this.f31936m = aVar.f31949l;
    }

    public q A() {
        return this.f31930g;
    }

    public a B() {
        return new a(this);
    }

    public z J() {
        return this.f31934k;
    }

    public v L() {
        return this.f31926b;
    }

    public long R() {
        return this.f31936m;
    }

    public x Z() {
        return this.f31925a;
    }

    public void close() {
        a0 a0Var = this.f31931h;
        if (a0Var != null) {
            a0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public long e0() {
        return this.f31935l;
    }

    public a0 h() {
        return this.f31931h;
    }

    public c i() {
        c cVar = this.f31937n;
        if (cVar != null) {
            return cVar;
        }
        c k10 = c.k(this.f31930g);
        this.f31937n = k10;
        return k10;
    }

    public int j() {
        return this.f31927c;
    }

    public p n() {
        return this.f31929f;
    }

    public String q(String str) {
        return u(str, (String) null);
    }

    public String toString() {
        return "Response{protocol=" + this.f31926b + ", code=" + this.f31927c + ", message=" + this.f31928d + ", url=" + this.f31925a.h() + '}';
    }

    public String u(String str, String str2) {
        String c10 = this.f31930g.c(str);
        return c10 != null ? c10 : str2;
    }

    /* compiled from: Response */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        x f31938a;

        /* renamed from: b  reason: collision with root package name */
        v f31939b;

        /* renamed from: c  reason: collision with root package name */
        int f31940c;

        /* renamed from: d  reason: collision with root package name */
        String f31941d;

        /* renamed from: e  reason: collision with root package name */
        p f31942e;

        /* renamed from: f  reason: collision with root package name */
        q.a f31943f;

        /* renamed from: g  reason: collision with root package name */
        a0 f31944g;

        /* renamed from: h  reason: collision with root package name */
        z f31945h;

        /* renamed from: i  reason: collision with root package name */
        z f31946i;

        /* renamed from: j  reason: collision with root package name */
        z f31947j;

        /* renamed from: k  reason: collision with root package name */
        long f31948k;

        /* renamed from: l  reason: collision with root package name */
        long f31949l;

        public a() {
            this.f31940c = -1;
            this.f31943f = new q.a();
        }

        private void e(z zVar) {
            if (zVar.f31931h != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private void f(String str, z zVar) {
            if (zVar.f31931h != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (zVar.f31932i != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (zVar.f31933j != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (zVar.f31934k != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        public a a(String str, String str2) {
            this.f31943f.a(str, str2);
            return this;
        }

        public a b(a0 a0Var) {
            this.f31944g = a0Var;
            return this;
        }

        public z c() {
            if (this.f31938a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f31939b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f31940c < 0) {
                throw new IllegalStateException("code < 0: " + this.f31940c);
            } else if (this.f31941d != null) {
                return new z(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public a d(z zVar) {
            if (zVar != null) {
                f("cacheResponse", zVar);
            }
            this.f31946i = zVar;
            return this;
        }

        public a g(int i10) {
            this.f31940c = i10;
            return this;
        }

        public a h(p pVar) {
            this.f31942e = pVar;
            return this;
        }

        public a i(String str, String str2) {
            this.f31943f.f(str, str2);
            return this;
        }

        public a j(q qVar) {
            this.f31943f = qVar.f();
            return this;
        }

        public a k(String str) {
            this.f31941d = str;
            return this;
        }

        public a l(z zVar) {
            if (zVar != null) {
                f("networkResponse", zVar);
            }
            this.f31945h = zVar;
            return this;
        }

        public a m(z zVar) {
            if (zVar != null) {
                e(zVar);
            }
            this.f31947j = zVar;
            return this;
        }

        public a n(v vVar) {
            this.f31939b = vVar;
            return this;
        }

        public a o(long j10) {
            this.f31949l = j10;
            return this;
        }

        public a p(x xVar) {
            this.f31938a = xVar;
            return this;
        }

        public a q(long j10) {
            this.f31948k = j10;
            return this;
        }

        a(z zVar) {
            this.f31940c = -1;
            this.f31938a = zVar.f31925a;
            this.f31939b = zVar.f31926b;
            this.f31940c = zVar.f31927c;
            this.f31941d = zVar.f31928d;
            this.f31942e = zVar.f31929f;
            this.f31943f = zVar.f31930g.f();
            this.f31944g = zVar.f31931h;
            this.f31945h = zVar.f31932i;
            this.f31946i = zVar.f31933j;
            this.f31947j = zVar.f31934k;
            this.f31948k = zVar.f31935l;
            this.f31949l = zVar.f31936m;
        }
    }
}
