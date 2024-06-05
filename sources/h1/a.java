package h1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: AnimatorUtils */
class a {

    /* renamed from: h1.a$a  reason: collision with other inner class name */
    /* compiled from: AnimatorUtils */
    interface C0197a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    static void a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.addPauseListener(animatorListenerAdapter);
        }
    }

    static void b(Animator animator) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.pause();
            return;
        }
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i10 = 0; i10 < size; i10++) {
                Animator.AnimatorListener animatorListener = listeners.get(i10);
                if (animatorListener instanceof C0197a) {
                    ((C0197a) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }

    static void c(Animator animator) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.resume();
            return;
        }
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i10 = 0; i10 < size; i10++) {
                Animator.AnimatorListener animatorListener = listeners.get(i10);
                if (animatorListener instanceof C0197a) {
                    ((C0197a) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }
}
