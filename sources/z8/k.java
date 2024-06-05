package z8;

/* compiled from: PerspectiveTransform */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final float f31501a;

    /* renamed from: b  reason: collision with root package name */
    private final float f31502b;

    /* renamed from: c  reason: collision with root package name */
    private final float f31503c;

    /* renamed from: d  reason: collision with root package name */
    private final float f31504d;

    /* renamed from: e  reason: collision with root package name */
    private final float f31505e;

    /* renamed from: f  reason: collision with root package name */
    private final float f31506f;

    /* renamed from: g  reason: collision with root package name */
    private final float f31507g;

    /* renamed from: h  reason: collision with root package name */
    private final float f31508h;

    /* renamed from: i  reason: collision with root package name */
    private final float f31509i;

    private k(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f31501a = f10;
        this.f31502b = f13;
        this.f31503c = f16;
        this.f31504d = f11;
        this.f31505e = f14;
        this.f31506f = f17;
        this.f31507g = f12;
        this.f31508h = f15;
        this.f31509i = f18;
    }

    public static k b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return d(f18, f19, f20, f21, f22, f23, f24, f25).e(c(f10, f11, f12, f13, f14, f15, f16, f17));
    }

    public static k c(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return d(f10, f11, f12, f13, f14, f15, f16, f17).a();
    }

    public static k d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new k(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float f25 = ((f23 * f18) - (f21 * f19)) / f24;
        float f26 = ((f20 * f19) - (f18 * f22)) / f24;
        return new k((f25 * f12) + (f12 - f10), (f26 * f16) + (f16 - f10), f10, (f13 - f11) + (f25 * f13), (f17 - f11) + (f26 * f17), f11, f25, f26, 1.0f);
    }

    /* access modifiers changed from: package-private */
    public k a() {
        float f10 = this.f31505e;
        float f11 = this.f31509i;
        float f12 = this.f31506f;
        float f13 = this.f31508h;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = this.f31507g;
        float f16 = this.f31504d;
        float f17 = (f12 * f15) - (f16 * f11);
        float f18 = (f16 * f13) - (f10 * f15);
        float f19 = this.f31503c;
        float f20 = this.f31502b;
        float f21 = (f19 * f13) - (f20 * f11);
        float f22 = this.f31501a;
        return new k(f14, f17, f18, f21, (f11 * f22) - (f19 * f15), (f15 * f20) - (f13 * f22), (f20 * f12) - (f19 * f10), (f19 * f16) - (f12 * f22), (f22 * f10) - (f20 * f16));
    }

    /* access modifiers changed from: package-private */
    public k e(k kVar) {
        k kVar2 = kVar;
        float f10 = this.f31501a;
        float f11 = kVar2.f31501a;
        float f12 = this.f31504d;
        float f13 = kVar2.f31502b;
        float f14 = this.f31507g;
        float f15 = kVar2.f31503c;
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = kVar2.f31504d;
        float f18 = kVar2.f31505e;
        float f19 = kVar2.f31506f;
        float f20 = (f10 * f17) + (f12 * f18) + (f14 * f19);
        float f21 = kVar2.f31507g;
        float f22 = kVar2.f31508h;
        float f23 = kVar2.f31509i;
        float f24 = (f10 * f21) + (f12 * f22) + (f14 * f23);
        float f25 = this.f31502b;
        float f26 = f24;
        float f27 = this.f31505e;
        float f28 = f20;
        float f29 = this.f31508h;
        float f30 = (f25 * f11) + (f27 * f13) + (f29 * f15);
        float f31 = (f29 * f23) + (f25 * f21) + (f27 * f22);
        float f32 = this.f31503c;
        float f33 = this.f31506f;
        float f34 = (f11 * f32) + (f13 * f33);
        float f35 = this.f31509i;
        float f36 = (f32 * f21) + (f33 * f22) + (f35 * f23);
        return new k(f16, f28, f26, f30, (f25 * f17) + (f27 * f18) + (f29 * f19), f31, (f15 * f35) + f34, (f17 * f32) + (f18 * f33) + (f19 * f35), f36);
    }

    public void f(float[] fArr) {
        float[] fArr2 = fArr;
        int length = fArr2.length;
        float f10 = this.f31501a;
        float f11 = this.f31502b;
        float f12 = this.f31503c;
        float f13 = this.f31504d;
        float f14 = this.f31505e;
        float f15 = this.f31506f;
        float f16 = this.f31507g;
        float f17 = this.f31508h;
        float f18 = this.f31509i;
        for (int i10 = 0; i10 < length; i10 += 2) {
            float f19 = fArr2[i10];
            int i11 = i10 + 1;
            float f20 = fArr2[i11];
            float f21 = (f12 * f19) + (f15 * f20) + f18;
            fArr2[i10] = (((f10 * f19) + (f13 * f20)) + f16) / f21;
            fArr2[i11] = (((f19 * f11) + (f20 * f14)) + f17) / f21;
        }
    }
}
