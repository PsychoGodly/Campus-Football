package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.view.y;
import androidx.core.widget.i;
import androidx.core.widget.k;
import androidx.core.widget.m;
import h.a;

/* compiled from: AppCompatCheckedTextView */
public class g extends CheckedTextView implements k, y, m {

    /* renamed from: a  reason: collision with root package name */
    private final h f1604a;

    /* renamed from: b  reason: collision with root package name */
    private final e f1605b;

    /* renamed from: c  reason: collision with root package name */
    private final b0 f1606c;

    /* renamed from: d  reason: collision with root package name */
    private m f1607d;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f18183s);
    }

    private m getEmojiTextViewHelper() {
        if (this.f1607d == null) {
            this.f1607d = new m(this);
        }
        return this.f1607d;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        b0 b0Var = this.f1606c;
        if (b0Var != null) {
            b0Var.b();
        }
        e eVar = this.f1605b;
        if (eVar != null) {
            eVar.b();
        }
        h hVar = this.f1604a;
        if (hVar != null) {
            hVar.a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1605b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1605b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        h hVar = this.f1604a;
        if (hVar != null) {
            return hVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        h hVar = this.f1604a;
        if (hVar != null) {
            return hVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1606c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1606c.k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return n.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1605b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1605b;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        h hVar = this.f1604a;
        if (hVar != null) {
            hVar.e();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1606c;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1606c;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1605b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1605b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        h hVar = this.f1604a;
        if (hVar != null) {
            hVar.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        h hVar = this.f1604a;
        if (hVar != null) {
            hVar.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1606c.w(colorStateList);
        this.f1606c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1606c.x(mode);
        this.f1606c.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f1606c;
        if (b0Var != null) {
            b0Var.q(context, i10);
        }
    }

    public g(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        u0.a(this, getContext());
        b0 b0Var = new b0(this);
        this.f1606c = b0Var;
        b0Var.m(attributeSet, i10);
        b0Var.b();
        e eVar = new e(this);
        this.f1605b = eVar;
        eVar.e(attributeSet, i10);
        h hVar = new h(this);
        this.f1604a = hVar;
        hVar.d(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(i.a.b(getContext(), i10));
    }
}
