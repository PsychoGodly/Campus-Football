package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;
import androidx.core.view.a0;
import h.j;

/* compiled from: AppCompatSeekBarHelper */
class y extends t {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f1851d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1852e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f1853f = null;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f1854g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1855h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1856i = false;

    y(SeekBar seekBar) {
        super(seekBar);
        this.f1851d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1852e;
        if (drawable == null) {
            return;
        }
        if (this.f1855h || this.f1856i) {
            Drawable r10 = a.r(drawable.mutate());
            this.f1852e = r10;
            if (this.f1855h) {
                a.o(r10, this.f1853f);
            }
            if (this.f1856i) {
                a.p(this.f1852e, this.f1854g);
            }
            if (this.f1852e.isStateful()) {
                this.f1852e.setState(this.f1851d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f1851d.getContext();
        int[] iArr = j.T;
        z0 v10 = z0.v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1851d;
        a0.l0(seekBar, seekBar.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        Drawable h10 = v10.h(j.U);
        if (h10 != null) {
            this.f1851d.setThumb(h10);
        }
        j(v10.g(j.V));
        int i11 = j.X;
        if (v10.s(i11)) {
            this.f1854g = h0.d(v10.k(i11, -1), this.f1854g);
            this.f1856i = true;
        }
        int i12 = j.W;
        if (v10.s(i12)) {
            this.f1853f = v10.c(i12);
            this.f1855h = true;
        }
        v10.w();
        f();
    }

    /* access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f1852e != null) {
            int max = this.f1851d.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1852e.getIntrinsicWidth();
                int intrinsicHeight = this.f1852e.getIntrinsicHeight();
                int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f1852e.setBounds(-i11, -i10, i11, i10);
                float width = ((float) ((this.f1851d.getWidth() - this.f1851d.getPaddingLeft()) - this.f1851d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1851d.getPaddingLeft(), (float) (this.f1851d.getHeight() / 2));
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1852e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f1852e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1851d.getDrawableState())) {
            this.f1851d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f1852e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Drawable drawable) {
        Drawable drawable2 = this.f1852e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1852e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1851d);
            a.m(drawable, a0.B(this.f1851d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1851d.getDrawableState());
            }
            f();
        }
        this.f1851d.invalidate();
    }
}
