package p3;

import android.net.Uri;
import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;
import i4.s;
import j4.g0;
import j4.h0;
import j4.i;
import j4.l;
import j4.o;
import j4.o0;
import j4.p;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k4.g;
import k4.n0;
import k4.v;
import n2.r1;
import n2.s1;
import n2.u3;
import n2.y2;
import p3.e0;
import p3.p;
import p3.p0;
import p3.u;
import r2.w;
import r2.y;
import s2.a0;
import s2.b0;
import s2.e0;
import s2.n;

/* compiled from: ProgressiveMediaPeriod */
final class k0 implements u, n, h0.b<a>, h0.f, p0.d {
    /* access modifiers changed from: private */
    public static final Map<String, String> N = K();
    /* access modifiers changed from: private */
    public static final r1 O = new r1.b().U("icy").g0("application/x-icy").G();
    private long A;
    private boolean B;
    private int C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean G;
    private long H;
    private long I;
    private boolean J;
    private int K;
    private boolean L;
    private boolean M;

    /* renamed from: a  reason: collision with root package name */
    private final Uri f21484a;

    /* renamed from: b  reason: collision with root package name */
    private final l f21485b;

    /* renamed from: c  reason: collision with root package name */
    private final y f21486c;

    /* renamed from: d  reason: collision with root package name */
    private final g0 f21487d;

    /* renamed from: f  reason: collision with root package name */
    private final e0.a f21488f;

    /* renamed from: g  reason: collision with root package name */
    private final w.a f21489g;

    /* renamed from: h  reason: collision with root package name */
    private final b f21490h;

    /* renamed from: i  reason: collision with root package name */
    private final j4.b f21491i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final String f21492j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final long f21493k;

    /* renamed from: l  reason: collision with root package name */
    private final h0 f21494l = new h0("ProgressiveMediaPeriod");

    /* renamed from: m  reason: collision with root package name */
    private final f0 f21495m;

    /* renamed from: n  reason: collision with root package name */
    private final g f21496n;

    /* renamed from: o  reason: collision with root package name */
    private final Runnable f21497o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Runnable f21498p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Handler f21499q;

    /* renamed from: r  reason: collision with root package name */
    private u.a f21500r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public j3.b f21501s;

    /* renamed from: t  reason: collision with root package name */
    private p0[] f21502t;

    /* renamed from: u  reason: collision with root package name */
    private d[] f21503u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f21504v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f21505w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f21506x;

    /* renamed from: y  reason: collision with root package name */
    private e f21507y;

    /* renamed from: z  reason: collision with root package name */
    private b0 f21508z;

    /* compiled from: ProgressiveMediaPeriod */
    final class a implements h0.e, p.a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f21509a = q.a();

        /* renamed from: b  reason: collision with root package name */
        private final Uri f21510b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final o0 f21511c;

        /* renamed from: d  reason: collision with root package name */
        private final f0 f21512d;

        /* renamed from: e  reason: collision with root package name */
        private final n f21513e;

        /* renamed from: f  reason: collision with root package name */
        private final g f21514f;

        /* renamed from: g  reason: collision with root package name */
        private final a0 f21515g = new a0();

        /* renamed from: h  reason: collision with root package name */
        private volatile boolean f21516h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f21517i = true;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public long f21518j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public j4.p f21519k = i(0);

        /* renamed from: l  reason: collision with root package name */
        private s2.e0 f21520l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f21521m;

        public a(Uri uri, l lVar, f0 f0Var, n nVar, g gVar) {
            this.f21510b = uri;
            this.f21511c = new o0(lVar);
            this.f21512d = f0Var;
            this.f21513e = nVar;
            this.f21514f = gVar;
        }

        private j4.p i(long j10) {
            return new p.b().i(this.f21510b).h(j10).f(k0.this.f21492j).b(6).e(k0.N).a();
        }

        /* access modifiers changed from: private */
        public void j(long j10, long j11) {
            this.f21515g.f22378a = j10;
            this.f21518j = j11;
            this.f21517i = true;
            this.f21521m = false;
        }

