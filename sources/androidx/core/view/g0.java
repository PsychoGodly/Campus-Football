package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<View> f3181a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f3182b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f3183c = null;

    /* renamed from: d  reason: collision with root package name */
    int f3184d = -1;

    /* compiled from: ViewPropertyAnimatorCompat */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0 f3185a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3186b;

        a(h0 h0Var, View view) {
            this.f3185a = h0Var;
            this.f3186b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3185a.a(this.f3186b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f3185a.b(this.f3186b);
        }

        public void onAnimationStart(Animator animator) {
            this.f3185a.c(this.f3186b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    static class c implements h0 {

        /* renamed from: a  reason: collision with root package name */
        g0 f3188a;

        /* renamed from: b  reason: collision with root package name */
        boolean f3189b;

        c(g0 g0Var) {
            this.f3188a = g0Var;
        }

        public void a(View view) {
            Object tag = view.getTag(2113929216);
            h0 h0Var = tag instanceof h0 ? (h0) tag : null;
            if (h0Var != null) {
                h0Var.a(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.core.view.h0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(android.view.View r4) {
            /*
                r3 = this;
                androidx.core.view.g0 r0 = r3.f3188a
                int r0 = r0.f3184d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                androidx.core.view.g0 r0 = r3.f3188a
                r0.f3184d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.f3189b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                androidx.core.view.g0 r0 = r3.f3188a
                java.lang.Runnable r1 = r0.f3183c
                if (r1 == 0) goto L_0x0024
                r0.f3183c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof androidx.core.view.h0
                if (r1 == 0) goto L_0x0031
                r2 = r0
                androidx.core.view.h0 r2 = (androidx.core.view.h0) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.b(r4)
            L_0x0036:
                r4 = 1
                r3.f3189b = r4
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.g0.c.b(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.core.view.h0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f3189b = r0
                androidx.core.view.g0 r0 = r3.f3188a
                int r0 = r0.f3184d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                androidx.core.view.g0 r0 = r3.f3188a
                java.lang.Runnable r2 = r0.f3182b
                if (r2 == 0) goto L_0x001a
                r0.f3182b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof androidx.core.view.h0
                if (r2 == 0) goto L_0x0027
                r1 = r0
                androidx.core.view.h0 r1 = (androidx.core.view.h0) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.c(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.g0.c.c(android.view.View):void");
        }
    }

    g0(View view) {
        this.f3181a = new WeakReference<>(view);
    }

    private void i(View view, h0 h0Var) {
        if (h0Var != null) {
            view.animate().setListener(new a(h0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public g0 b(float f10) {
        View view = (View) this.f3181a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f3181a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f3181a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public g0 f(long j10) {
        View view = (View) this.f3181a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public g0 g(Interpolator interpolator) {
        View view = (View) this.f3181a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public g0 h(h0 h0Var) {
        View view = (View) this.f3181a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                i(view, h0Var);
            } else {
                view.setTag(2113929216, h0Var);
                i(view, new c(this));
            }
        }
        return this;
    }

    public g0 j(long j10) {
        View view = (View) this.f3181a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public g0 k(j0 j0Var) {
        View view = (View) this.f3181a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            f0 f0Var = null;
            if (j0Var != null) {
                f0Var = new f0(j0Var, view);
            }
            b.a(view.animate(), f0Var);
        }
        return this;
    }

    public void l() {
        View view = (View) this.f3181a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public g0 m(float f10) {
        View view = (View) this.f3181a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
