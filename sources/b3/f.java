package b3;

import java.io.IOException;
import k4.a;
import k4.a0;
import n2.y2;
import s2.m;
import s2.o;

/* compiled from: OggPageHeader */
final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f5486a;

    /* renamed from: b  reason: collision with root package name */
    public int f5487b;

    /* renamed from: c  reason: collision with root package name */
    public long f5488c;

    /* renamed from: d  reason: collision with root package name */
    public long f5489d;

    /* renamed from: e  reason: collision with root package name */
    public long f5490e;

    /* renamed from: f  reason: collision with root package name */
    public long f5491f;

    /* renamed from: g  reason: collision with root package name */
    public int f5492g;

    /* renamed from: h  reason: collision with root package name */
    public int f5493h;

    /* renamed from: i  reason: collision with root package name */
    public int f5494i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f5495j = new int[255];

    /* renamed from: k  reason: collision with root package name */
    private final a0 f5496k = new a0(255);

    f() {
    }

    public boolean a(m mVar, boolean z10) throws IOException {
        b();
        this.f5496k.P(27);
        if (!o.b(mVar, this.f5496k.e(), 0, 27, z10) || this.f5496k.I() != 1332176723) {
            return false;
        }
        int G = this.f5496k.G();
        this.f5486a = G;
        if (G == 0) {
            this.f5487b = this.f5496k.G();
            this.f5488c = this.f5496k.u();
            this.f5489d = this.f5496k.w();
            this.f5490e = this.f5496k.w();
            this.f5491f = this.f5496k.w();
            int G2 = this.f5496k.G();
            this.f5492g = G2;
            this.f5493h = G2 + 27;
            this.f5496k.P(G2);
            if (!o.b(mVar, this.f5496k.e(), 0, this.f5492g, z10)) {
                return false;
            }
            for (int i10 = 0; i10 < this.f5492g; i10++) {
                this.f5495j[i10] = this.f5496k.G();
                this.f5494i += this.f5495j[i10];
            }
            return true;
        } else if (z10) {
            return false;
        } else {
            throw y2.d("unsupported bit stream revision");
        }
    }

    public void b() {
        this.f5486a = 0;
        this.f5487b = 0;
        this.f5488c = 0;
        this.f5489d = 0;
        this.f5490e = 0;
        this.f5491f = 0;
        this.f5492g = 0;
        this.f5493h = 0;
        this.f5494i = 0;
    }

    public boolean c(m mVar) throws IOException {
        return d(mVar, -1);
    }

    public boolean d(m mVar, long j10) throws IOException {
        int i10;
        a.a(mVar.c() == mVar.h());
        this.f5496k.P(4);
        while (true) {
            i10 = (j10 > -1 ? 1 : (j10 == -1 ? 0 : -1));
            if ((i10 == 0 || mVar.c() + 4 < j10) && o.b(mVar, this.f5496k.e(), 0, 4, true)) {
                this.f5496k.T(0);
                if (this.f5496k.I() == 1332176723) {
                    mVar.l();
                    return true;
                }
                mVar.m(1);
            }
        }
        do {
            if ((i10 != 0 && mVar.c() >= j10) || mVar.a(1) == -1) {
                return false;
            }
            break;
        } while (mVar.a(1) == -1);
        return false;
    }
}
