package n6;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: RelativeCornerSize */
public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f29349a;

    public i(float f10) {
        this.f29349a = f10;
    }

    public float a(RectF rectF) {
        return this.f29349a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && this.f29349a == ((i) obj).f29349a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f29349a)});
    }
}
