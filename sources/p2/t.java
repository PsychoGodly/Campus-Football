package p2;

import android.os.Handler;
import k4.n0;
import n2.r1;
import q2.e;
import q2.i;

/* compiled from: AudioRendererEventListener */
public interface t {

    /* compiled from: AudioRendererEventListener */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f21340a;

        /* renamed from: b  reason: collision with root package name */
        private final t f21341b;

        public a(Handler handler, t tVar) {
            this.f21340a = tVar != null ? (Handler) k4.a.e(handler) : null;
            this.f21341b = tVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void A(int i10, long j10, long j11) {
            ((t) n0.j(this.f21341b)).x(i10, j10, j11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(Exception exc) {
            ((t) n0.j(this.f21341b)).t(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void s(Exception exc) {
            ((t) n0.j(this.f21341b)).b(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void t(String str, long j10, long j11) {
            ((t) n0.j(this.f21341b)).j(str, j10, j11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void u(String str) {
            ((t) n0.j(this.f21341b)).i(str);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void v(e eVar) {
            eVar.c();
            ((t) n0.j(this.f21341b)).o(eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void w(e eVar) {
            ((t) n0.j(this.f21341b)).l(eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void x(r1 r1Var, i iVar) {
            ((t) n0.j(this.f21341b)).F(r1Var);
            ((t) n0.j(this.f21341b)).f(r1Var, iVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void y(long j10) {
            ((t) n0.j(this.f21341b)).r(j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void z(boolean z10) {
            ((t) n0.j(this.f21341b)).a(z10);
        }

        public void B(long j10) {
            Handler handler = this.f21340a;
            if (handler != null) {
                handler.post(new k(this, j10));
            }
        }

        public void C(boolean z10) {
            Handler handler = this.f21340a;
            if (handler != null) {
                handler.post(new s(this, z10));
            }
        }

        public void D(int i10, long j10, long j11) {
            Handler handler = this.f21340a;
            if (handler != null) {
                handler.post(new j(this, i10, j10, j11));
            }
        }

        public void k(Exception exc) {
            Handler handler = this.f21340a;
            if (handler != null) {
                handler.post(new l(this, exc));
            }
        }

        public void l(Exception exc) {
            Handler handler = this.f21340a;
            if (handler != null) {
                handler.post(new m(this, exc));
            }
        }

        public void m(String str, long j10, long j11) {
            Handler handler = this.f21340a;
            if (handler != null) {
                handler.post(new o(this, str, j10, j11));
            }
        }

        public void n(String str) {
            Handler handler = this.f21340a;
            if (handler != null) {
                handler.post(new n(this, str));
            }
        }

        public void o(e eVar) {
            eVar.c();
            Handler handler = this.f21340a;
            if (handler != null) {
                handler.post(new q(this, eVar));
            }
        }

        public void p(e eVar) {
            Handler handler = this.f21340a;
            if (handler != null) {
                handler.post(new r(this, eVar));
            }
        }

        public void q(r1 r1Var, i iVar) {
            Handler handler = this.f21340a;
            if (handler != null) {
                handler.post(new p(this, r1Var, iVar));
            }
        }
    }

    @Deprecated
    void F(r1 r1Var);

    void a(boolean z10);

    void b(Exception exc);

    void f(r1 r1Var, i iVar);

    void i(String str);

    void j(String str, long j10, long j11);

    void l(e eVar);

    void o(e eVar);

    void r(long j10);

    void t(Exception exc);

    void x(int i10, long j10, long j11);
}
