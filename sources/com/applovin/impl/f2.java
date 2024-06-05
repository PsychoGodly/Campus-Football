package com.applovin.impl;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;

final class f2 extends n5 {

    /* renamed from: j  reason: collision with root package name */
    private long f7580j;

    /* renamed from: k  reason: collision with root package name */
    private int f7581k;

    /* renamed from: l  reason: collision with root package name */
    private int f7582l = 32;

    public f2() {
        super(2);
    }

    private boolean b(n5 n5Var) {
        ByteBuffer byteBuffer;
        if (!m()) {
            return true;
        }
        if (this.f7581k >= this.f7582l || n5Var.d() != d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = n5Var.f9906c;
        if (byteBuffer2 == null || (byteBuffer = this.f9906c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000) {
            return true;
        }
        return false;
    }

    public boolean a(n5 n5Var) {
        a1.a(!n5Var.h());
        a1.a(!n5Var.c());
        a1.a(!n5Var.e());
        if (!b(n5Var)) {
            return false;
        }
        int i10 = this.f7581k;
        this.f7581k = i10 + 1;
        if (i10 == 0) {
            this.f9908f = n5Var.f9908f;
            if (n5Var.f()) {
                e(1);
            }
        }
        if (n5Var.d()) {
            e(RecyclerView.UNDEFINED_DURATION);
        }
        ByteBuffer byteBuffer = n5Var.f9906c;
        if (byteBuffer != null) {
            g(byteBuffer.remaining());
            this.f9906c.put(byteBuffer);
        }
        this.f7580j = n5Var.f9908f;
        return true;
    }

    public void i(int i10) {
        a1.a(i10 > 0);
        this.f7582l = i10;
    }

    public long j() {
        return this.f9908f;
    }

    public long k() {
        return this.f7580j;
    }

    public int l() {
        return this.f7581k;
    }

    public boolean m() {
        return this.f7581k > 0;
    }

    public void b() {
        super.b();
        this.f7581k = 0;
    }
}
