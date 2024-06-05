package r3;

import j4.g0;
import j4.h0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.n0;
import n2.r1;
import n2.s1;
import n2.u3;
import p3.e0;
import p3.p0;
import p3.q;
import p3.q0;
import p3.r0;
import q2.g;
import r2.w;
import r2.y;
import r3.j;

/* compiled from: ChunkSampleStream */
public class i<T extends j> implements q0, r0, h0.b<f>, h0.f {

    /* renamed from: a  reason: collision with root package name */
    public final int f22138a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int[] f22139b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final r1[] f22140c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final boolean[] f22141d;

    /* renamed from: f  reason: collision with root package name */
    private final T f22142f;

    /* renamed from: g  reason: collision with root package name */
    private final r0.a<i<T>> f22143g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final e0.a f22144h;

    /* renamed from: i  reason: collision with root package name */
    private final g0 f22145i;

    /* renamed from: j  reason: collision with root package name */
    private final h0 f22146j;

    /* renamed from: k  reason: collision with root package name */
    private final h f22147k;

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList<a> f22148l;

    /* renamed from: m  reason: collision with root package name */
    private final List<a> f22149m;

    /* renamed from: n  reason: collision with root package name */
    private final p0 f22150n;

    /* renamed from: o  reason: collision with root package name */
    private final p0[] f22151o;

    /* renamed from: p  reason: collision with root package name */
    private final c f22152p;

    /* renamed from: q  reason: collision with root package name */
    private f f22153q;

    /* renamed from: r  reason: collision with root package name */
    private r1 f22154r;

    /* renamed from: s  reason: collision with root package name */
    private b<T> f22155s;

    /* renamed from: t  reason: collision with root package name */
    private long f22156t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public long f22157u;

    /* renamed from: v  reason: collision with root package name */
    private int f22158v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public a f22159w;

    /* renamed from: x  reason: collision with root package name */
    boolean f22160x;

    /* compiled from: ChunkSampleStream */
    public final class a implements q0 {

        /* renamed from: a  reason: collision with root package name */
        public final i<T> f22161a;

        /* renamed from: b  reason: collision with root package name */
        private final p0 f22162b;

        /* renamed from: c  reason: collision with root package name */
        private final int f22163c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f22164d;

        public a(i<T> iVar, p0 p0Var, int i10) {
            this.f22161a = iVar;
            this.f22162b = p0Var;
            this.f22163c = i10;
        }

        private void b() {
            if (!this.f22164d) {
                i.this.f22144h.i(i.this.f22139b[this.f22163c], i.this.f22140c[this.f22163c], 0, (Object) null, i.this.f22157u);
                this.f22164d = true;
            }
        }

        public void a() {
        }

        public void c() {
            k4.a.f(i.this.f22141d[this.f22163c]);
            i.this.f22141d[this.f22163c] = false;
        }

        public int e(long j10) {
            if (i.this.G()) {
                return 0;
            }
            int E = this.f22162b.E(j10, i.this.f22160x);
            if (i.this.f22159w != null) {
                E = Math.min(E, i.this.f22159w.i(this.f22163c + 1) - this.f22162b.C());
            }
            this.f22162b.e0(E);
            if (E > 0) {
                b();
            }
            return E;
        }

        public boolean isReady() {
            return !i.this.G() && this.f22162b.K(i.this.f22160x);
        }

        public int j(s1 s1Var, g gVar, int i10) {
            if (i.this.G()) {
                return -3;
            }
            if (i.this.f22159w != null && i.this.f22159w.i(this.f22163c + 1) <= this.f22162b.C()) {
                return -3;
            }
            b();
            return this.f22162b.S(s1Var, gVar, i10, i.this.f22160x);
        }
    }

    /* compiled from: ChunkSampleStream */
    public interface b<T extends j> {
        void a(i<T> iVar);
    }

