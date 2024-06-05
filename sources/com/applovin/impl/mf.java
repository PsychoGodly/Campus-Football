package com.applovin.impl;

import java.util.Collections;
import java.util.List;

final class mf implements kl {

    /* renamed from: a  reason: collision with root package name */
    private final List f9798a;

    public mf(List list) {
        this.f9798a = Collections.unmodifiableList(list);
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
        return j10 >= 0 ? this.f9798a : Collections.emptyList();
    }
}
