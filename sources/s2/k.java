package s2;

import j4.i;
import java.io.EOFException;
import java.io.IOException;
import k4.a0;
import n2.r1;
import s2.e0;

/* compiled from: DummyTrackOutput */
public final class k implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f22462a = new byte[4096];

    public void a(r1 r1Var) {
    }

    public void b(long j10, int i10, int i11, int i12, e0.a aVar) {
    }

    public int c(i iVar, int i10, boolean z10, int i11) throws IOException {
        int read = iVar.read(this.f22462a, 0, Math.min(this.f22462a.length, i10));
        if (read != -1) {
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public /* synthetic */ void d(a0 a0Var, int i10) {
        d0.b(this, a0Var, i10);
    }

    public /* synthetic */ int e(i iVar, int i10, boolean z10) {
        return d0.a(this, iVar, i10, z10);
    }

    public void f(a0 a0Var, int i10, int i11) {
        a0Var.U(i10);
    }
}