    public i(int i10, int[] iArr, r1[] r1VarArr, T t10, r0.a<i<T>> aVar, j4.b bVar, long j10, y yVar, w.a aVar2, g0 g0Var, e0.a aVar3) {
        this.f22138a = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f22139b = iArr;
        this.f22140c = r1VarArr == null ? new r1[0] : r1VarArr;
        this.f22142f = t10;
        this.f22143g = aVar;
        this.f22144h = aVar3;
        this.f22145i = g0Var;
        this.f22146j = new h0("ChunkSampleStream");
        this.f22147k = new h();
        ArrayList<a> arrayList = new ArrayList<>();
        this.f22148l = arrayList;
        this.f22149m = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f22151o = new p0[length];
        this.f22141d = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        p0[] p0VarArr = new p0[i12];
        p0 k10 = p0.k(bVar, yVar, aVar2);
        this.f22150n = k10;
        iArr2[0] = i10;
        p0VarArr[0] = k10;
        while (i11 < length) {
            p0 l10 = p0.l(bVar);
            this.f22151o[i11] = l10;
            int i13 = i11 + 1;
            p0VarArr[i13] = l10;
            iArr2[i13] = this.f22139b[i11];
            i11 = i13;
        }
        this.f22152p = new c(iArr2, p0VarArr);
        this.f22156t = j10;
        this.f22157u = j10;
    }

    private void A(int i10) {
        k4.a.f(!this.f22146j.j());
        int size = this.f22148l.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!E(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            long j10 = D().f22134h;
            a B = B(i10);
            if (this.f22148l.isEmpty()) {
                this.f22156t = this.f22157u;
            }
            this.f22160x = false;
            this.f22144h.D(this.f22138a, B.f22133g, j10);
        }
    }

    private a B(int i10) {
        a aVar = this.f22148l.get(i10);
        ArrayList<a> arrayList = this.f22148l;
        n0.N0(arrayList, i10, arrayList.size());
        this.f22158v = Math.max(this.f22158v, this.f22148l.size());
        int i11 = 0;
        this.f22150n.u(aVar.i(0));
        while (true) {
            p0[] p0VarArr = this.f22151o;
            if (i11 >= p0VarArr.length) {
                return aVar;
            }
            p0 p0Var = p0VarArr[i11];
            i11++;
            p0Var.u(aVar.i(i11));
        }
    }

