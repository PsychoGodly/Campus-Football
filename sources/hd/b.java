package hd;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import lf.e;
import lf.f;

/* compiled from: FrameReader */
public interface b extends Closeable {

    /* compiled from: FrameReader */
    public interface a {
        void a(int i10, long j10);

        void b(boolean z10, int i10, int i11);

        void c(boolean z10, int i10, e eVar, int i11) throws IOException;

        void d();

        void g(int i10, a aVar);

        void h(int i10, int i11, int i12, boolean z10);

        void i(int i10, int i11, List<d> list) throws IOException;

        void j(boolean z10, boolean z11, int i10, int i11, List<d> list, e eVar);

        void k(int i10, a aVar, f fVar);

        void l(boolean z10, i iVar);
    }

    boolean S0(a aVar) throws IOException;
}
