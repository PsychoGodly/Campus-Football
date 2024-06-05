package com.applovin.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class lp implements kl {

    /* renamed from: a  reason: collision with root package name */
    private final hp f9257a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f9258b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f9259c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f9260d;

    /* renamed from: f  reason: collision with root package name */
    private final Map f9261f;

    public lp(hp hpVar, Map map, Map map2, Map map3) {
        this.f9257a = hpVar;
        this.f9260d = map2;
        this.f9261f = map3;
        this.f9259c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f9258b = hpVar.b();
    }

    public long a(int i10) {
        return this.f9258b[i10];
    }

    public List b(long j10) {
        return this.f9257a.a(j10, this.f9259c, this.f9260d, this.f9261f);
    }

    public int a() {
        return this.f9258b.length;
    }

    public int a(long j10) {
        int a10 = yp.a(this.f9258b, j10, false, false);
        if (a10 < this.f9258b.length) {
            return a10;
        }
        return -1;
    }
}
