package s2;

import java.io.IOException;
import k4.a;
import p2.b;
import s2.e0;

/* compiled from: TrueHdSampleRechunker */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f22410a = new byte[10];

    /* renamed from: b  reason: collision with root package name */
    private boolean f22411b;

    /* renamed from: c  reason: collision with root package name */
    private int f22412c;

    /* renamed from: d  reason: collision with root package name */
    private long f22413d;

    /* renamed from: e  reason: collision with root package name */
    private int f22414e;

    /* renamed from: f  reason: collision with root package name */
    private int f22415f;

    /* renamed from: g  reason: collision with root package name */
    private int f22416g;

    public void a(e0 e0Var, e0.a aVar) {
        if (this.f22412c > 0) {
            e0Var.b(this.f22413d, this.f22414e, this.f22415f, this.f22416g, aVar);
            this.f22412c = 0;
        }
    }

    public void b() {
        this.f22411b = false;
        this.f22412c = 0;
    }

    public void c(e0 e0Var, long j10, int i10, int i11, int i12, e0.a aVar) {
        a.g(this.f22416g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f22411b) {
            int i13 = this.f22412c;
            int i14 = i13 + 1;
            this.f22412c = i14;
            if (i13 == 0) {
                this.f22413d = j10;
                this.f22414e = i10;
                this.f22415f = 0;
            }
            this.f22415f += i11;
            this.f22416g = i12;
            if (i14 >= 16) {
                a(e0Var, aVar);
            }
        }
    }

    public void d(m mVar) throws IOException {
        if (!this.f22411b) {
            mVar.p(this.f22410a, 0, 10);
            mVar.l();
            if (b.j(this.f22410a) != 0) {
                this.f22411b = true;
            }
        }
    }
}
