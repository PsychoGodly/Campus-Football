package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.a0;
import java.util.ArrayList;
import java.util.Iterator;
import n6.n;

/* compiled from: FloatingActionButtonImpl */
class a {
    static final TimeInterpolator E = y5.a.f31293c;
    static final int[] F = {16842919, 16842910};
    static final int[] G = {16843623, 16842908, 16842910};
    static final int[] H = {16842908, 16842910};
    static final int[] I = {16843623, 16842910};
    static final int[] J = {16842910};
    static final int[] K = new int[0];
    private final RectF A = new RectF();
    private final RectF B = new RectF();
    private final Matrix C = new Matrix();
    private ViewTreeObserver.OnPreDrawListener D;

    /* renamed from: a  reason: collision with root package name */
    n6.k f25744a;

    /* renamed from: b  reason: collision with root package name */
    n6.g f25745b;

    /* renamed from: c  reason: collision with root package name */
    Drawable f25746c;

    /* renamed from: d  reason: collision with root package name */
    Drawable f25747d;

    /* renamed from: e  reason: collision with root package name */
    boolean f25748e;

    /* renamed from: f  reason: collision with root package name */
    boolean f25749f = true;

    /* renamed from: g  reason: collision with root package name */
    float f25750g;

    /* renamed from: h  reason: collision with root package name */
    float f25751h;

    /* renamed from: i  reason: collision with root package name */
    float f25752i;

    /* renamed from: j  reason: collision with root package name */
    int f25753j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.android.material.internal.e f25754k;

    /* renamed from: l  reason: collision with root package name */
    private y5.h f25755l;

    /* renamed from: m  reason: collision with root package name */
    private y5.h f25756m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public Animator f25757n;

    /* renamed from: o  reason: collision with root package name */
    private y5.h f25758o;

    /* renamed from: p  reason: collision with root package name */
    private y5.h f25759p;

    /* renamed from: q  reason: collision with root package name */
    private float f25760q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public float f25761r = 1.0f;

    /* renamed from: s  reason: collision with root package name */
    private int f25762s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public int f25763t = 0;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f25764u;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f25765v;

    /* renamed from: w  reason: collision with root package name */
    private ArrayList<i> f25766w;

    /* renamed from: x  reason: collision with root package name */
    final FloatingActionButton f25767x;

    /* renamed from: y  reason: collision with root package name */
    final m6.b f25768y;

    /* renamed from: z  reason: collision with root package name */
    private final Rect f25769z = new Rect();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a  reason: collision with other inner class name */
    /* compiled from: FloatingActionButtonImpl */
    class C0274a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f25770a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f25771b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f25772c;

