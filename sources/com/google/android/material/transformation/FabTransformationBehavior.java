package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import b6.d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import x5.f;
import y5.h;
import y5.i;
import y5.j;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private final Rect f26011c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private final RectF f26012d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    private final RectF f26013e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f26014f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private float f26015g;

    /* renamed from: h  reason: collision with root package name */
    private float f26016h;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f26017a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f26018b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f26019c;

        a(boolean z10, View view, View view2) {
            this.f26017a = z10;
            this.f26018b = view;
            this.f26019c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f26017a) {
                this.f26018b.setVisibility(4);
                this.f26019c.setAlpha(1.0f);
                this.f26019c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f26017a) {
                this.f26018b.setVisibility(0);
                this.f26019c.setAlpha(0.0f);
                this.f26019c.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f26021a;

        b(View view) {
            this.f26021a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f26021a.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b6.d f26023a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f26024b;

        c(b6.d dVar, Drawable drawable) {
            this.f26023a = dVar;
            this.f26024b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f26023a.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.f26023a.setCircularRevealOverlayDrawable(this.f26024b);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b6.d f26026a;

        d(b6.d dVar) {
            this.f26026a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.f26026a.getRevealInfo();
            revealInfo.f24273c = Float.MAX_VALUE;
            this.f26026a.setRevealInfo(revealInfo);
        }
    }

    protected static class e {

        /* renamed from: a  reason: collision with root package name */
        public h f26028a;

        /* renamed from: b  reason: collision with root package name */
        public j f26029b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
    }

    private ViewGroup K(View view) {
        View findViewById = view.findViewById(f.mtrl_child_content_container);
        if (findViewById != null) {
            return f0(findViewById);
        }
        if ((view instanceof p6.b) || (view instanceof p6.a)) {
            return f0(((ViewGroup) view).getChildAt(0));
        }
        return f0(view);
    }

    private void L(View view, e eVar, i iVar, i iVar2, float f10, float f11, float f12, float f13, RectF rectF) {
        float S = S(eVar, iVar, f10, f12);
        float S2 = S(eVar, iVar2, f11, f13);
        Rect rect = this.f26011c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f26012d;
        rectF2.set(rect);
        RectF rectF3 = this.f26013e;
        T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void M(View view, RectF rectF) {
        T(view, rectF);
        rectF.offset(this.f26015g, this.f26016h);
    }

    private Pair<i, i> N(float f10, float f11, boolean z10, e eVar) {
        i iVar;
        i iVar2;
        int i10;
        if (f10 == 0.0f || f11 == 0.0f) {
            iVar2 = eVar.f26028a.e("translationXLinear");
            iVar = eVar.f26028a.e("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || i10 <= 0)) {
            iVar2 = eVar.f26028a.e("translationXCurveDownwards");
            iVar = eVar.f26028a.e("translationYCurveDownwards");
        } else {
            iVar2 = eVar.f26028a.e("translationXCurveUpwards");
            iVar = eVar.f26028a.e("translationYCurveUpwards");
        }
        return new Pair<>(iVar2, iVar);
    }

    private float O(View view, View view2, j jVar) {
        RectF rectF = this.f26012d;
        RectF rectF2 = this.f26013e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(-Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float P(View view, View view2, j jVar) {
        RectF rectF = this.f26012d;
        RectF rectF2 = this.f26013e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(0.0f, -R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float Q(View view, View view2, j jVar) {
        float f10;
        float f11;
        float f12;
        RectF rectF = this.f26012d;
        RectF rectF2 = this.f26013e;
        M(view, rectF);
        T(view2, rectF2);
        int i10 = jVar.f31311a & 7;
        if (i10 == 1) {
            f12 = rectF2.centerX();
            f11 = rectF.centerX();
        } else if (i10 == 3) {
            f12 = rectF2.left;
            f11 = rectF.left;
        } else if (i10 != 5) {
            f10 = 0.0f;
            return f10 + jVar.f31312b;
        } else {
            f12 = rectF2.right;
            f11 = rectF.right;
        }
        f10 = f12 - f11;
        return f10 + jVar.f31312b;
    }

    private float R(View view, View view2, j jVar) {
        float f10;
        float f11;
        float f12;
        RectF rectF = this.f26012d;
        RectF rectF2 = this.f26013e;
        M(view, rectF);
        T(view2, rectF2);
        int i10 = jVar.f31311a & 112;
        if (i10 == 16) {
            f12 = rectF2.centerY();
            f11 = rectF.centerY();
        } else if (i10 == 48) {
            f12 = rectF2.top;
            f11 = rectF.top;
        } else if (i10 != 80) {
            f10 = 0.0f;
            return f10 + jVar.f31313c;
        } else {
            f12 = rectF2.bottom;
            f11 = rectF.bottom;
        }
        f10 = f12 - f11;
        return f10 + jVar.f31313c;
    }

    private float S(e eVar, i iVar, float f10, float f11) {
        long c10 = iVar.c();
        long d10 = iVar.d();
        i e10 = eVar.f26028a.e("expansion");
        return y5.a.a(f10, f11, iVar.e().getInterpolation(((float) (((e10.c() + e10.d()) + 17) - c10)) / ((float) d10)));
    }

    private void T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f26014f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private void U(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof b6.d) || b6.c.f24266a != 0) && (K = K(view2)) != null) {
                if (z10) {
                    if (!z11) {
                        y5.d.f31297a.set(K, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(K, y5.d.f31297a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(K, y5.d.f31297a, new float[]{0.0f});
                }
                eVar.f26028a.e("contentFade").a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    private void V(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof b6.d) {
            b6.d dVar = (b6.d) view2;
            int d02 = d0(view);
            int i10 = 16777215 & d02;
            if (z10) {
                if (!z11) {
                    dVar.setCircularRevealScrimColor(d02);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, d.C0258d.f24270a, new int[]{i10});
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, d.C0258d.f24270a, new int[]{d02});
            }
            objectAnimator.setEvaluator(y5.c.b());
            eVar.f26028a.e("color").a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    private void W(View view, View view2, boolean z10, e eVar, List<Animator> list) {
        float Q = Q(view, view2, eVar.f26029b);
        float R = R(view, view2, eVar.f26029b);
        Pair<i, i> N = N(Q, R, z10, eVar);
        i iVar = (i) N.first;
        i iVar2 = (i) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z10) {
            Q = this.f26015g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z10) {
            R = this.f26016h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private void X(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float v10 = a0.v(view2) - a0.v(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-v10);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-v10});
        }
        eVar.f26028a.e("elevation").a(objectAnimator);
        list.add(objectAnimator);
    }

    private void Y(View view, View view2, boolean z10, boolean z11, e eVar, float f10, float f11, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        e eVar2 = eVar;
        if (view4 instanceof b6.d) {
            b6.d dVar = (b6.d) view4;
            float O = O(view3, view4, eVar2.f26029b);
            float P = P(view3, view4, eVar2.f26029b);
            ((FloatingActionButton) view3).i(this.f26011c);
            float width = ((float) this.f26011c.width()) / 2.0f;
            i e10 = eVar2.f26028a.e("expansion");
            if (z10) {
                if (!z11) {
                    dVar.setRevealInfo(new d.e(O, P, width));
                }
                if (z11) {
                    width = dVar.getRevealInfo().f24273c;
                }
                animator = b6.a.a(dVar, O, P, i6.a.b(O, P, 0.0f, 0.0f, f10, f11));
                animator.addListener(new d(dVar));
                b0(view2, e10.c(), (int) O, (int) P, width, list);
            } else {
                float f12 = dVar.getRevealInfo().f24273c;
                Animator a10 = b6.a.a(dVar, O, P, width);
                int i10 = (int) O;
                int i11 = (int) P;
                View view5 = view2;
                b0(view5, e10.c(), i10, i11, f12, list);
                long c10 = e10.c();
                long d10 = e10.d();
                long f13 = eVar2.f26028a.f();
                a0(view5, c10, d10, f13, i10, i11, width, list);
                animator = a10;
            }
            e10.a(animator);
            list.add(animator);
            list2.add(b6.a.b(dVar));
        }
    }

    private void Z(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof b6.d) && (view instanceof ImageView)) {
            b6.d dVar = (b6.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z10) {
                    if (!z11) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, y5.e.f31298b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, y5.e.f31298b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new b(view2));
                eVar.f26028a.e("iconFade").a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new c(dVar, drawable));
            }
        }
    }

    private void a0(View view, long j10, long j11, long j12, int i10, int i11, float f10, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j13 = j10 + j11;
            if (j13 < j12) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
                createCircularReveal.setStartDelay(j13);
                createCircularReveal.setDuration(j12 - j13);
                list.add(createCircularReveal);
            }
        }
    }

    private void b0(View view, long j10, int i10, int i11, float f10, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j10 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j10);
            list.add(createCircularReveal);
        }
    }

    private void c0(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z12 = z10;
        e eVar2 = eVar;
        List<Animator> list3 = list;
        float Q = Q(view3, view4, eVar2.f26029b);
        float R = R(view3, view4, eVar2.f26029b);
        Pair<i, i> N = N(Q, R, z12, eVar2);
        i iVar = (i) N.first;
        i iVar2 = (i) N.second;
        if (z12) {
            if (!z11) {
                view4.setTranslationX(-Q);
                view4.setTranslationY(-R);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            L(view2, eVar, iVar, iVar2, -Q, -R, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-Q});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-R});
        }
        iVar.a(objectAnimator2);
        iVar2.a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    private int d0(View view) {
        ColorStateList r10 = a0.r(view);
        if (r10 != null) {
            return r10.getColorForState(view.getDrawableState(), r10.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public AnimatorSet J(View view, View view2, boolean z10, boolean z11) {
        boolean z12 = z10;
        e e02 = e0(view2.getContext(), z12);
        if (z12) {
            this.f26015g = view.getTranslationX();
            this.f26016h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            X(view, view2, z10, z11, e02, arrayList, arrayList2);
        }
        RectF rectF = this.f26012d;
        View view3 = view;
        View view4 = view2;
        boolean z13 = z10;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        c0(view3, view4, z13, z11, e02, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        W(view3, view4, z13, e02, arrayList);
        boolean z14 = z11;
        e eVar = e02;
        Z(view3, view4, z13, z14, eVar, arrayList3, arrayList4);
        Y(view3, view4, z13, z14, eVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        V(view3, view4, z13, z14, eVar, arrayList5, arrayList6);
        U(view3, view4, z13, z14, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        y5.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z12, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i10));
        }
        return animatorSet;
    }

    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract e e0(Context context, boolean z10);

    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f2648h == 0) {
            fVar.f2648h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
