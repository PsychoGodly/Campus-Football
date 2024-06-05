package s;

import java.util.Arrays;
import java.util.HashMap;
import s.i;
import v.d;
import v.e;

/* compiled from: LinearSystem */
public class d {

    /* renamed from: r  reason: collision with root package name */
    public static boolean f22207r = false;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f22208s = true;

    /* renamed from: t  reason: collision with root package name */
    public static boolean f22209t = true;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f22210u = true;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f22211v = false;

    /* renamed from: w  reason: collision with root package name */
    private static int f22212w = 1000;

    /* renamed from: x  reason: collision with root package name */
    public static e f22213x;

    /* renamed from: y  reason: collision with root package name */
    public static long f22214y;

    /* renamed from: z  reason: collision with root package name */
    public static long f22215z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22216a;

    /* renamed from: b  reason: collision with root package name */
    int f22217b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, i> f22218c;

    /* renamed from: d  reason: collision with root package name */
    private a f22219d;

    /* renamed from: e  reason: collision with root package name */
    private int f22220e;

    /* renamed from: f  reason: collision with root package name */
    private int f22221f;

    /* renamed from: g  reason: collision with root package name */
    b[] f22222g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22223h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f22224i;

    /* renamed from: j  reason: collision with root package name */
    private boolean[] f22225j;

    /* renamed from: k  reason: collision with root package name */
    int f22226k;

    /* renamed from: l  reason: collision with root package name */
    int f22227l;

    /* renamed from: m  reason: collision with root package name */
    private int f22228m;

    /* renamed from: n  reason: collision with root package name */
    final c f22229n;

    /* renamed from: o  reason: collision with root package name */
    private i[] f22230o;

    /* renamed from: p  reason: collision with root package name */
    private int f22231p;

    /* renamed from: q  reason: collision with root package name */
    private a f22232q;

    /* compiled from: LinearSystem */
    interface a {
        void a(i iVar);

