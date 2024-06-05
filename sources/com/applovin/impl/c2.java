package com.applovin.impl;

import com.applovin.impl.go;
import com.applovin.impl.nh;

public abstract class c2 implements nh {

    /* renamed from: a  reason: collision with root package name */
    protected final go.d f6820a = new go.d();

    protected c2() {
    }

    private int J() {
        int m10 = m();
        if (m10 == 1) {
            return 0;
        }
        return m10;
    }

    public final void B() {
        b(-F());
    }

    public final void D() {
        if (!n().c() && !d()) {
            boolean L = L();
            if (!N() || y()) {
                if (!L || getCurrentPosition() > q()) {
                    a(0);
                } else {
                    Q();
                }
            } else if (L) {
                Q();
            }
        }
    }

    public final long G() {
        go n10 = n();
        if (n10.c()) {
            return -9223372036854775807L;
        }
        return n10.a(t(), this.f6820a).d();
    }

    public final int H() {
        go n10 = n();
        if (n10.c()) {
            return -1;
        }
        return n10.a(t(), J(), r());
    }

    public final int I() {
        go n10 = n();
        if (n10.c()) {
            return -1;
        }
        return n10.b(t(), J(), r());
    }

    public final boolean K() {
        return H() != -1;
    }

    public final boolean L() {
        return I() != -1;
    }

    public final boolean M() {
        go n10 = n();
        return !n10.c() && n10.a(t(), this.f6820a).f8075j;
    }

    public final boolean N() {
        go n10 = n();
        return !n10.c() && n10.a(t(), this.f6820a).e();
    }

    public final void O() {
        c(t());
    }

    public final void P() {
        int H = H();
        if (H != -1) {
            c(H);
        }
    }

    public final void Q() {
        int I = I();
        if (I != -1) {
            c(I);
        }
    }

    public final void a(long j10) {
        a(t(), j10);
    }

    public final boolean b(int i10) {
        return i().a(i10);
    }

    public final void c(int i10) {
        a(i10, -9223372036854775807L);
    }

    public final boolean isPlaying() {
        return o() == 3 && l() && j() == 0;
    }

    public final void u() {
        if (!n().c() && !d()) {
            if (K()) {
                P();
            } else if (N() && M()) {
                O();
            }
        }
    }

    public final void w() {
        b(e());
    }

    public final boolean y() {
        go n10 = n();
        return !n10.c() && n10.a(t(), this.f6820a).f8074i;
    }

    private void b(long j10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        a(Math.max(currentPosition, 0));
    }

    /* access modifiers changed from: protected */
    public nh.b a(nh.b bVar) {
        boolean z10 = true;
        nh.b.a a10 = new nh.b.a().a(bVar).a(3, !d()).a(4, y() && !d()).a(5, L() && !d()).a(6, !n().c() && (L() || !N() || y()) && !d()).a(7, K() && !d()).a(8, !n().c() && (K() || (N() && M())) && !d()).a(9, !d()).a(10, y() && !d());
        if (!y() || d()) {
            z10 = false;
        }
        return a10.a(11, z10).a();
    }
}
