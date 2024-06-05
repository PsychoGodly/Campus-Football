package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: IterableByteBufferInputStream */
class f0 extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<ByteBuffer> f27007a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f27008b;

    /* renamed from: c  reason: collision with root package name */
    private int f27009c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f27010d;

    /* renamed from: f  reason: collision with root package name */
    private int f27011f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f27012g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f27013h;

    /* renamed from: i  reason: collision with root package name */
    private int f27014i;

    /* renamed from: j  reason: collision with root package name */
    private long f27015j;

    f0(Iterable<ByteBuffer> iterable) {
        this.f27007a = iterable.iterator();
        for (ByteBuffer next : iterable) {
            this.f27009c++;
        }
        this.f27010d = -1;
        if (!h()) {
            this.f27008b = d0.f26989e;
            this.f27010d = 0;
            this.f27011f = 0;
            this.f27015j = 0;
        }
    }

    private boolean h() {
        this.f27010d++;
        if (!this.f27007a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f27007a.next();
        this.f27008b = next;
        this.f27011f = next.position();
        if (this.f27008b.hasArray()) {
            this.f27012g = true;
            this.f27013h = this.f27008b.array();
            this.f27014i = this.f27008b.arrayOffset();
        } else {
            this.f27012g = false;
            this.f27015j = z1.k(this.f27008b);
            this.f27013h = null;
        }
        return true;
    }

    private void i(int i10) {
        int i11 = this.f27011f + i10;
        this.f27011f = i11;
        if (i11 == this.f27008b.limit()) {
            h();
        }
    }

    public int read() throws IOException {
        if (this.f27010d == this.f27009c) {
            return -1;
        }
        if (this.f27012g) {
            byte b10 = this.f27013h[this.f27011f + this.f27014i] & 255;
            i(1);
            return b10;
        }
        byte w10 = z1.w(((long) this.f27011f) + this.f27015j) & 255;
        i(1);
        return w10;
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f27010d == this.f27009c) {
            return -1;
        }
        int limit = this.f27008b.limit();
        int i12 = this.f27011f;
        int i13 = limit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f27012g) {
            System.arraycopy(this.f27013h, i12 + this.f27014i, bArr, i10, i11);
            i(i11);
        } else {
            int position = this.f27008b.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.f27008b.position(this.f27011f);
            this.f27008b.get(bArr, i10, i11);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f27008b.position(position);
            i(i11);
        }
        return i11;
    }
}
