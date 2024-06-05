package io.grpc.internal;

import dd.j1;
import dd.k;
import dd.y0;
import io.grpc.internal.r;
import r6.o;

/* compiled from: FailingClientStream */
public final class f0 extends o1 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f34896b;

    /* renamed from: c  reason: collision with root package name */
    private final j1 f34897c;

    /* renamed from: d  reason: collision with root package name */
    private final r.a f34898d;

    /* renamed from: e  reason: collision with root package name */
    private final k[] f34899e;

    public f0(j1 j1Var, k[] kVarArr) {
        this(j1Var, r.a.PROCESSED, kVarArr);
    }

    public void n(x0 x0Var) {
        x0Var.b("error", this.f34897c).b("progress", this.f34898d);
    }

    public void q(r rVar) {
        o.v(!this.f34896b, "already started");
        this.f34896b = true;
        for (k i10 : this.f34899e) {
            i10.i(this.f34897c);
        }
        rVar.d(this.f34897c, this.f34898d, new y0());
    }

    public f0(j1 j1Var, r.a aVar, k[] kVarArr) {
        o.e(!j1Var.o(), "error must not be OK");
        this.f34897c = j1Var;
        this.f34898d = aVar;
        this.f34899e = kVarArr;
    }
}
