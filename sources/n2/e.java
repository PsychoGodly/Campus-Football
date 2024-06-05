package n2;

import n2.c4;

/* compiled from: BasePlayer */
public abstract class e implements g3 {

    /* renamed from: a  reason: collision with root package name */
    protected final c4.d f20282a = new c4.d();

    protected e() {
    }

    private int Q() {
        int k10 = k();
        if (k10 == 1) {
            return 0;
        }
        return k10;
    }

    private void R(int i10) {
        S(G(), -9223372036854775807L, i10, true);
    }

    private void T(long j10, int i10) {
        S(G(), j10, i10, false);
    }

    private void U(int i10, int i11) {
        S(i10, -9223372036854775807L, i11, false);
    }

    private void V(int i10) {
        int O = O();
        if (O != -1) {
            if (O == G()) {
                R(i10);
            } else {
                U(O, i10);
            }
        }
    }

    public final void A() {
        V(8);
    }

    public final boolean E() {
        return O() != -1;
    }

    public final boolean H() {
        c4 J = J();
        return !J.u() && J.r(G(), this.f20282a).f20243j;
    }

    public final boolean M() {
        c4 J = J();
        return !J.u() && J.r(G(), this.f20282a).h();
    }

    public final long N() {
        c4 J = J();
        if (J.u()) {
            return -9223372036854775807L;
        }
        return J.r(G(), this.f20282a).f();
    }

    public final int O() {
        c4 J = J();
        if (J.u()) {
            return -1;
        }
        return J.i(G(), Q(), K());
    }

    public final int P() {
        c4 J = J();
        if (J.u()) {
            return -1;
        }
        return J.p(G(), Q(), K());
    }

    public abstract void S(int i10, long j10, int i11, boolean z10);

    public final void f(long j10) {
        T(j10, 5);
    }

    public final void l(int i10, long j10) {
        S(i10, j10, 10, false);
    }

    public final void q() {
        U(G(), 4);
    }

    public final boolean r() {
        return P() != -1;
    }

    public final int t() {
        return J().t();
    }

    public final boolean z() {
        c4 J = J();
        return !J.u() && J.r(G(), this.f20282a).f20242i;
    }
}
