package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import i4.s;
import j4.g0;
import j4.i0;
import j4.p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.n0;
import n2.r1;
import n2.u3;
import o2.u1;
import p3.e0;
import p3.n;
import p3.q0;
import p3.r0;
import p3.u;
import p3.x0;
import p3.z0;
import r2.w;
import r2.y;
import r3.i;
import t3.c;
import t3.f;
import t3.g;
import t3.j;

/* compiled from: DashMediaPeriod */
final class b implements u, r0.a<i<a>>, i.b<a> {
    private static final Pattern A = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: z  reason: collision with root package name */
    private static final Pattern f14240z = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: a  reason: collision with root package name */
    final int f14241a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0150a f14242b;

    /* renamed from: c  reason: collision with root package name */
    private final p0 f14243c;

    /* renamed from: d  reason: collision with root package name */
    private final y f14244d;

    /* renamed from: f  reason: collision with root package name */
    private final g0 f14245f;

    /* renamed from: g  reason: collision with root package name */
    private final s3.b f14246g;

    /* renamed from: h  reason: collision with root package name */
    private final long f14247h;

    /* renamed from: i  reason: collision with root package name */
    private final i0 f14248i;

    /* renamed from: j  reason: collision with root package name */
    private final j4.b f14249j;

    /* renamed from: k  reason: collision with root package name */
    private final z0 f14250k;

    /* renamed from: l  reason: collision with root package name */
    private final a[] f14251l;

    /* renamed from: m  reason: collision with root package name */
    private final p3.i f14252m;

    /* renamed from: n  reason: collision with root package name */
    private final e f14253n;

    /* renamed from: o  reason: collision with root package name */
    private final IdentityHashMap<i<a>, e.c> f14254o = new IdentityHashMap<>();

    /* renamed from: p  reason: collision with root package name */
    private final e0.a f14255p;

    /* renamed from: q  reason: collision with root package name */
    private final w.a f14256q;

    /* renamed from: r  reason: collision with root package name */
    private final u1 f14257r;

    /* renamed from: s  reason: collision with root package name */
    private u.a f14258s;

    /* renamed from: t  reason: collision with root package name */
    private i<a>[] f14259t = D(0);

    /* renamed from: u  reason: collision with root package name */
    private d[] f14260u = new d[0];

    /* renamed from: v  reason: collision with root package name */
    private r0 f14261v;

    /* renamed from: w  reason: collision with root package name */
    private c f14262w;

    /* renamed from: x  reason: collision with root package name */
    private int f14263x;

    /* renamed from: y  reason: collision with root package name */
    private List<f> f14264y;

    /* compiled from: DashMediaPeriod */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f14265a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14266b;

        /* renamed from: c  reason: collision with root package name */
        public final int f14267c;

        /* renamed from: d  reason: collision with root package name */
        public final int f14268d;

        /* renamed from: e  reason: collision with root package name */
        public final int f14269e;

        /* renamed from: f  reason: collision with root package name */
        public final int f14270f;

        /* renamed from: g  reason: collision with root package name */
        public final int f14271g;

