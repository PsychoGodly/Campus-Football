package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import t.a;
import t.b;
import x.c;
import x.d;
import x.e;

/* compiled from: MotionController */
public class g {

    /* renamed from: a  reason: collision with root package name */
    boolean f2042a;

    /* renamed from: b  reason: collision with root package name */
    private k f2043b;

    /* renamed from: c  reason: collision with root package name */
    private k f2044c;

    /* renamed from: d  reason: collision with root package name */
    private f f2045d;

    /* renamed from: e  reason: collision with root package name */
    private f f2046e;

    /* renamed from: f  reason: collision with root package name */
    private a[] f2047f;

    /* renamed from: g  reason: collision with root package name */
    private a f2048g;

    /* renamed from: h  reason: collision with root package name */
    float f2049h;

    /* renamed from: i  reason: collision with root package name */
    float f2050i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f2051j;

    /* renamed from: k  reason: collision with root package name */
    private double[] f2052k;

    /* renamed from: l  reason: collision with root package name */
    private double[] f2053l;

    /* renamed from: m  reason: collision with root package name */
    private String[] f2054m;

    /* renamed from: n  reason: collision with root package name */
    private float[] f2055n;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList<k> f2056o;

    /* renamed from: p  reason: collision with root package name */
    private HashMap<String, e> f2057p;

    /* renamed from: q  reason: collision with root package name */
    private HashMap<String, d> f2058q;

    /* renamed from: r  reason: collision with root package name */
    private HashMap<String, c> f2059r;

    /* renamed from: s  reason: collision with root package name */
    private e[] f2060s;

    /* renamed from: t  reason: collision with root package name */
    private int f2061t;

    /* renamed from: u  reason: collision with root package name */
    private View f2062u;

    /* renamed from: v  reason: collision with root package name */
    private int f2063v;

    /* renamed from: w  reason: collision with root package name */
    private float f2064w;

    /* renamed from: x  reason: collision with root package name */
    private Interpolator f2065x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f2066y;

