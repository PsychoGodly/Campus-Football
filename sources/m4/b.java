package m4;

import java.nio.ByteBuffer;
import k4.a0;
import k4.n0;
import n2.f;
import n2.q;
import n2.q3;
import n2.r1;
import q2.g;

/* compiled from: CameraMotionRenderer */
public final class b extends f {

    /* renamed from: o  reason: collision with root package name */
    private final g f20078o = new g(1);

    /* renamed from: p  reason: collision with root package name */
    private final a0 f20079p = new a0();

    /* renamed from: q  reason: collision with root package name */
    private long f20080q;

    /* renamed from: r  reason: collision with root package name */
    private a f20081r;

    /* renamed from: s  reason: collision with root package name */
    private long f20082s;

    public b() {
        super(6);
    }

    private float[] P(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f20079p.R(byteBuffer.array(), byteBuffer.limit());
        this.f20079p.T(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f20079p.t());
        }
        return fArr;
    }

    private void Q() {
        a aVar = this.f20081r;
        if (aVar != null) {
            aVar.c();
        }
    }

    /* access modifiers changed from: protected */
    public void F() {
        Q();
    }

    /* access modifiers changed from: protected */
    public void H(long j10, boolean z10) {
        this.f20082s = Long.MIN_VALUE;
        Q();
    }

    /* access modifiers changed from: protected */
    public void L(r1[] r1VarArr, long j10, long j11) {
        this.f20080q = j11;
    }

    public int a(r1 r1Var) {
        if ("application/x-camera-motion".equals(r1Var.f20654m)) {
            return q3.a(4);
        }
        return q3.a(0);
    }

    public boolean b() {
        return g();
    }

    public String getName() {
        return "CameraMotionRenderer";
    }

    public boolean isReady() {
        return true;
    }

    public void o(long j10, long j11) {
        while (!g() && this.f20082s < 100000 + j10) {
            this.f20078o.g();
            if (M(A(), this.f20078o, 0) == -4 && !this.f20078o.l()) {
                g gVar = this.f20078o;
                this.f20082s = gVar.f21757f;
                if (this.f20081r != null && !gVar.k()) {
                    this.f20078o.s();
                    float[] P = P((ByteBuffer) n0.j(this.f20078o.f21755c));
                    if (P != null) {
                        ((a) n0.j(this.f20081r)).a(this.f20082s - this.f20080q, P);
                    }
                }
            } else {
                return;
            }
        }
    }

    public void p(int i10, Object obj) throws q {
        if (i10 == 8) {
            this.f20081r = (a) obj;
        } else {
            super.p(i10, obj);
        }
    }
}
