package io.flutter.embedding.android;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

@Deprecated
/* compiled from: DrawableSplashScreen */
public final class b implements x {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f33382a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView.ScaleType f33383b;

    /* renamed from: c  reason: collision with root package name */
    private final long f33384c;

    /* renamed from: d  reason: collision with root package name */
    private C0380b f33385d;

    /* compiled from: DrawableSplashScreen */
    class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f33386a;

        a(Runnable runnable) {
            this.f33386a = runnable;
        }

        public void onAnimationCancel(Animator animator) {
            this.f33386a.run();
        }

        public void onAnimationEnd(Animator animator) {
            this.f33386a.run();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: io.flutter.embedding.android.b$b  reason: collision with other inner class name */
    /* compiled from: DrawableSplashScreen */
    public static class C0380b extends ImageView {
        public C0380b(Context context) {
            this(context, (AttributeSet) null, 0);
        }

        public void a(Drawable drawable, ImageView.ScaleType scaleType) {
            setScaleType(scaleType);
            setImageDrawable(drawable);
        }

        public void setSplashDrawable(Drawable drawable) {
            a(drawable, ImageView.ScaleType.FIT_XY);
        }

        public C0380b(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
        }
    }

    public b(Drawable drawable) {
        this(drawable, ImageView.ScaleType.FIT_XY, 500);
    }

    public void a(Runnable runnable) {
        C0380b bVar = this.f33385d;
        if (bVar == null) {
            runnable.run();
        } else {
            bVar.animate().alpha(0.0f).setDuration(this.f33384c).setListener(new a(runnable));
        }
    }

    public /* synthetic */ boolean b() {
        return w.a(this);
    }

    public View c(Context context, Bundle bundle) {
        C0380b bVar = new C0380b(context);
        this.f33385d = bVar;
        bVar.a(this.f33382a, this.f33383b);
        return this.f33385d;
    }

    public /* synthetic */ Bundle d() {
        return w.b(this);
    }

    public b(Drawable drawable, ImageView.ScaleType scaleType, long j10) {
        this.f33382a = drawable;
        this.f33383b = scaleType;
        this.f33384c = j10;
    }
}
