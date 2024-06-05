package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.view.y;
import androidx.core.widget.l;
import androidx.core.widget.m;
import h.a;

/* compiled from: AppCompatCheckBox */
public class f extends CheckBox implements l, y, m {

    /* renamed from: a  reason: collision with root package name */
    private final i f1599a;

    /* renamed from: b  reason: collision with root package name */
    private final e f1600b;

    /* renamed from: c  reason: collision with root package name */
    private final b0 f1601c;

    /* renamed from: d  reason: collision with root package name */
    private m f1602d;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f18182r);
    }

    private m getEmojiTextViewHelper() {
        if (this.f1602d == null) {
            this.f1602d = new m(this);
        }
        return this.f1602d;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1600b;
        if (eVar != null) {
            eVar.b();
        }
        b0 b0Var = this.f1601c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f1599a;
        return iVar != null ? iVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1600b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1600b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f1599a;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f1599a;
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1601c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1601c.k();
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1600b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1600b;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f1599a;
        if (iVar != null) {
            iVar.f();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1601c;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1601c;
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
        e eVar = this.f1600b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1600b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f1599a;
        if (iVar != null) {
            iVar.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f1599a;
        if (iVar != null) {
            iVar.h(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1601c.w(colorStateList);
        this.f1601c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1601c.x(mode);
        this.f1601c.b();
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        u0.a(this, getContext());
        i iVar = new i(this);
        this.f1599a = iVar;
        iVar.e(attributeSet, i10);
        e eVar = new e(this);
        this.f1600b = eVar;
        eVar.e(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f1601c = b0Var;
        b0Var.m(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    public void setButtonDrawable(int i10) {
        setButtonDrawable(i.a.b(getContext(), i10));
    }
}
