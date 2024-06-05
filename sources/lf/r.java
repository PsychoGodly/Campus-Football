package lf;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: Sink */
public interface r extends Closeable, Flushable {
    void V0(c cVar, long j10) throws IOException;

    void close() throws IOException;

    t e();

    void flush() throws IOException;
}
