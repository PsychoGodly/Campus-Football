package y5;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import m0.b;
import m0.c;

/* compiled from: AnimationUtils */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f31291a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f31292b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f31293c = new m0.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f31294d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f31295e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }
}
