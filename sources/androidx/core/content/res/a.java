package androidx.core.content.res;

import androidx.core.graphics.b;

/* compiled from: CamColor */
class a {

    /* renamed from: a  reason: collision with root package name */
    private final float f2840a;

    /* renamed from: b  reason: collision with root package name */
    private final float f2841b;

    /* renamed from: c  reason: collision with root package name */
    private final float f2842c;

    /* renamed from: d  reason: collision with root package name */
    private final float f2843d;

    /* renamed from: e  reason: collision with root package name */
    private final float f2844e;

    /* renamed from: f  reason: collision with root package name */
    private final float f2845f;

    /* renamed from: g  reason: collision with root package name */
    private final float f2846g;

    /* renamed from: h  reason: collision with root package name */
    private final float f2847h;

    /* renamed from: i  reason: collision with root package name */
    private final float f2848i;

    a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f2840a = f10;
        this.f2841b = f11;
        this.f2842c = f12;
        this.f2843d = f13;
        this.f2844e = f14;
        this.f2845f = f15;
        this.f2846g = f16;
        this.f2847h = f17;
        this.f2848i = f18;
    }

    private static a b(float f10, float f11, float f12) {
        float f13 = 1000.0f;
        a aVar = null;
        float f14 = 1000.0f;
        float f15 = 100.0f;
        float f16 = 0.0f;
        while (Math.abs(f16 - f15) > 0.01f) {
            float f17 = ((f15 - f16) / 2.0f) + f16;
            int p10 = e(f17, f11, f10).p();
            float b10 = b.b(p10);
            float abs = Math.abs(f12 - b10);
            if (abs < 0.2f) {
                a c10 = c(p10);
                float a10 = c10.a(e(c10.k(), c10.i(), f10));
                if (a10 <= 1.0f) {
                    aVar = c10;
                    f13 = abs;
                    f14 = a10;
                }
            }
            if (f13 == 0.0f && f14 == 0.0f) {
                break;
            } else if (b10 < f12) {
                f16 = f17;
            } else {
                f15 = f17;
            }
        }
        return aVar;
    }

    static a c(int i10) {
        return d(i10, l.f2885k);
    }

    static a d(int i10, l lVar) {
        float[] f10 = b.f(i10);
        float[][] fArr = b.f2849a;
        float f11 = (f10[0] * fArr[0][0]) + (f10[1] * fArr[0][1]) + (f10[2] * fArr[0][2]);
        float f12 = (f10[0] * fArr[1][0]) + (f10[1] * fArr[1][1]) + (f10[2] * fArr[1][2]);
        float f13 = (f10[0] * fArr[2][0]) + (f10[1] * fArr[2][1]) + (f10[2] * fArr[2][2]);
        float f14 = lVar.i()[0] * f11;
        float f15 = lVar.i()[1] * f12;
        float f16 = lVar.i()[2] * f13;
        float pow = (float) Math.pow(((double) (lVar.c() * Math.abs(f14))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (lVar.c() * Math.abs(f15))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (lVar.c() * Math.abs(f16))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f14) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = (double) signum3;
        float f17 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d10)) / 11.0f;
        float f18 = ((float) (((double) (signum + signum2)) - (d10 * 2.0d))) / 9.0f;
        float f19 = signum2 * 20.0f;
        float f20 = (((signum * 20.0f) + f19) + (21.0f * signum3)) / 20.0f;
        float f21 = (((signum * 40.0f) + f19) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f18, (double) f17)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f22 = atan2;
        float f23 = (3.1415927f * f22) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f21 * lVar.f()) / lVar.a()), (double) (lVar.b() * lVar.j()))) * 100.0f;
        float d11 = lVar.d() * (4.0f / lVar.b()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (lVar.a() + 4.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) lVar.e()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) f22) < 20.14d ? 360.0f + f22 : f22)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((double) ((f17 * f17) + (f18 * f18))))) / (f20 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float d12 = sqrt * lVar.d();
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * lVar.b()) / (lVar.a() + 4.0f)))) * 50.0f;
        float f24 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * d12) + 1.0f))) * 43.85965f;
        double d13 = (double) f23;
        return new a(f22, sqrt, pow4, d11, d12, sqrt2, f24, log * ((float) Math.cos(d13)), log * ((float) Math.sin(d13)));
    }

    private static a e(float f10, float f11, float f12) {
        return f(f10, f11, f12, l.f2885k);
    }

    private static a f(float f10, float f11, float f12, l lVar) {
        float f13 = f10;
        double d10 = ((double) f13) / 100.0d;
        float b10 = (4.0f / lVar.b()) * ((float) Math.sqrt(d10)) * (lVar.a() + 4.0f) * lVar.d();
        float d11 = f11 * lVar.d();
        float sqrt = ((float) Math.sqrt((double) (((f11 / ((float) Math.sqrt(d10))) * lVar.b()) / (lVar.a() + 4.0f)))) * 50.0f;
        float f14 = (1.7f * f13) / ((0.007f * f13) + 1.0f);
        float log = ((float) Math.log((((double) d11) * 0.0228d) + 1.0d)) * 43.85965f;
        double d12 = (double) ((3.1415927f * f12) / 180.0f);
        return new a(f12, f11, f13, b10, d11, sqrt, f14, log * ((float) Math.cos(d12)), log * ((float) Math.sin(d12)));
    }

    static int m(float f10, float f11, float f12) {
        return n(f10, f11, f12, l.f2885k);
    }

    static int n(float f10, float f11, float f12, l lVar) {
        float f13;
        if (((double) f11) < 1.0d || ((double) Math.round(f12)) <= 0.0d || ((double) Math.round(f12)) >= 100.0d) {
            return b.a(f12);
        }
        if (f10 < 0.0f) {
            f13 = 0.0f;
        } else {
            f13 = Math.min(360.0f, f10);
        }
        float f14 = f11;
        a aVar = null;
        float f15 = 0.0f;
        boolean z10 = true;
        while (Math.abs(f15 - f11) >= 0.4f) {
            a b10 = b(f13, f14, f12);
            if (z10) {
                if (b10 != null) {
                    return b10.o(lVar);
                }
                z10 = false;
            } else if (b10 == null) {
                f11 = f14;
            } else {
                f15 = f14;
                aVar = b10;
            }
            f14 = ((f11 - f15) / 2.0f) + f15;
        }
        if (aVar == null) {
            return b.a(f12);
        }
        return aVar.o(lVar);
    }

    /* access modifiers changed from: package-private */
    public float a(a aVar) {
        float l10 = l() - aVar.l();
        float g10 = g() - aVar.g();
        float h10 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((double) ((l10 * l10) + (g10 * g10) + (h10 * h10))), 0.63d) * 1.41d);
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f2847h;
    }

    /* access modifiers changed from: package-private */
    public float h() {
        return this.f2848i;
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f2841b;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f2840a;
    }

    /* access modifiers changed from: package-private */
    public float k() {
        return this.f2842c;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f2846g;
    }

    /* access modifiers changed from: package-private */
    public int o(l lVar) {
        float pow = (float) Math.pow(((double) ((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(((double) k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, (double) lVar.e()), 0.73d), 1.1111111111111112d);
        double j10 = (double) ((j() * 3.1415927f) / 180.0f);
        float a10 = lVar.a() * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) lVar.b())) / ((double) lVar.j())));
        float cos = ((float) (Math.cos(2.0d + j10) + 3.8d)) * 0.25f * 3846.1538f * lVar.g() * lVar.h();
        float f10 = a10 / lVar.f();
        float sin = (float) Math.sin(j10);
        float cos2 = (float) Math.cos(j10);
        float f11 = (((0.305f + f10) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f12 = cos2 * f11;
        float f13 = f11 * sin;
        float f14 = f10 * 460.0f;
        float f15 = (((451.0f * f12) + f14) + (288.0f * f13)) / 1403.0f;
        float f16 = ((f14 - (891.0f * f12)) - (261.0f * f13)) / 1403.0f;
        float f17 = ((f14 - (f12 * 220.0f)) - (f13 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f15) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f15)) * 27.13d) / (400.0d - ((double) Math.abs(f15))))), 2.380952380952381d));
        float signum2 = Math.signum(f16) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f16)) * 27.13d) / (400.0d - ((double) Math.abs(f16))))), 2.380952380952381d));
        float signum3 = Math.signum(f17) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f17)) * 27.13d) / (400.0d - ((double) Math.abs(f17))))), 2.380952380952381d));
        float f18 = signum / lVar.i()[0];
        float f19 = signum2 / lVar.i()[1];
        float f20 = signum3 / lVar.i()[2];
        float[][] fArr = b.f2850b;
        return b.a((double) ((fArr[0][0] * f18) + (fArr[0][1] * f19) + (fArr[0][2] * f20)), (double) ((fArr[1][0] * f18) + (fArr[1][1] * f19) + (fArr[1][2] * f20)), (double) ((f18 * fArr[2][0]) + (f19 * fArr[2][1]) + (f20 * fArr[2][2])));
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return o(l.f2885k);
    }
}
