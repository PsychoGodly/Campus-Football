package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.e;
import androidx.fragment.app.x;

/* compiled from: FragmentAnim */
class f {

    /* compiled from: FragmentAnim */
    class a implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f3598a;

        a(Fragment fragment) {
            this.f3598a = fragment;
        }

        public void a() {
            if (this.f3598a.l() != null) {
                View l10 = this.f3598a.l();
                this.f3598a.r1((View) null);
                l10.clearAnimation();
            }
            this.f3598a.t1((Animator) null);
        }
    }

    /* compiled from: FragmentAnim */
    class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3599a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f3600b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x.g f3601c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f3602d;

        /* compiled from: FragmentAnim */
        class a implements Runnable {
            a() {
            }

            public void run() {
                if (b.this.f3600b.l() != null) {
                    b.this.f3600b.r1((View) null);
                    b bVar = b.this;
                    bVar.f3601c.a(bVar.f3600b, bVar.f3602d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, x.g gVar, androidx.core.os.e eVar) {
            this.f3599a = viewGroup;
            this.f3600b = fragment;
            this.f3601c = gVar;
            this.f3602d = eVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f3599a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: FragmentAnim */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3604a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3605b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f3606c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x.g f3607d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f3608e;

        c(ViewGroup viewGroup, View view, Fragment fragment, x.g gVar, androidx.core.os.e eVar) {
            this.f3604a = viewGroup;
            this.f3605b = view;
            this.f3606c = fragment;
            this.f3607d = gVar;
            this.f3608e = eVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3604a.endViewTransition(this.f3605b);
            Animator m10 = this.f3606c.m();
            this.f3606c.t1((Animator) null);
            if (m10 != null && this.f3604a.indexOfChild(this.f3605b) < 0) {
                this.f3607d.a(this.f3606c, this.f3608e);
            }
        }
    }

    static void a(Fragment fragment, d dVar, x.g gVar) {
        View view = fragment.I;
        ViewGroup viewGroup = fragment.H;
        viewGroup.startViewTransition(view);
        androidx.core.os.e eVar = new androidx.core.os.e();
        eVar.c(new a(fragment));
        gVar.b(fragment, eVar);
        if (dVar.f3609a != null) {
            e eVar2 = new e(dVar.f3609a, viewGroup, view);
            fragment.r1(fragment.I);
            eVar2.setAnimationListener(new b(viewGroup, fragment, gVar, eVar));
            fragment.I.startAnimation(eVar2);
            return;
        }
        Animator animator = dVar.f3610b;
        fragment.t1(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, eVar));
        animator.setTarget(fragment.I);
        animator.start();
    }

    private static int b(Fragment fragment, boolean z10, boolean z11) {
        if (z11) {
            if (z10) {
                return fragment.E();
            }
            return fragment.F();
        } else if (z10) {
            return fragment.q();
        } else {
            return fragment.t();
        }
    }

    static d c(Context context, Fragment fragment, boolean z10, boolean z11) {
        int A = fragment.A();
        int b10 = b(fragment, z10, z11);
        boolean z12 = false;
        fragment.s1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.H;
        if (viewGroup != null) {
            int i10 = l0.b.f19847c;
            if (viewGroup.getTag(i10) != null) {
                fragment.H.setTag(i10, (Object) null);
            }
        }
        ViewGroup viewGroup2 = fragment.H;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation n02 = fragment.n0(A, z10, b10);
        if (n02 != null) {
            return new d(n02);
        }
        Animator o02 = fragment.o0(A, z10, b10);
        if (o02 != null) {
            return new d(o02);
        }
        if (b10 == 0 && A != 0) {
            b10 = d(A, z10);
        }
        if (b10 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(b10));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, b10);
                    if (loadAnimation != null) {
                        return new d(loadAnimation);
                    }
                    z12 = true;
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            }
            if (!z12) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, b10);
                    if (loadAnimator != null) {
                        return new d(loadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b10);
                        if (loadAnimation2 != null) {
                            return new d(loadAnimation2);
                        }
                    } else {
                        throw e11;
                    }
                }
            }
        }
        return null;
    }

    private static int d(int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? l0.a.f19843e : l0.a.f19844f;
        }
        if (i10 == 4099) {
            return z10 ? l0.a.f19841c : l0.a.f19842d;
        }
        if (i10 != 8194) {
            return -1;
        }
        return z10 ? l0.a.f19839a : l0.a.f19840b;
    }

    /* compiled from: FragmentAnim */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f3609a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f3610b;

        d(Animation animation) {
            this.f3609a = animation;
            this.f3610b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        d(Animator animator) {
            this.f3609a = null;
            this.f3610b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: FragmentAnim */
    static class e extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f3611a;

        /* renamed from: b  reason: collision with root package name */
        private final View f3612b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3613c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3614d;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3615f = true;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3611a = viewGroup;
            this.f3612b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j10, Transformation transformation) {
            this.f3615f = true;
            if (this.f3613c) {
                return !this.f3614d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f3613c = true;
                androidx.core.view.x.a(this.f3611a, this);
            }
            return true;
        }

        public void run() {
            if (this.f3613c || !this.f3615f) {
                this.f3611a.endViewTransition(this.f3612b);
                this.f3614d = true;
                return;
            }
            this.f3615f = false;
            this.f3611a.post(this);
        }

        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f3615f = true;
            if (this.f3613c) {
                return !this.f3614d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f3613c = true;
                androidx.core.view.x.a(this.f3611a, this);
            }
            return true;
        }
    }
}
