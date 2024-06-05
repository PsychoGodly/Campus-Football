package t;

import java.text.DecimalFormat;

/* compiled from: SplineSet */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    protected a f22534a;

    /* renamed from: b  reason: collision with root package name */
    protected int[] f22535b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    protected float[] f22536c = new float[10];

    /* renamed from: d  reason: collision with root package name */
    private int f22537d;

    /* renamed from: e  reason: collision with root package name */
    private String f22538e;

    public float a(float f10) {
        return (float) this.f22534a.a((double) f10, 0);
    }

    public String toString() {
        String str = this.f22538e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f22537d; i10++) {
            str = str + "[" + this.f22535b[i10] + " , " + decimalFormat.format((double) this.f22536c[i10]) + "] ";
        }
        return str;
    }
}
