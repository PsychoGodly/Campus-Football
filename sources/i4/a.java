package i4;

import i4.s;
import j4.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k4.d;
import k4.n0;
import k4.r;
import n2.c4;
import n2.r1;
import p3.x;
import p3.x0;
import r3.n;
import r3.o;
import s6.b0;
import s6.d0;
import s6.j0;
import s6.u;

/* compiled from: AdaptiveTrackSelection */
public class a extends c {

    /* renamed from: h  reason: collision with root package name */
    private final f f18929h;

    /* renamed from: i  reason: collision with root package name */
    private final long f18930i;

    /* renamed from: j  reason: collision with root package name */
    private final long f18931j;

    /* renamed from: k  reason: collision with root package name */
    private final long f18932k;

    /* renamed from: l  reason: collision with root package name */
    private final int f18933l;

    /* renamed from: m  reason: collision with root package name */
    private final int f18934m;

    /* renamed from: n  reason: collision with root package name */
    private final float f18935n;

    /* renamed from: o  reason: collision with root package name */
    private final float f18936o;

    /* renamed from: p  reason: collision with root package name */
    private final u<C0202a> f18937p;

    /* renamed from: q  reason: collision with root package name */
    private final d f18938q;

    /* renamed from: r  reason: collision with root package name */
    private float f18939r;

    /* renamed from: s  reason: collision with root package name */
    private int f18940s;

    /* renamed from: t  reason: collision with root package name */
    private int f18941t;

    /* renamed from: u  reason: collision with root package name */
    private long f18942u;

    /* renamed from: v  reason: collision with root package name */
    private n f18943v;

    /* renamed from: i4.a$a  reason: collision with other inner class name */
    /* compiled from: AdaptiveTrackSelection */
    public static final class C0202a {

        /* renamed from: a  reason: collision with root package name */
        public final long f18944a;

        /* renamed from: b  reason: collision with root package name */
        public final long f18945b;

