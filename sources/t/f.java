package t;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* compiled from: TimeCycleSplineSet */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    protected a f22539a;

    /* renamed from: b  reason: collision with root package name */
    protected int f22540b = 0;

    /* renamed from: c  reason: collision with root package name */
    protected int[] f22541c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    protected float[][] f22542d = ((float[][]) Array.newInstance(float.class, new int[]{10, 3}));

    /* renamed from: e  reason: collision with root package name */
    protected int f22543e;

    /* renamed from: f  reason: collision with root package name */
    protected String f22544f;

    /* renamed from: g  reason: collision with root package name */
    protected float[] f22545g = new float[3];

    /* renamed from: h  reason: collision with root package name */
    protected boolean f22546h = false;

    /* renamed from: i  reason: collision with root package name */
    protected long f22547i;

    /* renamed from: j  reason: collision with root package name */
    protected float f22548j = Float.NaN;

    public String toString() {
        String str = this.f22544f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f22543e; i10++) {
            str = str + "[" + this.f22541c[i10] + " , " + decimalFormat.format(this.f22542d[i10]) + "] ";
        }
        return str;
    }
}
