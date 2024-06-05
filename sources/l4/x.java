package l4;

import android.os.Handler;
import android.os.SystemClock;
import k4.n0;
import n2.r1;
import q2.e;
import q2.i;

/* compiled from: VideoRendererEventListener */
public interface x {

    /* compiled from: VideoRendererEventListener */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f19996a;

        /* renamed from: b  reason: collision with root package name */
        private final x f19997b;

        public a(Handler handler, x xVar) {
            this.f19996a = xVar != null ? (Handler) k4.a.e(handler) : null;
            this.f19997b = xVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void q(String str, long j10, long j11) {
            ((x) n0.j(this.f19997b)).e(str, j10, j11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(String str) {
            ((x) n0.j(this.f19997b)).c(str);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void s(e eVar) {
            eVar.c();
            ((x) n0.j(this.f19997b)).w(eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void t(int i10, long j10) {
            ((x) n0.j(this.f19997b)).k(i10, j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void u(e eVar) {
            ((x) n0.j(this.f19997b)).g(eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void v(r1 r1Var, i iVar) {
            ((x) n0.j(this.f19997b)).z(r1Var);
            ((x) n0.j(this.f19997b)).h(r1Var, iVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void w(Object obj, long j10) {
            ((x) n0.j(this.f19997b)).m(obj, j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void x(long j10, int i10) {
            ((x) n0.j(this.f19997b)).y(j10, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void y(Exception exc) {
            ((x) n0.j(this.f19997b)).v(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void z(z zVar) {
            ((x) n0.j(this.f19997b)).s(zVar);
        }

        public void A(Object obj) {
            if (this.f19996a != null) {
                this.f19996a.post(new q(this, obj, SystemClock.elapsedRealtime()));
            }
        }

        public void B(long j10, int i10) {
            Handler handler = this.f19996a;
            if (handler != null) {
                handler.post(new o(this, j10, i10));
            }
        }

        public void C(Exception exc) {
            Handler handler = this.f19996a;
            if (handler != null) {
                handler.post(new p(this, exc));
            }
        }

        public void D(z zVar) {
            Handler handler = this.f19996a;
            if (handler != null) {
                handler.post(new t(this, zVar));
            }
        }

        public void k(String str, long j10, long j11) {
            Handler handler = this.f19996a;
            if (handler != null) {
                handler.post(new s(this, str, j10, j11));
            }
        }

        public void l(String str) {
            Handler handler = this.f19996a;
            if (handler != null) {
                handler.post(new r(this, str));
            }
        }

        public void m(e eVar) {
            eVar.c();
            Handler handler = this.f19996a;
            if (handler != null) {
                handler.post(new v(this, eVar));
            }
        }

        public void n(int i10, long j10) {
            Handler handler = this.f19996a;
            if (handler != null) {
                handler.post(new n(this, i10, j10));
            }
        }

        public void o(e eVar) {
            Handler handler = this.f19996a;
            if (handler != null) {
                handler.post(new w(this, eVar));
            }
        }

        public void p(r1 r1Var, i iVar) {
            Handler handler = this.f19996a;
            if (handler != null) {
                handler.post(new u(this, r1Var, iVar));
            }
        }
    }

    void c(String str);

    void e(String str, long j10, long j11);

    void g(e eVar);

    void h(r1 r1Var, i iVar);

    void k(int i10, long j10);

    void m(Object obj, long j10);

    void s(z zVar);

    void v(Exception exc);

    void w(e eVar);

    void y(long j10, int i10);

    @Deprecated
    void z(r1 r1Var);
}
