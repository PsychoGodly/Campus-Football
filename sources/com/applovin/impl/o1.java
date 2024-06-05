package com.applovin.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface o1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f10044a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f10045e = new a(-1, -1, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f10046a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10047b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10048c;

        /* renamed from: d  reason: collision with root package name */
        public final int f10049d;

        public a(int i10, int i11, int i12) {
            this.f10046a = i10;
            this.f10047b = i11;
            this.f10048c = i12;
            this.f10049d = yp.g(i12) ? yp.b(i12, i11) : -1;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f10046a + ", channelCount=" + this.f10047b + ", encoding=" + this.f10048c + ']';
        }
    }

    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    a a(a aVar);

    void a(ByteBuffer byteBuffer);

    void b();

    boolean c();

    ByteBuffer d();

    void e();

    boolean f();

    void reset();
}
