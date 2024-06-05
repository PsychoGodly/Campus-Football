package x;

import android.view.View;
import t.c;
import t.f;

/* compiled from: ViewTimeCycle */
public abstract class e extends f {

    /* compiled from: ViewTimeCycle */
    public static class a extends e {
        public boolean b(View view, float f10, long j10, c cVar) {
            return this.f22546h;
        }

        public boolean c(View view, c cVar, float f10, long j10, double d10, double d11) {
            view.setRotation(a(f10, j10, view, cVar) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.f22546h;
        }
    }

    public float a(float f10, long j10, View view, c cVar) {
        this.f22539a.c((double) f10, this.f22545g);
        float[] fArr = this.f22545g;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
            this.f22546h = false;
            return fArr[2];
        } else if (Float.isNaN(this.f22548j)) {
            throw null;
        } else {
            this.f22548j = (float) ((((double) this.f22548j) + ((((double) (j10 - this.f22547i)) * 1.0E-9d) * ((double) f11))) % 1.0d);
            throw null;
        }
    }

    public abstract boolean b(View view, float f10, long j10, c cVar);
}