    private float a(float f10, float[] fArr) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f13 = this.f2050i;
            if (((double) f13) != 1.0d) {
                float f14 = this.f2049h;
                if (f10 < f14) {
                    f10 = 0.0f;
                }
                if (f10 > f14 && ((double) f10) < 1.0d) {
                    f10 = Math.min((f10 - f14) * f13, 1.0f);
                }
            }
        }
        b bVar = this.f2043b.f2114a;
        float f15 = Float.NaN;
        Iterator<k> it = this.f2056o.iterator();
        while (it.hasNext()) {
            k next = it.next();
            b bVar2 = next.f2114a;
            if (bVar2 != null) {
                float f16 = next.f2116c;
                if (f16 < f10) {
                    bVar = bVar2;
                    f11 = f16;
                } else if (Float.isNaN(f15)) {
                    f15 = next.f2116c;
                }
            }
        }
        if (bVar != null) {
            if (!Float.isNaN(f15)) {
                f12 = f15;
            }
            float f17 = f12 - f11;
            double d10 = (double) ((f10 - f11) / f17);
            f10 = (((float) bVar.a(d10)) * f17) + f11;
            if (fArr != null) {
                fArr[0] = (float) bVar.b(d10);
            }
        }
        return f10;
    }

    public void b(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f2047f[0].b(d10, dArr);
        this.f2047f[0].d(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f2043b.c(d10, this.f2051j, dArr, fArr, dArr2, fArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: x.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: x.e$a} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(android.view.View r21, float r22, long r23, t.c r25) {
        /*
            r20 = this;
            r0 = r20
            r11 = r21
            r1 = 0
            r2 = r22
            float r2 = r0.a(r2, r1)
            int r3 = r0.f2063v
            int r4 = androidx.constraintlayout.motion.widget.d.f2039a
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r3 == r4) goto L_0x0045
            float r3 = (float) r3
            float r3 = r13 / r3
            float r4 = r2 / r3
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            float r4 = r4 * r3
            float r2 = r2 % r3
            float r2 = r2 / r3
            float r5 = r0.f2064w
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L_0x002e
            float r5 = r0.f2064w
            float r2 = r2 + r5
            float r2 = r2 % r13
        L_0x002e:
            android.view.animation.Interpolator r5 = r0.f2065x
            if (r5 == 0) goto L_0x0037
            float r2 = r5.getInterpolation(r2)
            goto L_0x0042
        L_0x0037:
            double r5 = (double) r2
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0041
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            float r2 = r2 * r3
            float r2 = r2 + r4
        L_0x0045:
            r14 = r2
            java.util.HashMap<java.lang.String, x.d> r2 = r0.f2058q
            if (r2 == 0) goto L_0x0062
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0052:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r2.next()
            x.d r3 = (x.d) r3
            r3.b(r11, r14)
            goto L_0x0052
        L_0x0062:
            java.util.HashMap<java.lang.String, x.e> r2 = r0.f2057p
            r15 = 0
            if (r2 == 0) goto L_0x0096
            java.util.Collection r2 = r2.values()
            java.util.Iterator r7 = r2.iterator()
            r8 = r1
            r9 = 0
        L_0x0071:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0092
            java.lang.Object r1 = r7.next()
            x.e r1 = (x.e) r1
            boolean r2 = r1 instanceof x.e.a
            if (r2 == 0) goto L_0x0085
            r8 = r1
            x.e$a r8 = (x.e.a) r8
            goto L_0x0071
        L_0x0085:
            r2 = r21
            r3 = r14
            r4 = r23
            r6 = r25
            boolean r1 = r1.b(r2, r3, r4, r6)
            r9 = r9 | r1
            goto L_0x0071
        L_0x0092:
            r16 = r9
            r9 = r8
            goto L_0x0099
        L_0x0096:
            r9 = r1
            r16 = 0
        L_0x0099:
            t.a[] r1 = r0.f2047f
            r10 = 1
            if (r1 == 0) goto L_0x01f3
            r1 = r1[r15]
            double r7 = (double) r14
            double[] r2 = r0.f2052k
            r1.b(r7, r2)
            t.a[] r1 = r0.f2047f
            r1 = r1[r15]
            double[] r2 = r0.f2053l
            r1.d(r7, r2)
            t.a r1 = r0.f2048g
            if (r1 == 0) goto L_0x00c2
            double[] r2 = r0.f2052k
            int r3 = r2.length
            if (r3 <= 0) goto L_0x00c2
            r1.b(r7, r2)
            t.a r1 = r0.f2048g
            double[] r2 = r0.f2053l
            r1.d(r7, r2)
        L_0x00c2:
            boolean r1 = r0.f2066y
            if (r1 != 0) goto L_0x00e2
            androidx.constraintlayout.motion.widget.k r1 = r0.f2043b
            int[] r4 = r0.f2051j
            double[] r5 = r0.f2052k
            double[] r6 = r0.f2053l
            r17 = 0
            boolean r3 = r0.f2042a
            r2 = r14
            r18 = r3
            r3 = r21
            r12 = r7
            r7 = r17
            r8 = r18
            r1.d(r2, r3, r4, r5, r6, r7, r8)
            r0.f2042a = r15
            goto L_0x00e3
        L_0x00e2:
            r12 = r7
        L_0x00e3:
            int r1 = r0.f2061t
            int r2 = androidx.constraintlayout.motion.widget.d.f2039a
            if (r1 == r2) goto L_0x0145
            android.view.View r1 = r0.f2062u
            if (r1 != 0) goto L_0x00fb
            android.view.ViewParent r1 = r21.getParent()
            android.view.View r1 = (android.view.View) r1
            int r2 = r0.f2061t
            android.view.View r1 = r1.findViewById(r2)
            r0.f2062u = r1
        L_0x00fb:
            android.view.View r1 = r0.f2062u
            if (r1 == 0) goto L_0x0145
            int r1 = r1.getTop()
            android.view.View r2 = r0.f2062u
            int r2 = r2.getBottom()
            int r1 = r1 + r2
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            android.view.View r3 = r0.f2062u
            int r3 = r3.getLeft()
            android.view.View r4 = r0.f2062u
            int r4 = r4.getRight()
            int r3 = r3 + r4
            float r3 = (float) r3
            float r3 = r3 / r2
            int r2 = r21.getRight()
            int r4 = r21.getLeft()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0145
            int r2 = r21.getBottom()
            int r4 = r21.getTop()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0145
            int r2 = r21.getLeft()
            float r2 = (float) r2
            float r3 = r3 - r2
            int r2 = r21.getTop()
            float r2 = (float) r2
            float r1 = r1 - r2
            r11.setPivotX(r3)
            r11.setPivotY(r1)
        L_0x0145:
            java.util.HashMap<java.lang.String, x.d> r1 = r0.f2058q
            if (r1 == 0) goto L_0x0173
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x0151:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0173
            java.lang.Object r1 = r8.next()
            t.e r1 = (t.e) r1
            boolean r2 = r1 instanceof x.d.a
            if (r2 == 0) goto L_0x0151
            double[] r2 = r0.f2053l
            int r3 = r2.length
            if (r3 <= r10) goto L_0x0151
            x.d$a r1 = (x.d.a) r1
            r4 = r2[r15]
            r6 = r2[r10]
            r2 = r21
            r3 = r14
            r1.c(r2, r3, r4, r6)
            goto L_0x0151
        L_0x0173:
            if (r9 == 0) goto L_0x0190
            double[] r1 = r0.f2053l
            r7 = r1[r15]
            r17 = r1[r10]
            r1 = r9
            r2 = r21
            r3 = r25
            r4 = r14
            r5 = r23
            r19 = 1
            r9 = r17
            boolean r1 = r1.c(r2, r3, r4, r5, r7, r9)
            r1 = r16 | r1
            r16 = r1
            goto L_0x0192
        L_0x0190:
            r19 = 1
        L_0x0192:
            r10 = 1
        L_0x0193:
            t.a[] r1 = r0.f2047f
            int r2 = r1.length
            if (r10 >= r2) goto L_0x01b7
            r1 = r1[r10]
            float[] r2 = r0.f2055n
            r1.c(r12, r2)
            androidx.constraintlayout.motion.widget.k r1 = r0.f2043b
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.b> r1 = r1.f2128p
            java.lang.String[] r2 = r0.f2054m
            int r3 = r10 + -1
            r2 = r2[r3]
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.b r1 = (androidx.constraintlayout.widget.b) r1
            float[] r2 = r0.f2055n
            x.a.b(r1, r11, r2)
            int r10 = r10 + 1
            goto L_0x0193
        L_0x01b7:
            androidx.constraintlayout.motion.widget.f r1 = r0.f2045d
            int r2 = r1.f2040a
            if (r2 != 0) goto L_0x01e1
            r2 = 0
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01c8
            int r1 = r1.f2041b
            r11.setVisibility(r1)
            goto L_0x01e1
        L_0x01c8:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x01d6
            androidx.constraintlayout.motion.widget.f r1 = r0.f2046e
            int r1 = r1.f2041b
            r11.setVisibility(r1)
            goto L_0x01e1
        L_0x01d6:
            androidx.constraintlayout.motion.widget.f r2 = r0.f2046e
            int r2 = r2.f2041b
            int r1 = r1.f2041b
            if (r2 == r1) goto L_0x01e1
            r11.setVisibility(r15)
        L_0x01e1:
            androidx.constraintlayout.motion.widget.e[] r1 = r0.f2060s
            if (r1 == 0) goto L_0x0247
            r1 = 0
        L_0x01e6:
            androidx.constraintlayout.motion.widget.e[] r2 = r0.f2060s
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0247
            r2 = r2[r1]
            r2.a(r14, r11)
            int r1 = r1 + 1
            goto L_0x01e6
        L_0x01f3:
            r19 = 1
            androidx.constraintlayout.motion.widget.k r1 = r0.f2043b
            float r2 = r1.f2118f
            androidx.constraintlayout.motion.widget.k r3 = r0.f2044c
            float r4 = r3.f2118f
            float r4 = r4 - r2
            float r4 = r4 * r14
            float r2 = r2 + r4
            float r4 = r1.f2119g
            float r5 = r3.f2119g
            float r5 = r5 - r4
            float r5 = r5 * r14
            float r4 = r4 + r5
            float r5 = r1.f2120h
            float r6 = r3.f2120h
            float r7 = r6 - r5
            float r7 = r7 * r14
            float r7 = r7 + r5
            float r1 = r1.f2121i
            float r3 = r3.f2121i
            float r8 = r3 - r1
            float r8 = r8 * r14
            float r8 = r8 + r1
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r9
            int r10 = (int) r2
            float r4 = r4 + r9
            int r9 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r8
            int r4 = (int) r4
            int r7 = r2 - r10
            int r8 = r4 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0235
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0235
            boolean r1 = r0.f2042a
            if (r1 == 0) goto L_0x0244
        L_0x0235:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r11.measure(r3, r1)
            r0.f2042a = r15
        L_0x0244:
            r11.layout(r10, r9, r2, r4)
        L_0x0247:
            java.util.HashMap<java.lang.String, x.c> r1 = r0.f2059r
            if (r1 == 0) goto L_0x0276
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x0253:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0276
            java.lang.Object r1 = r8.next()
            x.c r1 = (x.c) r1
            boolean r2 = r1 instanceof x.c.a
            if (r2 == 0) goto L_0x0272
            x.c$a r1 = (x.c.a) r1
            double[] r2 = r0.f2053l
            r4 = r2[r15]
            r6 = r2[r19]
            r2 = r21
            r3 = r14
            r1.c(r2, r3, r4, r6)
            goto L_0x0253
        L_0x0272:
            r1.b(r11, r14)
            goto L_0x0253
        L_0x0276:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.g.c(android.view.View, float, long, t.c):boolean");
    }

    public String toString() {
        return " start: x: " + this.f2043b.f2118f + " y: " + this.f2043b.f2119g + " end: x: " + this.f2044c.f2118f + " y: " + this.f2044c.f2119g;
    }
}
