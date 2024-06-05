package lf;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* compiled from: BufferedSink */
public interface d extends r, WritableByteChannel {
    d G(int i10) throws IOException;

    d K() throws IOException;

    d T(String str) throws IOException;

    d b0(long j10) throws IOException;

    c c();

    d f(byte[] bArr, int i10, int i11) throws IOException;

    void flush() throws IOException;

    long p(s sVar) throws IOException;

    d t0(byte[] bArr) throws IOException;

    d v(int i10) throws IOException;

    d y(int i10) throws IOException;
}
