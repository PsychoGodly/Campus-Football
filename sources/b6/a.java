package b6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import b6.d;

/* compiled from: CircularRevealCompat */
public final class a {

    /* renamed from: b6.a$a  reason: collision with other inner class name */
    /* compiled from: CircularRevealCompat */
    static class C0257a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f24265a;

        C0257a(d dVar) {
            this.f24265a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f24265a.b();
        }

        public void onAnimationStart(Animator animator) {
            this.f24265a.a();
        }
    }

    public static Animator a(d dVar, float f10, float f11, float f12) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, d.c.f24269a, d.b.f24267b, new d.e[]{new d.e(f10, f11, f12)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        d.e revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f10, (int) f11, revealInfo.f24273c, f12);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    public static Animator.AnimatorListener b(d dVar) {
        return new C0257a(dVar);
    }
}
