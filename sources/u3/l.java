package u3;

import java.io.IOException;
import k4.a;
import n2.s1;
import p3.q0;
import q2.g;

/* compiled from: HlsSampleStream */
final class l implements q0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f22928a;

    /* renamed from: b  reason: collision with root package name */
    private final p f22929b;

    /* renamed from: c  reason: collision with root package name */
    private int f22930c = -1;

    public l(p pVar, int i10) {
        this.f22929b = pVar;
        this.f22928a = i10;
    }

    private boolean c() {
        int i10 = this.f22930c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    public void a() throws IOException {
        int i10 = this.f22930c;
        if (i10 == -2) {
            throw new r(this.f22929b.s().b(this.f22928a).b(0).f20654m);
        } else if (i10 == -1) {
            this.f22929b.T();
        } else if (i10 != -3) {
            this.f22929b.U(i10);
        }
    }

    public void b() {
        a.a(this.f22930c == -1);
        this.f22930c = this.f22929b.x(this.f22928a);
    }

    public void d() {
        if (this.f22930c != -1) {
            this.f22929b.o0(this.f22928a);
            this.f22930c = -1;
        }
    }

    public int e(long j10) {
        if (c()) {
            return this.f22929b.n0(this.f22930c, j10);
        }
        return 0;
    }

    public boolean isReady() {
        return this.f22930c == -3 || (c() && this.f22929b.P(this.f22930c));
    }

    public int j(s1 s1Var, g gVar, int i10) {
        if (this.f22930c == -3) {
            gVar.f(4);
            return -4;
        } else if (c()) {
            return this.f22929b.d0(this.f22930c, s1Var, gVar, i10);
        } else {
            return -3;
        }
    }
}
