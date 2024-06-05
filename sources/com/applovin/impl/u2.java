package com.applovin.impl;

import java.nio.ByteBuffer;

public final class u2 extends d2 {

    /* renamed from: n  reason: collision with root package name */
    private final n5 f12482n = new n5(1);

    /* renamed from: o  reason: collision with root package name */
    private final yg f12483o = new yg();

    /* renamed from: p  reason: collision with root package name */
    private long f12484p;

    /* renamed from: q  reason: collision with root package name */
    private t2 f12485q;

    /* renamed from: r  reason: collision with root package name */
    private long f12486r;

    public u2() {
        super(6);
    }

    private void z() {
        t2 t2Var = this.f12485q;
        if (t2Var != null) {
            t2Var.a();
        }
    }

    public void a(int i10, Object obj) {
        if (i10 == 8) {
            this.f12485q = (t2) obj;
        } else {
            super.a(i10, obj);
        }
    }

    public boolean c() {
        return j();
    }

    public boolean d() {
        return true;
    }

    public String getName() {
        return "CameraMotionRenderer";
    }

    /* access modifiers changed from: protected */
    public void v() {
        z();
    }

    /* access modifiers changed from: protected */
    public void a(long j10, boolean z10) {
        this.f12486r = Long.MIN_VALUE;
        z();
    }

    /* access modifiers changed from: protected */
    public void a(d9[] d9VarArr, long j10, long j11) {
        this.f12484p = j11;
    }

    private float[] a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f12483o.a(byteBuffer.array(), byteBuffer.limit());
        this.f12483o.f(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f12483o.m());
        }
        return fArr;
    }

    public void a(long j10, long j11) {
        while (!j() && this.f12486r < 100000 + j10) {
            this.f12482n.b();
            if (a(r(), this.f12482n, 0) == -4 && !this.f12482n.e()) {
                n5 n5Var = this.f12482n;
                this.f12486r = n5Var.f9908f;
                if (this.f12485q != null && !n5Var.d()) {
                    this.f12482n.g();
                    float[] a10 = a((ByteBuffer) yp.a((Object) this.f12482n.f9906c));
                    if (a10 != null) {
                        ((t2) yp.a((Object) this.f12485q)).a(this.f12486r - this.f12484p, a10);
                    }
                }
            } else {
                return;
            }
        }
    }

    public int a(d9 d9Var) {
        if ("application/x-camera-motion".equals(d9Var.f7153m)) {
            return hz.a(4);
        }
        return hz.a(0);
    }
}
