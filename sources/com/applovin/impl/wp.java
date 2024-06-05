package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import java.util.List;

final class wp {

    /* renamed from: a  reason: collision with root package name */
    private final List f13130a;

    /* renamed from: b  reason: collision with root package name */
    private final ro[] f13131b;

    public wp(List list) {
        this.f13130a = list;
        this.f13131b = new ro[list.size()];
    }

    public void a(long j10, yg ygVar) {
        if (ygVar.a() >= 9) {
            int j11 = ygVar.j();
            int j12 = ygVar.j();
            int w10 = ygVar.w();
            if (j11 == 434 && j12 == 1195456820 && w10 == 3) {
                a3.b(j10, ygVar, this.f13131b);
            }
        }
    }

    public void a(k8 k8Var, ep.d dVar) {
        for (int i10 = 0; i10 < this.f13131b.length; i10++) {
            dVar.a();
            ro a10 = k8Var.a(dVar.c(), 3);
            d9 d9Var = (d9) this.f13130a.get(i10);
            String str = d9Var.f7153m;
            boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            a1.a(z10, (Object) "Invalid closed caption mime type provided: " + str);
            a10.a(new d9.b().c(dVar.b()).f(str).o(d9Var.f7145d).e(d9Var.f7144c).a(d9Var.E).a(d9Var.f7155o).a());
            this.f13131b[i10] = a10;
        }
    }
}
