package com.applovin.impl;

import java.util.List;

public final class h7 extends bk {

    /* renamed from: o  reason: collision with root package name */
    private final i7 f8246o;

    public h7(List list) {
        super("DvbDecoder");
        yg ygVar = new yg((byte[]) list.get(0));
        this.f8246o = new i7(ygVar.C(), ygVar.C());
    }

    /* access modifiers changed from: protected */
    public kl a(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f8246o.d();
        }
        return new j7(this.f8246o.a(bArr, i10));
    }
}
