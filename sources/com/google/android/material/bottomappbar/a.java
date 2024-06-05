package com.google.android.material.bottomappbar;

import n6.f;
import n6.m;

/* compiled from: BottomAppBarTopEdgeTreatment */
public class a extends f implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private float f25447a;

    /* renamed from: b  reason: collision with root package name */
    private float f25448b;

    /* renamed from: c  reason: collision with root package name */
    private float f25449c;

    /* renamed from: d  reason: collision with root package name */
    private float f25450d;

    /* renamed from: f  reason: collision with root package name */
    private float f25451f;

    public void a(float f10, float f11, float f12, m mVar) {
        float f13 = f10;
        m mVar2 = mVar;
        float f14 = this.f25449c;
        if (f14 == 0.0f) {
            mVar2.l(f13, 0.0f);
            return;
        }
        float f15 = ((this.f25448b * 2.0f) + f14) / 2.0f;
        float f16 = f12 * this.f25447a;
        float f17 = f11 + this.f25451f;
        float f18 = (this.f25450d * f12) + ((1.0f - f12) * f15);
        if (f18 / f15 >= 1.0f) {
            mVar2.l(f13, 0.0f);
            return;
        }
        float f19 = f15 + f16;
        float f20 = f18 + f16;
        float sqrt = (float) Math.sqrt((double) ((f19 * f19) - (f20 * f20)));
        float f21 = f17 - sqrt;
        float f22 = f17 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f20)));
        float f23 = 90.0f - degrees;
        mVar2.l(f21, 0.0f);
        float f24 = f16 * 2.0f;
        float f25 = degrees;
        mVar.a(f21 - f16, 0.0f, f21 + f16, f24, 270.0f, degrees);
        mVar.a(f17 - f15, (-f15) - f18, f17 + f15, f15 - f18, 180.0f - f23, (f23 * 2.0f) - 180.0f);
        mVar.a(f22 - f16, 0.0f, f22 + f16, f24, 270.0f - f25, f25);
        mVar2.l(f13, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.f25450d;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f25448b;
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.f25447a;
    }

    public float e() {
        return this.f25449c;
    }

    /* access modifiers changed from: package-private */
    public void f(float f10) {
        this.f25450d = f10;
    }

    /* access modifiers changed from: package-private */
    public void g(float f10) {
        this.f25448b = f10;
    }

    /* access modifiers changed from: package-private */
    public void i(float f10) {
        this.f25447a = f10;
    }

    public void j(float f10) {
        this.f25449c = f10;
    }

    /* access modifiers changed from: package-private */
    public void k(float f10) {
        this.f25451f = f10;
    }
}
