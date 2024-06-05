package c3;

import c3.i0;
import java.io.IOException;
import k4.a0;
import s2.b0;
import s2.l;
import s2.m;
import s2.n;
import s2.r;

/* compiled from: Ac3Extractor */
public final class b implements l {

    /* renamed from: d  reason: collision with root package name */
    public static final r f5633d = a.f5612b;

    /* renamed from: a  reason: collision with root package name */
    private final c f5634a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final a0 f5635b = new a0(2786);

    /* renamed from: c  reason: collision with root package name */
    private boolean f5636c;

    /* access modifiers changed from: private */
    public static /* synthetic */ l[] d() {
        return new l[]{new b()};
    }

    public void b(n nVar) {
        this.f5634a.e(nVar, new i0.d(0, 1));
        nVar.q();
        nVar.j(new b0.b(-9223372036854775807L));
    }

    public void c(long j10, long j11) {
        this.f5636c = false;
        this.f5634a.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        r8.l();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if ((r4 - r3) < 8192) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(s2.m r8) throws java.io.IOException {
        /*
            r7 = this;
            k4.a0 r0 = new k4.a0
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.e()
            r8.p(r4, r2, r1)
            r0.T(r2)
            int r4 = r0.J()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x005f
            r8.l()
            r8.i(r3)
            r4 = r3
        L_0x0023:
            r1 = 0
        L_0x0024:
            byte[] r5 = r0.e()
            r6 = 6
            r8.p(r5, r2, r6)
            r0.T(r2)
            int r5 = r0.M()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L_0x0047
            r8.l()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0043
            return r2
        L_0x0043:
            r8.i(r4)
            goto L_0x0023
        L_0x0047:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L_0x004d
            return r5
        L_0x004d:
            byte[] r5 = r0.e()
            int r5 = p2.b.g(r5)
            r6 = -1
            if (r5 != r6) goto L_0x0059
            return r2
        L_0x0059:
            int r5 = r5 + -6
            r8.i(r5)
            goto L_0x0024
        L_0x005f:
            r4 = 3
            r0.U(r4)
            int r4 = r0.F()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.i(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.b.e(s2.m):boolean");
    }

    public int g(m mVar, s2.a0 a0Var) throws IOException {
        int read = mVar.read(this.f5635b.e(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f5635b.T(0);
        this.f5635b.S(read);
        if (!this.f5636c) {
            this.f5634a.f(0, 4);
            this.f5636c = true;
        }
        this.f5634a.c(this.f5635b);
        return 0;
    }

    public void release() {
    }
}
