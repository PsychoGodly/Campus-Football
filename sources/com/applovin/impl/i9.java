package com.applovin.impl;

import android.opengl.Matrix;

final class i9 {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f8504a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f8505b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    private final fo f8506c = new fo();

    /* renamed from: d  reason: collision with root package name */
    private boolean f8507d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
        float f12 = fArr2[10] / sqrt;
        fArr[0] = f12;
        float f13 = fArr2[8];
        fArr[2] = f13 / sqrt;
        fArr[8] = (-f13) / sqrt;
        fArr[10] = f12;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees((double) length), f10 / length, f11 / length, f12 / length);
            return;
        }
        Matrix.setIdentityM(fArr, 0);
    }

    public boolean a(float[] fArr, long j10) {
        float[] fArr2 = (float[]) this.f8506c.c(j10);
        if (fArr2 == null) {
            return false;
        }
        b(this.f8505b, fArr2);
        if (!this.f8507d) {
            a(this.f8504a, this.f8505b);
            this.f8507d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f8504a, 0, this.f8505b, 0);
        return true;
    }

    public void a() {
        this.f8506c.a();
        this.f8507d = false;
    }

    public void a(long j10, float[] fArr) {
        this.f8506c.a(j10, (Object) fArr);
    }
}
