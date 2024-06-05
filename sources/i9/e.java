package i9;

import h9.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v8.a;
import v8.j;
import v8.n;
import v8.p;
import v8.q;

/* compiled from: RSS14Reader */
public final class e extends a {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f29010i = {1, 10, 34, 70, 126};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f29011j = {4, 20, 48, 81};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f29012k = {0, 161, 961, 2015, 2715};

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f29013l = {0, 336, 1036, 1516};

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f29014m = {8, 6, 4, 3, 1};

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f29015n = {2, 4, 6, 8};

    /* renamed from: o  reason: collision with root package name */
    private static final int[][] f29016o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g  reason: collision with root package name */
    private final List<d> f29017g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<d> f29018h = new ArrayList();

    private static void q(Collection<d> collection, d dVar) {
        if (dVar != null) {
            boolean z10 = false;
            Iterator<d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d next = it.next();
                if (next.b() == dVar.b()) {
                    next.e();
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                collection.add(dVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r(boolean r10, int r11) throws v8.j {
        /*
            r9 = this;
            int[] r0 = r9.l()
            int r0 = a9.a.d(r0)
            int[] r1 = r9.j()
            int r1 = a9.a.d(r1)
            r2 = 4
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x0028
            r5 = 12
            if (r0 <= r5) goto L_0x001c
            r6 = 0
            r7 = 1
            goto L_0x0022
        L_0x001c:
            if (r0 >= r2) goto L_0x0020
            r6 = 1
            goto L_0x0021
        L_0x0020:
            r6 = 0
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r1 <= r5) goto L_0x0025
            goto L_0x003a
        L_0x0025:
            if (r1 >= r2) goto L_0x0041
            goto L_0x003f
        L_0x0028:
            r5 = 11
            if (r0 <= r5) goto L_0x002f
            r6 = 0
            r7 = 1
            goto L_0x0036
        L_0x002f:
            r5 = 5
            if (r0 >= r5) goto L_0x0034
            r6 = 1
            goto L_0x0035
        L_0x0034:
            r6 = 0
        L_0x0035:
            r7 = 0
        L_0x0036:
            r5 = 10
            if (r1 <= r5) goto L_0x003d
        L_0x003a:
            r2 = 0
            r5 = 1
            goto L_0x0043
        L_0x003d:
            if (r1 >= r2) goto L_0x0041
        L_0x003f:
            r2 = 1
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            r5 = 0
        L_0x0043:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r10) goto L_0x004c
            r10 = 1
            goto L_0x004d
        L_0x004c:
            r10 = 0
        L_0x004d:
            r11 = r1 & 1
            if (r11 != r4) goto L_0x0052
            r3 = 1
        L_0x0052:
            if (r8 != r4) goto L_0x006a
            if (r10 == 0) goto L_0x0060
            if (r3 != 0) goto L_0x005b
            r4 = r6
        L_0x0059:
            r7 = 1
            goto L_0x0095
        L_0x005b:
            v8.j r10 = v8.j.a()
            throw r10
        L_0x0060:
            if (r3 == 0) goto L_0x0065
            r4 = r6
        L_0x0063:
            r5 = 1
            goto L_0x0095
        L_0x0065:
            v8.j r10 = v8.j.a()
            throw r10
        L_0x006a:
            r11 = -1
            if (r8 != r11) goto L_0x0081
            if (r10 == 0) goto L_0x0077
            if (r3 != 0) goto L_0x0072
            goto L_0x0095
        L_0x0072:
            v8.j r10 = v8.j.a()
            throw r10
        L_0x0077:
            if (r3 == 0) goto L_0x007c
            r4 = r6
            r2 = 1
            goto L_0x0095
        L_0x007c:
            v8.j r10 = v8.j.a()
            throw r10
        L_0x0081:
            if (r8 != 0) goto L_0x00df
            if (r10 == 0) goto L_0x0092
            if (r3 == 0) goto L_0x008d
            if (r0 >= r1) goto L_0x008a
            goto L_0x0063
        L_0x008a:
            r4 = r6
            r2 = 1
            goto L_0x0059
        L_0x008d:
            v8.j r10 = v8.j.a()
            throw r10
        L_0x0092:
            if (r3 != 0) goto L_0x00da
            r4 = r6
        L_0x0095:
            if (r4 == 0) goto L_0x00aa
            if (r7 != 0) goto L_0x00a5
            int[] r10 = r9.l()
            float[] r11 = r9.m()
            i9.a.n(r10, r11)
            goto L_0x00aa
        L_0x00a5:
            v8.j r10 = v8.j.a()
            throw r10
        L_0x00aa:
            if (r7 == 0) goto L_0x00b7
            int[] r10 = r9.l()
            float[] r11 = r9.m()
            i9.a.g(r10, r11)
        L_0x00b7:
            if (r2 == 0) goto L_0x00cc
            if (r5 != 0) goto L_0x00c7
            int[] r10 = r9.j()
            float[] r11 = r9.m()
            i9.a.n(r10, r11)
            goto L_0x00cc
        L_0x00c7:
            v8.j r10 = v8.j.a()
            throw r10
        L_0x00cc:
            if (r5 == 0) goto L_0x00d9
            int[] r10 = r9.j()
            float[] r11 = r9.k()
            i9.a.g(r10, r11)
        L_0x00d9:
            return
        L_0x00da:
            v8.j r10 = v8.j.a()
            throw r10
        L_0x00df:
            v8.j r10 = v8.j.a()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.e.r(boolean, int):void");
    }

    private static boolean s(d dVar, d dVar2) {
        int a10 = (dVar.a() + (dVar2.a() * 16)) % 79;
        int c10 = (dVar.d().c() * 9) + dVar2.d().c();
        if (c10 > 72) {
            c10--;
        }
        if (c10 > 8) {
            c10--;
        }
        return a10 == c10;
    }

    private static n t(d dVar, d dVar2) {
        String valueOf = String.valueOf((((long) dVar.b()) * 4537077) + ((long) dVar2.b()));
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        int i10 = 0;
        for (int i11 = 0; i11 < 13; i11++) {
            int charAt = sb2.charAt(i11) - '0';
            if ((i11 & 1) == 0) {
                charAt *= 3;
            }
            i10 += charAt;
        }
        int i12 = 10 - (i10 % 10);
        if (i12 == 10) {
            i12 = 0;
        }
        sb2.append(i12);
        p[] a10 = dVar.d().a();
        p[] a11 = dVar2.d().a();
        return new n(String.valueOf(sb2.toString()), (byte[]) null, new p[]{a10[0], a10[1], a11[0], a11[1]}, a.RSS_14);
    }

    private b u(z8.a aVar, c cVar, boolean z10) throws j {
        z8.a aVar2 = aVar;
        boolean z11 = z10;
        int[] h10 = h();
        h10[0] = 0;
        h10[1] = 0;
        h10[2] = 0;
        h10[3] = 0;
        h10[4] = 0;
        h10[5] = 0;
        h10[6] = 0;
        h10[7] = 0;
        if (z11) {
            k.f(aVar2, cVar.b()[0], h10);
        } else {
            k.e(aVar2, cVar.b()[1] + 1, h10);
            int i10 = 0;
            for (int length = h10.length - 1; i10 < length; length--) {
                int i11 = h10[i10];
                h10[i10] = h10[length];
                h10[length] = i11;
                i10++;
            }
        }
        int i12 = z11 ? 16 : 15;
        float d10 = ((float) a9.a.d(h10)) / ((float) i12);
        int[] l10 = l();
        int[] j10 = j();
        float[] m10 = m();
        float[] k10 = k();
        for (int i13 = 0; i13 < h10.length; i13++) {
            float f10 = ((float) h10[i13]) / d10;
            int i14 = (int) (0.5f + f10);
            if (i14 <= 0) {
                i14 = 1;
            } else if (i14 > 8) {
                i14 = 8;
            }
            int i15 = i13 / 2;
            if ((i13 & 1) == 0) {
                l10[i15] = i14;
                m10[i15] = f10 - ((float) i14);
            } else {
                j10[i15] = i14;
                k10[i15] = f10 - ((float) i14);
            }
        }
        r(z11, i12);
        int i16 = 0;
        int i17 = 0;
        for (int length2 = l10.length - 1; length2 >= 0; length2--) {
            i16 = (i16 * 9) + l10[length2];
            i17 += l10[length2];
        }
        int i18 = 0;
        int i19 = 0;
        for (int length3 = j10.length - 1; length3 >= 0; length3--) {
            i18 = (i18 * 9) + j10[length3];
            i19 += j10[length3];
        }
        int i20 = i16 + (i18 * 3);
        if (z11) {
            if ((i17 & 1) != 0 || i17 > 12 || i17 < 4) {
                throw j.a();
            }
            int i21 = (12 - i17) / 2;
            int i22 = f29014m[i21];
            return new b((f.b(l10, i22, false) * f29010i[i21]) + f.b(j10, 9 - i22, true) + f29012k[i21], i20);
        } else if ((i19 & 1) != 0 || i19 > 10 || i19 < 4) {
            throw j.a();
        } else {
            int i23 = (10 - i19) / 2;
            int i24 = f29015n[i23];
            return new b((f.b(j10, 9 - i24, false) * f29011j[i23]) + f.b(l10, i24, true) + f29013l[i23], i20);
        }
    }

    private d v(z8.a aVar, boolean z10, int i10, Map<v8.e, ?> map) {
        q qVar;
        try {
            int[] w10 = w(aVar, 0, z10);
            c x10 = x(aVar, i10, z10, w10);
            if (map == null) {
                qVar = null;
            } else {
                qVar = (q) map.get(v8.e.NEED_RESULT_POINT_CALLBACK);
            }
            if (qVar != null) {
                float f10 = ((float) (w10[0] + w10[1])) / 2.0f;
                if (z10) {
                    f10 = ((float) (aVar.g() - 1)) - f10;
                }
                qVar.a(new p(f10, (float) i10));
            }
            b u10 = u(aVar, x10, true);
            b u11 = u(aVar, x10, false);
            return new d((u10.b() * 1597) + u11.b(), u10.a() + (u11.a() * 4), x10);
        } catch (j unused) {
            return null;
        }
    }

    private int[] w(z8.a aVar, int i10, boolean z10) throws j {
        int[] i11 = i();
        i11[0] = 0;
        i11[1] = 0;
        i11[2] = 0;
        i11[3] = 0;
        int g10 = aVar.g();
        boolean z11 = false;
        while (i10 < g10) {
            z11 = !aVar.c(i10);
            if (z10 == z11) {
                break;
            }
            i10++;
        }
        int i12 = i10;
        int i13 = 0;
        while (i10 < g10) {
            if (aVar.c(i10) ^ z11) {
                i11[i13] = i11[i13] + 1;
            } else {
                if (i13 != 3) {
                    i13++;
                } else if (a.o(i11)) {
                    return new int[]{i12, i10};
                } else {
                    i12 += i11[0] + i11[1];
                    i11[0] = i11[2];
                    i11[1] = i11[3];
                    i11[2] = 0;
                    i11[3] = 0;
                    i13--;
                }
                i11[i13] = 1;
                z11 = !z11;
            }
            i10++;
        }
        throw j.a();
    }

    private c x(z8.a aVar, int i10, boolean z10, int[] iArr) throws j {
        int i11;
        int i12;
        boolean c10 = aVar.c(iArr[0]);
        int i13 = iArr[0] - 1;
        while (i13 >= 0 && (aVar.c(i13) ^ c10)) {
            i13--;
        }
        int i14 = i13 + 1;
        int[] i15 = i();
        System.arraycopy(i15, 0, i15, 1, i15.length - 1);
        i15[0] = iArr[0] - i14;
        int p10 = a.p(i15, f29016o);
        int i16 = iArr[1];
        if (z10) {
            i11 = (aVar.g() - 1) - i16;
            i12 = (aVar.g() - 1) - i14;
        } else {
            i11 = i16;
            i12 = i14;
        }
        return new c(p10, new int[]{i14, iArr[1]}, i12, i11, i10);
    }

    public n b(int i10, z8.a aVar, Map<v8.e, ?> map) throws j {
        q(this.f29017g, v(aVar, false, i10, map));
        aVar.k();
        q(this.f29018h, v(aVar, true, i10, map));
        aVar.k();
        for (d next : this.f29017g) {
            if (next.c() > 1) {
                for (d next2 : this.f29018h) {
                    if (next2.c() > 1 && s(next, next2)) {
                        return t(next, next2);
                    }
                }
                continue;
            }
        }
        throw j.a();
    }

    public void reset() {
        this.f29017g.clear();
        this.f29018h.clear();
    }
}
