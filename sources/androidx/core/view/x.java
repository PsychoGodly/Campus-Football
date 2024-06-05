package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* compiled from: OneShotPreDrawListener */
public final class x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f3247a;

    /* renamed from: b  reason: collision with root package name */
    private ViewTreeObserver f3248b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f3249c;

    private x(View view, Runnable runnable) {
        this.f3247a = view;
        this.f3248b = view.getViewTreeObserver();
        this.f3249c = runnable;
    }

    public static x a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        x xVar = new x(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(xVar);
        view.addOnAttachStateChangeListener(xVar);
        return xVar;
    }

    public void b() {
        if (this.f3248b.isAlive()) {
            this.f3248b.removeOnPreDrawListener(this);
        } else {
            this.f3247a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f3247a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f3249c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f3248b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
