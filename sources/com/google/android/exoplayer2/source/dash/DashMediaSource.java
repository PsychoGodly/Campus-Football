package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.e;
import com.unity3d.services.UnityAdsConstants;
import j4.g0;
import j4.h0;
import j4.i0;
import j4.j0;
import j4.l;
import j4.p0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.e0;
import k4.n0;
import k4.r;
import n2.c4;
import n2.o1;
import n2.y2;
import n2.z1;
import p3.e0;
import p3.i;
import p3.q;
import p3.t;
import p3.u;
import p3.x;
import r2.b0;
import r2.w;
import r2.y;
import t3.j;
import t3.o;

public final class DashMediaSource extends p3.a {
    private l A;
    /* access modifiers changed from: private */
    public h0 B;
    private p0 C;
    /* access modifiers changed from: private */
    public IOException D;
    private Handler E;
    private z1.g F;
    private Uri G;
    private Uri H;
    private t3.c I;
    private boolean J;
    private long K;
    private long L;
    private long M;
    private int N;
    private long O;
    private int P;

    /* renamed from: i  reason: collision with root package name */
    private final z1 f14199i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f14200j;

    /* renamed from: k  reason: collision with root package name */
    private final l.a f14201k;

    /* renamed from: l  reason: collision with root package name */
    private final a.C0150a f14202l;

    /* renamed from: m  reason: collision with root package name */
    private final i f14203m;

    /* renamed from: n  reason: collision with root package name */
    private final y f14204n;

    /* renamed from: o  reason: collision with root package name */
    private final g0 f14205o;

    /* renamed from: p  reason: collision with root package name */
    private final s3.b f14206p;

    /* renamed from: q  reason: collision with root package name */
    private final long f14207q;

    /* renamed from: r  reason: collision with root package name */
    private final e0.a f14208r;

    /* renamed from: s  reason: collision with root package name */
    private final j0.a<? extends t3.c> f14209s;

    /* renamed from: t  reason: collision with root package name */
    private final e f14210t;

    /* renamed from: u  reason: collision with root package name */
    private final Object f14211u;

    /* renamed from: v  reason: collision with root package name */
    private final SparseArray<b> f14212v;

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f14213w;

    /* renamed from: x  reason: collision with root package name */
    private final Runnable f14214x;

    /* renamed from: y  reason: collision with root package name */
    private final e.b f14215y;

    /* renamed from: z  reason: collision with root package name */
    private final i0 f14216z;

    public static final class Factory implements x.a {

        /* renamed from: a  reason: collision with root package name */
        private final a.C0150a f14217a;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f14218b;

        /* renamed from: c  reason: collision with root package name */
        private b0 f14219c;

        /* renamed from: d  reason: collision with root package name */
        private i f14220d;

        /* renamed from: e  reason: collision with root package name */
        private g0 f14221e;

        /* renamed from: f  reason: collision with root package name */
        private long f14222f;

        /* renamed from: g  reason: collision with root package name */
        private j0.a<? extends t3.c> f14223g;

        public Factory(l.a aVar) {
            this(new c.a(aVar), aVar);
        }

        public DashMediaSource a(z1 z1Var) {
            k4.a.e(z1Var.f20785b);
            j0.a aVar = this.f14223g;
            if (aVar == null) {
                aVar = new t3.d();
            }
            List<o3.c> list = z1Var.f20785b.f20863e;
            return new DashMediaSource(z1Var, (t3.c) null, this.f14218b, !list.isEmpty() ? new o3.b(aVar, list) : aVar, this.f14217a, this.f14220d, this.f14219c.a(z1Var), this.f14221e, this.f14222f, (a) null);
        }

        public Factory(a.C0150a aVar, l.a aVar2) {
            this.f14217a = (a.C0150a) k4.a.e(aVar);
            this.f14218b = aVar2;
            this.f14219c = new r2.l();
            this.f14221e = new j4.x();
            this.f14222f = 30000;
            this.f14220d = new p3.l();
        }
    }

    class a implements e0.b {
        a() {
        }

        public void a(IOException iOException) {
            DashMediaSource.this.a0(iOException);
        }

        public void b() {
            DashMediaSource.this.b0(k4.e0.h());
        }
    }

    private static final class b extends c4 {

        /* renamed from: g  reason: collision with root package name */
        private final long f14225g;

        /* renamed from: h  reason: collision with root package name */
        private final long f14226h;

