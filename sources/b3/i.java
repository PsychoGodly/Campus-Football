package b3;

import java.io.IOException;
import k4.n0;
import n2.r1;
import s2.a0;
import s2.b0;
import s2.e0;
import s2.m;
import s2.n;

/* compiled from: StreamReader */
abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private final e f5500a = new e();

    /* renamed from: b  reason: collision with root package name */
    private e0 f5501b;

    /* renamed from: c  reason: collision with root package name */
    private n f5502c;

    /* renamed from: d  reason: collision with root package name */
    private g f5503d;

    /* renamed from: e  reason: collision with root package name */
    private long f5504e;

    /* renamed from: f  reason: collision with root package name */
    private long f5505f;

    /* renamed from: g  reason: collision with root package name */
    private long f5506g;

    /* renamed from: h  reason: collision with root package name */
    private int f5507h;

    /* renamed from: i  reason: collision with root package name */
    private int f5508i;

    /* renamed from: j  reason: collision with root package name */
    private b f5509j = new b();

    /* renamed from: k  reason: collision with root package name */
    private long f5510k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5511l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5512m;

    /* compiled from: StreamReader */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        r1 f5513a;

        /* renamed from: b  reason: collision with root package name */
        g f5514b;

        b() {
        }
    }

    /* compiled from: StreamReader */
    private static final class c implements g {
        private c() {
        }

        public long a(m mVar) {
            return -1;
        }

        public b0 b() {
            return new b0.b(-9223372036854775807L);
        }

        public void c(long j10) {
        }
    }

    private void a() {
        k4.a.h(this.f5501b);
        n0.j(this.f5502c);
    }

    private boolean i(m mVar) throws IOException {
        while (this.f5500a.d(mVar)) {
            this.f5510k = mVar.c() - this.f5505f;
            if (!h(this.f5500a.c(), this.f5505f, this.f5509j)) {
                return true;
            }
            this.f5505f = mVar.c();
        }
        this.f5507h = 3;
        return false;
    }

    private int j(m mVar) throws IOException {
        if (!i(mVar)) {
            return -1;
        }
        r1 r1Var = this.f5509j.f5513a;
        this.f5508i = r1Var.A;
        if (!this.f5512m) {
            this.f5501b.a(r1Var);
            this.f5512m = true;
        }
        g gVar = this.f5509j.f5514b;
        if (gVar != null) {
            this.f5503d = gVar;
        } else if (mVar.b() == -1) {
            this.f5503d = new c();
        } else {
            f b10 = this.f5500a.b();
            this.f5503d = new a(this, this.f5505f, mVar.b(), (long) (b10.f5493h + b10.f5494i), b10.f5488c, (b10.f5487b & 4) != 0);
        }
        this.f5507h = 2;
        this.f5500a.f();
        return 0;
    }

    private int k(m mVar, a0 a0Var) throws IOException {
        m mVar2 = mVar;
        long a10 = this.f5503d.a(mVar2);
        if (a10 >= 0) {
            a0Var.f22378a = a10;
            return 1;
        }
        if (a10 < -1) {
            e(-(a10 + 2));
        }
        if (!this.f5511l) {
            this.f5502c.j((b0) k4.a.h(this.f5503d.b()));
            this.f5511l = true;
        }
        if (this.f5510k > 0 || this.f5500a.d(mVar2)) {
            this.f5510k = 0;
            k4.a0 c10 = this.f5500a.c();
            long f10 = f(c10);
            if (f10 >= 0) {
                long j10 = this.f5506g;
                if (j10 + f10 >= this.f5504e) {
                    long b10 = b(j10);
                    this.f5501b.d(c10, c10.g());
                    this.f5501b.b(b10, 1, c10.g(), 0, (e0.a) null);
                    this.f5504e = -1;
                }
            }
            this.f5506g += f10;
            return 0;
        }
        this.f5507h = 3;
        return -1;
    }

    /* access modifiers changed from: protected */
    public long b(long j10) {
        return (j10 * 1000000) / ((long) this.f5508i);
    }

    /* access modifiers changed from: protected */
    public long c(long j10) {
        return (((long) this.f5508i) * j10) / 1000000;
    }

    /* access modifiers changed from: package-private */
    public void d(n nVar, e0 e0Var) {
        this.f5502c = nVar;
        this.f5501b = e0Var;
        l(true);
    }

    /* access modifiers changed from: protected */
    public void e(long j10) {
        this.f5506g = j10;
    }

    /* access modifiers changed from: protected */
    public abstract long f(k4.a0 a0Var);

    /* access modifiers changed from: package-private */
    public final int g(m mVar, a0 a0Var) throws IOException {
        a();
        int i10 = this.f5507h;
        if (i10 == 0) {
            return j(mVar);
        }
        if (i10 == 1) {
            mVar.m((int) this.f5505f);
            this.f5507h = 2;
            return 0;
        } else if (i10 == 2) {
            n0.j(this.f5503d);
            return k(mVar, a0Var);
        } else if (i10 == 3) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean h(k4.a0 a0Var, long j10, b bVar) throws IOException;

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        if (z10) {
            this.f5509j = new b();
            this.f5505f = 0;
            this.f5507h = 0;
        } else {
            this.f5507h = 1;
        }
        this.f5504e = -1;
        this.f5506g = 0;
    }

    /* access modifiers changed from: package-private */
    public final void m(long j10, long j11) {
        this.f5500a.e();
        if (j10 == 0) {
            l(!this.f5511l);
        } else if (this.f5507h != 0) {
            this.f5504e = c(j11);
            ((g) n0.j(this.f5503d)).c(this.f5504e);
            this.f5507h = 2;
        }
    }
}
