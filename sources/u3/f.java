package u3;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import i4.s;
import j4.l;
import j4.p;
import j4.p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k4.l0;
import k4.n0;
import n2.r1;
import n2.u3;
import o2.u1;
import p3.x0;
import r3.n;
import r3.o;
import s6.b0;
import s6.u;
import v3.g;

/* compiled from: HlsChunkSource */
class f {

    /* renamed from: a  reason: collision with root package name */
    private final h f22854a;

    /* renamed from: b  reason: collision with root package name */
    private final l f22855b;

    /* renamed from: c  reason: collision with root package name */
    private final l f22856c;

    /* renamed from: d  reason: collision with root package name */
    private final s f22857d;

    /* renamed from: e  reason: collision with root package name */
    private final Uri[] f22858e;

    /* renamed from: f  reason: collision with root package name */
    private final r1[] f22859f;

    /* renamed from: g  reason: collision with root package name */
    private final v3.l f22860g;

    /* renamed from: h  reason: collision with root package name */
    private final x0 f22861h;

    /* renamed from: i  reason: collision with root package name */
    private final List<r1> f22862i;

    /* renamed from: j  reason: collision with root package name */
    private final e f22863j = new e(4);

    /* renamed from: k  reason: collision with root package name */
    private final u1 f22864k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f22865l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f22866m = n0.f19743f;

    /* renamed from: n  reason: collision with root package name */
    private IOException f22867n;

    /* renamed from: o  reason: collision with root package name */
    private Uri f22868o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f22869p;

    /* renamed from: q  reason: collision with root package name */
    private s f22870q;

    /* renamed from: r  reason: collision with root package name */
    private long f22871r = -9223372036854775807L;

    /* renamed from: s  reason: collision with root package name */
    private boolean f22872s;

    /* compiled from: HlsChunkSource */
    private static final class a extends r3.l {

        /* renamed from: l  reason: collision with root package name */
        private byte[] f22873l;

        public a(l lVar, p pVar, r1 r1Var, int i10, Object obj, byte[] bArr) {
            super(lVar, pVar, 3, r1Var, i10, obj, bArr);
        }

        /* access modifiers changed from: protected */
        public void g(byte[] bArr, int i10) {
            this.f22873l = Arrays.copyOf(bArr, i10);
        }

        public byte[] j() {
            return this.f22873l;
        }
    }

    /* compiled from: HlsChunkSource */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public r3.f f22874a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f22875b;

        /* renamed from: c  reason: collision with root package name */
        public Uri f22876c;

        public b() {
            a();
        }

