package t2;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import k4.a;
import k4.n0;
import n2.r1;
import n2.y2;
import s2.a0;
import s2.b0;
import s2.e;
import s2.e0;
import s2.l;
import s2.m;
import s2.n;
import s2.r;

/* compiled from: AmrExtractor */
public final class b implements l {

    /* renamed from: p  reason: collision with root package name */
    public static final r f22555p = a.f38375b;

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f22556q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f22557r;

    /* renamed from: s  reason: collision with root package name */
    private static final byte[] f22558s = n0.m0("#!AMR\n");

    /* renamed from: t  reason: collision with root package name */
    private static final byte[] f22559t = n0.m0("#!AMR-WB\n");

    /* renamed from: u  reason: collision with root package name */
    private static final int f22560u;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f22561a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22562b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f22563c;

    /* renamed from: d  reason: collision with root package name */
    private long f22564d;

    /* renamed from: e  reason: collision with root package name */
    private int f22565e;

    /* renamed from: f  reason: collision with root package name */
    private int f22566f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f22567g;

    /* renamed from: h  reason: collision with root package name */
    private long f22568h;

    /* renamed from: i  reason: collision with root package name */
    private int f22569i;

    /* renamed from: j  reason: collision with root package name */
    private int f22570j;

    /* renamed from: k  reason: collision with root package name */
    private long f22571k;

    /* renamed from: l  reason: collision with root package name */
    private n f22572l;

    /* renamed from: m  reason: collision with root package name */
    private e0 f22573m;

    /* renamed from: n  reason: collision with root package name */
    private b0 f22574n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f22575o;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f22557r = iArr;
        f22560u = iArr[8];
    }

    public b() {
        this(0);
    }

    private void d() {
        a.h(this.f22573m);
        n0.j(this.f22572l);
    }

    private static int f(int i10, long j10) {
        return (int) (((((long) i10) * 8) * 1000000) / j10);
    }

    private b0 h(long j10, boolean z10) {
        return new e(j10, this.f22568h, f(this.f22569i, 20000), this.f22569i, z10);
    }

    private int i(int i10) throws y2 {
        if (k(i10)) {
            return this.f22563c ? f22557r[i10] : f22556q[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f22563c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw y2.a(sb2.toString(), (Throwable) null);
    }

    private boolean j(int i10) {
        return !this.f22563c && (i10 < 12 || i10 > 14);
    }

    private boolean k(int i10) {
        return i10 >= 0 && i10 <= 15 && (l(i10) || j(i10));
    }

    private boolean l(int i10) {
        return this.f22563c && (i10 < 10 || i10 > 13);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ l[] m() {
        return new l[]{new b()};
    }

    private void n() {
        if (!this.f22575o) {
            this.f22575o = true;
            boolean z10 = this.f22563c;
            this.f22573m.a(new r1.b().g0(z10 ? "audio/amr-wb" : "audio/3gpp").Y(f22560u).J(1).h0(z10 ? 16000 : 8000).G());
        }
    }

    private void o(long j10, int i10) {
        int i11;
        if (!this.f22567g) {
            int i12 = this.f22562b;
            if ((i12 & 1) == 0 || j10 == -1 || !((i11 = this.f22569i) == -1 || i11 == this.f22565e)) {
                b0.b bVar = new b0.b(-9223372036854775807L);
                this.f22574n = bVar;
                this.f22572l.j(bVar);
                this.f22567g = true;
            } else if (this.f22570j >= 20 || i10 == -1) {
                b0 h10 = h(j10, (i12 & 2) != 0);
                this.f22574n = h10;
                this.f22572l.j(h10);
                this.f22567g = true;
            }
        }
    }

    private static boolean p(m mVar, byte[] bArr) throws IOException {
        mVar.l();
        byte[] bArr2 = new byte[bArr.length];
        mVar.p(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int q(m mVar) throws IOException {
        mVar.l();
        mVar.p(this.f22561a, 0, 1);
        byte b10 = this.f22561a[0];
        if ((b10 & 131) <= 0) {
            return i((b10 >> 3) & 15);
        }
        throw y2.a("Invalid padding bits for frame header " + b10, (Throwable) null);
    }

    private boolean r(m mVar) throws IOException {
        byte[] bArr = f22558s;
        if (p(mVar, bArr)) {
            this.f22563c = false;
            mVar.m(bArr.length);
            return true;
        }
        byte[] bArr2 = f22559t;
        if (!p(mVar, bArr2)) {
            return false;
        }
        this.f22563c = true;
        mVar.m(bArr2.length);
        return true;
    }

    private int s(m mVar) throws IOException {
        if (this.f22566f == 0) {
            try {
                int q10 = q(mVar);
                this.f22565e = q10;
                this.f22566f = q10;
                if (this.f22569i == -1) {
                    this.f22568h = mVar.c();
                    this.f22569i = this.f22565e;
                }
                if (this.f22569i == this.f22565e) {
                    this.f22570j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int e10 = this.f22573m.e(mVar, this.f22566f, true);
        if (e10 == -1) {
            return -1;
        }
        int i10 = this.f22566f - e10;
        this.f22566f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f22573m.b(this.f22571k + this.f22564d, 1, this.f22565e, 0, (e0.a) null);
        this.f22564d += 20000;
        return 0;
    }

    public void b(n nVar) {
        this.f22572l = nVar;
        this.f22573m = nVar.e(0, 1);
        nVar.q();
    }

    public void c(long j10, long j11) {
        this.f22564d = 0;
        this.f22565e = 0;
        this.f22566f = 0;
        if (j10 != 0) {
            b0 b0Var = this.f22574n;
            if (b0Var instanceof e) {
                this.f22571k = ((e) b0Var).c(j10);
                return;
            }
        }
        this.f22571k = 0;
    }

    public boolean e(m mVar) throws IOException {
        return r(mVar);
    }

    public int g(m mVar, a0 a0Var) throws IOException {
        d();
        if (mVar.c() != 0 || r(mVar)) {
            n();
            int s10 = s(mVar);
            o(mVar.b(), s10);
            return s10;
        }
        throw y2.a("Could not find AMR header.", (Throwable) null);
    }

    public void release() {
    }

    public b(int i10) {
        this.f22562b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f22561a = new byte[1];
        this.f22569i = -1;
    }
}
