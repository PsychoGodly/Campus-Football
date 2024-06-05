package y3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import k4.a;
import k4.n0;
import k4.r;
import k4.v;
import n2.f;
import n2.q3;
import n2.r1;
import n2.s1;
import s6.u;

/* compiled from: TextRenderer */
public final class o extends f implements Handler.Callback {
    private m A;
    private int B;
    private long C;
    private long D;
    private long E;

    /* renamed from: o  reason: collision with root package name */
    private final Handler f23882o;

    /* renamed from: p  reason: collision with root package name */
    private final n f23883p;

    /* renamed from: q  reason: collision with root package name */
    private final k f23884q;

    /* renamed from: r  reason: collision with root package name */
    private final s1 f23885r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f23886s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f23887t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f23888u;

    /* renamed from: v  reason: collision with root package name */
    private int f23889v;

    /* renamed from: w  reason: collision with root package name */
    private r1 f23890w;

    /* renamed from: x  reason: collision with root package name */
    private i f23891x;

    /* renamed from: y  reason: collision with root package name */
    private l f23892y;

    /* renamed from: z  reason: collision with root package name */
    private m f23893z;

    public o(n nVar, Looper looper) {
        this(nVar, looper, k.f23878a);
    }

    private void P() {
        a0(new e(u.y(), S(this.E)));
    }

    private long Q(long j10) {
        int a10 = this.f23893z.a(j10);
        if (a10 == 0 || this.f23893z.e() == 0) {
            return this.f23893z.f21763b;
        }
        if (a10 != -1) {
            return this.f23893z.c(a10 - 1);
        }
        m mVar = this.f23893z;
        return mVar.c(mVar.e() - 1);
    }

    private long R() {
        if (this.B == -1) {
            return Long.MAX_VALUE;
        }
        a.e(this.f23893z);
        if (this.B >= this.f23893z.e()) {
            return Long.MAX_VALUE;
        }
        return this.f23893z.c(this.B);
    }

    private long S(long j10) {
        boolean z10 = true;
        a.f(j10 != -9223372036854775807L);
        if (this.D == -9223372036854775807L) {
            z10 = false;
        }
        a.f(z10);
        return j10 - this.D;
    }