        public void a() throws IOException {
            int i10 = 0;
            while (i10 == 0 && !this.f21516h) {
                try {
                    long j10 = this.f21515g.f22378a;
                    j4.p i11 = i(j10);
                    this.f21519k = i11;
                    long f10 = this.f21511c.f(i11);
                    if (f10 != -1) {
                        f10 += j10;
                        k0.this.Y();
                    }
                    long j11 = f10;
                    j3.b unused = k0.this.f21501s = j3.b.a(this.f21511c.k());
                    i iVar = this.f21511c;
                    if (!(k0.this.f21501s == null || k0.this.f21501s.f19281g == -1)) {
                        iVar = new p(this.f21511c, k0.this.f21501s.f19281g, this);
                        s2.e0 N = k0.this.N();
                        this.f21520l = N;
                        N.a(k0.O);
                    }
                    long j12 = j10;
                    this.f21512d.g(iVar, this.f21510b, this.f21511c.k(), j10, j11, this.f21513e);
                    if (k0.this.f21501s != null) {
                        this.f21512d.f();
                    }
                    if (this.f21517i) {
                        this.f21512d.c(j12, this.f21518j);
                        this.f21517i = false;
                    }
                    while (true) {
                        long j13 = j12;
                        while (i10 == 0 && !this.f21516h) {
                            this.f21514f.a();
                            i10 = this.f21512d.d(this.f21515g);
                            j12 = this.f21512d.e();
                            if (j12 > k0.this.f21493k + j13) {
                                this.f21514f.c();
                                k0.this.f21499q.post(k0.this.f21498p);
                            }
                        }
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f21512d.e() != -1) {
                        this.f21515g.f22378a = this.f21512d.e();
                    }
                    o.a(this.f21511c);
                } catch (InterruptedException unused2) {
                    throw new InterruptedIOException();
                } catch (Throwable th) {
                    if (!(i10 == 1 || this.f21512d.e() == -1)) {
                        this.f21515g.f22378a = this.f21512d.e();
                    }
                    o.a(this.f21511c);
                    throw th;
                }
            }
        }

        public void b(k4.a0 a0Var) {
            long j10;
            if (!this.f21521m) {
                j10 = this.f21518j;
            } else {
                j10 = Math.max(k0.this.M(true), this.f21518j);
            }
            int a10 = a0Var.a();
            s2.e0 e0Var = (s2.e0) k4.a.e(this.f21520l);
            e0Var.d(a0Var, a10);
            e0Var.b(j10, 1, a10, 0, (e0.a) null);
            this.f21521m = true;
        }

