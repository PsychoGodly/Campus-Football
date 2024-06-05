package com.applovin.impl;

import java.nio.ByteBuffer;

public class n5 extends j2 {

    /* renamed from: b  reason: collision with root package name */
    public final y4 f9905b;

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f9906c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9907d;

    /* renamed from: f  reason: collision with root package name */
    public long f9908f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f9909g;

    /* renamed from: h  reason: collision with root package name */
    private final int f9910h;

    /* renamed from: i  reason: collision with root package name */
    private final int f9911i;

    public static final class a extends IllegalStateException {

        /* renamed from: a  reason: collision with root package name */
        public final int f9912a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9913b;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f9912a = i10;
            this.f9913b = i11;
        }
    }

    public n5(int i10) {
        this(i10, 0);
    }

    private ByteBuffer f(int i10) {
        int i11 = this.f9910h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f9906c;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public static n5 i() {
        return new n5(0);
    }

    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f9906c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f9909g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f9907d = false;
    }

    public void g(int i10) {
        int i11 = i10 + this.f9911i;
        ByteBuffer byteBuffer = this.f9906c;
        if (byteBuffer == null) {
            this.f9906c = f(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f9906c = byteBuffer;
            return;
        }
        ByteBuffer f10 = f(i12);
        f10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            f10.put(byteBuffer);
        }
        this.f9906c = f10;
    }

    public final boolean h() {
        return d(1073741824);
    }

    public n5(int i10, int i11) {
        this.f9905b = new y4();
        this.f9910h = i10;
        this.f9911i = i11;
    }

    public void h(int i10) {
        ByteBuffer byteBuffer = this.f9909g;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f9909g = ByteBuffer.allocate(i10);
        } else {
            this.f9909g.clear();
        }
    }

    public final void g() {
        ByteBuffer byteBuffer = this.f9906c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f9909g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
