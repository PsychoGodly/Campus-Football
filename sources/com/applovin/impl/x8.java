package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.y8;

public final class x8 implements ej {

    /* renamed from: a  reason: collision with root package name */
    private final y8 f13300a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13301b;

    public x8(y8 y8Var, long j10) {
        this.f13300a = y8Var;
        this.f13301b = j10;
    }

    private gj a(long j10, long j11) {
        return new gj((j10 * 1000000) / ((long) this.f13300a.f13543e), this.f13301b + j11);
    }

    public ej.a b(long j10) {
        long j11;
        a1.b((Object) this.f13300a.f13549k);
        y8 y8Var = this.f13300a;
        y8.a aVar = y8Var.f13549k;
        long[] jArr = aVar.f13551a;
        long[] jArr2 = aVar.f13552b;
        int b10 = yp.b(jArr, y8Var.a(j10), true, false);
        long j12 = 0;
        if (b10 == -1) {
            j11 = 0;
        } else {
            j11 = jArr[b10];
        }
        if (b10 != -1) {
            j12 = jArr2[b10];
        }
        gj a10 = a(j11, j12);
        if (a10.f8034a == j10 || b10 == jArr.length - 1) {
            return new ej.a(a10);
        }
        int i10 = b10 + 1;
        return new ej.a(a10, a(jArr[i10], jArr2[i10]));
    }

    public boolean b() {
        return true;
    }

    public long d() {
        return this.f13300a.b();
    }
}
