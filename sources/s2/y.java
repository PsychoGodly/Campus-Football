package s2;

import f3.a;
import java.io.EOFException;
import java.io.IOException;
import k3.h;
import k4.a0;

/* compiled from: Id3Peeker */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f22486a = new a0(10);

    public a a(m mVar, h.a aVar) throws IOException {
        a aVar2 = null;
        int i10 = 0;
        while (true) {
            try {
                mVar.p(this.f22486a.e(), 0, 10);
                this.f22486a.T(0);
                if (this.f22486a.J() != 4801587) {
                    break;
                }
                this.f22486a.U(3);
                int F = this.f22486a.F();
                int i11 = F + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f22486a.e(), 0, bArr, 0, 10);
                    mVar.p(bArr, 10, F);
                    aVar2 = new h(aVar).e(bArr, i11);
                } else {
                    mVar.i(F);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        mVar.l();
        mVar.i(i10);
        return aVar2;
    }
}
