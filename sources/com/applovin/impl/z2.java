package com.applovin.impl;

import java.util.Collections;
import java.util.List;

final class z2 implements kl {

    /* renamed from: a  reason: collision with root package name */
    private final List f13735a;

    public z2(List list) {
        this.f13735a = list;
    }

    public int a() {
        return 1;
    }

    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public long a(int i10) {
        a1.a(i10 == 0);
        return 0;
    }

    public List b(long j10) {
        return j10 >= 0 ? this.f13735a : Collections.emptyList();
    }
}
