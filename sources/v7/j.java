package v7;

import p8.d0;
import u7.z;
import y6.q;
import y7.b;

/* compiled from: NumericIncrementTransformOperation */
public class j implements p {

    /* renamed from: a  reason: collision with root package name */
    private d0 f30714a;

    public j(d0 d0Var) {
        b.d(z.A(d0Var), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
        this.f30714a = d0Var;
    }

    private double e() {
        if (z.u(this.f30714a)) {
            return this.f30714a.u0();
        }
        if (z.v(this.f30714a)) {
            return (double) this.f30714a.w0();
        }
        throw b.a("Expected 'operand' to be of Number type, but was " + this.f30714a.getClass().getCanonicalName(), new Object[0]);
    }

    private long f() {
        if (z.u(this.f30714a)) {
            return (long) this.f30714a.u0();
        }
        if (z.v(this.f30714a)) {
            return this.f30714a.w0();
        }
        throw b.a("Expected 'operand' to be of Number type, but was " + this.f30714a.getClass().getCanonicalName(), new Object[0]);
    }

    private long g(long j10, long j11) {
        long j12 = j10 + j11;
        return ((j10 ^ j12) & (j11 ^ j12)) >= 0 ? j12 : j12 >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    public d0 a(d0 d0Var, d0 d0Var2) {
        return d0Var2;
    }

    public d0 b(d0 d0Var, q qVar) {
        d0 c10 = c(d0Var);
        if (z.v(c10) && z.v(this.f30714a)) {
            return (d0) d0.C0().M(g(c10.w0(), f())).build();
        } else if (z.v(c10)) {
            return (d0) d0.C0().K(((double) c10.w0()) + e()).build();
        } else {
            b.d(z.u(c10), "Expected NumberValue to be of type DoubleValue, but was ", d0Var.getClass().getCanonicalName());
            return (d0) d0.C0().K(c10.u0() + e()).build();
        }
    }

    public d0 c(d0 d0Var) {
        return z.A(d0Var) ? d0Var : (d0) d0.C0().M(0).build();
    }

    public d0 d() {
        return this.f30714a;
    }
}
