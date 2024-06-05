package w2;

import com.unity3d.services.core.device.MimeTypes;
import k4.a0;
import k4.w;
import l4.a;
import n2.r1;
import n2.y2;
import s2.e0;
import w2.e;

/* compiled from: VideoTagPayloadReader */
final class f extends e {

    /* renamed from: b  reason: collision with root package name */
    private final a0 f23542b = new a0(w.f19780a);

    /* renamed from: c  reason: collision with root package name */
    private final a0 f23543c = new a0(4);

    /* renamed from: d  reason: collision with root package name */
    private int f23544d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f23545e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f23546f;

    /* renamed from: g  reason: collision with root package name */
    private int f23547g;

    public f(e0 e0Var) {
        super(e0Var);
    }

    /* access modifiers changed from: protected */
    public boolean b(a0 a0Var) throws e.a {
        int G = a0Var.G();
        int i10 = (G >> 4) & 15;
        int i11 = G & 15;
        if (i11 == 7) {
            this.f23547g = i10;
            return i10 != 5;
        }
        throw new e.a("Video format not supported: " + i11);
    }

    /* access modifiers changed from: protected */
    public boolean c(a0 a0Var, long j10) throws y2 {
        int G = a0Var.G();
        long q10 = j10 + (((long) a0Var.q()) * 1000);
        if (G == 0 && !this.f23545e) {
            a0 a0Var2 = new a0(new byte[a0Var.a()]);
            a0Var.l(a0Var2.e(), 0, a0Var.a());
            a b10 = a.b(a0Var2);
            this.f23544d = b10.f19894b;
            this.f23541a.a(new r1.b().g0(MimeTypes.VIDEO_H264).K(b10.f19898f).n0(b10.f19895c).S(b10.f19896d).c0(b10.f19897e).V(b10.f19893a).G());
            this.f23545e = true;
            return false;
        } else if (G != 1 || !this.f23545e) {
            return false;
        } else {
            int i10 = this.f23547g == 1 ? 1 : 0;
            if (!this.f23546f && i10 == 0) {
                return false;
            }
            byte[] e10 = this.f23543c.e();
            e10[0] = 0;
            e10[1] = 0;
            e10[2] = 0;
            int i11 = 4 - this.f23544d;
            int i12 = 0;
            while (a0Var.a() > 0) {
                a0Var.l(this.f23543c.e(), i11, this.f23544d);
                this.f23543c.T(0);
                int K = this.f23543c.K();
                this.f23542b.T(0);
                this.f23541a.d(this.f23542b, 4);
                this.f23541a.d(a0Var, K);
                i12 = i12 + 4 + K;
            }
            this.f23541a.b(q10, i10, i12, 0, (e0.a) null);
            this.f23546f = true;
            return true;
        }
    }
}
