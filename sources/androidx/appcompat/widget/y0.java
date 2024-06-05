package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources */
class y0 extends q0 {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f1857b;

    public y0(Context context, Resources resources) {
        super(resources);
        this.f1857b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Drawable a10 = a(i10);
        Context context = (Context) this.f1857b.get();
        if (!(a10 == null || context == null)) {
            p0.h().x(context, i10, a10);
        }
        return a10;
    }
}
