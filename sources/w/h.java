package w;

import java.util.ArrayList;
import v.a;
import v.e;
import v.f;
import v.g;
import w.b;

/* compiled from: Direct */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static b.a f23454a = new b.a();

    /* renamed from: b  reason: collision with root package name */
    private static int f23455b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static int f23456c = 0;

    private static boolean a(int i10, e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b y10 = eVar.y();
        e.b R = eVar.R();
        f fVar = eVar.I() != null ? (f) eVar.I() : null;
        if (fVar != null) {
            e.b y11 = fVar.y();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            e.b R2 = fVar.R();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z10 = y10 == bVar5 || eVar.l0() || y10 == e.b.WRAP_CONTENT || (y10 == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f23113w == 0 && eVar.f23076d0 == 0.0f && eVar.Y(0)) || (y10 == bVar2 && eVar.f23113w == 1 && eVar.b0(0, eVar.U()));
        boolean z11 = R == bVar5 || eVar.m0() || R == e.b.WRAP_CONTENT || (R == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f23115x == 0 && eVar.f23076d0 == 0.0f && eVar.Y(1)) || (R == bVar && eVar.f23115x == 1 && eVar.b0(1, eVar.v()));
        if (eVar.f23076d0 > 0.0f && (z10 || z11)) {
            return true;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        r11 = r12.Q.f23054f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r11 = r12.O.f23054f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(int r16, v.e r17, w.b.C0242b r18, boolean r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r17.e0()
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            int r3 = f23455b
            r4 = 1
            int r3 = r3 + r4
            f23455b = r3
            boolean r3 = r0 instanceof v.f
            if (r3 != 0) goto L_0x002f
            boolean r3 = r17.k0()
            if (r3 == 0) goto L_0x002f
            int r3 = r16 + 1
            boolean r5 = a(r3, r0)
            if (r5 == 0) goto L_0x002f
            w.b$a r5 = new w.b$a
            r5.<init>()
            int r6 = w.b.a.f23408k
            v.f.O1(r3, r0, r1, r5, r6)
        L_0x002f:
            v.d$b r3 = v.d.b.LEFT
            v.d r3 = r0.m(r3)
            v.d$b r5 = v.d.b.RIGHT
            v.d r5 = r0.m(r5)
            int r6 = r3.d()
            int r7 = r5.d()
            java.util.HashSet r8 = r3.c()
            r9 = 0
            r10 = 8
            if (r8 == 0) goto L_0x0131
            boolean r8 = r3.m()
            if (r8 == 0) goto L_0x0131
            java.util.HashSet r3 = r3.c()
            java.util.Iterator r3 = r3.iterator()
        L_0x005a:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0131
            java.lang.Object r8 = r3.next()
            v.d r8 = (v.d) r8
            v.e r12 = r8.f23052d
            int r13 = r16 + 1
            boolean r14 = a(r13, r12)
            boolean r15 = r12.k0()
            if (r15 == 0) goto L_0x0080
            if (r14 == 0) goto L_0x0080
            w.b$a r15 = new w.b$a
            r15.<init>()
            int r11 = w.b.a.f23408k
            v.f.O1(r13, r12, r1, r15, r11)
        L_0x0080:
            v.d r11 = r12.O
            if (r8 != r11) goto L_0x0090
            v.d r11 = r12.Q
            v.d r11 = r11.f23054f
            if (r11 == 0) goto L_0x0090
            boolean r11 = r11.m()
            if (r11 != 0) goto L_0x00a0
        L_0x0090:
            v.d r11 = r12.Q
            if (r8 != r11) goto L_0x00a2
            v.d r11 = r12.O
            v.d r11 = r11.f23054f
            if (r11 == 0) goto L_0x00a2
            boolean r11 = r11.m()
            if (r11 == 0) goto L_0x00a2
        L_0x00a0:
            r11 = 1
            goto L_0x00a3
        L_0x00a2:
            r11 = 0
        L_0x00a3:
            v.e$b r15 = r12.y()
            v.e$b r4 = v.e.b.MATCH_CONSTRAINT
            if (r15 != r4) goto L_0x00e6
            if (r14 == 0) goto L_0x00ae
            goto L_0x00e6
        L_0x00ae:
            v.e$b r8 = r12.y()
            if (r8 != r4) goto L_0x00ec
            int r4 = r12.A
            if (r4 < 0) goto L_0x00ec
            int r4 = r12.f23119z
            if (r4 < 0) goto L_0x00ec
            int r4 = r12.T()
            if (r4 == r10) goto L_0x00ce
            int r4 = r12.f23113w
            if (r4 != 0) goto L_0x00ec
            float r4 = r12.t()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x00ec
        L_0x00ce:
            boolean r4 = r12.g0()
            if (r4 != 0) goto L_0x00ec
            boolean r4 = r12.j0()
            if (r4 != 0) goto L_0x00ec
            if (r11 == 0) goto L_0x00ec
            boolean r4 = r12.g0()
            if (r4 != 0) goto L_0x00ec
            e(r13, r0, r1, r12, r2)
            goto L_0x00ec
        L_0x00e6:
            boolean r4 = r12.k0()
            if (r4 == 0) goto L_0x00ef
        L_0x00ec:
            r4 = 1
            goto L_0x005a
        L_0x00ef:
            v.d r4 = r12.O
            if (r8 != r4) goto L_0x010a
            v.d r14 = r12.Q
            v.d r14 = r14.f23054f
            if (r14 != 0) goto L_0x010a
            int r4 = r4.e()
            int r4 = r4 + r6
            int r8 = r12.U()
            int r8 = r8 + r4
            r12.C0(r4, r8)
            b(r13, r12, r1, r2)
            goto L_0x00ec
        L_0x010a:
            v.d r14 = r12.Q
            if (r8 != r14) goto L_0x0125
            v.d r4 = r4.f23054f
            if (r4 != 0) goto L_0x0125
            int r4 = r14.e()
            int r4 = r6 - r4
            int r8 = r12.U()
            int r8 = r4 - r8
            r12.C0(r8, r4)
            b(r13, r12, r1, r2)
            goto L_0x00ec
        L_0x0125:
            if (r11 == 0) goto L_0x00ec
            boolean r4 = r12.g0()
            if (r4 != 0) goto L_0x00ec
            d(r13, r1, r12, r2)
            goto L_0x00ec
        L_0x0131:
            boolean r3 = r0 instanceof v.g
            if (r3 == 0) goto L_0x0136
            return
        L_0x0136:
            java.util.HashSet r3 = r5.c()
            if (r3 == 0) goto L_0x0225
            boolean r3 = r5.m()
            if (r3 == 0) goto L_0x0225
            java.util.HashSet r3 = r5.c()
            java.util.Iterator r3 = r3.iterator()
        L_0x014a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0225
            java.lang.Object r4 = r3.next()
            v.d r4 = (v.d) r4
            v.e r5 = r4.f23052d
            r6 = 1
            int r8 = r16 + 1
            boolean r11 = a(r8, r5)
            boolean r12 = r5.k0()
            if (r12 == 0) goto L_0x0171
            if (r11 == 0) goto L_0x0171
            w.b$a r12 = new w.b$a
            r12.<init>()
            int r13 = w.b.a.f23408k
            v.f.O1(r8, r5, r1, r12, r13)
        L_0x0171:
            v.d r12 = r5.O
            if (r4 != r12) goto L_0x0181
            v.d r12 = r5.Q
            v.d r12 = r12.f23054f
            if (r12 == 0) goto L_0x0181
            boolean r12 = r12.m()
            if (r12 != 0) goto L_0x0191
        L_0x0181:
            v.d r12 = r5.Q
            if (r4 != r12) goto L_0x0193
            v.d r12 = r5.O
            v.d r12 = r12.f23054f
            if (r12 == 0) goto L_0x0193
            boolean r12 = r12.m()
            if (r12 == 0) goto L_0x0193
        L_0x0191:
            r12 = 1
            goto L_0x0194
        L_0x0193:
            r12 = 0
        L_0x0194:
            v.e$b r13 = r5.y()
            v.e$b r14 = v.e.b.MATCH_CONSTRAINT
            if (r13 != r14) goto L_0x01d8
            if (r11 == 0) goto L_0x019f
            goto L_0x01d8
        L_0x019f:
            v.e$b r4 = r5.y()
            if (r4 != r14) goto L_0x014a
            int r4 = r5.A
            if (r4 < 0) goto L_0x014a
            int r4 = r5.f23119z
            if (r4 < 0) goto L_0x014a
            int r4 = r5.T()
            if (r4 == r10) goto L_0x01bf
            int r4 = r5.f23113w
            if (r4 != 0) goto L_0x014a
            float r4 = r5.t()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x014a
        L_0x01bf:
            boolean r4 = r5.g0()
            if (r4 != 0) goto L_0x014a
            boolean r4 = r5.j0()
            if (r4 != 0) goto L_0x014a
            if (r12 == 0) goto L_0x014a
            boolean r4 = r5.g0()
            if (r4 != 0) goto L_0x014a
            e(r8, r0, r1, r5, r2)
            goto L_0x014a
        L_0x01d8:
            boolean r11 = r5.k0()
            if (r11 == 0) goto L_0x01e0
            goto L_0x014a
        L_0x01e0:
            v.d r11 = r5.O
            if (r4 != r11) goto L_0x01fc
            v.d r13 = r5.Q
            v.d r13 = r13.f23054f
            if (r13 != 0) goto L_0x01fc
            int r4 = r11.e()
            int r4 = r4 + r7
            int r11 = r5.U()
            int r11 = r11 + r4
            r5.C0(r4, r11)
            b(r8, r5, r1, r2)
            goto L_0x014a
        L_0x01fc:
            v.d r13 = r5.Q
            if (r4 != r13) goto L_0x0218
            v.d r4 = r11.f23054f
            if (r4 != 0) goto L_0x0218
            int r4 = r13.e()
            int r4 = r7 - r4
            int r11 = r5.U()
            int r11 = r4 - r11
            r5.C0(r11, r4)
            b(r8, r5, r1, r2)
            goto L_0x014a
        L_0x0218:
            if (r12 == 0) goto L_0x014a
            boolean r4 = r5.g0()
            if (r4 != 0) goto L_0x014a
            d(r8, r1, r5, r2)
            goto L_0x014a
        L_0x0225:
            r17.o0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.b(int, v.e, w.b$b, boolean):void");
    }

    private static void c(int i10, a aVar, b.C0242b bVar, int i11, boolean z10) {
        if (!aVar.q1()) {
            return;
        }
        if (i11 == 0) {
            b(i10 + 1, aVar, bVar, z10);
        } else {
            i(i10 + 1, aVar, bVar);
        }
    }

    private static void d(int i10, b.C0242b bVar, e eVar, boolean z10) {
        float w10 = eVar.w();
        int d10 = eVar.O.f23054f.d();
        int d11 = eVar.Q.f23054f.d();
        int e10 = eVar.O.e() + d10;
        int e11 = d11 - eVar.Q.e();
        if (d10 == d11) {
            w10 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int U = eVar.U();
        int i11 = (d11 - d10) - U;
        if (d10 > d11) {
            i11 = (d10 - d11) - U;
        }
        int i12 = ((int) (i11 > 0 ? (w10 * ((float) i11)) + 0.5f : w10 * ((float) i11))) + d10;
        int i13 = i12 + U;
        if (d10 > d11) {
            i13 = i12 - U;
        }
        eVar.C0(i12, i13);
        b(i10 + 1, eVar, bVar, z10);
    }

    private static void e(int i10, e eVar, b.C0242b bVar, e eVar2, boolean z10) {
        int i11;
        float w10 = eVar2.w();
        int d10 = eVar2.O.f23054f.d() + eVar2.O.e();
        int d11 = eVar2.Q.f23054f.d() - eVar2.Q.e();
        if (d11 >= d10) {
            int U = eVar2.U();
            if (eVar2.T() != 8) {
                int i12 = eVar2.f23113w;
                if (i12 == 2) {
                    if (eVar instanceof f) {
                        i11 = eVar.U();
                    } else {
                        i11 = eVar.I().U();
                    }
                    U = (int) (eVar2.w() * 0.5f * ((float) i11));
                } else if (i12 == 0) {
                    U = d11 - d10;
                }
                U = Math.max(eVar2.f23119z, U);
                int i13 = eVar2.A;
                if (i13 > 0) {
                    U = Math.min(i13, U);
                }
            }
            int i14 = d10 + ((int) ((w10 * ((float) ((d11 - d10) - U))) + 0.5f));
            eVar2.C0(i14, U + i14);
            b(i10 + 1, eVar2, bVar, z10);
        }
    }

    private static void f(int i10, b.C0242b bVar, e eVar) {
        float P = eVar.P();
        int d10 = eVar.P.f23054f.d();
        int d11 = eVar.R.f23054f.d();
        int e10 = eVar.P.e() + d10;
        int e11 = d11 - eVar.R.e();
        if (d10 == d11) {
            P = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int v10 = eVar.v();
        int i11 = (d11 - d10) - v10;
        if (d10 > d11) {
            i11 = (d10 - d11) - v10;
        }
        int i12 = (int) (i11 > 0 ? (P * ((float) i11)) + 0.5f : P * ((float) i11));
        int i13 = d10 + i12;
        int i14 = i13 + v10;
        if (d10 > d11) {
            i13 = d10 - i12;
            i14 = i13 - v10;
        }
        eVar.F0(i13, i14);
        i(i10 + 1, eVar, bVar);
    }

    private static void g(int i10, e eVar, b.C0242b bVar, e eVar2) {
        int i11;
        float P = eVar2.P();
        int d10 = eVar2.P.f23054f.d() + eVar2.P.e();
        int d11 = eVar2.R.f23054f.d() - eVar2.R.e();
        if (d11 >= d10) {
            int v10 = eVar2.v();
            if (eVar2.T() != 8) {
                int i12 = eVar2.f23115x;
                if (i12 == 2) {
                    if (eVar instanceof f) {
                        i11 = eVar.v();
                    } else {
                        i11 = eVar.I().v();
                    }
                    v10 = (int) (P * 0.5f * ((float) i11));
                } else if (i12 == 0) {
                    v10 = d11 - d10;
                }
                v10 = Math.max(eVar2.C, v10);
                int i13 = eVar2.D;
                if (i13 > 0) {
                    v10 = Math.min(i13, v10);
                }
            }
            int i14 = d10 + ((int) ((P * ((float) ((d11 - d10) - v10))) + 0.5f));
            eVar2.F0(i14, v10 + i14);
            i(i10 + 1, eVar2, bVar);
        }
    }

    public static void h(f fVar, b.C0242b bVar) {
        e.b y10 = fVar.y();
        e.b R = fVar.R();
        f23455b = 0;
        f23456c = 0;
        fVar.s0();
        ArrayList<e> o12 = fVar.o1();
        int size = o12.size();
        for (int i10 = 0; i10 < size; i10++) {
            o12.get(i10).s0();
        }
        boolean L1 = fVar.L1();
        if (y10 == e.b.FIXED) {
            fVar.C0(0, fVar.U());
        } else {
            fVar.D0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = o12.get(i11);
            if (eVar instanceof g) {
                g gVar = (g) eVar;
                if (gVar.p1() == 1) {
                    if (gVar.q1() != -1) {
                        gVar.t1(gVar.q1());
                    } else if (gVar.r1() != -1 && fVar.l0()) {
                        gVar.t1(fVar.U() - gVar.r1());
                    } else if (fVar.l0()) {
                        gVar.t1((int) ((gVar.s1() * ((float) fVar.U())) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((eVar instanceof a) && ((a) eVar).u1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                e eVar2 = o12.get(i12);
                if (eVar2 instanceof g) {
                    g gVar2 = (g) eVar2;
                    if (gVar2.p1() == 1) {
                        b(0, gVar2, bVar, L1);
                    }
                }
            }
        }
        b(0, fVar, bVar, L1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                e eVar3 = o12.get(i13);
                if (eVar3 instanceof a) {
                    a aVar = (a) eVar3;
                    if (aVar.u1() == 0) {
                        c(0, aVar, bVar, 0, L1);
                    }
                }
            }
        }
        if (R == e.b.FIXED) {
            fVar.F0(0, fVar.v());
        } else {
            fVar.E0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            e eVar4 = o12.get(i14);
            if (eVar4 instanceof g) {
                g gVar3 = (g) eVar4;
                if (gVar3.p1() == 0) {
                    if (gVar3.q1() != -1) {
                        gVar3.t1(gVar3.q1());
                    } else if (gVar3.r1() != -1 && fVar.m0()) {
                        gVar3.t1(fVar.v() - gVar3.r1());
                    } else if (fVar.m0()) {
                        gVar3.t1((int) ((gVar3.s1() * ((float) fVar.v())) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((eVar4 instanceof a) && ((a) eVar4).u1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                e eVar5 = o12.get(i15);
                if (eVar5 instanceof g) {
                    g gVar4 = (g) eVar5;
                    if (gVar4.p1() == 0) {
                        i(1, gVar4, bVar);
                    }
                }
            }
        }
        i(0, fVar, bVar);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                e eVar6 = o12.get(i16);
                if (eVar6 instanceof a) {
                    a aVar2 = (a) eVar6;
                    if (aVar2.u1() == 1) {
                        c(0, aVar2, bVar, 1, L1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            e eVar7 = o12.get(i17);
            if (eVar7.k0() && a(0, eVar7)) {
                f.O1(0, eVar7, bVar, f23454a, b.a.f23408k);
                if (!(eVar7 instanceof g)) {
                    b(0, eVar7, bVar, L1);
                    i(0, eVar7, bVar);
                } else if (((g) eVar7).p1() == 0) {
                    i(0, eVar7, bVar);
                } else {
                    b(0, eVar7, bVar, L1);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        r14 = r11.R.f23054f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        r14 = r11.P.f23054f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void i(int r16, v.e r17, w.b.C0242b r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r17.n0()
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            int r2 = f23456c
            r3 = 1
            int r2 = r2 + r3
            f23456c = r2
            boolean r2 = r0 instanceof v.f
            if (r2 != 0) goto L_0x002d
            boolean r2 = r17.k0()
            if (r2 == 0) goto L_0x002d
            int r2 = r16 + 1
            boolean r4 = a(r2, r0)
            if (r4 == 0) goto L_0x002d
            w.b$a r4 = new w.b$a
            r4.<init>()
            int r5 = w.b.a.f23408k
            v.f.O1(r2, r0, r1, r4, r5)
        L_0x002d:
            v.d$b r2 = v.d.b.TOP
            v.d r2 = r0.m(r2)
            v.d$b r4 = v.d.b.BOTTOM
            v.d r4 = r0.m(r4)
            int r5 = r2.d()
            int r6 = r4.d()
            java.util.HashSet r7 = r2.c()
            r8 = 0
            r9 = 8
            if (r7 == 0) goto L_0x0132
            boolean r7 = r2.m()
            if (r7 == 0) goto L_0x0132
            java.util.HashSet r2 = r2.c()
            java.util.Iterator r2 = r2.iterator()
        L_0x0058:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0132
            java.lang.Object r7 = r2.next()
            v.d r7 = (v.d) r7
            v.e r11 = r7.f23052d
            int r12 = r16 + 1
            boolean r13 = a(r12, r11)
            boolean r14 = r11.k0()
            if (r14 == 0) goto L_0x007e
            if (r13 == 0) goto L_0x007e
            w.b$a r14 = new w.b$a
            r14.<init>()
            int r15 = w.b.a.f23408k
            v.f.O1(r12, r11, r1, r14, r15)
        L_0x007e:
            v.d r14 = r11.P
            if (r7 != r14) goto L_0x008e
            v.d r14 = r11.R
            v.d r14 = r14.f23054f
            if (r14 == 0) goto L_0x008e
            boolean r14 = r14.m()
            if (r14 != 0) goto L_0x009e
        L_0x008e:
            v.d r14 = r11.R
            if (r7 != r14) goto L_0x00a0
            v.d r14 = r11.P
            v.d r14 = r14.f23054f
            if (r14 == 0) goto L_0x00a0
            boolean r14 = r14.m()
            if (r14 == 0) goto L_0x00a0
        L_0x009e:
            r14 = 1
            goto L_0x00a1
        L_0x00a0:
            r14 = 0
        L_0x00a1:
            v.e$b r15 = r11.R()
            v.e$b r10 = v.e.b.MATCH_CONSTRAINT
            if (r15 != r10) goto L_0x00e5
            if (r13 == 0) goto L_0x00ac
            goto L_0x00e5
        L_0x00ac:
            v.e$b r7 = r11.R()
            if (r7 != r10) goto L_0x0058
            int r7 = r11.D
            if (r7 < 0) goto L_0x0058
            int r7 = r11.C
            if (r7 < 0) goto L_0x0058
            int r7 = r11.T()
            if (r7 == r9) goto L_0x00cc
            int r7 = r11.f23115x
            if (r7 != 0) goto L_0x0058
            float r7 = r11.t()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0058
        L_0x00cc:
            boolean r7 = r11.i0()
            if (r7 != 0) goto L_0x0058
            boolean r7 = r11.j0()
            if (r7 != 0) goto L_0x0058
            if (r14 == 0) goto L_0x0058
            boolean r7 = r11.i0()
            if (r7 != 0) goto L_0x0058
            g(r12, r0, r1, r11)
            goto L_0x0058
        L_0x00e5:
            boolean r10 = r11.k0()
            if (r10 == 0) goto L_0x00ed
            goto L_0x0058
        L_0x00ed:
            v.d r10 = r11.P
            if (r7 != r10) goto L_0x0109
            v.d r13 = r11.R
            v.d r13 = r13.f23054f
            if (r13 != 0) goto L_0x0109
            int r7 = r10.e()
            int r7 = r7 + r5
            int r10 = r11.v()
            int r10 = r10 + r7
            r11.F0(r7, r10)
            i(r12, r11, r1)
            goto L_0x0058
        L_0x0109:
            v.d r13 = r11.R
            if (r7 != r13) goto L_0x0125
            v.d r7 = r10.f23054f
            if (r7 != 0) goto L_0x0125
            int r7 = r13.e()
            int r7 = r5 - r7
            int r10 = r11.v()
            int r10 = r7 - r10
            r11.F0(r10, r7)
            i(r12, r11, r1)
            goto L_0x0058
        L_0x0125:
            if (r14 == 0) goto L_0x0058
            boolean r7 = r11.i0()
            if (r7 != 0) goto L_0x0058
            f(r12, r1, r11)
            goto L_0x0058
        L_0x0132:
            boolean r2 = r0 instanceof v.g
            if (r2 == 0) goto L_0x0137
            return
        L_0x0137:
            java.util.HashSet r2 = r4.c()
            if (r2 == 0) goto L_0x0225
            boolean r2 = r4.m()
            if (r2 == 0) goto L_0x0225
            java.util.HashSet r2 = r4.c()
            java.util.Iterator r2 = r2.iterator()
        L_0x014b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0225
            java.lang.Object r4 = r2.next()
            v.d r4 = (v.d) r4
            v.e r5 = r4.f23052d
            int r7 = r16 + 1
            boolean r10 = a(r7, r5)
            boolean r11 = r5.k0()
            if (r11 == 0) goto L_0x0171
            if (r10 == 0) goto L_0x0171
            w.b$a r11 = new w.b$a
            r11.<init>()
            int r12 = w.b.a.f23408k
            v.f.O1(r7, r5, r1, r11, r12)
        L_0x0171:
            v.d r11 = r5.P
            if (r4 != r11) goto L_0x0181
            v.d r11 = r5.R
            v.d r11 = r11.f23054f
            if (r11 == 0) goto L_0x0181
            boolean r11 = r11.m()
            if (r11 != 0) goto L_0x0191
        L_0x0181:
            v.d r11 = r5.R
            if (r4 != r11) goto L_0x0193
            v.d r11 = r5.P
            v.d r11 = r11.f23054f
            if (r11 == 0) goto L_0x0193
            boolean r11 = r11.m()
            if (r11 == 0) goto L_0x0193
        L_0x0191:
            r11 = 1
            goto L_0x0194
        L_0x0193:
            r11 = 0
        L_0x0194:
            v.e$b r12 = r5.R()
            v.e$b r13 = v.e.b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x01d8
            if (r10 == 0) goto L_0x019f
            goto L_0x01d8
        L_0x019f:
            v.e$b r4 = r5.R()
            if (r4 != r13) goto L_0x014b
            int r4 = r5.D
            if (r4 < 0) goto L_0x014b
            int r4 = r5.C
            if (r4 < 0) goto L_0x014b
            int r4 = r5.T()
            if (r4 == r9) goto L_0x01bf
            int r4 = r5.f23115x
            if (r4 != 0) goto L_0x014b
            float r4 = r5.t()
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x014b
        L_0x01bf:
            boolean r4 = r5.i0()
            if (r4 != 0) goto L_0x014b
            boolean r4 = r5.j0()
            if (r4 != 0) goto L_0x014b
            if (r11 == 0) goto L_0x014b
            boolean r4 = r5.i0()
            if (r4 != 0) goto L_0x014b
            g(r7, r0, r1, r5)
            goto L_0x014b
        L_0x01d8:
            boolean r10 = r5.k0()
            if (r10 == 0) goto L_0x01e0
            goto L_0x014b
        L_0x01e0:
            v.d r10 = r5.P
            if (r4 != r10) goto L_0x01fc
            v.d r12 = r5.R
            v.d r12 = r12.f23054f
            if (r12 != 0) goto L_0x01fc
            int r4 = r10.e()
            int r4 = r4 + r6
            int r10 = r5.v()
            int r10 = r10 + r4
            r5.F0(r4, r10)
            i(r7, r5, r1)
            goto L_0x014b
        L_0x01fc:
            v.d r12 = r5.R
            if (r4 != r12) goto L_0x0218
            v.d r4 = r10.f23054f
            if (r4 != 0) goto L_0x0218
            int r4 = r12.e()
            int r4 = r6 - r4
            int r10 = r5.v()
            int r10 = r4 - r10
            r5.F0(r10, r4)
            i(r7, r5, r1)
            goto L_0x014b
        L_0x0218:
            if (r11 == 0) goto L_0x014b
            boolean r4 = r5.i0()
            if (r4 != 0) goto L_0x014b
            f(r7, r1, r5)
            goto L_0x014b
        L_0x0225:
            v.d$b r2 = v.d.b.BASELINE
            v.d r2 = r0.m(r2)
            java.util.HashSet r4 = r2.c()
            if (r4 == 0) goto L_0x028a
            boolean r4 = r2.m()
            if (r4 == 0) goto L_0x028a
            int r4 = r2.d()
            java.util.HashSet r2 = r2.c()
            java.util.Iterator r2 = r2.iterator()
        L_0x0243:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x028a
            java.lang.Object r5 = r2.next()
            v.d r5 = (v.d) r5
            v.e r6 = r5.f23052d
            int r7 = r16 + 1
            boolean r8 = a(r7, r6)
            boolean r9 = r6.k0()
            if (r9 == 0) goto L_0x0269
            if (r8 == 0) goto L_0x0269
            w.b$a r9 = new w.b$a
            r9.<init>()
            int r10 = w.b.a.f23408k
            v.f.O1(r7, r6, r1, r9, r10)
        L_0x0269:
            v.e$b r9 = r6.R()
            v.e$b r10 = v.e.b.MATCH_CONSTRAINT
            if (r9 != r10) goto L_0x0273
            if (r8 == 0) goto L_0x0243
        L_0x0273:
            boolean r8 = r6.k0()
            if (r8 == 0) goto L_0x027a
            goto L_0x0243
        L_0x027a:
            v.d r8 = r6.S
            if (r5 != r8) goto L_0x0243
            int r5 = r5.e()
            int r5 = r5 + r4
            r6.B0(r5)
            i(r7, r6, r1)     // Catch:{ all -> 0x028e }
            goto L_0x0243
        L_0x028a:
            r17.p0()
            return
        L_0x028e:
            r0 = move-exception
            r1 = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.i(int, v.e, w.b$b):void");
    }
}
