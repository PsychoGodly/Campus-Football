package com.applovin.impl;

import java.util.ArrayList;
import java.util.Map;

public abstract class z1 implements g5 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f13730a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f13731b = new ArrayList(1);

    /* renamed from: c  reason: collision with root package name */
    private int f13732c;

    /* renamed from: d  reason: collision with root package name */
    private j5 f13733d;

    protected z1(boolean z10) {
        this.f13730a = z10;
    }

    public final void a(yo yoVar) {
        a1.a((Object) yoVar);
        if (!this.f13731b.contains(yoVar)) {
            this.f13731b.add(yoVar);
            this.f13732c++;
        }
    }

    /* access modifiers changed from: protected */
    public final void b(j5 j5Var) {
        for (int i10 = 0; i10 < this.f13732c; i10++) {
            ((yo) this.f13731b.get(i10)).b(this, j5Var, this.f13730a);
        }
    }

    /* access modifiers changed from: protected */
    public final void c(j5 j5Var) {
        this.f13733d = j5Var;
        for (int i10 = 0; i10 < this.f13732c; i10++) {
            ((yo) this.f13731b.get(i10)).a(this, j5Var, this.f13730a);
        }
    }

    /* access modifiers changed from: protected */
    public final void d(int i10) {
        j5 j5Var = (j5) yp.a((Object) this.f13733d);
        for (int i11 = 0; i11 < this.f13732c; i11++) {
            ((yo) this.f13731b.get(i11)).a(this, j5Var, this.f13730a, i10);
        }
    }

    public /* synthetic */ Map e() {
        return dx.a(this);
    }

    /* access modifiers changed from: protected */
    public final void g() {
        j5 j5Var = (j5) yp.a((Object) this.f13733d);
        for (int i10 = 0; i10 < this.f13732c; i10++) {
            ((yo) this.f13731b.get(i10)).c(this, j5Var, this.f13730a);
        }
        this.f13733d = null;
    }
}
