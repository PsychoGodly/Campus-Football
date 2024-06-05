package lf;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: BufferedSource */
public interface e extends s, ReadableByteChannel {
    byte[] D() throws IOException;

    c E();

    boolean F() throws IOException;

    String M(long j10) throws IOException;

    void O0(long j10) throws IOException;

    long T0(byte b10) throws IOException;

    long U0() throws IOException;

    String X(Charset charset) throws IOException;

    @Deprecated
    c c();

    boolean d0(long j10, f fVar) throws IOException;

    String k0() throws IOException;

    int m0() throws IOException;

    byte[] p0(long j10) throws IOException;

    f r(long j10) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    void skip(long j10) throws IOException;

    short x0() throws IOException;
}
