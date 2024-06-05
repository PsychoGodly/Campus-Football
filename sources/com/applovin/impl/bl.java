package com.applovin.impl;

import com.applovin.impl.ej;

public final class bl implements k8 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final long f6735a;

    /* renamed from: b  reason: collision with root package name */
    private final k8 f6736b;

    public bl(long j10, k8 k8Var) {
        this.f6735a = j10;
        this.f6736b = k8Var;
    }

    public void c() {
        this.f6736b.c();
    }

    public void a(ej ejVar) {
        this.f6736b.a(new a(ejVar));
    }

    public ro a(int i10, int i11) {
        return this.f6736b.a(i10, i11);
    }

    class a implements ej {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ej f6737a;

        a(ej ejVar) {
            this.f6737a = ejVar;
        }

        public ej.a b(long j10) {
            ej.a b10 = this.f6737a.b(j10);
            gj gjVar = b10.f7449a;
            gj gjVar2 = new gj(gjVar.f8034a, gjVar.f8035b + bl.this.f6735a);
            gj gjVar3 = b10.f7450b;
            return new ej.a(gjVar2, new gj(gjVar3.f8034a, gjVar3.f8035b + bl.this.f6735a));
        }

        public long d() {
            return this.f6737a.d();
        }

        public boolean b() {
            return this.f6737a.b();
        }
    }
}
