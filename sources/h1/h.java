package h1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* compiled from: PathProperty */
class h<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    private final Property<T, PointF> f18620a;

    /* renamed from: b  reason: collision with root package name */
    private final PathMeasure f18621b;

    /* renamed from: c  reason: collision with root package name */
    private final float f18622c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f18623d = new float[2];

    /* renamed from: e  reason: collision with root package name */
    private final PointF f18624e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private float f18625f;

    h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f18620a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f18621b = pathMeasure;
        this.f18622c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t10) {
        return Float.valueOf(this.f18625f);
    }

    /* renamed from: b */
    public void set(T t10, Float f10) {
        this.f18625f = f10.floatValue();
        this.f18621b.getPosTan(this.f18622c * f10.floatValue(), this.f18623d, (float[]) null);
        PointF pointF = this.f18624e;
        float[] fArr = this.f18623d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f18620a.set(t10, pointF);
    }
}
