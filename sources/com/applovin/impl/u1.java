package com.applovin.impl;

public final class u1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f12479a;

    /* renamed from: b  reason: collision with root package name */
    public final float f12480b;

    public u1(int i10, float f10) {
        this.f12479a = i10;
        this.f12480b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u1.class != obj.getClass()) {
            return false;
        }
        u1 u1Var = (u1) obj;
        if (this.f12479a == u1Var.f12479a && Float.compare(u1Var.f12480b, this.f12480b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12479a + 527) * 31) + Float.floatToIntBits(this.f12480b);
    }
}
