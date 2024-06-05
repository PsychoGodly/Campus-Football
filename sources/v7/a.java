package v7;

import java.util.Collections;
import java.util.List;
import p8.b;
import p8.d0;
import u7.z;
import y6.q;

/* compiled from: ArrayTransformOperation */
public abstract class a implements p {

    /* renamed from: a  reason: collision with root package name */
    private final List<d0> f30693a;

    /* renamed from: v7.a$a  reason: collision with other inner class name */
    /* compiled from: ArrayTransformOperation */
    public static class C0345a extends a {
        public C0345a(List<d0> list) {
            super(list);
        }

        /* access modifiers changed from: protected */
        public d0 d(d0 d0Var) {
            b.C0323b e10 = a.e(d0Var);
            for (d0 next : f()) {
                int i10 = 0;
                while (i10 < e10.I()) {
                    if (z.q(e10.H(i10), next)) {
                        e10.J(i10);
                    } else {
                        i10++;
                    }
                }
            }
            return (d0) d0.C0().G(e10).build();
        }
    }

    /* compiled from: ArrayTransformOperation */
    public static class b extends a {
        public b(List<d0> list) {
            super(list);
        }

        /* access modifiers changed from: protected */
        public d0 d(d0 d0Var) {
            b.C0323b e10 = a.e(d0Var);
            for (d0 next : f()) {
                if (!z.p(e10, next)) {
                    e10.G(next);
                }
            }
            return (d0) d0.C0().G(e10).build();
        }
    }

    a(List<d0> list) {
        this.f30693a = Collections.unmodifiableList(list);
    }

    static b.C0323b e(d0 d0Var) {
        if (z.t(d0Var)) {
            return (b.C0323b) d0Var.q0().b();
        }
        return p8.b.o0();
    }

    public d0 a(d0 d0Var, d0 d0Var2) {
        return d(d0Var);
    }

    public d0 b(d0 d0Var, q qVar) {
        return d(d0Var);
    }

    public d0 c(d0 d0Var) {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract d0 d(d0 d0Var);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f30693a.equals(((a) obj).f30693a);
    }

    public List<d0> f() {
        return this.f30693a;
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + this.f30693a.hashCode();
    }
}
