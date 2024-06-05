package com.applovin.impl;

public final class ni {

    /* renamed from: b  reason: collision with root package name */
    public static final ni f9995b = new ni(false);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9996a;

    public ni(boolean z10) {
        this.f9996a = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ni.class == obj.getClass() && this.f9996a == ((ni) obj).f9996a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9996a ^ true ? 1 : 0;
    }
}
