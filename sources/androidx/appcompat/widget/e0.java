package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.core.view.y;
import androidx.core.widget.m;

/* compiled from: AppCompatToggleButton */
public class e0 extends ToggleButton implements y, m {

    /* renamed from: a  reason: collision with root package name */
    private final e f1596a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f1597b;

    /* renamed from: c  reason: collision with root package name */
    private m f1598c;

    public e0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    private m getEmojiTextViewHelper() {
        if (this.f1598c == null) {
            this.f1598c = new m(this);
        }
        return this.f1598c;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1596a;
        if (eVar != null) {
            eVar.b();
        }
        b0 b0Var = this.f1597b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1596a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1596a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1597b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1597b.k();
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1596a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1596a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1597b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1597b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1596a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1596a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1597b.w(colorStateList);
        this.f1597b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1597b.x(mode);
        this.f1597b.b();
    }

    public e0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f1596a = eVar;
        eVar.e(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f1597b = b0Var;
        b0Var.m(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }
}
