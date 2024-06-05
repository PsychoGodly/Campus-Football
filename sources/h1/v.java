package h1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: ViewGroupOverlayApi18 */
class v implements w {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f18704a;

    v(ViewGroup viewGroup) {
        this.f18704a = viewGroup.getOverlay();
    }

    public void a(Drawable drawable) {
        this.f18704a.add(drawable);
    }

    public void b(Drawable drawable) {
        this.f18704a.remove(drawable);
    }

    public void c(View view) {
        this.f18704a.add(view);
    }

    public void d(View view) {
        this.f18704a.remove(view);
    }
}
