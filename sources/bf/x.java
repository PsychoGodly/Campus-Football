package bf;

import bf.q;
import cf.c;
import ff.f;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: Request */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    final r f31910a;

    /* renamed from: b  reason: collision with root package name */
    final String f31911b;

    /* renamed from: c  reason: collision with root package name */
    final q f31912c;

    /* renamed from: d  reason: collision with root package name */
    final y f31913d;

    /* renamed from: e  reason: collision with root package name */
    final Map<Class<?>, Object> f31914e;

    /* renamed from: f  reason: collision with root package name */
    private volatile c f31915f;

    x(a aVar) {
        this.f31910a = aVar.f31916a;
        this.f31911b = aVar.f31917b;
        this.f31912c = aVar.f31918c.d();
        this.f31913d = aVar.f31919d;
        this.f31914e = c.v(aVar.f31920e);
    }

    public y a() {
        return this.f31913d;
    }

    public c b() {
        c cVar = this.f31915f;
        if (cVar != null) {
            return cVar;
        }
        c k10 = c.k(this.f31912c);
        this.f31915f = k10;
        return k10;
    }

    public String c(String str) {
        return this.f31912c.c(str);
    }

    public q d() {
        return this.f31912c;
    }

    public boolean e() {
        return this.f31910a.m();
    }

    public String f() {
        return this.f31911b;
    }

    public a g() {
        return new a(this);
    }

    public r h() {
        return this.f31910a;
    }

    public String toString() {
        return "Request{method=" + this.f31911b + ", url=" + this.f31910a + ", tags=" + this.f31914e + '}';
    }

    /* compiled from: Request */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        r f31916a;

        /* renamed from: b  reason: collision with root package name */
        String f31917b;

        /* renamed from: c  reason: collision with root package name */
        q.a f31918c;

        /* renamed from: d  reason: collision with root package name */
        y f31919d;

        /* renamed from: e  reason: collision with root package name */
        Map<Class<?>, Object> f31920e;

        public a() {
            this.f31920e = Collections.emptyMap();
            this.f31917b = "GET";
            this.f31918c = new q.a();
        }

        public x a() {
            if (this.f31916a != null) {
                return new x(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b(String str, String str2) {
            this.f31918c.f(str, str2);
            return this;
        }

        public a c(q qVar) {
            this.f31918c = qVar.f();
            return this;
        }

        public a d(String str, y yVar) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (yVar != null && !f.b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (yVar != null || !f.e(str)) {
                this.f31917b = str;
                this.f31919d = yVar;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        public a e(String str) {
            this.f31918c.e(str);
            return this;
        }

        public a f(r rVar) {
            Objects.requireNonNull(rVar, "url == null");
            this.f31916a = rVar;
            return this;
        }

        public a g(String str) {
            Objects.requireNonNull(str, "url == null");
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str = "https:" + str.substring(4);
            }
            return f(r.k(str));
        }

        a(x xVar) {
            Map<Class<?>, Object> map;
            this.f31920e = Collections.emptyMap();
            this.f31916a = xVar.f31910a;
            this.f31917b = xVar.f31911b;
            this.f31919d = xVar.f31913d;
            if (xVar.f31914e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(xVar.f31914e);
            }
            this.f31920e = map;
            this.f31918c = xVar.f31912c.f();
        }
    }
}
