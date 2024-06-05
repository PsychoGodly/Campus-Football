package com.applovin.impl;

public final class gj {

    /* renamed from: c  reason: collision with root package name */
    public static final gj f8033c = new gj(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f8034a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8035b;

    public gj(long j10, long j11) {
        this.f8034a = j10;
        this.f8035b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gj.class != obj.getClass()) {
            return false;
        }
        gj gjVar = (gj) obj;
        if (this.f8034a == gjVar.f8034a && this.f8035b == gjVar.f8035b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f8034a) * 31) + ((int) this.f8035b);
    }

    public String toString() {
        return "[timeUs=" + this.f8034a + ", position=" + this.f8035b + "]";
    }
}
