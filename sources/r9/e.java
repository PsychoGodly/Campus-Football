package r9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import v8.j;
import v8.p;
import v8.q;

/* compiled from: FinderPatternFinder */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final z8.b f30105a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f30106b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f30107c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f30108d = new int[5];

    /* renamed from: e  reason: collision with root package name */
    private final q f30109e;

    /* compiled from: FinderPatternFinder */
    private static final class b implements Serializable, Comparator<d> {

        /* renamed from: a  reason: collision with root package name */
        private final float f30110a;

        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            if (dVar2.h() != dVar.h()) {
                return dVar2.h() - dVar.h();
            }
            float abs = Math.abs(dVar2.i() - this.f30110a);
            float abs2 = Math.abs(dVar.i() - this.f30110a);
            if (abs < abs2) {
                return 1;
            }
            return abs == abs2 ? 0 : -1;
        }

        private b(float f10) {
            this.f30110a = f10;
        }
    }

    /* compiled from: FinderPatternFinder */
    private static final class c implements Serializable, Comparator<d> {

        /* renamed from: a  reason: collision with root package name */
        private final float f30111a;

        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            float abs = Math.abs(dVar2.i() - this.f30111a);
            float abs2 = Math.abs(dVar.i() - this.f30111a);
            if (abs < abs2) {
                return -1;
            }
            return abs == abs2 ? 0 : 1;
        }

        private c(float f10) {
            this.f30111a = f10;
        }
    }

    public e(z8.b bVar, q qVar) {
        this.f30105a = bVar;
        this.f30109e = qVar;
    }

    private static float a(int[] iArr, int i10) {
        return ((float) ((i10 - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b7 A[LOOP:4: B:41:0x00a2->B:49:0x00b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bf A[ADDED_TO_REGION, EDGE_INSN: B:87:0x00bf->B:50:0x00bf ?: BREAK  
    EDGE_INSN: B:88:0x00bf->B:50:0x00bf ?: BREAK  
    EDGE_INSN: B:89:0x00bf->B:50:0x00bf ?: BREAK  
    EDGE_INSN: B:90:0x00bf->B:50:0x00bf ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00df A[LOOP:5: B:55:0x00ca->B:63:0x00df, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e7 A[EDGE_INSN: B:91:0x00e7->B:64:0x00e7 ?: BREAK  
    EDGE_INSN: B:92:0x00e7->B:64:0x00e7 ?: BREAK  
    EDGE_INSN: B:93:0x00e7->B:64:0x00e7 ?: BREAK  
    EDGE_INSN: B:94:0x00e7->B:64:0x00e7 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(int r17, int r18, int r19, int r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int[] r4 = r16.h()
            r5 = 0
            r6 = 0
        L_0x000e:
            r7 = 2
            r8 = 1
            if (r1 < r6) goto L_0x0028
            if (r2 < r6) goto L_0x0028
            z8.b r9 = r0.f30105a
            int r10 = r2 - r6
            int r11 = r1 - r6
            boolean r9 = r9.d(r10, r11)
            if (r9 == 0) goto L_0x0028
            r9 = r4[r7]
            int r9 = r9 + r8
            r4[r7] = r9
            int r6 = r6 + 1
            goto L_0x000e
        L_0x0028:
            if (r1 < r6) goto L_0x010b
            if (r2 >= r6) goto L_0x002e
            goto L_0x010b
        L_0x002e:
            if (r1 < r6) goto L_0x004a
            if (r2 < r6) goto L_0x004a
            z8.b r9 = r0.f30105a
            int r10 = r2 - r6
            int r11 = r1 - r6
            boolean r9 = r9.d(r10, r11)
            if (r9 != 0) goto L_0x004a
            r9 = r4[r8]
            if (r9 > r3) goto L_0x004a
            r9 = r4[r8]
            int r9 = r9 + r8
            r4[r8] = r9
            int r6 = r6 + 1
            goto L_0x002e
        L_0x004a:
            if (r1 < r6) goto L_0x010b
            if (r2 < r6) goto L_0x010b
            r9 = r4[r8]
            if (r9 <= r3) goto L_0x0054
            goto L_0x010b
        L_0x0054:
            if (r1 < r6) goto L_0x0070
            if (r2 < r6) goto L_0x0070
            z8.b r9 = r0.f30105a
            int r10 = r2 - r6
            int r11 = r1 - r6
            boolean r9 = r9.d(r10, r11)
            if (r9 == 0) goto L_0x0070
            r9 = r4[r5]
            if (r9 > r3) goto L_0x0070
            r9 = r4[r5]
            int r9 = r9 + r8
            r4[r5] = r9
            int r6 = r6 + 1
            goto L_0x0054
        L_0x0070:
            r6 = r4[r5]
            if (r6 <= r3) goto L_0x0075
            return r5
        L_0x0075:
            z8.b r6 = r0.f30105a
            int r6 = r6.g()
            z8.b r9 = r0.f30105a
            int r9 = r9.k()
            r10 = 1
        L_0x0082:
            int r11 = r1 + r10
            if (r11 >= r6) goto L_0x009a
            int r12 = r2 + r10
            if (r12 >= r9) goto L_0x009a
            z8.b r13 = r0.f30105a
            boolean r12 = r13.d(r12, r11)
            if (r12 == 0) goto L_0x009a
            r11 = r4[r7]
            int r11 = r11 + r8
            r4[r7] = r11
            int r10 = r10 + 1
            goto L_0x0082
        L_0x009a:
            if (r11 >= r6) goto L_0x010b
            int r11 = r2 + r10
            if (r11 < r9) goto L_0x00a2
            goto L_0x010b
        L_0x00a2:
            int r11 = r1 + r10
            r12 = 3
            if (r11 >= r6) goto L_0x00bf
            int r13 = r2 + r10
            if (r13 >= r9) goto L_0x00bf
            z8.b r14 = r0.f30105a
            boolean r13 = r14.d(r13, r11)
            if (r13 != 0) goto L_0x00bf
            r13 = r4[r12]
            if (r13 >= r3) goto L_0x00bf
            r11 = r4[r12]
            int r11 = r11 + r8
            r4[r12] = r11
            int r10 = r10 + 1
            goto L_0x00a2
        L_0x00bf:
            if (r11 >= r6) goto L_0x010b
            int r11 = r2 + r10
            if (r11 >= r9) goto L_0x010b
            r11 = r4[r12]
            if (r11 < r3) goto L_0x00ca
            goto L_0x010b
        L_0x00ca:
            int r11 = r1 + r10
            r13 = 4
            if (r11 >= r6) goto L_0x00e7
            int r14 = r2 + r10
            if (r14 >= r9) goto L_0x00e7
            z8.b r15 = r0.f30105a
            boolean r11 = r15.d(r14, r11)
            if (r11 == 0) goto L_0x00e7
            r11 = r4[r13]
            if (r11 >= r3) goto L_0x00e7
            r11 = r4[r13]
            int r11 = r11 + r8
            r4[r13] = r11
            int r10 = r10 + 1
            goto L_0x00ca
        L_0x00e7:
            r1 = r4[r13]
            if (r1 < r3) goto L_0x00ec
            return r5
        L_0x00ec:
            r1 = r4[r5]
            r2 = r4[r8]
            int r1 = r1 + r2
            r2 = r4[r7]
            int r1 = r1 + r2
            r2 = r4[r12]
            int r1 = r1 + r2
            r2 = r4[r13]
            int r1 = r1 + r2
            int r1 = r1 - r20
            int r1 = java.lang.Math.abs(r1)
            int r2 = r20 * 2
            if (r1 >= r2) goto L_0x010b
            boolean r1 = g(r4)
            if (r1 == 0) goto L_0x010b
            return r8
        L_0x010b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.e.b(int, int, int, int):boolean");
    }

    private float c(int i10, int i11, int i12, int i13) {
        z8.b bVar = this.f30105a;
        int k10 = bVar.k();
        int[] h10 = h();
        int i14 = i10;
        while (i14 >= 0 && bVar.d(i14, i11)) {
            h10[2] = h10[2] + 1;
            i14--;
        }
        if (i14 < 0) {
            return Float.NaN;
        }
        while (i14 >= 0 && !bVar.d(i14, i11) && h10[1] <= i12) {
            h10[1] = h10[1] + 1;
            i14--;
        }
        if (i14 >= 0 && h10[1] <= i12) {
            while (i14 >= 0 && bVar.d(i14, i11) && h10[0] <= i12) {
                h10[0] = h10[0] + 1;
                i14--;
            }
            if (h10[0] > i12) {
                return Float.NaN;
            }
            int i15 = i10 + 1;
            while (i15 < k10 && bVar.d(i15, i11)) {
                h10[2] = h10[2] + 1;
                i15++;
            }
            if (i15 == k10) {
                return Float.NaN;
            }
            while (i15 < k10 && !bVar.d(i15, i11) && h10[3] < i12) {
                h10[3] = h10[3] + 1;
                i15++;
            }
            if (i15 != k10 && h10[3] < i12) {
                while (i15 < k10 && bVar.d(i15, i11) && h10[4] < i12) {
                    h10[4] = h10[4] + 1;
                    i15++;
                }
                if (h10[4] < i12 && Math.abs(((((h10[0] + h10[1]) + h10[2]) + h10[3]) + h10[4]) - i13) * 5 < i13 && g(h10)) {
                    return a(h10, i15);
                }
            }
        }
        return Float.NaN;
    }

    private float d(int i10, int i11, int i12, int i13) {
        z8.b bVar = this.f30105a;
        int g10 = bVar.g();
        int[] h10 = h();
        int i14 = i10;
        while (i14 >= 0 && bVar.d(i11, i14)) {
            h10[2] = h10[2] + 1;
            i14--;
        }
        if (i14 < 0) {
            return Float.NaN;
        }
        while (i14 >= 0 && !bVar.d(i11, i14) && h10[1] <= i12) {
            h10[1] = h10[1] + 1;
            i14--;
        }
        if (i14 >= 0 && h10[1] <= i12) {
            while (i14 >= 0 && bVar.d(i11, i14) && h10[0] <= i12) {
                h10[0] = h10[0] + 1;
                i14--;
            }
            if (h10[0] > i12) {
                return Float.NaN;
            }
            int i15 = i10 + 1;
            while (i15 < g10 && bVar.d(i11, i15)) {
                h10[2] = h10[2] + 1;
                i15++;
            }
            if (i15 == g10) {
                return Float.NaN;
            }
            while (i15 < g10 && !bVar.d(i11, i15) && h10[3] < i12) {
                h10[3] = h10[3] + 1;
                i15++;
            }
            if (i15 != g10 && h10[3] < i12) {
                while (i15 < g10 && bVar.d(i11, i15) && h10[4] < i12) {
                    h10[4] = h10[4] + 1;
                    i15++;
                }
                if (h10[4] < i12 && Math.abs(((((h10[0] + h10[1]) + h10[2]) + h10[3]) + h10[4]) - i13) * 5 < i13 * 2 && g(h10)) {
                    return a(h10, i15);
                }
            }
        }
        return Float.NaN;
    }

    private int f() {
        if (this.f30106b.size() <= 1) {
            return 0;
        }
        d dVar = null;
        for (d next : this.f30106b) {
            if (next.h() >= 2) {
                if (dVar == null) {
                    dVar = next;
                } else {
                    this.f30107c = true;
                    return ((int) (Math.abs(dVar.c() - next.c()) - Math.abs(dVar.d() - next.d()))) / 2;
                }
            }
        }
        return 0;
    }

    protected static boolean g(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = ((float) i10) / 7.0f;
        float f11 = f10 / 2.0f;
        if (Math.abs(f10 - ((float) iArr[0])) >= f11 || Math.abs(f10 - ((float) iArr[1])) >= f11 || Math.abs((f10 * 3.0f) - ((float) iArr[2])) >= 3.0f * f11 || Math.abs(f10 - ((float) iArr[3])) >= f11 || Math.abs(f10 - ((float) iArr[4])) >= f11) {
            return false;
        }
        return true;
    }

    private int[] h() {
        int[] iArr = this.f30108d;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        return iArr;
    }

    private boolean j() {
        int size = this.f30106b.size();
        float f10 = 0.0f;
        int i10 = 0;
        float f11 = 0.0f;
        for (d next : this.f30106b) {
            if (next.h() >= 2) {
                i10++;
                f11 += next.i();
            }
        }
        if (i10 < 3) {
            return false;
        }
        float f12 = f11 / ((float) size);
        for (d i11 : this.f30106b) {
            f10 += Math.abs(i11.i() - f12);
        }
        if (f10 <= f11 * 0.05f) {
            return true;
        }
        return false;
    }

    private d[] k() throws j {
        int size = this.f30106b.size();
        if (size >= 3) {
            float f10 = 0.0f;
            if (size > 3) {
                float f11 = 0.0f;
                float f12 = 0.0f;
                for (d i10 : this.f30106b) {
                    float i11 = i10.i();
                    f11 += i11;
                    f12 += i11 * i11;
                }
                float f13 = (float) size;
                float f14 = f11 / f13;
                float sqrt = (float) Math.sqrt((double) ((f12 / f13) - (f14 * f14)));
                Collections.sort(this.f30106b, new c(f14));
                float max = Math.max(0.2f * f14, sqrt);
                int i12 = 0;
                while (i12 < this.f30106b.size() && this.f30106b.size() > 3) {
                    if (Math.abs(this.f30106b.get(i12).i() - f14) > max) {
                        this.f30106b.remove(i12);
                        i12--;
                    }
                    i12++;
                }
            }
            if (this.f30106b.size() > 3) {
                for (d i13 : this.f30106b) {
                    f10 += i13.i();
                }
                Collections.sort(this.f30106b, new b(f10 / ((float) this.f30106b.size())));
                List<d> list = this.f30106b;
                list.subList(3, list.size()).clear();
            }
            return new d[]{this.f30106b.get(0), this.f30106b.get(1), this.f30106b.get(2)};
        }
        throw j.a();
    }

    /* access modifiers changed from: package-private */
    public final f e(Map<v8.e, ?> map) throws j {
        boolean z10 = map != null && map.containsKey(v8.e.TRY_HARDER);
        boolean z11 = map != null && map.containsKey(v8.e.PURE_BARCODE);
        int g10 = this.f30105a.g();
        int k10 = this.f30105a.k();
        int i10 = (g10 * 3) / 228;
        if (i10 < 3 || z10) {
            i10 = 3;
        }
        int[] iArr = new int[5];
        int i11 = i10 - 1;
        boolean z12 = false;
        while (i11 < g10 && !z12) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            int i12 = 0;
            int i13 = 0;
            while (i12 < k10) {
                if (this.f30105a.d(i12, i11)) {
                    if ((i13 & 1) == 1) {
                        i13++;
                    }
                    iArr[i13] = iArr[i13] + 1;
                } else if ((i13 & 1) != 0) {
                    iArr[i13] = iArr[i13] + 1;
                } else if (i13 == 4) {
                    if (!g(iArr)) {
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = 1;
                        iArr[4] = 0;
                    } else if (i(iArr, i11, i12, z11)) {
                        if (this.f30107c) {
                            z12 = j();
                        } else {
                            int f10 = f();
                            if (f10 > iArr[2]) {
                                i11 += (f10 - iArr[2]) - 2;
                                i12 = k10 - 1;
                            }
                        }
                        iArr[0] = 0;
                        iArr[1] = 0;
                        iArr[2] = 0;
                        iArr[3] = 0;
                        iArr[4] = 0;
                        i10 = 2;
                        i13 = 0;
                    } else {
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = 1;
                        iArr[4] = 0;
                    }
                    i13 = 3;
                } else {
                    i13++;
                    iArr[i13] = iArr[i13] + 1;
                }
                i12++;
            }
            if (g(iArr) && i(iArr, i11, k10, z11)) {
                i10 = iArr[0];
                if (this.f30107c) {
                    z12 = j();
                }
            }
            i11 += i10;
        }
        d[] k11 = k();
        p.e(k11);
        return new f(k11);
    }

    /* access modifiers changed from: protected */
    public final boolean i(int[] iArr, int i10, int i11, boolean z10) {
        boolean z11 = false;
        int i12 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a10 = (int) a(iArr, i11);
        float d10 = d(i10, a10, iArr[2], i12);
        if (!Float.isNaN(d10)) {
            int i13 = (int) d10;
            float c10 = c(a10, i13, iArr[2], i12);
            if (!Float.isNaN(c10) && (!z10 || b(i13, (int) c10, iArr[2], i12))) {
                float f10 = ((float) i12) / 7.0f;
                int i14 = 0;
                while (true) {
                    if (i14 >= this.f30106b.size()) {
                        break;
                    }
                    d dVar = this.f30106b.get(i14);
                    if (dVar.f(f10, d10, c10)) {
                        this.f30106b.set(i14, dVar.g(d10, c10, f10));
                        z11 = true;
                        break;
                    }
                    i14++;
                }
                if (!z11) {
                    d dVar2 = new d(c10, d10, f10);
                    this.f30106b.add(dVar2);
                    q qVar = this.f30109e;
                    if (qVar != null) {
                        qVar.a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