    private void T(j jVar) {
        r.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f23890w, jVar);
        P();
        Y();
    }

    private void U() {
        this.f23888u = true;
        this.f23891x = this.f23884q.b((r1) a.e(this.f23890w));
    }

    private void V(e eVar) {
        this.f23883p.q(eVar.f23866a);
        this.f23883p.u(eVar);
    }

    private void W() {
        this.f23892y = null;
        this.B = -1;
        m mVar = this.f23893z;
        if (mVar != null) {
            mVar.q();
            this.f23893z = null;
        }
        m mVar2 = this.A;
        if (mVar2 != null) {
            mVar2.q();
            this.A = null;
        }
    }

    private void X() {
        W();
        ((i) a.e(this.f23891x)).release();
        this.f23891x = null;
        this.f23889v = 0;
    }

    private void Y() {
        X();
        U();
    }

    private void a0(e eVar) {
        Handler handler = this.f23882o;
        if (handler != null) {
            handler.obtainMessage(0, eVar).sendToTarget();
        } else {
            V(eVar);
        }
    }

    /* access modifiers changed from: protected */
    public void F() {
        this.f23890w = null;
        this.C = -9223372036854775807L;
        P();
        this.D = -9223372036854775807L;
        this.E = -9223372036854775807L;
        X();
    }

    /* access modifiers changed from: protected */
    public void H(long j10, boolean z10) {
        this.E = j10;
        P();
        this.f23886s = false;
        this.f23887t = false;
        this.C = -9223372036854775807L;
        if (this.f23889v != 0) {
            Y();
            return;
        }
        W();
        ((i) a.e(this.f23891x)).flush();
    }

    /* access modifiers changed from: protected */
    public void L(r1[] r1VarArr, long j10, long j11) {
        this.D = j11;
        this.f23890w = r1VarArr[0];
        if (this.f23891x != null) {
            this.f23889v = 1;
        } else {
            U();
        }
    }

    public void Z(long j10) {
        a.f(v());
        this.C = j10;
    }

    public int a(r1 r1Var) {
        if (this.f23884q.a(r1Var)) {
            return q3.a(r1Var.H == 0 ? 4 : 2);
        } else if (v.r(r1Var.f20654m)) {
            return q3.a(1);
        } else {
            return q3.a(0);
        }
    }

    public boolean b() {
        return this.f23887t;
    }

    public String getName() {
        return "TextRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            V((e) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public boolean isReady() {
        return true;
    }

    public void o(long j10, long j11) {
        boolean z10;
        this.E = j10;
        if (v()) {
            long j12 = this.C;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                W();
                this.f23887t = true;
            }
        }
        if (!this.f23887t) {
            if (this.A == null) {
                ((i) a.e(this.f23891x)).a(j10);
                try {
                    this.A = (m) ((i) a.e(this.f23891x)).b();
                } catch (j e10) {
                    T(e10);
                    return;
                }
            }
            if (getState() == 2) {
                if (this.f23893z != null) {
                    long R = R();
                    z10 = false;
                    while (R <= j10) {
                        this.B++;
                        R = R();
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                m mVar = this.A;
                if (mVar != null) {
                    if (mVar.l()) {
                        if (!z10 && R() == Long.MAX_VALUE) {
                            if (this.f23889v == 2) {
                                Y();
                            } else {
                                W();
                                this.f23887t = true;
                            }
                        }
                    } else if (mVar.f21763b <= j10) {
                        m mVar2 = this.f23893z;
                        if (mVar2 != null) {
                            mVar2.q();
                        }
                        this.B = mVar.a(j10);
                        this.f23893z = mVar;
                        this.A = null;
                        z10 = true;
                    }
                }
                if (z10) {
                    a.e(this.f23893z);
                    a0(new e(this.f23893z.d(j10), S(Q(j10))));
                }
                if (this.f23889v != 2) {
                    while (!this.f23886s) {
                        try {
                            l lVar = this.f23892y;
                            if (lVar == null) {
                                lVar = (l) ((i) a.e(this.f23891x)).c();
                                if (lVar != null) {
                                    this.f23892y = lVar;
                                } else {
                                    return;
                                }
                            }
                            if (this.f23889v == 1) {
                                lVar.p(4);
                                ((i) a.e(this.f23891x)).d(lVar);
                                this.f23892y = null;
                                this.f23889v = 2;
                                return;
                            }
                            int M = M(this.f23885r, lVar, 0);
                            if (M == -4) {
                                if (lVar.l()) {
                                    this.f23886s = true;
                                    this.f23888u = false;
                                } else {
                                    r1 r1Var = this.f23885r.f20721b;
                                    if (r1Var != null) {
                                        lVar.f23879j = r1Var.f20658q;
                                        lVar.s();
                                        this.f23888u &= !lVar.n();
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.f23888u) {
                                    ((i) a.e(this.f23891x)).d(lVar);
                                    this.f23892y = null;
                                }
                            } else if (M == -3) {
                                return;
                            }
                        } catch (j e11) {
                            T(e11);
                            return;
                        }
                    }
                }
            }
        }
    }

    public o(n nVar, Looper looper, k kVar) {
        super(3);
        Handler handler;
        this.f23883p = (n) a.e(nVar);
        if (looper == null) {
            handler = null;
        } else {
            handler = n0.v(looper, this);
        }
        this.f23882o = handler;
        this.f23884q = kVar;
        this.f23885r = new s1();
        this.C = -9223372036854775807L;
        this.D = -9223372036854775807L;
        this.E = -9223372036854775807L;
    }
}
