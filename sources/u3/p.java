package u3;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import f3.a;
import j4.c0;
import j4.g0;
import j4.h0;
import j4.i;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k3.l;
import k4.a0;
import k4.n0;
import k4.r;
import k4.v;
import n2.r1;
import n2.s1;
import n2.u3;
import n2.y2;
import p3.e0;
import p3.p0;
import p3.q;
import p3.q0;
import p3.r0;
import p3.t;
import p3.x0;
import p3.z0;
import q2.g;
import r2.m;
import r2.w;
import r2.y;
import r3.f;
import s2.d0;
import s2.e0;
import s2.k;
import s2.n;
import s6.b0;
import s6.u;
import u3.f;

/* compiled from: HlsSampleStreamWrapper */
final class p implements h0.b<f>, h0.f, r0, n, p0.d {
    private static final Set<Integer> Z = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));
    private e0 A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private int F;
    private r1 G;
    private r1 H;
    private boolean I;
    private z0 J;
    private Set<x0> K;
    private int[] L;
    private int M;
    private boolean N;
    private boolean[] O;
    private boolean[] P;
    private long Q;
    private long R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private long W;
    private m X;
    private i Y;

    /* renamed from: a  reason: collision with root package name */
    private final String f22931a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22932b;

    /* renamed from: c  reason: collision with root package name */
    private final b f22933c;

    /* renamed from: d  reason: collision with root package name */
    private final f f22934d;

    /* renamed from: f  reason: collision with root package name */
    private final j4.b f22935f;

    /* renamed from: g  reason: collision with root package name */
    private final r1 f22936g;

    /* renamed from: h  reason: collision with root package name */
    private final y f22937h;

    /* renamed from: i  reason: collision with root package name */
    private final w.a f22938i;

    /* renamed from: j  reason: collision with root package name */
    private final g0 f22939j;

    /* renamed from: k  reason: collision with root package name */
    private final h0 f22940k = new h0("Loader:HlsSampleStreamWrapper");

    /* renamed from: l  reason: collision with root package name */
    private final e0.a f22941l;

    /* renamed from: m  reason: collision with root package name */
    private final int f22942m;

    /* renamed from: n  reason: collision with root package name */
    private final f.b f22943n = new f.b();

    /* renamed from: o  reason: collision with root package name */
    private final ArrayList<i> f22944o;

    /* renamed from: p  reason: collision with root package name */
    private final List<i> f22945p;

    /* renamed from: q  reason: collision with root package name */
    private final Runnable f22946q;

    /* renamed from: r  reason: collision with root package name */
    private final Runnable f22947r;

    /* renamed from: s  reason: collision with root package name */
    private final Handler f22948s;

    /* renamed from: t  reason: collision with root package name */
    private final ArrayList<l> f22949t;

    /* renamed from: u  reason: collision with root package name */
    private final Map<String, m> f22950u;

    /* renamed from: v  reason: collision with root package name */
    private r3.f f22951v;

    /* renamed from: w  reason: collision with root package name */
    private d[] f22952w;

    /* renamed from: x  reason: collision with root package name */
    private int[] f22953x = new int[0];

    /* renamed from: y  reason: collision with root package name */
    private Set<Integer> f22954y;

    /* renamed from: z  reason: collision with root package name */
    private SparseIntArray f22955z;

    /* compiled from: HlsSampleStreamWrapper */
    public interface b extends r0.a<p> {
        void i(Uri uri);

        void onPrepared();
    }

    /* compiled from: HlsSampleStreamWrapper */
    private static class c implements s2.e0 {

        /* renamed from: g  reason: collision with root package name */
        private static final r1 f22956g = new r1.b().g0("application/id3").G();

        /* renamed from: h  reason: collision with root package name */
        private static final r1 f22957h = new r1.b().g0("application/x-emsg").G();

        /* renamed from: a  reason: collision with root package name */
        private final h3.b f22958a = new h3.b();

        /* renamed from: b  reason: collision with root package name */
        private final s2.e0 f22959b;

        /* renamed from: c  reason: collision with root package name */
        private final r1 f22960c;

        /* renamed from: d  reason: collision with root package name */
        private r1 f22961d;

        /* renamed from: e  reason: collision with root package name */
        private byte[] f22962e;

        /* renamed from: f  reason: collision with root package name */
        private int f22963f;

        public c(s2.e0 e0Var, int i10) {
            this.f22959b = e0Var;
            if (i10 == 1) {
                this.f22960c = f22956g;
            } else if (i10 == 3) {
                this.f22960c = f22957h;
            } else {
                throw new IllegalArgumentException("Unknown metadataType: " + i10);
            }
            this.f22962e = new byte[0];
            this.f22963f = 0;
        }

        private boolean g(h3.a aVar) {
            r1 F = aVar.F();
            return F != null && n0.c(this.f22960c.f20654m, F.f20654m);
        }

        private void h(int i10) {
            byte[] bArr = this.f22962e;
            if (bArr.length < i10) {
                this.f22962e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        private a0 i(int i10, int i11) {
            int i12 = this.f22963f - i11;
            a0 a0Var = new a0(Arrays.copyOfRange(this.f22962e, i12 - i10, i12));
            byte[] bArr = this.f22962e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f22963f = i11;
            return a0Var;
        }

        public void a(r1 r1Var) {
            this.f22961d = r1Var;
            this.f22959b.a(this.f22960c);
        }

        public void b(long j10, int i10, int i11, int i12, e0.a aVar) {
            k4.a.e(this.f22961d);
            a0 i13 = i(i11, i12);
            if (!n0.c(this.f22961d.f20654m, this.f22960c.f20654m)) {
                if ("application/x-emsg".equals(this.f22961d.f20654m)) {
                    h3.a c10 = this.f22958a.c(i13);
                    if (!g(c10)) {
                        r.i("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[]{this.f22960c.f20654m, c10.F()}));
                        return;
                    }
                    i13 = new a0((byte[]) k4.a.e(c10.a0()));
                } else {
                    r.i("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f22961d.f20654m);
                    return;
                }
            }
            int a10 = i13.a();
            this.f22959b.d(i13, a10);
            this.f22959b.b(j10, i10, a10, i12, aVar);
        }

        public int c(i iVar, int i10, boolean z10, int i11) throws IOException {
            h(this.f22963f + i10);
            int read = iVar.read(this.f22962e, this.f22963f, i10);
            if (read != -1) {
                this.f22963f += read;
                return read;
            } else if (z10) {
                return -1;
            } else {
                throw new EOFException();
            }
        }

        public /* synthetic */ void d(a0 a0Var, int i10) {
            d0.b(this, a0Var, i10);
        }

        public /* synthetic */ int e(i iVar, int i10, boolean z10) {
            return d0.a(this, iVar, i10, z10);
        }

        public void f(a0 a0Var, int i10, int i11) {
            h(this.f22963f + i10);
            a0Var.l(this.f22962e, this.f22963f, i10);
            this.f22963f += i10;
        }
    }

    /* compiled from: HlsSampleStreamWrapper */
    private static final class d extends p0 {
        private final Map<String, m> H;
        private m I;

        private f3.a h0(f3.a aVar) {
            if (aVar == null) {
                return null;
            }
            int e10 = aVar.e();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= e10) {
                    i11 = -1;
                    break;
                }
                a.b d10 = aVar.d(i11);
                if ((d10 instanceof l) && "com.apple.streaming.transportStreamTimestamp".equals(((l) d10).f19663b)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return aVar;
            }
            if (e10 == 1) {
                return null;
            }
            a.b[] bVarArr = new a.b[(e10 - 1)];
            while (i10 < e10) {
                if (i10 != i11) {
                    bVarArr[i10 < i11 ? i10 : i10 - 1] = aVar.d(i10);
                }
                i10++;
            }
            return new f3.a(bVarArr);
        }

        public void b(long j10, int i10, int i11, int i12, e0.a aVar) {
            super.b(j10, i10, i11, i12, aVar);
        }

        public void i0(m mVar) {
            this.I = mVar;
            I();
        }

        public void j0(i iVar) {
            f0(iVar.f22886k);
        }

        public r1 w(r1 r1Var) {
            m mVar;
            m mVar2 = this.I;
            if (mVar2 == null) {
                mVar2 = r1Var.f20657p;
            }
            if (!(mVar2 == null || (mVar = this.H.get(mVar2.f22079c)) == null)) {
                mVar2 = mVar;
            }
            f3.a h02 = h0(r1Var.f20652k);
            if (!(mVar2 == r1Var.f20657p && h02 == r1Var.f20652k)) {
                r1Var = r1Var.b().O(mVar2).Z(h02).G();
            }
            return super.w(r1Var);
        }

        private d(j4.b bVar, y yVar, w.a aVar, Map<String, m> map) {
            super(bVar, yVar, aVar);
            this.H = map;
        }
    }

    public p(String str, int i10, b bVar, f fVar, Map<String, m> map, j4.b bVar2, long j10, r1 r1Var, y yVar, w.a aVar, g0 g0Var, e0.a aVar2, int i11) {
        this.f22931a = str;
        this.f22932b = i10;
        this.f22933c = bVar;
        this.f22934d = fVar;
        this.f22950u = map;
        this.f22935f = bVar2;
        this.f22936g = r1Var;
        this.f22937h = yVar;
        this.f22938i = aVar;
        this.f22939j = g0Var;
        this.f22941l = aVar2;
        this.f22942m = i11;
        Set<Integer> set = Z;
        this.f22954y = new HashSet(set.size());
        this.f22955z = new SparseIntArray(set.size());
        this.f22952w = new d[0];
        this.P = new boolean[0];
        this.O = new boolean[0];
        ArrayList<i> arrayList = new ArrayList<>();
        this.f22944o = arrayList;
        this.f22945p = Collections.unmodifiableList(arrayList);
        this.f22949t = new ArrayList<>();
        this.f22946q = new o(this);
        this.f22947r = new n(this);
        this.f22948s = n0.w();
        this.Q = j10;
        this.R = j10;
    }

    private static k B(int i10, int i11) {
        r.i("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new k();
    }

    private p0 C(int i10, int i11) {
        int length = this.f22952w.length;
        boolean z10 = true;
        if (!(i11 == 1 || i11 == 2)) {
            z10 = false;
        }
        d dVar = new d(this.f22935f, this.f22937h, this.f22938i, this.f22950u);
        dVar.b0(this.Q);
        if (z10) {
            dVar.i0(this.X);
        }
        dVar.a0(this.W);
        i iVar = this.Y;
        if (iVar != null) {
            dVar.j0(iVar);
        }
        dVar.d0(this);
        int i12 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f22953x, i12);
        this.f22953x = copyOf;
        copyOf[length] = i10;
        this.f22952w = (d[]) n0.F0(this.f22952w, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.P, i12);
        this.P = copyOf2;
        copyOf2[length] = z10;
        this.N = copyOf2[length] | this.N;
        this.f22954y.add(Integer.valueOf(i11));
        this.f22955z.append(i11, length);
        if (L(i11) > L(this.B)) {
            this.C = length;
            this.B = i11;
        }
        this.O = Arrays.copyOf(this.O, i12);
        return dVar;
    }

    private z0 D(x0[] x0VarArr) {
        for (int i10 = 0; i10 < x0VarArr.length; i10++) {
            x0 x0Var = x0VarArr[i10];
            r1[] r1VarArr = new r1[x0Var.f21688a];
            for (int i11 = 0; i11 < x0Var.f21688a; i11++) {
                r1 b10 = x0Var.b(i11);
                r1VarArr[i11] = b10.c(this.f22937h.b(b10));
            }
            x0VarArr[i10] = new x0(x0Var.f21689b, r1VarArr);
        }
        return new z0(x0VarArr);
    }

    private static r1 E(r1 r1Var, r1 r1Var2, boolean z10) {
        String str;
        String str2;
        if (r1Var == null) {
            return r1Var2;
        }
        int k10 = v.k(r1Var2.f20654m);
        if (n0.K(r1Var.f20651j, k10) == 1) {
            str2 = n0.L(r1Var.f20651j, k10);
            str = v.g(str2);
        } else {
            str2 = v.d(r1Var.f20651j, r1Var2.f20654m);
            str = r1Var2.f20654m;
        }
        r1.b K2 = r1Var2.b().U(r1Var.f20643a).W(r1Var.f20644b).X(r1Var.f20645c).i0(r1Var.f20646d).e0(r1Var.f20647f).I(z10 ? r1Var.f20648g : -1).b0(z10 ? r1Var.f20649h : -1).K(str2);
        if (k10 == 2) {
            K2.n0(r1Var.f20659r).S(r1Var.f20660s).R(r1Var.f20661t);
        }
        if (str != null) {
            K2.g0(str);
        }
        int i10 = r1Var.f20667z;
        if (i10 != -1 && k10 == 1) {
            K2.J(i10);
        }
        f3.a aVar = r1Var.f20652k;
        if (aVar != null) {
            f3.a aVar2 = r1Var2.f20652k;
            if (aVar2 != null) {
                aVar = aVar2.b(aVar);
            }
            K2.Z(aVar);
        }
        return K2.G();
    }

    private void F(int i10) {
        k4.a.f(!this.f22940k.j());
        while (true) {
            if (i10 >= this.f22944o.size()) {
                i10 = -1;
                break;
            } else if (z(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            long j10 = J().f22134h;
            i G2 = G(i10);
            if (this.f22944o.isEmpty()) {
                this.R = this.Q;
            } else {
                ((i) b0.d(this.f22944o)).o();
            }
            this.U = false;
            this.f22941l.D(this.B, G2.f22133g, j10);
        }
    }

    private i G(int i10) {
        i iVar = this.f22944o.get(i10);
        ArrayList<i> arrayList = this.f22944o;
        n0.N0(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.f22952w.length; i11++) {
            this.f22952w[i11].u(iVar.m(i11));
        }
        return iVar;
    }

    private boolean H(i iVar) {
        int i10 = iVar.f22886k;
        int length = this.f22952w.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.O[i11] && this.f22952w[i11].Q() == i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean I(r1 r1Var, r1 r1Var2) {
        String str = r1Var.f20654m;
        String str2 = r1Var2.f20654m;
        int k10 = v.k(str);
        if (k10 != 3) {
            if (k10 == v.k(str2)) {
                return true;
            }
            return false;
        } else if (!n0.c(str, str2)) {
            return false;
        } else {
            if (("application/cea-608".equals(str) || "application/cea-708".equals(str)) && r1Var.E != r1Var2.E) {
                return false;
            }
            return true;
        }
    }

    private i J() {
        ArrayList<i> arrayList = this.f22944o;
        return arrayList.get(arrayList.size() - 1);
    }

    private s2.e0 K(int i10, int i11) {
        k4.a.a(Z.contains(Integer.valueOf(i11)));
        int i12 = this.f22955z.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f22954y.add(Integer.valueOf(i11))) {
            this.f22953x[i12] = i10;
        }
        if (this.f22953x[i12] == i10) {
            return this.f22952w[i12];
        }
        return B(i10, i11);
    }

    private static int L(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    private void M(i iVar) {
        this.Y = iVar;
        this.G = iVar.f22130d;
        this.R = -9223372036854775807L;
        this.f22944o.add(iVar);
        u.a p10 = u.p();
        for (d G2 : this.f22952w) {
            p10.a(Integer.valueOf(G2.G()));
        }
        iVar.n(this, p10.k());
        for (d dVar : this.f22952w) {
            dVar.j0(iVar);
            if (iVar.f22889n) {
                dVar.g0();
            }
        }
    }

    private static boolean N(r3.f fVar) {
        return fVar instanceof i;
    }

    private boolean O() {
        return this.R != -9223372036854775807L;
    }

    private void R() {
        int i10 = this.J.f21696a;
        int[] iArr = new int[i10];
        this.L = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.f22952w;
                if (i12 >= dVarArr.length) {
                    break;
                } else if (I((r1) k4.a.h(dVarArr[i12].F()), this.J.b(i11).b(0))) {
                    this.L[i11] = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        Iterator<l> it = this.f22949t.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* access modifiers changed from: private */
    public void S() {
        if (!this.I && this.L == null && this.D) {
            d[] dVarArr = this.f22952w;
            int length = dVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                if (dVarArr[i10].F() != null) {
                    i10++;
                } else {
                    return;
                }
            }
            if (this.J != null) {
                R();
                return;
            }
            y();
            k0();
            this.f22933c.onPrepared();
        }
    }

    /* access modifiers changed from: private */
    public void b0() {
        this.D = true;
        S();
    }

    private void f0() {
        for (d W2 : this.f22952w) {
            W2.W(this.S);
        }
        this.S = false;
    }

    private boolean g0(long j10) {
        int length = this.f22952w.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f22952w[i10].Z(j10, false) && (this.P[i10] || !this.N)) {
                return false;
            }
        }
        return true;
    }

    private void k0() {
        this.E = true;
    }

    private void p0(q0[] q0VarArr) {
        this.f22949t.clear();
        for (l lVar : q0VarArr) {
            if (lVar != null) {
                this.f22949t.add(lVar);
            }
        }
    }

    private void w() {
        k4.a.f(this.E);
        k4.a.e(this.J);
        k4.a.e(this.K);
    }

    private void y() {
        r1 r1Var;
        r1 r1Var2;
        int length = this.f22952w.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = -2;
        int i12 = -1;
        while (true) {
            int i13 = 2;
            if (i10 >= length) {
                break;
            }
            String str = ((r1) k4.a.h(this.f22952w[i10].F())).f20654m;
            if (!v.s(str)) {
                if (v.o(str)) {
                    i13 = 1;
                } else {
                    i13 = v.r(str) ? 3 : -2;
                }
            }
            if (L(i13) > L(i11)) {
                i12 = i10;
                i11 = i13;
            } else if (i13 == i11 && i12 != -1) {
                i12 = -1;
            }
            i10++;
        }
        x0 j10 = this.f22934d.j();
        int i14 = j10.f21688a;
        this.M = -1;
        this.L = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.L[i15] = i15;
        }
        x0[] x0VarArr = new x0[length];
        int i16 = 0;
        while (i16 < length) {
            r1 r1Var3 = (r1) k4.a.h(this.f22952w[i16].F());
            if (i16 == i12) {
                r1[] r1VarArr = new r1[i14];
                for (int i17 = 0; i17 < i14; i17++) {
                    r1 b10 = j10.b(i17);
                    if (i11 == 1 && (r1Var2 = this.f22936g) != null) {
                        b10 = b10.j(r1Var2);
                    }
                    if (i14 == 1) {
                        r1Var = r1Var3.j(b10);
                    } else {
                        r1Var = E(b10, r1Var3, true);
                    }
                    r1VarArr[i17] = r1Var;
                }
                x0VarArr[i16] = new x0(this.f22931a, r1VarArr);
                this.M = i16;
            } else {
                r1 r1Var4 = (i11 != 2 || !v.o(r1Var3.f20654m)) ? null : this.f22936g;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f22931a);
                sb2.append(":muxed:");
                sb2.append(i16 < i12 ? i16 : i16 - 1);
                x0VarArr[i16] = new x0(sb2.toString(), E(r1Var4, r1Var3, false));
            }
            i16++;
        }
        this.J = D(x0VarArr);
        if (this.K == null) {
            z10 = true;
        }
        k4.a.f(z10);
        this.K = Collections.emptySet();
    }

    private boolean z(int i10) {
        for (int i11 = i10; i11 < this.f22944o.size(); i11++) {
            if (this.f22944o.get(i11).f22889n) {
                return false;
            }
        }
        i iVar = this.f22944o.get(i10);
        for (int i12 = 0; i12 < this.f22952w.length; i12++) {
            if (this.f22952w[i12].C() > iVar.m(i12)) {
                return false;
            }
        }
        return true;
    }

    public void A() {
        if (!this.E) {
            c(this.Q);
        }
    }

    public boolean P(int i10) {
        return !O() && this.f22952w[i10].K(this.U);
    }

    public boolean Q() {
        return this.B == 2;
    }

    public void T() throws IOException {
        this.f22940k.a();
        this.f22934d.n();
    }

    public void U(int i10) throws IOException {
        T();
        this.f22952w[i10].N();
    }

    /* renamed from: V */
    public void l(r3.f fVar, long j10, long j11, boolean z10) {
        r3.f fVar2 = fVar;
        this.f22951v = null;
        q qVar = new q(fVar2.f22127a, fVar2.f22128b, fVar.f(), fVar.e(), j10, j11, fVar.b());
        this.f22939j.b(fVar2.f22127a);
        this.f22941l.r(qVar, fVar2.f22129c, this.f22932b, fVar2.f22130d, fVar2.f22131e, fVar2.f22132f, fVar2.f22133g, fVar2.f22134h);
        if (!z10) {
            if (O() || this.F == 0) {
                f0();
            }
            if (this.F > 0) {
                this.f22933c.j(this);
            }
        }
    }

    /* renamed from: W */
    public void k(r3.f fVar, long j10, long j11) {
        r3.f fVar2 = fVar;
        this.f22951v = null;
        this.f22934d.p(fVar2);
        q qVar = new q(fVar2.f22127a, fVar2.f22128b, fVar.f(), fVar.e(), j10, j11, fVar.b());
        this.f22939j.b(fVar2.f22127a);
        this.f22941l.u(qVar, fVar2.f22129c, this.f22932b, fVar2.f22130d, fVar2.f22131e, fVar2.f22132f, fVar2.f22133g, fVar2.f22134h);
        if (!this.E) {
            c(this.Q);
        } else {
            this.f22933c.j(this);
        }
    }

    /* renamed from: X */
    public h0.c o(r3.f fVar, long j10, long j11, IOException iOException, int i10) {
        h0.c cVar;
        int i11;
        r3.f fVar2 = fVar;
        IOException iOException2 = iOException;
        boolean N2 = N(fVar);
        if (N2 && !((i) fVar2).q() && (iOException2 instanceof c0) && ((i11 = ((c0) iOException2).f19295d) == 410 || i11 == 404)) {
            return h0.f19327d;
        }
        long b10 = fVar.b();
        q qVar = new q(fVar2.f22127a, fVar2.f22128b, fVar.f(), fVar.e(), j10, j11, b10);
        g0.c cVar2 = new g0.c(qVar, new t(fVar2.f22129c, this.f22932b, fVar2.f22130d, fVar2.f22131e, fVar2.f22132f, n0.Z0(fVar2.f22133g), n0.Z0(fVar2.f22134h)), iOException2, i10);
        g0.b a10 = this.f22939j.a(i4.a0.c(this.f22934d.k()), cVar2);
        boolean z10 = false;
        boolean m10 = (a10 == null || a10.f19315a != 2) ? false : this.f22934d.m(fVar2, a10.f19316b);
        if (m10) {
            if (N2 && b10 == 0) {
                ArrayList<i> arrayList = this.f22944o;
                if (arrayList.remove(arrayList.size() - 1) == fVar2) {
                    z10 = true;
                }
                k4.a.f(z10);
                if (this.f22944o.isEmpty()) {
                    this.R = this.Q;
                } else {
                    ((i) b0.d(this.f22944o)).o();
                }
            }
            cVar = h0.f19329f;
        } else {
            long c10 = this.f22939j.c(cVar2);
            if (c10 != -9223372036854775807L) {
                cVar = h0.h(false, c10);
            } else {
                cVar = h0.f19330g;
            }
        }
        h0.c cVar3 = cVar;
        boolean z11 = !cVar3.c();
        this.f22941l.w(qVar, fVar2.f22129c, this.f22932b, fVar2.f22130d, fVar2.f22131e, fVar2.f22132f, fVar2.f22133g, fVar2.f22134h, iOException, z11);
        if (z11) {
            this.f22951v = null;
            this.f22939j.b(fVar2.f22127a);
        }
        if (m10) {
            if (!this.E) {
                c(this.Q);
            } else {
                this.f22933c.j(this);
            }
        }
        return cVar3;
    }

    public void Y() {
        this.f22954y.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r6 = r4.f22939j.a(i4.a0.c(r4.f22934d.k()), r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Z(android.net.Uri r5, j4.g0.c r6, boolean r7) {
        /*
            r4 = this;
            u3.f r0 = r4.f22934d
            boolean r0 = r0.o(r5)
            r1 = 1
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != 0) goto L_0x002b
            j4.g0 r7 = r4.f22939j
            u3.f r0 = r4.f22934d
            i4.s r0 = r0.k()
            j4.g0$a r0 = i4.a0.c(r0)
            j4.g0$b r6 = r7.a(r0, r6)
            if (r6 == 0) goto L_0x002b
            int r7 = r6.f19315a
            r0 = 2
            if (r7 != r0) goto L_0x002b
            long r6 = r6.f19316b
            goto L_0x002c
        L_0x002b:
            r6 = r2
        L_0x002c:
            u3.f r0 = r4.f22934d
            boolean r5 = r0.q(r5, r6)
            if (r5 == 0) goto L_0x0039
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.p.Z(android.net.Uri, j4.g0$c, boolean):boolean");
    }

    public void a(r1 r1Var) {
        this.f22948s.post(this.f22946q);
    }

    public void a0() {
        if (!this.f22944o.isEmpty()) {
            i iVar = (i) b0.d(this.f22944o);
            int c10 = this.f22934d.c(iVar);
            if (c10 == 1) {
                iVar.v();
            } else if (c10 == 2 && !this.U && this.f22940k.j()) {
                this.f22940k.f();
            }
        }
    }

    public long b() {
        if (O()) {
            return this.R;
        }
        if (this.U) {
            return Long.MIN_VALUE;
        }
        return J().f22134h;
    }

    public boolean c(long j10) {
        long j11;
        List<i> list;
        if (this.U || this.f22940k.j() || this.f22940k.i()) {
            return false;
        }
        if (O()) {
            list = Collections.emptyList();
            j11 = this.R;
            for (d b02 : this.f22952w) {
                b02.b0(this.R);
            }
        } else {
            list = this.f22945p;
            i J2 = J();
            if (J2.h()) {
                j11 = J2.f22134h;
            } else {
                j11 = Math.max(this.Q, J2.f22133g);
            }
        }
        List<i> list2 = list;
        long j12 = j11;
        this.f22943n.a();
        this.f22934d.e(j10, j12, list2, this.E || !list2.isEmpty(), this.f22943n);
        f.b bVar = this.f22943n;
        boolean z10 = bVar.f22875b;
        r3.f fVar = bVar.f22874a;
        Uri uri = bVar.f22876c;
        if (z10) {
            this.R = -9223372036854775807L;
            this.U = true;
            return true;
        } else if (fVar == null) {
            if (uri != null) {
                this.f22933c.i(uri);
            }
            return false;
        } else {
            if (N(fVar)) {
                M((i) fVar);
            }
            this.f22951v = fVar;
            this.f22941l.A(new q(fVar.f22127a, fVar.f22128b, this.f22940k.n(fVar, this, this.f22939j.d(fVar.f22129c))), fVar.f22129c, this.f22932b, fVar.f22130d, fVar.f22131e, fVar.f22132f, fVar.f22133g, fVar.f22134h);
            return true;
        }
    }

    public void c0(x0[] x0VarArr, int i10, int... iArr) {
        this.J = D(x0VarArr);
        this.K = new HashSet();
        for (int b10 : iArr) {
            this.K.add(this.J.b(b10));
        }
        this.M = i10;
        Handler handler = this.f22948s;
        b bVar = this.f22933c;
        Objects.requireNonNull(bVar);
        handler.post(new m(bVar));
        k0();
    }

    public long d(long j10, u3 u3Var) {
        return this.f22934d.b(j10, u3Var);
    }

    public int d0(int i10, s1 s1Var, g gVar, int i11) {
        r1 r1Var;
        if (O()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f22944o.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f22944o.size() - 1 && H(this.f22944o.get(i13))) {
                i13++;
            }
            n0.N0(this.f22944o, 0, i13);
            i iVar = this.f22944o.get(0);
            r1 r1Var2 = iVar.f22130d;
            if (!r1Var2.equals(this.H)) {
                this.f22941l.i(this.f22932b, r1Var2, iVar.f22131e, iVar.f22132f, iVar.f22133g);
            }
            this.H = r1Var2;
        }
        if (!this.f22944o.isEmpty() && !this.f22944o.get(0).q()) {
            return -3;
        }
        int S2 = this.f22952w[i10].S(s1Var, gVar, i11, this.U);
        if (S2 == -5) {
            r1 r1Var3 = (r1) k4.a.e(s1Var.f20721b);
            if (i10 == this.C) {
                int Q2 = this.f22952w[i10].Q();
                while (i12 < this.f22944o.size() && this.f22944o.get(i12).f22886k != Q2) {
                    i12++;
                }
                if (i12 < this.f22944o.size()) {
                    r1Var = this.f22944o.get(i12).f22130d;
                } else {
                    r1Var = (r1) k4.a.e(this.G);
                }
                r1Var3 = r1Var3.j(r1Var);
            }
            s1Var.f20721b = r1Var3;
        }
        return S2;
    }

    public s2.e0 e(int i10, int i11) {
        s2.e0 e0Var;
        if (!Z.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                s2.e0[] e0VarArr = this.f22952w;
                if (i12 >= e0VarArr.length) {
                    e0Var = null;
                    break;
                } else if (this.f22953x[i12] == i10) {
                    e0Var = e0VarArr[i12];
                    break;
                } else {
                    i12++;
                }
            }
        } else {
            e0Var = K(i10, i11);
        }
        if (e0Var == null) {
            if (this.V) {
                return B(i10, i11);
            }
            e0Var = C(i10, i11);
        }
        if (i11 != 5) {
            return e0Var;
        }
        if (this.A == null) {
            this.A = new c(e0Var, this.f22942m);
        }
        return this.A;
    }

    public void e0() {
        if (this.E) {
            for (d R2 : this.f22952w) {
                R2.R();
            }
        }
        this.f22940k.m(this);
        this.f22948s.removeCallbacksAndMessages((Object) null);
        this.I = true;
        this.f22949t.clear();
    }

    public long f() {
        if (this.U) {
            return Long.MIN_VALUE;
        }
        if (O()) {
            return this.R;
        }
        long j10 = this.Q;
        i J2 = J();
        if (!J2.h()) {
            if (this.f22944o.size() > 1) {
                ArrayList<i> arrayList = this.f22944o;
                J2 = arrayList.get(arrayList.size() - 2);
            } else {
                J2 = null;
            }
        }
        if (J2 != null) {
            j10 = Math.max(j10, J2.f22134h);
        }
        if (this.D) {
            for (d z10 : this.f22952w) {
                j10 = Math.max(j10, z10.z());
            }
        }
        return j10;
    }

    public void g(long j10) {
        if (!this.f22940k.i() && !O()) {
            if (this.f22940k.j()) {
                k4.a.e(this.f22951v);
                if (this.f22934d.v(j10, this.f22951v, this.f22945p)) {
                    this.f22940k.f();
                    return;
                }
                return;
            }
            int size = this.f22945p.size();
            while (size > 0 && this.f22934d.c(this.f22945p.get(size - 1)) == 2) {
                size--;
            }
            if (size < this.f22945p.size()) {
                F(size);
            }
            int h10 = this.f22934d.h(j10, this.f22945p);
            if (h10 < this.f22944o.size()) {
                F(h10);
            }
        }
    }

    public boolean h0(long j10, boolean z10) {
        this.Q = j10;
        if (O()) {
            this.R = j10;
            return true;
        }
        if (this.D && !z10 && g0(j10)) {
            return false;
        }
        this.R = j10;
        this.U = false;
        this.f22944o.clear();
        if (this.f22940k.j()) {
            if (this.D) {
                for (d r10 : this.f22952w) {
                    r10.r();
                }
            }
            this.f22940k.f();
        } else {
            this.f22940k.g();
            f0();
        }
        return true;
    }

    public void i() {
        for (d T2 : this.f22952w) {
            T2.T();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i0(i4.s[] r20, boolean[] r21, p3.q0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r12 = r24
            r19.w()
            int r3 = r0.F
            r14 = 0
            r4 = 0
        L_0x000f:
            int r5 = r1.length
            r6 = 0
            r15 = 1
            if (r4 >= r5) goto L_0x002f
            r5 = r2[r4]
            u3.l r5 = (u3.l) r5
            if (r5 == 0) goto L_0x002c
            r7 = r1[r4]
            if (r7 == 0) goto L_0x0022
            boolean r7 = r21[r4]
            if (r7 != 0) goto L_0x002c
        L_0x0022:
            int r7 = r0.F
            int r7 = r7 - r15
            r0.F = r7
            r5.d()
            r2[r4] = r6
        L_0x002c:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x002f:
            if (r26 != 0) goto L_0x0041
            boolean r4 = r0.T
            if (r4 == 0) goto L_0x0038
            if (r3 != 0) goto L_0x003f
            goto L_0x0041
        L_0x0038:
            long r3 = r0.Q
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r3 = 0
            goto L_0x0042
        L_0x0041:
            r3 = 1
        L_0x0042:
            u3.f r4 = r0.f22934d
            i4.s r4 = r4.k()
            r16 = r3
            r11 = r4
            r3 = 0
        L_0x004c:
            int r5 = r1.length
            if (r3 >= r5) goto L_0x00a3
            r5 = r1[r3]
            if (r5 != 0) goto L_0x0054
            goto L_0x00a0
        L_0x0054:
            p3.z0 r7 = r0.J
            p3.x0 r8 = r5.a()
            int r7 = r7.c(r8)
            int r8 = r0.M
            if (r7 != r8) goto L_0x0068
            u3.f r8 = r0.f22934d
            r8.u(r5)
            r11 = r5
        L_0x0068:
            r5 = r2[r3]
            if (r5 != 0) goto L_0x00a0
            int r5 = r0.F
            int r5 = r5 + r15
            r0.F = r5
            u3.l r5 = new u3.l
            r5.<init>(r0, r7)
            r2[r3] = r5
            r23[r3] = r15
            int[] r5 = r0.L
            if (r5 == 0) goto L_0x00a0
            r5 = r2[r3]
            u3.l r5 = (u3.l) r5
            r5.b()
            if (r16 != 0) goto L_0x00a0
            u3.p$d[] r5 = r0.f22952w
            int[] r8 = r0.L
            r7 = r8[r7]
            r5 = r5[r7]
            boolean r7 = r5.Z(r12, r15)
            if (r7 != 0) goto L_0x009d
            int r5 = r5.C()
            if (r5 == 0) goto L_0x009d
            r5 = 1
            goto L_0x009e
        L_0x009d:
            r5 = 0
        L_0x009e:
            r16 = r5
        L_0x00a0:
            int r3 = r3 + 1
            goto L_0x004c
        L_0x00a3:
            int r1 = r0.F
            if (r1 != 0) goto L_0x00da
            u3.f r1 = r0.f22934d
            r1.r()
            r0.H = r6
            r0.S = r15
            java.util.ArrayList<u3.i> r1 = r0.f22944o
            r1.clear()
            j4.h0 r1 = r0.f22940k
            boolean r1 = r1.j()
            if (r1 == 0) goto L_0x00d5
            boolean r1 = r0.D
            if (r1 == 0) goto L_0x00ce
            u3.p$d[] r1 = r0.f22952w
            int r3 = r1.length
        L_0x00c4:
            if (r14 >= r3) goto L_0x00ce
            r4 = r1[r14]
            r4.r()
            int r14 = r14 + 1
            goto L_0x00c4
        L_0x00ce:
            j4.h0 r1 = r0.f22940k
            r1.f()
            goto L_0x0140
        L_0x00d5:
            r19.f0()
            goto L_0x0140
        L_0x00da:
            java.util.ArrayList<u3.i> r1 = r0.f22944o
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x012d
            boolean r1 = k4.n0.c(r11, r4)
            if (r1 != 0) goto L_0x012d
            boolean r1 = r0.T
            if (r1 != 0) goto L_0x0124
            r3 = 0
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f3
            long r3 = -r12
        L_0x00f3:
            r6 = r3
            u3.i r1 = r19.J()
            u3.f r3 = r0.f22934d
            r3.o[] r17 = r3.a(r1, r12)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<u3.i> r10 = r0.f22945p
            r3 = r11
            r4 = r24
            r18 = r11
            r11 = r17
            r3.k(r4, r6, r8, r10, r11)
            u3.f r3 = r0.f22934d
            p3.x0 r3 = r3.j()
            n2.r1 r1 = r1.f22130d
            int r1 = r3.c(r1)
            int r3 = r18.n()
            if (r3 == r1) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r1 = 0
            goto L_0x0125
        L_0x0124:
            r1 = 1
        L_0x0125:
            if (r1 == 0) goto L_0x012d
            r0.S = r15
            r1 = 1
            r16 = 1
            goto L_0x012f
        L_0x012d:
            r1 = r26
        L_0x012f:
            if (r16 == 0) goto L_0x0140
            r0.h0(r12, r1)
        L_0x0134:
            int r1 = r2.length
            if (r14 >= r1) goto L_0x0140
            r1 = r2[r14]
            if (r1 == 0) goto L_0x013d
            r23[r14] = r15
        L_0x013d:
            int r14 = r14 + 1
            goto L_0x0134
        L_0x0140:
            r0.p0(r2)
            r0.T = r15
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.p.i0(i4.s[], boolean[], p3.q0[], boolean[], long, boolean):boolean");
    }

    public boolean isLoading() {
        return this.f22940k.j();
    }

    public void j(s2.b0 b0Var) {
    }

    public void j0(m mVar) {
        if (!n0.c(this.X, mVar)) {
            this.X = mVar;
            int i10 = 0;
            while (true) {
                d[] dVarArr = this.f22952w;
                if (i10 < dVarArr.length) {
                    if (this.P[i10]) {
                        dVarArr[i10].i0(mVar);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void l0(boolean z10) {
        this.f22934d.t(z10);
    }

    public void m() throws IOException {
        T();
        if (this.U && !this.E) {
            throw y2.a("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    public void m0(long j10) {
        if (this.W != j10) {
            this.W = j10;
            for (d a02 : this.f22952w) {
                a02.a0(j10);
            }
        }
    }

    public int n0(int i10, long j10) {
        if (O()) {
            return 0;
        }
        d dVar = this.f22952w[i10];
        int E2 = dVar.E(j10, this.U);
        i iVar = (i) b0.e(this.f22944o, null);
        if (iVar != null && !iVar.q()) {
            E2 = Math.min(E2, iVar.m(i10) - dVar.C());
        }
        dVar.e0(E2);
        return E2;
    }

    public void o0(int i10) {
        w();
        k4.a.e(this.L);
        int i11 = this.L[i10];
        k4.a.f(this.O[i11]);
        this.O[i11] = false;
    }

    public void q() {
        this.V = true;
        this.f22948s.post(this.f22947r);
    }

    public z0 s() {
        w();
        return this.J;
    }

    public void t(long j10, boolean z10) {
        if (this.D && !O()) {
            int length = this.f22952w.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f22952w[i10].q(j10, z10, this.O[i10]);
            }
        }
    }

    public int x(int i10) {
        w();
        k4.a.e(this.L);
        int i11 = this.L[i10];
        if (i11 != -1) {
            boolean[] zArr = this.O;
            if (zArr[i11]) {
                return -2;
            }
            zArr[i11] = true;
            return i11;
        } else if (this.K.contains(this.J.b(i10))) {
            return -3;
        } else {
            return -2;
        }
    }
}
