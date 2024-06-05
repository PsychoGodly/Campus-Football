package com.applovin.impl;

import com.applovin.impl.o1;
import java.nio.ByteBuffer;

final class ap extends y1 {

    /* renamed from: i  reason: collision with root package name */
    private int f6565i;

    /* renamed from: j  reason: collision with root package name */
    private int f6566j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6567k;

    /* renamed from: l  reason: collision with root package name */
    private int f6568l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f6569m = yp.f13667f;

    /* renamed from: n  reason: collision with root package name */
    private int f6570n;

    /* renamed from: o  reason: collision with root package name */
    private long f6571o;

    public void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.f6568l);
            this.f6571o += (long) (min / this.f13476b.f10049d);
            this.f6568l -= min;
            byteBuffer.position(position + min);
            if (this.f6568l <= 0) {
                int i11 = i10 - min;
                int length = (this.f6570n + i11) - this.f6569m.length;
                ByteBuffer a10 = a(length);
                int a11 = yp.a(length, 0, this.f6570n);
                a10.put(this.f6569m, 0, a11);
                int a12 = yp.a(length - a11, 0, i11);
                byteBuffer.limit(byteBuffer.position() + a12);
                a10.put(byteBuffer);
                byteBuffer.limit(limit);
                int i12 = i11 - a12;
                int i13 = this.f6570n - a11;
                this.f6570n = i13;
                byte[] bArr = this.f6569m;
                System.arraycopy(bArr, a11, bArr, 0, i13);
                byteBuffer.get(this.f6569m, this.f6570n, i12);
                this.f6570n += i12;
                a10.flip();
            }
        }
    }

    public o1.a b(o1.a aVar) {
        if (aVar.f10048c == 2) {
            this.f6567k = true;
            return (this.f6565i == 0 && this.f6566j == 0) ? o1.a.f10045e : aVar;
        }
        throw new o1.b(aVar);
    }

    public boolean c() {
        return super.c() && this.f6570n == 0;
    }

    public ByteBuffer d() {
        int i10;
        if (super.c() && (i10 = this.f6570n) > 0) {
            a(i10).put(this.f6569m, 0, this.f6570n).flip();
            this.f6570n = 0;
        }
        return super.d();
    }

    /* access modifiers changed from: protected */
    public void g() {
        if (this.f6567k) {
            this.f6567k = false;
            int i10 = this.f6566j;
            int i11 = this.f13476b.f10049d;
            this.f6569m = new byte[(i10 * i11)];
            this.f6568l = this.f6565i * i11;
        }
        this.f6570n = 0;
    }

    /* access modifiers changed from: protected */
    public void h() {
        if (this.f6567k) {
            int i10 = this.f6570n;
            if (i10 > 0) {
                this.f6571o += (long) (i10 / this.f13476b.f10049d);
            }
            this.f6570n = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        this.f6569m = yp.f13667f;
    }

    public long j() {
        return this.f6571o;
    }

    public void k() {
        this.f6571o = 0;
    }

    public void a(int i10, int i11) {
        this.f6565i = i10;
        this.f6566j = i11;
    }
}
