package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

final class ug implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f12581a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f12582b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    private final float[] f12583c = new float[16];

    /* renamed from: d  reason: collision with root package name */
    private final float[] f12584d = new float[3];

    /* renamed from: f  reason: collision with root package name */
    private final Display f12585f;

    /* renamed from: g  reason: collision with root package name */
    private final a[] f12586g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12587h;

    public interface a {
        void a(float[] fArr, float f10);
    }

    public ug(Display display, a... aVarArr) {
        this.f12585f = display;
        this.f12586g = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f12582b);
        SensorManager.getOrientation(this.f12582b, this.f12584d);
        return this.f12584d[2];
    }

    private void b(float[] fArr) {
        if (!this.f12587h) {
            i9.a(this.f12583c, fArr);
            this.f12587h = true;
        }
        float[] fArr2 = this.f12582b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f12582b, 0, this.f12583c, 0);
    }

    private static void c(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f12581a, sensorEvent.values);
        a(this.f12581a, this.f12585f.getRotation());
        float a10 = a(this.f12581a);
        c(this.f12581a);
        b(this.f12581a);
        a(this.f12581a, a10);
    }

    private void a(float[] fArr, float f10) {
        for (a a10 : this.f12586g) {
            a10.a(fArr, f10);
        }
    }

    private void a(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 130;
            int i12 = 129;
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 == 2) {
                i11 = 129;
                i12 = 130;
            } else if (i10 == 3) {
                i12 = 1;
            } else {
                throw new IllegalStateException();
            }
            float[] fArr2 = this.f12582b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f12582b, i11, i12, fArr);
        }
    }
}
