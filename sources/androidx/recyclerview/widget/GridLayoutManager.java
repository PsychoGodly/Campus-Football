package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GridLayoutManager extends LinearLayoutManager {
    boolean I = false;
    int J = -1;
    int[] K;
    View[] L;
    final SparseIntArray M = new SparseIntArray();
    final SparseIntArray N = new SparseIntArray();
    c O = new a();
    final Rect P = new Rect();
    private boolean Q;

    public static final class a extends c {
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        public int f(int i10) {
            return 1;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final SparseIntArray f4332a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        final SparseIntArray f4333b = new SparseIntArray();

        /* renamed from: c  reason: collision with root package name */
        private boolean f4334c = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f4335d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        /* access modifiers changed from: package-private */
        public int b(int i10, int i11) {
            if (!this.f4335d) {
                return d(i10, i11);
            }
            int i12 = this.f4333b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int d10 = d(i10, i11);
            this.f4333b.put(i10, d10);
            return d10;
        }

        /* access modifiers changed from: package-private */
        public int c(int i10, int i11) {
            if (!this.f4334c) {
                return e(i10, i11);
            }
            int i12 = this.f4332a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int e10 = e(i10, i11);
            this.f4332a.put(i10, e10);
            return e10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f4335d
                r1 = 0
                if (r0 == 0) goto L_0x0024
                android.util.SparseIntArray r0 = r6.f4333b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0024
                android.util.SparseIntArray r2 = r6.f4333b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L_0x0027
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0024:
                r2 = 0
                r3 = 0
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r0 = r6.f(r7)
            L_0x002b:
                if (r3 >= r7) goto L_0x0040
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L_0x0038
                int r2 = r2 + 1
                r4 = 0
                goto L_0x003d
            L_0x0038:
                if (r4 <= r8) goto L_0x003d
                int r2 = r2 + 1
                r4 = r5
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                int r4 = r4 + r0
                if (r4 <= r8) goto L_0x0045
                int r2 = r2 + 1
            L_0x0045:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }

        public abstract int e(int i10, int i11);

        public abstract int f(int i10);

        public void g() {
            this.f4333b.clear();
        }

        public void h() {
            this.f4332a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f3(RecyclerView.o.i0(context, attributeSet, i10, i11).f4430b);
    }

    private void N2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10, boolean z10) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = -1;
        if (z10) {
            i14 = i10;
            i12 = 0;
            i11 = 1;
        } else {
            i12 = i10 - 1;
            i11 = -1;
        }
        while (i12 != i14) {
            View view = this.L[i12];
            b bVar = (b) view.getLayoutParams();
            int a32 = a3(vVar, a0Var, h0(view));
            bVar.f4331f = a32;
            bVar.f4330e = i13;
            i13 += a32;
            i12 += i11;
        }
    }

    private void O2() {
        int J2 = J();
        for (int i10 = 0; i10 < J2; i10++) {
            b bVar = (b) I(i10).getLayoutParams();
            int a10 = bVar.a();
            this.M.put(a10, bVar.f());
            this.N.put(a10, bVar.e());
        }
    }

    private void P2(int i10) {
        this.K = Q2(this.K, this.J, i10);
    }

    static int[] Q2(int[] iArr, int i10, int i11) {
        int i12;
        if (!(iArr != null && iArr.length == i10 + 1 && iArr[iArr.length - 1] == i11)) {
            iArr = new int[(i10 + 1)];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void R2() {
        this.M.clear();
        this.N.clear();
    }

    private int S2(RecyclerView.a0 a0Var) {
        int i10;
        if (!(J() == 0 || a0Var.b() == 0)) {
            T1();
            boolean r22 = r2();
            View Y1 = Y1(!r22, true);
            View X1 = X1(!r22, true);
            if (!(Y1 == null || X1 == null)) {
                int b10 = this.O.b(h0(Y1), this.J);
                int b11 = this.O.b(h0(X1), this.J);
                int min = Math.min(b10, b11);
                int max = Math.max(b10, b11);
                int b12 = this.O.b(a0Var.b() - 1, this.J) + 1;
                if (this.f4341x) {
                    i10 = Math.max(0, (b12 - max) - 1);
                } else {
                    i10 = Math.max(0, min);
                }
                if (!r22) {
                    return i10;
                }
                return Math.round((((float) i10) * (((float) Math.abs(this.f4338u.d(X1) - this.f4338u.g(Y1))) / ((float) ((this.O.b(h0(X1), this.J) - this.O.b(h0(Y1), this.J)) + 1)))) + ((float) (this.f4338u.m() - this.f4338u.g(Y1))));
            }
        }
        return 0;
    }

    private int T2(RecyclerView.a0 a0Var) {
        if (!(J() == 0 || a0Var.b() == 0)) {
            T1();
            View Y1 = Y1(!r2(), true);
            View X1 = X1(!r2(), true);
            if (!(Y1 == null || X1 == null)) {
                if (!r2()) {
                    return this.O.b(a0Var.b() - 1, this.J) + 1;
                }
                int d10 = this.f4338u.d(X1) - this.f4338u.g(Y1);
                int b10 = this.O.b(h0(Y1), this.J);
                return (int) ((((float) d10) / ((float) ((this.O.b(h0(X1), this.J) - b10) + 1))) * ((float) (this.O.b(a0Var.b() - 1, this.J) + 1)));
            }
        }
        return 0;
    }

    private void U2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int Z2 = Z2(vVar, a0Var, aVar.f4345b);
        if (z10) {
            while (Z2 > 0) {
                int i11 = aVar.f4345b;
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    aVar.f4345b = i12;
                    Z2 = Z2(vVar, a0Var, i12);
                } else {
                    return;
                }
            }
            return;
        }
        int b10 = a0Var.b() - 1;
        int i13 = aVar.f4345b;
        while (i13 < b10) {
            int i14 = i13 + 1;
            int Z22 = Z2(vVar, a0Var, i14);
            if (Z22 <= Z2) {
                break;
            }
            i13 = i14;
            Z2 = Z22;
        }
        aVar.f4345b = i13;
    }

    private void V2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private int Y2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10) {
        if (!a0Var.e()) {
            return this.O.b(i10, this.J);
        }
        int f10 = vVar.f(i10);
        if (f10 != -1) {
            return this.O.b(f10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    private int Z2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10) {
        if (!a0Var.e()) {
            return this.O.c(i10, this.J);
        }
        int i11 = this.N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = vVar.f(i10);
        if (f10 != -1) {
            return this.O.c(f10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    private int a3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10) {
        if (!a0Var.e()) {
            return this.O.f(i10);
        }
        int i11 = this.M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = vVar.f(i10);
        if (f10 != -1) {
            return this.O.f(f10);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    private void c3(float f10, int i10) {
        P2(Math.max(Math.round(f10 * ((float) this.J)), i10));
    }

    private void d3(View view, int i10, boolean z10) {
        int i11;
        int i12;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f4434b;
        int i13 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i14 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int W2 = W2(bVar.f4330e, bVar.f4331f);
        if (this.f4336s == 1) {
            i11 = RecyclerView.o.K(W2, i10, i14, bVar.width, false);
            i12 = RecyclerView.o.K(this.f4338u.n(), X(), i13, bVar.height, true);
        } else {
            int K2 = RecyclerView.o.K(W2, i10, i13, bVar.height, false);
            int K3 = RecyclerView.o.K(this.f4338u.n(), p0(), i14, bVar.width, true);
            i12 = K2;
            i11 = K3;
        }
        e3(view, i11, i12, z10);
    }

    private void e3(View view, int i10, int i11, boolean z10) {
        boolean z11;
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z10) {
            z11 = H1(view, i10, i11, pVar);
        } else {
            z11 = F1(view, i10, i11, pVar);
        }
        if (z11) {
            view.measure(i10, i11);
        }
    }

    private void g3() {
        int i10;
        int i11;
        if (p2() == 1) {
            i11 = o0() - f0();
            i10 = e0();
        } else {
            i11 = W() - d0();
            i10 = g0();
        }
        P2(i11 - i10);
    }

    public void C1(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        if (this.K == null) {
            super.C1(rect, i10, i11);
        }
        int e02 = e0() + f0();
        int g02 = g0() + d0();
        if (this.f4336s == 1) {
            i13 = RecyclerView.o.n(i11, rect.height() + g02, b0());
            int[] iArr = this.K;
            i12 = RecyclerView.o.n(i10, iArr[iArr.length - 1] + e02, c0());
        } else {
            i12 = RecyclerView.o.n(i10, rect.width() + e02, c0());
            int[] iArr2 = this.K;
            i13 = RecyclerView.o.n(i11, iArr2[iArr2.length - 1] + g02, b0());
        }
        B1(i12, i13);
    }

    public RecyclerView.p D() {
        if (this.f4336s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    public RecyclerView.p E(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public void E2(boolean z10) {
        if (!z10) {
            super.E2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public RecyclerView.p F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View J0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.a0 r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.B(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.b) r5
            int r6 = r5.f4330e
            int r5 = r5.f4331f
            int r5 = r5 + r6
            android.view.View r7 = super.J0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.R1(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f4341x
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.J()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.J()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f4336s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.q2()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.Y2(r1, r2, r7)
            r10 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.Y2(r1, r2, r10)
            android.view.View r1 = r0.I(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.b) r9
            int r2 = r9.f4330e
            r18 = r3
            int r3 = r9.f4331f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.y0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f4330e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f4330e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    public boolean L1() {
        return this.D == null && !this.I;
    }

    public int N(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f4336s == 1) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return Y2(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    /* access modifiers changed from: package-private */
    public void N1(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i10 = this.J;
        for (int i11 = 0; i11 < this.J && cVar.c(a0Var) && i10 > 0; i11++) {
            int i12 = cVar.f4356d;
            cVar2.a(i12, Math.max(0, cVar.f4359g));
            i10 -= this.O.f(i12);
            cVar.f4356d += cVar.f4357e;
        }
    }

    public void P0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, androidx.core.view.accessibility.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.O0(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int Y2 = Y2(vVar, a0Var, bVar.a());
        if (this.f4336s == 0) {
            cVar.a0(c.d.a(bVar.e(), bVar.f(), Y2, 1, false, false));
            return;
        }
        cVar.a0(c.d.a(Y2, 1, bVar.e(), bVar.f(), false, false));
    }

    public void R0(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    public void S0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    public void T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.O.h();
        this.O.g();
    }

    public void U0(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    public void W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.h();
        this.O.g();
    }

    /* access modifiers changed from: package-private */
    public int W2(int i10, int i11) {
        if (this.f4336s != 1 || !q2()) {
            int[] iArr = this.K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.K;
        int i12 = this.J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public void X0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.e()) {
            O2();
        }
        super.X0(vVar, a0Var);
        R2();
    }

    public int X2() {
        return this.J;
    }

    public void Y0(RecyclerView.a0 a0Var) {
        super.Y0(a0Var);
        this.I = false;
    }

    public c b3() {
        return this.O;
    }

    public void f3(int i10) {
        if (i10 != this.J) {
            this.I = true;
            if (i10 >= 1) {
                this.J = i10;
                this.O.h();
                t1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public View h2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10, int i11, int i12) {
        T1();
        int m10 = this.f4338u.m();
        int i13 = this.f4338u.i();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View I2 = I(i10);
            int h02 = h0(I2);
            if (h02 >= 0 && h02 < i12 && Z2(vVar, a0Var, h02) == 0) {
                if (((RecyclerView.p) I2.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = I2;
                    }
                } else if (this.f4338u.g(I2) < i13 && this.f4338u.d(I2) >= m10) {
                    return I2;
                } else {
                    if (view == null) {
                        view = I2;
                    }
                }
            }
            i10 += i14;
        }
        return view != null ? view : view2;
    }

    public int k0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f4336s == 0) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return Y2(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    public boolean m(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    public int r(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return S2(a0Var);
        }
        return super.r(a0Var);
    }

    public int s(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return T2(a0Var);
        }
        return super.s(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x021b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0219  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s2(androidx.recyclerview.widget.RecyclerView.v r18, androidx.recyclerview.widget.RecyclerView.a0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            r17 = this;
            r6 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            r7 = r21
            androidx.recyclerview.widget.j r3 = r6.f4338u
            int r3 = r3.l()
            r4 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            int r10 = r17.J()
            if (r10 <= 0) goto L_0x0026
            int[] r10 = r6.K
            int r11 = r6.J
            r10 = r10[r11]
            goto L_0x0027
        L_0x0026:
            r10 = 0
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r17.g3()
        L_0x002c:
            int r11 = r2.f4357e
            if (r11 != r8) goto L_0x0032
            r11 = 1
            goto L_0x0033
        L_0x0032:
            r11 = 0
        L_0x0033:
            int r12 = r6.J
            if (r11 != 0) goto L_0x0044
            int r12 = r2.f4356d
            int r12 = r6.Z2(r0, r1, r12)
            int r13 = r2.f4356d
            int r13 = r6.a3(r0, r1, r13)
            int r12 = r12 + r13
        L_0x0044:
            r13 = 0
        L_0x0045:
            int r14 = r6.J
            if (r13 >= r14) goto L_0x009d
            boolean r14 = r2.c(r1)
            if (r14 == 0) goto L_0x009d
            if (r12 <= 0) goto L_0x009d
            int r14 = r2.f4356d
            int r15 = r6.a3(r0, r1, r14)
            int r4 = r6.J
            if (r15 > r4) goto L_0x006f
            int r12 = r12 - r15
            if (r12 >= 0) goto L_0x005f
            goto L_0x009d
        L_0x005f:
            android.view.View r4 = r2.d(r0)
            if (r4 != 0) goto L_0x0066
            goto L_0x009d
        L_0x0066:
            android.view.View[] r14 = r6.L
            r14[r13] = r4
            int r13 = r13 + 1
            r4 = 1073741824(0x40000000, float:2.0)
            goto L_0x0045
        L_0x006f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.J
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009d:
            if (r13 != 0) goto L_0x00a2
            r7.f4350b = r8
            return
        L_0x00a2:
            r4 = 0
            r6.N2(r0, r1, r13, r11)
            r0 = 0
            r1 = 0
        L_0x00a8:
            if (r0 >= r13) goto L_0x00f4
            android.view.View[] r12 = r6.L
            r12 = r12[r0]
            java.util.List<androidx.recyclerview.widget.RecyclerView$d0> r14 = r2.f4364l
            if (r14 != 0) goto L_0x00bc
            if (r11 == 0) goto L_0x00b8
            r6.d(r12)
            goto L_0x00c5
        L_0x00b8:
            r6.e(r12, r5)
            goto L_0x00c5
        L_0x00bc:
            if (r11 == 0) goto L_0x00c2
            r6.b(r12)
            goto L_0x00c5
        L_0x00c2:
            r6.c(r12, r5)
        L_0x00c5:
            android.graphics.Rect r14 = r6.P
            r6.j(r12, r14)
            r6.d3(r12, r3, r5)
            androidx.recyclerview.widget.j r14 = r6.f4338u
            int r14 = r14.e(r12)
            if (r14 <= r1) goto L_0x00d6
            r1 = r14
        L_0x00d6:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r14 = (androidx.recyclerview.widget.GridLayoutManager.b) r14
            r15 = 1065353216(0x3f800000, float:1.0)
            androidx.recyclerview.widget.j r5 = r6.f4338u
            int r5 = r5.f(r12)
            float r5 = (float) r5
            float r5 = r5 * r15
            int r12 = r14.f4331f
            float r12 = (float) r12
            float r5 = r5 / r12
            int r12 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x00f0
            r4 = r5
        L_0x00f0:
            int r0 = r0 + 1
            r5 = 0
            goto L_0x00a8
        L_0x00f4:
            if (r9 == 0) goto L_0x0112
            r6.c3(r4, r10)
            r0 = 0
            r1 = 0
        L_0x00fb:
            if (r0 >= r13) goto L_0x0112
            android.view.View[] r3 = r6.L
            r3 = r3[r0]
            r4 = 1073741824(0x40000000, float:2.0)
            r6.d3(r3, r4, r8)
            androidx.recyclerview.widget.j r4 = r6.f4338u
            int r3 = r4.e(r3)
            if (r3 <= r1) goto L_0x010f
            r1 = r3
        L_0x010f:
            int r0 = r0 + 1
            goto L_0x00fb
        L_0x0112:
            r0 = 0
        L_0x0113:
            if (r0 >= r13) goto L_0x0175
            android.view.View[] r3 = r6.L
            r3 = r3[r0]
            androidx.recyclerview.widget.j r4 = r6.f4338u
            int r4 = r4.e(r3)
            if (r4 == r1) goto L_0x016f
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r4 = (androidx.recyclerview.widget.GridLayoutManager.b) r4
            android.graphics.Rect r5 = r4.f4434b
            int r9 = r5.top
            int r10 = r5.bottom
            int r9 = r9 + r10
            int r10 = r4.topMargin
            int r9 = r9 + r10
            int r10 = r4.bottomMargin
            int r9 = r9 + r10
            int r10 = r5.left
            int r5 = r5.right
            int r10 = r10 + r5
            int r5 = r4.leftMargin
            int r10 = r10 + r5
            int r5 = r4.rightMargin
            int r10 = r10 + r5
            int r5 = r4.f4330e
            int r11 = r4.f4331f
            int r5 = r6.W2(r5, r11)
            int r11 = r6.f4336s
            if (r11 != r8) goto L_0x015b
            int r4 = r4.width
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
            int r4 = androidx.recyclerview.widget.RecyclerView.o.K(r5, r11, r10, r4, r12)
            int r5 = r1 - r9
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            goto L_0x016b
        L_0x015b:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
            int r10 = r1 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r4 = r4.height
            int r5 = androidx.recyclerview.widget.RecyclerView.o.K(r5, r11, r9, r4, r12)
            r4 = r10
        L_0x016b:
            r6.e3(r3, r4, r5, r8)
            goto L_0x0172
        L_0x016f:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
        L_0x0172:
            int r0 = r0 + 1
            goto L_0x0113
        L_0x0175:
            r12 = 0
            r7.f4349a = r1
            int r0 = r6.f4336s
            r3 = -1
            if (r0 != r8) goto L_0x018f
            int r0 = r2.f4358f
            if (r0 != r3) goto L_0x0187
            int r0 = r2.f4354b
            int r1 = r0 - r1
            r2 = r1
            goto L_0x018c
        L_0x0187:
            int r0 = r2.f4354b
            int r1 = r1 + r0
            r2 = r0
            r0 = r1
        L_0x018c:
            r1 = 0
            r3 = 0
            goto L_0x01a2
        L_0x018f:
            int r0 = r2.f4358f
            if (r0 != r3) goto L_0x019c
            int r0 = r2.f4354b
            int r1 = r0 - r1
            r3 = r1
            r2 = 0
            r1 = r0
            r0 = 0
            goto L_0x01a2
        L_0x019c:
            int r0 = r2.f4354b
            int r1 = r1 + r0
            r3 = r0
            r0 = 0
            r2 = 0
        L_0x01a2:
            if (r12 >= r13) goto L_0x022d
            android.view.View[] r4 = r6.L
            r9 = r4[r12]
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            r10 = r4
            androidx.recyclerview.widget.GridLayoutManager$b r10 = (androidx.recyclerview.widget.GridLayoutManager.b) r10
            int r4 = r6.f4336s
            if (r4 != r8) goto L_0x01eb
            boolean r1 = r17.q2()
            if (r1 == 0) goto L_0x01d3
            int r1 = r17.e0()
            int[] r3 = r6.K
            int r4 = r6.J
            int r5 = r10.f4330e
            int r4 = r4 - r5
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.j r3 = r6.f4338u
            int r3 = r3.f(r9)
            int r3 = r1 - r3
            r11 = r0
            r14 = r1
            r15 = r2
            goto L_0x0200
        L_0x01d3:
            int r1 = r17.e0()
            int[] r3 = r6.K
            int r4 = r10.f4330e
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.j r3 = r6.f4338u
            int r3 = r3.f(r9)
            int r3 = r3 + r1
            r11 = r0
            r16 = r1
            r15 = r2
            r14 = r3
            goto L_0x0202
        L_0x01eb:
            int r0 = r17.g0()
            int[] r2 = r6.K
            int r4 = r10.f4330e
            r2 = r2[r4]
            int r0 = r0 + r2
            androidx.recyclerview.widget.j r2 = r6.f4338u
            int r2 = r2.f(r9)
            int r2 = r2 + r0
            r15 = r0
            r14 = r1
            r11 = r2
        L_0x0200:
            r16 = r3
        L_0x0202:
            r0 = r17
            r1 = r9
            r2 = r16
            r3 = r15
            r4 = r14
            r5 = r11
            r0.z0(r1, r2, r3, r4, r5)
            boolean r0 = r10.c()
            if (r0 != 0) goto L_0x0219
            boolean r0 = r10.b()
            if (r0 == 0) goto L_0x021b
        L_0x0219:
            r7.f4351c = r8
        L_0x021b:
            boolean r0 = r7.f4352d
            boolean r1 = r9.hasFocusable()
            r0 = r0 | r1
            r7.f4352d = r0
            int r12 = r12 + 1
            r0 = r11
            r1 = r14
            r2 = r15
            r3 = r16
            goto L_0x01a2
        L_0x022d:
            android.view.View[] r0 = r6.L
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.s2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    public int u(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return S2(a0Var);
        }
        return super.u(a0Var);
    }

    /* access modifiers changed from: package-private */
    public void u2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i10) {
        super.u2(vVar, a0Var, aVar, i10);
        g3();
        if (a0Var.b() > 0 && !a0Var.e()) {
            U2(vVar, a0Var, aVar, i10);
        }
        V2();
    }

    public int v(RecyclerView.a0 a0Var) {
        if (this.Q) {
            return T2(a0Var);
        }
        return super.v(a0Var);
    }

    public int w1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        g3();
        V2();
        return super.w1(i10, vVar, a0Var);
    }

    public int y1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        g3();
        V2();
        return super.y1(i10, vVar, a0Var);
    }

    public static class b extends RecyclerView.p {

        /* renamed from: e  reason: collision with root package name */
        int f4330e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f4331f = 0;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int e() {
            return this.f4330e;
        }

        public int f() {
            return this.f4331f;
        }

        public b(int i10, int i11) {
            super(i10, i11);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        f3(i10);
    }
}
