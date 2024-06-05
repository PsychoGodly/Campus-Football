package com.applovin.impl;

public class s5 implements r4 {

    /* renamed from: a  reason: collision with root package name */
    private final long f11297a = -9223372036854775807L;

    /* renamed from: b  reason: collision with root package name */
    private final long f11298b = -9223372036854775807L;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11299c = false;

    public boolean a(nh nhVar) {
        nhVar.u();
        return true;
    }

    public boolean b(nh nhVar) {
        nhVar.b();
        return true;
    }

    public boolean c(nh nhVar) {
        if (!this.f11299c) {
            nhVar.B();
            return true;
        } else if (!b() || !nhVar.y()) {
            return true;
        } else {
            a(nhVar, -this.f11297a);
            return true;
        }
    }

    public boolean d(nh nhVar) {
        if (!this.f11299c) {
            nhVar.w();
            return true;
        } else if (!a() || !nhVar.y()) {
            return true;
        } else {
            a(nhVar, this.f11298b);
            return true;
        }
    }

    public boolean e(nh nhVar) {
        nhVar.D();
        return true;
    }

    public boolean a(nh nhVar, int i10, long j10) {
        nhVar.a(i10, j10);
        return true;
    }

    public boolean b(nh nhVar, boolean z10) {
        nhVar.a(z10);
        return true;
    }

    public boolean a(nh nhVar, int i10) {
        nhVar.a(i10);
        return true;
    }

    public boolean b() {
        return !this.f11299c || this.f11297a > 0;
    }

    public boolean a(nh nhVar, boolean z10) {
        nhVar.b(z10);
        return true;
    }

    public boolean a() {
        return !this.f11299c || this.f11298b > 0;
    }

    private static void a(nh nhVar, long j10) {
        long currentPosition = nhVar.getCurrentPosition() + j10;
        long duration = nhVar.getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        nhVar.a(Math.max(currentPosition, 0));
    }
}