        i b(d dVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    /* compiled from: LinearSystem */
    class b extends b {
        public b(c cVar) {
            this.f22201e = new j(this, cVar);
        }
    }

    public d() {
        this.f22216a = false;
        this.f22217b = 0;
        this.f22218c = null;
        this.f22220e = 32;
        this.f22221f = 32;
        this.f22222g = null;
        this.f22223h = false;
        this.f22224i = false;
        this.f22225j = new boolean[32];
        this.f22226k = 1;
        this.f22227l = 0;
        this.f22228m = 32;
        this.f22230o = new i[f22212w];
        this.f22231p = 0;
        this.f22222g = new b[32];
        C();
        c cVar = new c();
        this.f22229n = cVar;
        this.f22219d = new h(cVar);
        if (f22211v) {
            this.f22232q = new b(cVar);
        } else {
            this.f22232q = new b(cVar);
        }
    }

    private final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f22226k; i10++) {
            this.f22225j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f22226k * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f22225j[aVar.getKey().f22249c] = true;
            }
            i b10 = aVar.b(this, this.f22225j);
            if (b10 != null) {
                boolean[] zArr = this.f22225j;
                int i12 = b10.f22249c;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (b10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f22227l; i14++) {
                    b bVar = this.f22222g[i14];
                    if (bVar.f22197a.f22256k != i.a.UNRESTRICTED && !bVar.f22202f && bVar.t(b10)) {
                        float f11 = bVar.f22201e.f(b10);
                        if (f11 < 0.0f) {
                            float f12 = (-bVar.f22198b) / f11;
                            if (f12 < f10) {
                                i13 = i14;
                                f10 = f12;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    b bVar2 = this.f22222g[i13];
                    bVar2.f22197a.f22250d = -1;
                    bVar2.x(b10);
                    i iVar = bVar2.f22197a;
                    iVar.f22250d = i13;
                    iVar.i(this, bVar2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    private void C() {
        int i10 = 0;
        if (f22211v) {
            while (i10 < this.f22227l) {
                b bVar = this.f22222g[i10];
                if (bVar != null) {
                    this.f22229n.f22203a.a(bVar);
                }
                this.f22222g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f22227l) {
            b bVar2 = this.f22222g[i10];
            if (bVar2 != null) {
                this.f22229n.f22204b.a(bVar2);
            }
            this.f22222g[i10] = null;
            i10++;
        }
    }

    private i a(i.a aVar, String str) {
        i b10 = this.f22229n.f22205c.b();
        if (b10 == null) {
            b10 = new i(aVar, str);
            b10.h(aVar, str);
        } else {
            b10.f();
            b10.h(aVar, str);
        }
        int i10 = this.f22231p;
        int i11 = f22212w;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f22212w = i12;
            this.f22230o = (i[]) Arrays.copyOf(this.f22230o, i12);
        }
        i[] iVarArr = this.f22230o;
        int i13 = this.f22231p;
        this.f22231p = i13 + 1;
        iVarArr[i13] = b10;
        return b10;
    }

    private final void l(b bVar) {
        int i10;
        if (!f22209t || !bVar.f22202f) {
            b[] bVarArr = this.f22222g;
            int i11 = this.f22227l;
            bVarArr[i11] = bVar;
            i iVar = bVar.f22197a;
            iVar.f22250d = i11;
            this.f22227l = i11 + 1;
            iVar.i(this, bVar);
        } else {
            bVar.f22197a.g(this, bVar.f22198b);
        }
        if (f22209t && this.f22216a) {
            int i12 = 0;
            while (i12 < this.f22227l) {
                if (this.f22222g[i12] == null) {
                    System.out.println("WTF");
                }
                b[] bVarArr2 = this.f22222g;
                if (bVarArr2[i12] != null && bVarArr2[i12].f22202f) {
                    b bVar2 = bVarArr2[i12];
                    bVar2.f22197a.g(this, bVar2.f22198b);
                    if (f22211v) {
                        this.f22229n.f22203a.a(bVar2);
                    } else {
                        this.f22229n.f22204b.a(bVar2);
                    }
                    this.f22222g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f22227l;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr3 = this.f22222g;
                        int i15 = i13 - 1;
                        bVarArr3[i15] = bVarArr3[i13];
                        if (bVarArr3[i15].f22197a.f22250d == i13) {
                            bVarArr3[i15].f22197a.f22250d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f22222g[i14] = null;
                    }
                    this.f22227l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f22216a = false;
        }
    }

    private void n() {
        for (int i10 = 0; i10 < this.f22227l; i10++) {
            b bVar = this.f22222g[i10];
            bVar.f22197a.f22252g = bVar.f22198b;
        }
    }

    public static b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) throws Exception {
        boolean z10;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f22227l) {
                z10 = false;
                break;
            }
            b[] bVarArr = this.f22222g;
            if (bVarArr[i10].f22197a.f22256k != i.a.UNRESTRICTED && bVarArr[i10].f22198b < 0.0f) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (!z10) {
            return 0;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            float f10 = Float.MAX_VALUE;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < this.f22227l; i15++) {
                b bVar = this.f22222g[i15];
                if (bVar.f22197a.f22256k != i.a.UNRESTRICTED && !bVar.f22202f && bVar.f22198b < 0.0f) {
                    int i16 = 9;
                    if (f22210u) {
                        int b10 = bVar.f22201e.b();
                        int i17 = 0;
                        while (i17 < b10) {
                            i e10 = bVar.f22201e.e(i17);
                            float f11 = bVar.f22201e.f(e10);
                            if (f11 > 0.0f) {
                                int i18 = 0;
                                while (i18 < i16) {
                                    float f12 = e10.f22254i[i18] / f11;
                                    if ((f12 < f10 && i18 == i14) || i18 > i14) {
                                        i13 = e10.f22249c;
                                        i14 = i18;
                                        i12 = i15;
                                        f10 = f12;
                                    }
                                    i18++;
                                    i16 = 9;
                                }
                            }
                            i17++;
                            i16 = 9;
                        }
                    } else {
                        for (int i19 = 1; i19 < this.f22226k; i19++) {
                            i iVar = this.f22229n.f22206d[i19];
                            float f13 = bVar.f22201e.f(iVar);
                            if (f13 > 0.0f) {
                                for (int i20 = 0; i20 < 9; i20++) {
                                    float f14 = iVar.f22254i[i20] / f13;
                                    if ((f14 < f10 && i20 == i14) || i20 > i14) {
                                        i13 = i19;
                                        i12 = i15;
                                        i14 = i20;
                                        f10 = f14;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i12 != -1) {
                b bVar2 = this.f22222g[i12];
                bVar2.f22197a.f22250d = -1;
                bVar2.x(this.f22229n.f22206d[i13]);
                i iVar2 = bVar2.f22197a;
                iVar2.f22250d = i12;
                iVar2.i(this, bVar2);
            } else {
                z11 = true;
            }
            if (i11 > this.f22226k / 2) {
                z11 = true;
            }
        }
        return i11;
    }

    public static e w() {
        return f22213x;
    }

    private void y() {
        int i10 = this.f22220e * 2;
        this.f22220e = i10;
        this.f22222g = (b[]) Arrays.copyOf(this.f22222g, i10);
        c cVar = this.f22229n;
        cVar.f22206d = (i[]) Arrays.copyOf(cVar.f22206d, this.f22220e);
        int i11 = this.f22220e;
        this.f22225j = new boolean[i11];
        this.f22221f = i11;
        this.f22228m = i11;
    }

    /* access modifiers changed from: package-private */
    public void A(a aVar) throws Exception {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f22229n;
            i[] iVarArr = cVar.f22206d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.f();
            }
            i10++;
        }
        cVar.f22205c.c(this.f22230o, this.f22231p);
        this.f22231p = 0;
        Arrays.fill(this.f22229n.f22206d, (Object) null);
        HashMap<String, i> hashMap = this.f22218c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f22217b = 0;
        this.f22219d.clear();
        this.f22226k = 1;
        for (int i11 = 0; i11 < this.f22227l; i11++) {
            b[] bVarArr = this.f22222g;
            if (bVarArr[i11] != null) {
                bVarArr[i11].f22199c = false;
            }
        }
        C();
        this.f22227l = 0;
        if (f22211v) {
            this.f22232q = new b(this.f22229n);
        } else {
            this.f22232q = new b(this.f22229n);
        }
    }

    public void b(e eVar, e eVar2, float f10, int i10) {
        e eVar3 = eVar;
        e eVar4 = eVar2;
        d.b bVar = d.b.LEFT;
        i q10 = q(eVar3.m(bVar));
        d.b bVar2 = d.b.TOP;
        i q11 = q(eVar3.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q12 = q(eVar3.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q13 = q(eVar3.m(bVar4));
        i q14 = q(eVar4.m(bVar));
        i q15 = q(eVar4.m(bVar2));
        i q16 = q(eVar4.m(bVar3));
        i q17 = q(eVar4.m(bVar4));
        b r10 = r();
        double d10 = (double) f10;
        i iVar = q16;
        double d11 = (double) i10;
        r10.q(q11, q13, q15, q17, (float) (Math.sin(d10) * d11));
        d(r10);
        b r11 = r();
        r11.q(q10, q12, q14, iVar, (float) (Math.cos(d10) * d11));
        d(r11);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        int i13 = i12;
        b r10 = r();
        r10.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i13 != 8) {
            r10.d(this, i13);
        }
        d(r10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(s.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r5.f22227l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f22228m
            if (r0 >= r2) goto L_0x0012
            int r0 = r5.f22226k
            int r0 = r0 + r1
            int r2 = r5.f22221f
            if (r0 < r2) goto L_0x0015
        L_0x0012:
            r5.y()
        L_0x0015:
            r0 = 0
            boolean r2 = r6.f22202f
            if (r2 != 0) goto L_0x0084
            r6.D(r5)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x0024
            return
        L_0x0024:
            r6.r()
            boolean r2 = r6.f(r5)
            if (r2 == 0) goto L_0x007b
            s.i r2 = r5.p()
            r6.f22197a = r2
            int r3 = r5.f22227l
            r5.l(r6)
            int r4 = r5.f22227l
            int r3 = r3 + r1
            if (r4 != r3) goto L_0x007b
            s.d$a r0 = r5.f22232q
            r0.c(r6)
            s.d$a r0 = r5.f22232q
            r5.B(r0, r1)
            int r0 = r2.f22250d
            r3 = -1
            if (r0 != r3) goto L_0x007c
            s.i r0 = r6.f22197a
            if (r0 != r2) goto L_0x0059
            s.i r0 = r6.v(r2)
            if (r0 == 0) goto L_0x0059
            r6.x(r0)
        L_0x0059:
            boolean r0 = r6.f22202f
            if (r0 != 0) goto L_0x0062
            s.i r0 = r6.f22197a
            r0.i(r5, r6)
        L_0x0062:
            boolean r0 = f22211v
            if (r0 == 0) goto L_0x006e
            s.c r0 = r5.f22229n
            s.f<s.b> r0 = r0.f22203a
            r0.a(r6)
            goto L_0x0075
        L_0x006e:
            s.c r0 = r5.f22229n
            s.f<s.b> r0 = r0.f22204b
            r0.a(r6)
        L_0x0075:
            int r0 = r5.f22227l
            int r0 = r0 - r1
            r5.f22227l = r0
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            boolean r0 = r6.s()
            if (r0 != 0) goto L_0x0083
            return
        L_0x0083:
            r0 = r1
        L_0x0084:
            if (r0 != 0) goto L_0x0089
            r5.l(r6)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.d.d(s.b):void");
    }

    public b e(i iVar, i iVar2, int i10, int i11) {
        if (!f22208s || i11 != 8 || !iVar2.f22253h || iVar.f22250d != -1) {
            b r10 = r();
            r10.n(iVar, iVar2, i10);
            if (i11 != 8) {
                r10.d(this, i11);
            }
            d(r10);
            return r10;
        }
        iVar.g(this, iVar2.f22252g + ((float) i10));
        return null;
    }

    public void f(i iVar, int i10) {
        if (!f22208s || iVar.f22250d != -1) {
            int i11 = iVar.f22250d;
            if (i11 != -1) {
                b bVar = this.f22222g[i11];
                if (bVar.f22202f) {
                    bVar.f22198b = (float) i10;
                } else if (bVar.f22201e.b() == 0) {
                    bVar.f22202f = true;
                    bVar.f22198b = (float) i10;
                } else {
                    b r10 = r();
                    r10.m(iVar, i10);
                    d(r10);
                }
            } else {
                b r11 = r();
                r11.i(iVar, i10);
                d(r11);
            }
        } else {
            float f10 = (float) i10;
            iVar.g(this, f10);
            for (int i12 = 0; i12 < this.f22217b + 1; i12++) {
                i iVar2 = this.f22229n.f22206d[i12];
                if (iVar2 != null && iVar2.f22260o && iVar2.f22261p == iVar.f22249c) {
                    iVar2.g(this, iVar2.f22262q + f10);
                }
            }
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        b r10 = r();
        i t10 = t();
        t10.f22251f = 0;
        r10.o(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        b r10 = r();
        i t10 = t();
        t10.f22251f = 0;
        r10.o(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f22201e.f(t10) * -1.0f), i11);
        }
        d(r10);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        b r10 = r();
        i t10 = t();
        t10.f22251f = 0;
        r10.p(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        b r10 = r();
        i t10 = t();
        t10.f22251f = 0;
        r10.p(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f22201e.f(t10) * -1.0f), i11);
        }
        d(r10);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        b r10 = r();
        r10.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            r10.d(this, i10);
        }
        d(r10);
    }

    /* access modifiers changed from: package-private */
    public void m(b bVar, int i10, int i11) {
        bVar.e(o(i11, (String) null), i10);
    }

    public i o(int i10, String str) {
        if (this.f22226k + 1 >= this.f22221f) {
            y();
        }
        i a10 = a(i.a.ERROR, str);
        int i11 = this.f22217b + 1;
        this.f22217b = i11;
        this.f22226k++;
        a10.f22249c = i11;
        a10.f22251f = i10;
        this.f22229n.f22206d[i11] = a10;
        this.f22219d.a(a10);
        return a10;
    }

    public i p() {
        if (this.f22226k + 1 >= this.f22221f) {
            y();
        }
        i a10 = a(i.a.SLACK, (String) null);
        int i10 = this.f22217b + 1;
        this.f22217b = i10;
        this.f22226k++;
        a10.f22249c = i10;
        this.f22229n.f22206d[i10] = a10;
        return a10;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f22226k + 1 >= this.f22221f) {
            y();
        }
        if (obj instanceof v.d) {
            v.d dVar = (v.d) obj;
            iVar = dVar.h();
            if (iVar == null) {
                dVar.r(this.f22229n);
                iVar = dVar.h();
            }
            int i10 = iVar.f22249c;
            if (i10 == -1 || i10 > this.f22217b || this.f22229n.f22206d[i10] == null) {
                if (i10 != -1) {
                    iVar.f();
                }
                int i11 = this.f22217b + 1;
                this.f22217b = i11;
                this.f22226k++;
                iVar.f22249c = i11;
                iVar.f22256k = i.a.UNRESTRICTED;
                this.f22229n.f22206d[i11] = iVar;
            }
        }
        return iVar;
    }

    public b r() {
        b bVar;
        if (f22211v) {
            bVar = this.f22229n.f22203a.b();
            if (bVar == null) {
                bVar = new b(this.f22229n);
                f22215z++;
            } else {
                bVar.y();
            }
        } else {
            bVar = this.f22229n.f22204b.b();
            if (bVar == null) {
                bVar = new b(this.f22229n);
                f22214y++;
            } else {
                bVar.y();
            }
        }
        i.d();
        return bVar;
    }

    public i t() {
        if (this.f22226k + 1 >= this.f22221f) {
            y();
        }
        i a10 = a(i.a.SLACK, (String) null);
        int i10 = this.f22217b + 1;
        this.f22217b = i10;
        this.f22226k++;
        a10.f22249c = i10;
        this.f22229n.f22206d[i10] = a10;
        return a10;
    }

    public c v() {
        return this.f22229n;
    }

    public int x(Object obj) {
        i h10 = ((v.d) obj).h();
        if (h10 != null) {
            return (int) (h10.f22252g + 0.5f);
        }
        return 0;
    }

    public void z() throws Exception {
        if (this.f22219d.isEmpty()) {
            n();
        } else if (this.f22223h || this.f22224i) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f22227l) {
                    z10 = true;
                    break;
                } else if (!this.f22222g[i10].f22202f) {
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                A(this.f22219d);
            } else {
                n();
            }
        } else {
            A(this.f22219d);
        }
    }
}
