package com.applovin.impl;

import com.applovin.impl.ta;
import java.io.EOFException;

public final class va {

    /* renamed from: a  reason: collision with root package name */
    private final yg f12720a = new yg(10);

    public we a(j8 j8Var, ta.a aVar) {
        we weVar = null;
        int i10 = 0;
        while (true) {
            try {
                j8Var.c(this.f12720a.c(), 0, 10);
                this.f12720a.f(0);
                if (this.f12720a.z() != 4801587) {
                    break;
                }
                this.f12720a.g(3);
                int v10 = this.f12720a.v();
                int i11 = v10 + 10;
                if (weVar == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f12720a.c(), 0, bArr, 0, 10);
                    j8Var.c(bArr, 10, v10);
                    weVar = new ta(aVar).a(bArr, i11);
                } else {
                    j8Var.c(v10);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        j8Var.b();
        j8Var.c(i10);
        return weVar;
    }
}
