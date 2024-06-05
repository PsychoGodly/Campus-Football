package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import f0.c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    f0.c f25400a;

    /* renamed from: b  reason: collision with root package name */
    b f25401b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f25402c;

    /* renamed from: d  reason: collision with root package name */
    private float f25403d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f25404e;

    /* renamed from: f  reason: collision with root package name */
    int f25405f = 2;

    /* renamed from: g  reason: collision with root package name */
    float f25406g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    float f25407h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    float f25408i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    private final c.C0187c f25409j = new a();

    class a extends c.C0187c {

        /* renamed from: a  reason: collision with root package name */
        private int f25410a;

        /* renamed from: b  reason: collision with root package name */
        private int f25411b = -1;

        a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean n(android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0032
                int r7 = androidx.core.view.a0.B(r7)
                if (r7 != r2) goto L_0x000f
                r7 = 1
                goto L_0x0010
            L_0x000f:
                r7 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f25405f
                r5 = 2
                if (r4 != r5) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 != 0) goto L_0x0025
                if (r7 == 0) goto L_0x0021
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0024
                goto L_0x0023
            L_0x0021:
                if (r3 <= 0) goto L_0x0024
            L_0x0023:
                r1 = 1
            L_0x0024:
                return r1
            L_0x0025:
                if (r4 != r2) goto L_0x0031
                if (r7 == 0) goto L_0x002c
                if (r3 <= 0) goto L_0x0031
                goto L_0x0030
            L_0x002c:
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0031
            L_0x0030:
                r1 = 1
            L_0x0031:
                return r1
            L_0x0032:
                int r8 = r7.getLeft()
                int r0 = r6.f25410a
                int r8 = r8 - r0
                int r7 = r7.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.f25406g
                float r7 = r7 * r0
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r7) goto L_0x004f
                r1 = 1
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.n(android.view.View, float):boolean");
        }

        public int a(View view, int i10, int i11) {
            int i12;
            int i13;
            int width;
            boolean z10 = a0.B(view) == 1;
            int i14 = SwipeDismissBehavior.this.f25405f;
            if (i14 != 0) {
                if (i14 != 1) {
                    i12 = this.f25410a - view.getWidth();
                    i13 = view.getWidth() + this.f25410a;
                } else if (z10) {
                    i12 = this.f25410a;
                    width = view.getWidth();
                } else {
                    i12 = this.f25410a - view.getWidth();
                    i13 = this.f25410a;
                }
                return SwipeDismissBehavior.G(i12, i10, i13);
            } else if (z10) {
                i12 = this.f25410a - view.getWidth();
                i13 = this.f25410a;
                return SwipeDismissBehavior.G(i12, i10, i13);
            } else {
                i12 = this.f25410a;
                width = view.getWidth();
            }
            i13 = width + i12;
            return SwipeDismissBehavior.G(i12, i10, i13);
        }

        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        public int d(View view) {
            return view.getWidth();
        }

        public void i(View view, int i10) {
            this.f25411b = i10;
            this.f25410a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void j(int i10) {
            b bVar = SwipeDismissBehavior.this.f25401b;
            if (bVar != null) {
                bVar.b(i10);
            }
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = ((float) this.f25410a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f25407h);
            float width2 = ((float) this.f25410a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f25408i);
            float f10 = (float) i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f10), 1.0f));
            }
        }

        public void l(View view, float f10, float f11) {
            boolean z10;
            int i10;
            b bVar;
            this.f25411b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                int left = view.getLeft();
                int i11 = this.f25410a;
                i10 = left < i11 ? i11 - width : i11 + width;
                z10 = true;
            } else {
                i10 = this.f25410a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f25400a.F(i10, view.getTop())) {
                a0.f0(view, new c(view, z10));
            } else if (z10 && (bVar = SwipeDismissBehavior.this.f25401b) != null) {
                bVar.a(view);
            }
        }

        public boolean m(View view, int i10) {
            int i11 = this.f25411b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.E(view);
        }
    }

    public interface b {
        void a(View view);

        void b(int i10);
    }

    private class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final View f25413a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f25414b;

        c(View view, boolean z10) {
            this.f25413a = view;
            this.f25414b = z10;
        }

        public void run() {
            b bVar;
            f0.c cVar = SwipeDismissBehavior.this.f25400a;
            if (cVar != null && cVar.k(true)) {
                a0.f0(this.f25413a, this);
            } else if (this.f25414b && (bVar = SwipeDismissBehavior.this.f25401b) != null) {
                bVar.a(this.f25413a);
            }
        }
    }

    static float F(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int G(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void H(ViewGroup viewGroup) {
        f0.c cVar;
        if (this.f25400a == null) {
            if (this.f25404e) {
                cVar = f0.c.l(viewGroup, this.f25403d, this.f25409j);
            } else {
                cVar = f0.c.m(viewGroup, this.f25409j);
            }
            this.f25400a = cVar;
        }
    }

    static float I(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        f0.c cVar = this.f25400a;
        if (cVar == null) {
            return false;
        }
        cVar.z(motionEvent);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f10) {
        this.f25408i = F(0.0f, f10, 1.0f);
    }

    public void K(float f10) {
        this.f25407h = F(0.0f, f10, 1.0f);
    }

    public void L(int i10) {
        this.f25405f = i10;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = this.f25402c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.v(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f25402c = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f25402c = false;
        }
        if (!z10) {
            return false;
        }
        H(coordinatorLayout);
        return this.f25400a.G(motionEvent);
    }
}
