package c3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c3.i0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k4.a0;
import k4.j0;
import k4.n0;
import k4.z;
import n2.y2;
import s2.b0;
import s2.l;
import s2.m;
import s2.n;
import s2.r;

/* compiled from: TsExtractor */
public final class h0 implements l {

    /* renamed from: t  reason: collision with root package name */
    public static final r f5703t = g0.f5689b;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f5704a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5705b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final List<j0> f5706c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f5707d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseIntArray f5708e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final i0.c f5709f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final SparseArray<i0> f5710g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final SparseBooleanArray f5711h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final SparseBooleanArray f5712i;

    /* renamed from: j  reason: collision with root package name */
    private final f0 f5713j;

    /* renamed from: k  reason: collision with root package name */
    private e0 f5714k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public n f5715l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f5716m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f5717n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f5718o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5719p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public i0 f5720q;

    /* renamed from: r  reason: collision with root package name */
    private int f5721r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public int f5722s;

    /* compiled from: TsExtractor */
    private class a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final z f5723a = new z(new byte[4]);

        public a() {
        }

        public void a(j0 j0Var, n nVar, i0.d dVar) {
        }

        public void c(a0 a0Var) {
            if (a0Var.G() == 0 && (a0Var.G() & 128) != 0) {
                a0Var.U(6);
                int a10 = a0Var.a() / 4;
                for (int i10 = 0; i10 < a10; i10++) {
                    a0Var.k(this.f5723a, 4);
                    int h10 = this.f5723a.h(16);
                    this.f5723a.r(3);
                    if (h10 == 0) {
                        this.f5723a.r(13);
                    } else {
                        int h11 = this.f5723a.h(13);
                        if (h0.this.f5710g.get(h11) == null) {
                            h0.this.f5710g.put(h11, new c0(new b(h11)));
                            h0.k(h0.this);
                        }
                    }
                }
                if (h0.this.f5704a != 2) {
                    h0.this.f5710g.remove(0);
                }
            }
        }
    }

    /* compiled from: TsExtractor */
    private class b implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final z f5725a = new z(new byte[5]);

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray<i0> f5726b = new SparseArray<>();

        /* renamed from: c  reason: collision with root package name */
        private final SparseIntArray f5727c = new SparseIntArray();

        /* renamed from: d  reason: collision with root package name */
        private final int f5728d;

        public b(int i10) {
            this.f5728d = i10;
        }

        private i0.b b(a0 a0Var, int i10) {
            int f10 = a0Var.f();
            int i11 = i10 + f10;
            String str = null;
            ArrayList arrayList = null;
            int i12 = -1;
            while (a0Var.f() < i11) {
                int G = a0Var.G();
                int f11 = a0Var.f() + a0Var.G();
                if (f11 > i11) {
                    break;
                }
                if (G == 5) {
                    long I = a0Var.I();
                    if (I != 1094921523) {
                        if (I != 1161904947) {
                            if (I != 1094921524) {
                                if (I == 1212503619) {
                                    i12 = 36;
                                }
                                a0Var.U(f11 - a0Var.f());
                            }
                        }
                        i12 = 135;
                        a0Var.U(f11 - a0Var.f());
                    }
                    i12 = 129;
                    a0Var.U(f11 - a0Var.f());
                } else {
                    if (G != 106) {
                        if (G != 122) {
                            if (G == 127) {
                                if (a0Var.G() != 21) {
                                }
                            } else if (G == 123) {
                                i12 = 138;
                            } else if (G == 10) {
                                str = a0Var.D(3).trim();
                            } else if (G == 89) {
                                arrayList = new ArrayList();
                                while (a0Var.f() < f11) {
                                    String trim = a0Var.D(3).trim();
                                    int G2 = a0Var.G();
                                    byte[] bArr = new byte[4];
                                    a0Var.l(bArr, 0, 4);
                                    arrayList.add(new i0.a(trim, G2, bArr));
                                }
                                i12 = 89;
                            } else if (G == 111) {
                                i12 = 257;
                            }
                            a0Var.U(f11 - a0Var.f());
                        }
                        i12 = 135;
                        a0Var.U(f11 - a0Var.f());
                    }
                    i12 = 129;
                    a0Var.U(f11 - a0Var.f());
                }
                i12 = 172;
                a0Var.U(f11 - a0Var.f());
            }
            a0Var.T(i11);
            return new i0.b(i12, str, arrayList, Arrays.copyOfRange(a0Var.e(), f10, i11));
        }

        public void a(j0 j0Var, n nVar, i0.d dVar) {
        }

        public void c(a0 a0Var) {
            j0 j0Var;
            i0 i0Var;
            a0 a0Var2 = a0Var;
            if (a0Var.G() == 2) {
                if (h0.this.f5704a == 1 || h0.this.f5704a == 2 || h0.this.f5716m == 1) {
                    j0Var = (j0) h0.this.f5706c.get(0);
                } else {
                    j0Var = new j0(((j0) h0.this.f5706c.get(0)).c());
                    h0.this.f5706c.add(j0Var);
                }
                if ((a0Var.G() & 128) != 0) {
                    a0Var2.U(1);
                    int M = a0Var.M();
                    int i10 = 3;
                    a0Var2.U(3);
                    a0Var2.k(this.f5725a, 2);
                    this.f5725a.r(3);
                    int i11 = 13;
                    int unused = h0.this.f5722s = this.f5725a.h(13);
                    a0Var2.k(this.f5725a, 2);
                    int i12 = 4;
                    this.f5725a.r(4);
                    a0Var2.U(this.f5725a.h(12));
                    if (h0.this.f5704a == 2 && h0.this.f5720q == null) {
                        i0.b bVar = new i0.b(21, (String) null, (List<i0.a>) null, n0.f19743f);
                        h0 h0Var = h0.this;
                        i0 unused2 = h0Var.f5720q = h0Var.f5709f.a(21, bVar);
                        if (h0.this.f5720q != null) {
                            h0.this.f5720q.a(j0Var, h0.this.f5715l, new i0.d(M, 21, 8192));
                        }
                    }
                    this.f5726b.clear();
                    this.f5727c.clear();
                    int a10 = a0Var.a();
                    while (a10 > 0) {
                        a0Var2.k(this.f5725a, 5);
                        int h10 = this.f5725a.h(8);
                        this.f5725a.r(i10);
                        int h11 = this.f5725a.h(i11);
                        this.f5725a.r(i12);
                        int h12 = this.f5725a.h(12);
                        i0.b b10 = b(a0Var2, h12);
                        if (h10 == 6 || h10 == 5) {
                            h10 = b10.f5755a;
                        }
                        a10 -= h12 + 5;
                        int i13 = h0.this.f5704a == 2 ? h10 : h11;
                        if (!h0.this.f5711h.get(i13)) {
                            if (h0.this.f5704a == 2 && h10 == 21) {
                                i0Var = h0.this.f5720q;
                            } else {
                                i0Var = h0.this.f5709f.a(h10, b10);
                            }
                            if (h0.this.f5704a != 2 || h11 < this.f5727c.get(i13, 8192)) {
                                this.f5727c.put(i13, h11);
                                this.f5726b.put(i13, i0Var);
                            }
                        }
                        i10 = 3;
                        i12 = 4;
                        i11 = 13;
                    }
                    int size = this.f5727c.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        int keyAt = this.f5727c.keyAt(i14);
                        int valueAt = this.f5727c.valueAt(i14);
                        h0.this.f5711h.put(keyAt, true);
                        h0.this.f5712i.put(valueAt, true);
                        i0 valueAt2 = this.f5726b.valueAt(i14);
                        if (valueAt2 != null) {
                            if (valueAt2 != h0.this.f5720q) {
                                valueAt2.a(j0Var, h0.this.f5715l, new i0.d(M, keyAt, 8192));
                            }
                            h0.this.f5710g.put(valueAt, valueAt2);
                        }
                    }
                    if (h0.this.f5704a != 2) {
                        h0.this.f5710g.remove(this.f5728d);
                        h0 h0Var2 = h0.this;
                        int unused3 = h0Var2.f5716m = h0Var2.f5704a == 1 ? 0 : h0.this.f5716m - 1;
                        if (h0.this.f5716m == 0) {
                            h0.this.f5715l.q();
                            boolean unused4 = h0.this.f5717n = true;
                        }
                    } else if (!h0.this.f5717n) {
                        h0.this.f5715l.q();
                        int unused5 = h0.this.f5716m = 0;
                        boolean unused6 = h0.this.f5717n = true;
                    }
                }
            }
        }
    }

    public h0() {
        this(0);
    }

    static /* synthetic */ int k(h0 h0Var) {
        int i10 = h0Var.f5716m;
        h0Var.f5716m = i10 + 1;
        return i10;
    }

    private boolean u(m mVar) throws IOException {
        byte[] e10 = this.f5707d.e();
        if (9400 - this.f5707d.f() < 188) {
            int a10 = this.f5707d.a();
            if (a10 > 0) {
                System.arraycopy(e10, this.f5707d.f(), e10, 0, a10);
            }
            this.f5707d.R(e10, a10);
        }
        while (this.f5707d.a() < 188) {
            int g10 = this.f5707d.g();
            int read = mVar.read(e10, g10, 9400 - g10);
            if (read == -1) {
                return false;
            }
            this.f5707d.S(g10 + read);
        }
        return true;
    }

    private int v() throws y2 {
        int f10 = this.f5707d.f();
        int g10 = this.f5707d.g();
        int a10 = j0.a(this.f5707d.e(), f10, g10);
        this.f5707d.T(a10);
        int i10 = a10 + 188;
        if (i10 > g10) {
            int i11 = this.f5721r + (a10 - f10);
            this.f5721r = i11;
            if (this.f5704a == 2 && i11 > 376) {
                throw y2.a("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
            }
        } else {
            this.f5721r = 0;
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ l[] w() {
        return new l[]{new h0()};
    }

    private void x(long j10) {
        if (!this.f5718o) {
            this.f5718o = true;
            if (this.f5713j.b() != -9223372036854775807L) {
                e0 e0Var = new e0(this.f5713j.c(), this.f5713j.b(), j10, this.f5722s, this.f5705b);
                this.f5714k = e0Var;
                this.f5715l.j(e0Var.b());
                return;
            }
            this.f5715l.j(new b0.b(this.f5713j.b()));
        }
    }

    private void y() {
        this.f5711h.clear();
        this.f5710g.clear();
        SparseArray<i0> b10 = this.f5709f.b();
        int size = b10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f5710g.put(b10.keyAt(i10), b10.valueAt(i10));
        }
        this.f5710g.put(0, new c0(new a()));
        this.f5720q = null;
    }

    private boolean z(int i10) {
        if (this.f5704a == 2 || this.f5717n || !this.f5712i.get(i10, false)) {
            return true;
        }
        return false;
    }

    public void b(n nVar) {
        this.f5715l = nVar;
    }

    public void c(long j10, long j11) {
        e0 e0Var;
        k4.a.f(this.f5704a != 2);
        int size = this.f5706c.size();
        for (int i10 = 0; i10 < size; i10++) {
            j0 j0Var = this.f5706c.get(i10);
            boolean z10 = j0Var.e() == -9223372036854775807L;
            if (!z10) {
                long c10 = j0Var.c();
                z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : true;
            }
            if (z10) {
                j0Var.g(j11);
            }
        }
        if (!(j11 == 0 || (e0Var = this.f5714k) == null)) {
            e0Var.h(j11);
        }
        this.f5707d.P(0);
        this.f5708e.clear();
        for (int i11 = 0; i11 < this.f5710g.size(); i11++) {
            this.f5710g.valueAt(i11).b();
        }
        this.f5721r = 0;
    }

    public boolean e(m mVar) throws IOException {
        boolean z10;
        byte[] e10 = this.f5707d.e();
        mVar.p(e10, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                } else if (e10[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (z10) {
                mVar.m(i10);
                return true;
            }
        }
        return false;
    }

    public int g(m mVar, s2.a0 a0Var) throws IOException {
        m mVar2 = mVar;
        s2.a0 a0Var2 = a0Var;
        long b10 = mVar.b();
        if (this.f5717n) {
            if (((b10 == -1 || this.f5704a == 2) ? false : true) && !this.f5713j.d()) {
                return this.f5713j.e(mVar2, a0Var2, this.f5722s);
            }
            x(b10);
            if (this.f5719p) {
                this.f5719p = false;
                c(0, 0);
                if (mVar.c() != 0) {
                    a0Var2.f22378a = 0;
                    return 1;
                }
            }
            e0 e0Var = this.f5714k;
            if (e0Var != null && e0Var.d()) {
                return this.f5714k.c(mVar2, a0Var2);
            }
        }
        if (!u(mVar)) {
            return -1;
        }
        int v10 = v();
        int g10 = this.f5707d.g();
        if (v10 > g10) {
            return 0;
        }
        int p10 = this.f5707d.p();
        if ((8388608 & p10) != 0) {
            this.f5707d.T(v10);
            return 0;
        }
        int i10 = ((4194304 & p10) != 0 ? 1 : 0) | 0;
        int i11 = (2096896 & p10) >> 8;
        boolean z10 = (p10 & 32) != 0;
        i0 i0Var = (p10 & 16) != 0 ? this.f5710g.get(i11) : null;
        if (i0Var == null) {
            this.f5707d.T(v10);
            return 0;
        }
        if (this.f5704a != 2) {
            int i12 = p10 & 15;
            int i13 = this.f5708e.get(i11, i12 - 1);
            this.f5708e.put(i11, i12);
            if (i13 == i12) {
                this.f5707d.T(v10);
                return 0;
            } else if (i12 != ((i13 + 1) & 15)) {
                i0Var.b();
            }
        }
        if (z10) {
            int G = this.f5707d.G();
            i10 |= (this.f5707d.G() & 64) != 0 ? 2 : 0;
            this.f5707d.U(G - 1);
        }
        boolean z11 = this.f5717n;
        if (z(i11)) {
            this.f5707d.S(v10);
            i0Var.c(this.f5707d, i10);
            this.f5707d.S(g10);
        }
        if (this.f5704a != 2 && !z11 && this.f5717n && b10 != -1) {
            this.f5719p = true;
        }
        this.f5707d.T(v10);
        return 0;
    }

    public void release() {
    }

    public h0(int i10) {
        this(1, i10, 112800);
    }

    public h0(int i10, int i11, int i12) {
        this(i10, new j0(0), new j(i11), i12);
    }

    public h0(int i10, j0 j0Var, i0.c cVar) {
        this(i10, j0Var, cVar, 112800);
    }

    public h0(int i10, j0 j0Var, i0.c cVar, int i11) {
        this.f5709f = (i0.c) k4.a.e(cVar);
        this.f5705b = i11;
        this.f5704a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f5706c = Collections.singletonList(j0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f5706c = arrayList;
            arrayList.add(j0Var);
        }
        this.f5707d = new a0(new byte[9400], 0);
        this.f5711h = new SparseBooleanArray();
        this.f5712i = new SparseBooleanArray();
        this.f5710g = new SparseArray<>();
        this.f5708e = new SparseIntArray();
        this.f5713j = new f0(i11);
        this.f5715l = n.D1;
        this.f5722s = -1;
        y();
    }
}
