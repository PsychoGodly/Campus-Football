package io.grpc.internal;

import dd.q0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import r6.o;

/* compiled from: ReadableBuffers */
public final class w1 {

    /* renamed from: a  reason: collision with root package name */
    private static final v1 f35429a = new c(new byte[0]);

    /* compiled from: ReadableBuffers */
    class a extends o0 {
        a(v1 v1Var) {
            super(v1Var);
        }

        public void close() {
        }
    }

    /* compiled from: ReadableBuffers */
    private static class c extends c {

        /* renamed from: a  reason: collision with root package name */
        int f35431a;

        /* renamed from: b  reason: collision with root package name */
        final int f35432b;

        /* renamed from: c  reason: collision with root package name */
        final byte[] f35433c;

        /* renamed from: d  reason: collision with root package name */
        int f35434d;

        c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        public void B0(OutputStream outputStream, int i10) throws IOException {
            h(i10);
            outputStream.write(this.f35433c, this.f35431a, i10);
            this.f35431a += i10;
        }

        public void P0(ByteBuffer byteBuffer) {
            o.p(byteBuffer, "dest");
            int remaining = byteBuffer.remaining();
            h(remaining);
            byteBuffer.put(this.f35433c, this.f35431a, remaining);
            this.f35431a += remaining;
        }

        public void Y(byte[] bArr, int i10, int i11) {
            System.arraycopy(this.f35433c, this.f35431a, bArr, i10, i11);
            this.f35431a += i11;
        }

        public void c0() {
            this.f35434d = this.f35431a;
        }

        public int d() {
            return this.f35432b - this.f35431a;
        }

        /* renamed from: i */
        public c z(int i10) {
            h(i10);
            int i11 = this.f35431a;
            this.f35431a = i11 + i10;
            return new c(this.f35433c, i11, i10);
        }

        public boolean markSupported() {
            return true;
        }

        public int readUnsignedByte() {
            h(1);
            byte[] bArr = this.f35433c;
            int i10 = this.f35431a;
            this.f35431a = i10 + 1;
            return bArr[i10] & 255;
        }

        public void reset() {
            int i10 = this.f35434d;
            if (i10 != -1) {
                this.f35431a = i10;
                return;
            }
            throw new InvalidMarkException();
        }

        public void skipBytes(int i10) {
            h(i10);
            this.f35431a += i10;
        }

        c(byte[] bArr, int i10, int i11) {
            this.f35434d = -1;
            boolean z10 = true;
            o.e(i10 >= 0, "offset must be >= 0");
            o.e(i11 >= 0, "length must be >= 0");
            int i12 = i11 + i10;
            o.e(i12 > bArr.length ? false : z10, "offset + length exceeds array boundary");
            this.f35433c = (byte[]) o.p(bArr, "bytes");
            this.f35431a = i10;
            this.f35432b = i12;
        }
    }

    public static v1 a() {
        return f35429a;
    }

    public static v1 b(v1 v1Var) {
        return new a(v1Var);
    }

    public static InputStream c(v1 v1Var, boolean z10) {
        if (!z10) {
            v1Var = b(v1Var);
        }
        return new b(v1Var);
    }

    public static byte[] d(v1 v1Var) {
        o.p(v1Var, "buffer");
        int d10 = v1Var.d();
        byte[] bArr = new byte[d10];
        v1Var.Y(bArr, 0, d10);
        return bArr;
    }

    public static String e(v1 v1Var, Charset charset) {
        o.p(charset, "charset");
        return new String(d(v1Var), charset);
    }

    public static v1 f(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    /* compiled from: ReadableBuffers */
    private static final class b extends InputStream implements q0 {

        /* renamed from: a  reason: collision with root package name */
        private v1 f35430a;

        public b(v1 v1Var) {
            this.f35430a = (v1) o.p(v1Var, "buffer");
        }

        public int available() throws IOException {
            return this.f35430a.d();
        }

        public void close() throws IOException {
            this.f35430a.close();
        }

        public void mark(int i10) {
            this.f35430a.c0();
        }

        public boolean markSupported() {
            return this.f35430a.markSupported();
        }

        public int read() {
            if (this.f35430a.d() == 0) {
                return -1;
            }
            return this.f35430a.readUnsignedByte();
        }

        public void reset() throws IOException {
            this.f35430a.reset();
        }

        public long skip(long j10) throws IOException {
            int min = (int) Math.min((long) this.f35430a.d(), j10);
            this.f35430a.skipBytes(min);
            return (long) min;
        }

        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (this.f35430a.d() == 0) {
                return -1;
            }
            int min = Math.min(this.f35430a.d(), i11);
            this.f35430a.Y(bArr, i10, min);
            return min;
        }
    }
}
