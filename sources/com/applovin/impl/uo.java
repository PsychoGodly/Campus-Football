package com.applovin.impl;

import java.util.Arrays;

public final class uo {

    /* renamed from: a  reason: collision with root package name */
    public final int f12625a;

    /* renamed from: b  reason: collision with root package name */
    private final to[] f12626b;

    /* renamed from: c  reason: collision with root package name */
    private int f12627c;

    public uo(to... toVarArr) {
        this.f12626b = toVarArr;
        this.f12625a = toVarArr.length;
    }

    public to a(int i10) {
        return this.f12626b[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f12626b, ((uo) obj).f12626b);
    }

    public int hashCode() {
        if (this.f12627c == 0) {
            this.f12627c = Arrays.hashCode(this.f12626b) + 527;
        }
        return this.f12627c;
    }
}
