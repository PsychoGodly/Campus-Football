package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;

/* compiled from: HeaderBehavior */
abstract class a<V extends View> extends c<V> {

    /* renamed from: d  reason: collision with root package name */
    private Runnable f25370d;

    /* renamed from: e  reason: collision with root package name */
    OverScroller f25371e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25372f;

    /* renamed from: g  reason: collision with root package name */
    private int f25373g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f25374h;

    /* renamed from: i  reason: collision with root package name */
    private int f25375i = -1;

    /* renamed from: j  reason: collision with root package name */
    private VelocityTracker f25376j;

    /* renamed from: com.google.android.material.appbar.a$a  reason: collision with other inner class name */
    /* compiled from: HeaderBehavior */
    private class C0269a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final CoordinatorLayout f25377a;

        /* renamed from: b  reason: collision with root package name */
        private final V f25378b;

        C0269a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f25377a = coordinatorLayout;
            this.f25378b = v10;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f25378b != null && (overScroller = a.this.f25371e) != null) {
                if (overScroller.computeScrollOffset()) {
                    a aVar = a.this;
                    aVar.P(this.f25377a, this.f25378b, aVar.f25371e.getCurrY());
                    a0.f0(this.f25378b, this);
                    return;
                }
                a.this.N(this.f25377a, this.f25378b);
            }
        }
    }

    public a() {
    }

    private void I() {
        if (this.f25376j == null) {
            this.f25376j = VelocityTracker.obtain();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 3) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r11.f25375i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.f25375i = r0
        L_0x0012:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            r3 = -1
            if (r0 == r1) goto L_0x005c
            r4 = 2
            if (r0 == r4) goto L_0x0025
            r12 = 3
            if (r0 == r12) goto L_0x007e
            goto L_0x00ae
        L_0x0025:
            int r0 = r11.f25373g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002e
            return r2
        L_0x002e:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r2 = r11.f25374h
            int r2 = r2 - r0
            boolean r3 = r11.f25372f
            if (r3 != 0) goto L_0x0049
            int r3 = java.lang.Math.abs(r2)
            int r4 = r11.f25375i
            if (r3 <= r4) goto L_0x0049
            r11.f25372f = r1
            if (r2 <= 0) goto L_0x0048
            int r2 = r2 - r4
            goto L_0x0049
        L_0x0048:
            int r2 = r2 + r4
        L_0x0049:
            r6 = r2
            boolean r2 = r11.f25372f
            if (r2 == 0) goto L_0x00ae
            r11.f25374h = r0
            int r7 = r11.K(r13)
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.O(r4, r5, r6, r7, r8)
            goto L_0x00ae
        L_0x005c:
            android.view.VelocityTracker r0 = r11.f25376j
            if (r0 == 0) goto L_0x007e
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f25376j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f25376j
            int r4 = r11.f25373g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.J(r6, r7, r8, r9, r10)
        L_0x007e:
            r11.f25372f = r2
            r11.f25373g = r3
            android.view.VelocityTracker r12 = r11.f25376j
            if (r12 == 0) goto L_0x00ae
            r12.recycle()
            r12 = 0
            r11.f25376j = r12
            goto L_0x00ae
        L_0x008d:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r12 = r12.v(r13, r0, r3)
            if (r12 == 0) goto L_0x00b6
            boolean r12 = r11.H(r13)
            if (r12 == 0) goto L_0x00b6
            r11.f25374h = r3
            int r12 = r14.getPointerId(r2)
            r11.f25373g = r12
            r11.I()
        L_0x00ae:
            android.view.VelocityTracker r12 = r11.f25376j
            if (r12 == 0) goto L_0x00b5
            r12.addMovement(r14)
        L_0x00b5:
            return r1
        L_0x00b6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean H(V v10) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean J(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, float f10) {
        V v11 = v10;
        Runnable runnable = this.f25370d;
        if (runnable != null) {
            v10.removeCallbacks(runnable);
            this.f25370d = null;
        }
        if (this.f25371e == null) {
            this.f25371e = new OverScroller(v10.getContext());
        }
        this.f25371e.fling(0, E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (this.f25371e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C0269a aVar = new C0269a(coordinatorLayout, v10);
            this.f25370d = aVar;
            a0.f0(v10, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        N(coordinatorLayout, v10);
        return false;
    }

    /* access modifiers changed from: package-private */
    public int K(V v10) {
        return -v10.getHeight();
    }

    /* access modifiers changed from: package-private */
    public int L(V v10) {
        return v10.getHeight();
    }

    /* access modifiers changed from: package-private */
    public int M() {
        return E();
    }

    /* access modifiers changed from: package-private */
    public void N(CoordinatorLayout coordinatorLayout, V v10) {
    }

    /* access modifiers changed from: package-private */
    public final int O(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return Q(coordinatorLayout, v10, M() - i10, i11, i12);
    }

    /* access modifiers changed from: package-private */
    public int P(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return Q(coordinatorLayout, v10, i10, RecyclerView.UNDEFINED_DURATION, a.e.API_PRIORITY_OTHER);
    }

    /* access modifiers changed from: package-private */
    public int Q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int b10;
        int E = E();
        if (i11 == 0 || E < i11 || E > i12 || E == (b10 = b0.a.b(i10, i11, i12))) {
            return 0;
        }
        G(b10);
        return E - b10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f25375i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f25375i = r0
        L_0x0012:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r0 = r4.f25372f
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L_0x0060
            r5 = -1
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x002f
            r6 = 3
            if (r0 == r6) goto L_0x0051
            goto L_0x0083
        L_0x002f:
            int r6 = r4.f25373g
            if (r6 != r5) goto L_0x0034
            goto L_0x0083
        L_0x0034:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L_0x003b
            goto L_0x0083
        L_0x003b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f25374h
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f25375i
            if (r6 <= r0) goto L_0x0083
            r4.f25372f = r2
            r4.f25374h = r5
            goto L_0x0083
        L_0x0051:
            r4.f25372f = r3
            r4.f25373g = r5
            android.view.VelocityTracker r5 = r4.f25376j
            if (r5 == 0) goto L_0x0083
            r5.recycle()
            r5 = 0
            r4.f25376j = r5
            goto L_0x0083
        L_0x0060:
            r4.f25372f = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.H(r6)
            if (r2 == 0) goto L_0x0083
            boolean r5 = r5.v(r6, r0, r1)
            if (r5 == 0) goto L_0x0083
            r4.f25374h = r1
            int r5 = r7.getPointerId(r3)
            r4.f25373g = r5
            r4.I()
        L_0x0083:
            android.view.VelocityTracker r5 = r4.f25376j
            if (r5 == 0) goto L_0x008a
            r5.addMovement(r7)
        L_0x008a:
            boolean r5 = r4.f25372f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