        public void a() {
            this.f22874a = null;
            this.f22875b = false;
            this.f22876c = null;
        }
    }

    /* compiled from: HlsChunkSource */
    static final class c extends r3.b {

        /* renamed from: e  reason: collision with root package name */
        private final List<g.e> f22877e;

        /* renamed from: f  reason: collision with root package name */
        private final long f22878f;

        /* renamed from: g  reason: collision with root package name */
        private final String f22879g;

        public c(String str, long j10, List<g.e> list) {
            super(0, (long) (list.size() - 1));
            this.f22879g = str;
            this.f22878f = j10;
            this.f22877e = list;
        }

        public long a() {
            c();
            return this.f22878f + this.f22877e.get((int) d()).f23244f;
        }

        public long b() {
            c();
            g.e eVar = this.f22877e.get((int) d());
            return this.f22878f + eVar.f23244f + eVar.f23242c;
        }
    }

    /* compiled from: HlsChunkSource */
    private static final class d extends i4.c {

        /* renamed from: h  reason: collision with root package name */
        private int f22880h;

        public d(x0 x0Var, int[] iArr) {
            super(x0Var, iArr);
            this.f22880h = c(x0Var.b(iArr[0]));
        }

        public int f() {
            return this.f22880h;
        }

        public void k(long j10, long j11, long j12, List<? extends n> list, o[] oVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (h(this.f22880h, elapsedRealtime)) {
                for (int i10 = this.f18957b - 1; i10 >= 0; i10--) {
                    if (!h(i10, elapsedRealtime)) {
                        this.f22880h = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        public int p() {
            return 0;
        }

        public Object r() {
            return null;
        }
    }

    /* compiled from: HlsChunkSource */
    static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final g.e f22881a;

        /* renamed from: b  reason: collision with root package name */
        public final long f22882b;

        /* renamed from: c  reason: collision with root package name */
        public final int f22883c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f22884d;

        public e(g.e eVar, long j10, int i10) {
            this.f22881a = eVar;
            this.f22882b = j10;
            this.f22883c = i10;
            this.f22884d = (eVar instanceof g.b) && ((g.b) eVar).f23234n;
        }
    }

    public f(h hVar, v3.l lVar, Uri[] uriArr, r1[] r1VarArr, g gVar, p0 p0Var, s sVar, List<r1> list, u1 u1Var) {
        this.f22854a = hVar;
        this.f22860g = lVar;
        this.f22858e = uriArr;
        this.f22859f = r1VarArr;
        this.f22857d = sVar;
        this.f22862i = list;
        this.f22864k = u1Var;
        l a10 = gVar.a(1);
        this.f22855b = a10;
        if (p0Var != null) {
            a10.e(p0Var);
        }
        this.f22856c = gVar.a(3);
        this.f22861h = new x0(r1VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((r1VarArr[i10].f20647f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f22870q = new d(this.f22861h, v6.e.l(arrayList));
    }

    private static Uri d(g gVar, g.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f23246h) == null) {
            return null;
        }
        return l0.e(gVar.f23277a, str);
    }

    private Pair<Long, Integer> f(i iVar, boolean z10, g gVar, long j10, long j11) {
        List<g.b> list;
        long j12;
        int i10 = -1;
        if (iVar == null || z10) {
            long j13 = gVar.f23231u + j10;
            if (iVar != null && !this.f22869p) {
                j11 = iVar.f22133g;
            }
            if (!gVar.f23225o && j11 >= j13) {
                return new Pair<>(Long.valueOf(gVar.f23221k + ((long) gVar.f23228r.size())), -1);
            }
            long j14 = j11 - j10;
            int i11 = 0;
            int f10 = n0.f(gVar.f23228r, Long.valueOf(j14), true, !this.f22860g.g() || iVar == null);
            long j15 = ((long) f10) + gVar.f23221k;
            if (f10 >= 0) {
                g.d dVar = gVar.f23228r.get(f10);
                if (j14 < dVar.f23244f + dVar.f23242c) {
                    list = dVar.f23239n;
                } else {
                    list = gVar.f23229s;
                }
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    }
                    g.b bVar = list.get(i11);
                    if (j14 >= bVar.f23244f + bVar.f23242c) {
                        i11++;
                    } else if (bVar.f23233m) {
                        j15 += list == gVar.f23229s ? 1 : 0;
                        i10 = i11;
                    }
                }
            }
            return new Pair<>(Long.valueOf(j15), Integer.valueOf(i10));
        } else if (!iVar.h()) {
            return new Pair<>(Long.valueOf(iVar.f22178j), Integer.valueOf(iVar.f22890o));
        } else {
            if (iVar.f22890o == -1) {
                j12 = iVar.g();
            } else {
                j12 = iVar.f22178j;
            }
            Long valueOf = Long.valueOf(j12);
            int i12 = iVar.f22890o;
            if (i12 != -1) {
                i10 = i12 + 1;
            }
            return new Pair<>(valueOf, Integer.valueOf(i10));
        }
    }

    private static e g(g gVar, long j10, int i10) {
        int i11 = (int) (j10 - gVar.f23221k);
        if (i11 == gVar.f23228r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < gVar.f23229s.size()) {
                return new e(gVar.f23229s.get(i10), j10, i10);
            }
            return null;
        }
        g.d dVar = gVar.f23228r.get(i11);
        if (i10 == -1) {
            return new e(dVar, j10, -1);
        }
        if (i10 < dVar.f23239n.size()) {
            return new e(dVar.f23239n.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < gVar.f23228r.size()) {
            return new e(gVar.f23228r.get(i12), j10 + 1, -1);
        }
        if (!gVar.f23229s.isEmpty()) {
            return new e(gVar.f23229s.get(0), j10 + 1, 0);
        }
        return null;
    }

    static List<g.e> i(g gVar, long j10, int i10) {
        int i11 = (int) (j10 - gVar.f23221k);
        if (i11 < 0 || gVar.f23228r.size() < i11) {
            return u.y();
        }
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        if (i11 < gVar.f23228r.size()) {
            if (i10 != -1) {
                g.d dVar = gVar.f23228r.get(i11);
                if (i10 == 0) {
                    arrayList.add(dVar);
                } else if (i10 < dVar.f23239n.size()) {
                    List<g.b> list = dVar.f23239n;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List<g.d> list2 = gVar.f23228r;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (gVar.f23224n != -9223372036854775807L) {
            if (i10 != -1) {
                i12 = i10;
            }
            if (i12 < gVar.f23229s.size()) {
                List<g.b> list3 = gVar.f23229s;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private r3.f l(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] c10 = this.f22863j.c(uri);
        if (c10 != null) {
            this.f22863j.b(uri, c10);
            return null;
        }
        return new a(this.f22856c, new p.b().i(uri).b(1).a(), this.f22859f[i10], this.f22870q.p(), this.f22870q.r(), this.f22866m);
    }

    private long s(long j10) {
        long j11 = this.f22871r;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private void w(g gVar) {
        long j10;
        if (gVar.f23225o) {
            j10 = -9223372036854775807L;
        } else {
            j10 = gVar.e() - this.f22860g.f();
        }
        this.f22871r = j10;
    }

    public o[] a(i iVar, long j10) {
        int i10;
        i iVar2 = iVar;
        int c10 = iVar2 == null ? -1 : this.f22861h.c(iVar2.f22130d);
        int length = this.f22870q.length();
        o[] oVarArr = new o[length];
        boolean z10 = false;
        int i11 = 0;
        while (i11 < length) {
            int l10 = this.f22870q.l(i11);
            Uri uri = this.f22858e[l10];
            if (!this.f22860g.b(uri)) {
                oVarArr[i11] = o.f22179a;
                i10 = i11;
            } else {
                g n10 = this.f22860g.n(uri, z10);
                k4.a.e(n10);
                long f10 = n10.f23218h - this.f22860g.f();
                i10 = i11;
                Pair<Long, Integer> f11 = f(iVar, l10 != c10, n10, f10, j10);
                oVarArr[i10] = new c(n10.f23277a, f10, i(n10, ((Long) f11.first).longValue(), ((Integer) f11.second).intValue()));
            }
            i11 = i10 + 1;
            z10 = false;
        }
        return oVarArr;
    }

    public long b(long j10, u3 u3Var) {
        int f10 = this.f22870q.f();
        Uri[] uriArr = this.f22858e;
        g n10 = (f10 >= uriArr.length || f10 == -1) ? null : this.f22860g.n(uriArr[this.f22870q.n()], true);
        if (n10 == null || n10.f23228r.isEmpty() || !n10.f23279c) {
            return j10;
        }
        long f11 = n10.f23218h - this.f22860g.f();
        long j11 = j10 - f11;
        int f12 = n0.f(n10.f23228r, Long.valueOf(j11), true, true);
        long j12 = n10.f23228r.get(f12).f23244f;
        return u3Var.a(j11, j12, f12 != n10.f23228r.size() - 1 ? n10.f23228r.get(f12 + 1).f23244f : j12) + f11;
    }

    public int c(i iVar) {
        List<g.b> list;
        if (iVar.f22890o == -1) {
            return 1;
        }
        g gVar = (g) k4.a.e(this.f22860g.n(this.f22858e[this.f22861h.c(iVar.f22130d)], false));
        int i10 = (int) (iVar.f22178j - gVar.f23221k);
        if (i10 < 0) {
            return 1;
        }
        if (i10 < gVar.f23228r.size()) {
            list = gVar.f23228r.get(i10).f23239n;
        } else {
            list = gVar.f23229s;
        }
        if (iVar.f22890o >= list.size()) {
            return 2;
        }
        g.b bVar = list.get(iVar.f22890o);
        if (bVar.f23234n) {
            return 0;
        }
        if (n0.c(Uri.parse(l0.d(gVar.f23277a, bVar.f23240a)), iVar.f22128b.f19387a)) {
            return 1;
        }
        return 2;
    }

    public void e(long j10, long j11, List<i> list, boolean z10, b bVar) {
        int i10;
        long j12;
        Uri uri;
        g gVar;
        int i11;
        long j13 = j11;
        b bVar2 = bVar;
        i iVar = list.isEmpty() ? null : (i) b0.d(list);
        if (iVar == null) {
            i10 = -1;
        } else {
            i10 = this.f22861h.c(iVar.f22130d);
        }
        long j14 = j13 - j10;
        long s10 = s(j10);
        if (iVar != null && !this.f22869p) {
            long d10 = iVar.d();
            j14 = Math.max(0, j14 - d10);
            if (s10 != -9223372036854775807L) {
                s10 = Math.max(0, s10 - d10);
            }
        }
        this.f22870q.k(j10, j14, s10, list, a(iVar, j13));
        int n10 = this.f22870q.n();
        boolean z11 = i10 != n10;
        Uri uri2 = this.f22858e[n10];
        if (!this.f22860g.b(uri2)) {
            bVar2.f22876c = uri2;
            this.f22872s &= uri2.equals(this.f22868o);
            this.f22868o = uri2;
            return;
        }
        g n11 = this.f22860g.n(uri2, true);
        k4.a.e(n11);
        this.f22869p = n11.f23279c;
        w(n11);
        long f10 = n11.f23218h - this.f22860g.f();
        g gVar2 = n11;
        Uri uri3 = uri2;
        int i12 = n10;
        Pair<Long, Integer> f11 = f(iVar, z11, n11, f10, j11);
        long longValue = ((Long) f11.first).longValue();
        int intValue = ((Integer) f11.second).intValue();
        if (longValue >= n11.f23221k || iVar == null || !z11) {
            gVar = n11;
            j12 = f10;
            uri = uri3;
            i11 = i12;
        } else {
            Uri uri4 = this.f22858e[i10];
            g n12 = this.f22860g.n(uri4, true);
            k4.a.e(n12);
            j12 = n12.f23218h - this.f22860g.f();
            Pair<Long, Integer> f12 = f(iVar, false, n12, j12, j11);
            longValue = ((Long) f12.first).longValue();
            intValue = ((Integer) f12.second).intValue();
            i11 = i10;
            uri = uri4;
            gVar = n12;
        }
        if (longValue < gVar.f23221k) {
            this.f22867n = new p3.b();
            return;
        }
        e g10 = g(gVar, longValue, intValue);
        if (g10 == null) {
            if (!gVar.f23225o) {
                bVar2.f22876c = uri;
                this.f22872s &= uri.equals(this.f22868o);
                this.f22868o = uri;
                return;
            } else if (z10 || gVar.f23228r.isEmpty()) {
                bVar2.f22875b = true;
                return;
            } else {
                g10 = new e((g.e) b0.d(gVar.f23228r), (gVar.f23221k + ((long) gVar.f23228r.size())) - 1, -1);
            }
        }
        this.f22872s = false;
        this.f22868o = null;
        Uri d11 = d(gVar, g10.f22881a.f23241b);
        r3.f l10 = l(d11, i11);
        bVar2.f22874a = l10;
        if (l10 == null) {
            Uri d12 = d(gVar, g10.f22881a);
            r3.f l11 = l(d12, i11);
            bVar2.f22874a = l11;
            if (l11 == null) {
                boolean w10 = i.w(iVar, uri, gVar, g10, j12);
                if (!w10 || !g10.f22884d) {
                    bVar2.f22874a = i.j(this.f22854a, this.f22855b, this.f22859f[i11], j12, gVar, g10, uri, this.f22862i, this.f22870q.p(), this.f22870q.r(), this.f22865l, this.f22857d, iVar, this.f22863j.a(d12), this.f22863j.a(d11), w10, this.f22864k);
                }
            }
        }
    }

    public int h(long j10, List<? extends n> list) {
        if (this.f22867n != null || this.f22870q.length() < 2) {
            return list.size();
        }
        return this.f22870q.m(j10, list);
    }

    public x0 j() {
        return this.f22861h;
    }

    public s k() {
        return this.f22870q;
    }

    public boolean m(r3.f fVar, long j10) {
        s sVar = this.f22870q;
        return sVar.g(sVar.u(this.f22861h.c(fVar.f22130d)), j10);
    }

    public void n() throws IOException {
        IOException iOException = this.f22867n;
        if (iOException == null) {
            Uri uri = this.f22868o;
            if (uri != null && this.f22872s) {
                this.f22860g.d(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    public boolean o(Uri uri) {
        return n0.s(this.f22858e, uri);
    }

    public void p(r3.f fVar) {
        if (fVar instanceof a) {
            a aVar = (a) fVar;
            this.f22866m = aVar.h();
            this.f22863j.b(aVar.f22128b.f19387a, (byte[]) k4.a.e(aVar.j()));
        }
    }

    public boolean q(Uri uri, long j10) {
        int u10;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f22858e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            } else if (uriArr[i10].equals(uri)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1 || (u10 = this.f22870q.u(i10)) == -1) {
            return true;
        }
        this.f22872s |= uri.equals(this.f22868o);
        if (j10 == -9223372036854775807L || (this.f22870q.g(u10, j10) && this.f22860g.i(uri, j10))) {
            return true;
        }
        return false;
    }

    public void r() {
        this.f22867n = null;
    }

    public void t(boolean z10) {
        this.f22865l = z10;
    }

    public void u(s sVar) {
        this.f22870q = sVar;
    }

    public boolean v(long j10, r3.f fVar, List<? extends n> list) {
        if (this.f22867n != null) {
            return false;
        }
        return this.f22870q.e(j10, fVar, list);
    }
}
