package c3;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import k4.a0;
import k4.j0;
import k4.n0;
import k4.r;
import s2.m;

/* compiled from: PsDurationReader */
final class y {

    /* renamed from: a  reason: collision with root package name */
    private final j0 f5970a = new j0(0);

    /* renamed from: b  reason: collision with root package name */
    private final a0 f5971b = new a0();

    /* renamed from: c  reason: collision with root package name */
    private boolean f5972c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5973d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5974e;

    /* renamed from: f  reason: collision with root package name */
    private long f5975f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    private long f5976g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f5977h = -9223372036854775807L;

    y() {
    }

    private static boolean a(byte[] bArr) {
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return true;
        }
        return false;
    }

    private int b(m mVar) {
        this.f5971b.Q(n0.f19743f);
        this.f5972c = true;
        mVar.l();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << Ascii.CAN) | ((bArr[i10 + 1] & 255) << Ascii.DLE) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int h(m mVar, s2.a0 a0Var) throws IOException {
        int min = (int) Math.min(20000, mVar.b());
        long j10 = (long) 0;
        if (mVar.c() != j10) {
            a0Var.f22378a = j10;
            return 1;
        }
        this.f5971b.P(min);
        mVar.l();
        mVar.p(this.f5971b.e(), 0, min);
        this.f5975f = i(this.f5971b);
        this.f5973d = true;
        return 0;
    }

    private long i(a0 a0Var) {
        int g10 = a0Var.g();
        for (int f10 = a0Var.f(); f10 < g10 - 3; f10++) {
            if (f(a0Var.e(), f10) == 442) {
                a0Var.T(f10 + 4);
                long l10 = l(a0Var);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(m mVar, s2.a0 a0Var) throws IOException {
        long b10 = mVar.b();
        int min = (int) Math.min(20000, b10);
        long j10 = b10 - ((long) min);
        if (mVar.c() != j10) {
            a0Var.f22378a = j10;
            return 1;
        }
        this.f5971b.P(min);
        mVar.l();
        mVar.p(this.f5971b.e(), 0, min);
        this.f5976g = k(this.f5971b);
        this.f5974e = true;
        return 0;
    }

    private long k(a0 a0Var) {
        int f10 = a0Var.f();
        for (int g10 = a0Var.g() - 4; g10 >= f10; g10--) {
            if (f(a0Var.e(), g10) == 442) {
                a0Var.T(g10 + 4);
                long l10 = l(a0Var);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(a0 a0Var) {
        int f10 = a0Var.f();
        if (a0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        a0Var.l(bArr, 0, 9);
        a0Var.T(f10);
        if (!a(bArr)) {
            return -9223372036854775807L;
        }
        return m(bArr);
    }

    private static long m(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long c() {
        return this.f5977h;
    }

    public j0 d() {
        return this.f5970a;
    }

    public boolean e() {
        return this.f5972c;
    }

    public int g(m mVar, s2.a0 a0Var) throws IOException {
        if (!this.f5974e) {
            return j(mVar, a0Var);
        }
        if (this.f5976g == -9223372036854775807L) {
            return b(mVar);
        }
        if (!this.f5973d) {
            return h(mVar, a0Var);
        }
        long j10 = this.f5975f;
        if (j10 == -9223372036854775807L) {
            return b(mVar);
        }
        long b10 = this.f5970a.b(this.f5976g) - this.f5970a.b(j10);
        this.f5977h = b10;
        if (b10 < 0) {
            r.i("PsDurationReader", "Invalid duration: " + this.f5977h + ". Using TIME_UNSET instead.");
            this.f5977h = -9223372036854775807L;
        }
        return b(mVar);
    }
}