        C0274a(boolean z10, j jVar) {
            this.f25771b = z10;
            this.f25772c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f25770a = true;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = a.this.f25763t = 0;
            Animator unused2 = a.this.f25757n = null;
            if (!this.f25770a) {
                FloatingActionButton floatingActionButton = a.this.f25767x;
                boolean z10 = this.f25771b;
                floatingActionButton.b(z10 ? 8 : 4, z10);
                j jVar = this.f25772c;
                if (jVar != null) {
                    jVar.b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            a.this.f25767x.b(0, this.f25771b);
            int unused = a.this.f25763t = 1;
            Animator unused2 = a.this.f25757n = animator;
            this.f25770a = false;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f25774a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f25775b;

        b(boolean z10, j jVar) {
            this.f25774a = z10;
            this.f25775b = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = a.this.f25763t = 0;
            Animator unused2 = a.this.f25757n = null;
            j jVar = this.f25775b;
            if (jVar != null) {
                jVar.a();
            }
        }

        public void onAnimationStart(Animator animator) {
            a.this.f25767x.b(0, this.f25774a);
            int unused = a.this.f25763t = 2;
            Animator unused2 = a.this.f25757n = animator;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    class c extends y5.g {
        c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            float unused = a.this.f25761r = f10;
            return super.a(f10, matrix, matrix2);
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    class d implements TypeEvaluator<Float> {

        /* renamed from: a  reason: collision with root package name */
        FloatEvaluator f25778a = new FloatEvaluator();

        d() {
        }

        /* renamed from: a */
        public Float evaluate(float f10, Float f11, Float f12) {
            float floatValue = this.f25778a.evaluate(f10, f11, f12).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
        }

        public boolean onPreDraw() {
            a.this.F();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private class f extends l {
        f() {
            super(a.this, (C0274a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private class g extends l {
        g() {
            super(a.this, (C0274a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            a aVar = a.this;
            return aVar.f25750g + aVar.f25751h;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private class h extends l {
        h() {
            super(a.this, (C0274a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            a aVar = a.this;
            return aVar.f25750g + aVar.f25752i;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    interface i {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl */
    interface j {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl */
    private class k extends l {
        k() {
            super(a.this, (C0274a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            return a.this.f25750g;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f25785a;

        /* renamed from: b  reason: collision with root package name */
        private float f25786b;

        /* renamed from: c  reason: collision with root package name */
        private float f25787c;

        private l() {
        }

        /* access modifiers changed from: protected */
        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            a.this.c0((float) ((int) this.f25787c));
            this.f25785a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f25785a) {
                n6.g gVar = a.this.f25745b;
                this.f25786b = gVar == null ? 0.0f : gVar.v();
                this.f25787c = a();
                this.f25785a = true;
            }
            a aVar = a.this;
            float f10 = this.f25786b;
            aVar.c0((float) ((int) (f10 + ((this.f25787c - f10) * valueAnimator.getAnimatedFraction()))));
        }

        /* synthetic */ l(a aVar, C0274a aVar2) {
            this();
        }
    }

    a(FloatingActionButton floatingActionButton, m6.b bVar) {
        this.f25767x = floatingActionButton;
        this.f25768y = bVar;
        com.google.android.material.internal.e eVar = new com.google.android.material.internal.e();
        this.f25754k = eVar;
        eVar.a(F, i(new h()));
        eVar.a(G, i(new g()));
        eVar.a(H, i(new g()));
        eVar.a(I, i(new g()));
        eVar.a(J, i(new k()));
        eVar.a(K, i(new f()));
        this.f25760q = floatingActionButton.getRotation();
    }

    private boolean W() {
        return a0.R(this.f25767x) && !this.f25767x.isInEditMode();
    }

    private void d0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new d());
        }
    }

    private void g(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f25767x.getDrawable();
        if (drawable != null && this.f25762s != 0) {
            RectF rectF = this.A;
            RectF rectF2 = this.B;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i10 = this.f25762s;
            rectF2.set(0.0f, 0.0f, (float) i10, (float) i10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i11 = this.f25762s;
            matrix.postScale(f10, f10, ((float) i11) / 2.0f, ((float) i11) / 2.0f);
        }
    }

    private AnimatorSet h(y5.h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f25767x, View.ALPHA, new float[]{f10});
        hVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f25767x, View.SCALE_X, new float[]{f11});
        hVar.e("scale").a(ofFloat2);
        d0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f25767x, View.SCALE_Y, new float[]{f11});
        hVar.e("scale").a(ofFloat3);
        d0(ofFloat3);
        arrayList.add(ofFloat3);
        g(f12, this.C);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f25767x, new y5.f(), new c(), new Matrix[]{new Matrix(this.C)});
        hVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        y5.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private ValueAnimator i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(E);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    private y5.h k() {
        if (this.f25756m == null) {
            this.f25756m = y5.h.c(this.f25767x.getContext(), x5.a.design_fab_hide_motion_spec);
        }
        return (y5.h) androidx.core.util.h.f(this.f25756m);
    }

    private y5.h l() {
        if (this.f25755l == null) {
            this.f25755l = y5.h.c(this.f25767x.getContext(), x5.a.design_fab_show_motion_spec);
        }
        return (y5.h) androidx.core.util.h.f(this.f25755l);
    }

    private ViewTreeObserver.OnPreDrawListener q() {
        if (this.D == null) {
            this.D = new e();
        }
        return this.D;
    }

    /* access modifiers changed from: package-private */
    public void A() {
    }

    /* access modifiers changed from: package-private */
    public void B() {
        ViewTreeObserver viewTreeObserver = this.f25767x.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.D;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.D = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void C(int[] iArr) {
        this.f25754k.d(iArr);
    }

    /* access modifiers changed from: package-private */
    public void D(float f10, float f11, float f12) {
        b0();
        c0(f10);
    }

    /* access modifiers changed from: package-private */
    public void E(Rect rect) {
        androidx.core.util.h.g(this.f25747d, "Didn't initialize content background");
        if (V()) {
            this.f25768y.a(new InsetDrawable(this.f25747d, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f25768y.a(this.f25747d);
    }

    /* access modifiers changed from: package-private */
    public void F() {
        float rotation = this.f25767x.getRotation();
        if (this.f25760q != rotation) {
            this.f25760q = rotation;
            Z();
        }
    }

    /* access modifiers changed from: package-private */
    public void G() {
        ArrayList<i> arrayList = this.f25766w;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        ArrayList<i> arrayList = this.f25766w;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean I() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void J(ColorStateList colorStateList) {
        n6.g gVar = this.f25745b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void K(PorterDuff.Mode mode) {
        n6.g gVar = this.f25745b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    public final void L(float f10) {
        if (this.f25750g != f10) {
            this.f25750g = f10;
            D(f10, this.f25751h, this.f25752i);
        }
    }

    /* access modifiers changed from: package-private */
    public void M(boolean z10) {
        this.f25748e = z10;
    }

    /* access modifiers changed from: package-private */
    public final void N(y5.h hVar) {
        this.f25759p = hVar;
    }

    /* access modifiers changed from: package-private */
    public final void O(float f10) {
        if (this.f25751h != f10) {
            this.f25751h = f10;
            D(this.f25750g, f10, this.f25752i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void P(float f10) {
        this.f25761r = f10;
        Matrix matrix = this.C;
        g(f10, matrix);
        this.f25767x.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    public final void Q(float f10) {
        if (this.f25752i != f10) {
            this.f25752i = f10;
            D(this.f25750g, this.f25751h, f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void R(ColorStateList colorStateList) {
        Drawable drawable = this.f25746c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, l6.b.a(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    public void S(boolean z10) {
        this.f25749f = z10;
        b0();
    }

    /* access modifiers changed from: package-private */
    public final void T(n6.k kVar) {
        this.f25744a = kVar;
        n6.g gVar = this.f25745b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f25746c;
        if (drawable instanceof n) {
            ((n) drawable).setShapeAppearanceModel(kVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void U(y5.h hVar) {
        this.f25758o = hVar;
    }

    /* access modifiers changed from: package-private */
    public boolean V() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean X() {
        return !this.f25748e || this.f25767x.getSizeDimension() >= this.f25753j;
    }

    /* access modifiers changed from: package-private */
    public void Y(j jVar, boolean z10) {
        if (!x()) {
            Animator animator = this.f25757n;
            if (animator != null) {
                animator.cancel();
            }
            if (W()) {
                if (this.f25767x.getVisibility() != 0) {
                    this.f25767x.setAlpha(0.0f);
                    this.f25767x.setScaleY(0.0f);
                    this.f25767x.setScaleX(0.0f);
                    P(0.0f);
                }
                y5.h hVar = this.f25758o;
                if (hVar == null) {
                    hVar = l();
                }
                AnimatorSet h10 = h(hVar, 1.0f, 1.0f, 1.0f);
                h10.addListener(new b(z10, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f25764u;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h10.addListener(it.next());
                    }
                }
                h10.start();
                return;
            }
            this.f25767x.b(0, z10);
            this.f25767x.setAlpha(1.0f);
            this.f25767x.setScaleY(1.0f);
            this.f25767x.setScaleX(1.0f);
            P(1.0f);
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void Z() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f25760q % 90.0f != 0.0f) {
                if (this.f25767x.getLayerType() != 1) {
                    this.f25767x.setLayerType(1, (Paint) null);
                }
            } else if (this.f25767x.getLayerType() != 0) {
                this.f25767x.setLayerType(0, (Paint) null);
            }
        }
        n6.g gVar = this.f25745b;
        if (gVar != null) {
            gVar.X((int) this.f25760q);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a0() {
        P(this.f25761r);
    }

    /* access modifiers changed from: package-private */
    public final void b0() {
        Rect rect = this.f25769z;
        r(rect);
        E(rect);
        this.f25768y.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    public void c0(float f10) {
        n6.g gVar = this.f25745b;
        if (gVar != null) {
            gVar.S(f10);
        }
    }

    public void d(Animator.AnimatorListener animatorListener) {
        if (this.f25765v == null) {
            this.f25765v = new ArrayList<>();
        }
        this.f25765v.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public void e(Animator.AnimatorListener animatorListener) {
        if (this.f25764u == null) {
            this.f25764u = new ArrayList<>();
        }
        this.f25764u.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public void f(i iVar) {
        if (this.f25766w == null) {
            this.f25766w = new ArrayList<>();
        }
        this.f25766w.add(iVar);
    }

    /* access modifiers changed from: package-private */
    public final Drawable j() {
        return this.f25747d;
    }

    /* access modifiers changed from: package-private */
    public float m() {
        return this.f25750g;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.f25748e;
    }

    /* access modifiers changed from: package-private */
    public final y5.h o() {
        return this.f25759p;
    }

    /* access modifiers changed from: package-private */
    public float p() {
        return this.f25751h;
    }

    /* access modifiers changed from: package-private */
    public void r(Rect rect) {
        int sizeDimension = this.f25748e ? (this.f25753j - this.f25767x.getSizeDimension()) / 2 : 0;
        float m10 = this.f25749f ? m() + this.f25752i : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) m10));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (m10 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    public float s() {
        return this.f25752i;
    }

    /* access modifiers changed from: package-private */
    public final n6.k t() {
        return this.f25744a;
    }

    /* access modifiers changed from: package-private */
    public final y5.h u() {
        return this.f25758o;
    }

    /* access modifiers changed from: package-private */
    public void v(j jVar, boolean z10) {
        if (!w()) {
            Animator animator = this.f25757n;
            if (animator != null) {
                animator.cancel();
            }
            if (W()) {
                y5.h hVar = this.f25759p;
                if (hVar == null) {
                    hVar = k();
                }
                AnimatorSet h10 = h(hVar, 0.0f, 0.0f, 0.0f);
                h10.addListener(new C0274a(z10, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f25765v;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h10.addListener(it.next());
                    }
                }
                h10.start();
                return;
            }
            this.f25767x.b(z10 ? 8 : 4, z10);
            if (jVar != null) {
                jVar.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean w() {
        if (this.f25767x.getVisibility() == 0) {
            if (this.f25763t == 1) {
                return true;
            }
            return false;
        } else if (this.f25763t != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean x() {
        if (this.f25767x.getVisibility() != 0) {
            if (this.f25763t == 2) {
                return true;
            }
            return false;
        } else if (this.f25763t != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void y() {
        this.f25754k.c();
    }

    /* access modifiers changed from: package-private */
    public void z() {
        n6.g gVar = this.f25745b;
        if (gVar != null) {
            n6.h.f(this.f25767x, gVar);
        }
        if (I()) {
            this.f25767x.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }
}
