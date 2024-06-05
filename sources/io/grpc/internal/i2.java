package io.grpc.internal;

import dd.a;
import dd.j1;
import dd.k;
import dd.m1;
import dd.y0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: StatsTraceContext */
public final class i2 {

    /* renamed from: c  reason: collision with root package name */
    public static final i2 f35103c = new i2(new m1[0]);

    /* renamed from: a  reason: collision with root package name */
    private final m1[] f35104a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f35105b = new AtomicBoolean(false);

    i2(m1[] m1VarArr) {
        this.f35104a = m1VarArr;
    }

    public static i2 h(k[] kVarArr, a aVar, y0 y0Var) {
        i2 i2Var = new i2(kVarArr);
        for (k m10 : kVarArr) {
            m10.m(aVar, y0Var);
        }
        return i2Var;
    }

    public void a() {
        for (m1 m1Var : this.f35104a) {
            ((k) m1Var).j();
        }
    }

    public void b(y0 y0Var) {
        for (m1 m1Var : this.f35104a) {
            ((k) m1Var).k(y0Var);
        }
    }

    public void c() {
        for (m1 m1Var : this.f35104a) {
            ((k) m1Var).l();
        }
    }

    public void d(int i10) {
        for (m1 a10 : this.f35104a) {
            a10.a(i10);
        }
    }

    public void e(int i10, long j10, long j11) {
        for (m1 b10 : this.f35104a) {
            b10.b(i10, j10, j11);
        }
    }

    public void f(long j10) {
        for (m1 c10 : this.f35104a) {
            c10.c(j10);
        }
    }

    public void g(long j10) {
        for (m1 d10 : this.f35104a) {
            d10.d(j10);
        }
    }

    public void i(int i10) {
        for (m1 e10 : this.f35104a) {
            e10.e(i10);
        }
    }

    public void j(int i10, long j10, long j11) {
        for (m1 f10 : this.f35104a) {
            f10.f(i10, j10, j11);
        }
    }

    public void k(long j10) {
        for (m1 g10 : this.f35104a) {
            g10.g(j10);
        }
    }

    public void l(long j10) {
        for (m1 h10 : this.f35104a) {
            h10.h(j10);
        }
    }

    public void m(j1 j1Var) {
        if (this.f35105b.compareAndSet(false, true)) {
            for (m1 i10 : this.f35104a) {
                i10.i(j1Var);
            }
        }
    }
}
