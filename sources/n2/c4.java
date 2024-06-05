package n2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import k4.n0;
import n2.h;
import n2.z1;
import q3.c;
import s6.u;

/* compiled from: Timeline */
public abstract class c4 implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final c4 f20205a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f20206b = n0.r0(0);

    /* renamed from: c  reason: collision with root package name */
    private static final String f20207c = n0.r0(1);

    /* renamed from: d  reason: collision with root package name */
    private static final String f20208d = n0.r0(2);

    /* renamed from: f  reason: collision with root package name */
    public static final h.a<c4> f20209f = b4.f36372a;

    /* compiled from: Timeline */
    class a extends c4 {
        a() {
        }

        public int f(Object obj) {
            return -1;
        }

        public b k(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        public int m() {
            return 0;
        }

        public Object q(int i10) {
            throw new IndexOutOfBoundsException();
        }

        public d s(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        public int t() {
            return 0;
        }
    }

    /* compiled from: Timeline */
    public static final class b implements h {

        /* renamed from: i  reason: collision with root package name */
        private static final String f20210i = n0.r0(0);

        /* renamed from: j  reason: collision with root package name */
        private static final String f20211j = n0.r0(1);

        /* renamed from: k  reason: collision with root package name */
        private static final String f20212k = n0.r0(2);

        /* renamed from: l  reason: collision with root package name */
        private static final String f20213l = n0.r0(3);

        /* renamed from: m  reason: collision with root package name */
        private static final String f20214m = n0.r0(4);

        /* renamed from: n  reason: collision with root package name */
        public static final h.a<b> f20215n = d4.f36382a;

        /* renamed from: a  reason: collision with root package name */
        public Object f20216a;

        /* renamed from: b  reason: collision with root package name */
        public Object f20217b;

        /* renamed from: c  reason: collision with root package name */
        public int f20218c;

        /* renamed from: d  reason: collision with root package name */
        public long f20219d;

        /* renamed from: f  reason: collision with root package name */
        public long f20220f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f20221g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public q3.c f20222h = q3.c.f21784h;

        /* access modifiers changed from: private */
        public static b c(Bundle bundle) {
            q3.c cVar;
            int i10 = bundle.getInt(f20210i, 0);
            long j10 = bundle.getLong(f20211j, -9223372036854775807L);
            long j11 = bundle.getLong(f20212k, 0);
            boolean z10 = bundle.getBoolean(f20213l, false);
            Bundle bundle2 = bundle.getBundle(f20214m);
            if (bundle2 != null) {
                cVar = q3.c.f21790n.a(bundle2);
            } else {
                cVar = q3.c.f21784h;
            }
            q3.c cVar2 = cVar;
            b bVar = new b();
            bVar.v((Object) null, (Object) null, i10, j10, j11, cVar2, z10);
            return bVar;
        }

        public int d(int i10) {
            return this.f20222h.c(i10).f21807b;
        }

        public long e(int i10, int i11) {
            c.a c10 = this.f20222h.c(i10);
            if (c10.f21807b != -1) {
                return c10.f21811g[i11];
            }
            return -9223372036854775807L;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            if (n0.c(this.f20216a, bVar.f20216a) && n0.c(this.f20217b, bVar.f20217b) && this.f20218c == bVar.f20218c && this.f20219d == bVar.f20219d && this.f20220f == bVar.f20220f && this.f20221g == bVar.f20221g && n0.c(this.f20222h, bVar.f20222h)) {
                return true;
            }
            return false;
        }

        public int f() {
            return this.f20222h.f21792b;
        }

        public int g(long j10) {
            return this.f20222h.d(j10, this.f20219d);
        }

        public int h(long j10) {
            return this.f20222h.e(j10, this.f20219d);
        }

        public int hashCode() {
            Object obj = this.f20216a;
            int i10 = 0;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f20217b;
            if (obj2 != null) {
                i10 = obj2.hashCode();
            }
            long j10 = this.f20219d;
            long j11 = this.f20220f;
            return ((((((((((hashCode + i10) * 31) + this.f20218c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f20221g ? 1 : 0)) * 31) + this.f20222h.hashCode();
        }

        public long i(int i10) {
            return this.f20222h.c(i10).f21806a;
        }

        public long j() {
            return this.f20222h.f21793c;
        }

        public int k(int i10, int i11) {
            c.a c10 = this.f20222h.c(i10);
            if (c10.f21807b != -1) {
                return c10.f21810f[i11];
            }
            return 0;
        }

        public long l(int i10) {
            return this.f20222h.c(i10).f21812h;
        }

        public long m() {
            return this.f20219d;
        }

        public int n(int i10) {
            return this.f20222h.c(i10).e();
        }

        public int o(int i10, int i11) {
            return this.f20222h.c(i10).f(i11);
        }

        public long p() {
            return n0.Z0(this.f20220f);
        }

        public long q() {
            return this.f20220f;
        }

        public int r() {
            return this.f20222h.f21795f;
        }

        public boolean s(int i10) {
            return !this.f20222h.c(i10).g();
        }

        public boolean t(int i10) {
            return this.f20222h.c(i10).f21813i;
        }

        public b u(Object obj, Object obj2, int i10, long j10, long j11) {
            return v(obj, obj2, i10, j10, j11, q3.c.f21784h, false);
        }

        public b v(Object obj, Object obj2, int i10, long j10, long j11, q3.c cVar, boolean z10) {
            this.f20216a = obj;
            this.f20217b = obj2;
            this.f20218c = i10;
            this.f20219d = j10;
            this.f20220f = j11;
            this.f20222h = cVar;
            this.f20221g = z10;
            return this;
        }
    }

    /* compiled from: Timeline */
    public static final class c extends c4 {

        /* renamed from: g  reason: collision with root package name */
        private final u<d> f20223g;

        /* renamed from: h  reason: collision with root package name */
        private final u<b> f20224h;

        /* renamed from: i  reason: collision with root package name */
        private final int[] f20225i;

        /* renamed from: j  reason: collision with root package name */
        private final int[] f20226j;

        public c(u<d> uVar, u<b> uVar2, int[] iArr) {
            k4.a.a(uVar.size() == iArr.length);
            this.f20223g = uVar;
            this.f20224h = uVar2;
            this.f20225i = iArr;
            this.f20226j = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f20226j[iArr[i10]] = i10;
            }
        }

        public int e(boolean z10) {
            if (u()) {
                return -1;
            }
            if (z10) {
                return this.f20225i[0];
            }
            return 0;
        }

        public int f(Object obj) {
            throw new UnsupportedOperationException();
        }

        public int g(boolean z10) {
            if (u()) {
                return -1;
            }
            if (z10) {
                return this.f20225i[t() - 1];
            }
            return t() - 1;
        }

        public int i(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != g(z10)) {
                return z10 ? this.f20225i[this.f20226j[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return e(z10);
            }
            return -1;
        }

        public b k(int i10, b bVar, boolean z10) {
            b bVar2 = this.f20224h.get(i10);
            bVar.v(bVar2.f20216a, bVar2.f20217b, bVar2.f20218c, bVar2.f20219d, bVar2.f20220f, bVar2.f20222h, bVar2.f20221g);
            return bVar;
        }

        public int m() {
            return this.f20224h.size();
        }

        public int p(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != e(z10)) {
                return z10 ? this.f20225i[this.f20226j[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return g(z10);
            }
            return -1;
        }

        public Object q(int i10) {
            throw new UnsupportedOperationException();
        }

        public d s(int i10, d dVar, long j10) {
            d dVar2 = dVar;
            d dVar3 = this.f20223g.get(i10);
            Object obj = dVar3.f20235a;
            z1 z1Var = dVar3.f20237c;
            z1 z1Var2 = z1Var;
            d dVar4 = dVar3;
            d dVar5 = dVar;
            dVar5.i(obj, z1Var2, dVar3.f20238d, dVar3.f20239f, dVar3.f20240g, dVar3.f20241h, dVar3.f20242i, dVar3.f20243j, dVar3.f20245l, dVar3.f20247n, dVar4.f20248o, dVar4.f20249p, dVar4.f20250q, dVar4.f20251r);
            d dVar6 = dVar;
            dVar6.f20246m = dVar4.f20246m;
            return dVar6;
        }

        public int t() {
            return this.f20223g.size();
        }
    }

    /* compiled from: Timeline */
    public static final class d implements h {
        private static final String A = n0.r0(6);
        private static final String B = n0.r0(7);
        private static final String C = n0.r0(8);
        private static final String D = n0.r0(9);
        private static final String E = n0.r0(10);
        private static final String F = n0.r0(11);
        private static final String G = n0.r0(12);
        private static final String H = n0.r0(13);
        public static final h.a<d> I = e4.f36386a;

        /* renamed from: s  reason: collision with root package name */
        public static final Object f20227s = new Object();

        /* renamed from: t  reason: collision with root package name */
        private static final Object f20228t = new Object();

        /* renamed from: u  reason: collision with root package name */
        private static final z1 f20229u = new z1.c().c("com.google.android.exoplayer2.Timeline").f(Uri.EMPTY).a();

        /* renamed from: v  reason: collision with root package name */
        private static final String f20230v = n0.r0(1);

        /* renamed from: w  reason: collision with root package name */
        private static final String f20231w = n0.r0(2);

        /* renamed from: x  reason: collision with root package name */
        private static final String f20232x = n0.r0(3);

        /* renamed from: y  reason: collision with root package name */
        private static final String f20233y = n0.r0(4);

        /* renamed from: z  reason: collision with root package name */
        private static final String f20234z = n0.r0(5);

        /* renamed from: a  reason: collision with root package name */
        public Object f20235a = f20227s;
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public Object f20236b;

        /* renamed from: c  reason: collision with root package name */
        public z1 f20237c = f20229u;

        /* renamed from: d  reason: collision with root package name */
        public Object f20238d;

        /* renamed from: f  reason: collision with root package name */
        public long f20239f;

        /* renamed from: g  reason: collision with root package name */
        public long f20240g;

        /* renamed from: h  reason: collision with root package name */
        public long f20241h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f20242i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f20243j;
        @Deprecated

        /* renamed from: k  reason: collision with root package name */
        public boolean f20244k;

        /* renamed from: l  reason: collision with root package name */
        public z1.g f20245l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f20246m;

        /* renamed from: n  reason: collision with root package name */
        public long f20247n;

        /* renamed from: o  reason: collision with root package name */
        public long f20248o;

        /* renamed from: p  reason: collision with root package name */
        public int f20249p;

        /* renamed from: q  reason: collision with root package name */
        public int f20250q;

        /* renamed from: r  reason: collision with root package name */
        public long f20251r;

        /* access modifiers changed from: private */
        public static d b(Bundle bundle) {
            Bundle bundle2 = bundle;
            Bundle bundle3 = bundle2.getBundle(f20230v);
            z1 a10 = bundle3 != null ? z1.f20783p.a(bundle3) : z1.f20777j;
            long j10 = bundle2.getLong(f20231w, -9223372036854775807L);
            long j11 = bundle2.getLong(f20232x, -9223372036854775807L);
            long j12 = bundle2.getLong(f20233y, -9223372036854775807L);
            boolean z10 = bundle2.getBoolean(f20234z, false);
            boolean z11 = bundle2.getBoolean(A, false);
            Bundle bundle4 = bundle2.getBundle(B);
            z1.g a11 = bundle4 != null ? z1.g.f20848m.a(bundle4) : null;
            boolean z12 = bundle2.getBoolean(C, false);
            long j13 = bundle2.getLong(D, 0);
            long j14 = bundle2.getLong(E, -9223372036854775807L);
            int i10 = bundle2.getInt(F, 0);
            int i11 = bundle2.getInt(G, 0);
            long j15 = bundle2.getLong(H, 0);
            d dVar = r0;
            d dVar2 = new d();
            dVar.i(f20228t, a10, (Object) null, j10, j11, j12, z10, z11, a11, j13, j14, i10, i11, j15);
            dVar2.f20246m = z12;
            return dVar2;
        }

        public long c() {
            return n0.a0(this.f20241h);
        }

        public long d() {
            return n0.Z0(this.f20247n);
        }

        public long e() {
            return this.f20247n;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            if (n0.c(this.f20235a, dVar.f20235a) && n0.c(this.f20237c, dVar.f20237c) && n0.c(this.f20238d, dVar.f20238d) && n0.c(this.f20245l, dVar.f20245l) && this.f20239f == dVar.f20239f && this.f20240g == dVar.f20240g && this.f20241h == dVar.f20241h && this.f20242i == dVar.f20242i && this.f20243j == dVar.f20243j && this.f20246m == dVar.f20246m && this.f20247n == dVar.f20247n && this.f20248o == dVar.f20248o && this.f20249p == dVar.f20249p && this.f20250q == dVar.f20250q && this.f20251r == dVar.f20251r) {
                return true;
            }
            return false;
        }

        public long f() {
            return n0.Z0(this.f20248o);
        }

        public long g() {
            return this.f20251r;
        }

        public boolean h() {
            k4.a.f(this.f20244k == (this.f20245l != null));
            if (this.f20245l != null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f20235a.hashCode()) * 31) + this.f20237c.hashCode()) * 31;
            Object obj = this.f20238d;
            int i10 = 0;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            z1.g gVar = this.f20245l;
            if (gVar != null) {
                i10 = gVar.hashCode();
            }
            long j10 = this.f20239f;
            long j11 = this.f20240g;
            long j12 = this.f20241h;
            long j13 = this.f20247n;
            long j14 = this.f20248o;
            long j15 = this.f20251r;
            return ((((((((((((((((((((((hashCode2 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f20242i ? 1 : 0)) * 31) + (this.f20243j ? 1 : 0)) * 31) + (this.f20246m ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f20249p) * 31) + this.f20250q) * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
            r1 = r1.f20785b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public n2.c4.d i(java.lang.Object r6, n2.z1 r7, java.lang.Object r8, long r9, long r11, long r13, boolean r15, boolean r16, n2.z1.g r17, long r18, long r20, int r22, int r23, long r24) {
            /*
                r5 = this;
                r0 = r5
                r1 = r7
                r2 = r17
                r3 = r6
                r0.f20235a = r3
                if (r1 == 0) goto L_0x000b
                r3 = r1
                goto L_0x000d
            L_0x000b:
                n2.z1 r3 = f20229u
            L_0x000d:
                r0.f20237c = r3
                if (r1 == 0) goto L_0x0018
                n2.z1$h r1 = r1.f20785b
                if (r1 == 0) goto L_0x0018
                java.lang.Object r1 = r1.f20867i
                goto L_0x0019
            L_0x0018:
                r1 = 0
            L_0x0019:
                r0.f20236b = r1
                r1 = r8
                r0.f20238d = r1
                r3 = r9
                r0.f20239f = r3
                r3 = r11
                r0.f20240g = r3
                r3 = r13
                r0.f20241h = r3
                r1 = r15
                r0.f20242i = r1
                r1 = r16
                r0.f20243j = r1
                r1 = 0
                if (r2 == 0) goto L_0x0033
                r3 = 1
                goto L_0x0034
            L_0x0033:
                r3 = 0
            L_0x0034:
                r0.f20244k = r3
                r0.f20245l = r2
                r2 = r18
                r0.f20247n = r2
                r2 = r20
                r0.f20248o = r2
                r2 = r22
                r0.f20249p = r2
                r2 = r23
                r0.f20250q = r2
                r2 = r24
                r0.f20251r = r2
                r0.f20246m = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: n2.c4.d.i(java.lang.Object, n2.z1, java.lang.Object, long, long, long, boolean, boolean, n2.z1$g, long, long, int, int, long):n2.c4$d");
        }
    }

    protected c4() {
    }

    /* access modifiers changed from: private */
    public static c4 b(Bundle bundle) {
        u<d> c10 = c(d.I, k4.b.a(bundle, f20206b));
        u<b> c11 = c(b.f20215n, k4.b.a(bundle, f20207c));
        int[] intArray = bundle.getIntArray(f20208d);
        if (intArray == null) {
            intArray = d(c10.size());
        }
        return new c(c10, c11, intArray);
    }

    private static <T extends h> u<T> c(h.a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return u.y();
        }
        u.a aVar2 = new u.a();
        u<Bundle> a10 = g.a(iBinder);
        for (int i10 = 0; i10 < a10.size(); i10++) {
            aVar2.a(aVar.a(a10.get(i10)));
        }
        return aVar2.k();
    }

    private static int[] d(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    public int e(boolean z10) {
        return u() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        int g10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        if (c4Var.t() != t() || c4Var.m() != m()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i10 = 0; i10 < t(); i10++) {
            if (!r(i10, dVar).equals(c4Var.r(i10, dVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < m(); i11++) {
            if (!k(i11, bVar, true).equals(c4Var.k(i11, bVar2, true))) {
                return false;
            }
        }
        int e10 = e(true);
        if (e10 != c4Var.e(true) || (g10 = g(true)) != c4Var.g(true)) {
            return false;
        }
        while (e10 != g10) {
            int i12 = i(e10, 0, true);
            if (i12 != c4Var.i(e10, 0, true)) {
                return false;
            }
            e10 = i12;
        }
        return true;
    }

    public abstract int f(Object obj);

    public int g(boolean z10) {
        if (u()) {
            return -1;
        }
        return t() - 1;
    }

    public final int h(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = j(i10, bVar).f20218c;
        if (r(i12, dVar).f20250q != i10) {
            return i10 + 1;
        }
        int i13 = i(i12, i11, z10);
        if (i13 == -1) {
            return -1;
        }
        return r(i13, dVar).f20249p;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int t10 = 217 + t();
        for (int i10 = 0; i10 < t(); i10++) {
            t10 = (t10 * 31) + r(i10, dVar).hashCode();
        }
        int m10 = (t10 * 31) + m();
        for (int i11 = 0; i11 < m(); i11++) {
            m10 = (m10 * 31) + k(i11, bVar, true).hashCode();
        }
        int e10 = e(true);
        while (e10 != -1) {
            m10 = (m10 * 31) + e10;
            e10 = i(e10, 0, true);
        }
        return m10;
    }

    public int i(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 == 2) {
                return i10 == g(z10) ? e(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else if (i10 == g(z10)) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public final b j(int i10, b bVar) {
        return k(i10, bVar, false);
    }

    public abstract b k(int i10, b bVar, boolean z10);

    public b l(Object obj, b bVar) {
        return k(f(obj), bVar, true);
    }

    public abstract int m();

    public final Pair<Object, Long> n(d dVar, b bVar, int i10, long j10) {
        return (Pair) k4.a.e(o(dVar, bVar, i10, j10, 0));
    }

    public final Pair<Object, Long> o(d dVar, b bVar, int i10, long j10, long j11) {
        k4.a.c(i10, 0, t());
        s(i10, dVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.e();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.f20249p;
        j(i11, bVar);
        while (i11 < dVar.f20250q && bVar.f20220f != j10) {
            int i12 = i11 + 1;
            if (j(i12, bVar).f20220f > j10) {
                break;
            }
            i11 = i12;
        }
        k(i11, bVar, true);
        long j12 = j10 - bVar.f20220f;
        long j13 = bVar.f20219d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        return Pair.create(k4.a.e(bVar.f20217b), Long.valueOf(Math.max(0, j12)));
    }

    public int p(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 == 2) {
                return i10 == e(z10) ? g(z10) : i10 - 1;
            }
            throw new IllegalStateException();
        } else if (i10 == e(z10)) {
            return -1;
        } else {
            return i10 - 1;
        }
    }

    public abstract Object q(int i10);

    public final d r(int i10, d dVar) {
        return s(i10, dVar, 0);
    }

    public abstract d s(int i10, d dVar, long j10);

    public abstract int t();

    public final boolean u() {
        return t() == 0;
    }

    public final boolean v(int i10, b bVar, d dVar, int i11, boolean z10) {
        return h(i10, bVar, dVar, i11, z10) == -1;
    }
}
