package c3;

import c3.i0;
import java.io.IOException;
import k4.a;
import k4.a0;
import k4.z;
import s2.b0;
import s2.e;
import s2.l;
import s2.m;
import s2.n;
import s2.r;

/* compiled from: AdtsExtractor */
public final class h implements l {

    /* renamed from: m  reason: collision with root package name */
    public static final r f5690m = g.f5688b;

    /* renamed from: a  reason: collision with root package name */
    private final int f5691a;

    /* renamed from: b  reason: collision with root package name */
    private final i f5692b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f5693c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f5694d;

    /* renamed from: e  reason: collision with root package name */
    private final z f5695e;

    /* renamed from: f  reason: collision with root package name */
    private n f5696f;

    /* renamed from: g  reason: collision with root package name */
    private long f5697g;

    /* renamed from: h  reason: collision with root package name */
    private long f5698h;

    /* renamed from: i  reason: collision with root package name */
    private int f5699i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5700j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5701k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5702l;

    public h() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(s2.m r10) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r9.f5700j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = -1
            r9.f5699i = r0
            r10.l()
            long r1 = r10.c()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0018
            r9.k(r10)
        L_0x0018:
            r1 = 0
            r2 = 0
        L_0x001a:
            r5 = 1
            k4.a0 r6 = r9.f5694d     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.e()     // Catch:{ EOFException -> 0x0076 }
            r7 = 2
            boolean r6 = r10.g(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 == 0) goto L_0x0076
            k4.a0 r6 = r9.f5694d     // Catch:{ EOFException -> 0x0076 }
            r6.T(r1)     // Catch:{ EOFException -> 0x0076 }
            k4.a0 r6 = r9.f5694d     // Catch:{ EOFException -> 0x0076 }
            int r6 = r6.M()     // Catch:{ EOFException -> 0x0076 }
            boolean r6 = c3.i.m(r6)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x003a
            goto L_0x0077
        L_0x003a:
            k4.a0 r6 = r9.f5694d     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.e()     // Catch:{ EOFException -> 0x0076 }
            r7 = 4
            boolean r6 = r10.g(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x0048
            goto L_0x0076
        L_0x0048:
            k4.z r6 = r9.f5695e     // Catch:{ EOFException -> 0x0076 }
            r7 = 14
            r6.p(r7)     // Catch:{ EOFException -> 0x0076 }
            k4.z r6 = r9.f5695e     // Catch:{ EOFException -> 0x0076 }
            r7 = 13
            int r6 = r6.h(r7)     // Catch:{ EOFException -> 0x0076 }
            r7 = 6
            if (r6 <= r7) goto L_0x006c
            long r7 = (long) r6     // Catch:{ EOFException -> 0x0076 }
            long r3 = r3 + r7
            int r2 = r2 + 1
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r7) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            int r6 = r6 + -6
            boolean r6 = r10.n(r6, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x001a
        L_0x006b:
            goto L_0x0076
        L_0x006c:
            r9.f5700j = r5     // Catch:{ EOFException -> 0x0076 }
            java.lang.String r1 = "Malformed ADTS stream"
            r6 = 0
            n2.y2 r1 = n2.y2.a(r1, r6)     // Catch:{ EOFException -> 0x0076 }
            throw r1     // Catch:{ EOFException -> 0x0076 }
        L_0x0076:
            r1 = r2
        L_0x0077:
            r10.l()
            if (r1 <= 0) goto L_0x0082
            long r0 = (long) r1
            long r3 = r3 / r0
            int r10 = (int) r3
            r9.f5699i = r10
            goto L_0x0084
        L_0x0082:
            r9.f5699i = r0
        L_0x0084:
            r9.f5700j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.h.d(s2.m):void");
    }

    private static int f(int i10, long j10) {
        return (int) (((((long) i10) * 8) * 1000000) / j10);
    }

    private b0 h(long j10, boolean z10) {
        return new e(j10, this.f5698h, f(this.f5699i, this.f5692b.k()), this.f5699i, z10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ l[] i() {
        return new l[]{new h()};
    }

    private void j(long j10, boolean z10) {
        if (!this.f5702l) {
            boolean z11 = false;
            boolean z12 = (this.f5691a & 1) != 0 && this.f5699i > 0;
            if (!z12 || this.f5692b.k() != -9223372036854775807L || z10) {
                if (!z12 || this.f5692b.k() == -9223372036854775807L) {
                    this.f5696f.j(new b0.b(-9223372036854775807L));
                } else {
                    n nVar = this.f5696f;
                    if ((this.f5691a & 2) != 0) {
                        z11 = true;
                    }
                    nVar.j(h(j10, z11));
                }
                this.f5702l = true;
            }
        }
    }

    private int k(m mVar) throws IOException {
        int i10 = 0;
        while (true) {
            mVar.p(this.f5694d.e(), 0, 10);
            this.f5694d.T(0);
            if (this.f5694d.J() != 4801587) {
                break;
            }
            this.f5694d.U(3);
            int F = this.f5694d.F();
            i10 += F + 10;
            mVar.i(F);
        }
        mVar.l();
        mVar.i(i10);
        if (this.f5698h == -1) {
            this.f5698h = (long) i10;
        }
        return i10;
    }

    public void b(n nVar) {
        this.f5696f = nVar;
        this.f5692b.e(nVar, new i0.d(0, 1));
        nVar.q();
    }

    public void c(long j10, long j11) {
        this.f5701k = false;
        this.f5692b.b();
        this.f5697g = j11;
    }

    public boolean e(m mVar) throws IOException {
        int k10 = k(mVar);
        int i10 = k10;
        int i11 = 0;
        int i12 = 0;
        do {
            mVar.p(this.f5694d.e(), 0, 2);
            this.f5694d.T(0);
            if (!i.m(this.f5694d.M())) {
                i10++;
                mVar.l();
                mVar.i(i10);
            } else {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                mVar.p(this.f5694d.e(), 0, 4);
                this.f5695e.p(14);
                int h10 = this.f5695e.h(13);
                if (h10 <= 6) {
                    i10++;
                    mVar.l();
                    mVar.i(i10);
                } else {
                    mVar.i(h10 - 6);
                    i12 += h10;
                }
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - k10 < 8192);
        return false;
    }

    public int g(m mVar, s2.a0 a0Var) throws IOException {
        a.h(this.f5696f);
        long b10 = mVar.b();
        int i10 = this.f5691a;
        if (((i10 & 2) == 0 && ((i10 & 1) == 0 || b10 == -1)) ? false : true) {
            d(mVar);
        }
        int read = mVar.read(this.f5693c.e(), 0, 2048);
        boolean z10 = read == -1;
        j(b10, z10);
        if (z10) {
            return -1;
        }
        this.f5693c.T(0);
        this.f5693c.S(read);
        if (!this.f5701k) {
            this.f5692b.f(this.f5697g, 4);
            this.f5701k = true;
        }
        this.f5692b.c(this.f5693c);
        return 0;
    }

    public void release() {
    }

    public h(int i10) {
        this.f5691a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f5692b = new i(true);
        this.f5693c = new a0(2048);
        this.f5699i = -1;
        this.f5698h = -1;
        a0 a0Var = new a0(10);
        this.f5694d = a0Var;
        this.f5695e = new z(a0Var.e());
    }
}
