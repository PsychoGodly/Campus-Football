package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.h0;
import androidx.core.view.a0;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n6.k;
import x5.i;
import x5.j;

public class TextInputLayout extends LinearLayout {

    /* renamed from: s0  reason: collision with root package name */
    private static final int f25879s0 = j.Widget_Design_TextInputLayout;
    private int A;
    private int B;
    private final Rect C;
    private final Rect D;
    private final RectF E;
    private Typeface F;
    private final CheckableImageButton G;
    private ColorStateList H;
    private boolean I;
    private PorterDuff.Mode J;
    private boolean K;
    private Drawable L;
    private View.OnLongClickListener M;
    private final LinkedHashSet<f> N;
    private int O;
    private final SparseArray<e> P;
    /* access modifiers changed from: private */
    public final CheckableImageButton Q;
    private final LinkedHashSet<g> R;
    private ColorStateList S;
    private boolean T;
    private PorterDuff.Mode U;
    private boolean V;
    private Drawable W;

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f25880a;

    /* renamed from: a0  reason: collision with root package name */
    private Drawable f25881a0;

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f25882b;

    /* renamed from: b0  reason: collision with root package name */
    private final CheckableImageButton f25883b0;

    /* renamed from: c  reason: collision with root package name */
    EditText f25884c;

    /* renamed from: c0  reason: collision with root package name */
    private View.OnLongClickListener f25885c0;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f25886d;

    /* renamed from: d0  reason: collision with root package name */
    private ColorStateList f25887d0;

    /* renamed from: e0  reason: collision with root package name */
    private ColorStateList f25888e0;

    /* renamed from: f  reason: collision with root package name */
    private final f f25889f;

    /* renamed from: f0  reason: collision with root package name */
    private final int f25890f0;

    /* renamed from: g  reason: collision with root package name */
    boolean f25891g;

    /* renamed from: g0  reason: collision with root package name */
    private final int f25892g0;

    /* renamed from: h  reason: collision with root package name */
    private int f25893h;

    /* renamed from: h0  reason: collision with root package name */
    private int f25894h0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f25895i;

    /* renamed from: i0  reason: collision with root package name */
    private int f25896i0;

    /* renamed from: j  reason: collision with root package name */
    private TextView f25897j;

    /* renamed from: j0  reason: collision with root package name */
    private final int f25898j0;

    /* renamed from: k  reason: collision with root package name */
    private int f25899k;

    /* renamed from: k0  reason: collision with root package name */
    private final int f25900k0;

    /* renamed from: l  reason: collision with root package name */
    private int f25901l;

    /* renamed from: l0  reason: collision with root package name */
    private final int f25902l0;

    /* renamed from: m  reason: collision with root package name */
    private ColorStateList f25903m;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f25904m0;

    /* renamed from: n  reason: collision with root package name */
    private ColorStateList f25905n;

    /* renamed from: n0  reason: collision with root package name */
    final com.google.android.material.internal.a f25906n0;

    /* renamed from: o  reason: collision with root package name */
    private boolean f25907o;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f25908o0;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f25909p;

    /* renamed from: p0  reason: collision with root package name */
    private ValueAnimator f25910p0;

    /* renamed from: q  reason: collision with root package name */
    private boolean f25911q;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f25912q0;

    /* renamed from: r  reason: collision with root package name */
    private n6.g f25913r;
    /* access modifiers changed from: private */

    /* renamed from: r0  reason: collision with root package name */
    public boolean f25914r0;

    /* renamed from: s  reason: collision with root package name */
    private n6.g f25915s;

    /* renamed from: t  reason: collision with root package name */
    private k f25916t;

    /* renamed from: u  reason: collision with root package name */
    private final int f25917u;

    /* renamed from: v  reason: collision with root package name */
    private int f25918v;

    /* renamed from: w  reason: collision with root package name */
    private final int f25919w;

    /* renamed from: x  reason: collision with root package name */
    private int f25920x;

    /* renamed from: y  reason: collision with root package name */
    private final int f25921y;

    /* renamed from: z  reason: collision with root package name */
    private final int f25922z;

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.c0(!textInputLayout.f25914r0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f25891g) {
                textInputLayout2.V(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            TextInputLayout.this.Q.performClick();
            TextInputLayout.this.Q.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            TextInputLayout.this.f25884c.requestLayout();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f25906n0.O(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        private final TextInputLayout f25927d;

        public e(TextInputLayout textInputLayout) {
            this.f25927d = textInputLayout;
        }

        public void g(View view, androidx.core.view.accessibility.c cVar) {
            super.g(view, cVar);
            EditText editText = this.f25927d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f25927d.getHint();
            CharSequence error = this.f25927d.getError();
            CharSequence counterOverflowDescription = this.f25927d.getCounterOverflowDescription();
            boolean z10 = !TextUtils.isEmpty(text);
            boolean z11 = !TextUtils.isEmpty(hint);
            boolean z12 = !TextUtils.isEmpty(error);
            boolean z13 = false;
            boolean z14 = z12 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z10) {
                cVar.s0(text);
            } else if (z11) {
                cVar.s0(hint);
            }
            if (z11) {
                cVar.i0(hint);
                if (!z10 && z11) {
                    z13 = true;
                }
                cVar.p0(z13);
            }
            if (z14) {
                if (!z12) {
                    error = counterOverflowDescription;
                }
                cVar.e0(error);
                cVar.c0(true);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    static class h extends e0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        CharSequence f25928c;

        /* renamed from: d  reason: collision with root package name */
        boolean f25929d;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f25928c + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f25928c, parcel, i10);
            parcel.writeInt(this.f25929d ? 1 : 0);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f25928c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f25929d = parcel.readInt() != 1 ? false : true;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5.b.textInputStyle);
    }

    private void A(Canvas canvas) {
        if (this.f25907o) {
            this.f25906n0.i(canvas);
        }
    }

    private void B(boolean z10) {
        ValueAnimator valueAnimator = this.f25910p0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f25910p0.cancel();
        }
        if (!z10 || !this.f25908o0) {
            this.f25906n0.O(0.0f);
        } else {
            e(0.0f);
        }
        if (w() && ((c) this.f25913r).f0()) {
            u();
        }
        this.f25904m0 = true;
    }

    private boolean C() {
        return this.O != 0;
    }

    private boolean D() {
        return getStartIconDrawable() != null;
    }

