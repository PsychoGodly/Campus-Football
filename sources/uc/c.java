package uc;

import android.graphics.drawable.ColorDrawable;
import java.util.Objects;

/* compiled from: FlutterNativeTemplateTextStyle */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final ColorDrawable f38757a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorDrawable f38758b;

    /* renamed from: c  reason: collision with root package name */
    private final a f38759c;

    /* renamed from: d  reason: collision with root package name */
    private final Double f38760d;

    public c(ColorDrawable colorDrawable, ColorDrawable colorDrawable2, a aVar, Double d10) {
        this.f38757a = colorDrawable;
        this.f38758b = colorDrawable2;
        this.f38759c = aVar;
        this.f38760d = d10;
    }

    public ColorDrawable a() {
        return this.f38758b;
    }

    public a b() {
        return this.f38759c;
    }

    public Float c() {
        Double d10 = this.f38760d;
        if (d10 == null) {
            return null;
        }
        return Float.valueOf(d10.floatValue());
    }

    public ColorDrawable d() {
        return this.f38757a;
    }

    public boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        ColorDrawable colorDrawable2 = this.f38757a;
        if (((colorDrawable2 != null || cVar.f38757a != null) && colorDrawable2.getColor() != cVar.f38757a.getColor()) || ((((colorDrawable = this.f38758b) != null || cVar.f38758b != null) && colorDrawable.getColor() != cVar.f38758b.getColor()) || !Objects.equals(this.f38760d, cVar.f38760d) || !Objects.equals(this.f38759c, cVar.f38759c))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        ColorDrawable colorDrawable = this.f38757a;
        Integer num = null;
        Integer valueOf = colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor());
        ColorDrawable colorDrawable2 = this.f38758b;
        if (colorDrawable2 != null) {
            num = Integer.valueOf(colorDrawable2.getColor());
        }
        return Objects.hash(new Object[]{valueOf, num, this.f38760d, this.f38759c});
    }
}
