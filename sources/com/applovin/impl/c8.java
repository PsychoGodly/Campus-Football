package com.applovin.impl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.impl.ab;
import com.applovin.impl.ae;
import com.applovin.impl.f6;
import com.applovin.impl.go;
import com.applovin.impl.li;
import com.applovin.impl.od;
import com.applovin.impl.oh;
import com.applovin.impl.rd;
import com.applovin.impl.wd;
import com.applovin.impl.we;
import com.applovin.impl.wo;
import com.applovin.impl.x6;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

final class c8 implements Handler.Callback, rd.a, wo.a, ae.d, f6.a, oh.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean G;
    private boolean H;
    /* access modifiers changed from: private */
    public boolean I;
    private boolean J;
    private int K;
    private h L;
    private long M;
    private int N;
    private boolean O;
    private y7 P;
    private long Q;

    /* renamed from: a  reason: collision with root package name */
    private final li[] f6881a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f6882b;

    /* renamed from: c  reason: collision with root package name */
    private final mi[] f6883c;

    /* renamed from: d  reason: collision with root package name */
    private final wo f6884d;

    /* renamed from: f  reason: collision with root package name */
    private final xo f6885f;

    /* renamed from: g  reason: collision with root package name */
    private final gc f6886g;

    /* renamed from: h  reason: collision with root package name */
    private final x1 f6887h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final ha f6888i;

    /* renamed from: j  reason: collision with root package name */
    private final HandlerThread f6889j;

    /* renamed from: k  reason: collision with root package name */
    private final Looper f6890k;

    /* renamed from: l  reason: collision with root package name */
    private final go.d f6891l;

    /* renamed from: m  reason: collision with root package name */
    private final go.b f6892m;

    /* renamed from: n  reason: collision with root package name */
    private final long f6893n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f6894o;

    /* renamed from: p  reason: collision with root package name */
    private final f6 f6895p;

    /* renamed from: q  reason: collision with root package name */
    private final ArrayList f6896q;

    /* renamed from: r  reason: collision with root package name */
    private final j3 f6897r;

    /* renamed from: s  reason: collision with root package name */
    private final f f6898s;

    /* renamed from: t  reason: collision with root package name */
    private final vd f6899t;

    /* renamed from: u  reason: collision with root package name */
    private final ae f6900u;

    /* renamed from: v  reason: collision with root package name */
    private final fc f6901v;

    /* renamed from: w  reason: collision with root package name */
    private final long f6902w;

    /* renamed from: x  reason: collision with root package name */
    private fj f6903x;

    /* renamed from: y  reason: collision with root package name */
    private lh f6904y;

    /* renamed from: z  reason: collision with root package name */
    private e f6905z;

    class a implements li.a {
        a() {
        }

        public void a(long j10) {
            if (j10 >= 2000) {
                boolean unused = c8.this.I = true;
            }
        }

        public void a() {
            c8.this.f6888i.c(2);
        }
    }

    private static class c {
    }

    public static final class e {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f6915a;

        /* renamed from: b  reason: collision with root package name */
        public lh f6916b;

        /* renamed from: c  reason: collision with root package name */
        public int f6917c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f6918d;

        /* renamed from: e  reason: collision with root package name */
        public int f6919e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f6920f;

        /* renamed from: g  reason: collision with root package name */
        public int f6921g;

        public e(lh lhVar) {
            this.f6916b = lhVar;
        }

        public void b(int i10) {
            this.f6915a = true;
            this.f6920f = true;
            this.f6921g = i10;
        }

        public void c(int i10) {
            boolean z10 = true;
            if (!this.f6918d || this.f6919e == 5) {
                this.f6915a = true;
                this.f6918d = true;
                this.f6919e = i10;
                return;
            }
            if (i10 != 5) {
                z10 = false;
            }
            a1.a(z10);
        }

        public void a(int i10) {
            this.f6915a |= i10 > 0;
            this.f6917c += i10;
        }

        public void a(lh lhVar) {
            this.f6915a |= this.f6916b != lhVar;
            this.f6916b = lhVar;
        }
    }

    public interface f {
        void a(e eVar);
    }

    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final wd.a f6922a;

        /* renamed from: b  reason: collision with root package name */
        public final long f6923b;

        /* renamed from: c  reason: collision with root package name */
        public final long f6924c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f6925d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f6926e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f6927f;

        public g(wd.a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f6922a = aVar;
            this.f6923b = j10;
            this.f6924c = j11;
            this.f6925d = z10;
            this.f6926e = z11;
            this.f6927f = z12;
        }
    }

    private static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final go f6928a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6929b;

        /* renamed from: c  reason: collision with root package name */
        public final long f6930c;

        public h(go goVar, int i10, long j10) {
            this.f6928a = goVar;
            this.f6929b = i10;
            this.f6930c = j10;
        }
    }

    public c8(li[] liVarArr, wo woVar, xo xoVar, gc gcVar, x1 x1Var, int i10, boolean z10, r0 r0Var, fj fjVar, fc fcVar, long j10, boolean z11, Looper looper, j3 j3Var, f fVar) {
        li[] liVarArr2 = liVarArr;
        x1 x1Var2 = x1Var;
        r0 r0Var2 = r0Var;
        long j11 = j10;
        j3 j3Var2 = j3Var;
        this.f6898s = fVar;
        this.f6881a = liVarArr2;
        this.f6884d = woVar;
        this.f6885f = xoVar;
        this.f6886g = gcVar;
        this.f6887h = x1Var2;
        this.F = i10;
        this.G = z10;
        this.f6903x = fjVar;
        this.f6901v = fcVar;
        this.f6902w = j11;
        this.Q = j11;
        this.B = z11;
        this.f6897r = j3Var2;
        this.f6893n = gcVar.d();
        this.f6894o = gcVar.a();
        lh a10 = lh.a(xoVar);
        this.f6904y = a10;
        this.f6905z = new e(a10);
        this.f6883c = new mi[liVarArr2.length];
        for (int i11 = 0; i11 < liVarArr2.length; i11++) {
            liVarArr2[i11].b(i11);
            this.f6883c[i11] = liVarArr2[i11].n();
        }
        this.f6895p = new f6(this, j3Var2);
        this.f6896q = new ArrayList();
        this.f6882b = nj.b();
        this.f6891l = new go.d();
        this.f6892m = new go.b();
        woVar.a(this, x1Var2);
        this.O = true;
        Handler handler = new Handler(looper);
        this.f6899t = new vd(r0Var2, handler);
        this.f6900u = new ae(this, r0Var2, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f6889j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f6890k = looper2;
        this.f6888i = j3Var2.a(looper2, this);
    }

    private void A() {
        float f10 = this.f6895p.a().f9804a;
        sd e10 = this.f6899t.e();
        sd f11 = this.f6899t.f();
        boolean z10 = true;
        while (e10 != null && e10.f11363d) {
            xo b10 = e10.b(f10, this.f6904y.f9219a);
            if (!b10.a(e10.i())) {
                if (z10) {
                    sd e11 = this.f6899t.e();
                    boolean a10 = this.f6899t.a(e11);
                    boolean[] zArr = new boolean[this.f6881a.length];
                    long a11 = e11.a(b10, this.f6904y.f9237s, a10, zArr);
                    lh lhVar = this.f6904y;
                    boolean z11 = (lhVar.f9223e == 4 || a11 == lhVar.f9237s) ? false : true;
                    lh lhVar2 = this.f6904y;
                    sd sdVar = e11;
                    boolean[] zArr2 = zArr;
                    this.f6904y = a(lhVar2.f9220b, a11, lhVar2.f9221c, lhVar2.f9222d, z11, 5);
                    if (z11) {
                        c(a11);
                    }
                    boolean[] zArr3 = new boolean[this.f6881a.length];
                    int i10 = 0;
                    while (true) {
                        li[] liVarArr = this.f6881a;
                        if (i10 >= liVarArr.length) {
                            break;
                        }
                        li liVar = liVarArr[i10];
                        boolean c10 = c(liVar);
                        zArr3[i10] = c10;
                        yi yiVar = sdVar.f11362c[i10];
                        if (c10) {
                            if (yiVar != liVar.o()) {
                                a(liVar);
                            } else if (zArr2[i10]) {
                                liVar.a(this.M);
                            }
                        }
                        i10++;
                    }
                    a(zArr3);
                } else {
                    this.f6899t.a(e10);
                    if (e10.f11363d) {
                        e10.a(b10, Math.max(e10.f11365f.f12552b, e10.d(this.M)), false);
                    }
                }
                a(true);
                if (this.f6904y.f9223e != 4) {
                    m();
                    K();
                    this.f6888i.c(2);
                    return;
                }
                return;
            }
            if (e10 == f11) {
                z10 = false;
            }
            e10 = e10.d();
        }
    }

    private void B() {
        sd e10 = this.f6899t.e();
        this.C = e10 != null && e10.f11365f.f12558h && this.B;
    }

    private boolean C() {
        sd e10;
        sd d10;
        if (E() && !this.C && (e10 = this.f6899t.e()) != null && (d10 = e10.d()) != null && this.M >= d10.g() && d10.f11366g) {
            return true;
        }
        return false;
    }

    private boolean D() {
        long j10;
        if (!j()) {
            return false;
        }
        sd d10 = this.f6899t.d();
        long b10 = b(d10.e());
        if (d10 == this.f6899t.e()) {
            j10 = d10.d(this.M);
        } else {
            j10 = d10.d(this.M) - d10.f11365f.f12552b;
        }
        return this.f6886g.a(j10, b10, this.f6895p.a().f9804a);
    }

    private boolean E() {
        lh lhVar = this.f6904y;
        return lhVar.f9230l && lhVar.f9231m == 0;
    }

    private void F() {
        this.D = false;
        this.f6895p.b();
        for (li liVar : this.f6881a) {
            if (c(liVar)) {
                liVar.start();
            }
        }
    }

    private void H() {
        this.f6895p.c();
        for (li liVar : this.f6881a) {
            if (c(liVar)) {
                b(liVar);
            }
        }
    }

    private void I() {
        sd d10 = this.f6899t.d();
        boolean z10 = this.E || (d10 != null && d10.f11360a.a());
        lh lhVar = this.f6904y;
        if (z10 != lhVar.f9225g) {
            this.f6904y = lhVar.a(z10);
        }
    }

    private void J() {
        if (!this.f6904y.f9219a.c() && this.f6900u.d()) {
            o();
            q();
            r();
            p();
        }
    }

    private void K() {
        sd e10 = this.f6899t.e();
        if (e10 != null) {
            long h10 = e10.f11363d ? e10.f11360a.h() : -9223372036854775807L;
            if (h10 != -9223372036854775807L) {
                c(h10);
                if (h10 != this.f6904y.f9237s) {
                    lh lhVar = this.f6904y;
                    this.f6904y = a(lhVar.f9220b, h10, lhVar.f9221c, h10, true, 5);
                }
            } else {
                long b10 = this.f6895p.b(e10 != this.f6899t.f());
                this.M = b10;
                long d10 = e10.d(b10);
                b(this.f6904y.f9237s, d10);
                this.f6904y.f9237s = d10;
            }
            this.f6904y.f9235q = this.f6899t.d().c();
            this.f6904y.f9236r = h();
            lh lhVar2 = this.f6904y;
            if (lhVar2.f9230l && lhVar2.f9223e == 3 && a(lhVar2.f9219a, lhVar2.f9220b) && this.f6904y.f9232n.f9804a == 1.0f) {
                float a10 = this.f6901v.a(e(), h());
                if (this.f6895p.a().f9804a != a10) {
                    this.f6895p.a(this.f6904y.f9232n.a(a10));
                    a(this.f6904y.f9232n, this.f6895p.a().f9804a, false, false);
                }
            }
        }
    }

    private void b() {
        c(true);
    }

    private void c() {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        long a10 = this.f6897r.a();
        J();
        int i11 = this.f6904y.f9223e;
        if (i11 == 1 || i11 == 4) {
            this.f6888i.b(2);
            return;
        }
        sd e10 = this.f6899t.e();
        if (e10 == null) {
            c(a10, 10);
            return;
        }
        lo.a("doSomeWork");
        K();
        if (e10.f11363d) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            e10.f11360a.a(this.f6904y.f9237s - this.f6893n, this.f6894o);
            int i12 = 0;
            z11 = true;
            z10 = true;
            while (true) {
                li[] liVarArr = this.f6881a;
                if (i12 >= liVarArr.length) {
                    break;
                }
                li liVar = liVarArr[i12];
                if (c(liVar)) {
                    liVar.a(this.M, elapsedRealtime);
                    z11 = z11 && liVar.c();
                    boolean z13 = e10.f11362c[i12] != liVar.o();
                    boolean z14 = z13 || (!z13 && liVar.j()) || liVar.d() || liVar.c();
                    z10 = z10 && z14;
                    if (!z14) {
                        liVar.h();
                    }
                }
                i12++;
            }
        } else {
            e10.f11360a.f();
            z11 = true;
            z10 = true;
        }
        long j10 = e10.f11365f.f12555e;
        boolean z15 = z11 && e10.f11363d && (j10 == -9223372036854775807L || j10 <= this.f6904y.f9237s);
        if (z15 && this.C) {
            this.C = false;
            a(false, this.f6904y.f9231m, false, 5);
        }
        if (z15 && e10.f11365f.f12559i) {
            c(4);
            H();
        } else if (this.f6904y.f9223e == 2 && h(z10)) {
            c(3);
            this.P = null;
            if (E()) {
                F();
            }
        } else if (this.f6904y.f9223e == 3 && (this.K != 0 ? !z10 : !k())) {
            this.D = E();
            c(2);
            if (this.D) {
                u();
                this.f6901v.a();
            }
            H();
        }
        if (this.f6904y.f9223e == 2) {
            int i13 = 0;
            while (true) {
                li[] liVarArr2 = this.f6881a;
                if (i13 >= liVarArr2.length) {
                    break;
                }
                if (c(liVarArr2[i13]) && this.f6881a[i13].o() == e10.f11362c[i13]) {
                    this.f6881a[i13].h();
                }
                i13++;
            }
            lh lhVar = this.f6904y;
            if (!lhVar.f9225g && lhVar.f9236r < 500000 && j()) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        boolean z16 = this.J;
        lh lhVar2 = this.f6904y;
        if (z16 != lhVar2.f9233o) {
            this.f6904y = lhVar2.b(z16);
        }
        if ((!E() || this.f6904y.f9223e != 3) && (i10 = this.f6904y.f9223e) != 2) {
            if (this.K == 0 || i10 == 4) {
                this.f6888i.b(2);
            } else {
                c(a10, 1000);
            }
            z12 = false;
        } else {
            z12 = !a(a10, 10);
        }
        lh lhVar3 = this.f6904y;
        if (lhVar3.f9234p != z12) {
            this.f6904y = lhVar3.c(z12);
        }
        this.I = false;
        lo.a();
    }

    private void d() {
        a(new boolean[this.f6881a.length]);
    }

    private long e() {
        lh lhVar = this.f6904y;
        return a(lhVar.f9219a, lhVar.f9220b.f12394a, lhVar.f9237s);
    }

    private long f() {
        sd f10 = this.f6899t.f();
        if (f10 == null) {
            return 0;
        }
        long f11 = f10.f();
        if (!f10.f11363d) {
            return f11;
        }
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.f6881a;
            if (i10 >= liVarArr.length) {
                return f11;
            }
            if (c(liVarArr[i10]) && this.f6881a[i10].o() == f10.f11362c[i10]) {
                long i11 = this.f6881a[i10].i();
                if (i11 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                f11 = Math.max(i11, f11);
            }
            i10++;
        }
    }

    private long h() {
        return b(this.f6904y.f9235q);
    }

    private boolean i() {
        sd f10 = this.f6899t.f();
        if (!f10.f11363d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            li[] liVarArr = this.f6881a;
            if (i10 >= liVarArr.length) {
                return true;
            }
            li liVar = liVarArr[i10];
            yi yiVar = f10.f11362c[i10];
            if (liVar.o() != yiVar || (yiVar != null && !liVar.j() && !a(liVar, f10))) {
                return false;
            }
            i10++;
        }
        return false;
    }

    private boolean j() {
        sd d10 = this.f6899t.d();
        if (d10 == null || d10.e() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private boolean k() {
        sd e10 = this.f6899t.e();
        long j10 = e10.f11365f.f12555e;
        return e10.f11363d && (j10 == -9223372036854775807L || this.f6904y.f9237s < j10 || !E());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean l() {
        return Boolean.valueOf(this.A);
    }

    private void m() {
        boolean D2 = D();
        this.E = D2;
        if (D2) {
            this.f6899t.d().a(this.M);
        }
        I();
    }

    private void n() {
        this.f6905z.a(this.f6904y);
        if (this.f6905z.f6915a) {
            this.f6898s.a(this.f6905z);
            this.f6905z = new e(this.f6904y);
        }
    }

    private void o() {
        ud a10;
        this.f6899t.a(this.M);
        if (this.f6899t.h() && (a10 = this.f6899t.a(this.M, this.f6904y)) != null) {
            sd a11 = this.f6899t.a(this.f6883c, this.f6884d, this.f6886g.b(), this.f6900u, a10, this.f6885f);
            a11.f11360a.a((rd.a) this, a10.f12552b);
            if (this.f6899t.e() == a11) {
                c(a11.g());
            }
            a(false);
        }
        if (this.E) {
            this.E = j();
            I();
            return;
        }
        m();
    }

    private void p() {
        boolean z10 = false;
        while (C()) {
            if (z10) {
                n();
            }
            sd e10 = this.f6899t.e();
            sd a10 = this.f6899t.a();
            ud udVar = a10.f11365f;
            wd.a aVar = udVar.f12551a;
            long j10 = udVar.f12552b;
            lh a11 = a(aVar, j10, udVar.f12553c, j10, true, 0);
            this.f6904y = a11;
            go goVar = a11.f9219a;
            a(goVar, a10.f11365f.f12551a, goVar, e10.f11365f.f12551a, -9223372036854775807L);
            B();
            K();
            z10 = true;
        }
    }

    private void q() {
        sd f10 = this.f6899t.f();
        if (f10 != null) {
            int i10 = 0;
            if (f10.d() == null || this.C) {
                if (f10.f11365f.f12559i || this.C) {
                    while (true) {
                        li[] liVarArr = this.f6881a;
                        if (i10 < liVarArr.length) {
                            li liVar = liVarArr[i10];
                            yi yiVar = f10.f11362c[i10];
                            if (yiVar != null && liVar.o() == yiVar && liVar.j()) {
                                long j10 = f10.f11365f.f12555e;
                                a(liVar, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : f10.f() + f10.f11365f.f12555e);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (i()) {
                if (f10.d().f11363d || this.M >= f10.d().g()) {
                    xo i11 = f10.i();
                    sd b10 = this.f6899t.b();
                    xo i12 = b10.i();
                    if (!b10.f11363d || b10.f11360a.h() == -9223372036854775807L) {
                        for (int i13 = 0; i13 < this.f6881a.length; i13++) {
                            boolean a10 = i11.a(i13);
                            boolean a11 = i12.a(i13);
                            if (a10 && !this.f6881a[i13].k()) {
                                boolean z10 = this.f6883c[i13].e() == -2;
                                ni niVar = i11.f13433b[i13];
                                ni niVar2 = i12.f13433b[i13];
                                if (!a11 || !niVar2.equals(niVar) || z10) {
                                    a(this.f6881a[i13], b10.g());
                                }
                            }
                        }
                        return;
                    }
                    d(b10.g());
                }
            }
        }
    }

    private void r() {
        sd f10 = this.f6899t.f();
        if (f10 != null && this.f6899t.e() != f10 && !f10.f11366g && z()) {
            d();
        }
    }

    private void s() {
        a(this.f6900u.a(), true);
    }

    private void t() {
        for (sd e10 = this.f6899t.e(); e10 != null; e10 = e10.d()) {
            for (f8 f8Var : e10.i().f13434c) {
                if (f8Var != null) {
                    f8Var.j();
                }
            }
        }
    }

    private void u() {
        for (sd e10 = this.f6899t.e(); e10 != null; e10 = e10.d()) {
            for (f8 f8Var : e10.i().f13434c) {
                if (f8Var != null) {
                    f8Var.k();
                }
            }
        }
    }

    private void w() {
        this.f6905z.a(1);
        a(false, false, false, true);
        this.f6886g.f();
        c(this.f6904y.f9219a.c() ? 4 : 2);
        this.f6900u.a(this.f6887h.a());
        this.f6888i.c(2);
    }

    private void y() {
        a(true, false, true, false);
        this.f6886g.e();
        c(1);
        this.f6889j.quit();
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    private boolean z() {
        sd f10 = this.f6899t.f();
        xo i10 = f10.i();
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            li[] liVarArr = this.f6881a;
            if (i11 >= liVarArr.length) {
                return !z10;
            }
            li liVar = liVarArr[i11];
            if (c(liVar)) {
                boolean z11 = liVar.o() != f10.f11362c[i11];
                if (!i10.a(i11) || z11) {
                    if (!liVar.k()) {
                        liVar.a(a(i10.f13434c[i11]), f10.f11362c[i11], f10.g(), f10.f());
                    } else if (liVar.c()) {
                        a(liVar);
                    } else {
                        z10 = true;
                    }
                }
            }
            i11++;
        }
    }

    public void G() {
        this.f6888i.d(6).a();
    }

    public Looper g() {
        return this.f6890k;
    }

    public boolean handleMessage(Message message) {
        sd f10;
        int i10 = 1000;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    c();
                    break;
                case 3:
                    a((h) message.obj);
                    break;
                case 4:
                    b((mh) message.obj);
                    break;
                case 5:
                    a((fj) message.obj);
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    y();
                    return true;
                case 8:
                    c((rd) message.obj);
                    break;
                case 9:
                    b((rd) message.obj);
                    break;
                case 10:
                    A();
                    break;
                case 11:
                    b(message.arg1);
                    break;
                case 12:
                    g(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    d((oh) message.obj);
                    break;
                case 15:
                    f((oh) message.obj);
                    break;
                case 16:
                    a((mh) message.obj, false);
                    break;
                case 17:
                    a((b) message.obj);
                    break;
                case 18:
                    a((b) message.obj, message.arg1);
                    break;
                case 19:
                    b8.a(message.obj);
                    a((c) null);
                    break;
                case 20:
                    a(message.arg1, message.arg2, (tj) message.obj);
                    break;
                case 21:
                    a((tj) message.obj);
                    break;
                case 22:
                    s();
                    break;
                case 23:
                    e(message.arg1 != 0);
                    break;
                case 24:
                    d(message.arg1 == 1);
                    break;
                case 25:
                    b();
                    break;
                default:
                    return false;
            }
        } catch (y7 e10) {
            e = e10;
            if (e.f13532d == 1 && (f10 = this.f6899t.f()) != null) {
                e = e.a((td) f10.f11365f.f12551a);
            }
            if (!e.f13538k || this.P != null) {
                y7 y7Var = this.P;
                if (y7Var != null) {
                    y7Var.addSuppressed(e);
                    e = this.P;
                }
                kc.a("ExoPlayerImplInternal", "Playback error", e);
                a(true, false);
                this.f6904y = this.f6904y.a(e);
            } else {
                kc.c("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.P = e;
                ha haVar = this.f6888i;
                haVar.a(haVar.a(25, (Object) e));
            }
        } catch (x6.a e11) {
            a((IOException) e11, e11.f13290a);
        } catch (ah e12) {
            int i11 = e12.f6536b;
            if (i11 == 1) {
                i10 = e12.f6535a ? AdError.MEDIATION_ERROR_CODE : 3003;
            } else if (i11 == 4) {
                i10 = e12.f6535a ? 3002 : 3004;
            }
            a((IOException) e12, i10);
        } catch (h5 e13) {
            a((IOException) e13, e13.f8230a);
        } catch (IOException e14) {
            a(e14, (int) AdError.SERVER_ERROR_CODE);
        } catch (RuntimeException e15) {
            if ((e15 instanceof IllegalStateException) || (e15 instanceof IllegalArgumentException)) {
                i10 = 1004;
            }
            y7 a10 = y7.a(e15, i10);
            kc.a("ExoPlayerImplInternal", "Playback error", a10);
            a(true, false);
            this.f6904y = this.f6904y.a(a10);
        }
        n();
        return true;
    }

    public void v() {
        this.f6888i.d(0).a();
    }

    public synchronized boolean x() {
        if (!this.A) {
            if (this.f6889j.isAlive()) {
                this.f6888i.c(7);
                a((Supplier) new sv(this), this.f6902w);
                return this.A;
            }
        }
        return true;
    }

    private void b(oh ohVar) {
        if (!ohVar.i()) {
            try {
                ohVar.e().a(ohVar.g(), ohVar.c());
            } finally {
                ohVar.a(true);
            }
        }
    }

    private void e(oh ohVar) {
        if (ohVar.b() == this.f6890k) {
            b(ohVar);
            int i10 = this.f6904y.f9223e;
            if (i10 == 3 || i10 == 2) {
                this.f6888i.c(2);
                return;
            }
            return;
        }
        this.f6888i.a(15, (Object) ohVar).a();
    }

    private void g(boolean z10) {
        this.G = z10;
        if (!this.f6899t.a(this.f6904y.f9219a, z10)) {
            c(true);
        }
        a(false);
    }

    private boolean h(boolean z10) {
        if (this.K == 0) {
            return k();
        }
        if (!z10) {
            return false;
        }
        lh lhVar = this.f6904y;
        if (!lhVar.f9225g) {
            return true;
        }
        long b10 = a(lhVar.f9219a, this.f6899t.e().f11365f.f12551a) ? this.f6901v.b() : -9223372036854775807L;
        sd d10 = this.f6899t.d();
        boolean z11 = d10.j() && d10.f11365f.f12559i;
        boolean z12 = d10.f11365f.f12551a.a() && !d10.f11363d;
        if (z11 || z12 || this.f6886g.a(h(), this.f6895p.a().f9804a, this.D, b10)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void a(rd rdVar) {
        this.f6888i.a(9, (Object) rdVar).a();
    }

    private static final class d implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public final oh f6911a;

        /* renamed from: b  reason: collision with root package name */
        public int f6912b;

        /* renamed from: c  reason: collision with root package name */
        public long f6913c;

        /* renamed from: d  reason: collision with root package name */
        public Object f6914d;

        public d(oh ohVar) {
            this.f6911a = ohVar;
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            Object obj = this.f6914d;
            if ((obj == null) != (dVar.f6914d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f6912b - dVar.f6912b;
            if (i10 != 0) {
                return i10;
            }
            return yp.a(this.f6913c, dVar.f6913c);
        }

        public void a(int i10, long j10, Object obj) {
            this.f6912b = i10;
            this.f6913c = j10;
            this.f6914d = obj;
        }
    }

    private void a(tj tjVar) {
        this.f6905z.a(1);
        a(this.f6900u.a(tjVar), false);
    }

    private void d(oh ohVar) {
        if (ohVar.d() == -9223372036854775807L) {
            e(ohVar);
        } else if (this.f6904y.f9219a.c()) {
            this.f6896q.add(new d(ohVar));
        } else {
            d dVar = new d(ohVar);
            go goVar = this.f6904y.f9219a;
            if (a(dVar, goVar, goVar, this.F, this.G, this.f6891l, this.f6892m)) {
                this.f6896q.add(dVar);
                Collections.sort(this.f6896q);
                return;
            }
            ohVar.a(false);
        }
    }

    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List f6907a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final tj f6908b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f6909c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f6910d;

        private b(List list, tj tjVar, int i10, long j10) {
            this.f6907a = list;
            this.f6908b = tjVar;
            this.f6909c = i10;
            this.f6910d = j10;
        }

        /* synthetic */ b(List list, tj tjVar, int i10, long j10, a aVar) {
            this(list, tjVar, i10, j10);
        }
    }

    private void a(b bVar, int i10) {
        this.f6905z.a(1);
        ae aeVar = this.f6900u;
        if (i10 == -1) {
            i10 = aeVar.c();
        }
        a(aeVar.a(i10, bVar.f6907a, bVar.f6908b), false);
    }

    private void b(li liVar) {
        if (liVar.b() == 2) {
            liVar.stop();
        }
    }

    private void e(boolean z10) {
        this.B = z10;
        B();
        if (this.C && this.f6899t.f() != this.f6899t.e()) {
            c(true);
            a(false);
        }
    }

    private long b(long j10) {
        sd d10 = this.f6899t.d();
        if (d10 == null) {
            return 0;
        }
        return Math.max(0, j10 - d10.d(this.M));
    }

    private void f(oh ohVar) {
        Looper b10 = ohVar.b();
        if (!b10.getThread().isAlive()) {
            kc.d("TAG", "Trying to send message on a dead thread.");
            ohVar.a(false);
            return;
        }
        this.f6897r.a(b10, (Handler.Callback) null).a((Runnable) new tv(this, ohVar));
    }

    private void d(long j10) {
        for (li liVar : this.f6881a) {
            if (liVar.o() != null) {
                a(liVar, j10);
            }
        }
    }

    private boolean a(go goVar, wd.a aVar) {
        if (aVar.a() || goVar.c()) {
            return false;
        }
        goVar.a(goVar.a(aVar.f12394a, this.f6892m).f8054c, this.f6891l);
        if (!this.f6891l.e()) {
            return false;
        }
        go.d dVar = this.f6891l;
        if (!dVar.f8075j || dVar.f8072g == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    private void b(rd rdVar) {
        if (this.f6899t.a(rdVar)) {
            this.f6899t.a(this.M);
            m();
        }
    }

    private void d(boolean z10) {
        if (z10 != this.J) {
            this.J = z10;
            lh lhVar = this.f6904y;
            int i10 = lhVar.f9223e;
            if (z10 || i10 == 4 || i10 == 1) {
                this.f6904y = lhVar.b(z10);
            } else {
                this.f6888i.c(2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00a1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(long r10, long r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = r9.f6896q
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0101
            com.applovin.impl.lh r0 = r9.f6904y
            com.applovin.impl.wd$a r0 = r0.f9220b
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0014
            goto L_0x0101
        L_0x0014:
            boolean r0 = r9.O
            if (r0 == 0) goto L_0x001e
            r0 = 1
            long r10 = r10 - r0
            r0 = 0
            r9.O = r0
        L_0x001e:
            com.applovin.impl.lh r0 = r9.f6904y
            com.applovin.impl.go r1 = r0.f9219a
            com.applovin.impl.wd$a r0 = r0.f9220b
            java.lang.Object r0 = r0.f12394a
            int r0 = r1.a((java.lang.Object) r0)
            int r1 = r9.N
            java.util.ArrayList r2 = r9.f6896q
            int r2 = r2.size()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            if (r1 <= 0) goto L_0x0044
            java.util.ArrayList r3 = r9.f6896q
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            com.applovin.impl.c8$d r3 = (com.applovin.impl.c8.d) r3
            goto L_0x0045
        L_0x0044:
            r3 = r2
        L_0x0045:
            if (r3 == 0) goto L_0x0067
            int r4 = r3.f6912b
            if (r4 > r0) goto L_0x0053
            if (r4 != r0) goto L_0x0067
            long r3 = r3.f6913c
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0067
        L_0x0053:
            int r3 = r1 + -1
            if (r3 <= 0) goto L_0x0062
            java.util.ArrayList r4 = r9.f6896q
            int r1 = r1 + -2
            java.lang.Object r1 = r4.get(r1)
            com.applovin.impl.c8$d r1 = (com.applovin.impl.c8.d) r1
            goto L_0x0063
        L_0x0062:
            r1 = r2
        L_0x0063:
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x0045
        L_0x0067:
            java.util.ArrayList r3 = r9.f6896q
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0079
            java.util.ArrayList r3 = r9.f6896q
            java.lang.Object r3 = r3.get(r1)
            com.applovin.impl.c8$d r3 = (com.applovin.impl.c8.d) r3
            r4 = r9
            goto L_0x007c
        L_0x0079:
            r3 = r9
        L_0x007a:
            r4 = r3
            r3 = r2
        L_0x007c:
            if (r3 == 0) goto L_0x00a3
            java.lang.Object r5 = r3.f6914d
            if (r5 == 0) goto L_0x00a3
            int r5 = r3.f6912b
            if (r5 < r0) goto L_0x008e
            if (r5 != r0) goto L_0x00a3
            long r5 = r3.f6913c
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 > 0) goto L_0x00a3
        L_0x008e:
            int r1 = r1 + 1
            java.util.ArrayList r3 = r4.f6896q
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00a1
            java.util.ArrayList r3 = r4.f6896q
            java.lang.Object r3 = r3.get(r1)
            com.applovin.impl.c8$d r3 = (com.applovin.impl.c8.d) r3
            goto L_0x007c
        L_0x00a1:
            r3 = r4
            goto L_0x007a
        L_0x00a3:
            if (r3 == 0) goto L_0x00ff
            java.lang.Object r5 = r3.f6914d
            if (r5 == 0) goto L_0x00ff
            int r5 = r3.f6912b
            if (r5 != r0) goto L_0x00ff
            long r5 = r3.f6913c
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x00ff
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 > 0) goto L_0x00ff
            com.applovin.impl.oh r5 = r3.f6911a     // Catch:{ all -> 0x00e8 }
            r4.e((com.applovin.impl.oh) r5)     // Catch:{ all -> 0x00e8 }
            com.applovin.impl.oh r5 = r3.f6911a
            boolean r5 = r5.a()
            if (r5 != 0) goto L_0x00d0
            com.applovin.impl.oh r3 = r3.f6911a
            boolean r3 = r3.i()
            if (r3 == 0) goto L_0x00cd
            goto L_0x00d0
        L_0x00cd:
            int r1 = r1 + 1
            goto L_0x00d5
        L_0x00d0:
            java.util.ArrayList r3 = r4.f6896q
            r3.remove(r1)
        L_0x00d5:
            java.util.ArrayList r3 = r4.f6896q
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00e6
            java.util.ArrayList r3 = r4.f6896q
            java.lang.Object r3 = r3.get(r1)
            com.applovin.impl.c8$d r3 = (com.applovin.impl.c8.d) r3
            goto L_0x00a3
        L_0x00e6:
            r3 = r2
            goto L_0x00a3
        L_0x00e8:
            r10 = move-exception
            com.applovin.impl.oh r11 = r3.f6911a
            boolean r11 = r11.a()
            if (r11 != 0) goto L_0x00f9
            com.applovin.impl.oh r11 = r3.f6911a
            boolean r11 = r11.i()
            if (r11 == 0) goto L_0x00fe
        L_0x00f9:
            java.util.ArrayList r11 = r4.f6896q
            r11.remove(r1)
        L_0x00fe:
            throw r10
        L_0x00ff:
            r4.N = r1
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c8.b(long, long):void");
    }

    public void f(boolean z10) {
        this.f6888i.a(12, z10 ? 1 : 0, 0).a();
    }

    private void a(li liVar) {
        if (c(liVar)) {
            this.f6895p.a(liVar);
            b(liVar);
            liVar.f();
            this.K--;
        }
    }

    private void a(boolean z10, boolean z11) {
        a(z10 || !this.H, false, true, false);
        this.f6905z.a(z11 ? 1 : 0);
        this.f6886g.c();
        c(1);
    }

    private void a(go goVar, wd.a aVar, go goVar2, wd.a aVar2, long j10) {
        if (goVar.c() || !a(goVar, aVar)) {
            float f10 = this.f6895p.a().f9804a;
            mh mhVar = this.f6904y.f9232n;
            if (f10 != mhVar.f9804a) {
                this.f6895p.a(mhVar);
                return;
            }
            return;
        }
        goVar.a(goVar.a(aVar.f12394a, this.f6892m).f8054c, this.f6891l);
        this.f6901v.a((od.f) yp.a((Object) this.f6891l.f8077l));
        if (j10 != -9223372036854775807L) {
            this.f6901v.a(a(goVar, aVar.f12394a, j10));
            return;
        }
        Object obj = this.f6891l.f8067a;
        Object obj2 = null;
        if (!goVar2.c()) {
            obj2 = goVar2.a(goVar2.a(aVar2.f12394a, this.f6892m).f8054c, this.f6891l).f8067a;
        }
        if (!yp.a(obj2, obj)) {
            this.f6901v.a(-9223372036854775807L);
        }
    }

    private void b(boolean z10) {
        for (sd e10 = this.f6899t.e(); e10 != null; e10 = e10.d()) {
            for (f8 f8Var : e10.i().f13434c) {
                if (f8Var != null) {
                    f8Var.a(z10);
                }
            }
        }
    }

    private void a(int i10, boolean z10) {
        li liVar = this.f6881a[i10];
        if (!c(liVar)) {
            sd f10 = this.f6899t.f();
            boolean z11 = f10 == this.f6899t.e();
            xo i11 = f10.i();
            ni niVar = i11.f13433b[i10];
            d9[] a10 = a(i11.f13434c[i10]);
            boolean z12 = E() && this.f6904y.f9223e == 3;
            boolean z13 = !z10 && z12;
            this.K++;
            this.f6882b.add(liVar);
            liVar.a(niVar, a10, f10.f11362c[i10], this.M, z13, z11, f10.g(), f10.f());
            liVar.a(11, new a());
            this.f6895p.b(liVar);
            if (z12) {
                liVar.start();
            }
        }
    }

    public void b(int i10, int i11, tj tjVar) {
        this.f6888i.a(20, i10, i11, tjVar).a();
    }

    private void b(mh mhVar) {
        this.f6895p.a(mhVar);
        a(this.f6895p.a(), true);
    }

    private void b(int i10) {
        this.F = i10;
        if (!this.f6899t.a(this.f6904y.f9219a, i10)) {
            c(true);
        }
        a(false);
    }

    private void a(qo qoVar, xo xoVar) {
        this.f6886g.a(this.f6881a, qoVar, xoVar.f13434c);
    }

    private void a(boolean[] zArr) {
        sd f10 = this.f6899t.f();
        xo i10 = f10.i();
        for (int i11 = 0; i11 < this.f6881a.length; i11++) {
            if (!i10.a(i11) && this.f6882b.remove(this.f6881a[i11])) {
                this.f6881a[i11].reset();
            }
        }
        for (int i12 = 0; i12 < this.f6881a.length; i12++) {
            if (i10.a(i12)) {
                a(i12, zArr[i12]);
            }
        }
        f10.f11366g = true;
    }

    private void c(rd rdVar) {
        if (this.f6899t.a(rdVar)) {
            sd d10 = this.f6899t.d();
            d10.a(this.f6895p.a().f9804a, this.f6904y.f9219a);
            a(d10.h(), d10.i());
            if (d10 == this.f6899t.e()) {
                c(d10.f11365f.f12552b);
                d();
                lh lhVar = this.f6904y;
                wd.a aVar = lhVar.f9220b;
                long j10 = d10.f11365f.f12552b;
                this.f6904y = a(aVar, j10, lhVar.f9221c, j10, false, 5);
            }
            m();
        }
    }

    public void a(long j10) {
        this.Q = j10;
    }

    private void a(float f10) {
        for (sd e10 = this.f6899t.e(); e10 != null; e10 = e10.d()) {
            for (f8 f8Var : e10.i().f13434c) {
                if (f8Var != null) {
                    f8Var.a(f10);
                }
            }
        }
    }

    private synchronized void a(Supplier supplier, long j10) {
        long c10 = this.f6897r.c() + j10;
        boolean z10 = false;
        while (!((Boolean) supplier.get()).booleanValue() && j10 > 0) {
            try {
                this.f6897r.b();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = c10 - this.f6897r.c();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private static boolean c(li liVar) {
        return liVar.b() != 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(oh ohVar) {
        try {
            b(ohVar);
        } catch (y7 e10) {
            kc.a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private ab a(f8[] f8VarArr) {
        ab.a aVar = new ab.a();
        boolean z10 = false;
        for (f8 f8Var : f8VarArr) {
            if (f8Var != null) {
                we weVar = f8Var.a(0).f7151k;
                if (weVar == null) {
                    aVar.b(new we(new we.b[0]));
                } else {
                    aVar.b(weVar);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.a() : ab.h();
    }

    private void c(long j10) {
        sd e10 = this.f6899t.e();
        if (e10 != null) {
            j10 = e10.e(j10);
        }
        this.M = j10;
        this.f6895p.a(j10);
        for (li liVar : this.f6881a) {
            if (c(liVar)) {
                liVar.a(this.M);
            }
        }
        t();
    }

    private static d9[] a(f8 f8Var) {
        int b10 = f8Var != null ? f8Var.b() : 0;
        d9[] d9VarArr = new d9[b10];
        for (int i10 = 0; i10 < b10; i10++) {
            d9VarArr[i10] = f8Var.a(i10);
        }
        return d9VarArr;
    }

    private void c(long j10, long j11) {
        this.f6888i.b(2);
        this.f6888i.a(2, j10 + j11);
    }

    private void c(boolean z10) {
        wd.a aVar = this.f6899t.e().f11365f.f12551a;
        long a10 = a(aVar, this.f6904y.f9237s, true, false);
        if (a10 != this.f6904y.f9237s) {
            lh lhVar = this.f6904y;
            this.f6904y = a(aVar, a10, lhVar.f9221c, lhVar.f9222d, z10, 5);
        }
    }

    private long a(go goVar, Object obj, long j10) {
        goVar.a(goVar.a(obj, this.f6892m).f8054c, this.f6891l);
        go.d dVar = this.f6891l;
        if (dVar.f8072g != -9223372036854775807L && dVar.e()) {
            go.d dVar2 = this.f6891l;
            if (dVar2.f8075j) {
                return r2.a(dVar2.a() - this.f6891l.f8072g) - (j10 + this.f6892m.e());
            }
        }
        return -9223372036854775807L;
    }

    private Pair a(go goVar) {
        long j10 = 0;
        if (goVar.c()) {
            return Pair.create(lh.a(), 0L);
        }
        go goVar2 = goVar;
        Pair a10 = goVar2.a(this.f6891l, this.f6892m, goVar.a(this.G), -9223372036854775807L);
        wd.a a11 = this.f6899t.a(goVar, a10.first, 0);
        long longValue = ((Long) a10.second).longValue();
        if (a11.a()) {
            goVar.a(a11.f12394a, this.f6892m);
            if (a11.f12396c == this.f6892m.d(a11.f12395b)) {
                j10 = this.f6892m.b();
            }
        } else {
            j10 = longValue;
        }
        return Pair.create(a11, Long.valueOf(j10));
    }

    private void c(int i10) {
        lh lhVar = this.f6904y;
        if (lhVar.f9223e != i10) {
            this.f6904y = lhVar.a(i10);
        }
    }

    private void a(IOException iOException, int i10) {
        y7 a10 = y7.a(iOException, i10);
        sd e10 = this.f6899t.e();
        if (e10 != null) {
            a10 = a10.a((td) e10.f11365f.f12551a);
        }
        kc.a("ExoPlayerImplInternal", "Playback error", a10);
        a(false, false);
        this.f6904y = this.f6904y.a(a10);
    }

    private void a(boolean z10) {
        long j10;
        sd d10 = this.f6899t.d();
        wd.a aVar = d10 == null ? this.f6904y.f9220b : d10.f11365f.f12551a;
        boolean z11 = !this.f6904y.f9229k.equals(aVar);
        if (z11) {
            this.f6904y = this.f6904y.a(aVar);
        }
        lh lhVar = this.f6904y;
        if (d10 == null) {
            j10 = lhVar.f9237s;
        } else {
            j10 = d10.c();
        }
        lhVar.f9235q = j10;
        this.f6904y.f9236r = h();
        if ((z11 || z10) && d10 != null && d10.f11363d) {
            a(d10.h(), d10.i());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.applovin.impl.go r25, boolean r26) {
        /*
            r24 = this;
            r11 = r24
            r12 = r25
            com.applovin.impl.lh r2 = r11.f6904y
            com.applovin.impl.c8$h r3 = r11.L
            com.applovin.impl.vd r4 = r11.f6899t
            int r5 = r11.F
            boolean r6 = r11.G
            com.applovin.impl.go$d r7 = r11.f6891l
            com.applovin.impl.go$b r8 = r11.f6892m
            r1 = r25
            com.applovin.impl.c8$g r7 = a(r1, r2, r3, r4, r5, r6, r7, r8)
            com.applovin.impl.wd$a r8 = r7.f6922a
            long r9 = r7.f6924c
            boolean r0 = r7.f6925d
            long r13 = r7.f6923b
            com.applovin.impl.lh r1 = r11.f6904y
            com.applovin.impl.wd$a r1 = r1.f9220b
            boolean r1 = r1.equals(r8)
            r15 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0038
            com.applovin.impl.lh r1 = r11.f6904y
            long r1 = r1.f9237s
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            r16 = 0
            goto L_0x003a
        L_0x0038:
            r16 = 1
        L_0x003a:
            r17 = 3
            r6 = 0
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 4
            boolean r1 = r7.f6926e     // Catch:{ all -> 0x0121 }
            if (r1 == 0) goto L_0x0053
            com.applovin.impl.lh r1 = r11.f6904y     // Catch:{ all -> 0x0121 }
            int r1 = r1.f9223e     // Catch:{ all -> 0x0121 }
            if (r1 == r15) goto L_0x0050
            r11.c((int) r4)     // Catch:{ all -> 0x0121 }
        L_0x0050:
            r11.a((boolean) r5, (boolean) r5, (boolean) r5, (boolean) r15)     // Catch:{ all -> 0x0121 }
        L_0x0053:
            if (r16 != 0) goto L_0x006f
            com.applovin.impl.vd r1 = r11.f6899t     // Catch:{ all -> 0x0121 }
            long r3 = r11.M     // Catch:{ all -> 0x0121 }
            long r21 = r24.f()     // Catch:{ all -> 0x0121 }
            r2 = r25
            r15 = -1
            r20 = 4
            r15 = 0
            r5 = r21
            boolean r0 = r1.a((com.applovin.impl.go) r2, (long) r3, (long) r5)     // Catch:{ all -> 0x011e }
            if (r0 != 0) goto L_0x00a1
            r11.c((boolean) r15)     // Catch:{ all -> 0x011e }
            goto L_0x00a1
        L_0x006f:
            r15 = 0
            r20 = 4
            boolean r1 = r25.c()     // Catch:{ all -> 0x011e }
            if (r1 != 0) goto L_0x00a1
            com.applovin.impl.vd r1 = r11.f6899t     // Catch:{ all -> 0x011e }
            com.applovin.impl.sd r1 = r1.e()     // Catch:{ all -> 0x011e }
        L_0x007e:
            if (r1 == 0) goto L_0x009c
            com.applovin.impl.ud r2 = r1.f11365f     // Catch:{ all -> 0x011e }
            com.applovin.impl.wd$a r2 = r2.f12551a     // Catch:{ all -> 0x011e }
            boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x011e }
            if (r2 == 0) goto L_0x0097
            com.applovin.impl.vd r2 = r11.f6899t     // Catch:{ all -> 0x011e }
            com.applovin.impl.ud r3 = r1.f11365f     // Catch:{ all -> 0x011e }
            com.applovin.impl.ud r2 = r2.a((com.applovin.impl.go) r12, (com.applovin.impl.ud) r3)     // Catch:{ all -> 0x011e }
            r1.f11365f = r2     // Catch:{ all -> 0x011e }
            r1.m()     // Catch:{ all -> 0x011e }
        L_0x0097:
            com.applovin.impl.sd r1 = r1.d()     // Catch:{ all -> 0x011e }
            goto L_0x007e
        L_0x009c:
            long r0 = r11.a((com.applovin.impl.wd.a) r8, (long) r13, (boolean) r0)     // Catch:{ all -> 0x011e }
            r13 = r0
        L_0x00a1:
            com.applovin.impl.lh r0 = r11.f6904y
            com.applovin.impl.go r4 = r0.f9219a
            com.applovin.impl.wd$a r5 = r0.f9220b
            boolean r0 = r7.f6927f
            if (r0 == 0) goto L_0x00ad
            r6 = r13
            goto L_0x00af
        L_0x00ad:
            r6 = r18
        L_0x00af:
            r1 = r24
            r2 = r25
            r3 = r8
            r1.a(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x00c1
            com.applovin.impl.lh r0 = r11.f6904y
            long r0 = r0.f9221c
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00ff
        L_0x00c1:
            com.applovin.impl.lh r0 = r11.f6904y
            com.applovin.impl.wd$a r1 = r0.f9220b
            java.lang.Object r1 = r1.f12394a
            com.applovin.impl.go r0 = r0.f9219a
            if (r16 == 0) goto L_0x00e0
            if (r26 == 0) goto L_0x00e0
            boolean r2 = r0.c()
            if (r2 != 0) goto L_0x00e0
            com.applovin.impl.go$b r2 = r11.f6892m
            com.applovin.impl.go$b r0 = r0.a((java.lang.Object) r1, (com.applovin.impl.go.b) r2)
            boolean r0 = r0.f8057g
            if (r0 != 0) goto L_0x00e0
            r23 = 1
            goto L_0x00e2
        L_0x00e0:
            r23 = 0
        L_0x00e2:
            com.applovin.impl.lh r0 = r11.f6904y
            long r5 = r0.f9222d
            int r0 = r12.a((java.lang.Object) r1)
            r1 = -1
            if (r0 != r1) goto L_0x00ef
            r17 = 4
        L_0x00ef:
            r1 = r24
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r23
            r10 = r17
            com.applovin.impl.lh r0 = r1.a(r2, r3, r5, r7, r9, r10)
            r11.f6904y = r0
        L_0x00ff:
            r24.B()
            com.applovin.impl.lh r0 = r11.f6904y
            com.applovin.impl.go r0 = r0.f9219a
            r11.a((com.applovin.impl.go) r12, (com.applovin.impl.go) r0)
            com.applovin.impl.lh r0 = r11.f6904y
            com.applovin.impl.lh r0 = r0.a((com.applovin.impl.go) r12)
            r11.f6904y = r0
            boolean r0 = r25.c()
            if (r0 != 0) goto L_0x011a
            r6 = 0
            r11.L = r6
        L_0x011a:
            r11.a((boolean) r15)
            return
        L_0x011e:
            r0 = move-exception
            r6 = 0
            goto L_0x0125
        L_0x0121:
            r0 = move-exception
            r15 = 0
            r20 = 4
        L_0x0125:
            com.applovin.impl.lh r1 = r11.f6904y
            com.applovin.impl.go r4 = r1.f9219a
            com.applovin.impl.wd$a r5 = r1.f9220b
            boolean r1 = r7.f6927f
            if (r1 == 0) goto L_0x0131
            r18 = r13
        L_0x0131:
            r1 = r24
            r2 = r25
            r3 = r8
            r15 = r6
            r6 = r18
            r1.a(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x0146
            com.applovin.impl.lh r1 = r11.f6904y
            long r1 = r1.f9221c
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0184
        L_0x0146:
            com.applovin.impl.lh r1 = r11.f6904y
            com.applovin.impl.wd$a r2 = r1.f9220b
            java.lang.Object r2 = r2.f12394a
            com.applovin.impl.go r1 = r1.f9219a
            if (r16 == 0) goto L_0x0165
            if (r26 == 0) goto L_0x0165
            boolean r3 = r1.c()
            if (r3 != 0) goto L_0x0165
            com.applovin.impl.go$b r3 = r11.f6892m
            com.applovin.impl.go$b r1 = r1.a((java.lang.Object) r2, (com.applovin.impl.go.b) r3)
            boolean r1 = r1.f8057g
            if (r1 != 0) goto L_0x0165
            r23 = 1
            goto L_0x0167
        L_0x0165:
            r23 = 0
        L_0x0167:
            com.applovin.impl.lh r1 = r11.f6904y
            long r5 = r1.f9222d
            int r1 = r12.a((java.lang.Object) r2)
            r2 = -1
            if (r1 != r2) goto L_0x0174
            r17 = 4
        L_0x0174:
            r1 = r24
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r23
            r10 = r17
            com.applovin.impl.lh r1 = r1.a(r2, r3, r5, r7, r9, r10)
            r11.f6904y = r1
        L_0x0184:
            r24.B()
            com.applovin.impl.lh r1 = r11.f6904y
            com.applovin.impl.go r1 = r1.f9219a
            r11.a((com.applovin.impl.go) r12, (com.applovin.impl.go) r1)
            com.applovin.impl.lh r1 = r11.f6904y
            com.applovin.impl.lh r1 = r1.a((com.applovin.impl.go) r12)
            r11.f6904y = r1
            boolean r1 = r25.c()
            if (r1 != 0) goto L_0x019e
            r11.L = r15
        L_0x019e:
            r1 = 0
            r11.a((boolean) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c8.a(com.applovin.impl.go, boolean):void");
    }

    private void a(mh mhVar, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.f6905z.a(1);
            }
            this.f6904y = this.f6904y.a(mhVar);
        }
        a(mhVar.f9804a);
        for (li liVar : this.f6881a) {
            if (liVar != null) {
                liVar.a(f10, mhVar.f9804a);
            }
        }
    }

    private void a(mh mhVar, boolean z10) {
        a(mhVar, mhVar.f9804a, true, z10);
    }

    private lh a(wd.a aVar, long j10, long j11, long j12, boolean z10, int i10) {
        ab abVar;
        xo xoVar;
        qo qoVar;
        qo qoVar2;
        xo xoVar2;
        wd.a aVar2 = aVar;
        long j13 = j11;
        this.O = this.O || j10 != this.f6904y.f9237s || !aVar.equals(this.f6904y.f9220b);
        B();
        lh lhVar = this.f6904y;
        qo qoVar3 = lhVar.f9226h;
        xo xoVar3 = lhVar.f9227i;
        List list = lhVar.f9228j;
        if (this.f6900u.d()) {
            sd e10 = this.f6899t.e();
            if (e10 == null) {
                qoVar2 = qo.f11064d;
            } else {
                qoVar2 = e10.h();
            }
            if (e10 == null) {
                xoVar2 = this.f6885f;
            } else {
                xoVar2 = e10.i();
            }
            ab a10 = a(xoVar2.f13434c);
            if (e10 != null) {
                ud udVar = e10.f11365f;
                if (udVar.f12553c != j13) {
                    e10.f11365f = udVar.a(j13);
                }
            }
            qoVar = qoVar2;
            xoVar = xoVar2;
            abVar = a10;
        } else if (!aVar.equals(this.f6904y.f9220b)) {
            qoVar = qo.f11064d;
            xoVar = this.f6885f;
            abVar = ab.h();
        } else {
            abVar = list;
            qoVar = qoVar3;
            xoVar = xoVar3;
        }
        if (z10) {
            this.f6905z.c(i10);
        }
        return this.f6904y.a(aVar, j10, j11, j12, h(), qoVar, xoVar, abVar);
    }

    private boolean a(li liVar, sd sdVar) {
        sd d10 = sdVar.d();
        return sdVar.f11365f.f12556f && d10.f11363d && ((liVar instanceof co) || liVar.i() >= d10.g());
    }

    private static boolean a(lh lhVar, go.b bVar) {
        wd.a aVar = lhVar.f9220b;
        go goVar = lhVar.f9219a;
        return goVar.c() || goVar.a(aVar.f12394a, bVar).f8057g;
    }

    private boolean a(long j10, long j11) {
        if (this.J && this.I) {
            return false;
        }
        c(j10, j11);
        return true;
    }

    private void a(c cVar) {
        this.f6905z.a(1);
        throw null;
    }

    public void a(mh mhVar) {
        this.f6888i.a(16, (Object) mhVar).a();
    }

    public void a() {
        this.f6888i.c(22);
    }

    public void a(rd rdVar) {
        this.f6888i.a(8, (Object) rdVar).a();
    }

    private void a(int i10, int i11, tj tjVar) {
        this.f6905z.a(1);
        a(this.f6900u.a(i10, i11, tjVar), false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            r29 = this;
            r1 = r29
            com.applovin.impl.ha r0 = r1.f6888i
            r2 = 2
            r0.b(r2)
            r2 = 0
            r1.P = r2
            r3 = 0
            r1.D = r3
            com.applovin.impl.f6 r0 = r1.f6895p
            r0.c()
            r4 = 0
            r1.M = r4
            com.applovin.impl.li[] r4 = r1.f6881a
            int r5 = r4.length
            r6 = 0
        L_0x001b:
            java.lang.String r7 = "ExoPlayerImplInternal"
            if (r6 >= r5) goto L_0x0030
            r0 = r4[r6]
            r1.a((com.applovin.impl.li) r0)     // Catch:{ y7 -> 0x0027, RuntimeException -> 0x0025 }
            goto L_0x002d
        L_0x0025:
            r0 = move-exception
            goto L_0x0028
        L_0x0027:
            r0 = move-exception
        L_0x0028:
            java.lang.String r8 = "Disable failed."
            com.applovin.impl.kc.a(r7, r8, r0)
        L_0x002d:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x0030:
            if (r30 == 0) goto L_0x0050
            com.applovin.impl.li[] r4 = r1.f6881a
            int r5 = r4.length
            r6 = 0
        L_0x0036:
            if (r6 >= r5) goto L_0x0050
            r0 = r4[r6]
            java.util.Set r8 = r1.f6882b
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L_0x004d
            r0.reset()     // Catch:{ RuntimeException -> 0x0046 }
            goto L_0x004d
        L_0x0046:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            com.applovin.impl.kc.a(r7, r0, r8)
        L_0x004d:
            int r6 = r6 + 1
            goto L_0x0036
        L_0x0050:
            r1.K = r3
            com.applovin.impl.lh r0 = r1.f6904y
            com.applovin.impl.wd$a r4 = r0.f9220b
            long r5 = r0.f9237s
            com.applovin.impl.lh r0 = r1.f6904y
            com.applovin.impl.wd$a r0 = r0.f9220b
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0072
            com.applovin.impl.lh r0 = r1.f6904y
            com.applovin.impl.go$b r7 = r1.f6892m
            boolean r0 = a((com.applovin.impl.lh) r0, (com.applovin.impl.go.b) r7)
            if (r0 == 0) goto L_0x006d
            goto L_0x0072
        L_0x006d:
            com.applovin.impl.lh r0 = r1.f6904y
            long r7 = r0.f9237s
            goto L_0x0076
        L_0x0072:
            com.applovin.impl.lh r0 = r1.f6904y
            long r7 = r0.f9221c
        L_0x0076:
            if (r31 == 0) goto L_0x00a3
            r1.L = r2
            com.applovin.impl.lh r0 = r1.f6904y
            com.applovin.impl.go r0 = r0.f9219a
            android.util.Pair r0 = r1.a((com.applovin.impl.go) r0)
            java.lang.Object r4 = r0.first
            com.applovin.impl.wd$a r4 = (com.applovin.impl.wd.a) r4
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.applovin.impl.lh r0 = r1.f6904y
            com.applovin.impl.wd$a r0 = r0.f9220b
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00a3
            r0 = 1
            r17 = r4
            r25 = r5
            goto L_0x00a8
        L_0x00a3:
            r17 = r4
            r25 = r5
            r0 = 0
        L_0x00a8:
            com.applovin.impl.vd r4 = r1.f6899t
            r4.c()
            r1.E = r3
            com.applovin.impl.lh r3 = new com.applovin.impl.lh
            com.applovin.impl.lh r4 = r1.f6904y
            com.applovin.impl.go r5 = r4.f9219a
            int r11 = r4.f9223e
            if (r33 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            com.applovin.impl.y7 r2 = r4.f9224f
        L_0x00bc:
            r12 = r2
            r13 = 0
            if (r0 == 0) goto L_0x00c3
            com.applovin.impl.qo r2 = com.applovin.impl.qo.f11064d
            goto L_0x00c5
        L_0x00c3:
            com.applovin.impl.qo r2 = r4.f9226h
        L_0x00c5:
            r14 = r2
            if (r0 == 0) goto L_0x00cb
            com.applovin.impl.xo r2 = r1.f6885f
            goto L_0x00cd
        L_0x00cb:
            com.applovin.impl.xo r2 = r4.f9227i
        L_0x00cd:
            r15 = r2
            if (r0 == 0) goto L_0x00d5
            com.applovin.impl.ab r0 = com.applovin.impl.ab.h()
            goto L_0x00d7
        L_0x00d5:
            java.util.List r0 = r4.f9228j
        L_0x00d7:
            r16 = r0
            com.applovin.impl.lh r0 = r1.f6904y
            boolean r2 = r0.f9230l
            r18 = r2
            int r2 = r0.f9231m
            r19 = r2
            com.applovin.impl.mh r0 = r0.f9232n
            r20 = r0
            boolean r0 = r1.J
            r27 = r0
            r23 = 0
            r28 = 0
            r4 = r3
            r6 = r17
            r9 = r25
            r21 = r25
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r27, r28)
            r1.f6904y = r3
            if (r32 == 0) goto L_0x0102
            com.applovin.impl.ae r0 = r1.f6900u
            r0.e()
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c8.a(boolean, boolean, boolean, boolean):void");
    }

    private static void a(go goVar, d dVar, go.d dVar2, go.b bVar) {
        int i10 = goVar.a(goVar.a(dVar.f6914d, bVar).f8054c, dVar2).f8082q;
        Object obj = goVar.a(i10, bVar, true).f8053b;
        long j10 = bVar.f8055d;
        dVar.a(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean a(d dVar, go goVar, go goVar2, int i10, boolean z10, go.d dVar2, go.b bVar) {
        long j10;
        d dVar3 = dVar;
        go goVar3 = goVar;
        go goVar4 = goVar2;
        go.d dVar4 = dVar2;
        go.b bVar2 = bVar;
        Object obj = dVar3.f6914d;
        if (obj == null) {
            if (dVar3.f6911a.d() == Long.MIN_VALUE) {
                j10 = -9223372036854775807L;
            } else {
                j10 = r2.a(dVar3.f6911a.d());
            }
            Pair a10 = a(goVar, new h(dVar3.f6911a.f(), dVar3.f6911a.h(), j10), false, i10, z10, dVar2, bVar);
            if (a10 == null) {
                return false;
            }
            dVar.a(goVar3.a(a10.first), ((Long) a10.second).longValue(), a10.first);
            if (dVar3.f6911a.d() == Long.MIN_VALUE) {
                a(goVar3, dVar, dVar4, bVar2);
            }
            return true;
        }
        int a11 = goVar3.a(obj);
        if (a11 == -1) {
            return false;
        }
        if (dVar3.f6911a.d() == Long.MIN_VALUE) {
            a(goVar3, dVar, dVar4, bVar2);
            return true;
        }
        dVar3.f6912b = a11;
        goVar4.a(dVar3.f6914d, bVar2);
        if (bVar2.f8057g && goVar4.a(bVar2.f8054c, dVar4).f8081p == goVar4.a(dVar3.f6914d)) {
            long e10 = dVar3.f6913c + bVar.e();
            Pair a12 = goVar.a(dVar2, bVar, goVar3.a(dVar3.f6914d, bVar2).f8054c, e10);
            dVar.a(goVar3.a(a12.first), ((Long) a12.second).longValue(), a12.first);
        }
        return true;
    }

    private void a(go goVar, go goVar2) {
        if (!goVar.c() || !goVar2.c()) {
            for (int size = this.f6896q.size() - 1; size >= 0; size--) {
                if (!a((d) this.f6896q.get(size), goVar, goVar2, this.F, this.G, this.f6891l, this.f6892m)) {
                    ((d) this.f6896q.get(size)).f6911a.a(false);
                    this.f6896q.remove(size);
                }
            }
            Collections.sort(this.f6896q);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0182, code lost:
        r3 = r6.f12398e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.impl.c8.g a(com.applovin.impl.go r30, com.applovin.impl.lh r31, com.applovin.impl.c8.h r32, com.applovin.impl.vd r33, int r34, boolean r35, com.applovin.impl.go.d r36, com.applovin.impl.go.b r37) {
        /*
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r35
            r11 = r37
            boolean r0 = r30.c()
            if (r0 == 0) goto L_0x0025
            com.applovin.impl.c8$g r0 = new com.applovin.impl.c8$g
            com.applovin.impl.wd$a r2 = com.applovin.impl.lh.a()
            r3 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r8 = 1
            r9 = 0
            r1 = r0
            r1.<init>(r2, r3, r5, r7, r8, r9)
            return r0
        L_0x0025:
            com.applovin.impl.wd$a r12 = r8.f9220b
            java.lang.Object r13 = r12.f12394a
            boolean r14 = a((com.applovin.impl.lh) r8, (com.applovin.impl.go.b) r11)
            com.applovin.impl.wd$a r0 = r8.f9220b
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x003b
            if (r14 == 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            long r0 = r8.f9237s
            goto L_0x003d
        L_0x003b:
            long r0 = r8.f9221c
        L_0x003d:
            r15 = r0
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            r19 = 0
            r20 = 1
            if (r9 == 0) goto L_0x00a4
            r2 = 1
            r0 = r30
            r1 = r32
            r3 = r34
            r4 = r35
            r5 = r36
            r21 = r12
            r12 = -1
            r6 = r37
            android.util.Pair r0 = a((com.applovin.impl.go) r0, (com.applovin.impl.c8.h) r1, (boolean) r2, (int) r3, (boolean) r4, (com.applovin.impl.go.d) r5, (com.applovin.impl.go.b) r6)
            if (r0 != 0) goto L_0x006f
            int r0 = r7.a((boolean) r10)
            r9 = r36
            r3 = r0
            r0 = r15
            r6 = r21
            r27 = 0
            r28 = 1
            goto L_0x00bd
        L_0x006f:
            long r1 = r9.f6930c
            int r3 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x0080
            java.lang.Object r0 = r0.first
            com.applovin.impl.go$b r0 = r7.a((java.lang.Object) r0, (com.applovin.impl.go.b) r11)
            int r6 = r0.f8054c
            r0 = r15
            r2 = 0
            goto L_0x008c
        L_0x0080:
            java.lang.Object r13 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = 1
            r6 = -1
        L_0x008c:
            int r3 = r8.f9223e
            r4 = 4
            r9 = r36
            r29 = r2
            if (r3 != r4) goto L_0x009b
            r3 = r6
            r6 = r21
            r27 = 1
            goto L_0x00a0
        L_0x009b:
            r3 = r6
            r6 = r21
            r27 = 0
        L_0x00a0:
            r28 = 0
            goto L_0x0156
        L_0x00a4:
            r21 = r12
            r12 = -1
            com.applovin.impl.go r0 = r8.f9219a
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00c1
            int r0 = r7.a((boolean) r10)
        L_0x00b3:
            r9 = r36
            r3 = r0
            r0 = r15
            r6 = r21
            r27 = 0
            r28 = 0
        L_0x00bd:
            r29 = 0
            goto L_0x0156
        L_0x00c1:
            int r0 = r7.a((java.lang.Object) r13)
            if (r0 != r12) goto L_0x00f2
            com.applovin.impl.go r5 = r8.f9219a
            r0 = r36
            r1 = r37
            r2 = r34
            r3 = r35
            r4 = r13
            r6 = r30
            java.lang.Object r0 = a((com.applovin.impl.go.d) r0, (com.applovin.impl.go.b) r1, (int) r2, (boolean) r3, (java.lang.Object) r4, (com.applovin.impl.go) r5, (com.applovin.impl.go) r6)
            if (r0 != 0) goto L_0x00e6
            int r6 = r7.a((boolean) r10)
            r9 = r36
            r0 = r6
            r6 = r21
            r1 = 1
            goto L_0x014e
        L_0x00e6:
            com.applovin.impl.go$b r0 = r7.a((java.lang.Object) r0, (com.applovin.impl.go.b) r11)
            int r6 = r0.f8054c
            r9 = r36
            r0 = r6
            r6 = r21
            goto L_0x014d
        L_0x00f2:
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x00fd
            com.applovin.impl.go$b r0 = r7.a((java.lang.Object) r13, (com.applovin.impl.go.b) r11)
            int r0 = r0.f8054c
            goto L_0x00b3
        L_0x00fd:
            if (r14 == 0) goto L_0x0148
            com.applovin.impl.go r0 = r8.f9219a
            r6 = r21
            java.lang.Object r1 = r6.f12394a
            r0.a((java.lang.Object) r1, (com.applovin.impl.go.b) r11)
            com.applovin.impl.go r0 = r8.f9219a
            int r1 = r11.f8054c
            r9 = r36
            com.applovin.impl.go$d r0 = r0.a((int) r1, (com.applovin.impl.go.d) r9)
            int r0 = r0.f8081p
            com.applovin.impl.go r1 = r8.f9219a
            java.lang.Object r2 = r6.f12394a
            int r1 = r1.a((java.lang.Object) r2)
            if (r0 != r1) goto L_0x013f
            long r0 = r37.e()
            long r4 = r15 + r0
            com.applovin.impl.go$b r0 = r7.a((java.lang.Object) r13, (com.applovin.impl.go.b) r11)
            int r3 = r0.f8054c
            r0 = r30
            r1 = r36
            r2 = r37
            android.util.Pair r0 = r0.a(r1, r2, r3, r4)
            java.lang.Object r13 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            goto L_0x0140
        L_0x013f:
            r0 = r15
        L_0x0140:
            r3 = -1
            r27 = 0
            r28 = 0
            r29 = 1
            goto L_0x0156
        L_0x0148:
            r9 = r36
            r6 = r21
            r0 = -1
        L_0x014d:
            r1 = 0
        L_0x014e:
            r3 = r0
            r28 = r1
            r0 = r15
            r27 = 0
            goto L_0x00bd
        L_0x0156:
            if (r3 == r12) goto L_0x0176
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r30
            r1 = r36
            r2 = r37
            android.util.Pair r0 = r0.a(r1, r2, r3, r4)
            java.lang.Object r13 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = r33
            r25 = r17
            goto L_0x017a
        L_0x0176:
            r2 = r33
            r25 = r0
        L_0x017a:
            com.applovin.impl.wd$a r2 = r2.a((com.applovin.impl.go) r7, (java.lang.Object) r13, (long) r0)
            int r3 = r2.f12398e
            if (r3 == r12) goto L_0x018d
            int r3 = r6.f12398e
            if (r3 == r12) goto L_0x018b
            int r4 = r2.f12395b
            if (r4 < r3) goto L_0x018b
            goto L_0x018d
        L_0x018b:
            r3 = 0
            goto L_0x018e
        L_0x018d:
            r3 = 1
        L_0x018e:
            java.lang.Object r4 = r6.f12394a
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L_0x01a6
            boolean r5 = r6.a()
            if (r5 != 0) goto L_0x01a6
            boolean r5 = r2.a()
            if (r5 != 0) goto L_0x01a6
            if (r3 == 0) goto L_0x01a6
            r3 = 1
            goto L_0x01a7
        L_0x01a6:
            r3 = 0
        L_0x01a7:
            r7.a((java.lang.Object) r13, (com.applovin.impl.go.b) r11)
            if (r4 == 0) goto L_0x01d0
            if (r14 != 0) goto L_0x01d0
            int r4 = (r15 > r25 ? 1 : (r15 == r25 ? 0 : -1))
            if (r4 != 0) goto L_0x01d0
            boolean r4 = r2.a()
            if (r4 == 0) goto L_0x01c0
            int r4 = r2.f12395b
            boolean r4 = r11.f(r4)
            if (r4 != 0) goto L_0x01ce
        L_0x01c0:
            boolean r4 = r6.a()
            if (r4 == 0) goto L_0x01d0
            int r4 = r6.f12395b
            boolean r4 = r11.f(r4)
            if (r4 == 0) goto L_0x01d0
        L_0x01ce:
            r19 = 1
        L_0x01d0:
            if (r3 != 0) goto L_0x01d4
            if (r19 == 0) goto L_0x01d5
        L_0x01d4:
            r2 = r6
        L_0x01d5:
            boolean r3 = r2.a()
            if (r3 == 0) goto L_0x01fa
            boolean r0 = r2.equals(r6)
            if (r0 == 0) goto L_0x01e4
            long r0 = r8.f9237s
            goto L_0x01fa
        L_0x01e4:
            java.lang.Object r0 = r2.f12394a
            r7.a((java.lang.Object) r0, (com.applovin.impl.go.b) r11)
            int r0 = r2.f12396c
            int r1 = r2.f12395b
            int r1 = r11.d(r1)
            if (r0 != r1) goto L_0x01f8
            long r0 = r37.b()
            goto L_0x01fa
        L_0x01f8:
            r0 = 0
        L_0x01fa:
            r23 = r0
            com.applovin.impl.c8$g r0 = new com.applovin.impl.c8$g
            r21 = r0
            r22 = r2
            r21.<init>(r22, r23, r25, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.c8.a(com.applovin.impl.go, com.applovin.impl.lh, com.applovin.impl.c8$h, com.applovin.impl.vd, int, boolean, com.applovin.impl.go$d, com.applovin.impl.go$b):com.applovin.impl.c8$g");
    }

    private static Pair a(go goVar, h hVar, boolean z10, int i10, boolean z11, go.d dVar, go.b bVar) {
        Object a10;
        go goVar2 = goVar;
        h hVar2 = hVar;
        go.b bVar2 = bVar;
        go goVar3 = hVar2.f6928a;
        if (goVar.c()) {
            return null;
        }
        go goVar4 = goVar3.c() ? goVar2 : goVar3;
        try {
            Pair a11 = goVar4.a(dVar, bVar, hVar2.f6929b, hVar2.f6930c);
            if (goVar.equals(goVar4)) {
                return a11;
            }
            if (goVar.a(a11.first) == -1) {
                go.d dVar2 = dVar;
                if (z10 && (a10 = a(dVar, bVar, i10, z11, a11.first, goVar4, goVar)) != null) {
                    return goVar.a(dVar, bVar, goVar.a(a10, bVar2).f8054c, -9223372036854775807L);
                }
                return null;
            } else if (!goVar4.a(a11.first, bVar2).f8057g || goVar4.a(bVar2.f8054c, dVar).f8081p != goVar4.a(a11.first)) {
                return a11;
            } else {
                return goVar.a(dVar, bVar, goVar.a(a11.first, bVar2).f8054c, hVar2.f6930c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    static Object a(go.d dVar, go.b bVar, int i10, boolean z10, Object obj, go goVar, go goVar2) {
        int a10 = goVar.a(obj);
        int a11 = goVar.a();
        int i11 = a10;
        int i12 = -1;
        for (int i13 = 0; i13 < a11 && i12 == -1; i13++) {
            i11 = goVar.a(i11, bVar, dVar, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = goVar2.a(goVar.b(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return goVar2.b(i12);
    }

    public void a(go goVar, int i10, long j10) {
        this.f6888i.a(3, (Object) new h(goVar, i10, j10)).a();
    }

    private void a(h hVar) {
        long j10;
        boolean z10;
        wd.a aVar;
        long j11;
        long j12;
        long j13;
        long j14;
        lh lhVar;
        int i10;
        h hVar2 = hVar;
        boolean z11 = true;
        this.f6905z.a(1);
        Pair a10 = a(this.f6904y.f9219a, hVar, true, this.F, this.G, this.f6891l, this.f6892m);
        if (a10 == null) {
            Pair a11 = a(this.f6904y.f9219a);
            aVar = (wd.a) a11.first;
            long longValue = ((Long) a11.second).longValue();
            z10 = !this.f6904y.f9219a.c();
            j11 = longValue;
            j10 = -9223372036854775807L;
        } else {
            Object obj = a10.first;
            long longValue2 = ((Long) a10.second).longValue();
            long j15 = hVar2.f6930c == -9223372036854775807L ? -9223372036854775807L : longValue2;
            wd.a a12 = this.f6899t.a(this.f6904y.f9219a, obj, longValue2);
            if (a12.a()) {
                this.f6904y.f9219a.a(a12.f12394a, this.f6892m);
                longValue2 = this.f6892m.d(a12.f12395b) == a12.f12396c ? this.f6892m.b() : 0;
            } else if (hVar2.f6930c != -9223372036854775807L) {
                j11 = longValue2;
                j10 = j15;
                z10 = false;
                aVar = a12;
            }
            j11 = longValue2;
            j10 = j15;
            z10 = true;
            aVar = a12;
        }
        try {
            if (this.f6904y.f9219a.c()) {
                this.L = hVar2;
            } else if (a10 == null) {
                if (this.f6904y.f9223e != 1) {
                    c(4);
                }
                a(false, true, false, true);
            } else {
                if (aVar.equals(this.f6904y.f9220b)) {
                    sd e10 = this.f6899t.e();
                    j14 = (e10 == null || !e10.f11363d || j11 == 0) ? j11 : e10.f11360a.a(j11, this.f6903x);
                    if (r2.b(j14) == r2.b(this.f6904y.f9237s) && ((i10 = lhVar.f9223e) == 2 || i10 == 3)) {
                        long j16 = (lhVar = this.f6904y).f9237s;
                        this.f6904y = a(aVar, j16, j10, j16, z10, 2);
                        return;
                    }
                } else {
                    j14 = j11;
                }
                long a13 = a(aVar, j14, this.f6904y.f9223e == 4);
                if (j11 == a13) {
                    z11 = false;
                }
                boolean z12 = z11 | z10;
                try {
                    lh lhVar2 = this.f6904y;
                    go goVar = lhVar2.f9219a;
                    a(goVar, aVar, goVar, lhVar2.f9220b, j10);
                    z10 = z12;
                    j13 = a13;
                    this.f6904y = a(aVar, j13, j10, j13, z10, 2);
                } catch (Throwable th) {
                    th = th;
                    z10 = z12;
                    j12 = a13;
                    this.f6904y = a(aVar, j12, j10, j12, z10, 2);
                    throw th;
                }
            }
            j13 = j11;
            this.f6904y = a(aVar, j13, j10, j13, z10, 2);
        } catch (Throwable th2) {
            th = th2;
            j12 = j11;
            this.f6904y = a(aVar, j12, j10, j12, z10, 2);
            throw th;
        }
    }

    private long a(wd.a aVar, long j10, boolean z10) {
        return a(aVar, j10, this.f6899t.e() != this.f6899t.f(), z10);
    }

    private long a(wd.a aVar, long j10, boolean z10, boolean z11) {
        H();
        this.D = false;
        if (z11 || this.f6904y.f9223e == 3) {
            c(2);
        }
        sd e10 = this.f6899t.e();
        sd sdVar = e10;
        while (sdVar != null && !aVar.equals(sdVar.f11365f.f12551a)) {
            sdVar = sdVar.d();
        }
        if (z10 || e10 != sdVar || (sdVar != null && sdVar.e(j10) < 0)) {
            for (li a10 : this.f6881a) {
                a(a10);
            }
            if (sdVar != null) {
                while (this.f6899t.e() != sdVar) {
                    this.f6899t.a();
                }
                this.f6899t.a(sdVar);
                sdVar.c(0);
                d();
            }
        }
        if (sdVar != null) {
            this.f6899t.a(sdVar);
            if (!sdVar.f11363d) {
                sdVar.f11365f = sdVar.f11365f.b(j10);
            } else if (sdVar.f11364e) {
                long a11 = sdVar.f11360a.a(j10);
                sdVar.f11360a.a(a11 - this.f6893n, this.f6894o);
                j10 = a11;
            }
            c(j10);
            m();
        } else {
            this.f6899t.c();
            c(j10);
        }
        a(false);
        this.f6888i.c(2);
        return j10;
    }

    public synchronized void a(oh ohVar) {
        if (!this.A) {
            if (this.f6889j.isAlive()) {
                this.f6888i.a(14, (Object) ohVar).a();
                return;
            }
        }
        kc.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        ohVar.a(false);
    }

    private void a(li liVar, long j10) {
        liVar.g();
        if (liVar instanceof co) {
            ((co) liVar).c(j10);
        }
    }

    private void a(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.H != z10) {
            this.H = z10;
            if (!z10) {
                for (li liVar : this.f6881a) {
                    if (!c(liVar) && this.f6882b.remove(liVar)) {
                        liVar.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void a(b bVar) {
        this.f6905z.a(1);
        if (bVar.f6909c != -1) {
            this.L = new h(new ph(bVar.f6907a, bVar.f6908b), bVar.f6909c, bVar.f6910d);
        }
        a(this.f6900u.a(bVar.f6907a, bVar.f6908b), false);
    }

    public void a(List list, int i10, long j10, tj tjVar) {
        this.f6888i.a(17, (Object) new b(list, tjVar, i10, j10, (a) null)).a();
    }

    public void a(boolean z10, int i10) {
        this.f6888i.a(1, z10 ? 1 : 0, i10).a();
    }

    private void a(boolean z10, int i10, boolean z11, int i11) {
        this.f6905z.a(z11 ? 1 : 0);
        this.f6905z.b(i11);
        this.f6904y = this.f6904y.a(z10, i10);
        this.D = false;
        b(z10);
        if (!E()) {
            H();
            K();
            return;
        }
        int i12 = this.f6904y.f9223e;
        if (i12 == 3) {
            F();
            this.f6888i.c(2);
        } else if (i12 == 2) {
            this.f6888i.c(2);
        }
    }

    public void a(int i10) {
        this.f6888i.a(11, i10, 0).a();
    }

    private void a(fj fjVar) {
        this.f6903x = fjVar;
    }
}
