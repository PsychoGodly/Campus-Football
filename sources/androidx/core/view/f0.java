package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j0 f3177a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3178b;

    public /* synthetic */ f0(j0 j0Var, View view) {
        this.f3177a = j0Var;
        this.f3178b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3177a.a(this.f3178b);
    }
}
