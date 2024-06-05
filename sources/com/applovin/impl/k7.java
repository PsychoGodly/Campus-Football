package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.ro;
import java.util.Collections;
import java.util.List;

public final class k7 implements o7 {

    /* renamed from: a  reason: collision with root package name */
    private final List f8919a;

    /* renamed from: b  reason: collision with root package name */
    private final ro[] f8920b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8921c;

    /* renamed from: d  reason: collision with root package name */
    private int f8922d;

    /* renamed from: e  reason: collision with root package name */
    private int f8923e;

    /* renamed from: f  reason: collision with root package name */
    private long f8924f = -9223372036854775807L;

    public k7(List list) {
        this.f8919a = list;
        this.f8920b = new ro[list.size()];
    }

    private boolean a(yg ygVar, int i10) {
        if (ygVar.a() == 0) {
            return false;
        }
        if (ygVar.w() != i10) {
            this.f8921c = false;
        }
        this.f8922d--;
        return this.f8921c;
    }

    public void b() {
        if (this.f8921c) {
            if (this.f8924f != -9223372036854775807L) {
                for (ro a10 : this.f8920b) {
                    a10.a(this.f8924f, 1, this.f8923e, 0, (ro.a) null);
                }
            }
            this.f8921c = false;
        }
    }

    public void a(yg ygVar) {
        if (!this.f8921c) {
            return;
        }
        if (this.f8922d != 2 || a(ygVar, 32)) {
            if (this.f8922d != 1 || a(ygVar, 0)) {
                int d10 = ygVar.d();
                int a10 = ygVar.a();
                for (ro a11 : this.f8920b) {
                    ygVar.f(d10);
                    a11.a(ygVar, a10);
                }
                this.f8923e += a10;
            }
        }
    }

    public void a(k8 k8Var, ep.d dVar) {
        for (int i10 = 0; i10 < this.f8920b.length; i10++) {
            ep.a aVar = (ep.a) this.f8919a.get(i10);
            dVar.a();
            ro a10 = k8Var.a(dVar.c(), 3);
            a10.a(new d9.b().c(dVar.b()).f("application/dvbsubs").a(Collections.singletonList(aVar.f7489c)).e(aVar.f7487a).a());
            this.f8920b[i10] = a10;
        }
    }

    public void a(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f8921c = true;
            if (j10 != -9223372036854775807L) {
                this.f8924f = j10;
            }
            this.f8923e = 0;
            this.f8922d = 2;
        }
    }

    public void a() {
        this.f8921c = false;
        this.f8924f = -9223372036854775807L;
    }
}
