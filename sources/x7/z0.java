package x7;

import com.google.protobuf.i;
import java.util.Map;
import p8.r;
import p8.s;
import p8.t;
import t7.i4;
import u7.w;
import y7.b;
import y7.g;

/* compiled from: WatchStream */
public class z0 extends c<s, t, a> {

    /* renamed from: t  reason: collision with root package name */
    public static final i f31204t = i.f27039b;

    /* renamed from: s  reason: collision with root package name */
    private final n0 f31205s;

    /* compiled from: WatchStream */
    interface a extends t0 {
        void c(w wVar, x0 x0Var);
    }

    z0(y yVar, g gVar, n0 n0Var, a aVar) {
        super(yVar, r.c(), gVar, g.d.LISTEN_STREAM_CONNECTION_BACKOFF, g.d.LISTEN_STREAM_IDLE, g.d.HEALTH_CHECK_TIMEOUT, aVar);
        this.f31205s = n0Var;
    }

    public void A(i4 i4Var) {
        b.d(m(), "Watching queries requires an open stream", new Object[0]);
        s.b G = s.m0().H(this.f31205s.a()).G(this.f31205s.V(i4Var));
        Map<String, String> N = this.f31205s.N(i4Var);
        if (N != null) {
            G.F(N);
        }
        x((s) G.build());
    }

    public /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ void u() {
        super.u();
    }

    public /* bridge */ /* synthetic */ void v() {
        super.v();
    }

    /* renamed from: y */
    public void r(t tVar) {
        this.f31033l.f();
        x0 A = this.f31205s.A(tVar);
        ((a) this.f31034m).c(this.f31205s.z(tVar), A);
    }

    public void z(int i10) {
        b.d(m(), "Unwatching targets requires an open stream", new Object[0]);
        x((s) s.m0().H(this.f31205s.a()).I(i10).build());
    }
}
