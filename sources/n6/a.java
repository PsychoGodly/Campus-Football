package n6;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f29298a;

    public a(float f10) {
        this.f29298a = f10;
    }

    public float a(RectF rectF) {
        return this.f29298a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f29298a == ((a) obj).f29298a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f29298a)});
    }
}
