package p3;

import android.net.Uri;
import k4.a;
import n2.c4;
import n2.z1;

/* compiled from: SinglePeriodTimeline */
public final class u0 extends c4 {

    /* renamed from: t  reason: collision with root package name */
    private static final Object f21662t = new Object();

    /* renamed from: u  reason: collision with root package name */
    private static final z1 f21663u = new z1.c().c("SinglePeriodTimeline").f(Uri.EMPTY).a();

    /* renamed from: g  reason: collision with root package name */
    private final long f21664g;

    /* renamed from: h  reason: collision with root package name */
    private final long f21665h;

    /* renamed from: i  reason: collision with root package name */
    private final long f21666i;

    /* renamed from: j  reason: collision with root package name */
    private final long f21667j;

    /* renamed from: k  reason: collision with root package name */
    private final long f21668k;

    /* renamed from: l  reason: collision with root package name */
    private final long f21669l;

    /* renamed from: m  reason: collision with root package name */
    private final long f21670m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f21671n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f21672o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f21673p;

    /* renamed from: q  reason: collision with root package name */
    private final Object f21674q;

    /* renamed from: r  reason: collision with root package name */
    private final z1 f21675r;

    /* renamed from: s  reason: collision with root package name */
    private final z1.g f21676s;

    public u0(long j10, boolean z10, boolean z11, boolean z12, Object obj, z1 z1Var) {
        this(j10, j10, 0, 0, z10, z11, z12, obj, z1Var);
    }

    public int f(Object obj) {
        return f21662t.equals(obj) ? 0 : -1;
    }

    public c4.b k(int i10, c4.b bVar, boolean z10) {
        a.c(i10, 0, 1);
        return bVar.u((Object) null, z10 ? f21662t : null, 0, this.f21667j, -this.f21669l);
    }

    public int m() {
        return 1;
    }

    public Object q(int i10) {
        a.c(i10, 0, 1);
        return f21662t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r1 > r5) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n2.c4.d s(int r25, n2.c4.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            k4.a.c(r3, r1, r2)
            long r1 = r0.f21670m
            boolean r14 = r0.f21672o
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L_0x002e
            boolean r5 = r0.f21673p
            if (r5 != 0) goto L_0x002e
            r5 = 0
            int r7 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x002e
            long r5 = r0.f21668k
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0027
        L_0x0024:
            r16 = r3
            goto L_0x0030
        L_0x0027:
            long r1 = r1 + r27
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x002e
            goto L_0x0024
        L_0x002e:
            r16 = r1
        L_0x0030:
            java.lang.Object r4 = n2.c4.d.f20227s
            n2.z1 r5 = r0.f21675r
            java.lang.Object r6 = r0.f21674q
            long r7 = r0.f21664g
            long r9 = r0.f21665h
            long r11 = r0.f21666i
            boolean r13 = r0.f21671n
            n2.z1$g r15 = r0.f21676s
            long r1 = r0.f21668k
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f21669l
            r22 = r1
            r3 = r26
            n2.c4$d r1 = r3.i(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.u0.s(int, n2.c4$d, long):n2.c4$d");
    }

    public int t() {
        return 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public u0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, z1 z1Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, z1Var, z12 ? z1Var.f20787d : null);
    }

    public u0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, z1 z1Var, z1.g gVar) {
        this.f21664g = j10;
        this.f21665h = j11;
        this.f21666i = j12;
        this.f21667j = j13;
        this.f21668k = j14;
        this.f21669l = j15;
        this.f21670m = j16;
        this.f21671n = z10;
        this.f21672o = z11;
        this.f21673p = z12;
        this.f21674q = obj;
        this.f21675r = (z1) a.e(z1Var);
        this.f21676s = gVar;
    }
}
