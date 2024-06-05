package t4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class u extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w f22731a;

    u(w wVar) {
        this.f22731a = wVar;
    }

    private final void a(boolean z10) {
        this.f22731a.setEnabled(z10);
        this.f22731a.f22736a.setEnabled(z10);
    }

    public final void onAnimationCancel(Animator animator) {
        a(true);
    }

    public final void onAnimationEnd(Animator animator) {
        a(true);
    }

    public final void onAnimationStart(Animator animator) {
        a(false);
    }
}
