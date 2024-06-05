package io.grpc.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: ReadableBuffer */
public interface v1 extends Closeable {
    void B0(OutputStream outputStream, int i10) throws IOException;

    void P0(ByteBuffer byteBuffer);

    void Y(byte[] bArr, int i10, int i11);

    void c0();

    void close();

    int d();

    boolean markSupported();

    int readUnsignedByte();

    void reset();

    void skipBytes(int i10);

    v1 z(int i10);
}
