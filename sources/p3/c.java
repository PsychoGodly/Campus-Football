package p3;

import java.io.IOException;
import k4.a;
import s2.a0;
import s2.l;
import s2.m;
import s2.r;
import z2.f;

/* compiled from: BundledExtractorsAdapter */
public final class c implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private final r f21407a;

    /* renamed from: b  reason: collision with root package name */
    private l f21408b;

    /* renamed from: c  reason: collision with root package name */
    private m f21409c;

    public c(r rVar) {
        this.f21407a = rVar;
    }

    public void c(long j10, long j11) {
        ((l) a.e(this.f21408b)).c(j10, j11);
    }

    public int d(a0 a0Var) throws IOException {
        return ((l) a.e(this.f21408b)).g((m) a.e(this.f21409c), a0Var);
    }

    public long e() {
        m mVar = this.f21409c;
        if (mVar != null) {
            return mVar.c();
        }
        return -1;
    }

    public void f() {
        l lVar = this.f21408b;
        if (lVar instanceof f) {
            ((f) lVar).j();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0.c() != r11) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        if (r0.c() != r11) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(j4.i r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, s2.n r15) throws java.io.IOException {
        /*
            r7 = this;
            s2.f r6 = new s2.f
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f21409c = r6
            s2.l r8 = r7.f21408b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            s2.r r8 = r7.f21407a
            s2.l[] r8 = r8.b(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.f21408b = r8
            goto L_0x0075
        L_0x0020:
            int r10 = r8.length
            r0 = 0
        L_0x0022:
            if (r0 >= r10) goto L_0x0071
            r1 = r8[r0]
            boolean r2 = r1.e(r6)     // Catch:{ EOFException -> 0x0057, all -> 0x0042 }
            if (r2 == 0) goto L_0x0035
            r7.f21408b = r1     // Catch:{ EOFException -> 0x0057, all -> 0x0042 }
            k4.a.f(r14)
            r6.l()
            goto L_0x0071
        L_0x0035:
            s2.l r1 = r7.f21408b
            if (r1 != 0) goto L_0x0067
            long r1 = r6.c()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0065
            goto L_0x0067
        L_0x0042:
            r8 = move-exception
            s2.l r9 = r7.f21408b
            if (r9 != 0) goto L_0x004f
            long r9 = r6.c()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x0050
        L_0x004f:
            r13 = 1
        L_0x0050:
            k4.a.f(r13)
            r6.l()
            throw r8
        L_0x0057:
            s2.l r1 = r7.f21408b
            if (r1 != 0) goto L_0x0067
            long r1 = r6.c()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r1 = 0
            goto L_0x0068
        L_0x0067:
            r1 = 1
        L_0x0068:
            k4.a.f(r1)
            r6.l()
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0071:
            s2.l r10 = r7.f21408b
            if (r10 == 0) goto L_0x007b
        L_0x0075:
            s2.l r8 = r7.f21408b
            r8.b(r15)
            return
        L_0x007b:
            p3.a1 r10 = new p3.a1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = k4.n0.M(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = k4.a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.c.g(j4.i, android.net.Uri, java.util.Map, long, long, s2.n):void");
    }

    public void release() {
        l lVar = this.f21408b;
        if (lVar != null) {
            lVar.release();
            this.f21408b = null;
        }
        this.f21409c = null;
    }
}