        private a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f14266b = i10;
            this.f14265a = iArr;
            this.f14267c = i11;
            this.f14269e = i12;
            this.f14270f = i13;
            this.f14271g = i14;
            this.f14268d = i15;
        }

        public static a a(int[] iArr, int i10) {
            return new a(3, 1, iArr, i10, -1, -1, -1);
        }

        public static a b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1);
        }

        public static a c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10);
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1);
        }
    }

    public b(int i10, c cVar, s3.b bVar, int i11, a.C0150a aVar, p0 p0Var, y yVar, w.a aVar2, g0 g0Var, e0.a aVar3, long j10, i0 i0Var, j4.b bVar2, p3.i iVar, e.b bVar3, u1 u1Var) {
        j4.b bVar4 = bVar2;
        p3.i iVar2 = iVar;
        this.f14241a = i10;
        this.f14262w = cVar;
        this.f14246g = bVar;
        this.f14263x = i11;
        this.f14242b = aVar;
        this.f14243c = p0Var;
        this.f14244d = yVar;
        this.f14256q = aVar2;
        this.f14245f = g0Var;
        this.f14255p = aVar3;
        this.f14247h = j10;
        this.f14248i = i0Var;
        this.f14249j = bVar4;
        this.f14252m = iVar2;
        this.f14257r = u1Var;
        this.f14253n = new e(cVar, bVar3, bVar4);
        this.f14261v = iVar2.a(this.f14259t);
        g d10 = cVar.d(i11);
        List<f> list = d10.f22624d;
        this.f14264y = list;
        Pair<z0, a[]> q10 = q(yVar, d10.f22623c, list);
        this.f14250k = (z0) q10.first;
        this.f14251l = (a[]) q10.second;
    }

    private int[] A(s[] sVarArr) {
        int[] iArr = new int[sVarArr.length];
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            if (sVarArr[i10] != null) {
                iArr[i10] = this.f14250k.c(sVarArr[i10].a());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    private static boolean B(List<t3.a> list, int[] iArr) {
        for (int i10 : iArr) {
            List<j> list2 = list.get(i10).f22578c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!list2.get(i11).f22639e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int C(int i10, List<t3.a> list, int[][] iArr, boolean[] zArr, r1[][] r1VarArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (B(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            r1VarArr[i12] = x(list, iArr[i12]);
            if (r1VarArr[i12].length != 0) {
                i11++;
            }
        }
        return i11;
    }

    private static i<a>[] D(int i10) {
        return new i[i10];
    }

    private static r1[] F(t3.e eVar, Pattern pattern, r1 r1Var) {
        String str = eVar.f22614b;
        if (str == null) {
            return new r1[]{r1Var};
        }
        String[] R0 = n0.R0(str, ";");
        r1[] r1VarArr = new r1[R0.length];
        for (int i10 = 0; i10 < R0.length; i10++) {
            Matcher matcher = pattern.matcher(R0[i10]);
            if (!matcher.matches()) {
                return new r1[]{r1Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            r1.b b10 = r1Var.b();
            r1VarArr[i10] = b10.U(r1Var.f20643a + ":" + parseInt).H(parseInt).X(matcher.group(2)).G();
        }
        return r1VarArr;
    }

    private void H(s[] sVarArr, boolean[] zArr, q0[] q0VarArr) {
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            if (sVarArr[i10] == null || !zArr[i10]) {
                if (q0VarArr[i10] instanceof i) {
                    q0VarArr[i10].O(this);
                } else if (q0VarArr[i10] instanceof i.a) {
                    q0VarArr[i10].c();
                }
                q0VarArr[i10] = null;
            }
        }
    }

    private void I(s[] sVarArr, q0[] q0VarArr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            if ((q0VarArr[i10] instanceof n) || (q0VarArr[i10] instanceof i.a)) {
                int z11 = z(i10, iArr);
                if (z11 == -1) {
                    z10 = q0VarArr[i10] instanceof n;
                } else {
                    z10 = (q0VarArr[i10] instanceof i.a) && q0VarArr[i10].f22161a == q0VarArr[z11];
                }
                if (!z10) {
                    if (q0VarArr[i10] instanceof i.a) {
                        q0VarArr[i10].c();
                    }
                    q0VarArr[i10] = null;
                }
            }
        }
    }

    private void J(s[] sVarArr, q0[] q0VarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            s sVar = sVarArr[i10];
            if (sVar != null) {
                if (q0VarArr[i10] == null) {
                    zArr[i10] = true;
                    a aVar = this.f14251l[iArr[i10]];
                    int i11 = aVar.f14267c;
                    if (i11 == 0) {
                        q0VarArr[i10] = o(aVar, sVar, j10);
                    } else if (i11 == 2) {
                        q0VarArr[i10] = new d(this.f14264y.get(aVar.f14268d), sVar.a().b(0), this.f14262w.f22589d);
                    }
                } else if (q0VarArr[i10] instanceof i) {
                    ((a) q0VarArr[i10].C()).b(sVar);
                }
            }
        }
        for (int i12 = 0; i12 < sVarArr.length; i12++) {
            if (q0VarArr[i12] == null && sVarArr[i12] != null) {
                a aVar2 = this.f14251l[iArr[i12]];
                if (aVar2.f14267c == 1) {
                    int z10 = z(i12, iArr);
                    if (z10 == -1) {
                        q0VarArr[i12] = new n();
                    } else {
                        q0VarArr[i12] = q0VarArr[z10].R(j10, aVar2.f14266b);
                    }
                }
            }
        }
    }

    private static void k(List<f> list, x0[] x0VarArr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            f fVar = list.get(i11);
            r1 G = new r1.b().U(fVar.a()).g0("application/x-emsg").G();
            x0VarArr[i10] = new x0(fVar.a() + ":" + i11, G);
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    private static int l(y yVar, List<t3.a> list, int[][] iArr, int i10, boolean[] zArr, r1[][] r1VarArr, x0[] x0VarArr, a[] aVarArr) {
        String str;
        int i11;
        int i12;
        List<t3.a> list2 = list;
        int i13 = i10;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i13) {
            int[] iArr2 = iArr[i14];
            ArrayList arrayList = new ArrayList();
            for (int i16 : iArr2) {
                arrayList.addAll(list2.get(i16).f22578c);
            }
            int size = arrayList.size();
            r1[] r1VarArr2 = new r1[size];
            for (int i17 = 0; i17 < size; i17++) {
                r1 r1Var = ((j) arrayList.get(i17)).f22636b;
                r1VarArr2[i17] = r1Var.c(yVar.b(r1Var));
            }
            y yVar2 = yVar;
            t3.a aVar = list2.get(iArr2[0]);
            int i18 = aVar.f22576a;
            if (i18 != -1) {
                str = Integer.toString(i18);
            } else {
                str = "unset:" + i14;
            }
            int i19 = i15 + 1;
            if (zArr[i14]) {
                i11 = i19 + 1;
            } else {
                i11 = i19;
                i19 = -1;
            }
            if (r1VarArr[i14].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            x0VarArr[i15] = new x0(str, r1VarArr2);
            aVarArr[i15] = a.d(aVar.f22577b, iArr2, i15, i19, i11);
            if (i19 != -1) {
                String str2 = str + ":emsg";
                x0VarArr[i19] = new x0(str2, new r1.b().U(str2).g0("application/x-emsg").G());
                aVarArr[i19] = a.b(iArr2, i15);
            }
            if (i11 != -1) {
                x0VarArr[i11] = new x0(str + ":cc", r1VarArr[i14]);
                aVarArr[i11] = a.a(iArr2, i15);
            }
            i14++;
            i15 = i12;
        }
        return i15;
    }

    private i<a> o(a aVar, s sVar, long j10) {
        int i10;
        x0 x0Var;
        x0 x0Var2;
        int i11;
        i<a> iVar;
        a aVar2 = aVar;
        int i12 = aVar2.f14270f;
        boolean z10 = i12 != -1;
        e.c cVar = null;
        if (z10) {
            x0Var = this.f14250k.b(i12);
            i10 = 1;
        } else {
            x0Var = null;
            i10 = 0;
        }
        int i13 = aVar2.f14271g;
        boolean z11 = i13 != -1;
        if (z11) {
            x0Var2 = this.f14250k.b(i13);
            i10 += x0Var2.f21688a;
        } else {
            x0Var2 = null;
        }
        r1[] r1VarArr = new r1[i10];
        int[] iArr = new int[i10];
        if (z10) {
            r1VarArr[0] = x0Var.b(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            for (int i14 = 0; i14 < x0Var2.f21688a; i14++) {
                r1VarArr[i11] = x0Var2.b(i14);
                iArr[i11] = 3;
                arrayList.add(r1VarArr[i11]);
                i11++;
            }
        }
        if (this.f14262w.f22589d && z10) {
            cVar = this.f14253n.k();
        }
        e.c cVar2 = cVar;
        a a10 = this.f14242b.a(this.f14248i, this.f14262w, this.f14246g, this.f14263x, aVar2.f14265a, sVar, aVar2.f14266b, this.f14247h, z10, arrayList, cVar2, this.f14243c, this.f14257r);
        i<a> iVar2 = r1;
        e.c cVar3 = cVar2;
        i<a> iVar3 = new i<>(aVar2.f14266b, iArr, r1VarArr, a10, this, this.f14249j, j10, this.f14244d, this.f14256q, this.f14245f, this.f14255p);
        synchronized (this) {
            iVar = iVar2;
            this.f14254o.put(iVar, cVar3);
        }
        return iVar;
    }

    private static Pair<z0, a[]> q(y yVar, List<t3.a> list, List<f> list2) {
        int[][] y10 = y(list);
        int length = y10.length;
        boolean[] zArr = new boolean[length];
        r1[][] r1VarArr = new r1[length][];
        int C = C(length, list, y10, zArr, r1VarArr) + length + list2.size();
        x0[] x0VarArr = new x0[C];
        a[] aVarArr = new a[C];
        k(list2, x0VarArr, aVarArr, l(yVar, list, y10, length, zArr, r1VarArr, x0VarArr, aVarArr));
        return Pair.create(new z0(x0VarArr), aVarArr);
    }

    private static t3.e u(List<t3.e> list) {
        return v(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static t3.e v(List<t3.e> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            t3.e eVar = list.get(i10);
            if (str.equals(eVar.f22613a)) {
                return eVar;
            }
        }
        return null;
    }

    private static t3.e w(List<t3.e> list) {
        return v(list, "http://dashif.org/guidelines/trickmode");
    }

    private static r1[] x(List<t3.a> list, int[] iArr) {
        for (int i10 : iArr) {
            t3.a aVar = list.get(i10);
            List<t3.e> list2 = list.get(i10).f22579d;
            int i11 = 0;
            while (i11 < list2.size()) {
                t3.e eVar = list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f22613a)) {
                    return F(eVar, f14240z, new r1.b().g0("application/cea-608").U(aVar.f22576a + ":cea608").G());
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f22613a)) {
                    return F(eVar, A, new r1.b().g0("application/cea-708").U(aVar.f22576a + ":cea708").G());
                } else {
                    i11++;
                }
            }
        }
        return new r1[0];
    }

    private static int[][] y(List<t3.a> list) {
        int i10;
        t3.e u10;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i11 = 0; i11 < size; i11++) {
            sparseIntArray.put(list.get(i11).f22576a, i11);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i11));
            arrayList.add(arrayList2);
            sparseArray.put(i11, arrayList2);
        }
        for (int i12 = 0; i12 < size; i12++) {
            t3.a aVar = list.get(i12);
            t3.e w10 = w(aVar.f22580e);
            if (w10 == null) {
                w10 = w(aVar.f22581f);
            }
            if (w10 == null || (i10 = sparseIntArray.get(Integer.parseInt(w10.f22614b), -1)) == -1) {
                i10 = i12;
            }
            if (i10 == i12 && (u10 = u(aVar.f22581f)) != null) {
                for (String parseInt : n0.R0(u10.f22614b, ",")) {
                    int i13 = sparseIntArray.get(Integer.parseInt(parseInt), -1);
                    if (i13 != -1) {
                        i10 = Math.min(i10, i13);
                    }
                }
            }
            if (i10 != i12) {
                List list2 = (List) sparseArray.get(i12);
                List list3 = (List) sparseArray.get(i10);
                list3.addAll(list2);
                sparseArray.put(i12, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i14 = 0; i14 < size2; i14++) {
            iArr[i14] = v6.e.l((Collection) arrayList.get(i14));
            Arrays.sort(iArr[i14]);
        }
        return iArr;
    }

    private int z(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f14251l[i11].f14269e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f14251l[i14].f14267c == 0) {
                return i13;
            }
        }
        return -1;
    }

    /* renamed from: E */
    public void j(i<a> iVar) {
        this.f14258s.j(this);
    }

    public void G() {
        this.f14253n.o();
        for (i<a> O : this.f14259t) {
            O.O(this);
        }
        this.f14258s = null;
    }

    public void K(c cVar, int i10) {
        this.f14262w = cVar;
        this.f14263x = i10;
        this.f14253n.q(cVar);
        i<a>[] iVarArr = this.f14259t;
        if (iVarArr != null) {
            for (i<a> C : iVarArr) {
                C.C().c(cVar, i10);
            }
            this.f14258s.j(this);
        }
        this.f14264y = cVar.d(i10).f22624d;
        for (d dVar : this.f14260u) {
            Iterator<f> it = this.f14264y.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f next = it.next();
                if (next.a().equals(dVar.b())) {
                    boolean z10 = true;
                    int e10 = cVar.e() - 1;
                    if (!cVar.f22589d || i10 != e10) {
                        z10 = false;
                    }
                    dVar.d(next, z10);
                }
            }
        }
    }

    public synchronized void a(i<a> iVar) {
        e.c remove = this.f14254o.remove(iVar);
        if (remove != null) {
            remove.n();
        }
    }

    public long b() {
        return this.f14261v.b();
    }

    public boolean c(long j10) {
        return this.f14261v.c(j10);
    }

    public long d(long j10, u3 u3Var) {
        for (i<a> iVar : this.f14259t) {
            if (iVar.f22138a == 2) {
                return iVar.d(j10, u3Var);
            }
        }
        return j10;
    }

    public long f() {
        return this.f14261v.f();
    }

    public void g(long j10) {
        this.f14261v.g(j10);
    }

    public void h(u.a aVar, long j10) {
        this.f14258s = aVar;
        aVar.e(this);
    }

    public boolean isLoading() {
        return this.f14261v.isLoading();
    }

    public void m() throws IOException {
        this.f14248i.a();
    }

    public long n(long j10) {
        for (i<a> Q : this.f14259t) {
            Q.Q(j10);
        }
        for (d c10 : this.f14260u) {
            c10.c(j10);
        }
        return j10;
    }

    public long p(s[] sVarArr, boolean[] zArr, q0[] q0VarArr, boolean[] zArr2, long j10) {
        int[] A2 = A(sVarArr);
        H(sVarArr, zArr, q0VarArr);
        I(sVarArr, q0VarArr, A2);
        J(sVarArr, q0VarArr, zArr2, j10, A2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (i iVar : q0VarArr) {
            if (iVar instanceof i) {
                arrayList.add(iVar);
            } else if (iVar instanceof d) {
                arrayList2.add((d) iVar);
            }
        }
        i<a>[] D = D(arrayList.size());
        this.f14259t = D;
        arrayList.toArray(D);
        d[] dVarArr = new d[arrayList2.size()];
        this.f14260u = dVarArr;
        arrayList2.toArray(dVarArr);
        this.f14261v = this.f14252m.a(this.f14259t);
        return j10;
    }

    public long r() {
        return -9223372036854775807L;
    }

    public z0 s() {
        return this.f14250k;
    }

    public void t(long j10, boolean z10) {
        for (i<a> t10 : this.f14259t) {
            t10.t(j10, z10);
        }
    }
}
