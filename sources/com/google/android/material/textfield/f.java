package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.c0;
import androidx.core.view.a0;
import androidx.core.widget.i;
import java.util.ArrayList;
import java.util.List;
import x5.d;
import y5.b;

/* compiled from: IndicatorViewController */
final class f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f25971a;

    /* renamed from: b  reason: collision with root package name */
    private final TextInputLayout f25972b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f25973c;

    /* renamed from: d  reason: collision with root package name */
    private int f25974d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f25975e;

    /* renamed from: f  reason: collision with root package name */
    private int f25976f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Animator f25977g;

    /* renamed from: h  reason: collision with root package name */
    private final float f25978h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f25979i;

    /* renamed from: j  reason: collision with root package name */
    private int f25980j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f25981k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f25982l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public TextView f25983m;

    /* renamed from: n  reason: collision with root package name */
    private int f25984n;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f25985o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f25986p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f25987q;

    /* renamed from: r  reason: collision with root package name */
    private TextView f25988r;

    /* renamed from: s  reason: collision with root package name */
    private int f25989s;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f25990t;

    /* renamed from: u  reason: collision with root package name */
    private Typeface f25991u;

    /* compiled from: IndicatorViewController */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f25992a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f25993b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f25994c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f25995d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f25992a = i10;
            this.f25993b = textView;
            this.f25994c = i11;
            this.f25995d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = f.this.f25979i = this.f25992a;
            Animator unused2 = f.this.f25977g = null;
            TextView textView = this.f25993b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f25994c == 1 && f.this.f25983m != null) {
                    f.this.f25983m.setText((CharSequence) null);
                }
                TextView textView2 = this.f25995d;
                if (textView2 != null) {
                    textView2.setTranslationY(0.0f);
                    this.f25995d.setAlpha(1.0f);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f25995d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f25971a = context;
        this.f25972b = textInputLayout;
        this.f25978h = (float) context.getResources().getDimensionPixelSize(d.design_textinput_caption_translate_y);
    }

    private void F(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void H(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean I(TextView textView, CharSequence charSequence) {
        return a0.R(this.f25972b) && this.f25972b.isEnabled() && (this.f25980j != this.f25979i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private void L(int i10, int i11, boolean z10) {
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f25977g = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i12 = i10;
            int i13 = i11;
            h(arrayList2, this.f25987q, this.f25988r, 2, i12, i13);
            h(arrayList2, this.f25982l, this.f25983m, 1, i12, i13);
            b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, l(i10), i10, l(i11)));
            animatorSet.start();
        } else {
            y(i10, i11);
        }
        this.f25972b.Y();
        this.f25972b.c0(z10);
        this.f25972b.e0();
    }

    private boolean f() {
        return (this.f25973c == null || this.f25972b.getEditText() == null) ? false : true;
    }

    private void h(List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView != null && z10) {
            if (i10 == i12 || i10 == i11) {
                list.add(i(textView, i12 == i10));
                if (i12 == i10) {
                    list.add(j(textView));
                }
            }
        }
    }

    private ObjectAnimator i(TextView textView, boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z10 ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(y5.a.f31291a);
        return ofFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f25978h, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(y5.a.f31294d);
        return ofFloat;
    }

    private TextView l(int i10) {
        if (i10 == 1) {
            return this.f25983m;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f25988r;
    }

    private boolean t(int i10) {
        if (i10 != 1 || this.f25983m == null || TextUtils.isEmpty(this.f25981k)) {
            return false;
        }
        return true;
    }

    private void y(int i10, int i11) {
        TextView l10;
        TextView l11;
        if (i10 != i11) {
            if (!(i11 == 0 || (l11 = l(i11)) == null)) {
                l11.setVisibility(0);
                l11.setAlpha(1.0f);
            }
            if (!(i10 == 0 || (l10 = l(i10)) == null)) {
                l10.setVisibility(4);
                if (i10 == 1) {
                    l10.setText((CharSequence) null);
                }
            }
            this.f25979i = i11;
        }
    }

    /* access modifiers changed from: package-private */
    public void A(int i10) {
        this.f25984n = i10;
        TextView textView = this.f25983m;
        if (textView != null) {
            this.f25972b.Q(textView, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void B(ColorStateList colorStateList) {
        this.f25985o = colorStateList;
        TextView textView = this.f25983m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void C(int i10) {
        this.f25989s = i10;
        TextView textView = this.f25988r;
        if (textView != null) {
            i.n(textView, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void D(boolean z10) {
        if (this.f25987q != z10) {
            g();
            if (z10) {
                c0 c0Var = new c0(this.f25971a);
                this.f25988r = c0Var;
                c0Var.setId(x5.f.textinput_helper_text);
                Typeface typeface = this.f25991u;
                if (typeface != null) {
                    this.f25988r.setTypeface(typeface);
                }
                this.f25988r.setVisibility(4);
                a0.p0(this.f25988r, 1);
                C(this.f25989s);
                E(this.f25990t);
                d(this.f25988r, 1);
            } else {
                s();
                x(this.f25988r, 1);
                this.f25988r = null;
                this.f25972b.Y();
                this.f25972b.e0();
            }
            this.f25987q = z10;
        }
    }

    /* access modifiers changed from: package-private */
    public void E(ColorStateList colorStateList) {
        this.f25990t = colorStateList;
        TextView textView = this.f25988r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void G(Typeface typeface) {
        if (typeface != this.f25991u) {
            this.f25991u = typeface;
            F(this.f25983m, typeface);
            F(this.f25988r, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    public void J(CharSequence charSequence) {
        g();
        this.f25981k = charSequence;
        this.f25983m.setText(charSequence);
        int i10 = this.f25979i;
        if (i10 != 1) {
            this.f25980j = 1;
        }
        L(i10, this.f25980j, I(this.f25983m, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void K(CharSequence charSequence) {
        g();
        this.f25986p = charSequence;
        this.f25988r.setText(charSequence);
        int i10 = this.f25979i;
        if (i10 != 2) {
            this.f25980j = 2;
        }
        L(i10, this.f25980j, I(this.f25988r, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void d(TextView textView, int i10) {
        if (this.f25973c == null && this.f25975e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f25971a);
            this.f25973c = linearLayout;
            linearLayout.setOrientation(0);
            this.f25972b.addView(this.f25973c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.f25971a);
            this.f25975e = frameLayout;
            this.f25973c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f25973c.addView(new Space(this.f25971a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f25972b.getEditText() != null) {
                e();
            }
        }
        if (u(i10)) {
            this.f25975e.setVisibility(0);
            this.f25975e.addView(textView);
            this.f25976f++;
        } else {
            this.f25973c.addView(textView, i10);
        }
        this.f25973c.setVisibility(0);
        this.f25974d++;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (f()) {
            a0.A0(this.f25973c, a0.G(this.f25972b.getEditText()), 0, a0.F(this.f25972b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        Animator animator = this.f25977g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return t(this.f25980j);
    }

    /* access modifiers changed from: package-private */
    public CharSequence m() {
        return this.f25981k;
    }

    /* access modifiers changed from: package-private */
    public int n() {
        TextView textView = this.f25983m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList o() {
        TextView textView = this.f25983m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence p() {
        return this.f25986p;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        TextView textView = this.f25988r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f25981k = null;
        g();
        if (this.f25979i == 1) {
            if (!this.f25987q || TextUtils.isEmpty(this.f25986p)) {
                this.f25980j = 0;
            } else {
                this.f25980j = 2;
            }
        }
        L(this.f25979i, this.f25980j, I(this.f25983m, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    public void s() {
        g();
        int i10 = this.f25979i;
        if (i10 == 2) {
            this.f25980j = 0;
        }
        L(i10, this.f25980j, I(this.f25988r, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    public boolean u(int i10) {
        return i10 == 0 || i10 == 1;
    }

    /* access modifiers changed from: package-private */
    public boolean v() {
        return this.f25982l;
    }

    /* access modifiers changed from: package-private */
    public boolean w() {
        return this.f25987q;
    }

    /* access modifiers changed from: package-private */
    public void x(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f25973c != null) {
            if (!u(i10) || (frameLayout = this.f25975e) == null) {
                this.f25973c.removeView(textView);
            } else {
                int i11 = this.f25976f - 1;
                this.f25976f = i11;
                H(frameLayout, i11);
                this.f25975e.removeView(textView);
            }
            int i12 = this.f25974d - 1;
            this.f25974d = i12;
            H(this.f25973c, i12);
        }
    }

    /* access modifiers changed from: package-private */
    public void z(boolean z10) {
        if (this.f25982l != z10) {
            g();
            if (z10) {
                c0 c0Var = new c0(this.f25971a);
                this.f25983m = c0Var;
                c0Var.setId(x5.f.textinput_error);
                Typeface typeface = this.f25991u;
                if (typeface != null) {
                    this.f25983m.setTypeface(typeface);
                }
                A(this.f25984n);
                B(this.f25985o);
                this.f25983m.setVisibility(4);
                a0.p0(this.f25983m, 1);
                d(this.f25983m, 0);
            } else {
                r();
                x(this.f25983m, 0);
                this.f25983m = null;
                this.f25972b.Y();
                this.f25972b.e0();
            }
            this.f25982l = z10;
        }
    }
}
