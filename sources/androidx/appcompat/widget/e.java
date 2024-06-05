package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.a0;
import h.j;

/* compiled from: AppCompatBackgroundHelper */
class e {

    /* renamed from: a  reason: collision with root package name */
    private final View f1590a;

    /* renamed from: b  reason: collision with root package name */
    private final j f1591b;

    /* renamed from: c  reason: collision with root package name */
    private int f1592c = -1;

    /* renamed from: d  reason: collision with root package name */
    private x0 f1593d;

    /* renamed from: e  reason: collision with root package name */
    private x0 f1594e;

    /* renamed from: f  reason: collision with root package name */
    private x0 f1595f;

    e(View view) {
        this.f1590a = view;
        this.f1591b = j.b();
    }

    private boolean a(Drawable drawable) {
        if (this.f1595f == null) {
            this.f1595f = new x0();
        }
        x0 x0Var = this.f1595f;
        x0Var.a();
        ColorStateList r10 = a0.r(this.f1590a);
        if (r10 != null) {
            x0Var.f1850d = true;
            x0Var.f1847a = r10;
        }
        PorterDuff.Mode s10 = a0.s(this.f1590a);
        if (s10 != null) {
            x0Var.f1849c = true;
            x0Var.f1848b = s10;
        }
        if (!x0Var.f1850d && !x0Var.f1849c) {
            return false;
        }
        j.i(drawable, x0Var, this.f1590a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 21) {
            return i10 == 21;
        }
        if (this.f1593d != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f1590a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            x0 x0Var = this.f1594e;
            if (x0Var != null) {
                j.i(background, x0Var, this.f1590a.getDrawableState());
                return;
            }
            x0 x0Var2 = this.f1593d;
            if (x0Var2 != null) {
                j.i(background, x0Var2, this.f1590a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        x0 x0Var = this.f1594e;
        if (x0Var != null) {
            return x0Var.f1847a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        x0 x0Var = this.f1594e;
        if (x0Var != null) {
            return x0Var.f1848b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i10) {
        Context context = this.f1590a.getContext();
        int[] iArr = j.f18428y3;
        z0 v10 = z0.v(context, attributeSet, iArr, i10, 0);
        View view = this.f1590a;
        a0.l0(view, view.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        try {
            int i11 = j.f18433z3;
            if (v10.s(i11)) {
                this.f1592c = v10.n(i11, -1);
                ColorStateList f10 = this.f1591b.f(this.f1590a.getContext(), this.f1592c);
                if (f10 != null) {
                    h(f10);
                }
            }
            int i12 = j.A3;
            if (v10.s(i12)) {
                a0.s0(this.f1590a, v10.c(i12));
            }
            int i13 = j.B3;
            if (v10.s(i13)) {
                a0.t0(this.f1590a, h0.d(v10.k(i13, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v10.w();
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f1592c = -1;
        h((ColorStateList) null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void g(int i10) {
        this.f1592c = i10;
        j jVar = this.f1591b;
        h(jVar != null ? jVar.f(this.f1590a.getContext(), i10) : null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1593d == null) {
                this.f1593d = new x0();
            }
            x0 x0Var = this.f1593d;
            x0Var.f1847a = colorStateList;
            x0Var.f1850d = true;
        } else {
            this.f1593d = null;
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f1594e == null) {
            this.f1594e = new x0();
        }
        x0 x0Var = this.f1594e;
        x0Var.f1847a = colorStateList;
        x0Var.f1850d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f1594e == null) {
            this.f1594e = new x0();
        }
        x0 x0Var = this.f1594e;
        x0Var.f1848b = mode;
        x0Var.f1849c = true;
        b();
    }
}
