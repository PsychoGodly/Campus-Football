package x7;

import com.google.protobuf.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p8.f0;
import p8.g0;
import p8.r;
import u7.w;
import v7.f;
import y7.b;
import y7.g;
import y7.x;

/* compiled from: WriteStream */
public class a1 extends c<f0, g0, a> {

    /* renamed from: v  reason: collision with root package name */
    public static final i f31013v = i.f27039b;

    /* renamed from: s  reason: collision with root package name */
    private final n0 f31014s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f31015t = false;

    /* renamed from: u  reason: collision with root package name */
    private i f31016u = f31013v;

    /* compiled from: WriteStream */
    public interface a extends t0 {
        void d();

        void e(w wVar, List<v7.i> list);
    }

    a1(y yVar, g gVar, n0 n0Var, a aVar) {
        super(yVar, r.e(), gVar, g.d.WRITE_STREAM_CONNECTION_BACKOFF, g.d.WRITE_STREAM_IDLE, g.d.HEALTH_CHECK_TIMEOUT, aVar);
        this.f31014s = n0Var;
    }

    /* renamed from: A */
    public void r(g0 g0Var) {
        this.f31016u = g0Var.h0();
        if (!this.f31015t) {
            this.f31015t = true;
            ((a) this.f31034m).d();
            return;
        }
        this.f31033l.f();
        w y10 = this.f31014s.y(g0Var.f0());
        int j02 = g0Var.j0();
        ArrayList arrayList = new ArrayList(j02);
        for (int i10 = 0; i10 < j02; i10++) {
            arrayList.add(this.f31014s.p(g0Var.i0(i10), y10));
        }
        ((a) this.f31034m).e(y10, arrayList);
    }

    /* access modifiers changed from: package-private */
    public void B(i iVar) {
        this.f31016u = (i) x.b(iVar);
    }

    /* access modifiers changed from: package-private */
    public void C() {
        b.d(m(), "Writing handshake requires an opened stream", new Object[0]);
        b.d(!this.f31015t, "Handshake already completed", new Object[0]);
        x((f0) f0.l0().G(this.f31014s.a()).build());
    }

    /* access modifiers changed from: package-private */
    public void D(List<f> list) {
        b.d(m(), "Writing mutations requires an opened stream", new Object[0]);
        b.d(this.f31015t, "Handshake must be complete before writing mutations", new Object[0]);
        f0.b l02 = f0.l0();
        for (f O : list) {
            l02.F(this.f31014s.O(O));
        }
        l02.H(this.f31016u);
        x((f0) l02.build());
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

    public void u() {
        this.f31015t = false;
        super.u();
    }

    public /* bridge */ /* synthetic */ void v() {
        super.v();
    }

    /* access modifiers changed from: protected */
    public void w() {
        if (this.f31015t) {
            D(Collections.emptyList());
        }
    }

    /* access modifiers changed from: package-private */
    public i y() {
        return this.f31016u;
    }

    /* access modifiers changed from: package-private */
    public boolean z() {
        return this.f31015t;
    }
}
