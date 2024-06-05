package com.onesignal;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.a0;
import f0.c;

/* compiled from: DraggableRelativeLayout */
class s extends RelativeLayout {

    /* renamed from: f  reason: collision with root package name */
    private static final int f28118f = h3.b(28);

    /* renamed from: g  reason: collision with root package name */
    private static final int f28119g = h3.b(64);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public b f28120a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public f0.c f28121b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f28122c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public c f28123d;

    /* compiled from: DraggableRelativeLayout */
    class a extends c.C0187c {

        /* renamed from: a  reason: collision with root package name */
        private int f28124a;

        a() {
        }

        public int a(View view, int i10, int i11) {
            return s.this.f28123d.f28129d;
        }

        public int b(View view, int i10, int i11) {
            if (s.this.f28123d.f28133h) {
                return s.this.f28123d.f28127b;
            }
            this.f28124a = i10;
            if (s.this.f28123d.f28132g == 1) {
                if (i10 >= s.this.f28123d.f28128c && s.this.f28120a != null) {
                    s.this.f28120a.a();
                }
                if (i10 < s.this.f28123d.f28127b) {
                    return s.this.f28123d.f28127b;
                }
            } else {
                if (i10 <= s.this.f28123d.f28128c && s.this.f28120a != null) {
                    s.this.f28120a.a();
                }
                if (i10 > s.this.f28123d.f28127b) {
                    return s.this.f28123d.f28127b;
                }
            }
            return i10;
        }

        public void l(View view, float f10, float f11) {
            int i10 = s.this.f28123d.f28127b;
            if (!s.this.f28122c) {
                if (s.this.f28123d.f28132g == 1) {
                    if (this.f28124a > s.this.f28123d.f28136k || f11 > ((float) s.this.f28123d.f28134i)) {
                        i10 = s.this.f28123d.f28135j;
                        boolean unused = s.this.f28122c = true;
                        if (s.this.f28120a != null) {
                            s.this.f28120a.onDismiss();
                        }
                    }
                } else if (this.f28124a < s.this.f28123d.f28136k || f11 < ((float) s.this.f28123d.f28134i)) {
                    i10 = s.this.f28123d.f28135j;
                    boolean unused2 = s.this.f28122c = true;
                    if (s.this.f28120a != null) {
                        s.this.f28120a.onDismiss();
                    }
                }
            }
            if (s.this.f28121b.F(s.this.f28123d.f28129d, i10)) {
                a0.e0(s.this);
            }
        }

        public boolean m(View view, int i10) {
            return true;
        }
    }

    /* compiled from: DraggableRelativeLayout */
    interface b {
        void a();

        void b();

        void onDismiss();
    }

    /* compiled from: DraggableRelativeLayout */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        int f28126a;

        /* renamed from: b  reason: collision with root package name */
        int f28127b;

        /* renamed from: c  reason: collision with root package name */
        int f28128c;

        /* renamed from: d  reason: collision with root package name */
        int f28129d;

        /* renamed from: e  reason: collision with root package name */
        int f28130e;

        /* renamed from: f  reason: collision with root package name */
        int f28131f;

        /* renamed from: g  reason: collision with root package name */
        int f28132g;

        /* renamed from: h  reason: collision with root package name */
        boolean f28133h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public int f28134i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f28135j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public int f28136k;

        c() {
        }
    }

    public s(Context context) {
        super(context);
        setClipChildren(false);
        f();
    }

    private void f() {
        this.f28121b = f0.c.l(this, 1.0f, new a());
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.f28121b.k(true)) {
            a0.e0(this);
        }
    }

    public void g() {
        this.f28122c = true;
        this.f28121b.H(this, getLeft(), this.f28123d.f28135j);
        a0.e0(this);
    }

    /* access modifiers changed from: package-private */
    public void h(b bVar) {
        this.f28120a = bVar;
    }

    /* access modifiers changed from: package-private */
    public void i(c cVar) {
        this.f28123d = cVar;
        int unused = cVar.f28135j = cVar.f28131f + cVar.f28126a + ((Resources.getSystem().getDisplayMetrics().heightPixels - cVar.f28131f) - cVar.f28126a) + f28119g;
        int unused2 = cVar.f28134i = h3.b(3000);
        if (cVar.f28132g == 0) {
            int unused3 = cVar.f28135j = (-cVar.f28131f) - f28118f;
            int unused4 = cVar.f28134i = -cVar.f28134i;
            int unused5 = cVar.f28136k = cVar.f28135j / 3;
            return;
        }
        int unused6 = cVar.f28136k = (cVar.f28131f / 3) + (cVar.f28127b * 2);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f28122c) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (bVar = this.f28120a) != null) {
            bVar.b();
        }
        this.f28121b.z(motionEvent);
        return false;
    }
}
