package e3;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import k4.a;
import q2.g;

/* compiled from: BatchBuffer */
final class h extends g {

    /* renamed from: j  reason: collision with root package name */
    private long f17832j;

    /* renamed from: k  reason: collision with root package name */
    private int f17833k;

    /* renamed from: l  reason: collision with root package name */
    private int f17834l = 32;

    public h() {
        super(2);
    }

    private boolean x(g gVar) {
        ByteBuffer byteBuffer;
        if (!B()) {
            return true;
        }
        if (this.f17833k >= this.f17834l || gVar.k() != k()) {
            return false;
        }
        ByteBuffer byteBuffer2 = gVar.f21755c;
        if (byteBuffer2 == null || (byteBuffer = this.f21755c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000) {
            return true;
        }
        return false;
    }

    public int A() {
        return this.f17833k;
    }

    public boolean B() {
        return this.f17833k > 0;
    }

    public void C(int i10) {
        a.a(i10 > 0);
        this.f17834l = i10;
    }

    public void g() {
        super.g();
        this.f17833k = 0;
    }

    public boolean w(g gVar) {
        a.a(!gVar.t());
        a.a(!gVar.j());
        a.a(!gVar.l());
        if (!x(gVar)) {
            return false;
        }
        int i10 = this.f17833k;
        this.f17833k = i10 + 1;
        if (i10 == 0) {
            this.f21757f = gVar.f21757f;
            if (gVar.n()) {
                p(1);
            }
        }
        if (gVar.k()) {
            p(RecyclerView.UNDEFINED_DURATION);
        }
        ByteBuffer byteBuffer = gVar.f21755c;
        if (byteBuffer != null) {
            r(byteBuffer.remaining());
            this.f21755c.put(byteBuffer);
        }
        this.f17832j = gVar.f21757f;
        return true;
    }

    public long y() {
        return this.f21757f;
    }

    public long z() {
        return this.f17832j;
    }
}
