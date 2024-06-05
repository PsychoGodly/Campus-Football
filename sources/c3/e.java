package c3;

import c3.i0;
import java.io.IOException;
import k4.a0;
import s2.b0;
import s2.l;
import s2.m;
import s2.n;
import s2.r;

/* compiled from: Ac4Extractor */
public final class e implements l {

    /* renamed from: d  reason: collision with root package name */
    public static final r f5658d = d.f5655b;

    /* renamed from: a  reason: collision with root package name */
    private final f f5659a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final a0 f5660b = new a0(16384);

    /* renamed from: c  reason: collision with root package name */
    private boolean f5661c;

    /* access modifiers changed from: private */
    public static /* synthetic */ l[] d() {
        return new l[]{new e()};
    }

    public void b(n nVar) {
        this.f5659a.e(nVar, new i0.d(0, 1));
        nVar.q();
        nVar.j(new b0.b(-9223372036854775807L));
    }

    public void c(long j10, long j11) {
        this.f5661c = false;
        this.f5659a.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if ((r4 - r3) < 8192) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        r9.l();
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(s2.m r9) throws java.io.IOException {
        /*
            r8 = this;
            k4.a0 r0 = new k4.a0
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.e()
            r9.p(r4, r2, r1)
            r0.T(r2)
            int r4 = r0.J()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x0065
            r9.l()
            r9.i(r3)
            r4 = r3
        L_0x0023:
            r1 = 0
        L_0x0024:
            byte[] r5 = r0.e()
            r6 = 7
            r9.p(r5, r2, r6)
            r0.T(r2)
            int r5 = r0.M()
            r6 = 44096(0xac40, float:6.1792E-41)
            if (r5 == r6) goto L_0x004d
            r6 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r6) goto L_0x004d
            r9.l()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0049
            return r2
        L_0x0049:
            r9.i(r4)
            goto L_0x0023
        L_0x004d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L_0x0053
            return r6
        L_0x0053:
            byte[] r6 = r0.e()
            int r5 = p2.c.e(r6, r5)
            r6 = -1
            if (r5 != r6) goto L_0x005f
            return r2
        L_0x005f:
            int r5 = r5 + -7
            r9.i(r5)
            goto L_0x0024
        L_0x0065:
            r4 = 3
            r0.U(r4)
            int r4 = r0.F()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r9.i(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.e.e(s2.m):boolean");
    }

    public int g(m mVar, s2.a0 a0Var) throws IOException {
        int read = mVar.read(this.f5660b.e(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f5660b.T(0);
        this.f5660b.S(read);
        if (!this.f5661c) {
            this.f5659a.f(0, 4);
            this.f5661c = true;
        }
        this.f5659a.c(this.f5660b);
        return 0;
    }

    public void release() {
    }
}
