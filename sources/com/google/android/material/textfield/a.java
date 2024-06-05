package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import x5.i;

/* compiled from: ClearTextEndIconDelegate */
class a extends e {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f25930d = new C0276a();

    /* renamed from: e  reason: collision with root package name */
    private final TextInputLayout.f f25931e = new b();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public AnimatorSet f25932f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public ValueAnimator f25933g;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* compiled from: ClearTextEndIconDelegate */
    class C0276a implements TextWatcher {
        C0276a() {
        }

        public void afterTextChanged(Editable editable) {
            if (!a.j(editable)) {
                a.this.f25932f.cancel();
                a.this.f25933g.start();
            } else if (!a.this.f25968a.E()) {
                a.this.f25933g.cancel();
                a.this.f25932f.start();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    class b implements TextInputLayout.f {
        b() {
        }

        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.j(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.removeTextChangedListener(a.this.f25930d);
            editText.addTextChangedListener(a.this.f25930d);
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            a.this.f25968a.getEditText().setText((CharSequence) null);
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    class d extends AnimatorListenerAdapter {
        d() {
        }

        public void onAnimationStart(Animator animator) {
            a.this.f25968a.setEndIconVisible(true);
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    class e extends AnimatorListenerAdapter {
        e() {
        }

        public void onAnimationEnd(Animator animator) {
            a.this.f25968a.setEndIconVisible(false);
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f25970c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    class g implements ValueAnimator.AnimatorUpdateListener {
        g() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f25970c.setScaleX(floatValue);
            a.this.f25970c.setScaleY(floatValue);
        }
    }

    a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    private ValueAnimator h(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(y5.a.f31291a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new f());
        return ofFloat;
    }

    private ValueAnimator i() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(y5.a.f31294d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new g());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    public static boolean j(Editable editable) {
        return editable.length() > 0;
    }

    private void k() {
        ValueAnimator i10 = i();
        ValueAnimator h10 = h(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f25932f = animatorSet;
        animatorSet.playTogether(new Animator[]{i10, h10});
        this.f25932f.addListener(new d());
        ValueAnimator h11 = h(1.0f, 0.0f);
        this.f25933g = h11;
        h11.addListener(new e());
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f25968a.setEndIconDrawable(i.a.b(this.f25969b, x5.e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f25968a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(i.clear_text_end_icon_content_description));
        this.f25968a.setEndIconOnClickListener(new c());
        this.f25968a.c(this.f25931e);
        k();
    }
}