    private a D() {
        ArrayList<a> arrayList = this.f22148l;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean E(int i10) {
        int C;
        a aVar = this.f22148l.get(i10);
        if (this.f22150n.C() > aVar.i(0)) {
            return true;
        }
        int i11 = 0;
        do {
            p0[] p0VarArr = this.f22151o;
            if (i11 >= p0VarArr.length) {
                return false;
            }
            C = p0VarArr[i11].C();
            i11++;
        } while (C <= aVar.i(i11));
        return true;
    }

    private boolean F(f fVar) {
        return fVar instanceof a;
    }

    private void H() {
        int M = M(this.f22150n.C(), this.f22158v - 1);
        while (true) {
            int i10 = this.f22158v;
            if (i10 <= M) {
                this.f22158v = i10 + 1;
                I(i10);
            } else {
                return;
            }
        }
    }

    private void I(int i10) {
        a aVar = this.f22148l.get(i10);
        r1 r1Var = aVar.f22130d;
        if (!r1Var.equals(this.f22154r)) {
            this.f22144h.i(this.f22138a, r1Var, aVar.f22131e, aVar.f22132f, aVar.f22133g);
        }
        this.f22154r = r1Var;
    }

    private int M(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f22148l.size()) {
                return this.f22148l.size() - 1;
            }
        } while (this.f22148l.get(i11).i(0) <= i10);
        return i11 - 1;
    }

    private void P() {
        this.f22150n.V();
        for (p0 V : this.f22151o) {
            V.V();
        }
    }

    private void z(int i10) {
        int min = Math.min(M(i10, 0), this.f22158v);
        if (min > 0) {
            n0.N0(this.f22148l, 0, min);
            this.f22158v -= min;
        }
    }

    public T C() {
        return this.f22142f;
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return this.f22156t != -9223372036854775807L;
    }

    /* renamed from: J */
    public void l(f fVar, long j10, long j11, boolean z10) {
        f fVar2 = fVar;
        this.f22153q = null;
        this.f22159w = null;
        q qVar = new q(fVar2.f22127a, fVar2.f22128b, fVar.f(), fVar.e(), j10, j11, fVar.b());
        this.f22145i.b(fVar2.f22127a);
        this.f22144h.r(qVar, fVar2.f22129c, this.f22138a, fVar2.f22130d, fVar2.f22131e, fVar2.f22132f, fVar2.f22133g, fVar2.f22134h);
        if (!z10) {
            if (G()) {
                P();
            } else if (F(fVar)) {
                B(this.f22148l.size() - 1);
                if (this.f22148l.isEmpty()) {
                    this.f22156t = this.f22157u;
                }
            }
            this.f22143g.j(this);
        }
    }

    /* renamed from: K */
    public void k(f fVar, long j10, long j11) {
        f fVar2 = fVar;
        this.f22153q = null;
        this.f22142f.e(fVar2);
        q qVar = new q(fVar2.f22127a, fVar2.f22128b, fVar.f(), fVar.e(), j10, j11, fVar.b());
        this.f22145i.b(fVar2.f22127a);
        this.f22144h.u(qVar, fVar2.f22129c, this.f22138a, fVar2.f22130d, fVar2.f22131e, fVar2.f22132f, fVar2.f22133g, fVar2.f22134h);
        this.f22143g.j(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f1  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j4.h0.c o(r3.f r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            long r12 = r31.b()
            boolean r14 = r30.F(r31)
            java.util.ArrayList<r3.a> r2 = r0.f22148l
            int r2 = r2.size()
            r15 = 1
            int r10 = r2 + -1
            r11 = 0
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0027
            if (r14 == 0) goto L_0x0027
            boolean r2 = r0.E(r10)
            if (r2 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r8 = 0
            goto L_0x0028
        L_0x0027:
            r8 = 1
        L_0x0028:
            p3.q r9 = new p3.q
            long r3 = r1.f22127a
            j4.p r5 = r1.f22128b
            android.net.Uri r6 = r31.f()
            java.util.Map r7 = r31.e()
            r2 = r9
            r15 = r8
            r17 = r14
            r14 = r9
            r8 = r32
            r29 = r10
            r10 = r34
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            p3.t r2 = new p3.t
            int r3 = r1.f22129c
            int r4 = r0.f22138a
            n2.r1 r5 = r1.f22130d
            int r6 = r1.f22131e
            java.lang.Object r7 = r1.f22132f
            long r8 = r1.f22133g
            long r24 = k4.n0.Z0(r8)
            long r8 = r1.f22134h
            long r26 = k4.n0.Z0(r8)
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r26)
            j4.g0$c r3 = new j4.g0$c
            r4 = r36
            r5 = r37
            r3.<init>(r14, r2, r4, r5)
            T r2 = r0.f22142f
            j4.g0 r5 = r0.f22145i
            boolean r2 = r2.h(r1, r15, r3, r5)
            if (r2 == 0) goto L_0x00a6
            if (r15 == 0) goto L_0x009f
            j4.h0$c r2 = j4.h0.f19329f
            if (r17 == 0) goto L_0x00a7
            r6 = r29
            r3.a r6 = r0.B(r6)
            if (r6 != r1) goto L_0x008e
            r11 = 1
            goto L_0x008f
        L_0x008e:
            r11 = 0
        L_0x008f:
            k4.a.f(r11)
            java.util.ArrayList<r3.a> r6 = r0.f22148l
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00a7
            long r6 = r0.f22157u
            r0.f22156t = r6
            goto L_0x00a7
        L_0x009f:
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r6 = "Ignoring attempt to cancel non-cancelable load."
            k4.r.i(r2, r6)
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            if (r2 != 0) goto L_0x00c0
            j4.g0 r2 = r0.f22145i
            long r2 = r2.c(r3)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x00be
            r6 = 0
            j4.h0$c r2 = j4.h0.h(r6, r2)
            goto L_0x00c0
        L_0x00be:
            j4.h0$c r2 = j4.h0.f19330g
        L_0x00c0:
            boolean r3 = r2.c()
            r6 = 1
            r3 = r3 ^ r6
            p3.e0$a r6 = r0.f22144h
            int r7 = r1.f22129c
            int r8 = r0.f22138a
            n2.r1 r9 = r1.f22130d
            int r10 = r1.f22131e
            java.lang.Object r11 = r1.f22132f
            long r12 = r1.f22133g
            long r4 = r1.f22134h
            r16 = r6
            r17 = r14
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r11
            r23 = r12
            r25 = r4
            r27 = r36
            r28 = r3
            r16.w(r17, r18, r19, r20, r21, r22, r23, r25, r27, r28)
            if (r3 == 0) goto L_0x0100
            r3 = 0
            r0.f22153q = r3
            j4.g0 r3 = r0.f22145i
            long r4 = r1.f22127a
            r3.b(r4)
            p3.r0$a<r3.i<T>> r1 = r0.f22143g
            r1.j(r0)
        L_0x0100:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.i.o(r3.f, long, long, java.io.IOException, int):j4.h0$c");
    }

    public void N() {
        O((b) null);
    }

    public void O(b<T> bVar) {
        this.f22155s = bVar;
        this.f22150n.R();
        for (p0 R : this.f22151o) {
            R.R();
        }
        this.f22146j.m(this);
    }

    public void Q(long j10) {
        boolean z10;
        this.f22157u = j10;
        if (G()) {
            this.f22156t = j10;
            return;
        }
        a aVar = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f22148l.size()) {
                break;
            }
            a aVar2 = this.f22148l.get(i11);
            int i12 = (aVar2.f22133g > j10 ? 1 : (aVar2.f22133g == j10 ? 0 : -1));
            if (i12 == 0 && aVar2.f22100k == -9223372036854775807L) {
                aVar = aVar2;
                break;
            } else if (i12 > 0) {
                break;
            } else {
                i11++;
            }
        }
        if (aVar != null) {
            z10 = this.f22150n.Y(aVar.i(0));
        } else {
            z10 = this.f22150n.Z(j10, j10 < b());
        }
        if (z10) {
            this.f22158v = M(this.f22150n.C(), 0);
            p0[] p0VarArr = this.f22151o;
            int length = p0VarArr.length;
            while (i10 < length) {
                p0VarArr[i10].Z(j10, true);
                i10++;
            }
            return;
        }
        this.f22156t = j10;
        this.f22160x = false;
        this.f22148l.clear();
        this.f22158v = 0;
        if (this.f22146j.j()) {
            this.f22150n.r();
            p0[] p0VarArr2 = this.f22151o;
            int length2 = p0VarArr2.length;
            while (i10 < length2) {
                p0VarArr2[i10].r();
                i10++;
            }
            this.f22146j.f();
            return;
        }
        this.f22146j.g();
        P();
    }

    public i<T>.defpackage.a R(long j10, int i10) {
        for (int i11 = 0; i11 < this.f22151o.length; i11++) {
            if (this.f22139b[i11] == i10) {
                k4.a.f(!this.f22141d[i11]);
                this.f22141d[i11] = true;
                this.f22151o[i11].Z(j10, true);
                return new a(this, this.f22151o[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    public void a() throws IOException {
        this.f22146j.a();
        this.f22150n.N();
        if (!this.f22146j.j()) {
            this.f22142f.a();
        }
    }

    public long b() {
        if (G()) {
            return this.f22156t;
        }
        if (this.f22160x) {
            return Long.MIN_VALUE;
        }
        return D().f22134h;
    }

    public boolean c(long j10) {
        long j11;
        List<a> list;
        if (this.f22160x || this.f22146j.j() || this.f22146j.i()) {
            return false;
        }
        boolean G = G();
        if (G) {
            list = Collections.emptyList();
            j11 = this.f22156t;
        } else {
            list = this.f22149m;
            j11 = D().f22134h;
        }
        this.f22142f.g(j10, j11, list, this.f22147k);
        h hVar = this.f22147k;
        boolean z10 = hVar.f22137b;
        f fVar = hVar.f22136a;
        hVar.a();
        if (z10) {
            this.f22156t = -9223372036854775807L;
            this.f22160x = true;
            return true;
        } else if (fVar == null) {
            return false;
        } else {
            this.f22153q = fVar;
            if (F(fVar)) {
                a aVar = (a) fVar;
                if (G) {
                    long j12 = aVar.f22133g;
                    long j13 = this.f22156t;
                    if (j12 != j13) {
                        this.f22150n.b0(j13);
                        for (p0 b02 : this.f22151o) {
                            b02.b0(this.f22156t);
                        }
                    }
                    this.f22156t = -9223372036854775807L;
                }
                aVar.k(this.f22152p);
                this.f22148l.add(aVar);
            } else if (fVar instanceof m) {
                ((m) fVar).g(this.f22152p);
            }
            this.f22144h.A(new q(fVar.f22127a, fVar.f22128b, this.f22146j.n(fVar, this, this.f22145i.d(fVar.f22129c))), fVar.f22129c, this.f22138a, fVar.f22130d, fVar.f22131e, fVar.f22132f, fVar.f22133g, fVar.f22134h);
            return true;
        }
    }

    public long d(long j10, u3 u3Var) {
        return this.f22142f.d(j10, u3Var);
    }

    public int e(long j10) {
        if (G()) {
            return 0;
        }
        int E = this.f22150n.E(j10, this.f22160x);
        a aVar = this.f22159w;
        if (aVar != null) {
            E = Math.min(E, aVar.i(0) - this.f22150n.C());
        }
        this.f22150n.e0(E);
        H();
        return E;
    }

    public long f() {
        if (this.f22160x) {
            return Long.MIN_VALUE;
        }
        if (G()) {
            return this.f22156t;
        }
        long j10 = this.f22157u;
        a D = D();
        if (!D.h()) {
            if (this.f22148l.size() > 1) {
                ArrayList<a> arrayList = this.f22148l;
                D = arrayList.get(arrayList.size() - 2);
            } else {
                D = null;
            }
        }
        if (D != null) {
            j10 = Math.max(j10, D.f22134h);
        }
        return Math.max(j10, this.f22150n.z());
    }

    public void g(long j10) {
        if (!this.f22146j.i() && !G()) {
            if (this.f22146j.j()) {
                f fVar = (f) k4.a.e(this.f22153q);
                if ((!F(fVar) || !E(this.f22148l.size() - 1)) && this.f22142f.j(j10, fVar, this.f22149m)) {
                    this.f22146j.f();
                    if (F(fVar)) {
                        this.f22159w = (a) fVar;
                        return;
                    }
                    return;
                }
                return;
            }
            int i10 = this.f22142f.i(j10, this.f22149m);
            if (i10 < this.f22148l.size()) {
                A(i10);
            }
        }
    }

    public void i() {
        this.f22150n.T();
        for (p0 T : this.f22151o) {
            T.T();
        }
        this.f22142f.release();
        b<T> bVar = this.f22155s;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public boolean isLoading() {
        return this.f22146j.j();
    }

    public boolean isReady() {
        return !G() && this.f22150n.K(this.f22160x);
    }

    public int j(s1 s1Var, g gVar, int i10) {
        if (G()) {
            return -3;
        }
        a aVar = this.f22159w;
        if (aVar != null && aVar.i(0) <= this.f22150n.C()) {
            return -3;
        }
        H();
        return this.f22150n.S(s1Var, gVar, i10, this.f22160x);
    }

    public void t(long j10, boolean z10) {
        if (!G()) {
            int x10 = this.f22150n.x();
            this.f22150n.q(j10, z10, true);
            int x11 = this.f22150n.x();
            if (x11 > x10) {
                long y10 = this.f22150n.y();
                int i10 = 0;
                while (true) {
                    p0[] p0VarArr = this.f22151o;
                    if (i10 >= p0VarArr.length) {
                        break;
                    }
                    p0VarArr[i10].q(y10, z10, this.f22141d[i10]);
                    i10++;
                }
            }
            z(x11);
        }
    }
}
