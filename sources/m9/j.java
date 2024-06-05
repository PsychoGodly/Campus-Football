package m9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import n9.a;
import v8.d;
import v8.f;
import v8.p;
import z8.b;
import z8.e;

/* compiled from: PDF417ScanningDecoder */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final a f29287a = new a();

    private static c a(h hVar) throws v8.j {
        int[] j10;
        if (hVar == null || (j10 = hVar.j()) == null) {
            return null;
        }
        int p10 = p(j10);
        int i10 = 0;
        int i11 = 0;
        for (int i12 : j10) {
            i11 += p10 - i12;
            if (i12 > 0) {
                break;
            }
        }
        d[] d10 = hVar.d();
        int i13 = 0;
        while (i11 > 0 && d10[i13] == null) {
            i11--;
            i13++;
        }
        for (int length = j10.length - 1; length >= 0; length--) {
            i10 += p10 - j10[length];
            if (j10[length] > 0) {
                break;
            }
        }
        int length2 = d10.length - 1;
        while (i10 > 0 && d10[length2] == null) {
            i10--;
            length2--;
        }
        return hVar.a().a(i11, i10, hVar.k());
    }

    private static void b(f fVar, b[][] bVarArr) throws v8.j {
        int[] a10 = bVarArr[0][1].a();
        int j10 = (fVar.j() * fVar.l()) - r(fVar.k());
        if (a10.length == 0) {
            if (j10 <= 0 || j10 > 928) {
                throw v8.j.a();
            }
            bVarArr[0][1].b(j10);
        } else if (a10[0] != j10) {
            bVarArr[0][1].b(j10);
        }
    }

    private static int c(b bVar, int i10, int i11, boolean z10, int i12, int i13) {
        int i14 = z10 ? -1 : 1;
        int i15 = i12;
        for (int i16 = 0; i16 < 2; i16++) {
            while (true) {
                if (!z10) {
                    if (i15 >= i11) {
                        continue;
                        break;
                    }
                } else if (i15 < i10) {
                    continue;
                    break;
                }
                if (z10 != bVar.d(i15, i13)) {
                    continue;
                    break;
                } else if (Math.abs(i12 - i15) > 2) {
                    return i12;
                } else {
                    i15 += i14;
                }
            }
            i14 = -i14;
            z10 = !z10;
        }
        return i15;
    }

    private static boolean d(int i10, int i11, int i12) {
        return i11 + -2 <= i10 && i10 <= i12 + 2;
    }

    private static int e(int[] iArr, int[] iArr2, int i10) throws d {
        if ((iArr2 == null || iArr2.length <= (i10 / 2) + 3) && i10 >= 0 && i10 <= 512) {
            return f29287a.a(iArr, i10, iArr2);
        }
        throw d.a();
    }

    private static b[][] f(f fVar) {
        int c10;
        int l10 = fVar.l();
        int[] iArr = new int[2];
        iArr[1] = fVar.j() + 2;
        iArr[0] = l10;
        b[][] bVarArr = (b[][]) Array.newInstance(b.class, iArr);
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            for (int i11 = 0; i11 < bVarArr[i10].length; i11++) {
                bVarArr[i10][i11] = new b();
            }
        }
        int i12 = 0;
        for (g gVar : fVar.o()) {
            if (gVar != null) {
                for (d dVar : gVar.d()) {
                    if (dVar != null && (c10 = dVar.c()) >= 0 && c10 < bVarArr.length) {
                        bVarArr[c10][i12].b(dVar.e());
                    }
                }
            }
            i12++;
        }
        return bVarArr;
    }

    private static e g(f fVar) throws f, d, v8.j {
        b[][] f10 = f(fVar);
        b(fVar, f10);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(fVar.l() * fVar.j())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < fVar.l(); i10++) {
            int i11 = 0;
            while (i11 < fVar.j()) {
                int i12 = i11 + 1;
                int[] a10 = f10[i10][i12].a();
                int j10 = (fVar.j() * i10) + i11;
                if (a10.length == 0) {
                    arrayList.add(Integer.valueOf(j10));
                } else if (a10.length == 1) {
                    iArr[j10] = a10[0];
                } else {
                    arrayList3.add(Integer.valueOf(j10));
                    arrayList2.add(a10);
                }
                i11 = i12;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i13 = 0; i13 < size; i13++) {
            iArr2[i13] = (int[]) arrayList2.get(i13);
        }
        return h(fVar.k(), iArr, l9.a.b(arrayList), l9.a.b(arrayList3), iArr2);
    }

    private static e h(int i10, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws f, d {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i11 = 100;
        while (true) {
            int i12 = i11 - 1;
            if (i11 > 0) {
                for (int i13 = 0; i13 < length; i13++) {
                    iArr[iArr3[i13]] = iArr4[i13][iArr5[i13]];
                }
                try {
                    return j(iArr, i10, iArr2);
                } catch (d unused) {
                    if (length != 0) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                break;
                            } else if (iArr5[i14] < iArr4[i14].length - 1) {
                                iArr5[i14] = iArr5[i14] + 1;
                                break;
                            } else {
                                iArr5[i14] = 0;
                                if (i14 != length - 1) {
                                    i14++;
                                } else {
                                    throw d.a();
                                }
                            }
                        }
                        i11 = i12;
                    } else {
                        throw d.a();
                    }
                }
            } else {
                throw d.a();
            }
        }
    }

    public static e i(b bVar, p pVar, p pVar2, p pVar3, p pVar4, int i10, int i11) throws v8.j, f, d {
        g gVar;
        int i12;
        int i13;
        int i14;
        h hVar = null;
        h hVar2 = null;
        f fVar = null;
        c cVar = new c(bVar, pVar, pVar2, pVar3, pVar4);
        int i15 = 0;
        while (true) {
            if (i15 >= 2) {
                break;
            }
            if (pVar != null) {
                hVar = s(bVar, cVar, pVar, true, i10, i11);
            }
            if (pVar3 != null) {
                hVar2 = s(bVar, cVar, pVar3, false, i10, i11);
            }
            fVar = v(hVar, hVar2);
            if (fVar == null) {
                throw v8.j.a();
            } else if (i15 != 0 || fVar.m() == null || (fVar.m().h() >= cVar.h() && fVar.m().f() <= cVar.f())) {
                fVar.p(cVar);
            } else {
                cVar = fVar.m();
                i15++;
            }
        }
        fVar.p(cVar);
        int j10 = fVar.j() + 1;
        fVar.q(0, hVar);
        fVar.q(j10, hVar2);
        boolean z10 = hVar != null;
        int i16 = i10;
        int i17 = i11;
        for (int i18 = 1; i18 <= j10; i18++) {
            int i19 = z10 ? i18 : j10 - i18;
            if (fVar.n(i19) == null) {
                if (i19 == 0 || i19 == j10) {
                    gVar = new h(cVar, i19 == 0);
                } else {
                    gVar = new g(cVar);
                }
                fVar.q(i19, gVar);
                int i20 = -1;
                int h10 = cVar.h();
                int i21 = -1;
                while (h10 <= cVar.f()) {
                    int t10 = t(fVar, i19, h10, z10);
                    if (t10 >= 0 && t10 <= cVar.e()) {
                        i14 = t10;
                    } else if (i21 != i20) {
                        i14 = i21;
                    } else {
                        i13 = i21;
                        i12 = h10;
                        i21 = i13;
                        h10 = i12 + 1;
                        i20 = -1;
                    }
                    i13 = i21;
                    int i22 = h10;
                    d k10 = k(bVar, cVar.g(), cVar.e(), z10, i14, i22, i16, i17);
                    i12 = i22;
                    if (k10 != null) {
                        gVar.f(i12, k10);
                        i16 = Math.min(i16, k10.f());
                        i17 = Math.max(i17, k10.f());
                        i21 = i14;
                        h10 = i12 + 1;
                        i20 = -1;
                    }
                    i21 = i13;
                    h10 = i12 + 1;
                    i20 = -1;
                }
            }
        }
        return g(fVar);
    }

    private static e j(int[] iArr, int i10, int[] iArr2) throws f, d {
        if (iArr.length != 0) {
            int i11 = 1 << (i10 + 1);
            int e10 = e(iArr, iArr2, i11);
            w(iArr, i11);
            e b10 = e.b(iArr, String.valueOf(i10));
            b10.k(Integer.valueOf(e10));
            b10.j(Integer.valueOf(iArr2.length));
            return b10;
        }
        throw f.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r7 = m9.i.d(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static m9.d k(z8.b r7, int r8, int r9, boolean r10, int r11, int r12, int r13, int r14) {
        /*
            int r11 = c(r7, r8, r9, r10, r11, r12)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            int[] r7 = q(r0, r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 != 0) goto L_0x0012
            return r8
        L_0x0012:
            int r9 = a9.a.d(r7)
            if (r10 == 0) goto L_0x001b
            int r10 = r11 + r9
            goto L_0x0039
        L_0x001b:
            r10 = 0
        L_0x001c:
            int r12 = r7.length
            int r12 = r12 / 2
            if (r10 >= r12) goto L_0x0034
            r12 = r7[r10]
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r0 = r7[r0]
            r7[r10] = r0
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r7[r0] = r12
            int r10 = r10 + 1
            goto L_0x001c
        L_0x0034:
            int r10 = r11 - r9
            r6 = r11
            r11 = r10
            r10 = r6
        L_0x0039:
            boolean r9 = d(r9, r13, r14)
            if (r9 != 0) goto L_0x0040
            return r8
        L_0x0040:
            int r7 = m9.i.d(r7)
            int r9 = l9.a.a(r7)
            r12 = -1
            if (r9 != r12) goto L_0x004c
            return r8
        L_0x004c:
            m9.d r8 = new m9.d
            int r7 = n(r7)
            r8.<init>(r11, r10, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.j.k(z8.b, int, int, boolean, int, int, int, int):m9.d");
    }

    private static a l(h hVar, h hVar2) {
        a i10;
        a i11;
        if (hVar == null || (i10 = hVar.i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.i();
        } else if (hVar2 == null || (i11 = hVar2.i()) == null || i10.a() == i11.a() || i10.b() == i11.b() || i10.c() == i11.c()) {
            return i10;
        } else {
            return null;
        }
    }

    private static int[] m(int i10) {
        int[] iArr = new int[8];
        int i11 = 0;
        int i12 = 7;
        while (true) {
            int i13 = i10 & 1;
            if (i13 != i11) {
                i12--;
                if (i12 < 0) {
                    return iArr;
                }
                i11 = i13;
            }
            iArr[i12] = iArr[i12] + 1;
            i10 >>= 1;
        }
    }

    private static int n(int i10) {
        return o(m(i10));
    }

    private static int o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    private static int p(int[] iArr) {
        int i10 = -1;
        for (int max : iArr) {
            i10 = Math.max(i10, max);
        }
        return i10;
    }

    private static int[] q(b bVar, int i10, int i11, boolean z10, int i12, int i13) {
        int[] iArr = new int[8];
        int i14 = z10 ? 1 : -1;
        int i15 = 0;
        boolean z11 = z10;
        while (true) {
            if (!z10) {
                if (i12 < i10) {
                    break;
                }
            } else if (i12 >= i11) {
                break;
            }
            if (i15 >= 8) {
                break;
            } else if (bVar.d(i12, i13) == z11) {
                iArr[i15] = iArr[i15] + 1;
                i12 += i14;
            } else {
                i15++;
                z11 = !z11;
            }
        }
        if (i15 != 8) {
            if (z10) {
                i10 = i11;
            }
            if (!(i12 == i10 && i15 == 7)) {
                return null;
            }
        }
        return iArr;
    }

    private static int r(int i10) {
        return 2 << i10;
    }

    private static h s(b bVar, c cVar, p pVar, boolean z10, int i10, int i11) {
        int i12;
        boolean z11 = z10;
        h hVar = new h(cVar, z11);
        int i13 = 0;
        while (i13 < 2) {
            int i14 = i13 == 0 ? 1 : -1;
            int c10 = (int) pVar.c();
            int d10 = (int) pVar.d();
            while (d10 <= cVar.f() && d10 >= cVar.h()) {
                d k10 = k(bVar, 0, bVar.k(), z10, c10, d10, i10, i11);
                if (k10 != null) {
                    hVar.f(d10, k10);
                    if (z11) {
                        i12 = k10.d();
                    } else {
                        i12 = k10.b();
                    }
                    c10 = i12;
                }
                d10 += i14;
            }
            i13++;
        }
        return hVar;
    }

    private static int t(f fVar, int i10, int i11, boolean z10) {
        int i12 = z10 ? 1 : -1;
        d dVar = null;
        int i13 = i10 - i12;
        if (u(fVar, i13)) {
            dVar = fVar.n(i13).b(i11);
        }
        if (dVar != null) {
            return z10 ? dVar.b() : dVar.d();
        }
        d c10 = fVar.n(i10).c(i11);
        if (c10 != null) {
            return z10 ? c10.d() : c10.b();
        }
        if (u(fVar, i13)) {
            c10 = fVar.n(i13).c(i11);
        }
        if (c10 != null) {
            return z10 ? c10.b() : c10.d();
        }
        int i14 = 0;
        while (true) {
            i10 -= i12;
            if (u(fVar, i10)) {
                for (d dVar2 : fVar.n(i10).d()) {
                    if (dVar2 != null) {
                        return (z10 ? dVar2.b() : dVar2.d()) + (i12 * i14 * (dVar2.b() - dVar2.d()));
                    }
                }
                i14++;
            } else {
                c m10 = fVar.m();
                return z10 ? m10.g() : m10.e();
            }
        }
    }

    private static boolean u(f fVar, int i10) {
        return i10 >= 0 && i10 <= fVar.j() + 1;
    }

    private static f v(h hVar, h hVar2) throws v8.j {
        a l10;
        if ((hVar == null && hVar2 == null) || (l10 = l(hVar, hVar2)) == null) {
            return null;
        }
        return new f(l10, c.l(a(hVar), a(hVar2)));
    }

    private static void w(int[] iArr, int i10) throws f {
        if (iArr.length >= 4) {
            int i11 = iArr[0];
            if (i11 > iArr.length) {
                throw f.a();
            } else if (i11 != 0) {
            } else {
                if (i10 < iArr.length) {
                    iArr[0] = iArr.length - i10;
                    return;
                }
                throw f.a();
            }
        } else {
            throw f.a();
        }
    }
}
