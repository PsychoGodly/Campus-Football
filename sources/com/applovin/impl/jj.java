package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import java.util.List;

public final class jj {

    /* renamed from: a  reason: collision with root package name */
    private final List f8779a;

    /* renamed from: b  reason: collision with root package name */
    private final ro[] f8780b;

    public jj(List list) {
        this.f8779a = list;
        this.f8780b = new ro[list.size()];
    }

    public void a(long j10, yg ygVar) {
        a3.a(j10, ygVar, this.f8780b);
    }

    public void a(k8 k8Var, ep.d dVar) {
        for (int i10 = 0; i10 < this.f8780b.length; i10++) {
            dVar.a();
            ro a10 = k8Var.a(dVar.c(), 3);
            d9 d9Var = (d9) this.f8779a.get(i10);
            String str = d9Var.f7153m;
            boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            a1.a(z10, (Object) "Invalid closed caption mime type provided: " + str);
            String str2 = d9Var.f7142a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            a10.a(new d9.b().c(str2).f(str).o(d9Var.f7145d).e(d9Var.f7144c).a(d9Var.E).a(d9Var.f7155o).a());
            this.f8780b[i10] = a10;
        }
    }
}
