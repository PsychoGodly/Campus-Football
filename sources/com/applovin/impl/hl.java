package com.applovin.impl;

import java.util.Collections;
import java.util.List;

final class hl implements kl {

    /* renamed from: a  reason: collision with root package name */
    private final z4[] f8329a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f8330b;

    public hl(z4[] z4VarArr, long[] jArr) {
        this.f8329a = z4VarArr;
        this.f8330b = jArr;
    }

    public long a(int i10) {
        boolean z10 = true;
        a1.a(i10 >= 0);
        if (i10 >= this.f8330b.length) {
            z10 = false;
        }
        a1.a(z10);
        return this.f8330b[i10];
    }

    public List b(long j10) {
        z4 z4Var;
        int b10 = yp.b(this.f8330b, j10, true, false);
        if (b10 == -1 || (z4Var = this.f8329a[b10]) == z4.f13750s) {
            return Collections.emptyList();
        }
        return Collections.singletonList(z4Var);
    }

    public int a() {
        return this.f8330b.length;
    }

    public int a(long j10) {
        int a10 = yp.a(this.f8330b, j10, false, false);
        if (a10 < this.f8330b.length) {
            return a10;
        }
        return -1;
    }
}
