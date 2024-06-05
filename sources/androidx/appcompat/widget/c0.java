package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.f;
import androidx.core.text.c;
import androidx.core.view.y;
import androidx.core.widget.i;
import androidx.core.widget.m;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: AppCompatTextView */
public class c0 extends TextView implements y, m {

    /* renamed from: a  reason: collision with root package name */
    private final e f1540a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f1541b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f1542c;

    /* renamed from: d  reason: collision with root package name */
    private m f1543d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1544f;

    /* renamed from: g  reason: collision with root package name */
    private a f1545g;

    /* renamed from: h  reason: collision with root package name */
    private Future<androidx.core.text.c> f1546h;

    /* compiled from: AppCompatTextView */
    private interface a {
        void a(int[] iArr, int i10);

        int[] b();

        TextClassifier c();

        int d();

        void e(TextClassifier textClassifier);

        void f(int i10);

        void g(int i10, int i11, int i12, int i13);

        int h();

        int i();

        void j(int i10);

        int k();

        void l(int i10);
    }

    /* compiled from: AppCompatTextView */
    class b implements a {
        b() {
        }

        public void a(int[] iArr, int i10) {
            c0.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public int[] b() {
            return c0.super.getAutoSizeTextAvailableSizes();
        }

        public TextClassifier c() {
            return c0.super.getTextClassifier();
        }

        public int d() {
            return c0.super.getAutoSizeMaxTextSize();
        }

        public void e(TextClassifier textClassifier) {
            c0.super.setTextClassifier(textClassifier);
        }

        public void f(int i10) {
        }

        public void g(int i10, int i11, int i12, int i13) {
            c0.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public int h() {
            return c0.super.getAutoSizeTextType();
        }

        public int i() {
            return c0.super.getAutoSizeMinTextSize();
        }

        public void j(int i10) {
        }

        public int k() {
            return c0.super.getAutoSizeStepGranularity();
        }

        public void l(int i10) {
            c0.super.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    /* compiled from: AppCompatTextView */
    class c extends b {
        c() {
            super();
        }

        public void f(int i10) {
            c0.super.setLastBaselineToBottomHeight(i10);
        }

        public void j(int i10) {
            c0.super.setFirstBaselineToTopHeight(i10);
        }
    }

    public c0(Context context) {
        this(context, (AttributeSet) null);
    }

    private m getEmojiTextViewHelper() {
        if (this.f1543d == null) {
            this.f1543d = new m(this);
        }
        return this.f1543d;
    }

    private void q() {
        Future<androidx.core.text.c> future = this.f1546h;
        if (future != null) {
            try {
                this.f1546h = null;
                i.m(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1540a;
        if (eVar != null) {
            eVar.b();
        }
        b0 b0Var = this.f1541b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (k1.f1693b) {
            return getSuperCaller().d();
        }
        b0 b0Var = this.f1541b;
        if (b0Var != null) {
            return b0Var.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (k1.f1693b) {
            return getSuperCaller().i();
        }
        b0 b0Var = this.f1541b;
        if (b0Var != null) {
            return b0Var.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (k1.f1693b) {
            return getSuperCaller().k();
        }
        b0 b0Var = this.f1541b;
        if (b0Var != null) {
            return b0Var.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (k1.f1693b) {
            return getSuperCaller().b();
        }
        b0 b0Var = this.f1541b;
        return b0Var != null ? b0Var.h() : new int[0];
    }

    public int getAutoSizeTextType() {
        if (!k1.f1693b) {
            b0 b0Var = this.f1541b;
            if (b0Var != null) {
                return b0Var.i();
            }
            return 0;
        } else if (getSuperCaller().h() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.p(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return i.b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return i.c(this);
    }

    /* access modifiers changed from: package-private */
    public a getSuperCaller() {
        if (this.f1545g == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                this.f1545g = new c();
            } else if (i10 >= 26) {
                this.f1545g = new b();
            }
        }
        return this.f1545g;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1540a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1540a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1541b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1541b.k();
    }

    public CharSequence getText() {
        q();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f1542c) == null) {
            return getSuperCaller().c();
        }
        return a0Var.a();
    }

    public c.a getTextMetricsParamsCompat() {
        return i.f(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1541b.r(this, onCreateInputConnection, editorInfo);
        return n.a(onCreateInputConnection, editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b0 b0Var = this.f1541b;
        if (b0Var != null) {
            b0Var.o(z10, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        q();
        super.onMeasure(i10, i11);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        b0 b0Var = this.f1541b;
        if (b0Var != null && !k1.f1693b && b0Var.l()) {
            this.f1541b.c();
        }
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (k1.f1693b) {
            getSuperCaller().g(i10, i11, i12, i13);
            return;
        }
        b0 b0Var = this.f1541b;
        if (b0Var != null) {
            b0Var.t(i10, i11, i12, i13);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (k1.f1693b) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        b0 b0Var = this.f1541b;
        if (b0Var != null) {
            b0Var.u(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (k1.f1693b) {
            getSuperCaller().l(i10);
            return;
        }
        b0 b0Var = this.f1541b;
        if (b0Var != null) {
            b0Var.v(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1540a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1540a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1541b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1541b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1541b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f1541b;
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

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i10);
        } else {
            i.j(this, i10);
        }
    }

    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i10);
        } else {
            i.k(this, i10);
        }
    }

    public void setLineHeight(int i10) {
        i.l(this, i10);
    }

    public void setPrecomputedText(androidx.core.text.c cVar) {
        i.m(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1540a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1540a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1541b.w(colorStateList);
        this.f1541b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1541b.x(mode);
        this.f1541b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f1541b;
        if (b0Var != null) {
            b0Var.q(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f1542c) == null) {
            getSuperCaller().e(textClassifier);
        } else {
            a0Var.b(textClassifier);
        }
    }

    public void setTextFuture(Future<androidx.core.text.c> future) {
        this.f1546h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        i.o(this, aVar);
    }

    public void setTextSize(int i10, float f10) {
        if (k1.f1693b) {
            super.setTextSize(i10, f10);
            return;
        }
        b0 b0Var = this.f1541b;
        if (b0Var != null) {
            b0Var.A(i10, f10);
        }
    }

    public void setTypeface(Typeface typeface, int i10) {
        if (!this.f1544f) {
            Typeface typeface2 = null;
            if (typeface != null && i10 > 0) {
                typeface2 = f.a(getContext(), typeface, i10);
            }
            this.f1544f = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i10);
            } finally {
                this.f1544f = false;
            }
        }
    }

    public c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public c0(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        this.f1544f = false;
        this.f1545g = null;
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f1540a = eVar;
        eVar.e(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f1541b = b0Var;
        b0Var.m(attributeSet, i10);
        b0Var.b();
        this.f1542c = new a0(this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b10 = i10 != 0 ? i.a.b(context, i10) : null;
        Drawable b11 = i11 != 0 ? i.a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? i.a.b(context, i12) : null;
        if (i13 != 0) {
            drawable = i.a.b(context, i13);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b10, b11, b12, drawable);
        b0 b0Var = this.f1541b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b10 = i10 != 0 ? i.a.b(context, i10) : null;
        Drawable b11 = i11 != 0 ? i.a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? i.a.b(context, i12) : null;
        if (i13 != 0) {
            drawable = i.a.b(context, i13);
        }
        setCompoundDrawablesWithIntrinsicBounds(b10, b11, b12, drawable);
        b0 b0Var = this.f1541b;
        if (b0Var != null) {
            b0Var.p();
        }
    }
}
