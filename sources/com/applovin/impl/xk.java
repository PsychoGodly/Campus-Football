package com.applovin.impl;

import java.util.Collections;
import java.util.List;

final class xk implements kl {

    /* renamed from: a  reason: collision with root package name */
    private final List f13419a;

    /* renamed from: b  reason: collision with root package name */
    private final List f13420b;

    public xk(List list, List list2) {
        this.f13419a = list;
        this.f13420b = list2;
    }

    public long a(int i10) {
        boolean z10 = true;
        a1.a(i10 >= 0);
        if (i10 >= this.f13420b.size()) {
            z10 = false;
        }
        a1.a(z10);
        return ((Long) this.f13420b.get(i10)).longValue();
    }

    public List b(long j10) {
        int b10 = yp.b(this.f13420b, (Comparable) Long.valueOf(j10), true, false);
        if (b10 == -1) {
            return Collections.emptyList();
        }
        return (List) this.f13419a.get(b10);
    }

    public int a() {
        return this.f13420b.size();
    }

    public int a(long j10) {
        int a10 = yp.a(this.f13420b, (Comparable) Long.valueOf(j10), false, false);
        if (a10 < this.f13420b.size()) {
            return a10;
        }
        return -1;
    }
}
