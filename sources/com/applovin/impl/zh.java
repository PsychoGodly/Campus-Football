package com.applovin.impl;

final class zh {

    /* renamed from: a  reason: collision with root package name */
    public final a f13861a;

    /* renamed from: b  reason: collision with root package name */
    public final a f13862b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13863c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13864d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final b[] f13865a;

        public a(b... bVarArr) {
            this.f13865a = bVarArr;
        }

        public b a(int i10) {
            return this.f13865a[i10];
        }

        public int a() {
            return this.f13865a.length;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f13866a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13867b;

        /* renamed from: c  reason: collision with root package name */
        public final float[] f13868c;

        /* renamed from: d  reason: collision with root package name */
        public final float[] f13869d;

        public b(int i10, float[] fArr, float[] fArr2, int i11) {
            this.f13866a = i10;
            a1.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f13868c = fArr;
            this.f13869d = fArr2;
            this.f13867b = i11;
        }

        public int a() {
            return this.f13868c.length / 3;
        }
    }

    public zh(a aVar, int i10) {
        this(aVar, aVar, i10);
    }

    public static zh a(float f10, int i10, int i11, float f11, float f12, int i12) {
        int i13;
        float f13;
        float[] fArr;
        int i14;
        int i15;
        int i16;
        float f14 = f10;
        int i17 = i10;
        int i18 = i11;
        float f15 = f11;
        float f16 = f12;
        a1.a(f14 > 0.0f);
        a1.a(i17 >= 1);
        a1.a(i18 >= 1);
        a1.a(f15 > 0.0f && f15 <= 180.0f);
        a1.a(f16 > 0.0f && f16 <= 360.0f);
        float radians = (float) Math.toRadians((double) f15);
        float radians2 = (float) Math.toRadians((double) f16);
        float f17 = radians / ((float) i17);
        float f18 = radians2 / ((float) i18);
        int i19 = i18 + 1;
        int i20 = ((i19 * 2) + 2) * i17;
        float[] fArr2 = new float[(i20 * 3)];
        float[] fArr3 = new float[(i20 * 2)];
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i21 < i17) {
            float f19 = radians / 2.0f;
            float f20 = (((float) i21) * f17) - f19;
            int i24 = i21 + 1;
            float f21 = (((float) i24) * f17) - f19;
            int i25 = 0;
            while (i25 < i19) {
                float f22 = f20;
                int i26 = i24;
                int i27 = 0;
                int i28 = 2;
                while (i27 < i28) {
                    if (i27 == 0) {
                        f13 = f22;
                        i13 = i19;
                    } else {
                        i13 = i19;
                        f13 = f21;
                    }
                    float f23 = ((float) i25) * f18;
                    float f24 = f18;
                    int i29 = i25;
                    double d10 = (double) f14;
                    float f25 = f17;
                    int i30 = i27;
                    double d11 = (double) ((f23 + 3.1415927f) - (radians2 / 2.0f));
                    double d12 = (double) f13;
                    float[] fArr4 = fArr3;
                    float f26 = f21;
                    fArr2[i22] = -((float) (Math.sin(d11) * d10 * Math.cos(d12)));
                    float f27 = radians;
                    float f28 = radians2;
                    fArr2[i22 + 1] = (float) (d10 * Math.sin(d12));
                    int i31 = i22 + 3;
                    fArr2[i22 + 2] = (float) (d10 * Math.cos(d11) * Math.cos(d12));
                    fArr4[i23] = f23 / f28;
                    int i32 = i23 + 2;
                    fArr4[i23 + 1] = (((float) (i21 + i30)) * f25) / f27;
                    if (i29 == 0 && i30 == 0) {
                        i16 = i11;
                        i15 = i29;
                        i14 = i30;
                    } else {
                        i16 = i11;
                        i15 = i29;
                        i14 = i30;
                        if (!(i15 == i16 && i14 == 1)) {
                            fArr = fArr4;
                            i28 = 2;
                            i23 = i32;
                            i22 = i31;
                            int i33 = i14 + 1;
                            fArr3 = fArr;
                            radians = f27;
                            i19 = i13;
                            f18 = f24;
                            f17 = f25;
                            f21 = f26;
                            i27 = i33;
                            i18 = i16;
                            i25 = i15;
                            radians2 = f28;
                        }
                    }
                    System.arraycopy(fArr2, i22, fArr2, i31, 3);
                    i22 += 6;
                    fArr = fArr4;
                    i28 = 2;
                    System.arraycopy(fArr, i23, fArr, i32, 2);
                    i23 += 4;
                    int i332 = i14 + 1;
                    fArr3 = fArr;
                    radians = f27;
                    i19 = i13;
                    f18 = f24;
                    f17 = f25;
                    f21 = f26;
                    i27 = i332;
                    i18 = i16;
                    i25 = i15;
                    radians2 = f28;
                }
                float f29 = radians2;
                float f30 = f17;
                float f31 = f18;
                int i34 = i19;
                float[] fArr5 = fArr3;
                float f32 = f21;
                int i35 = i25;
                int i36 = i18;
                float f33 = radians;
                int i37 = i35 + 1;
                i24 = i26;
                radians2 = f29;
                f21 = f32;
                f20 = f22;
                int i38 = i37;
                i18 = i36;
                i25 = i38;
            }
            i17 = i10;
            i21 = i24;
        }
        return new zh(new a(new b(0, fArr2, fArr3, 1)), i12);
    }

    public zh(a aVar, a aVar2, int i10) {
        this.f13861a = aVar;
        this.f13862b = aVar2;
        this.f13863c = i10;
        this.f13864d = aVar == aVar2;
    }

    public static zh a(int i10) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i10);
    }
}
