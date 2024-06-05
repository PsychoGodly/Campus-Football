package h1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.a0;
import java.util.Map;

/* compiled from: ChangeBounds */
public class c extends m {
    private static final String[] O = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> P = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> Q = new C0198c(PointF.class, "topLeft");
    private static final Property<k, PointF> R = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> S = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> T = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> U = new g(PointF.class, "position");
    private static k V = new k();
    private int[] L = new int[2];
    private boolean M = false;
    private boolean N = false;

    /* compiled from: ChangeBounds */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f18568a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f18569b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f18570c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f18571d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f18568a = viewGroup;
            this.f18569b = bitmapDrawable;
            this.f18570c = view;
            this.f18571d = f10;
        }

        public void onAnimationEnd(Animator animator) {
            c0.b(this.f18568a).b(this.f18569b);
            c0.g(this.f18570c, this.f18571d);
        }
    }

    /* compiled from: ChangeBounds */
    static class b extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f18573a = new Rect();

        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f18573a);
            Rect rect = this.f18573a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f18573a);
            this.f18573a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f18573a);
        }
    }

    /* renamed from: h1.c$c  reason: collision with other inner class name */
    /* compiled from: ChangeBounds */
    static class C0198c extends Property<k, PointF> {
        C0198c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* compiled from: ChangeBounds */
    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* compiled from: ChangeBounds */
    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            c0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds */
    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            c0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds */
    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            c0.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f18574a;
        private k mViewBounds;

        h(k kVar) {
            this.f18574a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* compiled from: ChangeBounds */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f18576a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f18577b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f18578c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f18579d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f18580e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f18581f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f18582g;

        i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f18577b = view;
            this.f18578c = rect;
            this.f18579d = i10;
            this.f18580e = i11;
            this.f18581f = i12;
            this.f18582g = i13;
        }

        public void onAnimationCancel(Animator animator) {
            this.f18576a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f18576a) {
                a0.u0(this.f18577b, this.f18578c);
                c0.f(this.f18577b, this.f18579d, this.f18580e, this.f18581f, this.f18582g);
            }
        }
    }

    /* compiled from: ChangeBounds */
    class j extends n {

        /* renamed from: a  reason: collision with root package name */
        boolean f18584a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f18585b;

        j(ViewGroup viewGroup) {
            this.f18585b = viewGroup;
        }

        public void a(m mVar) {
            if (!this.f18584a) {
                x.c(this.f18585b, false);
            }
            mVar.U(this);
        }

        public void b(m mVar) {
            x.c(this.f18585b, false);
        }

        public void c(m mVar) {
            x.c(this.f18585b, false);
            this.f18584a = true;
        }

        public void e(m mVar) {
            x.c(this.f18585b, true);
        }
    }

    /* compiled from: ChangeBounds */
    private static class k {

        /* renamed from: a  reason: collision with root package name */
        private int f18587a;

        /* renamed from: b  reason: collision with root package name */
        private int f18588b;

        /* renamed from: c  reason: collision with root package name */
        private int f18589c;

        /* renamed from: d  reason: collision with root package name */
        private int f18590d;

        /* renamed from: e  reason: collision with root package name */
        private View f18591e;

        /* renamed from: f  reason: collision with root package name */
        private int f18592f;

        /* renamed from: g  reason: collision with root package name */
        private int f18593g;

        k(View view) {
            this.f18591e = view;
        }

        private void b() {
            c0.f(this.f18591e, this.f18587a, this.f18588b, this.f18589c, this.f18590d);
            this.f18592f = 0;
            this.f18593g = 0;
        }

        /* access modifiers changed from: package-private */
        public void a(PointF pointF) {
            this.f18589c = Math.round(pointF.x);
            this.f18590d = Math.round(pointF.y);
            int i10 = this.f18593g + 1;
            this.f18593g = i10;
            if (this.f18592f == i10) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(PointF pointF) {
            this.f18587a = Math.round(pointF.x);
            this.f18588b = Math.round(pointF.y);
            int i10 = this.f18592f + 1;
            this.f18592f = i10;
            if (i10 == this.f18593g) {
                b();
            }
        }
    }

    private void h0(s sVar) {
        View view = sVar.f18698b;
        if (a0.R(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f18697a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f18697a.put("android:changeBounds:parent", sVar.f18698b.getParent());
            if (this.N) {
                sVar.f18698b.getLocationInWindow(this.L);
                sVar.f18697a.put("android:changeBounds:windowX", Integer.valueOf(this.L[0]));
                sVar.f18697a.put("android:changeBounds:windowY", Integer.valueOf(this.L[1]));
            }
            if (this.M) {
                sVar.f18697a.put("android:changeBounds:clip", a0.t(view));
            }
        }
    }

    private boolean i0(View view, View view2) {
        if (!this.N) {
            return true;
        }
        s x10 = x(view, true);
        if (x10 == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == x10.f18698b) {
            return true;
        }
        return false;
    }

    public String[] I() {
        return O;
    }

    public void g(s sVar) {
        h0(sVar);
    }

    public void k(s sVar) {
        h0(sVar);
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        int i10;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator2;
        s sVar3 = sVar;
        s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        Map<String, Object> map = sVar3.f18697a;
        Map<String, Object> map2 = sVar4.f18697a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f18698b;
        if (i0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar3.f18697a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar4.f18697a.get("android:changeBounds:bounds");
            int i12 = rect2.left;
            int i13 = rect3.left;
            int i14 = rect2.top;
            int i15 = rect3.top;
            int i16 = rect2.right;
            int i17 = rect3.right;
            int i18 = rect2.bottom;
            int i19 = rect3.bottom;
            int i20 = i16 - i12;
            int i21 = i18 - i14;
            int i22 = i17 - i13;
            int i23 = i19 - i15;
            View view3 = view2;
            Rect rect4 = (Rect) sVar3.f18697a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar4.f18697a.get("android:changeBounds:clip");
            if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
                i10 = 0;
            } else {
                i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
                if (!(i16 == i17 && i18 == i19)) {
                    i10++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i10++;
            }
            if (i10 <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.M) {
                view = view3;
                c0.f(view, i12, i14, i16, i18);
                if (i10 == 2) {
                    if (i20 == i22 && i21 == i23) {
                        animator = f.a(view, U, z().a((float) i12, (float) i14, (float) i13, (float) i15));
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator a10 = f.a(kVar, Q, z().a((float) i12, (float) i14, (float) i13, (float) i15));
                        ObjectAnimator a11 = f.a(kVar, R, z().a((float) i16, (float) i18, (float) i17, (float) i19));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a10, a11});
                        animatorSet.addListener(new h(kVar));
                        animator = animatorSet;
                    }
                } else if (i12 == i13 && i14 == i15) {
                    animator = f.a(view, S, z().a((float) i16, (float) i18, (float) i17, (float) i19));
                } else {
                    animator = f.a(view, T, z().a((float) i12, (float) i14, (float) i13, (float) i15));
                }
            } else {
                view = view3;
                c0.f(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
                if (i12 == i13 && i14 == i15) {
                    objectAnimator = null;
                } else {
                    objectAnimator = f.a(view, U, z().a((float) i12, (float) i14, (float) i13, (float) i15));
                }
                if (rect7 == null) {
                    i11 = 0;
                    rect = new Rect(0, 0, i20, i21);
                } else {
                    i11 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i11, i11, i22, i23) : rect6;
                if (!rect.equals(rect8)) {
                    a0.u0(view, rect);
                    k kVar2 = V;
                    Object[] objArr = new Object[2];
                    objArr[i11] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                    ofObject.addListener(new i(view, rect6, i13, i15, i17, i19));
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = r.c(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                x.c(viewGroup4, true);
                a(new j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) sVar3.f18697a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar3.f18697a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar4.f18697a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar4.f18697a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.L);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c10 = c0.c(view2);
        c0.g(view2, 0.0f);
        c0.b(viewGroup).a(bitmapDrawable);
        g z10 = z();
        int[] iArr = this.L;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{i.a(P, z10.a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c10));
        return ofPropertyValuesHolder;
    }
}
