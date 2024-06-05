package w2;

import java.util.Collections;
import k4.a0;
import n2.r1;
import n2.y2;
import p2.a;
import s2.e0;
import w2.e;

/* compiled from: AudioTagPayloadReader */
final class a extends e {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f23517e = {5512, 11025, 22050, 44100};

    /* renamed from: b  reason: collision with root package name */
    private boolean f23518b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f23519c;

    /* renamed from: d  reason: collision with root package name */
    private int f23520d;

    public a(e0 e0Var) {
        super(e0Var);
    }

    /* access modifiers changed from: protected */
    public boolean b(a0 a0Var) throws e.a {
        if (!this.f23518b) {
            int G = a0Var.G();
            int i10 = (G >> 4) & 15;
            this.f23520d = i10;
            if (i10 == 2) {
                this.f23541a.a(new r1.b().g0("audio/mpeg").J(1).h0(f23517e[(G >> 2) & 3]).G());
                this.f23519c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f23541a.a(new r1.b().g0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").J(1).h0(8000).G());
                this.f23519c = true;
            } else if (i10 != 10) {
                throw new e.a("Audio format not supported: " + this.f23520d);
            }
            this.f23518b = true;
        } else {
            a0Var.U(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(a0 a0Var, long j10) throws y2 {
        if (this.f23520d == 2) {
            int a10 = a0Var.a();
            this.f23541a.d(a0Var, a10);
            this.f23541a.b(j10, 1, a10, 0, (e0.a) null);
            return true;
        }
        int G = a0Var.G();
        if (G == 0 && !this.f23519c) {
            int a11 = a0Var.a();
            byte[] bArr = new byte[a11];
            a0Var.l(bArr, 0, a11);
            a.b f10 = p2.a.f(bArr);
            this.f23541a.a(new r1.b().g0("audio/mp4a-latm").K(f10.f21132c).J(f10.f21131b).h0(f10.f21130a).V(Collections.singletonList(bArr)).G());
            this.f23519c = true;
            return false;
        } else if (this.f23520d == 10 && G != 1) {
            return false;
        } else {
            int a12 = a0Var.a();
            this.f23541a.d(a0Var, a12);
            this.f23541a.b(j10, 1, a12, 0, (e0.a) null);
            return true;
        }
    }
}