        public void c() {
            this.f21516h = true;
        }
    }

    /* compiled from: ProgressiveMediaPeriod */
    interface b {
        void f(long j10, boolean z10, boolean z11);
    }

    /* compiled from: ProgressiveMediaPeriod */
    private final class c implements q0 {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f21523a;

        public c(int i10) {
            this.f21523a = i10;
        }

        public void a() throws IOException {
            k0.this.X(this.f21523a);
        }

        public int e(long j10) {
            return k0.this.h0(this.f21523a, j10);
        }

        public boolean isReady() {
            return k0.this.P(this.f21523a);
        }

        public int j(s1 s1Var, q2.g gVar, int i10) {
            return k0.this.d0(this.f21523a, s1Var, gVar, i10);
        }
    }

    /* compiled from: ProgressiveMediaPeriod */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f21525a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f21526b;

        public d(int i10, boolean z10) {
            this.f21525a = i10;
            this.f21526b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f21525a == dVar.f21525a && this.f21526b == dVar.f21526b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f21525a * 31) + (this.f21526b ? 1 : 0);
        }
    }

    /* compiled from: ProgressiveMediaPeriod */
    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final z0 f21527a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f21528b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f21529c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean[] f21530d;

        public e(z0 z0Var, boolean[] zArr) {
            this.f21527a = z0Var;
            this.f21528b = zArr;
            int i10 = z0Var.f21696a;
            this.f21529c = new boolean[i10];
            this.f21530d = new boolean[i10];
        }
    }

    public k0(Uri uri, l lVar, f0 f0Var, y yVar, w.a aVar, g0 g0Var, e0.a aVar2, b bVar, j4.b bVar2, String str, int i10) {
        this.f21484a = uri;
        this.f21485b = lVar;
        this.f21486c = yVar;
        this.f21489g = aVar;
        this.f21487d = g0Var;
        this.f21488f = aVar2;
        this.f21490h = bVar;
        this.f21491i = bVar2;
        this.f21492j = str;
        this.f21493k = (long) i10;
        this.f21495m = f0Var;
        this.f21496n = new g();
        this.f21497o = new g0(this);
        this.f21498p = new i0(this);
        this.f21499q = n0.w();
        this.f21503u = new d[0];
        this.f21502t = new p0[0];
        this.I = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.C = 1;
    }

    private void I() {
        k4.a.f(this.f21505w);
        k4.a.e(this.f21507y);
        k4.a.e(this.f21508z);
    }

    private boolean J(a aVar, int i10) {
        b0 b0Var;
        if (this.G || !((b0Var = this.f21508z) == null || b0Var.i() == -9223372036854775807L)) {
            this.K = i10;
            return true;
        }
        if (!this.f21505w || j0()) {
            this.E = this.f21505w;
            this.H = 0;
            this.K = 0;
            for (p0 V : this.f21502t) {
                V.V();
            }
            aVar.j(0, 0);
            return true;
        }
        this.J = true;
        return false;
    }

    private static Map<String, String> K() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        return Collections.unmodifiableMap(hashMap);
    }

    private int L() {
        int i10 = 0;
        for (p0 G2 : this.f21502t) {
            i10 += G2.G();
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public long M(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f21502t.length; i10++) {
            if (z10 || ((e) k4.a.e(this.f21507y)).f21529c[i10]) {
                j10 = Math.max(j10, this.f21502t[i10].z());
            }
        }
        return j10;
    }

    private boolean O() {
        return this.I != -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Q() {
        if (!this.M) {
            ((u.a) k4.a.e(this.f21500r)).j(this);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void R() {
        this.G = true;
    }

    /* access modifiers changed from: private */
    public void T() {
        f3.a aVar;
        if (!this.M && !this.f21505w && this.f21504v && this.f21508z != null) {
            p0[] p0VarArr = this.f21502t;
            int length = p0VarArr.length;
            int i10 = 0;
            while (i10 < length) {
                if (p0VarArr[i10].F() != null) {
                    i10++;
                } else {
                    return;
                }
            }
            this.f21496n.c();
            int length2 = this.f21502t.length;
            x0[] x0VarArr = new x0[length2];
            boolean[] zArr = new boolean[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                r1 r1Var = (r1) k4.a.e(this.f21502t[i11].F());
                String str = r1Var.f20654m;
                boolean o10 = v.o(str);
                boolean z10 = o10 || v.s(str);
                zArr[i11] = z10;
                this.f21506x = z10 | this.f21506x;
                j3.b bVar = this.f21501s;
                if (bVar != null) {
                    if (o10 || this.f21503u[i11].f21526b) {
                        f3.a aVar2 = r1Var.f20652k;
                        if (aVar2 == null) {
                            aVar = new f3.a(bVar);
                        } else {
                            aVar = aVar2.a(bVar);
                        }
                        r1Var = r1Var.b().Z(aVar).G();
                    }
                    if (o10 && r1Var.f20648g == -1 && r1Var.f20649h == -1 && bVar.f19276a != -1) {
                        r1Var = r1Var.b().I(bVar.f19276a).G();
                    }
                }
                x0VarArr[i11] = new x0(Integer.toString(i11), r1Var.c(this.f21486c.b(r1Var)));
            }
            this.f21507y = new e(new z0(x0VarArr), zArr);
            this.f21505w = true;
            ((u.a) k4.a.e(this.f21500r)).e(this);
        }
    }

    private void U(int i10) {
        I();
        e eVar = this.f21507y;
        boolean[] zArr = eVar.f21530d;
        if (!zArr[i10]) {
            r1 b10 = eVar.f21527a.b(i10).b(0);
            this.f21488f.i(v.k(b10.f20654m), b10, 0, (Object) null, this.H);
            zArr[i10] = true;
        }
    }

    private void V(int i10) {
        I();
        boolean[] zArr = this.f21507y.f21528b;
        if (this.J && zArr[i10]) {
            if (!this.f21502t[i10].K(false)) {
                this.I = 0;
                this.J = false;
                this.E = true;
                this.H = 0;
                this.K = 0;
                for (p0 V : this.f21502t) {
                    V.V();
                }
                ((u.a) k4.a.e(this.f21500r)).j(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void Y() {
        this.f21499q.post(new h0(this));
    }

    private s2.e0 c0(d dVar) {
        int length = this.f21502t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f21503u[i10])) {
                return this.f21502t[i10];
            }
        }
        p0 k10 = p0.k(this.f21491i, this.f21486c, this.f21489g);
        k10.d0(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f21503u, i11);
        dVarArr[length] = dVar;
        this.f21503u = (d[]) n0.k(dVarArr);
        p0[] p0VarArr = (p0[]) Arrays.copyOf(this.f21502t, i11);
        p0VarArr[length] = k10;
        this.f21502t = (p0[]) n0.k(p0VarArr);
        return k10;
    }

    private boolean f0(boolean[] zArr, long j10) {
        int length = this.f21502t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f21502t[i10].Z(j10, false) && (zArr[i10] || !this.f21506x)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void S(b0 b0Var) {
        this.f21508z = this.f21501s == null ? b0Var : new b0.b(-9223372036854775807L);
        this.A = b0Var.i();
        int i10 = 1;
        boolean z10 = !this.G && b0Var.i() == -9223372036854775807L;
        this.B = z10;
        if (z10) {
            i10 = 7;
        }
        this.C = i10;
        this.f21490h.f(this.A, b0Var.f(), this.B);
        if (!this.f21505w) {
            T();
        }
    }

    private void i0() {
        a aVar = new a(this.f21484a, this.f21485b, this.f21495m, this, this.f21496n);
        if (this.f21505w) {
            k4.a.f(O());
            long j10 = this.A;
            if (j10 == -9223372036854775807L || this.I <= j10) {
                aVar.j(((b0) k4.a.e(this.f21508z)).h(this.I).f22379a.f22385b, this.I);
                for (p0 b02 : this.f21502t) {
                    b02.b0(this.I);
                }
                this.I = -9223372036854775807L;
            } else {
                this.L = true;
                this.I = -9223372036854775807L;
                return;
            }
        }
        this.K = L();
        this.f21488f.A(new q(aVar.f21509a, aVar.f21519k, this.f21494l.n(aVar, this, this.f21487d.d(this.C))), 1, -1, (r1) null, 0, (Object) null, aVar.f21518j, this.A);
    }

    private boolean j0() {
        return this.E || O();
    }

    /* access modifiers changed from: package-private */
    public s2.e0 N() {
        return c0(new d(0, true));
    }

    /* access modifiers changed from: package-private */
    public boolean P(int i10) {
        return !j0() && this.f21502t[i10].K(this.L);
    }

    /* access modifiers changed from: package-private */
    public void W() throws IOException {
        this.f21494l.k(this.f21487d.d(this.C));
    }

    /* access modifiers changed from: package-private */
    public void X(int i10) throws IOException {
        this.f21502t[i10].N();
        W();
    }

    /* renamed from: Z */
    public void l(a aVar, long j10, long j11, boolean z10) {
        o0 d10 = aVar.f21511c;
        q qVar = new q(aVar.f21509a, aVar.f21519k, d10.r(), d10.s(), j10, j11, d10.q());
        this.f21487d.b(aVar.f21509a);
        this.f21488f.r(qVar, 1, -1, (r1) null, 0, (Object) null, aVar.f21518j, this.A);
        if (!z10) {
            for (p0 V : this.f21502t) {
                V.V();
            }
            if (this.F > 0) {
                ((u.a) k4.a.e(this.f21500r)).j(this);
            }
        }
    }

    public void a(r1 r1Var) {
        this.f21499q.post(this.f21497o);
    }

    /* renamed from: a0 */
    public void k(a aVar, long j10, long j11) {
        b0 b0Var;
        if (this.A == -9223372036854775807L && (b0Var = this.f21508z) != null) {
            boolean f10 = b0Var.f();
            long M2 = M(true);
            long j12 = M2 == Long.MIN_VALUE ? 0 : M2 + UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
            this.A = j12;
            this.f21490h.f(j12, f10, this.B);
        }
        o0 d10 = aVar.f21511c;
        q qVar = new q(aVar.f21509a, aVar.f21519k, d10.r(), d10.s(), j10, j11, d10.q());
        this.f21487d.b(aVar.f21509a);
        this.f21488f.u(qVar, 1, -1, (r1) null, 0, (Object) null, aVar.f21518j, this.A);
        this.L = true;
        ((u.a) k4.a.e(this.f21500r)).j(this);
    }

    public long b() {
        return f();
    }

    /* renamed from: b0 */
    public h0.c o(a aVar, long j10, long j11, IOException iOException, int i10) {
        h0.c cVar;
        a aVar2;
        boolean z10;
        o0 d10 = aVar.f21511c;
        q qVar = new q(aVar.f21509a, aVar.f21519k, d10.r(), d10.s(), j10, j11, d10.q());
        long c10 = this.f21487d.c(new g0.c(qVar, new t(1, -1, (r1) null, 0, (Object) null, n0.Z0(aVar.f21518j), n0.Z0(this.A)), iOException, i10));
        if (c10 == -9223372036854775807L) {
            cVar = h0.f19330g;
            a aVar3 = aVar;
        } else {
            int L2 = L();
            if (L2 > this.K) {
                aVar2 = aVar;
                z10 = true;
            } else {
                z10 = false;
                aVar2 = aVar;
            }
            if (J(aVar2, L2)) {
                cVar = h0.h(z10, c10);
            } else {
                cVar = h0.f19329f;
            }
        }
        boolean z11 = !cVar.c();
        this.f21488f.w(qVar, 1, -1, (r1) null, 0, (Object) null, aVar.f21518j, this.A, iOException, z11);
        if (z11) {
            this.f21487d.b(aVar.f21509a);
        }
        return cVar;
    }

    public boolean c(long j10) {
        if (this.L || this.f21494l.i() || this.J) {
            return false;
        }
        if (this.f21505w && this.F == 0) {
            return false;
        }
        boolean e10 = this.f21496n.e();
        if (this.f21494l.j()) {
            return e10;
        }
        i0();
        return true;
    }

    public long d(long j10, u3 u3Var) {
        I();
        if (!this.f21508z.f()) {
            return 0;
        }
        b0.a h10 = this.f21508z.h(j10);
        return u3Var.a(j10, h10.f22379a.f22384a, h10.f22380b.f22384a);
    }

    /* access modifiers changed from: package-private */
    public int d0(int i10, s1 s1Var, q2.g gVar, int i11) {
        if (j0()) {
            return -3;
        }
        U(i10);
        int S = this.f21502t[i10].S(s1Var, gVar, i11, this.L);
        if (S == -3) {
            V(i10);
        }
        return S;
    }

    public s2.e0 e(int i10, int i11) {
        return c0(new d(i10, false));
    }

    public void e0() {
        if (this.f21505w) {
            for (p0 R : this.f21502t) {
                R.R();
            }
        }
        this.f21494l.m(this);
        this.f21499q.removeCallbacksAndMessages((Object) null);
        this.f21500r = null;
        this.M = true;
    }

    public long f() {
        long j10;
        I();
        if (this.L || this.F == 0) {
            return Long.MIN_VALUE;
        }
        if (O()) {
            return this.I;
        }
        if (this.f21506x) {
            int length = this.f21502t.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                e eVar = this.f21507y;
                if (eVar.f21528b[i10] && eVar.f21529c[i10] && !this.f21502t[i10].J()) {
                    j10 = Math.min(j10, this.f21502t[i10].z());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = M(false);
        }
        return j10 == Long.MIN_VALUE ? this.H : j10;
    }

    public void g(long j10) {
    }

    public void h(u.a aVar, long j10) {
        this.f21500r = aVar;
        this.f21496n.e();
        i0();
    }

    /* access modifiers changed from: package-private */
    public int h0(int i10, long j10) {
        if (j0()) {
            return 0;
        }
        U(i10);
        p0 p0Var = this.f21502t[i10];
        int E2 = p0Var.E(j10, this.L);
        p0Var.e0(E2);
        if (E2 == 0) {
            V(i10);
        }
        return E2;
    }

    public void i() {
        for (p0 T : this.f21502t) {
            T.T();
        }
        this.f21495m.release();
    }

    public boolean isLoading() {
        return this.f21494l.j() && this.f21496n.d();
    }

    public void j(b0 b0Var) {
        this.f21499q.post(new j0(this, b0Var));
    }

    public void m() throws IOException {
        W();
        if (this.L && !this.f21505w) {
            throw y2.a("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    public long n(long j10) {
        I();
        boolean[] zArr = this.f21507y.f21528b;
        if (!this.f21508z.f()) {
            j10 = 0;
        }
        int i10 = 0;
        this.E = false;
        this.H = j10;
        if (O()) {
            this.I = j10;
            return j10;
        } else if (this.C != 7 && f0(zArr, j10)) {
            return j10;
        } else {
            this.J = false;
            this.I = j10;
            this.L = false;
            if (this.f21494l.j()) {
                p0[] p0VarArr = this.f21502t;
                int length = p0VarArr.length;
                while (i10 < length) {
                    p0VarArr[i10].r();
                    i10++;
                }
                this.f21494l.f();
            } else {
                this.f21494l.g();
                p0[] p0VarArr2 = this.f21502t;
                int length2 = p0VarArr2.length;
                while (i10 < length2) {
                    p0VarArr2[i10].V();
                    i10++;
                }
            }
            return j10;
        }
    }

    public long p(s[] sVarArr, boolean[] zArr, q0[] q0VarArr, boolean[] zArr2, long j10) {
        I();
        e eVar = this.f21507y;
        z0 z0Var = eVar.f21527a;
        boolean[] zArr3 = eVar.f21529c;
        int i10 = this.F;
        int i11 = 0;
        for (int i12 = 0; i12 < sVarArr.length; i12++) {
            if (q0VarArr[i12] != null && (sVarArr[i12] == null || !zArr[i12])) {
                int b10 = q0VarArr[i12].f21523a;
                k4.a.f(zArr3[b10]);
                this.F--;
                zArr3[b10] = false;
                q0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.D ? j10 != 0 : i10 == 0;
        for (int i13 = 0; i13 < sVarArr.length; i13++) {
            if (q0VarArr[i13] == null && sVarArr[i13] != null) {
                s sVar = sVarArr[i13];
                k4.a.f(sVar.length() == 1);
                k4.a.f(sVar.l(0) == 0);
                int c10 = z0Var.c(sVar.a());
                k4.a.f(!zArr3[c10]);
                this.F++;
                zArr3[c10] = true;
                q0VarArr[i13] = new c(c10);
                zArr2[i13] = true;
                if (!z10) {
                    p0 p0Var = this.f21502t[c10];
                    z10 = !p0Var.Z(j10, true) && p0Var.C() != 0;
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            if (this.f21494l.j()) {
                p0[] p0VarArr = this.f21502t;
                int length = p0VarArr.length;
                while (i11 < length) {
                    p0VarArr[i11].r();
                    i11++;
                }
                this.f21494l.f();
            } else {
                p0[] p0VarArr2 = this.f21502t;
                int length2 = p0VarArr2.length;
                while (i11 < length2) {
                    p0VarArr2[i11].V();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = n(j10);
            while (i11 < q0VarArr.length) {
                if (q0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.D = true;
        return j10;
    }

    public void q() {
        this.f21504v = true;
        this.f21499q.post(this.f21497o);
    }

    public long r() {
        if (!this.E) {
            return -9223372036854775807L;
        }
        if (!this.L && L() <= this.K) {
            return -9223372036854775807L;
        }
        this.E = false;
        return this.H;
    }

    public z0 s() {
        I();
        return this.f21507y.f21527a;
    }

    public void t(long j10, boolean z10) {
        I();
        if (!O()) {
            boolean[] zArr = this.f21507y.f21529c;
            int length = this.f21502t.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f21502t[i10].q(j10, z10, zArr[i10]);
            }
        }
    }
}
