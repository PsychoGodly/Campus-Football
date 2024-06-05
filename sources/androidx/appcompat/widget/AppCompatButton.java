package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.view.y;
import androidx.core.widget.i;
import androidx.core.widget.m;
import h.a;

public class AppCompatButton extends Button implements y, m {

    /* renamed from: a  reason: collision with root package name */
    private final e f1370a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f1371b;

    /* renamed from: c  reason: collision with root package name */
    private m f1372c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f18181q);
    }

    private m getEmojiTextViewHelper() {
        if (this.f1372c == null) {
            this.f1372c = new m(this);
        }
        return this.f1372c;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1370a;
        if (eVar != null) {
            eVar.b();
        }
        b0 b0Var = this.f1371b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (k1.f1693b) {
            return super.getAutoSizeMaxTextSize();
        }
        b0 b0Var = this.f1371b;
        if (b0Var != null) {
            return b0Var.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (k1.f1693b) {
            return super.getAutoSizeMinTextSize();
        }
        b0 b0Var = this.f1371b;
        if (b0Var != null) {
            return b0Var.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (k1.f1693b) {
            return super.getAutoSizeStepGranularity();
        }
        b0 b0Var = this.f1371b;
        if (b0Var != null) {
            return b0Var.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (k1.f1693b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        b0 b0Var = this.f1371b;
        return b0Var != null ? b0Var.h() : new int[0];
    }

    public int getAutoSizeTextType() {
        if (!k1.f1693b) {
            b0 b0Var = this.f1371b;
            if (b0Var != null) {
                return b0Var.i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1370a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1370a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1371b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1371b.k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b0 b0Var = this.f1371b;
        if (b0Var != null) {
            b0Var.o(z10, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        b0 b0Var = this.f1371b;
        if (b0Var != null && !k1.f1693b && b0Var.l()) {
            this.f1371b.c();
        }
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (k1.f1693b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        b0 b0Var = this.f1371b;
        if (b0Var != null) {
            b0Var.t(i10, i11, i12, i13);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (k1.f1693b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        b0 b0Var = this.f1371b;
        if (b0Var != null) {
            b0Var.u(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (k1.f1693b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        b0 b0Var = this.f1371b;
        if (b0Var != null) {
            b0Var.v(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1370a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1370a;
        if (eVar != null) {
            eVar.g(i10);
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

    public void setSupportAllCaps(boolean z10) {
        b0 b0Var = this.f1371b;
        if (b0Var != null) {
            b0Var.s(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1370a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1370a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1371b.w(colorStateList);
        this.f1371b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1371b.x(mode);
        this.f1371b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f1371b;
        if (b0Var != null) {
            b0Var.q(context, i10);
        }
    }

    public void setTextSize(int i10, float f10) {
        if (k1.f1693b) {
            super.setTextSize(i10, f10);
            return;
        }
        b0 b0Var = this.f1371b;
        if (b0Var != null) {
            b0Var.A(i10, f10);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f1370a = eVar;
        eVar.e(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f1371b = b0Var;
        b0Var.m(attributeSet, i10);
        b0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }
}
