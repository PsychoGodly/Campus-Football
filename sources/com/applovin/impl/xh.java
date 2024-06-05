package com.applovin.impl;

import android.net.Uri;
import android.os.Handler;
import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.applovin.impl.hc;
import com.applovin.impl.j5;
import com.applovin.impl.jc;
import com.applovin.impl.pa;
import com.applovin.impl.rd;
import com.applovin.impl.ro;
import com.applovin.impl.xd;
import com.applovin.impl.xi;
import com.applovin.impl.y6;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class xh implements rd, k8, jc.b, jc.f, xi.d {
    /* access modifiers changed from: private */
    public static final Map N = l();
    /* access modifiers changed from: private */
    public static final d9 O = new d9.b().c("icy").f("application/x-icy").a();
    private long A;
    private boolean B;
    private int C;
    private boolean D;
    private boolean E;
    private int F;
    private long G;
    private long H;
    private long I;
    private boolean J;
    private int K;
    private boolean L;
    private boolean M;

    /* renamed from: a  reason: collision with root package name */
    private final Uri f13328a;

    /* renamed from: b  reason: collision with root package name */
    private final g5 f13329b;

    /* renamed from: c  reason: collision with root package name */
    private final z6 f13330c;

    /* renamed from: d  reason: collision with root package name */
    private final hc f13331d;

    /* renamed from: f  reason: collision with root package name */
    private final xd.a f13332f;

    /* renamed from: g  reason: collision with root package name */
    private final y6.a f13333g;

    /* renamed from: h  reason: collision with root package name */
    private final b f13334h;

    /* renamed from: i  reason: collision with root package name */
    private final n0 f13335i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final String f13336j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final long f13337k;

    /* renamed from: l  reason: collision with root package name */
    private final jc f13338l = new jc("ProgressiveMediaPeriod");

    /* renamed from: m  reason: collision with root package name */
    private final wh f13339m;

    /* renamed from: n  reason: collision with root package name */
    private final a4 f13340n;

    /* renamed from: o  reason: collision with root package name */
    private final Runnable f13341o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Runnable f13342p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Handler f13343q;

    /* renamed from: r  reason: collision with root package name */
    private rd.a f13344r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public ra f13345s;

    /* renamed from: t  reason: collision with root package name */
    private xi[] f13346t;

    /* renamed from: u  reason: collision with root package name */
    private d[] f13347u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f13348v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f13349w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f13350x;

    /* renamed from: y  reason: collision with root package name */
    private e f13351y;

    /* renamed from: z  reason: collision with root package name */
    private ej f13352z;

    final class a implements jc.e, pa.a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f13353a = ic.a();

        /* renamed from: b  reason: collision with root package name */
        private final Uri f13354b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final cl f13355c;

        /* renamed from: d  reason: collision with root package name */
        private final wh f13356d;

        /* renamed from: e  reason: collision with root package name */
        private final k8 f13357e;

        /* renamed from: f  reason: collision with root package name */
        private final a4 f13358f;

        /* renamed from: g  reason: collision with root package name */
        private final qh f13359g = new qh();

        /* renamed from: h  reason: collision with root package name */
        private volatile boolean f13360h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f13361i = true;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public long f13362j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public j5 f13363k = a(0);
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public long f13364l = -1;

        /* renamed from: m  reason: collision with root package name */
        private ro f13365m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f13366n;

        public a(Uri uri, g5 g5Var, wh whVar, k8 k8Var, a4 a4Var) {
            this.f13354b = uri;
            this.f13355c = new cl(g5Var);
            this.f13356d = whVar;
            this.f13357e = k8Var;
            this.f13358f = a4Var;
        }

        public void b() {
            this.f13360h = true;
        }

        public void a() {
            int i10 = 0;
            while (i10 == 0 && !this.f13360h) {
                try {
                    long j10 = this.f13359g.f10991a;
                    j5 a10 = a(j10);
                    this.f13363k = a10;
                    long a11 = this.f13355c.a(a10);
                    this.f13364l = a11;
                    if (a11 != -1) {
                        this.f13364l = a11 + j10;
                    }
                    ra unused = xh.this.f13345s = ra.a(this.f13355c.e());
                    e5 e5Var = this.f13355c;
                    if (!(xh.this.f13345s == null || xh.this.f13345s.f11169g == -1)) {
                        e5Var = new pa(this.f13355c, xh.this.f13345s.f11169g, this);
                        ro o10 = xh.this.o();
                        this.f13365m = o10;
                        o10.a(xh.O);
                    }
                    wh whVar = this.f13356d;
                    Uri uri = this.f13354b;
                    Map e10 = this.f13355c.e();
                    long j11 = this.f13364l;
                    long j12 = j10;
                    whVar.a(e5Var, uri, e10, j10, j11, this.f13357e);
                    if (xh.this.f13345s != null) {
                        this.f13356d.c();
                    }
                    if (this.f13361i) {
                        this.f13356d.a(j12, this.f13362j);
                        this.f13361i = false;
                    }
                    while (true) {
                        long j13 = j12;
                        while (i10 == 0 && !this.f13360h) {
                            this.f13358f.a();
                            i10 = this.f13356d.a(this.f13359g);
                            j12 = this.f13356d.b();
                            if (j12 > xh.this.f13337k + j13) {
                                this.f13358f.c();
                                xh.this.f13343q.post(xh.this.f13342p);
                            }
                        }
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f13356d.b() != -1) {
                        this.f13359g.f10991a = this.f13356d.b();
                    }
                    yp.a((g5) this.f13355c);
                } catch (InterruptedException unused2) {
                    throw new InterruptedIOException();
                } catch (Throwable th) {
                    if (!(i10 == 1 || this.f13356d.b() == -1)) {
                        this.f13359g.f10991a = this.f13356d.b();
                    }
                    yp.a((g5) this.f13355c);
                    throw th;
                }
            }
        }

        public void a(yg ygVar) {
            long max = !this.f13366n ? this.f13362j : Math.max(xh.this.n(), this.f13362j);
            int a10 = ygVar.a();
            ro roVar = (ro) a1.a((Object) this.f13365m);
            roVar.a(ygVar, a10);
            roVar.a(max, 1, a10, 0, (ro.a) null);
            this.f13366n = true;
        }

        /* access modifiers changed from: private */
        public void a(long j10, long j11) {
            this.f13359g.f10991a = j10;
            this.f13362j = j11;
            this.f13361i = true;
            this.f13366n = false;
        }

        private j5 a(long j10) {
            return new j5.b().a(this.f13354b).a(j10).a(xh.this.f13336j).a(6).a(xh.N).a();
        }
    }

    interface b {
        void a(long j10, boolean z10, boolean z11);
    }

    private final class c implements yi {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f13368a;

        public c(int i10) {
            this.f13368a = i10;
        }

        public boolean d() {
            return xh.this.a(this.f13368a);
        }

        public void a() {
            xh.this.d(this.f13368a);
        }

        public int a(e9 e9Var, n5 n5Var, int i10) {
            return xh.this.a(this.f13368a, e9Var, n5Var, i10);
        }

        public int a(long j10) {
            return xh.this.a(this.f13368a, j10);
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f13370a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13371b;

        public d(int i10, boolean z10) {
            this.f13370a = i10;
            this.f13371b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f13370a == dVar.f13370a && this.f13371b == dVar.f13371b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f13370a * 31) + (this.f13371b ? 1 : 0);
        }
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final qo f13372a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f13373b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f13374c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean[] f13375d;

        public e(qo qoVar, boolean[] zArr) {
            this.f13372a = qoVar;
            this.f13373b = zArr;
            int i10 = qoVar.f11066a;
            this.f13374c = new boolean[i10];
            this.f13375d = new boolean[i10];
        }
    }

    public xh(Uri uri, g5 g5Var, wh whVar, z6 z6Var, y6.a aVar, hc hcVar, xd.a aVar2, b bVar, n0 n0Var, String str, int i10) {
        this.f13328a = uri;
        this.f13329b = g5Var;
        this.f13330c = z6Var;
        this.f13333g = aVar;
        this.f13331d = hcVar;
        this.f13332f = aVar2;
        this.f13334h = bVar;
        this.f13335i = n0Var;
        this.f13336j = str;
        this.f13337k = (long) i10;
        this.f13339m = whVar;
        this.f13340n = new a4();
        this.f13341o = new t70(this);
        this.f13342p = new u70(this);
        this.f13343q = yp.a();
        this.f13347u = new d[0];
        this.f13346t = new xi[0];
        this.I = -9223372036854775807L;
        this.G = -1;
        this.A = -9223372036854775807L;
        this.C = 1;
    }

    private void k() {
        a1.b(this.f13349w);
        a1.a((Object) this.f13351y);
        a1.a((Object) this.f13352z);
    }

    private static Map l() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        return Collections.unmodifiableMap(hashMap);
    }

    private int m() {
        int i10 = 0;
        for (xi g10 : this.f13346t) {
            i10 += g10.g();
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public long n() {
        long j10 = Long.MIN_VALUE;
        for (xi c10 : this.f13346t) {
            j10 = Math.max(j10, c10.c());
        }
        return j10;
    }

    private boolean p() {
        return this.I != -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (!this.M) {
            ((rd.a) a1.a((Object) this.f13344r)).a(this);
        }
    }

    /* access modifiers changed from: private */
    public void r() {
        we weVar;
        if (!this.M && !this.f13349w && this.f13348v && this.f13352z != null) {
            xi[] xiVarArr = this.f13346t;
            int length = xiVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                if (xiVarArr[i10].f() != null) {
                    i10++;
                } else {
                    return;
                }
            }
            this.f13340n.c();
            int length2 = this.f13346t.length;
            po[] poVarArr = new po[length2];
            boolean[] zArr = new boolean[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                d9 d9Var = (d9) a1.a((Object) this.f13346t[i11].f());
                String str = d9Var.f7153m;
                boolean g10 = df.g(str);
                boolean z10 = g10 || df.i(str);
                zArr[i11] = z10;
                this.f13350x = z10 | this.f13350x;
                ra raVar = this.f13345s;
                if (raVar != null) {
                    if (g10 || this.f13347u[i11].f13371b) {
                        we weVar2 = d9Var.f7151k;
                        if (weVar2 == null) {
                            weVar = new we(raVar);
                        } else {
                            weVar = weVar2.a(raVar);
                        }
                        d9Var = d9Var.a().a(weVar).a();
                    }
                    if (g10 && d9Var.f7147g == -1 && d9Var.f7148h == -1 && raVar.f11164a != -1) {
                        d9Var = d9Var.a().b(raVar.f11164a).a();
                    }
                }
                poVarArr[i11] = new po(d9Var.a(this.f13330c.a(d9Var)));
            }
            this.f13351y = new e(new qo(poVarArr), zArr);
            this.f13349w = true;
            ((rd.a) a1.a((Object) this.f13344r)).a(this);
        }
    }

    private void u() {
        a aVar = new a(this.f13328a, this.f13329b, this.f13339m, this, this.f13340n);
        if (this.f13349w) {
            a1.b(p());
            long j10 = this.A;
            if (j10 == -9223372036854775807L || this.I <= j10) {
                aVar.a(((ej) a1.a((Object) this.f13352z)).b(this.I).f7449a.f8035b, this.I);
                for (xi c10 : this.f13346t) {
                    c10.c(this.I);
                }
                this.I = -9223372036854775807L;
            } else {
                this.L = true;
                this.I = -9223372036854775807L;
                return;
            }
        }
        this.K = m();
        this.f13332f.c(new ic(aVar.f13353a, aVar.f13363k, this.f13338l.a(aVar, this, this.f13331d.a(this.C))), 1, -1, (d9) null, 0, (Object) null, aVar.f13362j, this.A);
    }

    private boolean v() {
        return this.E || p();
    }

    public void c(long j10) {
    }

    public long g() {
        if (this.F == 0) {
            return Long.MIN_VALUE;
        }
        return e();
    }

    public long h() {
        if (!this.E) {
            return -9223372036854775807L;
        }
        if (!this.L && m() <= this.K) {
            return -9223372036854775807L;
        }
        this.E = false;
        return this.H;
    }

    /* access modifiers changed from: package-private */
    public ro o() {
        return a(new d(0, true));
    }

    /* access modifiers changed from: package-private */
    public void s() {
        this.f13338l.a(this.f13331d.a(this.C));
    }

    public void t() {
        if (this.f13349w) {
            for (xi k10 : this.f13346t) {
                k10.k();
            }
        }
        this.f13338l.a((jc.f) this);
        this.f13343q.removeCallbacksAndMessages((Object) null);
        this.f13344r = null;
        this.M = true;
    }

    public boolean b(long j10) {
        if (this.L || this.f13338l.c() || this.J) {
            return false;
        }
        if (this.f13349w && this.F == 0) {
            return false;
        }
        boolean e10 = this.f13340n.e();
        if (this.f13338l.d()) {
            return e10;
        }
        u();
        return true;
    }

    public void c() {
        this.f13348v = true;
        this.f13343q.post(this.f13341o);
    }

    /* access modifiers changed from: package-private */
    public void d(int i10) {
        this.f13346t[i10].j();
        s();
    }

    public long e() {
        long j10;
        k();
        boolean[] zArr = this.f13351y.f13373b;
        if (this.L) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.I;
        }
        if (this.f13350x) {
            int length = this.f13346t.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10] && !this.f13346t[i10].i()) {
                    j10 = Math.min(j10, this.f13346t[i10].c());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = n();
        }
        return j10 == Long.MIN_VALUE ? this.H : j10;
    }

    public void f() {
        s();
        if (this.L && !this.f13349w) {
            throw ah.a("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    private boolean a(a aVar, int i10) {
        ej ejVar;
        if (this.G == -1 && ((ejVar = this.f13352z) == null || ejVar.d() == -9223372036854775807L)) {
            if (!this.f13349w || v()) {
                this.E = this.f13349w;
                this.H = 0;
                this.K = 0;
                for (xi n10 : this.f13346t) {
                    n10.n();
                }
                aVar.a(0, 0);
                return true;
            }
            this.J = true;
            return false;
        }
        this.K = i10;
        return true;
    }

    private void c(int i10) {
        k();
        boolean[] zArr = this.f13351y.f13373b;
        if (this.J && zArr[i10]) {
            if (!this.f13346t[i10].a(false)) {
                this.I = 0;
                this.J = false;
                this.E = true;
                this.H = 0;
                this.K = 0;
                for (xi n10 : this.f13346t) {
                    n10.n();
                }
                ((rd.a) a1.a((Object) this.f13344r)).a(this);
            }
        }
    }

    public void d() {
        for (xi l10 : this.f13346t) {
            l10.l();
        }
        this.f13339m.a();
    }

    public qo b() {
        k();
        return this.f13351y.f13372a;
    }

    private void b(int i10) {
        k();
        e eVar = this.f13351y;
        boolean[] zArr = eVar.f13375d;
        if (!zArr[i10]) {
            d9 a10 = eVar.f13372a.a(i10).a(0);
            this.f13332f.a(df.e(a10.f7153m), a10, 0, (Object) null, this.H);
            zArr[i10] = true;
        }
    }

    private void a(a aVar) {
        if (this.G == -1) {
            this.G = aVar.f13364l;
        }
    }

    public void a(long j10, boolean z10) {
        k();
        if (!p()) {
            boolean[] zArr = this.f13351y.f13374c;
            int length = this.f13346t.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f13346t[i10].b(j10, z10, zArr[i10]);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void b(ej ejVar) {
        this.f13352z = this.f13345s == null ? ejVar : new ej.b(-9223372036854775807L);
        this.A = ejVar.d();
        int i10 = 1;
        boolean z10 = this.G == -1 && ejVar.d() == -9223372036854775807L;
        this.B = z10;
        if (z10) {
            i10 = 7;
        }
        this.C = i10;
        this.f13334h.a(this.A, ejVar.b(), this.B);
        if (!this.f13349w) {
            r();
        }
    }

    public long a(long j10, fj fjVar) {
        k();
        if (!this.f13352z.b()) {
            return 0;
        }
        ej.a b10 = this.f13352z.b(j10);
        return fjVar.a(j10, b10.f7449a.f8034a, b10.f7450b.f8034a);
    }

    public boolean a() {
        return this.f13338l.d() && this.f13340n.d();
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i10) {
        return !v() && this.f13346t[i10].a(this.L);
    }

    public void a(a aVar, long j10, long j11, boolean z10) {
        cl a10 = aVar.f13355c;
        ic icVar = new ic(aVar.f13353a, aVar.f13363k, a10.h(), a10.i(), j10, j11, a10.g());
        this.f13331d.a(aVar.f13353a);
        this.f13332f.a(icVar, 1, -1, (d9) null, 0, (Object) null, aVar.f13362j, this.A);
        if (!z10) {
            a(aVar);
            for (xi n10 : this.f13346t) {
                n10.n();
            }
            if (this.F > 0) {
                ((rd.a) a1.a((Object) this.f13344r)).a(this);
            }
        }
    }

    public void a(a aVar, long j10, long j11) {
        ej ejVar;
        if (this.A == -9223372036854775807L && (ejVar = this.f13352z) != null) {
            boolean b10 = ejVar.b();
            long n10 = n();
            long j12 = n10 == Long.MIN_VALUE ? 0 : n10 + UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
            this.A = j12;
            this.f13334h.a(j12, b10, this.B);
        }
        cl a10 = aVar.f13355c;
        ic icVar = new ic(aVar.f13353a, aVar.f13363k, a10.h(), a10.i(), j10, j11, a10.g());
        this.f13331d.a(aVar.f13353a);
        this.f13332f.b(icVar, 1, -1, (d9) null, 0, (Object) null, aVar.f13362j, this.A);
        a(aVar);
        this.L = true;
        ((rd.a) a1.a((Object) this.f13344r)).a(this);
    }

    public jc.c a(a aVar, long j10, long j11, IOException iOException, int i10) {
        jc.c cVar;
        a aVar2;
        boolean z10;
        a(aVar);
        cl a10 = aVar.f13355c;
        ic icVar = new ic(aVar.f13353a, aVar.f13363k, a10.h(), a10.i(), j10, j11, a10.g());
        long a11 = this.f13331d.a(new hc.a(icVar, new pd(1, -1, (d9) null, 0, (Object) null, r2.b(aVar.f13362j), r2.b(this.A)), iOException, i10));
        if (a11 == -9223372036854775807L) {
            cVar = jc.f8723g;
            a aVar3 = aVar;
        } else {
            int m10 = m();
            if (m10 > this.K) {
                aVar2 = aVar;
                z10 = true;
            } else {
                z10 = false;
                aVar2 = aVar;
            }
            if (a(aVar2, m10)) {
                cVar = jc.a(z10, a11);
            } else {
                cVar = jc.f8722f;
            }
        }
        boolean z11 = !cVar.a();
        this.f13332f.a(icVar, 1, -1, (d9) null, 0, (Object) null, aVar.f13362j, this.A, iOException, z11);
        if (z11) {
            this.f13331d.a(aVar.f13353a);
        }
        return cVar;
    }

    public void a(d9 d9Var) {
        this.f13343q.post(this.f13341o);
    }

    public void a(rd.a aVar, long j10) {
        this.f13344r = aVar;
        this.f13340n.e();
        u();
    }

    private ro a(d dVar) {
        int length = this.f13346t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f13347u[i10])) {
                return this.f13346t[i10];
            }
        }
        xi a10 = xi.a(this.f13335i, this.f13343q.getLooper(), this.f13330c, this.f13333g);
        a10.a((xi.d) this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f13347u, i11);
        dVarArr[length] = dVar;
        this.f13347u = (d[]) yp.a((Object[]) dVarArr);
        xi[] xiVarArr = (xi[]) Arrays.copyOf(this.f13346t, i11);
        xiVarArr[length] = a10;
        this.f13346t = (xi[]) yp.a((Object[]) xiVarArr);
        return a10;
    }

    /* access modifiers changed from: package-private */
    public int a(int i10, e9 e9Var, n5 n5Var, int i11) {
        if (v()) {
            return -3;
        }
        b(i10);
        int a10 = this.f13346t[i10].a(e9Var, n5Var, i11, this.L);
        if (a10 == -3) {
            c(i10);
        }
        return a10;
    }

    private boolean a(boolean[] zArr, long j10) {
        int length = this.f13346t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f13346t[i10].b(j10, false) && (zArr[i10] || !this.f13350x)) {
                return false;
            }
        }
        return true;
    }

    public void a(ej ejVar) {
        this.f13343q.post(new v70(this, ejVar));
    }

    public long a(long j10) {
        k();
        boolean[] zArr = this.f13351y.f13373b;
        if (!this.f13352z.b()) {
            j10 = 0;
        }
        int i10 = 0;
        this.E = false;
        this.H = j10;
        if (p()) {
            this.I = j10;
            return j10;
        } else if (this.C != 7 && a(zArr, j10)) {
            return j10;
        } else {
            this.J = false;
            this.I = j10;
            this.L = false;
            if (this.f13338l.d()) {
                xi[] xiVarArr = this.f13346t;
                int length = xiVarArr.length;
                while (i10 < length) {
                    xiVarArr[i10].b();
                    i10++;
                }
                this.f13338l.a();
            } else {
                this.f13338l.b();
                xi[] xiVarArr2 = this.f13346t;
                int length2 = xiVarArr2.length;
                while (i10 < length2) {
                    xiVarArr2[i10].n();
                    i10++;
                }
            }
            return j10;
        }
    }

    public long a(f8[] f8VarArr, boolean[] zArr, yi[] yiVarArr, boolean[] zArr2, long j10) {
        f8 f8Var;
        k();
        e eVar = this.f13351y;
        qo qoVar = eVar.f13372a;
        boolean[] zArr3 = eVar.f13374c;
        int i10 = this.F;
        int i11 = 0;
        for (int i12 = 0; i12 < f8VarArr.length; i12++) {
            c cVar = yiVarArr[i12];
            if (cVar != null && (f8VarArr[i12] == null || !zArr[i12])) {
                int a10 = cVar.f13368a;
                a1.b(zArr3[a10]);
                this.F--;
                zArr3[a10] = false;
                yiVarArr[i12] = null;
            }
        }
        boolean z10 = !this.D ? j10 != 0 : i10 == 0;
        for (int i13 = 0; i13 < f8VarArr.length; i13++) {
            if (yiVarArr[i13] == null && (f8Var = f8VarArr[i13]) != null) {
                a1.b(f8Var.b() == 1);
                a1.b(f8Var.b(0) == 0);
                int a11 = qoVar.a(f8Var.a());
                a1.b(!zArr3[a11]);
                this.F++;
                zArr3[a11] = true;
                yiVarArr[i13] = new c(a11);
                zArr2[i13] = true;
                if (!z10) {
                    xi xiVar = this.f13346t[a11];
                    z10 = !xiVar.b(j10, true) && xiVar.e() != 0;
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            if (this.f13338l.d()) {
                xi[] xiVarArr = this.f13346t;
                int length = xiVarArr.length;
                while (i11 < length) {
                    xiVarArr[i11].b();
                    i11++;
                }
                this.f13338l.a();
            } else {
                xi[] xiVarArr2 = this.f13346t;
                int length2 = xiVarArr2.length;
                while (i11 < length2) {
                    xiVarArr2[i11].n();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = a(j10);
            while (i11 < yiVarArr.length) {
                if (yiVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.D = true;
        return j10;
    }

    /* access modifiers changed from: package-private */
    public int a(int i10, long j10) {
        if (v()) {
            return 0;
        }
        b(i10);
        xi xiVar = this.f13346t[i10];
        int a10 = xiVar.a(j10, this.L);
        xiVar.f(a10);
        if (a10 == 0) {
            c(i10);
        }
        return a10;
    }

    public ro a(int i10, int i11) {
        return a(new d(i10, false));
    }
}
