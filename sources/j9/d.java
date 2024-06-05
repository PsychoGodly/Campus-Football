package j9;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import h9.k;
import i9.a;
import i9.b;
import i9.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v8.e;
import v8.f;
import v8.j;
import v8.n;
import v8.p;

/* compiled from: RSSExpandedReader */
public final class d extends a {

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f29091k = {7, 5, 4, 3, 1};

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f29092l = {4, 20, 52, 104, 204};

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f29093m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n  reason: collision with root package name */
    private static final int[][] f29094n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o  reason: collision with root package name */
    private static final int[][] f29095o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, R.styleable.AppCompatTheme_tooltipFrameBackground}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p  reason: collision with root package name */
    private static final int[][] f29096p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g  reason: collision with root package name */
    private final List<b> f29097g = new ArrayList(11);

    /* renamed from: h  reason: collision with root package name */
    private final List<c> f29098h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final int[] f29099i = new int[2];

    /* renamed from: j  reason: collision with root package name */
    private boolean f29100j;

    private static boolean A(Iterable<b> iterable, Iterable<c> iterable2) {
        boolean z10;
        boolean z11;
        Iterator<c> it = iterable2.iterator();
        do {
            z10 = false;
            if (it.hasNext()) {
                c next = it.next();
                Iterator<b> it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z10 = true;
                        continue;
                        break;
                    }
                    b next2 = it2.next();
                    Iterator<b> it3 = next.a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                z11 = true;
                                continue;
                                break;
                            }
                        } else {
                            z11 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z11) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z10);
        return true;
    }

    private static boolean B(List<b> list) {
        boolean z10;
        for (int[] iArr : f29096p) {
            if (list.size() <= iArr.length) {
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        z10 = true;
                        break;
                    } else if (list.get(i10).b().c() != iArr[i10]) {
                        z10 = false;
                        break;
                    } else {
                        i10++;
                    }
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    private c C(z8.a aVar, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        if (z10) {
            int i14 = this.f29099i[0] - 1;
            while (i14 >= 0 && !aVar.c(i14)) {
                i14--;
            }
            int i15 = i14 + 1;
            int[] iArr = this.f29099i;
            i13 = iArr[0] - i15;
            i11 = iArr[1];
            i12 = i15;
        } else {
            int[] iArr2 = this.f29099i;
            int i16 = iArr2[0];
            int f10 = aVar.f(iArr2[1] + 1);
            i11 = f10;
            i12 = i16;
            i13 = f10 - this.f29099i[1];
        }
        int[] i17 = i();
        System.arraycopy(i17, 0, i17, 1, i17.length - 1);
        i17[0] = i13;
        try {
            return new c(a.p(i17, f29094n), new int[]{i12, i11}, i12, i11, i10);
        } catch (j unused) {
            return null;
        }
    }

    private static void D(List<b> list, List<c> list2) {
        boolean z10;
        Iterator<c> it = list2.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.a().size() != list.size()) {
                Iterator<b> it2 = next.a().iterator();
                while (true) {
                    z10 = false;
                    boolean z11 = true;
                    if (!it2.hasNext()) {
                        z10 = true;
                        break;
                    }
                    b next2 = it2.next();
                    Iterator<b> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                continue;
                                break;
                            }
                        } else {
                            z11 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z11) {
                        break;
                    }
                }
                if (z10) {
                    it.remove();
                }
            }
        }
    }

    private static void F(int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length / 2; i10++) {
            int i11 = iArr[i10];
            int i12 = (length - i10) - 1;
            iArr[i10] = iArr[i12];
            iArr[i12] = i11;
        }
    }

    private void G(int i10, boolean z10) {
        boolean z11 = false;
        int i11 = 0;
        boolean z12 = false;
        while (true) {
            if (i11 >= this.f29098h.size()) {
                break;
            }
            c cVar = this.f29098h.get(i11);
            if (cVar.b() > i10) {
                z11 = cVar.c(this.f29097g);
                break;
            } else {
                z12 = cVar.c(this.f29097g);
                i11++;
            }
        }
        if (!z11 && !z12 && !A(this.f29097g, this.f29098h)) {
            this.f29098h.add(i11, new c(this.f29097g, i10, z10));
            D(this.f29097g, this.f29098h);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q(int r11) throws v8.j {
        /*
            r10 = this;
            int[] r0 = r10.l()
            int r0 = a9.a.d(r0)
            int[] r1 = r10.j()
            int r1 = a9.a.d(r1)
            r2 = 4
            r3 = 13
            r4 = 0
            r5 = 1
            if (r0 <= r3) goto L_0x001a
            r6 = 0
            r7 = 1
            goto L_0x0020
        L_0x001a:
            if (r0 >= r2) goto L_0x001e
            r6 = 1
            goto L_0x001f
        L_0x001e:
            r6 = 0
        L_0x001f:
            r7 = 0
        L_0x0020:
            if (r1 <= r3) goto L_0x0025
            r2 = 0
            r3 = 1
            goto L_0x002b
        L_0x0025:
            if (r1 >= r2) goto L_0x0029
            r2 = 1
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            r3 = 0
        L_0x002b:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r5) goto L_0x0034
            r11 = 1
            goto L_0x0035
        L_0x0034:
            r11 = 0
        L_0x0035:
            r9 = r1 & 1
            if (r9 != 0) goto L_0x003a
            r4 = 1
        L_0x003a:
            if (r8 != r5) goto L_0x0052
            if (r11 == 0) goto L_0x0048
            if (r4 != 0) goto L_0x0043
            r5 = r6
        L_0x0041:
            r7 = 1
            goto L_0x007d
        L_0x0043:
            v8.j r11 = v8.j.a()
            throw r11
        L_0x0048:
            if (r4 == 0) goto L_0x004d
            r5 = r6
        L_0x004b:
            r3 = 1
            goto L_0x007d
        L_0x004d:
            v8.j r11 = v8.j.a()
            throw r11
        L_0x0052:
            r9 = -1
            if (r8 != r9) goto L_0x0069
            if (r11 == 0) goto L_0x005f
            if (r4 != 0) goto L_0x005a
            goto L_0x007d
        L_0x005a:
            v8.j r11 = v8.j.a()
            throw r11
        L_0x005f:
            if (r4 == 0) goto L_0x0064
            r5 = r6
            r2 = 1
            goto L_0x007d
        L_0x0064:
            v8.j r11 = v8.j.a()
            throw r11
        L_0x0069:
            if (r8 != 0) goto L_0x00c7
            if (r11 == 0) goto L_0x007a
            if (r4 == 0) goto L_0x0075
            if (r0 >= r1) goto L_0x0072
            goto L_0x004b
        L_0x0072:
            r5 = r6
            r2 = 1
            goto L_0x0041
        L_0x0075:
            v8.j r11 = v8.j.a()
            throw r11
        L_0x007a:
            if (r4 != 0) goto L_0x00c2
            r5 = r6
        L_0x007d:
            if (r5 == 0) goto L_0x0092
            if (r7 != 0) goto L_0x008d
            int[] r11 = r10.l()
            float[] r0 = r10.m()
            i9.a.n(r11, r0)
            goto L_0x0092
        L_0x008d:
            v8.j r11 = v8.j.a()
            throw r11
        L_0x0092:
            if (r7 == 0) goto L_0x009f
            int[] r11 = r10.l()
            float[] r0 = r10.m()
            i9.a.g(r11, r0)
        L_0x009f:
            if (r2 == 0) goto L_0x00b4
            if (r3 != 0) goto L_0x00af
            int[] r11 = r10.j()
            float[] r0 = r10.m()
            i9.a.n(r11, r0)
            goto L_0x00b4
        L_0x00af:
            v8.j r11 = v8.j.a()
            throw r11
        L_0x00b4:
            if (r3 == 0) goto L_0x00c1
            int[] r11 = r10.j()
            float[] r0 = r10.k()
            i9.a.g(r11, r0)
        L_0x00c1:
            return
        L_0x00c2:
            v8.j r11 = v8.j.a()
            throw r11
        L_0x00c7:
            v8.j r11 = v8.j.a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.d.q(int):void");
    }

    private boolean r() {
        b bVar = this.f29097g.get(0);
        b c10 = bVar.c();
        b d10 = bVar.d();
        if (d10 == null) {
            return false;
        }
        int a10 = d10.a();
        int i10 = 2;
        for (int i11 = 1; i11 < this.f29097g.size(); i11++) {
            b bVar2 = this.f29097g.get(i11);
            a10 += bVar2.c().a();
            i10++;
            b d11 = bVar2.d();
            if (d11 != null) {
                a10 += d11.a();
                i10++;
            }
        }
        if (((i10 - 4) * 211) + (a10 % 211) == c10.b()) {
            return true;
        }
        return false;
    }

    private List<b> s(List<c> list, int i10) throws j {
        while (i10 < this.f29098h.size()) {
            c cVar = this.f29098h.get(i10);
            this.f29097g.clear();
            for (c a10 : list) {
                this.f29097g.addAll(a10.a());
            }
            this.f29097g.addAll(cVar.a());
            if (!B(this.f29097g)) {
                i10++;
            } else if (r()) {
                return this.f29097g;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.add(cVar);
                try {
                    return s(arrayList, i10 + 1);
                } catch (j unused) {
                }
            }
        }
        throw j.a();
    }

    private List<b> t(boolean z10) {
        List<b> list = null;
        if (this.f29098h.size() > 25) {
            this.f29098h.clear();
            return null;
        }
        this.f29097g.clear();
        if (z10) {
            Collections.reverse(this.f29098h);
        }
        try {
            list = s(new ArrayList(), 0);
        } catch (j unused) {
        }
        if (z10) {
            Collections.reverse(this.f29098h);
        }
        return list;
    }

    static n u(List<b> list) throws j, f {
        String d10 = k9.j.a(a.a(list)).d();
        p[] a10 = list.get(0).b().a();
        p[] a11 = list.get(list.size() - 1).b().a();
        return new n(d10, (byte[]) null, new p[]{a10[0], a10[1], a11[0], a11[1]}, v8.a.RSS_EXPANDED);
    }

    private void x(z8.a aVar, List<b> list, int i10) throws j {
        int[] i11 = i();
        i11[0] = 0;
        i11[1] = 0;
        i11[2] = 0;
        i11[3] = 0;
        int g10 = aVar.g();
        if (i10 < 0) {
            if (list.isEmpty()) {
                i10 = 0;
            } else {
                i10 = list.get(list.size() - 1).b().b()[1];
            }
        }
        boolean z10 = list.size() % 2 != 0;
        if (this.f29100j) {
            z10 = !z10;
        }
        boolean z11 = false;
        while (i10 < g10) {
            z11 = !aVar.c(i10);
            if (!z11) {
                break;
            }
            i10++;
        }
        boolean z12 = z11;
        int i12 = 0;
        int i13 = i10;
        while (i10 < g10) {
            if (aVar.c(i10) ^ z12) {
                i11[i12] = i11[i12] + 1;
            } else {
                if (i12 == 3) {
                    if (z10) {
                        F(i11);
                    }
                    if (a.o(i11)) {
                        int[] iArr = this.f29099i;
                        iArr[0] = i13;
                        iArr[1] = i10;
                        return;
                    }
                    if (z10) {
                        F(i11);
                    }
                    i13 += i11[0] + i11[1];
                    i11[0] = i11[2];
                    i11[1] = i11[3];
                    i11[2] = 0;
                    i11[3] = 0;
                    i12--;
                } else {
                    i12++;
                }
                i11[i12] = 1;
                z12 = !z12;
            }
            i10++;
        }
        throw j.a();
    }

    private static int y(z8.a aVar, int i10) {
        if (aVar.c(i10)) {
            return aVar.e(aVar.f(i10));
        }
        return aVar.f(aVar.e(i10));
    }

    private static boolean z(c cVar, boolean z10, boolean z11) {
        return cVar.c() != 0 || !z10 || !z11;
    }

    /* access modifiers changed from: package-private */
    public b E(z8.a aVar, List<b> list, int i10) throws j {
        c C;
        b bVar;
        boolean z10 = list.size() % 2 == 0;
        if (this.f29100j) {
            z10 = !z10;
        }
        int i11 = -1;
        boolean z11 = true;
        do {
            x(aVar, list, i11);
            C = C(aVar, i10, z10);
            if (C == null) {
                i11 = y(aVar, this.f29099i[0]);
                continue;
            } else {
                z11 = false;
                continue;
            }
        } while (z11);
        b v10 = v(aVar, C, z10, true);
        if (list.isEmpty() || !list.get(list.size() - 1).f()) {
            try {
                bVar = v(aVar, C, z10, false);
            } catch (j unused) {
                bVar = null;
            }
            return new b(v10, bVar, C, true);
        }
        throw j.a();
    }

    public n b(int i10, z8.a aVar, Map<e, ?> map) throws j, f {
        this.f29097g.clear();
        this.f29100j = false;
        try {
            return u(w(i10, aVar));
        } catch (j unused) {
            this.f29097g.clear();
            this.f29100j = true;
            return u(w(i10, aVar));
        }
    }

    public void reset() {
        this.f29097g.clear();
        this.f29098h.clear();
    }

    /* access modifiers changed from: package-private */
    public b v(z8.a aVar, c cVar, boolean z10, boolean z11) throws j {
        z8.a aVar2 = aVar;
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
            k.e(aVar2, cVar.b()[1], h10);
            int i10 = 0;
            for (int length = h10.length - 1; i10 < length; length--) {
                int i11 = h10[i10];
                h10[i10] = h10[length];
                h10[length] = i11;
                i10++;
            }
        }
        float d10 = ((float) a9.a.d(h10)) / 17.0f;
        float f10 = ((float) (cVar.b()[1] - cVar.b()[0])) / 15.0f;
        if (Math.abs(d10 - f10) / f10 <= 0.3f) {
            int[] l10 = l();
            int[] j10 = j();
            float[] m10 = m();
            float[] k10 = k();
            for (int i12 = 0; i12 < h10.length; i12++) {
                float f11 = (((float) h10[i12]) * 1.0f) / d10;
                int i13 = (int) (0.5f + f11);
                if (i13 <= 0) {
                    if (f11 >= 0.3f) {
                        i13 = 1;
                    } else {
                        throw j.a();
                    }
                } else if (i13 > 8) {
                    if (f11 <= 8.7f) {
                        i13 = 8;
                    } else {
                        throw j.a();
                    }
                }
                int i14 = i12 / 2;
                if ((i12 & 1) == 0) {
                    l10[i14] = i13;
                    m10[i14] = f11 - ((float) i13);
                } else {
                    j10[i14] = i13;
                    k10[i14] = f11 - ((float) i13);
                }
            }
            q(17);
            int c10 = (((cVar.c() * 4) + (z10 ? 0 : 2)) + (z11 ^ true ? 1 : 0)) - 1;
            int i15 = 0;
            int i16 = 0;
            for (int length2 = l10.length - 1; length2 >= 0; length2--) {
                if (z(cVar, z10, z11)) {
                    i15 += l10[length2] * f29095o[c10][length2 * 2];
                }
                i16 += l10[length2];
            }
            int i17 = 0;
            for (int length3 = j10.length - 1; length3 >= 0; length3--) {
                if (z(cVar, z10, z11)) {
                    i17 += j10[length3] * f29095o[c10][(length3 * 2) + 1];
                }
            }
            int i18 = i15 + i17;
            if ((i16 & 1) != 0 || i16 > 13 || i16 < 4) {
                throw j.a();
            }
            int i19 = (13 - i16) / 2;
            int i20 = f29091k[i19];
            return new b((i9.f.b(l10, i20, true) * f29092l[i19]) + i9.f.b(j10, 9 - i20, false) + f29093m[i19], i18);
        }
        throw j.a();
    }

    /* access modifiers changed from: package-private */
    public List<b> w(int i10, z8.a aVar) throws j {
        while (true) {
            try {
                this.f29097g.add(E(aVar, this.f29097g, i10));
            } catch (j e10) {
                if (this.f29097g.isEmpty()) {
                    throw e10;
                } else if (r()) {
                    return this.f29097g;
                } else {
                    boolean z10 = !this.f29098h.isEmpty();
                    G(i10, false);
                    if (z10) {
                        List<b> t10 = t(false);
                        if (t10 != null) {
                            return t10;
                        }
                        List<b> t11 = t(true);
                        if (t11 != null) {
                            return t11;
                        }
                    }
                    throw j.a();
                }
            }
        }
    }
}
