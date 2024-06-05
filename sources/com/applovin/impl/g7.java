package com.applovin.impl;

import com.applovin.impl.ro;
import java.io.EOFException;

public final class g7 implements ro {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f7921a = new byte[4096];

    public /* synthetic */ int a(e5 e5Var, int i10, boolean z10) {
        return j40.a(this, e5Var, i10, z10);
    }

    public int a(e5 e5Var, int i10, boolean z10, int i11) {
        int a10 = e5Var.a(this.f7921a, 0, Math.min(this.f7921a.length, i10));
        if (a10 != -1) {
            return a10;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void a(long j10, int i10, int i11, int i12, ro.a aVar) {
    }

    public void a(d9 d9Var) {
    }

    public /* synthetic */ void a(yg ygVar, int i10) {
        j40.b(this, ygVar, i10);
    }

    public void a(yg ygVar, int i10, int i11) {
        ygVar.g(i10);
    }
}
