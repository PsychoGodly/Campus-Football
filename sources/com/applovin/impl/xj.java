package com.applovin.impl;

import com.applovin.impl.o1;
import java.nio.ByteBuffer;

public final class xj extends y1 {

    /* renamed from: i  reason: collision with root package name */
    private final long f13407i;

    /* renamed from: j  reason: collision with root package name */
    private final long f13408j;

    /* renamed from: k  reason: collision with root package name */
    private final short f13409k;

    /* renamed from: l  reason: collision with root package name */
    private int f13410l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f13411m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f13412n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f13413o;

    /* renamed from: p  reason: collision with root package name */
    private int f13414p;

    /* renamed from: q  reason: collision with root package name */
    private int f13415q;

    /* renamed from: r  reason: collision with root package name */
    private int f13416r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f13417s;

    /* renamed from: t  reason: collision with root package name */
    private long f13418t;

    public xj() {
        this(150000, 20000, 1024);
    }

    private int a(long j10) {
        return (int) ((j10 * ((long) this.f13476b.f10046a)) / 1000000);
    }

    private int b(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
            if (Math.abs(byteBuffer.getShort(limit)) > this.f13409k) {
                int i10 = this.f13410l;
                return ((limit / i10) * i10) + i10;
            }
        }
    }

    private int c(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > this.f13409k) {
                int i10 = this.f13410l;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    private void d(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        a(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f13417s = true;
        }
    }

    private void e(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int c10 = c(byteBuffer);
        int position = c10 - byteBuffer.position();
        byte[] bArr = this.f13412n;
        int length = bArr.length;
        int i10 = this.f13415q;
        int i11 = length - i10;
        if (c10 >= limit || position >= i11) {
            int min = Math.min(position, i11);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.f13412n, this.f13415q, min);
            int i12 = this.f13415q + min;
            this.f13415q = i12;
            byte[] bArr2 = this.f13412n;
            if (i12 == bArr2.length) {
                if (this.f13417s) {
                    a(bArr2, this.f13416r);
                    this.f13418t += (long) ((this.f13415q - (this.f13416r * 2)) / this.f13410l);
                } else {
                    this.f13418t += (long) ((i12 - this.f13416r) / this.f13410l);
                }
                a(byteBuffer, this.f13412n, this.f13415q);
                this.f13415q = 0;
                this.f13414p = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        a(bArr, i10);
        this.f13415q = 0;
        this.f13414p = 0;
    }

    public boolean f() {
        return this.f13411m;
    }

    /* access modifiers changed from: protected */
    public void g() {
        if (this.f13411m) {
            this.f13410l = this.f13476b.f10049d;
            int a10 = a(this.f13407i) * this.f13410l;
            if (this.f13412n.length != a10) {
                this.f13412n = new byte[a10];
            }
            int a11 = a(this.f13408j) * this.f13410l;
            this.f13416r = a11;
            if (this.f13413o.length != a11) {
                this.f13413o = new byte[a11];
            }
        }
        this.f13414p = 0;
        this.f13418t = 0;
        this.f13415q = 0;
        this.f13417s = false;
    }

    /* access modifiers changed from: protected */
    public void h() {
        int i10 = this.f13415q;
        if (i10 > 0) {
            a(this.f13412n, i10);
        }
        if (!this.f13417s) {
            this.f13418t += (long) (this.f13416r / this.f13410l);
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        this.f13411m = false;
        this.f13416r = 0;
        byte[] bArr = yp.f13667f;
        this.f13412n = bArr;
        this.f13413o = bArr;
    }

    public long j() {
        return this.f13418t;
    }

    public xj(long j10, long j11, short s10) {
        a1.a(j11 <= j10);
        this.f13407i = j10;
        this.f13408j = j11;
        this.f13409k = s10;
        byte[] bArr = yp.f13667f;
        this.f13412n = bArr;
        this.f13413o = bArr;
    }

    private void a(byte[] bArr, int i10) {
        a(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f13417s = true;
        }
    }

    private void f(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f13412n.length));
        int b10 = b(byteBuffer);
        if (b10 == byteBuffer.position()) {
            this.f13414p = 1;
        } else {
            byteBuffer.limit(b10);
            d(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    public void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !a()) {
            int i10 = this.f13414p;
            if (i10 == 0) {
                f(byteBuffer);
            } else if (i10 == 1) {
                e(byteBuffer);
            } else if (i10 == 2) {
                g(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public o1.a b(o1.a aVar) {
        if (aVar.f10048c == 2) {
            return this.f13411m ? aVar : o1.a.f10045e;
        }
        throw new o1.b(aVar);
    }

    public void a(boolean z10) {
        this.f13411m = z10;
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f13416r);
        int i11 = this.f13416r - min;
        System.arraycopy(bArr, i10 - i11, this.f13413o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f13413o, i11, min);
    }

    private void g(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int c10 = c(byteBuffer);
        byteBuffer.limit(c10);
        this.f13418t += (long) (byteBuffer.remaining() / this.f13410l);
        a(byteBuffer, this.f13413o, this.f13416r);
        if (c10 < limit) {
            a(this.f13413o, this.f13416r);
            this.f13414p = 0;
            byteBuffer.limit(limit);
        }
    }
}
