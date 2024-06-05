package c3;

import java.io.IOException;
import k4.a0;
import k4.j0;
import k4.n0;
import k4.r;
import s2.m;

/* compiled from: TsDurationReader */
final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f5679a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f5680b = new j0(0);

    /* renamed from: c  reason: collision with root package name */
    private final a0 f5681c = new a0();

    /* renamed from: d  reason: collision with root package name */
    private boolean f5682d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5683e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5684f;

    /* renamed from: g  reason: collision with root package name */
    private long f5685g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f5686h = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    private long f5687i = -9223372036854775807L;

    f0(int i10) {
        this.f5679a = i10;
    }

    private int a(m mVar) {
        this.f5681c.Q(n0.f19743f);
        this.f5682d = true;
        mVar.l();
        return 0;
    }

    private int f(m mVar, s2.a0 a0Var, int i10) throws IOException {
        int min = (int) Math.min((long) this.f5679a, mVar.b());
        long j10 = (long) 0;
        if (mVar.c() != j10) {
            a0Var.f22378a = j10;
            return 1;
        }
        this.f5681c.P(min);
        mVar.l();
        mVar.p(this.f5681c.e(), 0, min);
        this.f5685g = g(this.f5681c, i10);
        this.f5683e = true;
        return 0;
    }

    private long g(a0 a0Var, int i10) {
        int g10 = a0Var.g();
        for (int f10 = a0Var.f(); f10 < g10; f10++) {
            if (a0Var.e()[f10] == 71) {
                long c10 = j0.c(a0Var, f10, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(m mVar, s2.a0 a0Var, int i10) throws IOException {
        long b10 = mVar.b();
        int min = (int) Math.min((long) this.f5679a, b10);
        long j10 = b10 - ((long) min);
        if (mVar.c() != j10) {
            a0Var.f22378a = j10;
            return 1;
        }
        this.f5681c.P(min);
        mVar.l();
        mVar.p(this.f5681c.e(), 0, min);
        this.f5686h = i(this.f5681c, i10);
        this.f5684f = true;
        return 0;
    }

    private long i(a0 a0Var, int i10) {
        int f10 = a0Var.f();
        int g10 = a0Var.g();
        for (int i11 = g10 - 188; i11 >= f10; i11--) {
            if (j0.b(a0Var.e(), f10, g10, i11)) {
                long c10 = j0.c(a0Var, i11, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f5687i;
    }

    public j0 c() {
        return this.f5680b;
    }

    public boolean d() {
        return this.f5682d;
    }

    public int e(m mVar, s2.a0 a0Var, int i10) throws IOException {
        if (i10 <= 0) {
            return a(mVar);
        }
        if (!this.f5684f) {
            return h(mVar, a0Var, i10);
        }
        if (this.f5686h == -9223372036854775807L) {
            return a(mVar);
        }
        if (!this.f5683e) {
            return f(mVar, a0Var, i10);
        }
        long j10 = this.f5685g;
        if (j10 == -9223372036854775807L) {
            return a(mVar);
        }
        long b10 = this.f5680b.b(this.f5686h) - this.f5680b.b(j10);
        this.f5687i = b10;
        if (b10 < 0) {
            r.i("TsDurationReader", "Invalid duration: " + this.f5687i + ". Using TIME_UNSET instead.");
            this.f5687i = -9223372036854775807L;
        }
        return a(mVar);
    }
}
