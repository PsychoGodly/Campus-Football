package com.google.firebase.firestore;

import y7.g0;

/* compiled from: GeoPoint */
public class d0 implements Comparable<d0> {

    /* renamed from: a  reason: collision with root package name */
    private final double f26448a;

    /* renamed from: b  reason: collision with root package name */
    private final double f26449b;

    public d0(double d10, double d11) {
        if (Double.isNaN(d10) || d10 < -90.0d || d10 > 90.0d) {
            throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
        } else if (Double.isNaN(d11) || d11 < -180.0d || d11 > 180.0d) {
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        } else {
            this.f26448a = d10;
            this.f26449b = d11;
        }
    }

    /* renamed from: a */
    public int compareTo(d0 d0Var) {
        int k10 = g0.k(this.f26448a, d0Var.f26448a);
        return k10 == 0 ? g0.k(this.f26449b, d0Var.f26449b) : k10;
    }

    public double c() {
        return this.f26448a;
    }

    public double d() {
        return this.f26449b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f26448a == d0Var.f26448a && this.f26449b == d0Var.f26449b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f26448a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f26449b);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "GeoPoint { latitude=" + this.f26448a + ", longitude=" + this.f26449b + " }";
    }
}
