package x2;

import s2.b0;
import s2.c0;
import s2.e0;
import s2.n;

/* compiled from: StartOffsetExtractorOutput */
public final class d implements n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final long f23613a;

    /* renamed from: b  reason: collision with root package name */
    private final n f23614b;

    /* compiled from: StartOffsetExtractorOutput */
    class a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f23615a;

        a(b0 b0Var) {
            this.f23615a = b0Var;
        }

        public boolean f() {
            return this.f23615a.f();
        }

        public b0.a h(long j10) {
            b0.a h10 = this.f23615a.h(j10);
            c0 c0Var = h10.f22379a;
            c0 c0Var2 = new c0(c0Var.f22384a, c0Var.f22385b + d.this.f23613a);
            c0 c0Var3 = h10.f22380b;
            return new b0.a(c0Var2, new c0(c0Var3.f22384a, c0Var3.f22385b + d.this.f23613a));
        }

        public long i() {
            return this.f23615a.i();
        }
    }

    public d(long j10, n nVar) {
        this.f23613a = j10;
        this.f23614b = nVar;
    }

    public e0 e(int i10, int i11) {
        return this.f23614b.e(i10, i11);
    }

    public void j(b0 b0Var) {
        this.f23614b.j(new a(b0Var));
    }

    public void q() {
        this.f23614b.q();
    }
}
