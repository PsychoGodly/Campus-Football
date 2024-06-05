package h9;

import java.util.Arrays;
import java.util.Map;
import v8.c;
import v8.d;
import v8.e;
import v8.f;
import v8.j;
import v8.l;
import v8.n;
import v8.o;
import v8.p;
import z8.a;

/* compiled from: OneDReader */
public abstract class k implements l {
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d A[Catch:{ m -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private v8.n c(v8.c r22, java.util.Map<v8.e, ?> r23) throws v8.j {
        /*
            r21 = this;
            r0 = r23
            int r1 = r22.d()
            int r2 = r22.c()
            z8.a r3 = new z8.a
            r3.<init>(r1)
            int r4 = r2 >> 1
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x001f
            v8.e r7 = v8.e.TRY_HARDER
            boolean r7 = r0.containsKey(r7)
            if (r7 == 0) goto L_0x001f
            r7 = 1
            goto L_0x0020
        L_0x001f:
            r7 = 0
        L_0x0020:
            if (r7 == 0) goto L_0x0025
            r8 = 8
            goto L_0x0026
        L_0x0025:
            r8 = 5
        L_0x0026:
            int r8 = r2 >> r8
            int r8 = java.lang.Math.max(r6, r8)
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = 15
        L_0x0032:
            r9 = 0
        L_0x0033:
            if (r9 >= r7) goto L_0x00e1
            int r10 = r9 + 1
            int r11 = r10 / 2
            r9 = r9 & 1
            if (r9 != 0) goto L_0x003f
            r9 = 1
            goto L_0x0040
        L_0x003f:
            r9 = 0
        L_0x0040:
            if (r9 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            int r11 = -r11
        L_0x0044:
            int r11 = r11 * r8
            int r11 = r11 + r4
            if (r11 < 0) goto L_0x00e1
            if (r11 >= r2) goto L_0x00e1
            r9 = r22
            z8.a r3 = r9.b(r11, r3)     // Catch:{ j -> 0x00d5 }
            r12 = 0
        L_0x0052:
            r13 = 2
            if (r12 >= r13) goto L_0x00d5
            if (r12 != r6) goto L_0x0075
            r3.k()
            if (r0 == 0) goto L_0x0075
            v8.e r13 = v8.e.NEED_RESULT_POINT_CALLBACK
            boolean r14 = r0.containsKey(r13)
            if (r14 == 0) goto L_0x0075
            java.util.EnumMap r14 = new java.util.EnumMap
            java.lang.Class<v8.e> r15 = v8.e.class
            r14.<init>(r15)
            r14.putAll(r0)
            r14.remove(r13)
            r13 = r21
            r0 = r14
            goto L_0x0077
        L_0x0075:
            r13 = r21
        L_0x0077:
            v8.n r14 = r13.b(r11, r3, r0)     // Catch:{ m -> 0x00c6 }
            if (r12 != r6) goto L_0x00c5
            v8.o r15 = v8.o.ORIENTATION     // Catch:{ m -> 0x00c6 }
            r16 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)     // Catch:{ m -> 0x00c6 }
            r14.h(r15, r6)     // Catch:{ m -> 0x00c6 }
            v8.p[] r6 = r14.e()     // Catch:{ m -> 0x00c6 }
            if (r6 == 0) goto L_0x00c5
            v8.p r15 = new v8.p     // Catch:{ m -> 0x00c6 }
            r16 = r0
            float r0 = (float) r1
            r18 = r6[r5]     // Catch:{ m -> 0x00c8 }
            float r18 = r18.c()     // Catch:{ m -> 0x00c8 }
            float r18 = r0 - r18
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = r1
            float r1 = r18 - r19
            r18 = r6[r5]     // Catch:{ m -> 0x00ca }
            float r5 = r18.d()     // Catch:{ m -> 0x00ca }
            r15.<init>(r1, r5)     // Catch:{ m -> 0x00ca }
            r1 = 0
            r6[r1] = r15     // Catch:{ m -> 0x00ca }
            v8.p r5 = new v8.p     // Catch:{ m -> 0x00ca }
            r15 = 1
            r17 = r6[r15]     // Catch:{ m -> 0x00cb }
            float r17 = r17.c()     // Catch:{ m -> 0x00cb }
            float r0 = r0 - r17
            float r0 = r0 - r19
            r17 = r6[r15]     // Catch:{ m -> 0x00cb }
            float r1 = r17.d()     // Catch:{ m -> 0x00cb }
            r5.<init>(r0, r1)     // Catch:{ m -> 0x00cb }
            r6[r15] = r5     // Catch:{ m -> 0x00cb }
        L_0x00c5:
            return r14
        L_0x00c6:
            r16 = r0
        L_0x00c8:
            r20 = r1
        L_0x00ca:
            r15 = 1
        L_0x00cb:
            int r12 = r12 + 1
            r0 = r16
            r1 = r20
            r5 = 0
            r6 = 1
            goto L_0x0052
        L_0x00d5:
            r13 = r21
            r20 = r1
            r15 = 1
            r9 = r10
            r1 = r20
            r5 = 0
            r6 = 1
            goto L_0x0033
        L_0x00e1:
            r13 = r21
            v8.j r0 = v8.j.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.k.c(v8.c, java.util.Map):v8.n");
    }

    protected static float d(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = (float) i10;
        float f12 = f11 / ((float) i11);
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f15 = ((float) iArr2[i13]) * f12;
            float f16 = (float) i14;
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    protected static void e(a aVar, int i10, int[] iArr) throws j {
        int length = iArr.length;
        int i11 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int g10 = aVar.g();
        if (i10 < g10) {
            boolean z10 = !aVar.c(i10);
            while (i10 < g10) {
                if (!(aVar.c(i10) ^ z10)) {
                    i11++;
                    if (i11 == length) {
                        break;
                    }
                    iArr[i11] = 1;
                    z10 = !z10;
                } else {
                    iArr[i11] = iArr[i11] + 1;
                }
                i10++;
            }
            if (i11 == length) {
                return;
            }
            if (i11 != length - 1 || i10 != g10) {
                throw j.a();
            }
            return;
        }
        throw j.a();
    }

    protected static void f(a aVar, int i10, int[] iArr) throws j {
        int length = iArr.length;
        boolean c10 = aVar.c(i10);
        while (i10 > 0 && length >= 0) {
            i10--;
            if (aVar.c(i10) != c10) {
                length--;
                c10 = !c10;
            }
        }
        if (length < 0) {
            e(aVar, i10 + 1, iArr);
            return;
        }
        throw j.a();
    }

    public n a(c cVar, Map<e, ?> map) throws j, f {
        try {
            return c(cVar, map);
        } catch (j e10) {
            if (!(map != null && map.containsKey(e.TRY_HARDER)) || !cVar.e()) {
                throw e10;
            }
            c f10 = cVar.f();
            n c10 = c(f10, map);
            Map<o, Object> d10 = c10.d();
            int i10 = 270;
            if (d10 != null) {
                o oVar = o.ORIENTATION;
                if (d10.containsKey(oVar)) {
                    i10 = (((Integer) d10.get(oVar)).intValue() + 270) % 360;
                }
            }
            c10.h(o.ORIENTATION, Integer.valueOf(i10));
            p[] e11 = c10.e();
            if (e11 != null) {
                int c11 = f10.c();
                for (int i11 = 0; i11 < e11.length; i11++) {
                    e11[i11] = new p((((float) c11) - e11[i11].d()) - 1.0f, e11[i11].c());
                }
            }
            return c10;
        }
    }

    public abstract n b(int i10, a aVar, Map<e, ?> map) throws j, d, f;

    public void reset() {
    }
}
