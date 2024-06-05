package x;

import android.view.View;
import t.e;

/* compiled from: ViewSpline */
public abstract class d extends e {

    /* compiled from: ViewSpline */
    public static class a extends d {
        public void b(View view, float f10) {
        }

        public void c(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    public abstract void b(View view, float f10);
}
