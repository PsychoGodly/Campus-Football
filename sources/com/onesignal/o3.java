package com.onesignal;

import android.view.animation.Interpolator;

/* compiled from: OneSignalBounceInterpolator */
class o3 implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private double f28076a = 1.0d;

    /* renamed from: b  reason: collision with root package name */
    private double f28077b = 10.0d;

    o3(double d10, double d11) {
        this.f28076a = d10;
        this.f28077b = d11;
    }

    public float getInterpolation(float f10) {
        return (float) ((Math.pow(2.718281828459045d, ((double) (-f10)) / this.f28076a) * -1.0d * Math.cos(this.f28077b * ((double) f10))) + 1.0d);
    }
}
