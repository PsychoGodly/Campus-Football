package hf;

import com.google.android.gms.common.api.a;
import hf.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Http2Connection */
public final class g implements Closeable {
    /* access modifiers changed from: private */
    public static final ExecutorService A = new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), cf.c.G("OkHttp Http2Connection", true));

    /* renamed from: a  reason: collision with root package name */
    final boolean f33121a;

    /* renamed from: b  reason: collision with root package name */
    final j f33122b;

    /* renamed from: c  reason: collision with root package name */
    final Map<Integer, i> f33123c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    final String f33124d;

    /* renamed from: f  reason: collision with root package name */
    int f33125f;

    /* renamed from: g  reason: collision with root package name */
    int f33126g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f33127h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final ScheduledExecutorService f33128i;

    /* renamed from: j  reason: collision with root package name */
    private final ExecutorService f33129j;

    /* renamed from: k  reason: collision with root package name */
    final l f33130k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public long f33131l = 0;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public long f33132m = 0;

    /* renamed from: n  reason: collision with root package name */
    private long f33133n = 0;

    /* renamed from: o  reason: collision with root package name */
    private long f33134o = 0;

    /* renamed from: p  reason: collision with root package name */
    private long f33135p = 0;

    /* renamed from: q  reason: collision with root package name */
    private long f33136q = 0;

    /* renamed from: r  reason: collision with root package name */
    private long f33137r = 0;

    /* renamed from: s  reason: collision with root package name */
    long f33138s = 0;

    /* renamed from: t  reason: collision with root package name */
    long f33139t;

    /* renamed from: u  reason: collision with root package name */
    m f33140u = new m();

    /* renamed from: v  reason: collision with root package name */
    final m f33141v;

    /* renamed from: w  reason: collision with root package name */
    final Socket f33142w;

    /* renamed from: x  reason: collision with root package name */
    final j f33143x;

    /* renamed from: y  reason: collision with root package name */
    final l f33144y;

    /* renamed from: z  reason: collision with root package name */
    final Set<Integer> f33145z;

    /* compiled from: Http2Connection */
    class a extends cf.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f33146b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f33147c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i10, b bVar) {
            super(str, objArr);
            this.f33146b = i10;
            this.f33147c = bVar;
        }

        public void k() {
            try {
                g.this.d1(this.f33146b, this.f33147c);
            } catch (IOException unused) {
                g.this.e0();
            }
        }
    }

    /* compiled from: Http2Connection */
    class b extends cf.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f33149b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f33150c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i10, long j10) {
            super(str, objArr);
            this.f33149b = i10;
            this.f33150c = j10;
        }

        public void k() {
            try {
                g.this.f33143x.a(this.f33149b, this.f33150c);
            } catch (IOException unused) {
                g.this.e0();
            }
        }
    }

    /* compiled from: Http2Connection */
    class c extends cf.b {
        c(String str, Object... objArr) {
            super(str, objArr);
        }

        public void k() {
            g.this.c1(false, 2, 0);
        }
    }

    /* compiled from: Http2Connection */
    class d extends cf.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f33153b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f33154c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i10, List list) {
            super(str, objArr);
            this.f33153b = i10;
            this.f33154c = list;
        }

        public void k() {
            if (g.this.f33130k.a(this.f33153b, this.f33154c)) {
                try {
                    g.this.f33143x.A(this.f33153b, b.CANCEL);
                    synchronized (g.this) {
                        g.this.f33145z.remove(Integer.valueOf(this.f33153b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* compiled from: Http2Connection */
    class e extends cf.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f33156b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f33157c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f33158d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i10, List list, boolean z10) {
            super(str, objArr);
            this.f33156b = i10;
            this.f33157c = list;
            this.f33158d = z10;
        }

        public void k() {
            boolean b10 = g.this.f33130k.b(this.f33156b, this.f33157c, this.f33158d);
            if (b10) {
                try {
                    g.this.f33143x.A(this.f33156b, b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (b10 || this.f33158d) {
                synchronized (g.this) {
                    g.this.f33145z.remove(Integer.valueOf(this.f33156b));
                }
            }
        }
    }

    /* compiled from: Http2Connection */
    class f extends cf.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f33160b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ lf.c f33161c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f33162d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f33163f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str, Object[] objArr, int i10, lf.c cVar, int i11, boolean z10) {
            super(str, objArr);
            this.f33160b = i10;
            this.f33161c = cVar;
            this.f33162d = i11;
            this.f33163f = z10;
        }

        public void k() {
            try {
                boolean d10 = g.this.f33130k.d(this.f33160b, this.f33161c, this.f33162d, this.f33163f);
                if (d10) {
                    g.this.f33143x.A(this.f33160b, b.CANCEL);
                }
                if (d10 || this.f33163f) {
                    synchronized (g.this) {
                        g.this.f33145z.remove(Integer.valueOf(this.f33160b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: hf.g$g  reason: collision with other inner class name */
    /* compiled from: Http2Connection */
    class C0376g extends cf.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f33165b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f33166c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0376g(String str, Object[] objArr, int i10, b bVar) {
            super(str, objArr);
            this.f33165b = i10;
            this.f33166c = bVar;
        }

        public void k() {
            g.this.f33130k.c(this.f33165b, this.f33166c);
            synchronized (g.this) {
                g.this.f33145z.remove(Integer.valueOf(this.f33165b));
            }
        }
    }

    /* compiled from: Http2Connection */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        Socket f33168a;

        /* renamed from: b  reason: collision with root package name */
        String f33169b;

        /* renamed from: c  reason: collision with root package name */
        lf.e f33170c;

        /* renamed from: d  reason: collision with root package name */
        lf.d f33171d;

        /* renamed from: e  reason: collision with root package name */
        j f33172e = j.f33177a;

        /* renamed from: f  reason: collision with root package name */
        l f33173f = l.f33238a;

        /* renamed from: g  reason: collision with root package name */
        boolean f33174g;

        /* renamed from: h  reason: collision with root package name */
        int f33175h;

        public h(boolean z10) {
            this.f33174g = z10;
        }

        public g a() {
            return new g(this);
        }

        public h b(j jVar) {
            this.f33172e = jVar;
            return this;
        }

        public h c(int i10) {
            this.f33175h = i10;
            return this;
        }

        public h d(Socket socket, String str, lf.e eVar, lf.d dVar) {
            this.f33168a = socket;
            this.f33169b = str;
            this.f33170c = eVar;
            this.f33171d = dVar;
            return this;
        }
    }

    /* compiled from: Http2Connection */
    final class i extends cf.b {
        i() {
            super("OkHttp %s ping", g.this.f33124d);
        }

        public void k() {
            boolean z10;
            synchronized (g.this) {
                if (g.this.f33132m < g.this.f33131l) {
                    z10 = true;
                } else {
                    g.q(g.this);
                    z10 = false;
                }
            }
            if (z10) {
                g.this.e0();
            } else {
                g.this.c1(false, 1, 0);
            }
        }
    }

    /* compiled from: Http2Connection */
    public static abstract class j {

        /* renamed from: a  reason: collision with root package name */
        public static final j f33177a = new a();

        /* compiled from: Http2Connection */
        class a extends j {
            a() {
            }

            public void b(i iVar) throws IOException {
                iVar.f(b.REFUSED_STREAM);
            }
        }

        public void a(g gVar) {
        }

        public abstract void b(i iVar) throws IOException;
    }

    /* compiled from: Http2Connection */
    final class k extends cf.b {

        /* renamed from: b  reason: collision with root package name */
        final boolean f33178b;

        /* renamed from: c  reason: collision with root package name */
        final int f33179c;

        /* renamed from: d  reason: collision with root package name */
        final int f33180d;

        k(boolean z10, int i10, int i11) {
            super("OkHttp %s ping %08x%08x", g.this.f33124d, Integer.valueOf(i10), Integer.valueOf(i11));
            this.f33178b = z10;
            this.f33179c = i10;
            this.f33180d = i11;
        }

        public void k() {
            g.this.c1(this.f33178b, this.f33179c, this.f33180d);
        }
    }

    /* compiled from: Http2Connection */
    class l extends cf.b implements h.b {

        /* renamed from: b  reason: collision with root package name */
        final h f33182b;

        /* compiled from: Http2Connection */
        class a extends cf.b {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ i f33184b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, i iVar) {
                super(str, objArr);
                this.f33184b = iVar;
            }

            public void k() {
                try {
                    g.this.f33122b.b(this.f33184b);
                } catch (IOException e10) {
                    p002if.g l10 = p002if.g.l();
                    l10.s(4, "Http2Connection.Listener failure for " + g.this.f33124d, e10);
                    try {
                        this.f33184b.f(b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* compiled from: Http2Connection */
        class b extends cf.b {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f33186b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ m f33187c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(String str, Object[] objArr, boolean z10, m mVar) {
                super(str, objArr);
                this.f33186b = z10;
                this.f33187c = mVar;
            }

            public void k() {
                l.this.l(this.f33186b, this.f33187c);
            }
        }

        /* compiled from: Http2Connection */
        class c extends cf.b {
            c(String str, Object... objArr) {
                super(str, objArr);
            }

            public void k() {
                g gVar = g.this;
                gVar.f33122b.a(gVar);
            }
        }

        l(h hVar) {
            super("OkHttp %s", g.this.f33124d);
            this.f33182b = hVar;
        }

        public void a(int i10, long j10) {
            if (i10 == 0) {
                synchronized (g.this) {
                    g gVar = g.this;
                    gVar.f33139t += j10;
                    gVar.notifyAll();
                }
                return;
            }
            i g02 = g.this.g0(i10);
            if (g02 != null) {
                synchronized (g02) {
                    g02.c(j10);
                }
            }
        }

        public void b(boolean z10, int i10, int i11) {
            if (z10) {
                synchronized (g.this) {
                    if (i10 == 1) {
                        try {
                            g.j(g.this);
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (i10 == 2) {
                        g.L(g.this);
                    } else if (i10 == 3) {
                        g.R(g.this);
                        g.this.notifyAll();
                    }
                }
                return;
            }
            try {
                g.this.f33128i.execute(new k(true, i10, i11));
            } catch (RejectedExecutionException unused) {
            }
        }

        public void c(boolean z10, int i10, lf.e eVar, int i11) throws IOException {
            if (g.this.E0(i10)) {
                g.this.u0(i10, eVar, i11, z10);
                return;
            }
            i g02 = g.this.g0(i10);
            if (g02 == null) {
                g.this.e1(i10, b.PROTOCOL_ERROR);
                long j10 = (long) i11;
                g.this.a1(j10);
                eVar.skip(j10);
                return;
            }
            g02.o(eVar, i11);
            if (z10) {
                g02.p();
            }
        }

        public void d() {
        }

        public void e(int i10, b bVar) {
            if (g.this.E0(i10)) {
                g.this.C0(i10, bVar);
                return;
            }
            i G0 = g.this.G0(i10);
            if (G0 != null) {
                G0.r(bVar);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
            r0.q(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
            if (r10 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
            r0.p();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void f(boolean r10, int r11, int r12, java.util.List<hf.c> r13) {
            /*
                r9 = this;
                hf.g r12 = hf.g.this
                boolean r12 = r12.E0(r11)
                if (r12 == 0) goto L_0x000e
                hf.g r12 = hf.g.this
                r12.w0(r11, r13, r10)
                return
            L_0x000e:
                hf.g r12 = hf.g.this
                monitor-enter(r12)
                hf.g r0 = hf.g.this     // Catch:{ all -> 0x007b }
                hf.i r0 = r0.g0(r11)     // Catch:{ all -> 0x007b }
                if (r0 != 0) goto L_0x0071
                hf.g r0 = hf.g.this     // Catch:{ all -> 0x007b }
                boolean r0 = r0.f33127h     // Catch:{ all -> 0x007b }
                if (r0 == 0) goto L_0x0023
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                return
            L_0x0023:
                hf.g r0 = hf.g.this     // Catch:{ all -> 0x007b }
                int r1 = r0.f33125f     // Catch:{ all -> 0x007b }
                if (r11 > r1) goto L_0x002b
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                return
            L_0x002b:
                int r1 = r11 % 2
                int r0 = r0.f33126g     // Catch:{ all -> 0x007b }
                r2 = 2
                int r0 = r0 % r2
                if (r1 != r0) goto L_0x0035
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                return
            L_0x0035:
                bf.q r8 = cf.c.H(r13)     // Catch:{ all -> 0x007b }
                hf.i r13 = new hf.i     // Catch:{ all -> 0x007b }
                hf.g r5 = hf.g.this     // Catch:{ all -> 0x007b }
                r6 = 0
                r3 = r13
                r4 = r11
                r7 = r10
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x007b }
                hf.g r10 = hf.g.this     // Catch:{ all -> 0x007b }
                r10.f33125f = r11     // Catch:{ all -> 0x007b }
                java.util.Map<java.lang.Integer, hf.i> r10 = r10.f33123c     // Catch:{ all -> 0x007b }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007b }
                r10.put(r0, r13)     // Catch:{ all -> 0x007b }
                java.util.concurrent.ExecutorService r10 = hf.g.A     // Catch:{ all -> 0x007b }
                hf.g$l$a r0 = new hf.g$l$a     // Catch:{ all -> 0x007b }
                java.lang.String r1 = "OkHttp %s stream %d"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x007b }
                r3 = 0
                hf.g r4 = hf.g.this     // Catch:{ all -> 0x007b }
                java.lang.String r4 = r4.f33124d     // Catch:{ all -> 0x007b }
                r2[r3] = r4     // Catch:{ all -> 0x007b }
                r3 = 1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007b }
                r2[r3] = r11     // Catch:{ all -> 0x007b }
                r0.<init>(r1, r2, r13)     // Catch:{ all -> 0x007b }
                r10.execute(r0)     // Catch:{ all -> 0x007b }
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                return
            L_0x0071:
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                r0.q(r13)
                if (r10 == 0) goto L_0x007a
                r0.p()
            L_0x007a:
                return
            L_0x007b:
                r10 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x007b }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: hf.g.l.f(boolean, int, int, java.util.List):void");
        }

        public void g(int i10, b bVar, lf.f fVar) {
            i[] iVarArr;
            fVar.p();
            synchronized (g.this) {
                iVarArr = (i[]) g.this.f33123c.values().toArray(new i[g.this.f33123c.size()]);
                boolean unused = g.this.f33127h = true;
            }
            for (i iVar : iVarArr) {
                if (iVar.i() > i10 && iVar.l()) {
                    iVar.r(b.REFUSED_STREAM);
                    g.this.G0(iVar.i());
                }
            }
        }

        public void h(int i10, int i11, int i12, boolean z10) {
        }

        public void i(int i10, int i11, List<c> list) {
            g.this.y0(i11, list);
        }

        public void j(boolean z10, m mVar) {
            try {
                g.this.f33128i.execute(new b("OkHttp %s ACK Settings", new Object[]{g.this.f33124d}, z10, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r0 = hf.b.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r4.f33183c.Z(r0, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
            r2 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void k() {
            /*
                r4 = this;
                hf.b r0 = hf.b.INTERNAL_ERROR
                hf.h r1 = r4.f33182b     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                r1.j(r4)     // Catch:{ IOException -> 0x001e, all -> 0x001b }
            L_0x0007:
                hf.h r1 = r4.f33182b     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                r2 = 0
                boolean r1 = r1.i(r2, r4)     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                if (r1 == 0) goto L_0x0011
                goto L_0x0007
            L_0x0011:
                hf.b r1 = hf.b.NO_ERROR     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                hf.b r0 = hf.b.CANCEL     // Catch:{ IOException -> 0x001f }
                hf.g r2 = hf.g.this     // Catch:{ IOException -> 0x0026 }
                r2.Z(r1, r0)     // Catch:{ IOException -> 0x0026 }
                goto L_0x0026
            L_0x001b:
                r2 = move-exception
                r1 = r0
                goto L_0x002d
            L_0x001e:
                r1 = r0
            L_0x001f:
                hf.b r0 = hf.b.PROTOCOL_ERROR     // Catch:{ all -> 0x002c }
                hf.g r1 = hf.g.this     // Catch:{ IOException -> 0x0026 }
                r1.Z(r0, r0)     // Catch:{ IOException -> 0x0026 }
            L_0x0026:
                hf.h r0 = r4.f33182b
                cf.c.g(r0)
                return
            L_0x002c:
                r2 = move-exception
            L_0x002d:
                hf.g r3 = hf.g.this     // Catch:{ IOException -> 0x0032 }
                r3.Z(r1, r0)     // Catch:{ IOException -> 0x0032 }
            L_0x0032:
                hf.h r0 = r4.f33182b
                cf.c.g(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: hf.g.l.k():void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:2|3|7|17|18|19|20|21) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0061 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void l(boolean r6, hf.m r7) {
            /*
                r5 = this;
                hf.g r0 = hf.g.this
                hf.j r0 = r0.f33143x
                monitor-enter(r0)
                hf.g r1 = hf.g.this     // Catch:{ all -> 0x0096 }
                monitor-enter(r1)     // Catch:{ all -> 0x0096 }
                hf.g r2 = hf.g.this     // Catch:{ all -> 0x0093 }
                hf.m r2 = r2.f33141v     // Catch:{ all -> 0x0093 }
                int r2 = r2.d()     // Catch:{ all -> 0x0093 }
                if (r6 == 0) goto L_0x0019
                hf.g r6 = hf.g.this     // Catch:{ all -> 0x0093 }
                hf.m r6 = r6.f33141v     // Catch:{ all -> 0x0093 }
                r6.a()     // Catch:{ all -> 0x0093 }
            L_0x0019:
                hf.g r6 = hf.g.this     // Catch:{ all -> 0x0093 }
                hf.m r6 = r6.f33141v     // Catch:{ all -> 0x0093 }
                r6.h(r7)     // Catch:{ all -> 0x0093 }
                hf.g r6 = hf.g.this     // Catch:{ all -> 0x0093 }
                hf.m r6 = r6.f33141v     // Catch:{ all -> 0x0093 }
                int r6 = r6.d()     // Catch:{ all -> 0x0093 }
                r7 = -1
                r3 = 0
                if (r6 == r7) goto L_0x0054
                if (r6 == r2) goto L_0x0054
                int r6 = r6 - r2
                long r6 = (long) r6     // Catch:{ all -> 0x0093 }
                hf.g r2 = hf.g.this     // Catch:{ all -> 0x0093 }
                java.util.Map<java.lang.Integer, hf.i> r2 = r2.f33123c     // Catch:{ all -> 0x0093 }
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0093 }
                if (r2 != 0) goto L_0x0056
                hf.g r2 = hf.g.this     // Catch:{ all -> 0x0093 }
                java.util.Map<java.lang.Integer, hf.i> r2 = r2.f33123c     // Catch:{ all -> 0x0093 }
                java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0093 }
                hf.g r3 = hf.g.this     // Catch:{ all -> 0x0093 }
                java.util.Map<java.lang.Integer, hf.i> r3 = r3.f33123c     // Catch:{ all -> 0x0093 }
                int r3 = r3.size()     // Catch:{ all -> 0x0093 }
                hf.i[] r3 = new hf.i[r3]     // Catch:{ all -> 0x0093 }
                java.lang.Object[] r2 = r2.toArray(r3)     // Catch:{ all -> 0x0093 }
                hf.i[] r2 = (hf.i[]) r2     // Catch:{ all -> 0x0093 }
                r3 = r2
                goto L_0x0056
            L_0x0054:
                r6 = 0
            L_0x0056:
                monitor-exit(r1)     // Catch:{ all -> 0x0093 }
                hf.g r1 = hf.g.this     // Catch:{ IOException -> 0x0061 }
                hf.j r2 = r1.f33143x     // Catch:{ IOException -> 0x0061 }
                hf.m r1 = r1.f33141v     // Catch:{ IOException -> 0x0061 }
                r2.h(r1)     // Catch:{ IOException -> 0x0061 }
                goto L_0x0066
            L_0x0061:
                hf.g r1 = hf.g.this     // Catch:{ all -> 0x0096 }
                r1.e0()     // Catch:{ all -> 0x0096 }
            L_0x0066:
                monitor-exit(r0)     // Catch:{ all -> 0x0096 }
                r0 = 0
                if (r3 == 0) goto L_0x007b
                int r1 = r3.length
                r2 = 0
            L_0x006c:
                if (r2 >= r1) goto L_0x007b
                r4 = r3[r2]
                monitor-enter(r4)
                r4.c(r6)     // Catch:{ all -> 0x0078 }
                monitor-exit(r4)     // Catch:{ all -> 0x0078 }
                int r2 = r2 + 1
                goto L_0x006c
            L_0x0078:
                r6 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0078 }
                throw r6
            L_0x007b:
                java.util.concurrent.ExecutorService r6 = hf.g.A
                hf.g$l$c r7 = new hf.g$l$c
                java.lang.String r1 = "OkHttp %s settings"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                hf.g r3 = hf.g.this
                java.lang.String r3 = r3.f33124d
                r2[r0] = r3
                r7.<init>(r1, r2)
                r6.execute(r7)
                return
            L_0x0093:
                r6 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0093 }
                throw r6     // Catch:{ all -> 0x0096 }
            L_0x0096:
                r6 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0096 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hf.g.l.l(boolean, hf.m):void");
        }
    }

    static {
        Class<g> cls = g.class;
    }

    g(h hVar) {
        h hVar2 = hVar;
        m mVar = new m();
        this.f33141v = mVar;
        this.f33145z = new LinkedHashSet();
        this.f33130k = hVar2.f33173f;
        boolean z10 = hVar2.f33174g;
        this.f33121a = z10;
        this.f33122b = hVar2.f33172e;
        int i10 = z10 ? 1 : 2;
        this.f33126g = i10;
        if (z10) {
            this.f33126g = i10 + 2;
        }
        if (z10) {
            this.f33140u.i(7, 16777216);
        }
        String str = hVar2.f33169b;
        this.f33124d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, cf.c.G(cf.c.r("OkHttp %s Writer", str), false));
        this.f33128i = scheduledThreadPoolExecutor;
        if (hVar2.f33175h != 0) {
            i iVar = new i();
            int i11 = hVar2.f33175h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, (long) i11, (long) i11, TimeUnit.MILLISECONDS);
        }
        this.f33129j = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), cf.c.G(cf.c.r("OkHttp %s Push Observer", str), true));
        mVar.i(7, 65535);
        mVar.i(5, 16384);
        this.f33139t = (long) mVar.d();
        this.f33142w = hVar2.f33168a;
        this.f33143x = new j(hVar2.f33171d, z10);
        this.f33144y = new l(new h(hVar2.f33170c, z10));
    }

    static /* synthetic */ long L(g gVar) {
        long j10 = gVar.f33134o;
        gVar.f33134o = 1 + j10;
        return j10;
    }

    static /* synthetic */ long R(g gVar) {
        long j10 = gVar.f33136q;
        gVar.f33136q = 1 + j10;
        return j10;
    }

    /* access modifiers changed from: private */
    public void e0() {
        try {
            b bVar = b.PROTOCOL_ERROR;
            Z(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    static /* synthetic */ long j(g gVar) {
        long j10 = gVar.f33132m;
        gVar.f33132m = 1 + j10;
        return j10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private hf.i l0(int r11, java.util.List<hf.c> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            hf.j r7 = r10.f33143x
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0076 }
            int r0 = r10.f33126g     // Catch:{ all -> 0x0073 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            hf.b r0 = hf.b.REFUSED_STREAM     // Catch:{ all -> 0x0073 }
            r10.X0(r0)     // Catch:{ all -> 0x0073 }
        L_0x0013:
            boolean r0 = r10.f33127h     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x006d
            int r8 = r10.f33126g     // Catch:{ all -> 0x0073 }
            int r0 = r8 + 2
            r10.f33126g = r0     // Catch:{ all -> 0x0073 }
            hf.i r9 = new hf.i     // Catch:{ all -> 0x0073 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0073 }
            if (r13 == 0) goto L_0x003a
            long r0 = r10.f33139t     // Catch:{ all -> 0x0073 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003a
            long r0 = r9.f33202b     // Catch:{ all -> 0x0073 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r13 = 0
            goto L_0x003b
        L_0x003a:
            r13 = 1
        L_0x003b:
            boolean r0 = r9.m()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x004a
            java.util.Map<java.lang.Integer, hf.i> r0 = r10.f33123c     // Catch:{ all -> 0x0073 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0073 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0073 }
        L_0x004a:
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            if (r11 != 0) goto L_0x0053
            hf.j r0 = r10.f33143x     // Catch:{ all -> 0x0076 }
            r0.J(r6, r8, r11, r12)     // Catch:{ all -> 0x0076 }
            goto L_0x005c
        L_0x0053:
            boolean r0 = r10.f33121a     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x0065
            hf.j r0 = r10.f33143x     // Catch:{ all -> 0x0076 }
            r0.u(r11, r8, r12)     // Catch:{ all -> 0x0076 }
        L_0x005c:
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            if (r13 == 0) goto L_0x0064
            hf.j r11 = r10.f33143x
            r11.flush()
        L_0x0064:
            return r9
        L_0x0065:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0076 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0076 }
            throw r11     // Catch:{ all -> 0x0076 }
        L_0x006d:
            hf.a r11 = new hf.a     // Catch:{ all -> 0x0073 }
            r11.<init>()     // Catch:{ all -> 0x0073 }
            throw r11     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            throw r11     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.g.l0(int, java.util.List, boolean):hf.i");
    }

    static /* synthetic */ long q(g gVar) {
        long j10 = gVar.f33131l;
        gVar.f33131l = 1 + j10;
        return j10;
    }

    private synchronized void v0(cf.b bVar) {
        if (!this.f33127h) {
            this.f33129j.execute(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void C0(int i10, b bVar) {
        v0(new C0376g("OkHttp %s Push Reset[%s]", new Object[]{this.f33124d, Integer.valueOf(i10)}, i10, bVar));
    }

    /* access modifiers changed from: package-private */
    public boolean E0(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    /* access modifiers changed from: package-private */
    public synchronized i G0(int i10) {
        i remove;
        remove = this.f33123c.remove(Integer.valueOf(i10));
        notifyAll();
        return remove;
    }

    /* access modifiers changed from: package-private */
    public void Q0() {
        synchronized (this) {
            long j10 = this.f33134o;
            long j11 = this.f33133n;
            if (j10 >= j11) {
                this.f33133n = j11 + 1;
                this.f33137r = System.nanoTime() + 1000000000;
                try {
                    this.f33128i.execute(new c("OkHttp %s ping", this.f33124d));
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    public void X0(b bVar) throws IOException {
        synchronized (this.f33143x) {
            synchronized (this) {
                if (!this.f33127h) {
                    this.f33127h = true;
                    int i10 = this.f33125f;
                    this.f33143x.n(i10, bVar, cf.c.f31983a);
                }
            }
        }
    }

    public void Y0() throws IOException {
        Z0(true);
    }

    /* access modifiers changed from: package-private */
    public void Z(b bVar, b bVar2) throws IOException {
        i[] iVarArr = null;
        try {
            X0(bVar);
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        synchronized (this) {
            if (!this.f33123c.isEmpty()) {
                iVarArr = (i[]) this.f33123c.values().toArray(new i[this.f33123c.size()]);
                this.f33123c.clear();
            }
        }
        if (iVarArr != null) {
            for (i f10 : iVarArr) {
                try {
                    f10.f(bVar2);
                } catch (IOException e11) {
                    if (e != null) {
                        e = e11;
                    }
                }
            }
        }
        try {
            this.f33143x.close();
        } catch (IOException e12) {
            if (e == null) {
                e = e12;
            }
        }
        try {
            this.f33142w.close();
        } catch (IOException e13) {
            e = e13;
        }
        this.f33128i.shutdown();
        this.f33129j.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public void Z0(boolean z10) throws IOException {
        if (z10) {
            this.f33143x.H();
            this.f33143x.B(this.f33140u);
            int d10 = this.f33140u.d();
            if (d10 != 65535) {
                this.f33143x.a(0, (long) (d10 - 65535));
            }
        }
        new Thread(this.f33144y).start();
    }

    /* access modifiers changed from: package-private */
    public synchronized void a1(long j10) {
        long j11 = this.f33138s + j10;
        this.f33138s = j11;
        if (j11 >= ((long) (this.f33140u.d() / 2))) {
            f1(0, this.f33138s);
            this.f33138s = 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f33143x.L0());
        r6 = (long) r3;
        r8.f33139t -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b1(int r9, boolean r10, lf.c r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            hf.j r12 = r8.f33143x
            r12.H0(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0067
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f33139t     // Catch:{ InterruptedException -> 0x0058 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, hf.i> r3 = r8.f33123c     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0030:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0056 }
            int r4 = (int) r3     // Catch:{ all -> 0x0056 }
            hf.j r3 = r8.f33143x     // Catch:{ all -> 0x0056 }
            int r3 = r3.L0()     // Catch:{ all -> 0x0056 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0056 }
            long r4 = r8.f33139t     // Catch:{ all -> 0x0056 }
            long r6 = (long) r3     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.f33139t = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            hf.j r4 = r8.f33143x
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            r4.H0(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x0065
        L_0x0058:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0056 }
            r9.interrupt()     // Catch:{ all -> 0x0056 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0056 }
            r9.<init>()     // Catch:{ all -> 0x0056 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x0065:
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r9
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.g.b1(int, boolean, lf.c, long):void");
    }

    /* access modifiers changed from: package-private */
    public void c1(boolean z10, int i10, int i11) {
        try {
            this.f33143x.b(z10, i10, i11);
        } catch (IOException unused) {
            e0();
        }
    }

    public void close() throws IOException {
        Z(b.NO_ERROR, b.CANCEL);
    }

    /* access modifiers changed from: package-private */
    public void d1(int i10, b bVar) throws IOException {
        this.f33143x.A(i10, bVar);
    }

    /* access modifiers changed from: package-private */
    public void e1(int i10, b bVar) {
        try {
            this.f33128i.execute(new a("OkHttp %s stream %d", new Object[]{this.f33124d, Integer.valueOf(i10)}, i10, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void f1(int i10, long j10) {
        try {
            this.f33128i.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f33124d, Integer.valueOf(i10)}, i10, j10));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void flush() throws IOException {
        this.f33143x.flush();
    }

    /* access modifiers changed from: package-private */
    public synchronized i g0(int i10) {
        return this.f33123c.get(Integer.valueOf(i10));
    }

    public synchronized boolean h0(long j10) {
        if (this.f33127h) {
            return false;
        }
        if (this.f33134o >= this.f33133n || j10 < this.f33137r) {
            return true;
        }
        return false;
    }

    public synchronized int i0() {
        return this.f33141v.e(a.e.API_PRIORITY_OTHER);
    }

    public i n0(List<c> list, boolean z10) throws IOException {
        return l0(0, list, z10);
    }

    /* access modifiers changed from: package-private */
    public void u0(int i10, lf.e eVar, int i11, boolean z10) throws IOException {
        lf.c cVar = new lf.c();
        long j10 = (long) i11;
        eVar.O0(j10);
        eVar.P(cVar, j10);
        if (cVar.v0() == j10) {
            v0(new f("OkHttp %s Push Data[%s]", new Object[]{this.f33124d, Integer.valueOf(i10)}, i10, cVar, i11, z10));
            return;
        }
        throw new IOException(cVar.v0() + " != " + i11);
    }

    /* access modifiers changed from: package-private */
    public void w0(int i10, List<c> list, boolean z10) {
        try {
            v0(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f33124d, Integer.valueOf(i10)}, i10, list, z10));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void y0(int i10, List<c> list) {
        synchronized (this) {
            if (this.f33145z.contains(Integer.valueOf(i10))) {
                e1(i10, b.PROTOCOL_ERROR);
                return;
            }
            this.f33145z.add(Integer.valueOf(i10));
            try {
                v0(new d("OkHttp %s Push Request[%s]", new Object[]{this.f33124d, Integer.valueOf(i10)}, i10, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }
}