    private boolean H() {
        if (this.f25918v != 1 || (Build.VERSION.SDK_INT >= 16 && this.f25884c.getMinLines() > 1)) {
            return false;
        }
        return true;
    }

    private void J() {
        l();
        M();
        e0();
        if (this.f25918v != 0) {
            b0();
        }
    }

    private void K() {
        if (w()) {
            RectF rectF = this.E;
            this.f25906n0.k(rectF);
            h(rectF);
            rectF.offset((float) (-getPaddingLeft()), 0.0f);
            ((c) this.f25913r).l0(rectF);
        }
    }

    private static void L(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                L((ViewGroup) childAt, z10);
            }
        }
    }

    private void M() {
        if (R()) {
            a0.r0(this.f25884c, this.f25913r);
        }
    }

    private static void N(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean M2 = a0.M(checkableImageButton);
        boolean z10 = false;
        int i10 = 1;
        boolean z11 = onLongClickListener != null;
        if (M2 || z11) {
            z10 = true;
        }
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(M2);
        checkableImageButton.setPressable(M2);
        checkableImageButton.setLongClickable(z11);
        if (!z10) {
            i10 = 2;
        }
        a0.x0(checkableImageButton, i10);
    }

    private static void O(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        N(checkableImageButton, onLongClickListener);
    }

    private static void P(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        N(checkableImageButton, onLongClickListener);
    }

    private boolean R() {
        EditText editText = this.f25884c;
        return (editText == null || this.f25913r == null || editText.getBackground() != null || this.f25918v == 0) ? false : true;
    }

    private void S(boolean z10) {
        if (!z10 || getEndIconDrawable() == null) {
            i();
            return;
        }
        Drawable mutate = androidx.core.graphics.drawable.a.r(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.a.n(mutate, this.f25889f.n());
        this.Q.setImageDrawable(mutate);
    }

    private void T(Rect rect) {
        n6.g gVar = this.f25915s;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.f25922z, rect.right, i10);
        }
    }

    private void U() {
        if (this.f25897j != null) {
            EditText editText = this.f25884c;
            V(editText == null ? 0 : editText.getText().length());
        }
    }

    private static void W(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? i.character_counter_overflowed_content_description : i.character_counter_content_description, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}));
    }

    private void X() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f25897j;
        if (textView != null) {
            Q(textView, this.f25895i ? this.f25899k : this.f25901l);
            if (!this.f25895i && (colorStateList2 = this.f25903m) != null) {
                this.f25897j.setTextColor(colorStateList2);
            }
            if (this.f25895i && (colorStateList = this.f25905n) != null) {
                this.f25897j.setTextColor(colorStateList);
            }
        }
    }

    private boolean Z() {
        int max;
        if (this.f25884c == null || this.f25884c.getMeasuredHeight() >= (max = Math.max(this.Q.getMeasuredHeight(), this.G.getMeasuredHeight()))) {
            return false;
        }
        this.f25884c.setMinimumHeight(max);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f25884c
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.D()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0060
            boolean r0 = r10.I()
            if (r0 == 0) goto L_0x0060
            com.google.android.material.internal.CheckableImageButton r0 = r10.G
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0060
            android.graphics.drawable.Drawable r0 = r10.L
            if (r0 != 0) goto L_0x0048
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r10.L = r0
            com.google.android.material.internal.CheckableImageButton r0 = r10.G
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f25884c
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.G
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = androidx.core.view.h.a(r6)
            int r0 = r0 + r6
            android.graphics.drawable.Drawable r6 = r10.L
            r6.setBounds(r1, r1, r0, r5)
        L_0x0048:
            android.widget.EditText r0 = r10.f25884c
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.i.a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.L
            if (r6 == r7) goto L_0x0079
            android.widget.EditText r6 = r10.f25884c
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.i.i(r6, r7, r8, r9, r0)
            goto L_0x0077
        L_0x0060:
            android.graphics.drawable.Drawable r0 = r10.L
            if (r0 == 0) goto L_0x0079
            android.widget.EditText r0 = r10.f25884c
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.i.a(r0)
            android.widget.EditText r6 = r10.f25884c
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.i.i(r6, r2, r7, r8, r0)
            r10.L = r2
        L_0x0077:
            r0 = 1
            goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x00ca
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L_0x00ca
            android.graphics.drawable.Drawable r2 = r10.W
            if (r2 != 0) goto L_0x00ac
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>()
            r10.W = r2
            int r2 = r6.getMeasuredWidth()
            android.widget.EditText r7 = r10.f25884c
            int r7 = r7.getPaddingRight()
            int r2 = r2 - r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = androidx.core.view.h.b(r6)
            int r2 = r2 + r6
            android.graphics.drawable.Drawable r6 = r10.W
            r6.setBounds(r1, r1, r2, r5)
        L_0x00ac:
            android.widget.EditText r2 = r10.f25884c
            android.graphics.drawable.Drawable[] r2 = androidx.core.widget.i.a(r2)
            r6 = r2[r4]
            android.graphics.drawable.Drawable r7 = r10.W
            if (r6 == r7) goto L_0x00c8
            r0 = r2[r4]
            r10.f25881a0 = r0
            android.widget.EditText r0 = r10.f25884c
            r1 = r2[r1]
            r4 = r2[r5]
            r2 = r2[r3]
            androidx.core.widget.i.i(r0, r1, r4, r7, r2)
            goto L_0x00eb
        L_0x00c8:
            r5 = r0
            goto L_0x00eb
        L_0x00ca:
            android.graphics.drawable.Drawable r6 = r10.W
            if (r6 == 0) goto L_0x00ec
            android.widget.EditText r6 = r10.f25884c
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.i.a(r6)
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.W
            if (r4 != r7) goto L_0x00e8
            android.widget.EditText r0 = r10.f25884c
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f25881a0
            r3 = r6[r3]
            androidx.core.widget.i.i(r0, r1, r4, r7, r3)
            goto L_0x00e9
        L_0x00e8:
            r5 = r0
        L_0x00e9:
            r10.W = r2
        L_0x00eb:
            r0 = r5
        L_0x00ec:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.a0():boolean");
    }

    private void b0() {
        if (this.f25918v != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f25880a.getLayoutParams();
            int r10 = r();
            if (r10 != layoutParams.topMargin) {
                layoutParams.topMargin = r10;
                this.f25880a.requestLayout();
            }
        }
    }

    private void d0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f25884c;
        boolean z12 = true;
        boolean z13 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f25884c;
        if (editText2 == null || !editText2.hasFocus()) {
            z12 = false;
        }
        boolean k10 = this.f25889f.k();
        ColorStateList colorStateList2 = this.f25887d0;
        if (colorStateList2 != null) {
            this.f25906n0.E(colorStateList2);
            this.f25906n0.K(this.f25887d0);
        }
        if (!isEnabled) {
            this.f25906n0.E(ColorStateList.valueOf(this.f25902l0));
            this.f25906n0.K(ColorStateList.valueOf(this.f25902l0));
        } else if (k10) {
            this.f25906n0.E(this.f25889f.o());
        } else if (this.f25895i && (textView = this.f25897j) != null) {
            this.f25906n0.E(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f25888e0) != null) {
            this.f25906n0.E(colorStateList);
        }
        if (z13 || (isEnabled() && (z12 || k10))) {
            if (z11 || this.f25904m0) {
                v(z10);
            }
        } else if (z11 || !this.f25904m0) {
            B(z10);
        }
    }

    private void f() {
        n6.g gVar = this.f25913r;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(this.f25916t);
            if (s()) {
                this.f25913r.Y((float) this.f25920x, this.A);
            }
            int m10 = m();
            this.B = m10;
            this.f25913r.T(ColorStateList.valueOf(m10));
            if (this.O == 3) {
                this.f25884c.getBackground().invalidateSelf();
            }
            g();
            invalidate();
        }
    }

    private void g() {
        if (this.f25915s != null) {
            if (t()) {
                this.f25915s.T(ColorStateList.valueOf(this.A));
            }
            invalidate();
        }
    }

    private e getEndIconDelegate() {
        e eVar = this.P.get(this.O);
        return eVar != null ? eVar : this.P.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f25883b0.getVisibility() == 0) {
            return this.f25883b0;
        }
        if (!C() || !E()) {
            return null;
        }
        return this.Q;
    }

    private void h(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f25917u;
        rectF.left = f10 - ((float) i10);
        rectF.top -= (float) i10;
        rectF.right += (float) i10;
        rectF.bottom += (float) i10;
    }

    private void i() {
        j(this.Q, this.T, this.S, this.V, this.U);
    }

    private void j(CheckableImageButton checkableImageButton, boolean z10, ColorStateList colorStateList, boolean z11, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z10 || z11)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (z10) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            }
            if (z11) {
                androidx.core.graphics.drawable.a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void k() {
        j(this.G, this.I, this.H, this.K, this.J);
    }

    private void l() {
        int i10 = this.f25918v;
        if (i10 == 0) {
            this.f25913r = null;
            this.f25915s = null;
        } else if (i10 == 1) {
            this.f25913r = new n6.g(this.f25916t);
            this.f25915s = new n6.g();
        } else if (i10 == 2) {
            if (!this.f25907o || (this.f25913r instanceof c)) {
                this.f25913r = new n6.g(this.f25916t);
            } else {
                this.f25913r = new c(this.f25916t);
            }
            this.f25915s = null;
        } else {
            throw new IllegalArgumentException(this.f25918v + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    private int m() {
        return this.f25918v == 1 ? d6.a.e(d6.a.d(this, x5.b.colorSurface, 0), this.B) : this.B;
    }

    private Rect n(Rect rect) {
        EditText editText = this.f25884c;
        if (editText != null) {
            Rect rect2 = this.D;
            rect2.bottom = rect.bottom;
            int i10 = this.f25918v;
            if (i10 == 1) {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                rect2.top = rect.top + this.f25919w;
                rect2.right = rect.right - this.f25884c.getCompoundPaddingRight();
                return rect2;
            } else if (i10 != 2) {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                rect2.top = getPaddingTop();
                rect2.right = rect.right - this.f25884c.getCompoundPaddingRight();
                return rect2;
            } else {
                rect2.left = rect.left + editText.getPaddingLeft();
                rect2.top = rect.top - r();
                rect2.right = rect.right - this.f25884c.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    private int o(Rect rect, Rect rect2, float f10) {
        if (this.f25918v == 1) {
            return (int) (((float) rect2.top) + f10);
        }
        return rect.bottom - this.f25884c.getCompoundPaddingBottom();
    }

    private int p(Rect rect, float f10) {
        if (H()) {
            return (int) (((float) rect.centerY()) - (f10 / 2.0f));
        }
        return rect.top + this.f25884c.getCompoundPaddingTop();
    }

    private Rect q(Rect rect) {
        if (this.f25884c != null) {
            Rect rect2 = this.D;
            float q10 = this.f25906n0.q();
            rect2.left = rect.left + this.f25884c.getCompoundPaddingLeft();
            rect2.top = p(rect, q10);
            rect2.right = rect.right - this.f25884c.getCompoundPaddingRight();
            rect2.bottom = o(rect, rect2, q10);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int r() {
        float m10;
        if (!this.f25907o) {
            return 0;
        }
        int i10 = this.f25918v;
        if (i10 == 0 || i10 == 1) {
            m10 = this.f25906n0.m();
        } else if (i10 != 2) {
            return 0;
        } else {
            m10 = this.f25906n0.m() / 2.0f;
        }
        return (int) m10;
    }

    private boolean s() {
        return this.f25918v == 2 && t();
    }

    private void setEditText(EditText editText) {
        if (this.f25884c == null) {
            if (this.O != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f25884c = editText;
            J();
            setTextInputAccessibilityDelegate(new e(this));
            this.f25906n0.U(this.f25884c.getTypeface());
            this.f25906n0.M(this.f25884c.getTextSize());
            int gravity = this.f25884c.getGravity();
            this.f25906n0.F((gravity & -113) | 48);
            this.f25906n0.L(gravity);
            this.f25884c.addTextChangedListener(new a());
            if (this.f25887d0 == null) {
                this.f25887d0 = this.f25884c.getHintTextColors();
            }
            if (this.f25907o) {
                if (TextUtils.isEmpty(this.f25909p)) {
                    CharSequence hint = this.f25884c.getHint();
                    this.f25886d = hint;
                    setHint(hint);
                    this.f25884c.setHint((CharSequence) null);
                }
                this.f25911q = true;
            }
            if (this.f25897j != null) {
                V(this.f25884c.getText().length());
            }
            Y();
            this.f25889f.e();
            this.G.bringToFront();
            this.f25882b.bringToFront();
            this.f25883b0.bringToFront();
            x();
            d0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z10) {
        int i10 = 0;
        this.f25883b0.setVisibility(z10 ? 0 : 8);
        FrameLayout frameLayout = this.f25882b;
        if (z10) {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        if (!C()) {
            a0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f25909p)) {
            this.f25909p = charSequence;
            this.f25906n0.S(charSequence);
            if (!this.f25904m0) {
                K();
            }
        }
    }

    private boolean t() {
        return this.f25920x > -1 && this.A != 0;
    }

    private void u() {
        if (w()) {
            ((c) this.f25913r).i0();
        }
    }

    private void v(boolean z10) {
        ValueAnimator valueAnimator = this.f25910p0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f25910p0.cancel();
        }
        if (!z10 || !this.f25908o0) {
            this.f25906n0.O(1.0f);
        } else {
            e(1.0f);
        }
        this.f25904m0 = false;
        if (w()) {
            K();
        }
    }

    private boolean w() {
        return this.f25907o && !TextUtils.isEmpty(this.f25909p) && (this.f25913r instanceof c);
    }

    private void x() {
        Iterator it = this.N.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    private void y(int i10) {
        Iterator it = this.R.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this, i10);
        }
    }

    private void z(Canvas canvas) {
        n6.g gVar = this.f25915s;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.f25920x;
            this.f25915s.draw(canvas);
        }
    }

    public boolean E() {
        return this.f25882b.getVisibility() == 0 && this.Q.getVisibility() == 0;
    }

    public boolean F() {
        return this.f25889f.w();
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return this.f25911q;
    }

    public boolean I() {
        return this.G.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    public void Q(TextView textView, int i10) {
        boolean z10 = true;
        try {
            androidx.core.widget.i.n(textView, i10);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            androidx.core.widget.i.n(textView, j.f30863a);
            textView.setTextColor(androidx.core.content.a.getColor(getContext(), x5.c.design_error));
        }
    }

    /* access modifiers changed from: package-private */
    public void V(int i10) {
        boolean z10 = this.f25895i;
        if (this.f25893h == -1) {
            this.f25897j.setText(String.valueOf(i10));
            this.f25897j.setContentDescription((CharSequence) null);
            this.f25895i = false;
        } else {
            if (a0.o(this.f25897j) == 1) {
                a0.p0(this.f25897j, 0);
            }
            this.f25895i = i10 > this.f25893h;
            W(getContext(), this.f25897j, i10, this.f25893h, this.f25895i);
            if (z10 != this.f25895i) {
                X();
                if (this.f25895i) {
                    a0.p0(this.f25897j, 1);
                }
            }
            this.f25897j.setText(getContext().getString(i.character_counter_pattern, new Object[]{Integer.valueOf(i10), Integer.valueOf(this.f25893h)}));
        }
        if (this.f25884c != null && z10 != this.f25895i) {
            c0(false);
            e0();
            Y();
        }
    }

    /* access modifiers changed from: package-private */
    public void Y() {
        Drawable background;
        TextView textView;
        EditText editText = this.f25884c;
        if (editText != null && this.f25918v == 0 && (background = editText.getBackground()) != null) {
            if (h0.a(background)) {
                background = background.mutate();
            }
            if (this.f25889f.k()) {
                background.setColorFilter(androidx.appcompat.widget.j.e(this.f25889f.n(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f25895i || (textView = this.f25897j) == null) {
                androidx.core.graphics.drawable.a.c(background);
                this.f25884c.refreshDrawableState();
            } else {
                background.setColorFilter(androidx.appcompat.widget.j.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f25880a.addView(view, layoutParams2);
            this.f25880a.setLayoutParams(layoutParams);
            b0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    public void c(f fVar) {
        this.N.add(fVar);
        if (this.f25884c != null) {
            fVar.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void c0(boolean z10) {
        d0(z10, false);
    }

    public void d(g gVar) {
        this.R.add(gVar);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText;
        if (this.f25886d == null || (editText = this.f25884c) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        boolean z10 = this.f25911q;
        this.f25911q = false;
        CharSequence hint = editText.getHint();
        this.f25884c.setHint(this.f25886d);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
        } finally {
            this.f25884c.setHint(hint);
            this.f25911q = z10;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f25914r0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f25914r0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        A(canvas);
        z(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f25912q0) {
            boolean z10 = true;
            this.f25912q0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            com.google.android.material.internal.a aVar = this.f25906n0;
            boolean R2 = aVar != null ? aVar.R(drawableState) | false : false;
            if (!a0.R(this) || !isEnabled()) {
                z10 = false;
            }
            c0(z10);
            Y();
            e0();
            if (R2) {
                invalidate();
            }
            this.f25912q0 = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void e(float f10) {
        if (this.f25906n0.r() != f10) {
            if (this.f25910p0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f25910p0 = valueAnimator;
                valueAnimator.setInterpolator(y5.a.f31292b);
                this.f25910p0.setDuration(167);
                this.f25910p0.addUpdateListener(new d());
            }
            this.f25910p0.setFloatValues(new float[]{this.f25906n0.r(), f10});
            this.f25910p0.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r5.f25884c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e0() {
        /*
            r5 = this;
            n6.g r0 = r5.f25913r
            if (r0 == 0) goto L_0x00d3
            int r0 = r5.f25918v
            if (r0 != 0) goto L_0x000a
            goto L_0x00d3
        L_0x000a:
            boolean r0 = r5.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r5.f25884c
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r5.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r5.f25884c
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r5.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r5.f25902l0
            r5.A = r4
            goto L_0x0071
        L_0x003f:
            com.google.android.material.textfield.f r4 = r5.f25889f
            boolean r4 = r4.k()
            if (r4 == 0) goto L_0x0050
            com.google.android.material.textfield.f r4 = r5.f25889f
            int r4 = r4.n()
            r5.A = r4
            goto L_0x0071
        L_0x0050:
            boolean r4 = r5.f25895i
            if (r4 == 0) goto L_0x005f
            android.widget.TextView r4 = r5.f25897j
            if (r4 == 0) goto L_0x005f
            int r4 = r4.getCurrentTextColor()
            r5.A = r4
            goto L_0x0071
        L_0x005f:
            if (r0 == 0) goto L_0x0066
            int r4 = r5.f25894h0
            r5.A = r4
            goto L_0x0071
        L_0x0066:
            if (r3 == 0) goto L_0x006d
            int r4 = r5.f25892g0
            r5.A = r4
            goto L_0x0071
        L_0x006d:
            int r4 = r5.f25890f0
            r5.A = r4
        L_0x0071:
            com.google.android.material.textfield.f r4 = r5.f25889f
            boolean r4 = r4.k()
            if (r4 == 0) goto L_0x0085
            com.google.android.material.textfield.e r4 = r5.getEndIconDelegate()
            boolean r4 = r4.c()
            if (r4 == 0) goto L_0x0085
            r4 = 1
            goto L_0x0086
        L_0x0085:
            r4 = 0
        L_0x0086:
            r5.S(r4)
            android.graphics.drawable.Drawable r4 = r5.getErrorIconDrawable()
            if (r4 == 0) goto L_0x00a0
            com.google.android.material.textfield.f r4 = r5.f25889f
            boolean r4 = r4.v()
            if (r4 == 0) goto L_0x00a0
            com.google.android.material.textfield.f r4 = r5.f25889f
            boolean r4 = r4.k()
            if (r4 == 0) goto L_0x00a0
            r1 = 1
        L_0x00a0:
            r5.setErrorIconVisible(r1)
            if (r3 != 0) goto L_0x00a7
            if (r0 == 0) goto L_0x00b2
        L_0x00a7:
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto L_0x00b2
            int r0 = r5.f25922z
            r5.f25920x = r0
            goto L_0x00b6
        L_0x00b2:
            int r0 = r5.f25921y
            r5.f25920x = r0
        L_0x00b6:
            int r0 = r5.f25918v
            if (r0 != r2) goto L_0x00d0
            boolean r0 = r5.isEnabled()
            if (r0 != 0) goto L_0x00c5
            int r0 = r5.f25898j0
            r5.B = r0
            goto L_0x00d0
        L_0x00c5:
            if (r3 == 0) goto L_0x00cc
            int r0 = r5.f25900k0
            r5.B = r0
            goto L_0x00d0
        L_0x00cc:
            int r0 = r5.f25896i0
            r5.B = r0
        L_0x00d0:
            r5.f()
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e0():void");
    }

    public int getBaseline() {
        EditText editText = this.f25884c;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + r();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public n6.g getBoxBackground() {
        int i10 = this.f25918v;
        if (i10 == 1 || i10 == 2) {
            return this.f25913r;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.B;
    }

    public int getBoxBackgroundMode() {
        return this.f25918v;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f25913r.r();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f25913r.s();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f25913r.F();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f25913r.E();
    }

    public int getBoxStrokeColor() {
        return this.f25894h0;
    }

    public int getCounterMaxLength() {
        return this.f25893h;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f25891g || !this.f25895i || (textView = this.f25897j) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f25903m;
    }

    public ColorStateList getCounterTextColor() {
        return this.f25903m;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f25887d0;
    }

    public EditText getEditText() {
        return this.f25884c;
    }

    public CharSequence getEndIconContentDescription() {
        return this.Q.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.Q.getDrawable();
    }

    public int getEndIconMode() {
        return this.O;
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.Q;
    }

    public CharSequence getError() {
        if (this.f25889f.v()) {
            return this.f25889f.m();
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f25889f.n();
    }

    public Drawable getErrorIconDrawable() {
        return this.f25883b0.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.f25889f.n();
    }

    public CharSequence getHelperText() {
        if (this.f25889f.w()) {
            return this.f25889f.p();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f25889f.q();
    }

    public CharSequence getHint() {
        if (this.f25907o) {
            return this.f25909p;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f25906n0.m();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f25906n0.n();
    }

    public ColorStateList getHintTextColor() {
        return this.f25888e0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.Q.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.Q.getDrawable();
    }

    public CharSequence getStartIconContentDescription() {
        return this.G.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.G.getDrawable();
    }

    public Typeface getTypeface() {
        return this.F;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f25884c;
        if (editText != null) {
            Rect rect = this.C;
            com.google.android.material.internal.b.a(this, editText, rect);
            T(rect);
            if (this.f25907o) {
                this.f25906n0.C(n(rect));
                this.f25906n0.J(q(rect));
                this.f25906n0.z();
                if (w() && !this.f25904m0) {
                    K();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean Z = Z();
        boolean a02 = a0();
        if (Z || a02) {
            this.f25884c.post(new c());
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.c());
        setError(hVar.f25928c);
        if (hVar.f25929d) {
            this.Q.post(new b());
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f25889f.k()) {
            hVar.f25928c = getError();
        }
        hVar.f25929d = C() && this.Q.isChecked();
        return hVar;
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.B != i10) {
            this.B = i10;
            this.f25896i0 = i10;
            f();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(androidx.core.content.a.getColor(getContext(), i10));
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 != this.f25918v) {
            this.f25918v = i10;
            if (this.f25884c != null) {
                J();
            }
        }
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f25894h0 != i10) {
            this.f25894h0 = i10;
            e0();
        }
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f25891g != z10) {
            if (z10) {
                c0 c0Var = new c0(getContext());
                this.f25897j = c0Var;
                c0Var.setId(x5.f.textinput_counter);
                Typeface typeface = this.F;
                if (typeface != null) {
                    this.f25897j.setTypeface(typeface);
                }
                this.f25897j.setMaxLines(1);
                this.f25889f.d(this.f25897j, 2);
                X();
                U();
            } else {
                this.f25889f.x(this.f25897j, 2);
                this.f25897j = null;
            }
            this.f25891g = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f25893h != i10) {
            if (i10 > 0) {
                this.f25893h = i10;
            } else {
                this.f25893h = -1;
            }
            if (this.f25891g) {
                U();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f25899k != i10) {
            this.f25899k = i10;
            X();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f25905n != colorStateList) {
            this.f25905n = colorStateList;
            X();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f25901l != i10) {
            this.f25901l = i10;
            X();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f25903m != colorStateList) {
            this.f25903m = colorStateList;
            X();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f25887d0 = colorStateList;
        this.f25888e0 = colorStateList;
        if (this.f25884c != null) {
            c0(false);
        }
    }

    public void setEnabled(boolean z10) {
        L(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.Q.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.Q.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    public void setEndIconMode(int i10) {
        int i11 = this.O;
        this.O = i10;
        setEndIconVisible(i10 != 0);
        if (getEndIconDelegate().b(this.f25918v)) {
            getEndIconDelegate().a();
            i();
            y(i11);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f25918v + " is not supported by the end icon mode " + i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        O(this.Q, onClickListener, this.f25885c0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f25885c0 = onLongClickListener;
        P(this.Q, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            this.T = true;
            i();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.U != mode) {
            this.U = mode;
            this.V = true;
            i();
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (E() != z10) {
            this.Q.setVisibility(z10 ? 0 : 4);
            a0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f25889f.v()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f25889f.J(charSequence);
        } else {
            this.f25889f.r();
        }
    }

    public void setErrorEnabled(boolean z10) {
        this.f25889f.z(z10);
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f25883b0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
        if (this.f25883b0.getDrawable() != drawable) {
            this.f25883b0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f25883b0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.p(drawable, mode);
        }
        if (this.f25883b0.getDrawable() != drawable) {
            this.f25883b0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i10) {
        this.f25889f.A(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f25889f.B(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!F()) {
                setHelperTextEnabled(true);
            }
            this.f25889f.K(charSequence);
        } else if (F()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f25889f.E(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f25889f.D(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f25889f.C(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f25907o) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f25908o0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f25907o) {
            this.f25907o = z10;
            if (!z10) {
                this.f25911q = false;
                if (!TextUtils.isEmpty(this.f25909p) && TextUtils.isEmpty(this.f25884c.getHint())) {
                    this.f25884c.setHint(this.f25909p);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f25884c.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f25909p)) {
                        setHint(hint);
                    }
                    this.f25884c.setHint((CharSequence) null);
                }
                this.f25911q = true;
            }
            if (this.f25884c != null) {
                b0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f25906n0.D(i10);
        this.f25888e0 = this.f25906n0.l();
        if (this.f25884c != null) {
            c0(false);
            b0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f25888e0 != colorStateList) {
            if (this.f25887d0 == null) {
                this.f25906n0.E(colorStateList);
            }
            this.f25888e0 = colorStateList;
            if (this.f25884c != null) {
                c0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.O != 1) {
            setEndIconMode(1);
        } else if (!z10) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.S = colorStateList;
        this.T = true;
        i();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.U = mode;
        this.V = true;
        i();
    }

    public void setStartIconCheckable(boolean z10) {
        this.G.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        O(this.G, onClickListener, this.M);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.M = onLongClickListener;
        P(this.G, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            this.I = true;
            k();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.J != mode) {
            this.J = mode;
            this.K = true;
            k();
        }
    }

    public void setStartIconVisible(boolean z10) {
        if (I() != z10) {
            this.G.setVisibility(z10 ? 0 : 8);
            a0();
        }
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f25884c;
        if (editText != null) {
            a0.n0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.F) {
            this.F = typeface;
            this.f25906n0.U(typeface);
            this.f25889f.G(typeface);
            TextView textView = this.f25897j;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r7 = r21
            r8 = r22
            int r9 = f25879s0
            r1 = r20
            android.content.Context r1 = com.google.android.material.internal.g.f(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            com.google.android.material.textfield.f r1 = new com.google.android.material.textfield.f
            r1.<init>(r0)
            r0.f25889f = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.C = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.D = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.E = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.N = r1
            r10 = 0
            r0.O = r10
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            r0.P = r11
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.R = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.f25906n0 = r1
            android.content.Context r12 = r19.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r10)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r12)
            r0.f25880a = r14
            r14.setAddStatesFromChildren(r13)
            r0.addView(r14)
            android.widget.FrameLayout r15 = new android.widget.FrameLayout
            r15.<init>(r12)
            r0.f25882b = r15
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r4 = 8388629(0x800015, float:1.1754973E-38)
            r2.<init>(r3, r3, r4)
            r15.setLayoutParams(r2)
            r14.addView(r15)
            android.animation.TimeInterpolator r2 = y5.a.f31291a
            r1.T(r2)
            r1.Q(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.F(r2)
            int[] r3 = x5.k.f30946n3
            r1 = 5
            int[] r6 = new int[r1]
            int r5 = x5.k.E3
            r6[r10] = r5
            int r4 = x5.k.C3
            r6[r13] = r4
            int r2 = x5.k.Q3
            r1 = 2
            r6[r1] = r2
            int r10 = x5.k.U3
            r13 = 3
            r6[r13] = r10
            int r13 = x5.k.Y3
            r16 = 4
            r6[r16] = r13
            r16 = r11
            r11 = 2
            r1 = r12
            r11 = r2
            r2 = r21
            r17 = r15
            r15 = r4
            r4 = r22
            r18 = r15
            r15 = r5
            r5 = r9
            androidx.appcompat.widget.z0 r1 = com.google.android.material.internal.g.l(r1, r2, r3, r4, r5, r6)
            int r2 = x5.k.X3
            r3 = 1
            boolean r2 = r1.a(r2, r3)
            r0.f25907o = r2
            int r2 = x5.k.f30958p3
            java.lang.CharSequence r2 = r1.p(r2)
            r0.setHint(r2)
            int r2 = x5.k.W3
            boolean r2 = r1.a(r2, r3)
            r0.f25908o0 = r2
            n6.k$b r2 = n6.k.e(r12, r7, r8, r9)
            n6.k r2 = r2.m()
            r0.f25916t = r2
            android.content.res.Resources r2 = r12.getResources()
            int r3 = x5.d.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.f25917u = r2
            int r2 = x5.k.f30976s3
            r3 = 0
            int r2 = r1.e(r2, r3)
            r0.f25919w = r2
            int r2 = x5.k.f31007y3
            android.content.res.Resources r3 = r12.getResources()
            int r4 = x5.d.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.f(r2, r3)
            r0.f25921y = r2
            int r3 = x5.k.f31012z3
            android.content.res.Resources r4 = r12.getResources()
            int r5 = x5.d.mtrl_textinput_box_stroke_width_focused
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.f(r3, r4)
            r0.f25922z = r3
            r0.f25920x = r2
            int r2 = x5.k.f30997w3
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.d(r2, r3)
            int r4 = x5.k.f30992v3
            float r4 = r1.d(r4, r3)
            int r5 = x5.k.f30982t3
            float r5 = r1.d(r5, r3)
            int r6 = x5.k.f30987u3
            float r3 = r1.d(r6, r3)
            n6.k r6 = r0.f25916t
            n6.k$b r6 = r6.v()
            r7 = 0
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x0143
            r6.z(r2)
        L_0x0143:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x014a
            r6.D(r4)
        L_0x014a:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0151
            r6.v(r5)
        L_0x0151:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0158
            r6.r(r3)
        L_0x0158:
            n6.k r2 = r6.m()
            r0.f25916t = r2
            int r2 = x5.k.f30964q3
            android.content.res.ColorStateList r2 = k6.c.b(r12, r1, r2)
            r3 = 16843623(0x1010367, float:2.3696E-38)
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r5 = -1
            if (r2 == 0) goto L_0x01af
            int r6 = r2.getDefaultColor()
            r0.f25896i0 = r6
            r0.B = r6
            boolean r6 = r2.isStateful()
            if (r6 == 0) goto L_0x0192
            r6 = 1
            int[] r7 = new int[r6]
            r8 = 0
            r7[r8] = r4
            int r7 = r2.getColorForState(r7, r5)
            r0.f25898j0 = r7
            int[] r7 = new int[r6]
            r7[r8] = r3
            int r2 = r2.getColorForState(r7, r5)
            r0.f25900k0 = r2
            goto L_0x01b8
        L_0x0192:
            r6 = 1
            r8 = 0
            int r2 = x5.c.mtrl_filled_background_color
            android.content.res.ColorStateList r2 = i.a.a(r12, r2)
            int[] r7 = new int[r6]
            r7[r8] = r4
            int r7 = r2.getColorForState(r7, r5)
            r0.f25898j0 = r7
            int[] r7 = new int[r6]
            r7[r8] = r3
            int r2 = r2.getColorForState(r7, r5)
            r0.f25900k0 = r2
            goto L_0x01b8
        L_0x01af:
            r8 = 0
            r0.B = r8
            r0.f25896i0 = r8
            r0.f25898j0 = r8
            r0.f25900k0 = r8
        L_0x01b8:
            int r2 = x5.k.f30952o3
            boolean r6 = r1.s(r2)
            if (r6 == 0) goto L_0x01c8
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.f25888e0 = r2
            r0.f25887d0 = r2
        L_0x01c8:
            int r2 = x5.k.f31002x3
            android.content.res.ColorStateList r6 = k6.c.b(r12, r1, r2)
            if (r6 == 0) goto L_0x0200
            boolean r7 = r6.isStateful()
            if (r7 == 0) goto L_0x0200
            int r2 = r6.getDefaultColor()
            r0.f25890f0 = r2
            r2 = 1
            int[] r7 = new int[r2]
            r8 = 0
            r7[r8] = r4
            int r4 = r6.getColorForState(r7, r5)
            r0.f25902l0 = r4
            int[] r4 = new int[r2]
            r4[r8] = r3
            int r3 = r6.getColorForState(r4, r5)
            r0.f25892g0 = r3
            int[] r3 = new int[r2]
            r2 = 16842908(0x101009c, float:2.3693995E-38)
            r3[r8] = r2
            int r2 = r6.getColorForState(r3, r5)
            r0.f25894h0 = r2
            goto L_0x021f
        L_0x0200:
            r8 = 0
            int r2 = r1.b(r2, r8)
            r0.f25894h0 = r2
            int r2 = x5.c.mtrl_textinput_default_box_stroke_color
            int r2 = androidx.core.content.a.getColor(r12, r2)
            r0.f25890f0 = r2
            int r2 = x5.c.mtrl_textinput_disabled_color
            int r2 = androidx.core.content.a.getColor(r12, r2)
            r0.f25902l0 = r2
            int r2 = x5.c.mtrl_textinput_hovered_box_stroke_color
            int r2 = androidx.core.content.a.getColor(r12, r2)
            r0.f25892g0 = r2
        L_0x021f:
            int r2 = r1.n(r13, r5)
            if (r2 == r5) goto L_0x022e
            r2 = 0
            int r3 = r1.n(r13, r2)
            r0.setHintTextAppearance(r3)
            goto L_0x022f
        L_0x022e:
            r2 = 0
        L_0x022f:
            int r3 = r1.n(r11, r2)
            int r4 = x5.k.M3
            boolean r4 = r1.a(r4, r2)
            android.content.Context r6 = r19.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r7 = x5.h.design_text_input_end_icon
            android.view.View r6 = r6.inflate(r7, r14, r2)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.f25883b0 = r6
            r14.addView(r6)
            r2 = 8
            r6.setVisibility(r2)
            int r8 = x5.k.N3
            boolean r9 = r1.s(r8)
            if (r9 == 0) goto L_0x0262
            android.graphics.drawable.Drawable r8 = r1.g(r8)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r8)
        L_0x0262:
            int r8 = x5.k.O3
            boolean r9 = r1.s(r8)
            if (r9 == 0) goto L_0x0271
            android.content.res.ColorStateList r8 = k6.c.b(r12, r1, r8)
            r0.setErrorIconTintList(r8)
        L_0x0271:
            int r8 = x5.k.P3
            boolean r9 = r1.s(r8)
            r11 = 0
            if (r9 == 0) goto L_0x0285
            int r8 = r1.k(r8, r5)
            android.graphics.PorterDuff$Mode r8 = com.google.android.material.internal.h.c(r8, r11)
            r0.setErrorIconTintMode(r8)
        L_0x0285:
            android.content.res.Resources r8 = r19.getResources()
            int r9 = x5.i.error_icon_content_description
            java.lang.CharSequence r8 = r8.getText(r9)
            r6.setContentDescription(r8)
            r8 = 2
            androidx.core.view.a0.x0(r6, r8)
            r8 = 0
            r6.setClickable(r8)
            r6.setPressable(r8)
            r6.setFocusable(r8)
            int r6 = r1.n(r10, r8)
            int r9 = x5.k.T3
            boolean r9 = r1.a(r9, r8)
            int r10 = x5.k.S3
            java.lang.CharSequence r10 = r1.p(r10)
            int r13 = x5.k.A3
            boolean r13 = r1.a(r13, r8)
            int r11 = x5.k.B3
            int r11 = r1.k(r11, r5)
            r0.setCounterMaxLength(r11)
            int r11 = r1.n(r15, r8)
            r0.f25901l = r11
            r11 = r18
            int r11 = r1.n(r11, r8)
            r0.f25899k = r11
            android.content.Context r11 = r19.getContext()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)
            int r15 = x5.h.design_text_input_start_icon
            android.view.View r11 = r11.inflate(r15, r14, r8)
            com.google.android.material.internal.CheckableImageButton r11 = (com.google.android.material.internal.CheckableImageButton) r11
            r0.G = r11
            r14.addView(r11)
            r11.setVisibility(r2)
            r8 = 0
            r0.setStartIconOnClickListener(r8)
            r0.setStartIconOnLongClickListener(r8)
            int r8 = x5.k.f30911h4
            boolean r11 = r1.s(r8)
            if (r11 == 0) goto L_0x0314
            android.graphics.drawable.Drawable r8 = r1.g(r8)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r8)
            int r8 = x5.k.f30905g4
            boolean r11 = r1.s(r8)
            if (r11 == 0) goto L_0x030a
            java.lang.CharSequence r8 = r1.p(r8)
            r0.setStartIconContentDescription((java.lang.CharSequence) r8)
        L_0x030a:
            int r8 = x5.k.f30899f4
            r11 = 1
            boolean r8 = r1.a(r8, r11)
            r0.setStartIconCheckable(r8)
        L_0x0314:
            int r8 = x5.k.f30917i4
            boolean r11 = r1.s(r8)
            if (r11 == 0) goto L_0x0323
            android.content.res.ColorStateList r8 = k6.c.b(r12, r1, r8)
            r0.setStartIconTintList(r8)
        L_0x0323:
            int r8 = x5.k.f30923j4
            boolean r11 = r1.s(r8)
            if (r11 == 0) goto L_0x0337
            int r8 = r1.k(r8, r5)
            r11 = 0
            android.graphics.PorterDuff$Mode r8 = com.google.android.material.internal.h.c(r8, r11)
            r0.setStartIconTintMode(r8)
        L_0x0337:
            r0.setHelperTextEnabled(r9)
            r0.setHelperText(r10)
            r0.setHelperTextTextAppearance(r6)
            r0.setErrorEnabled(r4)
            r0.setErrorTextAppearance(r3)
            int r3 = r0.f25901l
            r0.setCounterTextAppearance(r3)
            int r3 = r0.f25899k
            r0.setCounterOverflowTextAppearance(r3)
            int r3 = x5.k.R3
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x035f
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setErrorTextColor(r3)
        L_0x035f:
            int r3 = x5.k.V3
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x036e
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setHelperTextColor(r3)
        L_0x036e:
            int r3 = x5.k.Z3
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x037d
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setHintTextColor(r3)
        L_0x037d:
            int r3 = x5.k.F3
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x038c
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setCounterTextColor(r3)
        L_0x038c:
            int r3 = x5.k.D3
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x039b
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setCounterOverflowTextColor(r3)
        L_0x039b:
            r0.setCounterEnabled(r13)
            int r3 = x5.k.f30970r3
            r4 = 0
            int r3 = r1.k(r3, r4)
            r0.setBoxBackgroundMode(r3)
            android.content.Context r3 = r19.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r6 = r17
            android.view.View r3 = r3.inflate(r7, r6, r4)
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            r0.Q = r3
            r6.addView(r3)
            r3.setVisibility(r2)
            com.google.android.material.textfield.b r2 = new com.google.android.material.textfield.b
            r2.<init>(r0)
            r3 = r16
            r3.append(r5, r2)
            com.google.android.material.textfield.g r2 = new com.google.android.material.textfield.g
            r2.<init>(r0)
            r3.append(r4, r2)
            com.google.android.material.textfield.h r2 = new com.google.android.material.textfield.h
            r2.<init>(r0)
            r4 = 1
            r3.append(r4, r2)
            com.google.android.material.textfield.a r2 = new com.google.android.material.textfield.a
            r2.<init>(r0)
            r4 = 2
            r3.append(r4, r2)
            com.google.android.material.textfield.d r2 = new com.google.android.material.textfield.d
            r2.<init>(r0)
            r4 = 3
            r3.append(r4, r2)
            int r2 = x5.k.J3
            boolean r3 = r1.s(r2)
            if (r3 == 0) goto L_0x0426
            r3 = 0
            int r2 = r1.k(r2, r3)
            r0.setEndIconMode(r2)
            int r2 = x5.k.I3
            boolean r3 = r1.s(r2)
            if (r3 == 0) goto L_0x040c
            android.graphics.drawable.Drawable r2 = r1.g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x040c:
            int r2 = x5.k.H3
            boolean r3 = r1.s(r2)
            if (r3 == 0) goto L_0x041b
            java.lang.CharSequence r2 = r1.p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x041b:
            int r2 = x5.k.G3
            r3 = 1
            boolean r2 = r1.a(r2, r3)
            r0.setEndIconCheckable(r2)
            goto L_0x046b
        L_0x0426:
            int r2 = x5.k.f30881c4
            boolean r3 = r1.s(r2)
            if (r3 == 0) goto L_0x046b
            r3 = 0
            boolean r2 = r1.a(r2, r3)
            r0.setEndIconMode(r2)
            int r2 = x5.k.f30875b4
            android.graphics.drawable.Drawable r2 = r1.g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
            int r2 = x5.k.f30869a4
            java.lang.CharSequence r2 = r1.p(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
            int r2 = x5.k.f30887d4
            boolean r3 = r1.s(r2)
            if (r3 == 0) goto L_0x0457
            android.content.res.ColorStateList r2 = k6.c.b(r12, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x0457:
            int r2 = x5.k.f30893e4
            boolean r3 = r1.s(r2)
            if (r3 == 0) goto L_0x046b
            int r2 = r1.k(r2, r5)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.h.c(r2, r3)
            r0.setEndIconTintMode(r2)
        L_0x046b:
            int r2 = x5.k.f30881c4
            boolean r2 = r1.s(r2)
            if (r2 != 0) goto L_0x0496
            int r2 = x5.k.K3
            boolean r3 = r1.s(r2)
            if (r3 == 0) goto L_0x0482
            android.content.res.ColorStateList r2 = k6.c.b(r12, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x0482:
            int r2 = x5.k.L3
            boolean r3 = r1.s(r2)
            if (r3 == 0) goto L_0x0496
            int r2 = r1.k(r2, r5)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.h.c(r2, r3)
            r0.setEndIconTintMode(r2)
        L_0x0496:
            r1.w()
            r1 = 2
            androidx.core.view.a0.x0(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.Q.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.Q.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f25883b0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f25889f.v());
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.G.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.G.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            k();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.Q.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.Q.setImageDrawable(drawable);
    }
}
