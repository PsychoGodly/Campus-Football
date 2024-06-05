package hd;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/* compiled from: FrameWriter */
public interface c extends Closeable {
    void H() throws IOException;

    void H0(boolean z10, int i10, lf.c cVar, int i11) throws IOException;

    int L0();

    void M0(int i10, a aVar, byte[] bArr) throws IOException;

    void N0(boolean z10, boolean z11, int i10, int i11, List<d> list) throws IOException;

    void W(i iVar) throws IOException;

    void W0(i iVar) throws IOException;

    void a(int i10, long j10) throws IOException;

    void b(boolean z10, int i10, int i11) throws IOException;

    void flush() throws IOException;

    void g(int i10, a aVar) throws IOException;
}
