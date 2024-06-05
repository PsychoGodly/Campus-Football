package w;

import java.util.ArrayList;
import s.d;
import v.d;
import v.e;
import v.f;
import v.g;
import v.h;
import v.j;
import v.k;

/* compiled from: BasicMeasure */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<e> f23405a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private a f23406b = new a();

    /* renamed from: c  reason: collision with root package name */
    private f f23407c;

    /* compiled from: BasicMeasure */
    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static int f23408k = 0;

        /* renamed from: l  reason: collision with root package name */
        public static int f23409l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static int f23410m = 2;

        /* renamed from: a  reason: collision with root package name */
        public e.b f23411a;

        /* renamed from: b  reason: collision with root package name */
        public e.b f23412b;

        /* renamed from: c  reason: collision with root package name */
        public int f23413c;

        /* renamed from: d  reason: collision with root package name */
        public int f23414d;

        /* renamed from: e  reason: collision with root package name */
        public int f23415e;

        /* renamed from: f  reason: collision with root package name */
        public int f23416f;

        /* renamed from: g  reason: collision with root package name */
        public int f23417g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f23418h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f23419i;

        /* renamed from: j  reason: collision with root package name */
        public int f23420j;
    }

    /* renamed from: w.b$b  reason: collision with other inner class name */
    /* compiled from: BasicMeasure */
    public interface C0242b {
        void a();

        void b(e eVar, a aVar);
    }

    public b(f fVar) {
        this.f23407c = fVar;
    }

    private boolean a(C0242b bVar, e eVar, int i10) {
        this.f23406b.f23411a = eVar.y();
        this.f23406b.f23412b = eVar.R();
        this.f23406b.f23413c = eVar.U();
        this.f23406b.f23414d = eVar.v();
        a aVar = this.f23406b;
        aVar.f23419i = false;
        aVar.f23420j = i10;
        e.b bVar2 = aVar.f23411a;
        e.b bVar3 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar2 == bVar3;
        boolean z11 = aVar.f23412b == bVar3;
        boolean z12 = z10 && eVar.f23076d0 > 0.0f;
        boolean z13 = z11 && eVar.f23076d0 > 0.0f;
        if (z12 && eVar.f23117y[0] == 4) {
            aVar.f23411a = e.b.FIXED;
        }
        if (z13 && eVar.f23117y[1] == 4) {
            aVar.f23412b = e.b.FIXED;
        }
        bVar.b(eVar, aVar);
        eVar.h1(this.f23406b.f23415e);
        eVar.I0(this.f23406b.f23416f);
        eVar.H0(this.f23406b.f23418h);
        eVar.x0(this.f23406b.f23417g);
        a aVar2 = this.f23406b;
        aVar2.f23420j = a.f23408k;
        return aVar2.f23419i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r8 != r9) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        if (r5.f23076d0 <= 0.0f) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(v.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<v.e> r0 = r13.L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.P1(r1)
            w.b$b r2 = r13.F1()
            r3 = 0
            r4 = 0
        L_0x0012:
            if (r4 >= r0) goto L_0x00a4
            java.util.ArrayList<v.e> r5 = r13.L0
            java.lang.Object r5 = r5.get(r4)
            v.e r5 = (v.e) r5
            boolean r6 = r5 instanceof v.g
            if (r6 == 0) goto L_0x0022
            goto L_0x00a0
        L_0x0022:
            boolean r6 = r5 instanceof v.a
            if (r6 == 0) goto L_0x0028
            goto L_0x00a0
        L_0x0028:
            boolean r6 = r5.j0()
            if (r6 == 0) goto L_0x0030
            goto L_0x00a0
        L_0x0030:
            if (r1 == 0) goto L_0x0047
            w.l r6 = r5.f23077e
            if (r6 == 0) goto L_0x0047
            w.n r7 = r5.f23079f
            if (r7 == 0) goto L_0x0047
            w.g r6 = r6.f23489e
            boolean r6 = r6.f23441j
            if (r6 == 0) goto L_0x0047
            w.g r6 = r7.f23489e
            boolean r6 = r6.f23441j
            if (r6 == 0) goto L_0x0047
            goto L_0x00a0
        L_0x0047:
            v.e$b r6 = r5.s(r3)
            r7 = 1
            v.e$b r8 = r5.s(r7)
            v.e$b r9 = v.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0060
            int r10 = r5.f23113w
            if (r10 == r7) goto L_0x0060
            if (r8 != r9) goto L_0x0060
            int r10 = r5.f23115x
            if (r10 == r7) goto L_0x0060
            r10 = 1
            goto L_0x0061
        L_0x0060:
            r10 = 0
        L_0x0061:
            if (r10 != 0) goto L_0x0097
            boolean r11 = r13.P1(r7)
            if (r11 == 0) goto L_0x0097
            boolean r11 = r5 instanceof v.k
            if (r11 != 0) goto L_0x0097
            if (r6 != r9) goto L_0x007c
            int r11 = r5.f23113w
            if (r11 != 0) goto L_0x007c
            if (r8 == r9) goto L_0x007c
            boolean r11 = r5.g0()
            if (r11 != 0) goto L_0x007c
            r10 = 1
        L_0x007c:
            if (r8 != r9) goto L_0x008b
            int r11 = r5.f23115x
            if (r11 != 0) goto L_0x008b
            if (r6 == r9) goto L_0x008b
            boolean r11 = r5.g0()
            if (r11 != 0) goto L_0x008b
            r10 = 1
        L_0x008b:
            if (r6 == r9) goto L_0x008f
            if (r8 != r9) goto L_0x0097
        L_0x008f:
            float r6 = r5.f23076d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r7 = r10
        L_0x0098:
            if (r7 == 0) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            int r6 = w.b.a.f23408k
            r12.a(r2, r5, r6)
        L_0x00a0:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00a4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.b.b(v.f):void");
    }

    private void c(f fVar, String str, int i10, int i11, int i12) {
        int G = fVar.G();
        int F = fVar.F();
        fVar.X0(0);
        fVar.W0(0);
        fVar.h1(i11);
        fVar.I0(i12);
        fVar.X0(G);
        fVar.W0(F);
        this.f23407c.T1(i10);
        this.f23407c.p1();
    }

    public long d(f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19;
        boolean z10;
        int i20;
        f fVar2;
        int i21;
        boolean z11;
        int i22;
        boolean z12;
        b bVar = this;
        f fVar3 = fVar;
        int i23 = i10;
        int i24 = i13;
        int i25 = i15;
        C0242b F1 = fVar.F1();
        int size = fVar3.L0.size();
        int U = fVar.U();
        int v10 = fVar.v();
        boolean b10 = j.b(i23, 128);
        boolean z13 = b10 || j.b(i23, 64);
        if (z13) {
            int i26 = 0;
            while (true) {
                if (i26 >= size) {
                    break;
                }
                e eVar = fVar3.L0.get(i26);
                e.b y10 = eVar.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z14 = (y10 == bVar2) && (eVar.R() == bVar2) && eVar.t() > 0.0f;
                if ((!eVar.g0() || !z14) && ((!eVar.i0() || !z14) && !(eVar instanceof k) && !eVar.g0() && !eVar.i0())) {
                    i26++;
                }
            }
            z13 = false;
        }
        if (z13) {
            s.e eVar2 = d.f22213x;
        }
        boolean z15 = z13 & ((i24 == 1073741824 && i25 == 1073741824) || b10);
        if (z15) {
            int min = Math.min(fVar.E(), i14);
            int min2 = Math.min(fVar.D(), i16);
            if (i24 == 1073741824 && fVar.U() != min) {
                fVar3.h1(min);
                fVar.I1();
            }
            if (i25 == 1073741824 && fVar.v() != min2) {
                fVar3.I0(min2);
                fVar.I1();
            }
            if (i24 == 1073741824 && i25 == 1073741824) {
                z10 = fVar3.C1(b10);
                i19 = 2;
            } else {
                boolean D1 = fVar3.D1(b10);
                if (i24 == 1073741824) {
                    D1 &= fVar3.E1(b10, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i25 == 1073741824) {
                    z10 = fVar3.E1(b10, 1) & D1;
                    i19++;
                } else {
                    z10 = D1;
                }
            }
            if (z10) {
                fVar3.m1(i24 == 1073741824, i25 == 1073741824);
            }
        } else {
            z10 = false;
            i19 = 0;
        }
        if (z10 && i19 == 2) {
            return 0;
        }
        int G1 = fVar.G1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f23405a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, U, v10);
        }
        if (size2 > 0) {
            e.b y11 = fVar.y();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z16 = y11 == bVar3;
            boolean z17 = fVar.R() == bVar3;
            int max = Math.max(fVar.U(), bVar.f23407c.G());
            int max2 = Math.max(fVar.v(), bVar.f23407c.F());
            int i27 = 0;
            boolean z18 = false;
            while (i27 < size2) {
                e eVar3 = bVar.f23405a.get(i27);
                if (!(eVar3 instanceof k)) {
                    i22 = G1;
                } else {
                    int U2 = eVar3.U();
                    int v11 = eVar3.v();
                    i22 = G1;
                    boolean a10 = bVar.a(F1, eVar3, a.f23409l) | z18;
                    int U3 = eVar3.U();
                    boolean z19 = a10;
                    int v12 = eVar3.v();
                    if (U3 != U2) {
                        eVar3.h1(U3);
                        if (z16 && eVar3.K() > max) {
                            max = Math.max(max, eVar3.K() + eVar3.m(d.b.RIGHT).e());
                        }
                        z12 = true;
                    } else {
                        z12 = z19;
                    }
                    if (v12 != v11) {
                        eVar3.I0(v12);
                        if (z17 && eVar3.p() > max2) {
                            max2 = Math.max(max2, eVar3.p() + eVar3.m(d.b.BOTTOM).e());
                        }
                        z12 = true;
                    }
                    z18 = z12 | ((k) eVar3).s1();
                }
                i27++;
                f fVar4 = fVar;
                G1 = i22;
            }
            int i28 = G1;
            int i29 = 0;
            int i30 = 2;
            while (i29 < i30) {
                int i31 = 0;
                while (i31 < size2) {
                    e eVar4 = bVar.f23405a.get(i31);
                    if ((!(eVar4 instanceof h) || (eVar4 instanceof k)) && !(eVar4 instanceof g) && eVar4.T() != 8 && ((!z15 || !eVar4.f23077e.f23489e.f23441j || !eVar4.f23079f.f23489e.f23441j) && !(eVar4 instanceof k))) {
                        int U4 = eVar4.U();
                        int v13 = eVar4.v();
                        z11 = z15;
                        int n10 = eVar4.n();
                        int i32 = a.f23409l;
                        i21 = size2;
                        if (i29 == 1) {
                            i32 = a.f23410m;
                        }
                        boolean a11 = bVar.a(F1, eVar4, i32) | z18;
                        int U5 = eVar4.U();
                        int v14 = eVar4.v();
                        if (U5 != U4) {
                            eVar4.h1(U5);
                            if (z16 && eVar4.K() > max) {
                                max = Math.max(max, eVar4.K() + eVar4.m(d.b.RIGHT).e());
                            }
                            a11 = true;
                        }
                        if (v14 != v13) {
                            eVar4.I0(v14);
                            if (z17 && eVar4.p() > max2) {
                                max2 = Math.max(max2, eVar4.p() + eVar4.m(d.b.BOTTOM).e());
                            }
                            a11 = true;
                        }
                        z18 = (!eVar4.X() || n10 == eVar4.n()) ? a11 : true;
                    } else {
                        z11 = z15;
                        i21 = size2;
                    }
                    i31++;
                    bVar = this;
                    z15 = z11;
                    size2 = i21;
                }
                boolean z20 = z15;
                int i33 = size2;
                if (!z18) {
                    break;
                }
                i29++;
                c(fVar, "intermediate pass", i29, U, v10);
                bVar = this;
                z15 = z20;
                size2 = i33;
                i30 = 2;
                z18 = false;
            }
            fVar2 = fVar;
            i20 = i28;
        } else {
            fVar2 = fVar;
            i20 = G1;
        }
        fVar2.S1(i20);
        return 0;
    }

    public void e(f fVar) {
        this.f23405a.clear();
        int size = fVar.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = fVar.L0.get(i10);
            e.b y10 = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (y10 == bVar || eVar.R() == bVar) {
                this.f23405a.add(eVar);
            }
        }
        fVar.I1();
    }
}
