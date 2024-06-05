package com.applovin.impl;

import java.nio.ByteBuffer;

final class q2 {

    /* renamed from: a  reason: collision with root package name */
    private long f10800a;

    /* renamed from: b  reason: collision with root package name */
    private long f10801b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10802c;

    q2() {
    }

    private long a(long j10) {
        return this.f10800a + Math.max(0, ((this.f10801b - 529) * 1000000) / j10);
    }

    public long a(d9 d9Var) {
        return a((long) d9Var.A);
    }

    public void a() {
        this.f10800a = 0;
        this.f10801b = 0;
        this.f10802c = false;
    }

    public long a(d9 d9Var, n5 n5Var) {
        if (this.f10801b == 0) {
            this.f10800a = n5Var.f9908f;
        }
        if (this.f10802c) {
            return n5Var.f9908f;
        }
        ByteBuffer byteBuffer = (ByteBuffer) a1.a((Object) n5Var.f9906c);
        byte b10 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            b10 = (b10 << 8) | (byteBuffer.get(i10) & 255);
        }
        int d10 = of.d(b10);
        if (d10 == -1) {
            this.f10802c = true;
            this.f10801b = 0;
            this.f10800a = n5Var.f9908f;
            kc.d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return n5Var.f9908f;
        }
        long a10 = a((long) d9Var.A);
        this.f10801b += (long) d10;
        return a10;
    }
}
