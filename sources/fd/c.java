package fd;

import hd.a;
import hd.d;
import hd.i;
import java.io.IOException;
import java.util.List;
import r6.o;

/* compiled from: ForwardingFrameWriter */
abstract class c implements hd.c {

    /* renamed from: a  reason: collision with root package name */
    private final hd.c f32614a;

    public c(hd.c cVar) {
        this.f32614a = (hd.c) o.p(cVar, "delegate");
    }

    public void H() throws IOException {
        this.f32614a.H();
    }

    public void H0(boolean z10, int i10, lf.c cVar, int i11) throws IOException {
        this.f32614a.H0(z10, i10, cVar, i11);
    }

    public int L0() {
        return this.f32614a.L0();
    }

    public void M0(int i10, a aVar, byte[] bArr) throws IOException {
        this.f32614a.M0(i10, aVar, bArr);
    }

    public void N0(boolean z10, boolean z11, int i10, int i11, List<d> list) throws IOException {
        this.f32614a.N0(z10, z11, i10, i11, list);
    }

    public void W(i iVar) throws IOException {
        this.f32614a.W(iVar);
    }

    public void W0(i iVar) throws IOException {
        this.f32614a.W0(iVar);
    }

    public void a(int i10, long j10) throws IOException {
        this.f32614a.a(i10, j10);
    }

    public void b(boolean z10, int i10, int i11) throws IOException {
        this.f32614a.b(z10, i10, i11);
    }

    public void close() throws IOException {
        this.f32614a.close();
    }

    public void flush() throws IOException {
        this.f32614a.flush();
    }

    public void g(int i10, a aVar) throws IOException {
        this.f32614a.g(i10, aVar);
    }
}
