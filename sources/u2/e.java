package u2;

import java.io.IOException;
import java.util.Arrays;
import k4.a;
import k4.n0;
import s2.b0;
import s2.c0;
import s2.e0;
import s2.m;

/* compiled from: ChunkReader */
final class e {

    /* renamed from: a  reason: collision with root package name */
    protected final e0 f22824a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22825b;

    /* renamed from: c  reason: collision with root package name */
    private final int f22826c;

    /* renamed from: d  reason: collision with root package name */
    private final long f22827d;

    /* renamed from: e  reason: collision with root package name */
    private final int f22828e;

    /* renamed from: f  reason: collision with root package name */
    private int f22829f;

    /* renamed from: g  reason: collision with root package name */
    private int f22830g;

    /* renamed from: h  reason: collision with root package name */
    private int f22831h;

    /* renamed from: i  reason: collision with root package name */
    private int f22832i;

    /* renamed from: j  reason: collision with root package name */
    private int f22833j;

    /* renamed from: k  reason: collision with root package name */
    private long[] f22834k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f22835l;

    public e(int i10, int i11, long j10, int i12, e0 e0Var) {
        boolean z10 = true;
        if (!(i11 == 1 || i11 == 2)) {
            z10 = false;
        }
        a.a(z10);
        this.f22827d = j10;
        this.f22828e = i12;
        this.f22824a = e0Var;
        this.f22825b = d(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f22826c = i11 == 2 ? d(i10, 1650720768) : -1;
        this.f22834k = new long[512];
        this.f22835l = new int[512];
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f22827d * ((long) i10)) / ((long) this.f22828e);
    }

    private c0 h(int i10) {
        return new c0(((long) this.f22835l[i10]) * g(), this.f22834k[i10]);
    }

    public void a() {
        this.f22831h++;
    }

    public void b(long j10) {
        if (this.f22833j == this.f22835l.length) {
            long[] jArr = this.f22834k;
            this.f22834k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f22835l;
            this.f22835l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f22834k;
        int i10 = this.f22833j;
        jArr2[i10] = j10;
        this.f22835l[i10] = this.f22832i;
        this.f22833j = i10 + 1;
    }

    public void c() {
        this.f22834k = Arrays.copyOf(this.f22834k, this.f22833j);
        this.f22835l = Arrays.copyOf(this.f22835l, this.f22833j);
    }

    public long f() {
        return e(this.f22831h);
    }

    public long g() {
        return e(1);
    }

    public b0.a i(long j10) {
        int g10 = (int) (j10 / g());
        int h10 = n0.h(this.f22835l, g10, true, true);
        if (this.f22835l[h10] == g10) {
            return new b0.a(h(h10));
        }
        c0 h11 = h(h10);
        int i10 = h10 + 1;
        if (i10 < this.f22834k.length) {
            return new b0.a(h11, h(i10));
        }
        return new b0.a(h11);
    }

    public boolean j(int i10) {
        return this.f22825b == i10 || this.f22826c == i10;
    }

    public void k() {
        this.f22832i++;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f22835l, this.f22831h) >= 0;
    }

    public boolean m(m mVar) throws IOException {
        int i10 = this.f22830g;
        boolean z10 = false;
        int e10 = i10 - this.f22824a.e(mVar, i10, false);
        this.f22830g = e10;
        if (e10 == 0) {
            z10 = true;
        }
        if (z10) {
            if (this.f22829f > 0) {
                e0 e0Var = this.f22824a;
                long f10 = f();
                boolean l10 = l();
                e0Var.b(f10, l10 ? 1 : 0, this.f22829f, 0, (e0.a) null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f22829f = i10;
        this.f22830g = i10;
    }

    public void o(long j10) {
        if (this.f22833j == 0) {
            this.f22831h = 0;
            return;
        }
        this.f22831h = this.f22835l[n0.i(this.f22834k, j10, true, true)];
    }
}
