package p3;

import android.os.Looper;
import j4.g0;
import j4.l;
import j4.p0;
import n2.c4;
import n2.z1;
import o2.u1;
import p3.f0;
import p3.k0;
import p3.x;
import r2.b0;
import r2.y;
import s2.i;
import s2.r;

/* compiled from: ProgressiveMediaSource */
public final class l0 extends a implements k0.b {

    /* renamed from: i  reason: collision with root package name */
    private final z1 f21531i;

    /* renamed from: j  reason: collision with root package name */
    private final z1.h f21532j;

    /* renamed from: k  reason: collision with root package name */
    private final l.a f21533k;

    /* renamed from: l  reason: collision with root package name */
    private final f0.a f21534l;

    /* renamed from: m  reason: collision with root package name */
    private final y f21535m;

    /* renamed from: n  reason: collision with root package name */
    private final g0 f21536n;

    /* renamed from: o  reason: collision with root package name */
    private final int f21537o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f21538p;

    /* renamed from: q  reason: collision with root package name */
    private long f21539q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f21540r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f21541s;

    /* renamed from: t  reason: collision with root package name */
    private p0 f21542t;

    /* compiled from: ProgressiveMediaSource */
    class a extends o {
        a(l0 l0Var, c4 c4Var) {
            super(c4Var);
        }

        public c4.b k(int i10, c4.b bVar, boolean z10) {
            super.k(i10, bVar, z10);
            bVar.f20221g = true;
            return bVar;
        }

        public c4.d s(int i10, c4.d dVar, long j10) {
            super.s(i10, dVar, j10);
            dVar.f20246m = true;
            return dVar;
        }
    }

    /* compiled from: ProgressiveMediaSource */
    public static final class b implements x.a {

        /* renamed from: a  reason: collision with root package name */
        private final l.a f21543a;

        /* renamed from: b  reason: collision with root package name */
        private f0.a f21544b;

        /* renamed from: c  reason: collision with root package name */
        private b0 f21545c;

        /* renamed from: d  reason: collision with root package name */
        private g0 f21546d;

        /* renamed from: e  reason: collision with root package name */
        private int f21547e;

        /* renamed from: f  reason: collision with root package name */
        private String f21548f;

        /* renamed from: g  reason: collision with root package name */
        private Object f21549g;

        public b(l.a aVar) {
            this(aVar, (r) new i());
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ f0 c(r rVar, u1 u1Var) {
            return new c(rVar);
        }

        public l0 b(z1 z1Var) {
            k4.a.e(z1Var.f20785b);
            z1.h hVar = z1Var.f20785b;
            boolean z10 = true;
            boolean z11 = hVar.f20867i == null && this.f21549g != null;
            if (hVar.f20864f != null || this.f21548f == null) {
                z10 = false;
            }
            if (z11 && z10) {
                z1Var = z1Var.b().e(this.f21549g).b(this.f21548f).a();
            } else if (z11) {
                z1Var = z1Var.b().e(this.f21549g).a();
            } else if (z10) {
                z1Var = z1Var.b().b(this.f21548f).a();
            }
            z1 z1Var2 = z1Var;
            return new l0(z1Var2, this.f21543a, this.f21544b, this.f21545c.a(z1Var2), this.f21546d, this.f21547e, (a) null);
        }

        public b(l.a aVar, r rVar) {
            this(aVar, (f0.a) new m0(rVar));
        }

        public b(l.a aVar, f0.a aVar2) {
            this(aVar, aVar2, new r2.l(), new j4.x(), 1048576);
        }

        public b(l.a aVar, f0.a aVar2, b0 b0Var, g0 g0Var, int i10) {
            this.f21543a = aVar;
            this.f21544b = aVar2;
            this.f21545c = b0Var;
            this.f21546d = g0Var;
            this.f21547e = i10;
        }
    }

    /* synthetic */ l0(z1 z1Var, l.a aVar, f0.a aVar2, y yVar, g0 g0Var, int i10, a aVar3) {
        this(z1Var, aVar, aVar2, yVar, g0Var, i10);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [p3.l0$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void F() {
        /*
            r9 = this;
            p3.u0 r8 = new p3.u0
            long r1 = r9.f21539q
            boolean r3 = r9.f21540r
            boolean r5 = r9.f21541s
            n2.z1 r7 = r9.f21531i
            r4 = 0
            r6 = 0
            r0 = r8
            r0.<init>(r1, r3, r4, r5, r6, r7)
            boolean r0 = r9.f21538p
            if (r0 == 0) goto L_0x001a
            p3.l0$a r0 = new p3.l0$a
            r0.<init>(r9, r8)
            r8 = r0
        L_0x001a:
            r9.D(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.l0.F():void");
    }

    /* access modifiers changed from: protected */
    public void C(p0 p0Var) {
        this.f21542t = p0Var;
        this.f21535m.c((Looper) k4.a.e(Looper.myLooper()), A());
        this.f21535m.a();
        F();
    }

    /* access modifiers changed from: protected */
    public void E() {
        this.f21535m.release();
    }

    public u a(x.b bVar, j4.b bVar2, long j10) {
        l a10 = this.f21533k.a();
        p0 p0Var = this.f21542t;
        if (p0Var != null) {
            a10.e(p0Var);
        }
        return new k0(this.f21532j.f20859a, a10, this.f21534l.a(A()), this.f21535m, u(bVar), this.f21536n, w(bVar), this, bVar2, this.f21532j.f20864f, this.f21537o);
    }

    public void b(u uVar) {
        ((k0) uVar).e0();
    }

    public void f(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f21539q;
        }
        if (this.f21538p || this.f21539q != j10 || this.f21540r != z10 || this.f21541s != z11) {
            this.f21539q = j10;
            this.f21540r = z10;
            this.f21541s = z11;
            this.f21538p = false;
            F();
        }
    }

    public z1 g() {
        return this.f21531i;
    }

    public void h() {
    }

    private l0(z1 z1Var, l.a aVar, f0.a aVar2, y yVar, g0 g0Var, int i10) {
        this.f21532j = (z1.h) k4.a.e(z1Var.f20785b);
        this.f21531i = z1Var;
        this.f21533k = aVar;
        this.f21534l = aVar2;
        this.f21535m = yVar;
        this.f21536n = g0Var;
        this.f21537o = i10;
        this.f21538p = true;
        this.f21539q = -9223372036854775807L;
    }
}