        public C0202a(long j10, long j11) {
            this.f18944a = j10;
            this.f18945b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0202a)) {
                return false;
            }
            C0202a aVar = (C0202a) obj;
            if (this.f18944a == aVar.f18944a && this.f18945b == aVar.f18945b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f18944a) * 31) + ((int) this.f18945b);
        }
    }

    /* compiled from: AdaptiveTrackSelection */
    public static class b implements s.b {

        /* renamed from: a  reason: collision with root package name */
        private final int f18946a;

        /* renamed from: b  reason: collision with root package name */
        private final int f18947b;

        /* renamed from: c  reason: collision with root package name */
        private final int f18948c;

        /* renamed from: d  reason: collision with root package name */
        private final int f18949d;

        /* renamed from: e  reason: collision with root package name */
        private final int f18950e;

        /* renamed from: f  reason: collision with root package name */
        private final float f18951f;

        /* renamed from: g  reason: collision with root package name */
        private final float f18952g;

        /* renamed from: h  reason: collision with root package name */
        private final d f18953h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        public final s[] a(s.a[] aVarArr, f fVar, x.b bVar, c4 c4Var) {
            s sVar;
            u x10 = a.B(aVarArr);
            s[] sVarArr = new s[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                s.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f19060b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            sVar = new t(aVar.f19059a, iArr[0], aVar.f19061c);
                        } else {
                            sVar = b(aVar.f19059a, iArr, aVar.f19061c, fVar, (u) x10.get(i10));
                        }
                        sVarArr[i10] = sVar;
                    }
                }
            }
            return sVarArr;
        }

        /* access modifiers changed from: protected */
        public a b(x0 x0Var, int[] iArr, int i10, f fVar, u<C0202a> uVar) {
            return new a(x0Var, iArr, i10, fVar, (long) this.f18946a, (long) this.f18947b, (long) this.f18948c, this.f18949d, this.f18950e, this.f18951f, this.f18952g, uVar, this.f18953h);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, d.f19684a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, d dVar) {
            this.f18946a = i10;
            this.f18947b = i11;
            this.f18948c = i12;
            this.f18949d = i13;
            this.f18950e = i14;
            this.f18951f = f10;
            this.f18952g = f11;
            this.f18953h = dVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected a(x0 x0Var, int[] iArr, int i10, f fVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<C0202a> list, d dVar) {
        super(x0Var, iArr, i10);
        f fVar2;
        long j13;
        if (j12 < j10) {
            r.i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            fVar2 = fVar;
            j13 = j10;
        } else {
            fVar2 = fVar;
            j13 = j12;
        }
        this.f18929h = fVar2;
        this.f18930i = j10 * 1000;
        this.f18931j = j11 * 1000;
        this.f18932k = j13 * 1000;
        this.f18933l = i11;
        this.f18934m = i12;
        this.f18935n = f10;
        this.f18936o = f11;
        this.f18937p = u.u(list);
        this.f18938q = dVar;
        this.f18939r = 1.0f;
        this.f18941t = 0;
        this.f18942u = -9223372036854775807L;
    }

    private int A(long j10, long j11) {
        long C = C(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f18957b; i11++) {
            if (j10 == Long.MIN_VALUE || !h(i11, j10)) {
                r1 b10 = b(i11);
                if (z(b10, b10.f20650i, C)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public static u<u<C0202a>> B(s.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (aVarArr[i10] == null || aVarArr[i10].f19060b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                u.a p10 = u.p();
                p10.a(new C0202a(0, 0));
                arrayList.add(p10);
            }
        }
        long[][] G = G(aVarArr);
        int[] iArr = new int[G.length];
        long[] jArr = new long[G.length];
        for (int i11 = 0; i11 < G.length; i11++) {
            jArr[i11] = G[i11].length == 0 ? 0 : G[i11][0];
        }
        y(arrayList, jArr);
        u<Integer> H = H(G);
        for (int i12 = 0; i12 < H.size(); i12++) {
            int intValue = H.get(i12).intValue();
            int i13 = iArr[intValue] + 1;
            iArr[intValue] = i13;
            jArr[intValue] = G[intValue][i13];
            y(arrayList, jArr);
        }
        for (int i14 = 0; i14 < aVarArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr[i14] = jArr[i14] * 2;
            }
        }
        y(arrayList, jArr);
        u.a p11 = u.p();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            u.a aVar = (u.a) arrayList.get(i15);
            p11.a(aVar == null ? u.y() : aVar.k());
        }
        return p11.k();
    }

    private long C(long j10) {
        long I = I(j10);
        if (this.f18937p.isEmpty()) {
            return I;
        }
        int i10 = 1;
        while (i10 < this.f18937p.size() - 1 && this.f18937p.get(i10).f18944a < I) {
            i10++;
        }
        C0202a aVar = this.f18937p.get(i10 - 1);
        C0202a aVar2 = this.f18937p.get(i10);
        long j11 = aVar.f18944a;
        long j12 = aVar.f18945b;
        return j12 + ((long) ((((float) (I - j11)) / ((float) (aVar2.f18944a - j11))) * ((float) (aVar2.f18945b - j12))));
    }

    private long D(List<? extends n> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        n nVar = (n) b0.d(list);
        long j10 = nVar.f22133g;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = nVar.f22134h;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private long F(o[] oVarArr, List<? extends n> list) {
        int i10 = this.f18940s;
        if (i10 >= oVarArr.length || !oVarArr[i10].next()) {
            for (o oVar : oVarArr) {
                if (oVar.next()) {
                    return oVar.b() - oVar.a();
                }
            }
            return D(list);
        }
        o oVar2 = oVarArr[this.f18940s];
        return oVar2.b() - oVar2.a();
    }

    private static long[][] G(s.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            s.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f19060b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f19060b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = (long) aVar.f19059a.b(iArr[i11]).f20650i;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static u<Integer> H(long[][] jArr) {
        double d10;
        long[][] jArr2 = jArr;
        d0<K, V> c10 = j0.a().a().c();
        for (int i10 = 0; i10 < jArr2.length; i10++) {
            if (jArr2[i10].length > 1) {
                int length = jArr2[i10].length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    double d11 = 0.0d;
                    if (i11 >= jArr2[i10].length) {
                        break;
                    }
                    if (jArr2[i10][i11] != -1) {
                        d11 = Math.log((double) jArr2[i10][i11]);
                    }
                    dArr[i11] = d11;
                    i11++;
                }
                int i12 = length - 1;
                double d12 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d13 = dArr[i13];
                    i13++;
                    double d14 = (d13 + dArr[i13]) * 0.5d;
                    if (d12 == 0.0d) {
                        d10 = 1.0d;
                    } else {
                        d10 = (d14 - dArr[0]) / d12;
                    }
                    c10.put(Double.valueOf(d10), Integer.valueOf(i10));
                }
            }
        }
        return u.u(c10.values());
    }

    private long I(long j10) {
        long h10 = (long) (((float) this.f18929h.h()) * this.f18935n);
        long d10 = this.f18929h.d();
        if (d10 == -9223372036854775807L || j10 == -9223372036854775807L) {
            return (long) (((float) h10) / this.f18939r);
        }
        float f10 = (float) j10;
        return (long) ((((float) h10) * Math.max((f10 / this.f18939r) - ((float) d10), 0.0f)) / f10);
    }

    private long J(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.f18930i;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min((long) (((float) j10) * this.f18936o), this.f18930i);
    }

    private static void y(List<u.a<C0202a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            u.a aVar = list.get(i10);
            if (aVar != null) {
                aVar.a(new C0202a(j10, jArr[i10]));
            }
        }
    }

    /* access modifiers changed from: protected */
    public long E() {
        return this.f18932k;
    }

    /* access modifiers changed from: protected */
    public boolean K(long j10, List<? extends n> list) {
        long j11 = this.f18942u;
        return j11 == -9223372036854775807L || j10 - j11 >= 1000 || (!list.isEmpty() && !((n) b0.d(list)).equals(this.f18943v));
    }

    public void d() {
        this.f18943v = null;
    }

    public int f() {
        return this.f18940s;
    }

    public void j() {
        this.f18942u = -9223372036854775807L;
        this.f18943v = null;
    }

    public void k(long j10, long j11, long j12, List<? extends n> list, o[] oVarArr) {
        long b10 = this.f18938q.b();
        long F = F(oVarArr, list);
        int i10 = this.f18941t;
        if (i10 == 0) {
            this.f18941t = 1;
            this.f18940s = A(b10, F);
            return;
        }
        int i11 = this.f18940s;
        int c10 = list.isEmpty() ? -1 : c(((n) b0.d(list)).f22130d);
        if (c10 != -1) {
            i10 = ((n) b0.d(list)).f22131e;
            i11 = c10;
        }
        int A = A(b10, F);
        if (!h(i11, b10)) {
            r1 b11 = b(i11);
            r1 b12 = b(A);
            long J = J(j12, F);
            int i12 = b12.f20650i;
            int i13 = b11.f20650i;
            if ((i12 > i13 && j11 < J) || (i12 < i13 && j11 >= this.f18931j)) {
                A = i11;
            }
        }
        if (A != i11) {
            i10 = 3;
        }
        this.f18941t = i10;
        this.f18940s = A;
    }

    public int m(long j10, List<? extends n> list) {
        int i10;
        int i11;
        long b10 = this.f18938q.b();
        if (!K(b10, list)) {
            return list.size();
        }
        this.f18942u = b10;
        this.f18943v = list.isEmpty() ? null : (n) b0.d(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long e02 = n0.e0(((n) list.get(size - 1)).f22133g - j10, this.f18939r);
        long E = E();
        if (e02 < E) {
            return size;
        }
        r1 b11 = b(A(b10, D(list)));
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) list.get(i12);
            r1 r1Var = nVar.f22130d;
            if (n0.e0(nVar.f22133g - j10, this.f18939r) >= E && r1Var.f20650i < b11.f20650i && (i10 = r1Var.f20660s) != -1 && i10 <= this.f18934m && (i11 = r1Var.f20659r) != -1 && i11 <= this.f18933l && i10 < b11.f20660s) {
                return i12;
            }
        }
        return size;
    }

    public int p() {
        return this.f18941t;
    }

    public void q(float f10) {
        this.f18939r = f10;
    }

    public Object r() {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean z(r1 r1Var, int i10, long j10) {
        return ((long) i10) <= j10;
    }
}
