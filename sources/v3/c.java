package v3;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.a;
import j4.c0;
import j4.g0;
import j4.h0;
import j4.j0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.n0;
import n2.y2;
import p3.e0;
import p3.q;
import p3.t;
import s6.b0;
import u3.g;
import v3.g;
import v3.h;
import v3.j;
import v3.l;

/* compiled from: DefaultHlsPlaylistTracker */
public final class c implements l, h0.b<j0<i>> {

    /* renamed from: q  reason: collision with root package name */
    public static final l.a f23184q = b.f38874a;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final g f23185a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final k f23186b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final g0 f23187c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<Uri, C0241c> f23188d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final CopyOnWriteArrayList<l.b> f23189f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final double f23190g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public e0.a f23191h;

    /* renamed from: i  reason: collision with root package name */
    private h0 f23192i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public Handler f23193j;

    /* renamed from: k  reason: collision with root package name */
    private l.e f23194k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public h f23195l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public Uri f23196m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public g f23197n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f23198o;

    /* renamed from: p  reason: collision with root package name */
    private long f23199p;

    /* compiled from: DefaultHlsPlaylistTracker */
    private class b implements l.b {
        private b() {
        }

        public void a() {
            c.this.f23189f.remove(this);
        }

        public boolean e(Uri uri, g0.c cVar, boolean z10) {
            C0241c cVar2;
            if (c.this.f23197n == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List<h.b> list = ((h) n0.j(c.this.f23195l)).f23258e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C0241c cVar3 = (C0241c) c.this.f23188d.get(list.get(i11).f23271a);
                    if (cVar3 != null && elapsedRealtime < cVar3.f23208i) {
                        i10++;
                    }
                }
                g0.b a10 = c.this.f23187c.a(new g0.a(1, 0, c.this.f23195l.f23258e.size(), i10), cVar);
                if (!(a10 == null || a10.f19315a != 2 || (cVar2 = (C0241c) c.this.f23188d.get(uri)) == null)) {
                    boolean unused = cVar2.h(a10.f19316b);
                }
            }
            return false;
        }
    }

    /* renamed from: v3.c$c  reason: collision with other inner class name */
    /* compiled from: DefaultHlsPlaylistTracker */
    private final class C0241c implements h0.b<j0<i>> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Uri f23201a;

        /* renamed from: b  reason: collision with root package name */
        private final h0 f23202b = new h0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c  reason: collision with root package name */
        private final j4.l f23203c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public g f23204d;

        /* renamed from: f  reason: collision with root package name */
        private long f23205f;

        /* renamed from: g  reason: collision with root package name */
        private long f23206g;

        /* renamed from: h  reason: collision with root package name */
        private long f23207h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public long f23208i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f23209j;

        /* renamed from: k  reason: collision with root package name */
        private IOException f23210k;

        public C0241c(Uri uri) {
            this.f23201a = uri;
            this.f23203c = c.this.f23185a.a(4);
        }

        /* access modifiers changed from: private */
        public boolean h(long j10) {
            this.f23208i = SystemClock.elapsedRealtime() + j10;
            return this.f23201a.equals(c.this.f23196m) && !c.this.L();
        }

        private Uri i() {
            g gVar = this.f23204d;
            if (gVar != null) {
                g.f fVar = gVar.f23232v;
                if (fVar.f23251a != -9223372036854775807L || fVar.f23255e) {
                    Uri.Builder buildUpon = this.f23201a.buildUpon();
                    g gVar2 = this.f23204d;
                    if (gVar2.f23232v.f23255e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(gVar2.f23221k + ((long) gVar2.f23228r.size())));
                        g gVar3 = this.f23204d;
                        if (gVar3.f23224n != -9223372036854775807L) {
                            List<g.b> list = gVar3.f23229s;
                            int size = list.size();
                            if (!list.isEmpty() && ((g.b) b0.d(list)).f23234n) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    g.f fVar2 = this.f23204d.f23232v;
                    if (fVar2.f23251a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar2.f23252b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f23201a;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(Uri uri) {
            this.f23209j = false;
            q(uri);
        }

        private void q(Uri uri) {
            j0 j0Var = new j0(this.f23203c, uri, 4, c.this.f23186b.a(c.this.f23195l, this.f23204d));
            c.this.f23191h.z(new q(j0Var.f19351a, j0Var.f19352b, this.f23202b.n(j0Var, this, c.this.f23187c.d(j0Var.f19353c))), j0Var.f19353c);
        }

        /* access modifiers changed from: private */
        public void r(Uri uri) {
            this.f23208i = 0;
            if (!this.f23209j && !this.f23202b.j() && !this.f23202b.i()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < this.f23207h) {
                    this.f23209j = true;
                    c.this.f23193j.postDelayed(new d(this, uri), this.f23207h - elapsedRealtime);
                    return;
                }
                q(uri);
            }
        }

        /* access modifiers changed from: private */
        public void w(g gVar, q qVar) {
            boolean z10;
            g gVar2 = this.f23204d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f23205f = elapsedRealtime;
            g t10 = c.this.G(gVar2, gVar);
            this.f23204d = t10;
            boolean z11 = false;
            IOException iOException = null;
            if (t10 != gVar2) {
                this.f23210k = null;
                this.f23206g = elapsedRealtime;
                c.this.R(this.f23201a, t10);
            } else if (!t10.f23225o) {
                g gVar3 = this.f23204d;
                if (gVar.f23221k + ((long) gVar.f23228r.size()) < gVar3.f23221k) {
                    iOException = new l.c(this.f23201a);
                    z10 = true;
                } else {
                    if (((double) (elapsedRealtime - this.f23206g)) > ((double) n0.Z0(gVar3.f23223m)) * c.this.f23190g) {
                        iOException = new l.d(this.f23201a);
                    }
                    z10 = false;
                }
                if (iOException != null) {
                    this.f23210k = iOException;
                    boolean unused = c.this.N(this.f23201a, new g0.c(qVar, new t(4), iOException, 1), z10);
                }
            }
            long j10 = 0;
            g gVar4 = this.f23204d;
            if (!gVar4.f23232v.f23255e) {
                if (gVar4 != gVar2) {
                    j10 = gVar4.f23223m;
                } else {
                    j10 = gVar4.f23223m / 2;
                }
            }
            this.f23207h = elapsedRealtime + n0.Z0(j10);
            if (this.f23204d.f23224n != -9223372036854775807L || this.f23201a.equals(c.this.f23196m)) {
                z11 = true;
            }
            if (z11 && !this.f23204d.f23225o) {
                r(i());
            }
        }

        public g j() {
            return this.f23204d;
        }

        public boolean m() {
            int i10;
            if (this.f23204d == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000, n0.Z0(this.f23204d.f23231u));
            g gVar = this.f23204d;
            if (gVar.f23225o || (i10 = gVar.f23214d) == 2 || i10 == 1 || this.f23205f + max > elapsedRealtime) {
                return true;
            }
            return false;
        }

        public void p() {
            r(this.f23201a);
        }

        public void s() throws IOException {
            this.f23202b.a();
            IOException iOException = this.f23210k;
            if (iOException != null) {
                throw iOException;
            }
        }

        /* renamed from: t */
        public void l(j0<i> j0Var, long j10, long j11, boolean z10) {
            j0<i> j0Var2 = j0Var;
            q qVar = new q(j0Var2.f19351a, j0Var2.f19352b, j0Var.f(), j0Var.d(), j10, j11, j0Var.b());
            c.this.f23187c.b(j0Var2.f19351a);
            c.this.f23191h.q(qVar, 4);
        }

        /* renamed from: u */
        public void k(j0<i> j0Var, long j10, long j11) {
            j0<i> j0Var2 = j0Var;
            i e10 = j0Var.e();
            q qVar = new q(j0Var2.f19351a, j0Var2.f19352b, j0Var.f(), j0Var.d(), j10, j11, j0Var.b());
            if (e10 instanceof g) {
                w((g) e10, qVar);
                c.this.f23191h.t(qVar, 4);
            } else {
                this.f23210k = y2.c("Loaded playlist has unexpected type.", (Throwable) null);
                c.this.f23191h.x(qVar, 4, this.f23210k, true);
            }
            c.this.f23187c.b(j0Var2.f19351a);
        }

        /* renamed from: v */
        public h0.c o(j0<i> j0Var, long j10, long j11, IOException iOException, int i10) {
            h0.c cVar;
            j0<i> j0Var2 = j0Var;
            IOException iOException2 = iOException;
            q qVar = new q(j0Var2.f19351a, j0Var2.f19352b, j0Var.f(), j0Var.d(), j10, j11, j0Var.b());
            boolean z10 = iOException2 instanceof j.a;
            if ((j0Var.f().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = a.e.API_PRIORITY_OTHER;
                if (iOException2 instanceof c0) {
                    i11 = ((c0) iOException2).f19295d;
                }
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f23207h = SystemClock.elapsedRealtime();
                    p();
                    ((e0.a) n0.j(c.this.f23191h)).x(qVar, j0Var2.f19353c, iOException2, true);
                    return h0.f19329f;
                }
            }
            g0.c cVar2 = new g0.c(qVar, new t(j0Var2.f19353c), iOException2, i10);
            if (c.this.N(this.f23201a, cVar2, false)) {
                long c10 = c.this.f23187c.c(cVar2);
                if (c10 != -9223372036854775807L) {
                    cVar = h0.h(false, c10);
                } else {
                    cVar = h0.f19330g;
                }
            } else {
                cVar = h0.f19329f;
            }
            boolean c11 = true ^ cVar.c();
            c.this.f23191h.x(qVar, j0Var2.f19353c, iOException2, c11);
            if (c11) {
                c.this.f23187c.b(j0Var2.f19351a);
            }
            return cVar;
        }

        public void x() {
            this.f23202b.l();
        }
    }

    public c(u3.g gVar, g0 g0Var, k kVar) {
        this(gVar, g0Var, kVar, 3.5d);
    }

    private void E(List<Uri> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f23188d.put(uri, new C0241c(uri));
        }
    }

    private static g.d F(g gVar, g gVar2) {
        int i10 = (int) (gVar2.f23221k - gVar.f23221k);
        List<g.d> list = gVar.f23228r;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public g G(g gVar, g gVar2) {
        if (!gVar2.f(gVar)) {
            return gVar2.f23225o ? gVar.d() : gVar;
        }
        return gVar2.c(I(gVar, gVar2), H(gVar, gVar2));
    }

    private int H(g gVar, g gVar2) {
        g.d F;
        if (gVar2.f23219i) {
            return gVar2.f23220j;
        }
        g gVar3 = this.f23197n;
        int i10 = gVar3 != null ? gVar3.f23220j : 0;
        return (gVar == null || (F = F(gVar, gVar2)) == null) ? i10 : (gVar.f23220j + F.f23243d) - gVar2.f23228r.get(0).f23243d;
    }

    private long I(g gVar, g gVar2) {
        if (gVar2.f23226p) {
            return gVar2.f23218h;
        }
        g gVar3 = this.f23197n;
        long j10 = gVar3 != null ? gVar3.f23218h : 0;
        if (gVar == null) {
            return j10;
        }
        int size = gVar.f23228r.size();
        g.d F = F(gVar, gVar2);
        if (F != null) {
            return gVar.f23218h + F.f23244f;
        }
        return ((long) size) == gVar2.f23221k - gVar.f23221k ? gVar.e() : j10;
    }

    private Uri J(Uri uri) {
        g.c cVar;
        g gVar = this.f23197n;
        if (gVar == null || !gVar.f23232v.f23255e || (cVar = gVar.f23230t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f23236b));
        int i10 = cVar.f23237c;
        if (i10 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return buildUpon.build();
    }

    private boolean K(Uri uri) {
        List<h.b> list = this.f23195l.f23258e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(list.get(i10).f23271a)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public boolean L() {
        List<h.b> list = this.f23195l.f23258e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            C0241c cVar = (C0241c) k4.a.e(this.f23188d.get(list.get(i10).f23271a));
            if (elapsedRealtime > cVar.f23208i) {
                Uri e10 = cVar.f23201a;
                this.f23196m = e10;
                cVar.r(J(e10));
                return true;
            }
        }
        return false;
    }

    private void M(Uri uri) {
        if (!uri.equals(this.f23196m) && K(uri)) {
            g gVar = this.f23197n;
            if (gVar == null || !gVar.f23225o) {
                this.f23196m = uri;
                C0241c cVar = this.f23188d.get(uri);
                g g10 = cVar.f23204d;
                if (g10 == null || !g10.f23225o) {
                    cVar.r(J(uri));
                    return;
                }
                this.f23197n = g10;
                this.f23194k.e(g10);
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean N(Uri uri, g0.c cVar, boolean z10) {
        Iterator<l.b> it = this.f23189f.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !it.next().e(uri, cVar, z10);
        }
        return z11;
    }

    /* access modifiers changed from: private */
    public void R(Uri uri, g gVar) {
        if (uri.equals(this.f23196m)) {
            if (this.f23197n == null) {
                this.f23198o = !gVar.f23225o;
                this.f23199p = gVar.f23218h;
            }
            this.f23197n = gVar;
            this.f23194k.e(gVar);
        }
        Iterator<l.b> it = this.f23189f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* renamed from: O */
    public void l(j0<i> j0Var, long j10, long j11, boolean z10) {
        j0<i> j0Var2 = j0Var;
        q qVar = new q(j0Var2.f19351a, j0Var2.f19352b, j0Var.f(), j0Var.d(), j10, j11, j0Var.b());
        this.f23187c.b(j0Var2.f19351a);
        this.f23191h.q(qVar, 4);
    }

    /* renamed from: P */
    public void k(j0<i> j0Var, long j10, long j11) {
        h hVar;
        j0<i> j0Var2 = j0Var;
        i e10 = j0Var.e();
        boolean z10 = e10 instanceof g;
        if (z10) {
            hVar = h.e(e10.f23277a);
        } else {
            hVar = (h) e10;
        }
        this.f23195l = hVar;
        this.f23196m = hVar.f23258e.get(0).f23271a;
        this.f23189f.add(new b());
        E(hVar.f23257d);
        q qVar = new q(j0Var2.f19351a, j0Var2.f19352b, j0Var.f(), j0Var.d(), j10, j11, j0Var.b());
        C0241c cVar = this.f23188d.get(this.f23196m);
        if (z10) {
            cVar.w((g) e10, qVar);
        } else {
            cVar.p();
        }
        this.f23187c.b(j0Var2.f19351a);
        this.f23191h.t(qVar, 4);
    }

    /* renamed from: Q */
    public h0.c o(j0<i> j0Var, long j10, long j11, IOException iOException, int i10) {
        j0<i> j0Var2 = j0Var;
        IOException iOException2 = iOException;
        q qVar = new q(j0Var2.f19351a, j0Var2.f19352b, j0Var.f(), j0Var.d(), j10, j11, j0Var.b());
        long c10 = this.f23187c.c(new g0.c(qVar, new t(j0Var2.f19353c), iOException2, i10));
        boolean z10 = c10 == -9223372036854775807L;
        this.f23191h.x(qVar, j0Var2.f19353c, iOException2, z10);
        if (z10) {
            this.f23187c.b(j0Var2.f19351a);
        }
        if (z10) {
            return h0.f19330g;
        }
        return h0.h(false, c10);
    }

    public void a(Uri uri, e0.a aVar, l.e eVar) {
        this.f23193j = n0.w();
        this.f23191h = aVar;
        this.f23194k = eVar;
        j0 j0Var = new j0(this.f23185a.a(4), uri, 4, this.f23186b.b());
        k4.a.f(this.f23192i == null);
        h0 h0Var = new h0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f23192i = h0Var;
        aVar.z(new q(j0Var.f19351a, j0Var.f19352b, h0Var.n(j0Var, this, this.f23187c.d(j0Var.f19353c))), j0Var.f19353c);
    }

    public boolean b(Uri uri) {
        return this.f23188d.get(uri).m();
    }

    public void c(l.b bVar) {
        k4.a.e(bVar);
        this.f23189f.add(bVar);
    }

    public void d(Uri uri) throws IOException {
        this.f23188d.get(uri).s();
    }

    public void e(l.b bVar) {
        this.f23189f.remove(bVar);
    }

    public long f() {
        return this.f23199p;
    }

    public boolean g() {
        return this.f23198o;
    }

    public h h() {
        return this.f23195l;
    }

    public boolean i(Uri uri, long j10) {
        C0241c cVar = this.f23188d.get(uri);
        if (cVar != null) {
            return !cVar.h(j10);
        }
        return false;
    }

    public void j() throws IOException {
        h0 h0Var = this.f23192i;
        if (h0Var != null) {
            h0Var.a();
        }
        Uri uri = this.f23196m;
        if (uri != null) {
            d(uri);
        }
    }

    public void m(Uri uri) {
        this.f23188d.get(uri).p();
    }

    public g n(Uri uri, boolean z10) {
        g j10 = this.f23188d.get(uri).j();
        if (j10 != null && z10) {
            M(uri);
        }
        return j10;
    }

    public void stop() {
        this.f23196m = null;
        this.f23197n = null;
        this.f23195l = null;
        this.f23199p = -9223372036854775807L;
        this.f23192i.l();
        this.f23192i = null;
        for (C0241c x10 : this.f23188d.values()) {
            x10.x();
        }
        this.f23193j.removeCallbacksAndMessages((Object) null);
        this.f23193j = null;
        this.f23188d.clear();
    }

    public c(u3.g gVar, g0 g0Var, k kVar, double d10) {
        this.f23185a = gVar;
        this.f23186b = kVar;
        this.f23187c = g0Var;
        this.f23190g = d10;
        this.f23189f = new CopyOnWriteArrayList<>();
        this.f23188d = new HashMap<>();
        this.f23199p = -9223372036854775807L;
    }
}
