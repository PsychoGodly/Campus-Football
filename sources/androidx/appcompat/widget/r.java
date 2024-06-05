package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.core.view.y;
import androidx.core.widget.m;
import h.a;

/* compiled from: AppCompatMultiAutoCompleteTextView */
public class r extends MultiAutoCompleteTextView implements y, m {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f1771d = {16843126};

    /* renamed from: a  reason: collision with root package name */
    private final e f1772a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f1773b;

    /* renamed from: c  reason: collision with root package name */
    private final l f1774c;

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f18180p);
    }

    /* access modifiers changed from: package-private */
    public void a(l lVar) {
        KeyListener keyListener = getKeyListener();
        if (lVar.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a10 = lVar.a(keyListener);
            if (a10 != keyListener) {
                super.setKeyListener(a10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1772a;
        if (eVar != null) {
            eVar.b();
        }
        b0 b0Var = this.f1773b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1772a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1772a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1773b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1773b.k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f1774c.d(n.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1772a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1772a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1773b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1773b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(i.a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f1774c.e(z10);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1774c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1772a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1772a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1773b.w(colorStateList);
        this.f1773b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1773b.x(mode);
        this.f1773b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f1773b;
        if (b0Var != null) {
            b0Var.q(context, i10);
        }
    }

    public r(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        u0.a(this, getContext());
        z0 v10 = z0.v(getContext(), attributeSet, f1771d, i10, 0);
        if (v10.s(0)) {
            setDropDownBackgroundDrawable(v10.g(0));
        }
        v10.w();
        e eVar = new e(this);
        this.f1772a = eVar;
        eVar.e(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f1773b = b0Var;
        b0Var.m(attributeSet, i10);
        b0Var.b();
        l lVar = new l(this);
        this.f1774c = lVar;
        lVar.c(attributeSet, i10);
        a(lVar);
    }
}
