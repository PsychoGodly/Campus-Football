package p3;

import i4.s;
import j4.b;
import java.io.IOException;
import k4.n0;
import n2.u3;
import p3.u;
import p3.x;

/* compiled from: MaskingMediaPeriod */
public final class r implements u, u.a {

    /* renamed from: a  reason: collision with root package name */
    public final x.b f21618a;

    /* renamed from: b  reason: collision with root package name */
    private final long f21619b;

    /* renamed from: c  reason: collision with root package name */
    private final b f21620c;

    /* renamed from: d  reason: collision with root package name */
    private x f21621d;

    /* renamed from: f  reason: collision with root package name */
    private u f21622f;

    /* renamed from: g  reason: collision with root package name */
    private u.a f21623g;

    /* renamed from: h  reason: collision with root package name */
    private a f21624h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f21625i;

    /* renamed from: j  reason: collision with root package name */
    private long f21626j = -9223372036854775807L;

    /* compiled from: MaskingMediaPeriod */
    public interface a {
        void a(x.b bVar, IOException iOException);

        void b(x.b bVar);
    }

    public r(x.b bVar, b bVar2, long j10) {
        this.f21618a = bVar;
        this.f21620c = bVar2;
        this.f21619b = j10;
    }

    private long o(long j10) {
        long j11 = this.f21626j;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    public void a(x.b bVar) {
        long o10 = o(this.f21619b);
        u a10 = ((x) k4.a.e(this.f21621d)).a(bVar, this.f21620c, o10);
        this.f21622f = a10;
        if (this.f21623g != null) {
            a10.h(this, o10);
        }
    }

    public long b() {
        return ((u) n0.j(this.f21622f)).b();
    }

    public boolean c(long j10) {
        u uVar = this.f21622f;
        return uVar != null && uVar.c(j10);
    }

    public long d(long j10, u3 u3Var) {
        return ((u) n0.j(this.f21622f)).d(j10, u3Var);
    }

    public void e(u uVar) {
        ((u.a) n0.j(this.f21623g)).e(this);
        a aVar = this.f21624h;
        if (aVar != null) {
            aVar.b(this.f21618a);
        }
    }

    public long f() {
        return ((u) n0.j(this.f21622f)).f();
    }

    public void g(long j10) {
        ((u) n0.j(this.f21622f)).g(j10);
    }

    public void h(u.a aVar, long j10) {
        this.f21623g = aVar;
        u uVar = this.f21622f;
        if (uVar != null) {
            uVar.h(this, o(this.f21619b));
        }
    }

    public boolean isLoading() {
        u uVar = this.f21622f;
        return uVar != null && uVar.isLoading();
    }

    public long k() {
        return this.f21626j;
    }

    public long l() {
        return this.f21619b;
    }

    public void m() throws IOException {
        try {
            u uVar = this.f21622f;
            if (uVar != null) {
                uVar.m();
                return;
            }
            x xVar = this.f21621d;
            if (xVar != null) {
                xVar.h();
            }
        } catch (IOException e10) {
            a aVar = this.f21624h;
            if (aVar == null) {
                throw e10;
            } else if (!this.f21625i) {
                this.f21625i = true;
                aVar.a(this.f21618a, e10);
            }
        }
    }

    public long n(long j10) {
        return ((u) n0.j(this.f21622f)).n(j10);
    }

    public long p(s[] sVarArr, boolean[] zArr, q0[] q0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f21626j;
        if (j12 == -9223372036854775807L || j10 != this.f21619b) {
            j11 = j10;
        } else {
            this.f21626j = -9223372036854775807L;
            j11 = j12;
        }
        return ((u) n0.j(this.f21622f)).p(sVarArr, zArr, q0VarArr, zArr2, j11);
    }

    /* renamed from: q */
    public void j(u uVar) {
        ((u.a) n0.j(this.f21623g)).j(this);
    }

    public long r() {
        return ((u) n0.j(this.f21622f)).r();
    }

    public z0 s() {
        return ((u) n0.j(this.f21622f)).s();
    }

    public void t(long j10, boolean z10) {
        ((u) n0.j(this.f21622f)).t(j10, z10);
    }

    public void u(long j10) {
        this.f21626j = j10;
    }

    public void v() {
        if (this.f21622f != null) {
            ((x) k4.a.e(this.f21621d)).b(this.f21622f);
        }
    }

    public void w(x xVar) {
        k4.a.f(this.f21621d == null);
        this.f21621d = xVar;
    }
}
