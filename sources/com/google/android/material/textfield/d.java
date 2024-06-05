package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.a0;
import com.google.android.material.textfield.TextInputLayout;
import n6.k;

/* compiled from: DropdownMenuEndIconDelegate */
class d extends e {

    /* renamed from: o  reason: collision with root package name */
    private static final boolean f25944o = (Build.VERSION.SDK_INT >= 21);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f25945d = new a();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final TextInputLayout.e f25946e = new b(this.f25968a);

    /* renamed from: f  reason: collision with root package name */
    private final TextInputLayout.f f25947f = new c();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f25948g = false;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f25949h = false;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public long f25950i = Long.MAX_VALUE;

    /* renamed from: j  reason: collision with root package name */
    private StateListDrawable f25951j;

    /* renamed from: k  reason: collision with root package name */
    private n6.g f25952k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public AccessibilityManager f25953l;

    /* renamed from: m  reason: collision with root package name */
    private ValueAnimator f25954m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public ValueAnimator f25955n;

    /* compiled from: DropdownMenuEndIconDelegate */
    class a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a  reason: collision with other inner class name */
        /* compiled from: DropdownMenuEndIconDelegate */
        class C0277a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f25957a;

            C0277a(AutoCompleteTextView autoCompleteTextView) {
                this.f25957a = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f25957a.isPopupShowing();
                d.this.z(isPopupShowing);
                boolean unused = d.this.f25948g = isPopupShowing;
            }
        }

        a() {
        }

        public void afterTextChanged(Editable editable) {
            d dVar = d.this;
            AutoCompleteTextView d10 = dVar.u(dVar.f25968a.getEditText());
            d10.post(new C0277a(d10));
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    class b extends TextInputLayout.e {
        b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        public void g(View view, androidx.core.view.accessibility.c cVar) {
            super.g(view, cVar);
            cVar.X(Spinner.class.getName());
            if (cVar.K()) {
                cVar.i0((CharSequence) null);
            }
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            d dVar = d.this;
            AutoCompleteTextView d10 = dVar.u(dVar.f25968a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.f25953l.isTouchExplorationEnabled()) {
                d.this.C(d10);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    class c implements TextInputLayout.f {
        c() {
        }

        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView d10 = d.this.u(textInputLayout.getEditText());
            d.this.A(d10);
            d.this.r(d10);
            d.this.B(d10);
            d10.setThreshold(0);
            d10.removeTextChangedListener(d.this.f25945d);
            d10.addTextChangedListener(d.this.f25945d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f25946e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d  reason: collision with other inner class name */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C0278d implements View.OnClickListener {
        C0278d() {
        }

        public void onClick(View view) {
            d.this.C((AutoCompleteTextView) d.this.f25968a.getEditText());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    class e implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f25962a;

        e(AutoCompleteTextView autoCompleteTextView) {
            this.f25962a = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.y()) {
                    boolean unused = d.this.f25948g = false;
                }
                d.this.C(this.f25962a);
                view.performClick();
            }
            return false;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    class f implements View.OnFocusChangeListener {
        f() {
        }

        public void onFocusChange(View view, boolean z10) {
            d.this.f25968a.setEndIconActivated(z10);
            if (!z10) {
                d.this.z(false);
                boolean unused = d.this.f25948g = false;
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    class g implements AutoCompleteTextView.OnDismissListener {
        g() {
        }

        public void onDismiss() {
            boolean unused = d.this.f25948g = true;
            long unused2 = d.this.f25950i = System.currentTimeMillis();
            d.this.z(false);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    class h extends AnimatorListenerAdapter {
        h() {
        }

        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f25970c.setChecked(dVar.f25949h);
            d.this.f25955n.start();
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f25970c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    public void A(AutoCompleteTextView autoCompleteTextView) {
        if (f25944o) {
            int boxBackgroundMode = this.f25968a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f25952k);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f25951j);
            }
        }
    }

    /* access modifiers changed from: private */
    public void B(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new e(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(new f());
        if (f25944o) {
            autoCompleteTextView.setOnDismissListener(new g());
        }
    }

    /* access modifiers changed from: private */
    public void C(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (y()) {
                this.f25948g = false;
            }
            if (!this.f25948g) {
                if (f25944o) {
                    z(!this.f25949h);
                } else {
                    this.f25949h = !this.f25949h;
                    this.f25970c.toggle();
                }
                if (this.f25949h) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f25948g = false;
        }
    }

    /* access modifiers changed from: private */
    public void r(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = this.f25968a.getBoxBackgroundMode();
            n6.g boxBackground = this.f25968a.getBoxBackground();
            int c10 = d6.a.c(autoCompleteTextView, x5.b.f30858f);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                t(autoCompleteTextView, c10, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                s(autoCompleteTextView, c10, iArr, boxBackground);
            }
        }
    }

    private void s(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, n6.g gVar) {
        int boxBackgroundColor = this.f25968a.getBoxBackgroundColor();
        int[] iArr2 = {d6.a.f(i10, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f25944o) {
            a0.r0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        n6.g gVar2 = new n6.g(gVar.B());
        gVar2.T(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int G = a0.G(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int F = a0.F(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        a0.r0(autoCompleteTextView, layerDrawable);
        a0.A0(autoCompleteTextView, G, paddingTop, F, paddingBottom);
    }

    private void t(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, n6.g gVar) {
        LayerDrawable layerDrawable;
        int c10 = d6.a.c(autoCompleteTextView, x5.b.colorSurface);
        n6.g gVar2 = new n6.g(gVar.B());
        int f10 = d6.a.f(i10, c10, 0.1f);
        gVar2.T(new ColorStateList(iArr, new int[]{f10, 0}));
        if (f25944o) {
            gVar2.setTint(c10);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f10, c10});
            n6.g gVar3 = new n6.g(gVar.B());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        a0.r0(autoCompleteTextView, layerDrawable);
    }

    /* access modifiers changed from: private */
    public AutoCompleteTextView u(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator v(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(y5.a.f31291a);
        ofFloat.setDuration((long) i10);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    private n6.g w(float f10, float f11, float f12, int i10) {
        k m10 = k.a().z(f10).D(f10).r(f11).v(f11).m();
        n6.g l10 = n6.g.l(this.f25969b, f12);
        l10.setShapeAppearanceModel(m10);
        l10.V(0, i10, 0, i10);
        return l10;
    }

    private void x() {
        this.f25955n = v(67, 0.0f, 1.0f);
        ValueAnimator v10 = v(50, 1.0f, 0.0f);
        this.f25954m = v10;
        v10.addListener(new h());
    }

    /* access modifiers changed from: private */
    public boolean y() {
        long currentTimeMillis = System.currentTimeMillis() - this.f25950i;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    public void z(boolean z10) {
        if (this.f25949h != z10) {
            this.f25949h = z10;
            this.f25955n.cancel();
            this.f25954m.start();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        float dimensionPixelOffset = (float) this.f25969b.getResources().getDimensionPixelOffset(x5.d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f25969b.getResources().getDimensionPixelOffset(x5.d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f25969b.getResources().getDimensionPixelOffset(x5.d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        n6.g w10 = w(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        n6.g w11 = w(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f25952k = w10;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f25951j = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, w10);
        this.f25951j.addState(new int[0], w11);
        this.f25968a.setEndIconDrawable(i.a.b(this.f25969b, f25944o ? x5.e.mtrl_dropdown_arrow : x5.e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f25968a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(x5.i.exposed_dropdown_menu_content_description));
        this.f25968a.setEndIconOnClickListener(new C0278d());
        this.f25968a.c(this.f25947f);
        x();
        a0.x0(this.f25970c, 2);
        this.f25953l = (AccessibilityManager) this.f25969b.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i10) {
        return i10 != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return true;
    }
}
