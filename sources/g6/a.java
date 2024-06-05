package g6;

import android.content.Context;
import android.graphics.Color;
import k6.b;

/* compiled from: ElevationOverlayProvider */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f28894a;

    /* renamed from: b  reason: collision with root package name */
    private final int f28895b;

    /* renamed from: c  reason: collision with root package name */
    private final int f28896c;

    /* renamed from: d  reason: collision with root package name */
    private final float f28897d;

    public a(Context context) {
        this.f28894a = b.b(context, x5.b.elevationOverlayEnabled, false);
        this.f28895b = d6.a.a(context, x5.b.elevationOverlayColor, 0);
        this.f28896c = d6.a.a(context, x5.b.colorSurface, 0);
        this.f28897d = context.getResources().getDisplayMetrics().density;
    }

    private boolean e(int i10) {
        return androidx.core.graphics.b.f(i10, 255) == this.f28896c;
    }

    public float a(float f10) {
        float f11 = this.f28897d;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f10 / f11))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        float a10 = a(f10);
        return androidx.core.graphics.b.f(d6.a.f(androidx.core.graphics.b.f(i10, 255), this.f28895b, a10), Color.alpha(i10));
    }

    public int c(int i10, float f10) {
        return (!this.f28894a || !e(i10)) ? i10 : b(i10, f10);
    }

    public boolean d() {
        return this.f28894a;
    }
}
