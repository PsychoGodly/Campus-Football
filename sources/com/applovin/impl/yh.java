package com.applovin.impl;

import com.applovin.impl.g5;
import com.applovin.impl.go;
import com.applovin.impl.od;
import com.applovin.impl.wd;
import com.applovin.impl.wh;
import com.applovin.impl.xh;

public final class yh extends b2 implements xh.b {

    /* renamed from: g  reason: collision with root package name */
    private final od f13608g;

    /* renamed from: h  reason: collision with root package name */
    private final od.g f13609h;

    /* renamed from: i  reason: collision with root package name */
    private final g5.a f13610i;

    /* renamed from: j  reason: collision with root package name */
    private final wh.a f13611j;

    /* renamed from: k  reason: collision with root package name */
    private final z6 f13612k;

    /* renamed from: l  reason: collision with root package name */
    private final hc f13613l;

    /* renamed from: m  reason: collision with root package name */
    private final int f13614m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f13615n;

    /* renamed from: o  reason: collision with root package name */
    private long f13616o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f13617p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f13618q;

    /* renamed from: r  reason: collision with root package name */
    private yo f13619r;

    public static final class b implements yd {

        /* renamed from: a  reason: collision with root package name */
        private final g5.a f13621a;

        /* renamed from: b  reason: collision with root package name */
        private wh.a f13622b;

        /* renamed from: c  reason: collision with root package name */
        private a7 f13623c;

        /* renamed from: d  reason: collision with root package name */
        private hc f13624d;

        /* renamed from: e  reason: collision with root package name */
        private int f13625e;

        /* renamed from: f  reason: collision with root package name */
        private String f13626f;

        /* renamed from: g  reason: collision with root package name */
        private Object f13627g;

        public b(g5.a aVar) {
            this(aVar, (m8) new a6());
        }

        public yh a(od odVar) {
            a1.a((Object) odVar.f10105b);
            od.g gVar = odVar.f10105b;
            boolean z10 = true;
            boolean z11 = gVar.f10164g == null && this.f13627g != null;
            if (gVar.f10162e != null || this.f13626f == null) {
                z10 = false;
            }
            if (z11 && z10) {
                odVar = odVar.a().a(this.f13627g).a(this.f13626f).a();
            } else if (z11) {
                odVar = odVar.a().a(this.f13627g).a();
            } else if (z10) {
                odVar = odVar.a().a(this.f13626f).a();
            }
            od odVar2 = odVar;
            return new yh(odVar2, this.f13621a, this.f13622b, this.f13623c.a(odVar2), this.f13624d, this.f13625e, (a) null);
        }

        public b(g5.a aVar, m8 m8Var) {
            this(aVar, (wh.a) new s80(m8Var));
        }

        public b(g5.a aVar, wh.a aVar2) {
            this.f13621a = aVar;
            this.f13622b = aVar2;
            this.f13623c = new x5();
            this.f13624d = new e6();
            this.f13625e = 1048576;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ wh a(m8 m8Var) {
            return new o2(m8Var);
        }
    }

    private yh(od odVar, g5.a aVar, wh.a aVar2, z6 z6Var, hc hcVar, int i10) {
        this.f13609h = (od.g) a1.a((Object) odVar.f10105b);
        this.f13608g = odVar;
        this.f13610i = aVar;
        this.f13611j = aVar2;
        this.f13612k = z6Var;
        this.f13613l = hcVar;
        this.f13614m = i10;
        this.f13615n = true;
        this.f13616o = -9223372036854775807L;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.applovin.impl.yh$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
            r9 = this;
            com.applovin.impl.dk r8 = new com.applovin.impl.dk
            long r1 = r9.f13616o
            boolean r3 = r9.f13617p
            boolean r5 = r9.f13618q
            com.applovin.impl.od r7 = r9.f13608g
            r4 = 0
            r6 = 0
            r0 = r8
            r0.<init>(r1, r3, r4, r5, r6, r7)
            boolean r0 = r9.f13615n
            if (r0 == 0) goto L_0x001a
            com.applovin.impl.yh$a r0 = new com.applovin.impl.yh$a
            r0.<init>(r8)
            r8 = r0
        L_0x001a:
            r9.a((com.applovin.impl.go) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.yh.i():void");
    }

    public rd a(wd.a aVar, n0 n0Var, long j10) {
        g5 a10 = this.f13610i.a();
        yo yoVar = this.f13619r;
        if (yoVar != null) {
            a10.a(yoVar);
        }
        return new xh(this.f13609h.f10158a, a10, this.f13611j.a(), this.f13612k, a(aVar), this.f13613l, b(aVar), this, n0Var, this.f13609h.f10162e, this.f13614m);
    }

    public void b() {
    }

    /* access modifiers changed from: protected */
    public void h() {
        this.f13612k.a();
    }

    class a extends g9 {
        a(go goVar) {
            super(goVar);
        }

        public go.b a(int i10, go.b bVar, boolean z10) {
            super.a(i10, bVar, z10);
            bVar.f8057g = true;
            return bVar;
        }

        public go.d a(int i10, go.d dVar, long j10) {
            super.a(i10, dVar, j10);
            dVar.f8078m = true;
            return dVar;
        }
    }

    public od a() {
        return this.f13608g;
    }

    public void a(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f13616o;
        }
        if (this.f13615n || this.f13616o != j10 || this.f13617p != z10 || this.f13618q != z11) {
            this.f13616o = j10;
            this.f13617p = z10;
            this.f13618q = z11;
            this.f13615n = false;
            i();
        }
    }

    /* synthetic */ yh(od odVar, g5.a aVar, wh.a aVar2, z6 z6Var, hc hcVar, int i10, a aVar3) {
        this(odVar, aVar, aVar2, z6Var, hcVar, i10);
    }

    /* access modifiers changed from: protected */
    public void a(yo yoVar) {
        this.f13619r = yoVar;
        this.f13612k.b();
        i();
    }

    public void a(rd rdVar) {
        ((xh) rdVar).t();
    }
}
