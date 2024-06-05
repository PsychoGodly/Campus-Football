package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.a0;
import androidx.core.view.c;
import androidx.core.view.w;
import androidx.core.view.y;
import androidx.core.widget.i;
import androidx.core.widget.j;
import androidx.core.widget.m;

/* compiled from: AppCompatEditText */
public class k extends EditText implements y, w, m {

    /* renamed from: a  reason: collision with root package name */
    private final e f1674a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f1675b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f1676c;

    /* renamed from: d  reason: collision with root package name */
    private final j f1677d;

    /* renamed from: f  reason: collision with root package name */
    private final l f1678f;

    /* renamed from: g  reason: collision with root package name */
    private a f1679g;

    /* compiled from: AppCompatEditText */
    class a {
        a() {
        }

        public TextClassifier a() {
            return k.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            k.super.setTextClassifier(textClassifier);
        }
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.B);
    }

    private a getSuperCaller() {
        if (this.f1679g == null) {
            this.f1679g = new a();
        }
        return this.f1679g;
    }

    public c a(c cVar) {
        return this.f1677d.a(this, cVar);
    }

    /* access modifiers changed from: package-private */
    public void d(l lVar) {
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
        e eVar = this.f1674a;
        if (eVar != null) {
            eVar.b();
        }
        b0 b0Var = this.f1675b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1674a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1674a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1675b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1675b.k();
    }

    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f1676c) == null) {
            return getSuperCaller().a();
        }
        return a0Var.a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] E;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1675b.r(this, onCreateInputConnection, editorInfo);
        InputConnection a10 = n.a(onCreateInputConnection, editorInfo, this);
        if (!(a10 == null || Build.VERSION.SDK_INT > 30 || (E = a0.E(this)) == null)) {
            c0.a.d(editorInfo, E);
            a10 = c0.c.c(this, a10, editorInfo);
        }
        return this.f1678f.d(a10, editorInfo);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (w.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i10) {
        if (w.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1674a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1674a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1675b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1675b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f1678f.e(z10);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1678f.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1674a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1674a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1675b.w(colorStateList);
        this.f1675b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1675b.x(mode);
        this.f1675b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f1675b;
        if (b0Var != null) {
            b0Var.q(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f1676c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            a0Var.b(textClassifier);
        }
    }

    public k(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f1674a = eVar;
        eVar.e(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f1675b = b0Var;
        b0Var.m(attributeSet, i10);
        b0Var.b();
        this.f1676c = new a0(this);
        this.f1677d = new j();
        l lVar = new l(this);
        this.f1678f = lVar;
        lVar.c(attributeSet, i10);
        d(lVar);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
