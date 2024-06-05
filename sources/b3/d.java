package b3;

import java.io.IOException;
import k4.a;
import k4.a0;
import n2.y2;
import s2.e0;
import s2.l;
import s2.m;
import s2.n;
import s2.r;

/* compiled from: OggExtractor */
public class d implements l {

    /* renamed from: d  reason: collision with root package name */
    public static final r f5477d = c.f5476b;

    /* renamed from: a  reason: collision with root package name */
    private n f5478a;

    /* renamed from: b  reason: collision with root package name */
    private i f5479b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5480c;

    /* access modifiers changed from: private */
    public static /* synthetic */ l[] d() {
        return new l[]{new d()};
    }

    private static a0 f(a0 a0Var) {
        a0Var.T(0);
        return a0Var;
    }

    private boolean h(m mVar) throws IOException {
        f fVar = new f();
        if (fVar.a(mVar, true) && (fVar.f5487b & 2) == 2) {
            int min = Math.min(fVar.f5494i, 8);
            a0 a0Var = new a0(min);
            mVar.p(a0Var.e(), 0, min);
            if (b.p(f(a0Var))) {
                this.f5479b = new b();
            } else if (j.r(f(a0Var))) {
                this.f5479b = new j();
            } else if (h.o(f(a0Var))) {
                this.f5479b = new h();
            }
            return true;
        }
        return false;
    }

    public void b(n nVar) {
        this.f5478a = nVar;
    }

    public void c(long j10, long j11) {
        i iVar = this.f5479b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    public boolean e(m mVar) throws IOException {
        try {
            return h(mVar);
        } catch (y2 unused) {
            return false;
        }
    }

    public int g(m mVar, s2.a0 a0Var) throws IOException {
        a.h(this.f5478a);
        if (this.f5479b == null) {
            if (h(mVar)) {
                mVar.l();
            } else {
                throw y2.a("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.f5480c) {
            e0 e10 = this.f5478a.e(0, 1);
            this.f5478a.q();
            this.f5479b.d(this.f5478a, e10);
            this.f5480c = true;
        }
        return this.f5479b.g(mVar, a0Var);
    }

    public void release() {
    }
}
