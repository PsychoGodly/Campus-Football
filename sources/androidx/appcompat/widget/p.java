package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.a0;
import androidx.core.widget.e;
import h.j;
import i.a;

/* compiled from: AppCompatImageHelper */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f1752a;

    /* renamed from: b  reason: collision with root package name */
    private x0 f1753b;

    /* renamed from: c  reason: collision with root package name */
    private x0 f1754c;

    /* renamed from: d  reason: collision with root package name */
    private x0 f1755d;

    /* renamed from: e  reason: collision with root package name */
    private int f1756e = 0;

    public p(ImageView imageView) {
        this.f1752a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1755d == null) {
            this.f1755d = new x0();
        }
        x0 x0Var = this.f1755d;
        x0Var.a();
        ColorStateList a10 = e.a(this.f1752a);
        if (a10 != null) {
            x0Var.f1850d = true;
            x0Var.f1847a = a10;
        }
        PorterDuff.Mode b10 = e.b(this.f1752a);
        if (b10 != null) {
            x0Var.f1849c = true;
            x0Var.f1848b = b10;
        }
        if (!x0Var.f1850d && !x0Var.f1849c) {
            return false;
        }
        j.i(drawable, x0Var, this.f1752a.getDrawableState());
        return true;
    }

    private boolean l() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 21) {
            return i10 == 21;
        }
        if (this.f1753b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f1752a.getDrawable() != null) {
            this.f1752a.getDrawable().setLevel(this.f1756e);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.f1752a.getDrawable();
        if (drawable != null) {
            h0.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!l() || !a(drawable)) {
            x0 x0Var = this.f1754c;
            if (x0Var != null) {
                j.i(drawable, x0Var, this.f1752a.getDrawableState());
                return;
            }
            x0 x0Var2 = this.f1753b;
            if (x0Var2 != null) {
                j.i(drawable, x0Var2, this.f1752a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList d() {
        x0 x0Var = this.f1754c;
        if (x0Var != null) {
            return x0Var.f1847a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode e() {
        x0 x0Var = this.f1754c;
        if (x0Var != null) {
            return x0Var.f1848b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1752a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int n10;
        Context context = this.f1752a.getContext();
        int[] iArr = j.P;
        z0 v10 = z0.v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1752a;
        a0.l0(imageView, imageView.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        try {
            Drawable drawable = this.f1752a.getDrawable();
            if (!(drawable != null || (n10 = v10.n(j.Q, -1)) == -1 || (drawable = a.b(this.f1752a.getContext(), n10)) == null)) {
                this.f1752a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                h0.b(drawable);
            }
            int i11 = j.R;
            if (v10.s(i11)) {
                e.c(this.f1752a, v10.c(i11));
            }
            int i12 = j.S;
            if (v10.s(i12)) {
                e.d(this.f1752a, h0.d(v10.k(i12, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v10.w();
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Drawable drawable) {
        this.f1756e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable b10 = a.b(this.f1752a.getContext(), i10);
            if (b10 != null) {
                h0.b(b10);
            }
            this.f1752a.setImageDrawable(b10);
        } else {
            this.f1752a.setImageDrawable((Drawable) null);
        }
        c();
    }

    /* access modifiers changed from: package-private */
    public void j(ColorStateList colorStateList) {
        if (this.f1754c == null) {
            this.f1754c = new x0();
        }
        x0 x0Var = this.f1754c;
        x0Var.f1847a = colorStateList;
        x0Var.f1850d = true;
        c();
    }

    /* access modifiers changed from: package-private */
    public void k(PorterDuff.Mode mode) {
        if (this.f1754c == null) {
            this.f1754c = new x0();
        }
        x0 x0Var = this.f1754c;
        x0Var.f1848b = mode;
        x0Var.f1849c = true;
        c();
    }
}
