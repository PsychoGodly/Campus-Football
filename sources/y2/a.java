package y2;

import com.applovin.mediation.MaxReward;
import java.io.IOException;
import java.util.ArrayDeque;
import n2.y2;
import s2.m;

/* compiled from: DefaultEbmlReader */
final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f23743a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<b> f23744b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private final g f23745c = new g();

    /* renamed from: d  reason: collision with root package name */
    private b f23746d;

    /* renamed from: e  reason: collision with root package name */
    private int f23747e;

    /* renamed from: f  reason: collision with root package name */
    private int f23748f;

    /* renamed from: g  reason: collision with root package name */
    private long f23749g;

    /* compiled from: DefaultEbmlReader */
    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f23750a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f23751b;

        private b(int i10, long j10) {
            this.f23750a = i10;
            this.f23751b = j10;
        }
    }

    private long c(m mVar) throws IOException {
        mVar.l();
        while (true) {
            mVar.p(this.f23743a, 0, 4);
            int c10 = g.c(this.f23743a[0]);
            if (c10 != -1 && c10 <= 4) {
                int a10 = (int) g.a(this.f23743a, c10, false);
                if (this.f23746d.c(a10)) {
                    mVar.m(c10);
                    return (long) a10;
                }
            }
            mVar.m(1);
        }
    }

    private double d(m mVar, int i10) throws IOException {
        long e10 = e(mVar, i10);
        if (i10 == 4) {
            return (double) Float.intBitsToFloat((int) e10);
        }
        return Double.longBitsToDouble(e10);
    }

    private long e(m mVar, int i10) throws IOException {
        mVar.readFully(this.f23743a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f23743a[i11] & 255));
        }
        return j10;
    }

    private static String f(m mVar, int i10) throws IOException {
        if (i10 == 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        byte[] bArr = new byte[i10];
        mVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    public boolean a(m mVar) throws IOException {
        k4.a.h(this.f23746d);
        while (true) {
            b peek = this.f23744b.peek();
            if (peek == null || mVar.c() < peek.f23751b) {
                if (this.f23747e == 0) {
                    long d10 = this.f23745c.d(mVar, true, false, 4);
                    if (d10 == -2) {
                        d10 = c(mVar);
                    }
                    if (d10 == -1) {
                        return false;
                    }
                    this.f23748f = (int) d10;
                    this.f23747e = 1;
                }
                if (this.f23747e == 1) {
                    this.f23749g = this.f23745c.d(mVar, false, true, 8);
                    this.f23747e = 2;
                }
                int b10 = this.f23746d.b(this.f23748f);
                if (b10 == 0) {
                    mVar.m((int) this.f23749g);
                    this.f23747e = 0;
                } else if (b10 == 1) {
                    long c10 = mVar.c();
                    this.f23744b.push(new b(this.f23748f, this.f23749g + c10));
                    this.f23746d.g(this.f23748f, c10, this.f23749g);
                    this.f23747e = 0;
                    return true;
                } else if (b10 == 2) {
                    long j10 = this.f23749g;
                    if (j10 <= 8) {
                        this.f23746d.h(this.f23748f, e(mVar, (int) j10));
                        this.f23747e = 0;
                        return true;
                    }
                    throw y2.a("Invalid integer size: " + this.f23749g, (Throwable) null);
                } else if (b10 == 3) {
                    long j11 = this.f23749g;
                    if (j11 <= 2147483647L) {
                        this.f23746d.e(this.f23748f, f(mVar, (int) j11));
                        this.f23747e = 0;
                        return true;
                    }
                    throw y2.a("String element size: " + this.f23749g, (Throwable) null);
                } else if (b10 == 4) {
                    this.f23746d.d(this.f23748f, (int) this.f23749g, mVar);
                    this.f23747e = 0;
                    return true;
                } else if (b10 == 5) {
                    long j12 = this.f23749g;
                    if (j12 == 4 || j12 == 8) {
                        this.f23746d.f(this.f23748f, d(mVar, (int) j12));
                        this.f23747e = 0;
                        return true;
                    }
                    throw y2.a("Invalid float size: " + this.f23749g, (Throwable) null);
                } else {
                    throw y2.a("Invalid element type " + b10, (Throwable) null);
                }
            } else {
                this.f23746d.a(this.f23744b.pop().f23750a);
                return true;
            }
        }
    }

    public void b(b bVar) {
        this.f23746d = bVar;
    }

    public void reset() {
        this.f23747e = 0;
        this.f23744b.clear();
        this.f23745c.e();
    }
}
