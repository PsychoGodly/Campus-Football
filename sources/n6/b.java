package n6;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final c f29299a;

    /* renamed from: b  reason: collision with root package name */
    private final float f29300b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f29299a;
            f10 += ((b) cVar).f29300b;
        }
        this.f29299a = cVar;
        this.f29300b = f10;
    }

    public float a(RectF rectF) {
        return Math.max(0.0f, this.f29299a.a(rectF) + this.f29300b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f29299a.equals(bVar.f29299a) || this.f29300b != bVar.f29300b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29299a, Float.valueOf(this.f29300b)});
    }
}
