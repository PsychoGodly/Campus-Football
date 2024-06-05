package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import r6.i;
import r6.o;

/* compiled from: ForwardingReadableBuffer */
public abstract class o0 implements v1 {

    /* renamed from: a  reason: collision with root package name */
    private final v1 f35222a;

    protected o0(v1 v1Var) {
        this.f35222a = (v1) o.p(v1Var, "buf");
    }

    public void B0(OutputStream outputStream, int i10) throws IOException {
        this.f35222a.B0(outputStream, i10);
    }

    public void P0(ByteBuffer byteBuffer) {
        this.f35222a.P0(byteBuffer);
    }

    public void Y(byte[] bArr, int i10, int i11) {
        this.f35222a.Y(bArr, i10, i11);
    }

    public void c0() {
        this.f35222a.c0();
    }

    public int d() {
        return this.f35222a.d();
    }

    public boolean markSupported() {
        return this.f35222a.markSupported();
    }

    public int readUnsignedByte() {
        return this.f35222a.readUnsignedByte();
    }

    public void reset() {
        this.f35222a.reset();
    }

    public void skipBytes(int i10) {
        this.f35222a.skipBytes(i10);
    }

    public String toString() {
        return i.c(this).d("delegate", this.f35222a).toString();
    }

    public v1 z(int i10) {
        return this.f35222a.z(i10);
    }
}