        /* renamed from: i  reason: collision with root package name */
        private final long f14227i;

        /* renamed from: j  reason: collision with root package name */
        private final int f14228j;

        /* renamed from: k  reason: collision with root package name */
        private final long f14229k;

        /* renamed from: l  reason: collision with root package name */
        private final long f14230l;

        /* renamed from: m  reason: collision with root package name */
        private final long f14231m;

        /* renamed from: n  reason: collision with root package name */
        private final t3.c f14232n;

        /* renamed from: o  reason: collision with root package name */
        private final z1 f14233o;

        /* renamed from: p  reason: collision with root package name */
        private final z1.g f14234p;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, t3.c cVar, z1 z1Var, z1.g gVar) {
            t3.c cVar2 = cVar;
            z1.g gVar2 = gVar;
            k4.a.f(cVar2.f22589d != (gVar2 != null) ? false : true);
            this.f14225g = j10;
            this.f14226h = j11;
            this.f14227i = j12;
            this.f14228j = i10;
            this.f14229k = j13;
            this.f14230l = j14;
            this.f14231m = j15;
            this.f14232n = cVar2;
            this.f14233o = z1Var;
            this.f14234p = gVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
            r4 = r4.f22623c.get(r8).f22578c.get(0).l();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private long w(long r11) {
            /*
                r10 = this;
                long r0 = r10.f14231m
                t3.c r2 = r10.f14232n
                boolean r2 = x(r2)
                if (r2 != 0) goto L_0x000b
                return r0
            L_0x000b:
                r2 = 0
                int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x001e
                long r0 = r0 + r11
                long r11 = r10.f14230l
                int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
                if (r4 <= 0) goto L_0x001e
                r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                return r11
            L_0x001e:
                long r11 = r10.f14229k
                long r11 = r11 + r0
                t3.c r4 = r10.f14232n
                r5 = 0
                long r6 = r4.g(r5)
                r4 = 0
            L_0x0029:
                t3.c r8 = r10.f14232n
                int r8 = r8.e()
                int r8 = r8 + -1
                if (r4 >= r8) goto L_0x0041
                int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r8 < 0) goto L_0x0041
                long r11 = r11 - r6
                int r4 = r4 + 1
                t3.c r6 = r10.f14232n
                long r6 = r6.g(r4)
                goto L_0x0029
            L_0x0041:
                t3.c r8 = r10.f14232n
                t3.g r4 = r8.d(r4)
                r8 = 2
                int r8 = r4.a(r8)
                r9 = -1
                if (r8 != r9) goto L_0x0050
                return r0
            L_0x0050:
                java.util.List<t3.a> r4 = r4.f22623c
                java.lang.Object r4 = r4.get(r8)
                t3.a r4 = (t3.a) r4
                java.util.List<t3.j> r4 = r4.f22578c
                java.lang.Object r4 = r4.get(r5)
                t3.j r4 = (t3.j) r4
                s3.f r4 = r4.l()
                if (r4 == 0) goto L_0x0079
                long r8 = r4.i(r6)
                int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r5 != 0) goto L_0x006f
                goto L_0x0079
            L_0x006f:
                long r2 = r4.f(r11, r6)
                long r2 = r4.a(r2)
                long r0 = r0 + r2
                long r0 = r0 - r11
            L_0x0079:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.b.w(long):long");
        }

        private static boolean x(t3.c cVar) {
            return cVar.f22589d && cVar.f22590e != -9223372036854775807L && cVar.f22587b == -9223372036854775807L;
        }

        public int f(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f14228j) >= 0 && intValue < m()) {
                return intValue;
            }
            return -1;
        }

        public c4.b k(int i10, c4.b bVar, boolean z10) {
            k4.a.c(i10, 0, m());
            Integer num = null;
            String str = z10 ? this.f14232n.d(i10).f22621a : null;
            if (z10) {
                num = Integer.valueOf(this.f14228j + i10);
            }
            return bVar.u(str, num, 0, this.f14232n.g(i10), n0.C0(this.f14232n.d(i10).f22622b - this.f14232n.d(0).f22622b) - this.f14229k);
        }

        public int m() {
            return this.f14232n.e();
        }

        public Object q(int i10) {
            k4.a.c(i10, 0, m());
            return Integer.valueOf(this.f14228j + i10);
        }

        public c4.d s(int i10, c4.d dVar, long j10) {
            k4.a.c(i10, 0, 1);
            long w10 = w(j10);
            Object obj = c4.d.f20227s;
            z1 z1Var = this.f14233o;
            t3.c cVar = this.f14232n;
            return dVar.i(obj, z1Var, cVar, this.f14225g, this.f14226h, this.f14227i, true, x(cVar), this.f14234p, w10, this.f14230l, 0, m() - 1, this.f14229k);
        }

        public int t() {
            return 1;
        }
    }

    private final class c implements e.b {
        private c() {
        }

        public void a() {
            DashMediaSource.this.U();
        }

        public void b(long j10) {
            DashMediaSource.this.T(j10);
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    static final class d implements j0.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        private static final Pattern f14236a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, r6.e.f29803c)).readLine();
            try {
                Matcher matcher = f14236a.matcher(readLine);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    long time = simpleDateFormat.parse(group).getTime();
                    if (!"Z".equals(matcher.group(2))) {
                        long j10 = "+".equals(matcher.group(4)) ? 1 : -1;
                        long parseLong = Long.parseLong(matcher.group(5));
                        String group2 = matcher.group(7);
                        time -= j10 * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0 : Long.parseLong(group2))) * 60) * 1000);
                    }
                    return Long.valueOf(time);
                }
                throw y2.c("Couldn't parse timestamp: " + readLine, (Throwable) null);
            } catch (ParseException e10) {
                throw y2.c((String) null, e10);
            }
        }
    }

    private final class e implements h0.b<j0<t3.c>> {
        private e() {
        }

        /* renamed from: a */
        public void l(j0<t3.c> j0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.V(j0Var, j10, j11);
        }

        /* renamed from: b */
        public void k(j0<t3.c> j0Var, long j10, long j11) {
            DashMediaSource.this.W(j0Var, j10, j11);
        }

        /* renamed from: c */
        public h0.c o(j0<t3.c> j0Var, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.X(j0Var, j10, j11, iOException, i10);
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    final class f implements i0 {
        f() {
        }

        private void b() throws IOException {
            if (DashMediaSource.this.D != null) {
                throw DashMediaSource.this.D;
            }
        }

        public void a() throws IOException {
            DashMediaSource.this.B.a();
            b();
        }
    }

    private final class g implements h0.b<j0<Long>> {
        private g() {
        }

        /* renamed from: a */
        public void l(j0<Long> j0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.V(j0Var, j10, j11);
        }

        /* renamed from: b */
        public void k(j0<Long> j0Var, long j10, long j11) {
            DashMediaSource.this.Y(j0Var, j10, j11);
        }

        /* renamed from: c */
        public h0.c o(j0<Long> j0Var, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.Z(j0Var, j10, j11, iOException);
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    private static final class h implements j0.a<Long> {
        private h() {
        }

        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(n0.J0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        o1.a("goog.exo.dash");
    }

    /* synthetic */ DashMediaSource(z1 z1Var, t3.c cVar, l.a aVar, j0.a aVar2, a.C0150a aVar3, i iVar, y yVar, g0 g0Var, long j10, a aVar4) {
        this(z1Var, cVar, aVar, aVar2, aVar3, iVar, yVar, g0Var, j10);
    }

    private static long L(t3.g gVar, long j10, long j11) {
        t3.g gVar2 = gVar;
        long j12 = j10;
        long j13 = j11;
        long C0 = n0.C0(gVar2.f22622b);
        boolean P2 = P(gVar);
        long j14 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < gVar2.f22623c.size(); i10++) {
            t3.a aVar = gVar2.f22623c.get(i10);
            List<j> list = aVar.f22578c;
            int i11 = aVar.f22577b;
            boolean z10 = true;
            if (i11 == 1 || i11 == 2) {
                z10 = false;
            }
            if ((!P2 || !z10) && !list.isEmpty()) {
                s3.f l10 = list.get(0).l();
                if (l10 == null) {
                    return C0 + j12;
                }
                long j15 = l10.j(j12, j13);
                if (j15 == 0) {
                    return C0;
                }
                long c10 = (l10.c(j12, j13) + j15) - 1;
                j14 = Math.min(j14, l10.b(c10, j12) + l10.a(c10) + C0);
            }
        }
        return j14;
    }

    private static long M(t3.g gVar, long j10, long j11) {
        t3.g gVar2 = gVar;
        long j12 = j10;
        long j13 = j11;
        long C0 = n0.C0(gVar2.f22622b);
        boolean P2 = P(gVar);
        long j14 = C0;
        for (int i10 = 0; i10 < gVar2.f22623c.size(); i10++) {
            t3.a aVar = gVar2.f22623c.get(i10);
            List<j> list = aVar.f22578c;
            int i11 = aVar.f22577b;
            boolean z10 = true;
            if (i11 == 1 || i11 == 2) {
                z10 = false;
            }
            if ((!P2 || !z10) && !list.isEmpty()) {
                s3.f l10 = list.get(0).l();
                if (l10 == null || l10.j(j12, j13) == 0) {
                    return C0;
                }
                j14 = Math.max(j14, l10.a(l10.c(j12, j13)) + C0);
            }
        }
        return j14;
    }

    private static long N(t3.c cVar, long j10) {
        s3.f l10;
        t3.c cVar2 = cVar;
        int e10 = cVar.e() - 1;
        t3.g d10 = cVar2.d(e10);
        long C0 = n0.C0(d10.f22622b);
        long g10 = cVar2.g(e10);
        long C02 = n0.C0(j10);
        long C03 = n0.C0(cVar2.f22586a);
        long C04 = n0.C0(UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS);
        for (int i10 = 0; i10 < d10.f22623c.size(); i10++) {
            List<j> list = d10.f22623c.get(i10).f22578c;
            if (!list.isEmpty() && (l10 = list.get(0).l()) != null) {
                long d11 = ((C03 + C0) + l10.d(g10, C02)) - C02;
                if (d11 < C04 - 100000 || (d11 > C04 && d11 < C04 + 100000)) {
                    C04 = d11;
                }
            }
        }
        return u6.c.b(C04, 1000, RoundingMode.CEILING);
    }

    private long O() {
        return (long) Math.min((this.N - 1) * 1000, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
    }

    private static boolean P(t3.g gVar) {
        for (int i10 = 0; i10 < gVar.f22623c.size(); i10++) {
            int i11 = gVar.f22623c.get(i10).f22577b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean Q(t3.g gVar) {
        for (int i10 = 0; i10 < gVar.f22623c.size(); i10++) {
            s3.f l10 = gVar.f22623c.get(i10).f22578c.get(0).l();
            if (l10 == null || l10.g()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void R() {
        c0(false);
    }

    private void S() {
        k4.e0.j(this.B, new a());
    }

    /* access modifiers changed from: private */
    public void a0(IOException iOException) {
        r.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        c0(true);
    }

    /* access modifiers changed from: private */
    public void b0(long j10) {
        this.M = j10;
        c0(true);
    }

    private void c0(boolean z10) {
        long j10;
        long j11;
        t3.g gVar;
        for (int i10 = 0; i10 < this.f14212v.size(); i10++) {
            int keyAt = this.f14212v.keyAt(i10);
            if (keyAt >= this.P) {
                this.f14212v.valueAt(i10).K(this.I, keyAt - this.P);
            }
        }
        t3.g d10 = this.I.d(0);
        int e10 = this.I.e() - 1;
        t3.g d11 = this.I.d(e10);
        long g10 = this.I.g(e10);
        long C0 = n0.C0(n0.a0(this.M));
        long M2 = M(d10, this.I.g(0), C0);
        long L2 = L(d11, g10, C0);
        boolean z11 = this.I.f22589d && !Q(d11);
        if (z11) {
            long j12 = this.I.f22591f;
            if (j12 != -9223372036854775807L) {
                M2 = Math.max(M2, L2 - n0.C0(j12));
            }
        }
        long j13 = L2 - M2;
        t3.c cVar = this.I;
        t3.g gVar2 = d10;
        if (cVar.f22589d) {
            k4.a.f(cVar.f22586a != -9223372036854775807L);
            long C02 = (C0 - n0.C0(this.I.f22586a)) - M2;
            j0(C02, j13);
            long Z0 = this.I.f22586a + n0.Z0(M2);
            long C03 = C02 - n0.C0(this.F.f20849a);
            long min = Math.min(5000000, j13 / 2);
            j11 = Z0;
            j10 = C03 < min ? min : C03;
            gVar = gVar2;
        } else {
            gVar = gVar2;
            j11 = -9223372036854775807L;
            j10 = 0;
        }
        long C04 = M2 - n0.C0(gVar.f22622b);
        t3.c cVar2 = this.I;
        D(new b(cVar2.f22586a, j11, this.M, this.P, C04, j13, j10, cVar2, this.f14199i, cVar2.f22589d ? this.F : null));
        if (!this.f14200j) {
            this.E.removeCallbacks(this.f14214x);
            if (z11) {
                this.E.postDelayed(this.f14214x, N(this.I, n0.a0(this.M)));
            }
            if (this.J) {
                i0();
            } else if (z10) {
                t3.c cVar3 = this.I;
                if (cVar3.f22589d) {
                    long j14 = cVar3.f22590e;
                    if (j14 != -9223372036854775807L) {
                        if (j14 == 0) {
                            j14 = UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS;
                        }
                        g0(Math.max(0, (this.K + j14) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }

    private void d0(o oVar) {
        String str = oVar.f22676a;
        if (n0.c(str, "urn:mpeg:dash:utc:direct:2014") || n0.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            e0(oVar);
        } else if (n0.c(str, "urn:mpeg:dash:utc:http-iso:2014") || n0.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            f0(oVar, new d());
        } else if (n0.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || n0.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            f0(oVar, new h((a) null));
        } else if (n0.c(str, "urn:mpeg:dash:utc:ntp:2014") || n0.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
            S();
        } else {
            a0(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void e0(o oVar) {
        try {
            b0(n0.J0(oVar.f22677b) - this.L);
        } catch (y2 e10) {
            a0(e10);
        }
    }

    private void f0(o oVar, j0.a<Long> aVar) {
        h0(new j0(this.A, Uri.parse(oVar.f22677b), 5, aVar), new g(this, (a) null), 1);
    }

    private void g0(long j10) {
        this.E.postDelayed(this.f14213w, j10);
    }

    private <T> void h0(j0<T> j0Var, h0.b<j0<T>> bVar, int i10) {
        this.f14208r.z(new q(j0Var.f19351a, j0Var.f19352b, this.B.n(j0Var, bVar, i10)), j0Var.f19353c);
    }

    /* access modifiers changed from: private */
    public void i0() {
        Uri uri;
        this.E.removeCallbacks(this.f14213w);
        if (!this.B.i()) {
            if (this.B.j()) {
                this.J = true;
                return;
            }
            synchronized (this.f14211u) {
                uri = this.G;
            }
            this.J = false;
            h0(new j0(this.A, uri, 4, this.f14209s), this.f14210t, this.f14205o.d(4));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j0(long r18, long r20) {
        /*
            r17 = this;
            r0 = r17
            long r5 = k4.n0.Z0(r18)
            n2.z1 r1 = r0.f14199i
            n2.z1$g r1 = r1.f20787d
            long r1 = r1.f20851c
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x001b
            long r1 = java.lang.Math.min(r5, r1)
        L_0x0019:
            r9 = r1
            goto L_0x002d
        L_0x001b:
            t3.c r1 = r0.I
            t3.l r1 = r1.f22595j
            if (r1 == 0) goto L_0x002c
            long r1 = r1.f22668c
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x002c
            long r1 = java.lang.Math.min(r5, r1)
            goto L_0x0019
        L_0x002c:
            r9 = r5
        L_0x002d:
            long r1 = r18 - r20
            long r1 = k4.n0.Z0(r1)
            r3 = 0
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x003e
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x003e
            r1 = r3
        L_0x003e:
            t3.c r3 = r0.I
            long r3 = r3.f22588c
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x004b
            long r1 = r1 + r3
            long r1 = java.lang.Math.min(r1, r5)
        L_0x004b:
            r3 = r1
            n2.z1 r1 = r0.f14199i
            n2.z1$g r1 = r1.f20787d
            long r1 = r1.f20850b
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x005b
            long r3 = k4.n0.r(r1, r3, r5)
            goto L_0x006b
        L_0x005b:
            t3.c r1 = r0.I
            t3.l r1 = r1.f22595j
            if (r1 == 0) goto L_0x006b
            long r1 = r1.f22667b
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x006b
            long r3 = k4.n0.r(r1, r3, r5)
        L_0x006b:
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0070
            r9 = r3
        L_0x0070:
            n2.z1$g r1 = r0.F
            long r1 = r1.f20849a
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0079
            goto L_0x0090
        L_0x0079:
            t3.c r1 = r0.I
            t3.l r2 = r1.f22595j
            if (r2 == 0) goto L_0x0087
            long r5 = r2.f22666a
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0087
            r1 = r5
            goto L_0x0090
        L_0x0087:
            long r1 = r1.f22592g
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            long r1 = r0.f14207q
        L_0x0090:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0095
            r1 = r3
        L_0x0095:
            int r5 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x00b0
            r1 = 5000000(0x4c4b40, double:2.470328E-317)
            r5 = 2
            long r5 = r20 / r5
            long r1 = java.lang.Math.min(r1, r5)
            long r1 = r18 - r1
            long r11 = k4.n0.Z0(r1)
            r13 = r3
            r15 = r9
            long r1 = k4.n0.r(r11, r13, r15)
        L_0x00b0:
            n2.z1 r5 = r0.f14199i
            n2.z1$g r5 = r5.f20787d
            float r6 = r5.f20852d
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r12 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r12 == 0) goto L_0x00be
            goto L_0x00ca
        L_0x00be:
            t3.c r6 = r0.I
            t3.l r6 = r6.f22595j
            if (r6 == 0) goto L_0x00c7
            float r6 = r6.f22669d
            goto L_0x00ca
        L_0x00c7:
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x00ca:
            float r5 = r5.f20853f
            int r12 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r12 == 0) goto L_0x00d1
            goto L_0x00dd
        L_0x00d1:
            t3.c r5 = r0.I
            t3.l r5 = r5.f22595j
            if (r5 == 0) goto L_0x00da
            float r5 = r5.f22670e
            goto L_0x00dd
        L_0x00da:
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x00dd:
            r12 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x00f7
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x00f7
            t3.c r11 = r0.I
            t3.l r11 = r11.f22595j
            if (r11 == 0) goto L_0x00f3
            long r13 = r11.f22666a
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x00f7
        L_0x00f3:
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x00f7:
            n2.z1$g$a r7 = new n2.z1$g$a
            r7.<init>()
            n2.z1$g$a r1 = r7.k(r1)
            n2.z1$g$a r1 = r1.i(r3)
            n2.z1$g$a r1 = r1.g(r9)
            n2.z1$g$a r1 = r1.j(r6)
            n2.z1$g$a r1 = r1.h(r5)
            n2.z1$g r1 = r1.f()
            r0.F = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.j0(long, long):void");
    }

    /* access modifiers changed from: protected */
    public void C(p0 p0Var) {
        this.C = p0Var;
        this.f14204n.c(Looper.myLooper(), A());
        this.f14204n.a();
        if (this.f14200j) {
            c0(false);
            return;
        }
        this.A = this.f14201k.a();
        this.B = new h0("DashMediaSource");
        this.E = n0.w();
        i0();
    }

    /* access modifiers changed from: protected */
    public void E() {
        this.J = false;
        this.A = null;
        h0 h0Var = this.B;
        if (h0Var != null) {
            h0Var.l();
            this.B = null;
        }
        this.K = 0;
        this.L = 0;
        this.I = this.f14200j ? this.I : null;
        this.G = this.H;
        this.D = null;
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.E = null;
        }
        this.M = -9223372036854775807L;
        this.N = 0;
        this.O = -9223372036854775807L;
        this.P = 0;
        this.f14212v.clear();
        this.f14206p.i();
        this.f14204n.release();
    }

    /* access modifiers changed from: package-private */
    public void T(long j10) {
        long j11 = this.O;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.O = j10;
        }
    }

    /* access modifiers changed from: package-private */
    public void U() {
        this.E.removeCallbacks(this.f14214x);
        i0();
    }

    /* access modifiers changed from: package-private */
    public void V(j0<?> j0Var, long j10, long j11) {
        j0<?> j0Var2 = j0Var;
        q qVar = new q(j0Var2.f19351a, j0Var2.f19352b, j0Var.f(), j0Var.d(), j10, j11, j0Var.b());
        this.f14205o.b(j0Var2.f19351a);
        this.f14208r.q(qVar, j0Var2.f19353c);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void W(j4.j0<t3.c> r19, long r20, long r22) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r14 = r20
            p3.q r12 = new p3.q
            long r3 = r0.f19351a
            j4.p r5 = r0.f19352b
            android.net.Uri r6 = r19.f()
            java.util.Map r7 = r19.d()
            long r16 = r19.b()
            r2 = r12
            r8 = r20
            r10 = r22
            r14 = r12
            r12 = r16
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            j4.g0 r2 = r1.f14205o
            long r3 = r0.f19351a
            r2.b(r3)
            p3.e0$a r2 = r1.f14208r
            int r3 = r0.f19353c
            r2.t(r14, r3)
            java.lang.Object r2 = r19.e()
            t3.c r2 = (t3.c) r2
            t3.c r3 = r1.I
            r4 = 0
            if (r3 != 0) goto L_0x003e
            r3 = 0
            goto L_0x0042
        L_0x003e:
            int r3 = r3.e()
        L_0x0042:
            t3.g r5 = r2.d(r4)
            long r5 = r5.f22622b
            r7 = 0
        L_0x0049:
            if (r7 >= r3) goto L_0x005a
            t3.c r8 = r1.I
            t3.g r8 = r8.d(r7)
            long r8 = r8.f22622b
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x005a
            int r7 = r7 + 1
            goto L_0x0049
        L_0x005a:
            boolean r5 = r2.f22589d
            r6 = 1
            if (r5 == 0) goto L_0x00cd
            int r5 = r3 - r7
            int r8 = r2.e()
            if (r5 <= r8) goto L_0x0070
            java.lang.String r5 = "DashMediaSource"
            java.lang.String r8 = "Loaded out of sync manifest"
            k4.r.i(r5, r8)
        L_0x006e:
            r5 = 1
            goto L_0x00a9
        L_0x0070:
            long r8 = r1.O
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x00a8
            long r10 = r2.f22593h
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x00a8
            java.lang.String r5 = "DashMediaSource"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Loaded stale dynamic manifest: "
            r8.append(r9)
            long r9 = r2.f22593h
            r8.append(r9)
            java.lang.String r9 = ", "
            r8.append(r9)
            long r9 = r1.O
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            k4.r.i(r5, r8)
            goto L_0x006e
        L_0x00a8:
            r5 = 0
        L_0x00a9:
            if (r5 == 0) goto L_0x00cb
            int r2 = r1.N
            int r3 = r2 + 1
            r1.N = r3
            j4.g0 r3 = r1.f14205o
            int r0 = r0.f19353c
            int r0 = r3.d(r0)
            if (r2 >= r0) goto L_0x00c3
            long r2 = r18.O()
            r1.g0(r2)
            goto L_0x00ca
        L_0x00c3:
            s3.c r0 = new s3.c
            r0.<init>()
            r1.D = r0
        L_0x00ca:
            return
        L_0x00cb:
            r1.N = r4
        L_0x00cd:
            r1.I = r2
            boolean r5 = r1.J
            boolean r2 = r2.f22589d
            r2 = r2 & r5
            r1.J = r2
            r8 = r20
            long r10 = r8 - r22
            r1.K = r10
            r1.L = r8
            java.lang.Object r2 = r1.f14211u
            monitor-enter(r2)
            j4.p r5 = r0.f19352b     // Catch:{ all -> 0x011b }
            android.net.Uri r5 = r5.f19387a     // Catch:{ all -> 0x011b }
            android.net.Uri r8 = r1.G     // Catch:{ all -> 0x011b }
            if (r5 != r8) goto L_0x00ea
            r4 = 1
        L_0x00ea:
            if (r4 == 0) goto L_0x00f9
            t3.c r4 = r1.I     // Catch:{ all -> 0x011b }
            android.net.Uri r4 = r4.f22596k     // Catch:{ all -> 0x011b }
            if (r4 == 0) goto L_0x00f3
            goto L_0x00f7
        L_0x00f3:
            android.net.Uri r4 = r19.f()     // Catch:{ all -> 0x011b }
        L_0x00f7:
            r1.G = r4     // Catch:{ all -> 0x011b }
        L_0x00f9:
            monitor-exit(r2)     // Catch:{ all -> 0x011b }
            if (r3 != 0) goto L_0x0112
            t3.c r0 = r1.I
            boolean r2 = r0.f22589d
            if (r2 == 0) goto L_0x010e
            t3.o r0 = r0.f22594i
            if (r0 == 0) goto L_0x010a
            r1.d0(r0)
            goto L_0x011a
        L_0x010a:
            r18.S()
            goto L_0x011a
        L_0x010e:
            r1.c0(r6)
            goto L_0x011a
        L_0x0112:
            int r0 = r1.P
            int r0 = r0 + r7
            r1.P = r0
            r1.c0(r6)
        L_0x011a:
            return
        L_0x011b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x011b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.W(j4.j0, long, long):void");
    }

    /* access modifiers changed from: package-private */
    public h0.c X(j0<t3.c> j0Var, long j10, long j11, IOException iOException, int i10) {
        h0.c cVar;
        j0<t3.c> j0Var2 = j0Var;
        IOException iOException2 = iOException;
        q qVar = new q(j0Var2.f19351a, j0Var2.f19352b, j0Var.f(), j0Var.d(), j10, j11, j0Var.b());
        long c10 = this.f14205o.c(new g0.c(qVar, new t(j0Var2.f19353c), iOException2, i10));
        if (c10 == -9223372036854775807L) {
            cVar = h0.f19330g;
        } else {
            cVar = h0.h(false, c10);
        }
        boolean z10 = !cVar.c();
        this.f14208r.x(qVar, j0Var2.f19353c, iOException2, z10);
        if (z10) {
            this.f14205o.b(j0Var2.f19351a);
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public void Y(j0<Long> j0Var, long j10, long j11) {
        j0<Long> j0Var2 = j0Var;
        q qVar = new q(j0Var2.f19351a, j0Var2.f19352b, j0Var.f(), j0Var.d(), j10, j11, j0Var.b());
        this.f14205o.b(j0Var2.f19351a);
        this.f14208r.t(qVar, j0Var2.f19353c);
        b0(j0Var.e().longValue() - j10);
    }

    /* access modifiers changed from: package-private */
    public h0.c Z(j0<Long> j0Var, long j10, long j11, IOException iOException) {
        j0<Long> j0Var2 = j0Var;
        IOException iOException2 = iOException;
        e0.a aVar = this.f14208r;
        q qVar = r4;
        q qVar2 = new q(j0Var2.f19351a, j0Var2.f19352b, j0Var.f(), j0Var.d(), j10, j11, j0Var.b());
        aVar.x(qVar, j0Var2.f19353c, iOException2, true);
        this.f14205o.b(j0Var2.f19351a);
        a0(iOException2);
        return h0.f19329f;
    }

    public u a(x.b bVar, j4.b bVar2, long j10) {
        x.b bVar3 = bVar;
        int intValue = ((Integer) bVar3.f21677a).intValue() - this.P;
        int i10 = intValue;
        e0.a x10 = x(bVar3, this.I.d(intValue).f22622b);
        w.a u10 = u(bVar);
        b bVar4 = r2;
        b bVar5 = new b(intValue + this.P, this.I, this.f14206p, i10, this.f14202l, this.C, this.f14204n, u10, this.f14205o, x10, this.M, this.f14216z, bVar2, this.f14203m, this.f14215y, A());
        b bVar6 = bVar4;
        this.f14212v.put(bVar6.f14241a, bVar6);
        return bVar6;
    }

    public void b(u uVar) {
        b bVar = (b) uVar;
        bVar.G();
        this.f14212v.remove(bVar.f14241a);
    }

    public z1 g() {
        return this.f14199i;
    }

    public void h() throws IOException {
        this.f14216z.a();
    }

    private DashMediaSource(z1 z1Var, t3.c cVar, l.a aVar, j0.a<? extends t3.c> aVar2, a.C0150a aVar3, i iVar, y yVar, g0 g0Var, long j10) {
        this.f14199i = z1Var;
        this.F = z1Var.f20787d;
        this.G = ((z1.h) k4.a.e(z1Var.f20785b)).f20859a;
        this.H = z1Var.f20785b.f20859a;
        this.I = cVar;
        this.f14201k = aVar;
        this.f14209s = aVar2;
        this.f14202l = aVar3;
        this.f14204n = yVar;
        this.f14205o = g0Var;
        this.f14207q = j10;
        this.f14203m = iVar;
        this.f14206p = new s3.b();
        boolean z10 = cVar != null;
        this.f14200j = z10;
        this.f14208r = w((x.b) null);
        this.f14211u = new Object();
        this.f14212v = new SparseArray<>();
        this.f14215y = new c(this, (a) null);
        this.O = -9223372036854775807L;
        this.M = -9223372036854775807L;
        if (z10) {
            k4.a.f(true ^ cVar.f22589d);
            this.f14210t = null;
            this.f14213w = null;
            this.f14214x = null;
            this.f14216z = new i0.a();
            return;
        }
        this.f14210t = new e(this, (a) null);
        this.f14216z = new f();
        this.f14213w = new s3.d(this);
        this.f14214x = new s3.e(this);
    }
}
