package fd;

import com.google.android.gms.common.api.a;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import dd.b0;
import dd.c0;
import dd.d0;
import dd.h1;
import dd.j0;
import dd.j1;
import dd.k;
import dd.y0;
import dd.z0;
import fd.b;
import fd.f;
import fd.h;
import fd.j;
import fd.q;
import hd.b;
import hd.g;
import hd.j;
import id.a;
import id.b;
import io.grpc.internal.c1;
import io.grpc.internal.d2;
import io.grpc.internal.i2;
import io.grpc.internal.k1;
import io.grpc.internal.o2;
import io.grpc.internal.q0;
import io.grpc.internal.r;
import io.grpc.internal.r0;
import io.grpc.internal.v;
import io.grpc.internal.v0;
import io.grpc.internal.w0;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import lf.f;
import lf.l;
import lf.s;
import r6.o;
import r6.t;
import w6.h;

/* compiled from: OkHttpClientTransport */
class i implements v, b.a, q.d {
    private static final Map<hd.a, j1> W = Q();
    /* access modifiers changed from: private */
    public static final Logger X = Logger.getLogger(i.class.getName());
    /* access modifiers changed from: private */
    public final SocketFactory A;
    /* access modifiers changed from: private */
    public SSLSocketFactory B;
    /* access modifiers changed from: private */
    public HostnameVerifier C;
    /* access modifiers changed from: private */
    public Socket D;
    /* access modifiers changed from: private */
    public int E;
    private final Deque<h> F;
    /* access modifiers changed from: private */
    public final gd.b G;
    /* access modifiers changed from: private */
    public c1 H;
    private boolean I;
    private long J;
    private long K;
    private boolean L;
    /* access modifiers changed from: private */
    public final Runnable M;
    /* access modifiers changed from: private */
    public final int N;
    private final boolean O;
    private final o2 P;
    private final w0<h> Q;
    /* access modifiers changed from: private */
    public d0.b R;
    final c0 S;
    int T;
    Runnable U;
    h<Void> V;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final InetSocketAddress f32686a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32687b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32688c;

    /* renamed from: d  reason: collision with root package name */
    private final Random f32689d;

    /* renamed from: e  reason: collision with root package name */
    private final r6.v<t> f32690e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final int f32691f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final j f32692g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public k1.a f32693h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public b f32694i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public q f32695j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final Object f32696k;

    /* renamed from: l  reason: collision with root package name */
    private final j0 f32697l;

    /* renamed from: m  reason: collision with root package name */
    private int f32698m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Map<Integer, h> f32699n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Executor f32700o;

    /* renamed from: p  reason: collision with root package name */
    private final d2 f32701p;

    /* renamed from: q  reason: collision with root package name */
    private final ScheduledExecutorService f32702q;

    /* renamed from: r  reason: collision with root package name */
    private final int f32703r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public int f32704s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public e f32705t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public dd.a f32706u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public j1 f32707v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f32708w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public v0 f32709x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f32710y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f32711z;

    /* compiled from: OkHttpClientTransport */
    class a extends w0<h> {
        a() {
        }

        /* access modifiers changed from: protected */
        public void b() {
            i.this.f32693h.d(true);
        }

        /* access modifiers changed from: protected */
        public void c() {
            i.this.f32693h.d(false);
        }
    }

    /* compiled from: OkHttpClientTransport */
    class b implements o2.c {
        b() {
        }
    }

    /* compiled from: OkHttpClientTransport */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f32714a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f32715b;

        /* compiled from: OkHttpClientTransport */
        class a implements s {
            a() {
            }

            public long P(lf.c cVar, long j10) {
                return -1;
            }

            public void close() {
            }

            public lf.t e() {
                return lf.t.f36294d;
            }
        }

        c(CountDownLatch countDownLatch, a aVar) {
            this.f32714a = countDownLatch;
            this.f32715b = aVar;
        }

        public void run() {
            i iVar;
            e eVar;
            Socket M;
            try {
                this.f32714a.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            lf.e b10 = l.b(new a());
            SSLSession sSLSession = null;
            try {
                i iVar2 = i.this;
                c0 c0Var = iVar2.S;
                if (c0Var == null) {
                    M = iVar2.A.createSocket(i.this.f32686a.getAddress(), i.this.f32686a.getPort());
                } else if (c0Var.b() instanceof InetSocketAddress) {
                    i iVar3 = i.this;
                    M = iVar3.S(iVar3.S.c(), (InetSocketAddress) i.this.S.b(), i.this.S.d(), i.this.S.a());
                } else {
                    j1 j1Var = j1.f32247t;
                    throw j1Var.q("Unsupported SocketAddress implementation " + i.this.S.b().getClass()).c();
                }
                Socket socket = M;
                SSLSocket sSLSocket = socket;
                if (i.this.B != null) {
                    SSLSocket b11 = n.b(i.this.B, i.this.C, socket, i.this.W(), i.this.X(), i.this.G);
                    sSLSession = b11.getSession();
                    sSLSocket = b11;
                }
                sSLSocket.setTcpNoDelay(true);
                lf.e b12 = l.b(l.j(sSLSocket));
                this.f32715b.R(l.g(sSLSocket), sSLSocket);
                i iVar4 = i.this;
                dd.a unused2 = iVar4.f32706u = iVar4.f32706u.d().d(b0.f32141a, sSLSocket.getRemoteSocketAddress()).d(b0.f32142b, sSLSocket.getLocalSocketAddress()).d(b0.f32143c, sSLSession).d(q0.f35282a, sSLSession == null ? h1.NONE : h1.PRIVACY_AND_INTEGRITY).a();
                i iVar5 = i.this;
                e unused3 = iVar5.f32705t = new e(iVar5.f32692g.b(b12, true));
                synchronized (i.this.f32696k) {
                    Socket unused4 = i.this.D = (Socket) o.p(sSLSocket, "socket");
                    if (sSLSession != null) {
                        d0.b unused5 = i.this.R = new d0.b(new d0.c(sSLSession));
                    }
                }
                return;
            } catch (dd.k1 e10) {
                i.this.k0(0, hd.a.INTERNAL_ERROR, e10.a());
                iVar = i.this;
                eVar = new e(iVar.f32692g.b(b10, true));
            } catch (Exception e11) {
                i.this.f(e11);
                iVar = i.this;
                eVar = new e(iVar.f32692g.b(b10, true));
            } catch (Throwable th) {
                i iVar6 = i.this;
                e unused6 = iVar6.f32705t = new e(iVar6.f32692g.b(b10, true));
                throw th;
            }
            e unused7 = iVar.f32705t = eVar;
        }
    }

    /* compiled from: OkHttpClientTransport */
    class d implements Runnable {
        d() {
        }

        public void run() {
            Runnable runnable = i.this.U;
            if (runnable != null) {
                runnable.run();
            }
            i.this.f32700o.execute(i.this.f32705t);
            synchronized (i.this.f32696k) {
                int unused = i.this.E = a.e.API_PRIORITY_OTHER;
                boolean unused2 = i.this.l0();
            }
            h<Void> hVar = i.this.V;
        }
    }

    /* compiled from: OkHttpClientTransport */
    class e implements b.a, Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final j f32719a = new j(Level.FINE, (Class<?>) i.class);

        /* renamed from: b  reason: collision with root package name */
        hd.b f32720b;

        /* renamed from: c  reason: collision with root package name */
        boolean f32721c = true;

        e(hd.b bVar) {
            this.f32720b = bVar;
        }

        private int e(List<hd.d> list) {
            long j10 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                hd.d dVar = list.get(i10);
                j10 += (long) (dVar.f33004a.p() + 32 + dVar.f33005b.p());
            }
            return (int) Math.min(j10, 2147483647L);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
            if (r0 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
            r9 = r7.f32722d;
            r10 = hd.a.PROTOCOL_ERROR;
            fd.i.A(r9, r10, "Received window_update for unknown stream: " + r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(int r8, long r9) {
            /*
                r7 = this;
                fd.j r0 = r7.f32719a
                fd.j$a r1 = fd.j.a.INBOUND
                r0.k(r1, r8, r9)
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x002c
                java.lang.String r9 = "Received 0 flow control window increment."
                if (r8 != 0) goto L_0x0019
                fd.i r8 = fd.i.this
                hd.a r10 = hd.a.PROTOCOL_ERROR
                r8.f0(r10, r9)
                goto L_0x002b
            L_0x0019:
                fd.i r0 = fd.i.this
                dd.j1 r10 = dd.j1.f32247t
                dd.j1 r2 = r10.q(r9)
                io.grpc.internal.r$a r3 = io.grpc.internal.r.a.PROCESSED
                r4 = 0
                hd.a r5 = hd.a.PROTOCOL_ERROR
                r6 = 0
                r1 = r8
                r0.U(r1, r2, r3, r4, r5, r6)
            L_0x002b:
                return
            L_0x002c:
                r0 = 0
                fd.i r1 = fd.i.this
                java.lang.Object r1 = r1.f32696k
                monitor-enter(r1)
                if (r8 != 0) goto L_0x0043
                fd.i r8 = fd.i.this     // Catch:{ all -> 0x008d }
                fd.q r8 = r8.f32695j     // Catch:{ all -> 0x008d }
                r0 = 0
                int r10 = (int) r9     // Catch:{ all -> 0x008d }
                r8.g(r0, r10)     // Catch:{ all -> 0x008d }
                monitor-exit(r1)     // Catch:{ all -> 0x008d }
                return
            L_0x0043:
                fd.i r2 = fd.i.this     // Catch:{ all -> 0x008d }
                java.util.Map r2 = r2.f32699n     // Catch:{ all -> 0x008d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008d }
                java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x008d }
                fd.h r2 = (fd.h) r2     // Catch:{ all -> 0x008d }
                if (r2 == 0) goto L_0x0068
                fd.i r3 = fd.i.this     // Catch:{ all -> 0x008d }
                fd.q r3 = r3.f32695j     // Catch:{ all -> 0x008d }
                fd.h$b r2 = r2.y()     // Catch:{ all -> 0x008d }
                fd.q$c r2 = r2.b0()     // Catch:{ all -> 0x008d }
                int r10 = (int) r9     // Catch:{ all -> 0x008d }
                r3.g(r2, r10)     // Catch:{ all -> 0x008d }
                goto L_0x0071
            L_0x0068:
                fd.i r9 = fd.i.this     // Catch:{ all -> 0x008d }
                boolean r9 = r9.c0(r8)     // Catch:{ all -> 0x008d }
                if (r9 != 0) goto L_0x0071
                r0 = 1
            L_0x0071:
                monitor-exit(r1)     // Catch:{ all -> 0x008d }
                if (r0 == 0) goto L_0x008c
                fd.i r9 = fd.i.this
                hd.a r10 = hd.a.PROTOCOL_ERROR
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Received window_update for unknown stream: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                r9.f0(r10, r8)
            L_0x008c:
                return
            L_0x008d:
                r8 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x008d }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: fd.i.e.a(int, long):void");
        }

        public void b(boolean z10, int i10, int i11) {
            v0 v0Var;
            long j10 = (((long) i10) << 32) | (((long) i11) & 4294967295L);
            this.f32719a.e(j.a.INBOUND, j10);
            if (!z10) {
                synchronized (i.this.f32696k) {
                    i.this.f32694i.b(true, i10, i11);
                }
                return;
            }
            synchronized (i.this.f32696k) {
                v0Var = null;
                if (i.this.f32709x == null) {
                    i.X.warning("Received unexpected ping ack. No ping outstanding");
                } else if (i.this.f32709x.h() == j10) {
                    v0 G = i.this.f32709x;
                    v0 unused = i.this.f32709x = null;
                    v0Var = G;
                } else {
                    i.X.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", new Object[]{Long.valueOf(i.this.f32709x.h()), Long.valueOf(j10)}));
                }
            }
            if (v0Var != null) {
                v0Var.d();
            }
        }

        public void c(boolean z10, int i10, lf.e eVar, int i11) throws IOException {
            this.f32719a.b(j.a.INBOUND, i10, eVar.E(), i11, z10);
            h Z = i.this.Z(i10);
            if (Z != null) {
                long j10 = (long) i11;
                eVar.O0(j10);
                lf.c cVar = new lf.c();
                cVar.V0(eVar.E(), j10);
                md.c.c("OkHttpClientTransport$ClientFrameHandler.data", Z.y().h0());
                synchronized (i.this.f32696k) {
                    Z.y().i0(cVar, z10);
                }
            } else if (i.this.c0(i10)) {
                synchronized (i.this.f32696k) {
                    i.this.f32694i.g(i10, hd.a.STREAM_CLOSED);
                }
                eVar.skip((long) i11);
            } else {
                i iVar = i.this;
                hd.a aVar = hd.a.PROTOCOL_ERROR;
                iVar.f0(aVar, "Received data for unknown stream: " + i10);
                return;
            }
            i.D(i.this, i11);
            if (((float) i.this.f32704s) >= ((float) i.this.f32691f) * 0.5f) {
                synchronized (i.this.f32696k) {
                    i.this.f32694i.a(0, (long) i.this.f32704s);
                }
                int unused = i.this.f32704s = 0;
            }
        }

        public void d() {
        }

        public void g(int i10, hd.a aVar) {
            this.f32719a.h(j.a.INBOUND, i10, aVar);
            j1 e10 = i.p0(aVar).e("Rst Stream");
            boolean z10 = e10.m() == j1.b.CANCELLED || e10.m() == j1.b.DEADLINE_EXCEEDED;
            synchronized (i.this.f32696k) {
                h hVar = (h) i.this.f32699n.get(Integer.valueOf(i10));
                if (hVar != null) {
                    md.c.c("OkHttpClientTransport$ClientFrameHandler.rstStream", hVar.y().h0());
                    i.this.U(i10, e10, aVar == hd.a.REFUSED_STREAM ? r.a.REFUSED : r.a.PROCESSED, z10, (hd.a) null, (y0) null);
                }
            }
        }

        public void h(int i10, int i11, int i12, boolean z10) {
        }

        public void i(int i10, int i11, List<hd.d> list) throws IOException {
            this.f32719a.g(j.a.INBOUND, i10, i11, list);
            synchronized (i.this.f32696k) {
                i.this.f32694i.g(i10, hd.a.PROTOCOL_ERROR);
            }
        }

        public void j(boolean z10, boolean z11, int i10, int i11, List<hd.d> list, hd.e eVar) {
            j1 j1Var;
            int e10;
            this.f32719a.d(j.a.INBOUND, i10, list, z11);
            boolean z12 = true;
            if (i.this.N == Integer.MAX_VALUE || (e10 = e(list)) <= i.this.N) {
                j1Var = null;
            } else {
                j1 j1Var2 = j1.f32242o;
                Locale locale = Locale.US;
                Object[] objArr = new Object[3];
                objArr[0] = z11 ? "trailer" : "header";
                objArr[1] = Integer.valueOf(i.this.N);
                objArr[2] = Integer.valueOf(e10);
                j1Var = j1Var2.q(String.format(locale, "Response %s metadata larger than %d: %d", objArr));
            }
            synchronized (i.this.f32696k) {
                h hVar = (h) i.this.f32699n.get(Integer.valueOf(i10));
                if (hVar == null) {
                    if (i.this.c0(i10)) {
                        i.this.f32694i.g(i10, hd.a.STREAM_CLOSED);
                    }
                } else if (j1Var == null) {
                    md.c.c("OkHttpClientTransport$ClientFrameHandler.headers", hVar.y().h0());
                    hVar.y().j0(list, z11);
                } else {
                    if (!z11) {
                        i.this.f32694i.g(i10, hd.a.CANCEL);
                    }
                    hVar.y().N(j1Var, false, new y0());
                }
                z12 = false;
            }
            if (z12) {
                i iVar = i.this;
                hd.a aVar = hd.a.PROTOCOL_ERROR;
                iVar.f0(aVar, "Received header for unknown stream: " + i10);
            }
        }

        public void k(int i10, hd.a aVar, f fVar) {
            this.f32719a.c(j.a.INBOUND, i10, aVar, fVar);
            if (aVar == hd.a.ENHANCE_YOUR_CALM) {
                String u10 = fVar.u();
                i.X.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", new Object[]{this, u10}));
                if ("too_many_pings".equals(u10)) {
                    i.this.M.run();
                }
            }
            j1 e10 = r0.h.f((long) aVar.f32994a).e("Received Goaway");
            if (fVar.p() > 0) {
                e10 = e10.e(fVar.u());
            }
            i.this.k0(i10, (hd.a) null, e10);
        }

        public void l(boolean z10, hd.i iVar) {
            boolean z11;
            this.f32719a.i(j.a.INBOUND, iVar);
            synchronized (i.this.f32696k) {
                if (m.b(iVar, 4)) {
                    int unused = i.this.E = m.a(iVar, 4);
                }
                if (m.b(iVar, 7)) {
                    z11 = i.this.f32695j.f(m.a(iVar, 7));
                } else {
                    z11 = false;
                }
                if (this.f32721c) {
                    i.this.f32693h.b();
                    this.f32721c = false;
                }
                i.this.f32694i.W(iVar);
                if (z11) {
                    i.this.f32695j.h();
                }
                boolean unused2 = i.this.l0();
            }
        }

        public void run() {
            String str;
            j1 x10;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f32720b.S0(this)) {
                try {
                    if (i.this.H != null) {
                        i.this.H.m();
                    }
                } catch (Throwable th) {
                    try {
                        i.this.k0(0, hd.a.PROTOCOL_ERROR, j1.f32247t.q("error in frame handler").p(th));
                    } finally {
                        try {
                            this.f32720b.close();
                        } catch (IOException e10) {
                            str = "Exception closing frame reader";
                            i.X.log(Level.INFO, str, e10);
                        }
                        i.this.f32693h.c();
                        Thread.currentThread().setName(name);
                    }
                }
            }
            synchronized (i.this.f32696k) {
                x10 = i.this.f32707v;
            }
            if (x10 == null) {
                x10 = j1.f32248u.q("End of stream or IOException");
            }
            i.this.k0(0, hd.a.INTERNAL_ERROR, x10);
            try {
                this.f32720b.close();
            } catch (IOException e11) {
                e = e11;
            }
        }
    }

    public i(f.C0369f fVar, InetSocketAddress inetSocketAddress, String str, String str2, dd.a aVar, c0 c0Var, Runnable runnable) {
        this(fVar, inetSocketAddress, str, str2, aVar, r0.f35322w, new g(), c0Var, runnable);
    }

    static /* synthetic */ int D(i iVar, int i10) {
        int i11 = iVar.f32704s + i10;
        iVar.f32704s = i11;
        return i11;
    }

    private static Map<hd.a, j1> Q() {
        EnumMap enumMap = new EnumMap(hd.a.class);
        hd.a aVar = hd.a.NO_ERROR;
        j1 j1Var = j1.f32247t;
        enumMap.put(aVar, j1Var.q("No error: A GRPC status of OK should have been sent"));
        enumMap.put(hd.a.PROTOCOL_ERROR, j1Var.q("Protocol error"));
        enumMap.put(hd.a.INTERNAL_ERROR, j1Var.q(UnityAdsConstants.Messages.MSG_INTERNAL_ERROR));
        enumMap.put(hd.a.FLOW_CONTROL_ERROR, j1Var.q("Flow control error"));
        enumMap.put(hd.a.STREAM_CLOSED, j1Var.q("Stream closed"));
        enumMap.put(hd.a.FRAME_TOO_LARGE, j1Var.q("Frame too large"));
        enumMap.put(hd.a.REFUSED_STREAM, j1.f32248u.q("Refused stream"));
        enumMap.put(hd.a.CANCEL, j1.f32234g.q("Cancelled"));
        enumMap.put(hd.a.COMPRESSION_ERROR, j1Var.q("Compression error"));
        enumMap.put(hd.a.CONNECT_ERROR, j1Var.q("Connect error"));
        enumMap.put(hd.a.ENHANCE_YOUR_CALM, j1.f32242o.q("Enhance your calm"));
        enumMap.put(hd.a.INADEQUATE_SECURITY, j1.f32240m.q("Inadequate security"));
        return Collections.unmodifiableMap(enumMap);
    }

    private id.b R(InetSocketAddress inetSocketAddress, String str, String str2) {
        id.a a10 = new a.b().k(HttpRequest.DEFAULT_SCHEME).h(inetSocketAddress.getHostName()).j(inetSocketAddress.getPort()).a();
        b.C0378b e10 = new b.C0378b().e(a10);
        b.C0378b d10 = e10.d("Host", a10.c() + ":" + a10.f()).d("User-Agent", this.f32688c);
        if (!(str == null || str2 == null)) {
            d10.d("Proxy-Authorization", gd.c.a(str, str2));
        }
        return d10.c();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:19|(2:20|21)|25|26|27|28|29) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00e9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.net.Socket S(java.net.InetSocketAddress r10, java.net.InetSocketAddress r11, java.lang.String r12, java.lang.String r13) throws dd.k1 {
        /*
            r9 = this;
            java.lang.String r0 = "\r\n"
            r1 = 0
            java.net.InetAddress r2 = r11.getAddress()     // Catch:{ IOException -> 0x0111 }
            if (r2 == 0) goto L_0x0018
            javax.net.SocketFactory r2 = r9.A     // Catch:{ IOException -> 0x0111 }
            java.net.InetAddress r3 = r11.getAddress()     // Catch:{ IOException -> 0x0111 }
            int r11 = r11.getPort()     // Catch:{ IOException -> 0x0111 }
            java.net.Socket r11 = r2.createSocket(r3, r11)     // Catch:{ IOException -> 0x0111 }
            goto L_0x0026
        L_0x0018:
            javax.net.SocketFactory r2 = r9.A     // Catch:{ IOException -> 0x0111 }
            java.lang.String r3 = r11.getHostName()     // Catch:{ IOException -> 0x0111 }
            int r11 = r11.getPort()     // Catch:{ IOException -> 0x0111 }
            java.net.Socket r11 = r2.createSocket(r3, r11)     // Catch:{ IOException -> 0x0111 }
        L_0x0026:
            r1 = r11
            r11 = 1
            r1.setTcpNoDelay(r11)     // Catch:{ IOException -> 0x0111 }
            int r2 = r9.T     // Catch:{ IOException -> 0x0111 }
            r1.setSoTimeout(r2)     // Catch:{ IOException -> 0x0111 }
            lf.s r2 = lf.l.j(r1)     // Catch:{ IOException -> 0x0111 }
            lf.r r3 = lf.l.g(r1)     // Catch:{ IOException -> 0x0111 }
            lf.d r3 = lf.l.a(r3)     // Catch:{ IOException -> 0x0111 }
            id.b r10 = r9.R(r10, r12, r13)     // Catch:{ IOException -> 0x0111 }
            id.a r12 = r10.b()     // Catch:{ IOException -> 0x0111 }
            java.util.Locale r13 = java.util.Locale.US     // Catch:{ IOException -> 0x0111 }
            java.lang.String r4 = "CONNECT %s:%d HTTP/1.1"
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0111 }
            java.lang.String r7 = r12.c()     // Catch:{ IOException -> 0x0111 }
            r8 = 0
            r6[r8] = r7     // Catch:{ IOException -> 0x0111 }
            int r12 = r12.f()     // Catch:{ IOException -> 0x0111 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x0111 }
            r6[r11] = r12     // Catch:{ IOException -> 0x0111 }
            java.lang.String r12 = java.lang.String.format(r13, r4, r6)     // Catch:{ IOException -> 0x0111 }
            lf.d r12 = r3.T(r12)     // Catch:{ IOException -> 0x0111 }
            r12.T(r0)     // Catch:{ IOException -> 0x0111 }
            gd.e r12 = r10.a()     // Catch:{ IOException -> 0x0111 }
            int r12 = r12.b()     // Catch:{ IOException -> 0x0111 }
            r13 = 0
        L_0x0070:
            if (r13 >= r12) goto L_0x0096
            gd.e r4 = r10.a()     // Catch:{ IOException -> 0x0111 }
            java.lang.String r4 = r4.a(r13)     // Catch:{ IOException -> 0x0111 }
            lf.d r4 = r3.T(r4)     // Catch:{ IOException -> 0x0111 }
            java.lang.String r6 = ": "
            lf.d r4 = r4.T(r6)     // Catch:{ IOException -> 0x0111 }
            gd.e r6 = r10.a()     // Catch:{ IOException -> 0x0111 }
            java.lang.String r6 = r6.c(r13)     // Catch:{ IOException -> 0x0111 }
            lf.d r4 = r4.T(r6)     // Catch:{ IOException -> 0x0111 }
            r4.T(r0)     // Catch:{ IOException -> 0x0111 }
            int r13 = r13 + 1
            goto L_0x0070
        L_0x0096:
            r3.T(r0)     // Catch:{ IOException -> 0x0111 }
            r3.flush()     // Catch:{ IOException -> 0x0111 }
            java.lang.String r10 = g0(r2)     // Catch:{ IOException -> 0x0111 }
            gd.j r10 = gd.j.a(r10)     // Catch:{ IOException -> 0x0111 }
        L_0x00a4:
            java.lang.String r12 = g0(r2)     // Catch:{ IOException -> 0x0111 }
            java.lang.String r13 = ""
            boolean r12 = r12.equals(r13)     // Catch:{ IOException -> 0x0111 }
            if (r12 != 0) goto L_0x00b1
            goto L_0x00a4
        L_0x00b1:
            int r12 = r10.f32928b     // Catch:{ IOException -> 0x0111 }
            r13 = 200(0xc8, float:2.8E-43)
            if (r12 < r13) goto L_0x00bf
            r13 = 300(0x12c, float:4.2E-43)
            if (r12 >= r13) goto L_0x00bf
            r1.setSoTimeout(r8)     // Catch:{ IOException -> 0x0111 }
            return r1
        L_0x00bf:
            lf.c r12 = new lf.c     // Catch:{ IOException -> 0x0111 }
            r12.<init>()     // Catch:{ IOException -> 0x0111 }
            r1.shutdownOutput()     // Catch:{ IOException -> 0x00cd }
            r3 = 1024(0x400, double:5.06E-321)
            r2.P(r12, r3)     // Catch:{ IOException -> 0x00cd }
            goto L_0x00e6
        L_0x00cd:
            r13 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0111 }
            r0.<init>()     // Catch:{ IOException -> 0x0111 }
            java.lang.String r2 = "Unable to read body: "
            r0.append(r2)     // Catch:{ IOException -> 0x0111 }
            java.lang.String r13 = r13.toString()     // Catch:{ IOException -> 0x0111 }
            r0.append(r13)     // Catch:{ IOException -> 0x0111 }
            java.lang.String r13 = r0.toString()     // Catch:{ IOException -> 0x0111 }
            r12.T(r13)     // Catch:{ IOException -> 0x0111 }
        L_0x00e6:
            r1.close()     // Catch:{ IOException -> 0x00e9 }
        L_0x00e9:
            java.util.Locale r13 = java.util.Locale.US     // Catch:{ IOException -> 0x0111 }
            java.lang.String r0 = "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0111 }
            int r3 = r10.f32928b     // Catch:{ IOException -> 0x0111 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0111 }
            r2[r8] = r3     // Catch:{ IOException -> 0x0111 }
            java.lang.String r10 = r10.f32929c     // Catch:{ IOException -> 0x0111 }
            r2[r11] = r10     // Catch:{ IOException -> 0x0111 }
            java.lang.String r10 = r12.l0()     // Catch:{ IOException -> 0x0111 }
            r2[r5] = r10     // Catch:{ IOException -> 0x0111 }
            java.lang.String r10 = java.lang.String.format(r13, r0, r2)     // Catch:{ IOException -> 0x0111 }
            dd.j1 r11 = dd.j1.f32248u     // Catch:{ IOException -> 0x0111 }
            dd.j1 r10 = r11.q(r10)     // Catch:{ IOException -> 0x0111 }
            dd.k1 r10 = r10.c()     // Catch:{ IOException -> 0x0111 }
            throw r10     // Catch:{ IOException -> 0x0111 }
        L_0x0111:
            r10 = move-exception
            if (r1 == 0) goto L_0x0117
            io.grpc.internal.r0.e(r1)
        L_0x0117:
            dd.j1 r11 = dd.j1.f32248u
            java.lang.String r12 = "Failed trying to connect with proxy"
            dd.j1 r11 = r11.q(r12)
            dd.j1 r10 = r11.p(r10)
            dd.k1 r10 = r10.c()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.i.S(java.net.InetSocketAddress, java.net.InetSocketAddress, java.lang.String, java.lang.String):java.net.Socket");
    }

    private Throwable Y() {
        synchronized (this.f32696k) {
            j1 j1Var = this.f32707v;
            if (j1Var != null) {
                dd.k1 c10 = j1Var.c();
                return c10;
            }
            dd.k1 c11 = j1.f32248u.q("Connection closed").c();
            return c11;
        }
    }

    private void a0() {
        synchronized (this.f32696k) {
            this.P.g(new b());
        }
    }

    private void d0(h hVar) {
        if (this.f32711z && this.F.isEmpty() && this.f32699n.isEmpty()) {
            this.f32711z = false;
            c1 c1Var = this.H;
            if (c1Var != null) {
                c1Var.o();
            }
        }
        if (hVar.x()) {
            this.Q.e(hVar, false);
        }
    }

    /* access modifiers changed from: private */
    public void f0(hd.a aVar, String str) {
        k0(0, aVar, p0(aVar).e(str));
    }

    private static String g0(s sVar) throws IOException {
        lf.c cVar = new lf.c();
        while (sVar.P(cVar, 1) != -1) {
            if (cVar.R(cVar.v0() - 1) == 10) {
                return cVar.k0();
            }
        }
        throw new EOFException("\\n not found: " + cVar.h0().j());
    }

    private void i0() {
        synchronized (this.f32696k) {
            this.f32694i.H();
            hd.i iVar = new hd.i();
            m.c(iVar, 7, this.f32691f);
            this.f32694i.W0(iVar);
            int i10 = this.f32691f;
            if (i10 > 65535) {
                this.f32694i.a(0, (long) (i10 - 65535));
            }
        }
    }

    private void j0(h hVar) {
        if (!this.f32711z) {
            this.f32711z = true;
            c1 c1Var = this.H;
            if (c1Var != null) {
                c1Var.n();
            }
        }
        if (hVar.x()) {
            this.Q.e(hVar, true);
        }
    }

    /* access modifiers changed from: private */
    public void k0(int i10, hd.a aVar, j1 j1Var) {
        synchronized (this.f32696k) {
            if (this.f32707v == null) {
                this.f32707v = j1Var;
                this.f32693h.a(j1Var);
            }
            if (aVar != null && !this.f32708w) {
                this.f32708w = true;
                this.f32694i.M0(0, aVar, new byte[0]);
            }
            Iterator<Map.Entry<Integer, h>> it = this.f32699n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (((Integer) next.getKey()).intValue() > i10) {
                    it.remove();
                    ((h) next.getValue()).y().M(j1Var, r.a.REFUSED, false, new y0());
                    d0((h) next.getValue());
                }
            }
            for (h next2 : this.F) {
                next2.y().M(j1Var, r.a.MISCARRIED, true, new y0());
                d0(next2);
            }
            this.F.clear();
            n0();
        }
    }

    /* access modifiers changed from: private */
    public boolean l0() {
        boolean z10 = false;
        while (!this.F.isEmpty() && this.f32699n.size() < this.E) {
            m0(this.F.poll());
            z10 = true;
        }
        return z10;
    }

    private void m0(h hVar) {
        o.v(hVar.y().c0() == -1, "StreamId already assigned");
        this.f32699n.put(Integer.valueOf(this.f32698m), hVar);
        j0(hVar);
        hVar.y().f0(this.f32698m);
        if (!(hVar.L() == z0.d.UNARY || hVar.L() == z0.d.SERVER_STREAMING) || hVar.N()) {
            this.f32694i.flush();
        }
        int i10 = this.f32698m;
        if (i10 >= 2147483645) {
            this.f32698m = a.e.API_PRIORITY_OTHER;
            k0(a.e.API_PRIORITY_OTHER, hd.a.NO_ERROR, j1.f32248u.q("Stream ids exhausted"));
            return;
        }
        this.f32698m = i10 + 2;
    }

    private void n0() {
        if (this.f32707v != null && this.f32699n.isEmpty() && this.F.isEmpty() && !this.f32710y) {
            this.f32710y = true;
            c1 c1Var = this.H;
            if (c1Var != null) {
                c1Var.q();
            }
            v0 v0Var = this.f32709x;
            if (v0Var != null) {
                v0Var.f(Y());
                this.f32709x = null;
            }
            if (!this.f32708w) {
                this.f32708w = true;
                this.f32694i.M0(0, hd.a.NO_ERROR, new byte[0]);
            }
            this.f32694i.close();
        }
    }

    static j1 p0(hd.a aVar) {
        j1 j1Var = W.get(aVar);
        if (j1Var != null) {
            return j1Var;
        }
        j1 j1Var2 = j1.f32235h;
        return j1Var2.q("Unknown http2 error code: " + aVar.f32994a);
    }

    /* access modifiers changed from: package-private */
    public void T(boolean z10, long j10, long j11, boolean z11) {
        this.I = z10;
        this.J = j10;
        this.K = j11;
        this.L = z11;
    }

    /* access modifiers changed from: package-private */
    public void U(int i10, j1 j1Var, r.a aVar, boolean z10, hd.a aVar2, y0 y0Var) {
        synchronized (this.f32696k) {
            h remove = this.f32699n.remove(Integer.valueOf(i10));
            if (remove != null) {
                if (aVar2 != null) {
                    this.f32694i.g(i10, hd.a.CANCEL);
                }
                if (j1Var != null) {
                    h.b M2 = remove.y();
                    if (y0Var == null) {
                        y0Var = new y0();
                    }
                    M2.M(j1Var, aVar, z10, y0Var);
                }
                if (!l0()) {
                    n0();
                    d0(remove);
                }
            }
        }
    }

    public dd.a V() {
        return this.f32706u;
    }

    /* access modifiers changed from: package-private */
    public String W() {
        URI b10 = r0.b(this.f32687b);
        if (b10.getHost() != null) {
            return b10.getHost();
        }
        return this.f32687b;
    }

    /* access modifiers changed from: package-private */
    public int X() {
        URI b10 = r0.b(this.f32687b);
        if (b10.getPort() != -1) {
            return b10.getPort();
        }
        return this.f32686a.getPort();
    }

    /* access modifiers changed from: package-private */
    public h Z(int i10) {
        h hVar;
        synchronized (this.f32696k) {
            hVar = this.f32699n.get(Integer.valueOf(i10));
        }
        return hVar;
    }

    public q.c[] a() {
        q.c[] cVarArr;
        synchronized (this.f32696k) {
            cVarArr = new q.c[this.f32699n.size()];
            int i10 = 0;
            for (h M2 : this.f32699n.values()) {
                cVarArr[i10] = M2.y().b0();
                i10++;
            }
        }
        return cVarArr;
    }

    public void b(j1 j1Var) {
        synchronized (this.f32696k) {
            if (this.f32707v == null) {
                this.f32707v = j1Var;
                this.f32693h.a(j1Var);
                n0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b0() {
        return this.B == null;
    }

    /* access modifiers changed from: package-private */
    public boolean c0(int i10) {
        boolean z10;
        synchronized (this.f32696k) {
            z10 = true;
            if (i10 >= this.f32698m || (i10 & 1) != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public void d(j1 j1Var) {
        b(j1Var);
        synchronized (this.f32696k) {
            Iterator<Map.Entry<Integer, h>> it = this.f32699n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                it.remove();
                ((h) next.getValue()).y().N(j1Var, false, new y0());
                d0((h) next.getValue());
            }
            for (h next2 : this.F) {
                next2.y().M(j1Var, r.a.MISCARRIED, true, new y0());
                d0(next2);
            }
            this.F.clear();
            n0();
        }
    }

    /* JADX INFO: finally extract failed */
    public Runnable e(k1.a aVar) {
        this.f32693h = (k1.a) o.p(aVar, "listener");
        if (this.I) {
            c1 c1Var = new c1(new c1.c(this), this.f32702q, this.J, this.K, this.L);
            this.H = c1Var;
            c1Var.p();
        }
        a e02 = a.e0(this.f32701p, this, 10000);
        hd.c Z = e02.Z(this.f32692g.a(l.a(e02), true));
        synchronized (this.f32696k) {
            b bVar = new b(this, Z);
            this.f32694i = bVar;
            this.f32695j = new q(this, bVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f32701p.execute(new c(countDownLatch, e02));
        try {
            i0();
            countDownLatch.countDown();
            this.f32701p.execute(new d());
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    /* renamed from: e0 */
    public h c(z0<?, ?> z0Var, y0 y0Var, dd.c cVar, k[] kVarArr) {
        Object obj;
        y0 y0Var2 = y0Var;
        o.p(z0Var, "method");
        o.p(y0Var2, "headers");
        i2 h10 = i2.h(kVarArr, V(), y0Var2);
        Object obj2 = this.f32696k;
        synchronized (obj2) {
            try {
                obj = obj2;
                h hVar = new h(z0Var, y0Var, this.f32694i, this, this.f32695j, this.f32696k, this.f32703r, this.f32691f, this.f32687b, this.f32688c, h10, this.P, cVar, this.O);
                return hVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    public void f(Throwable th) {
        o.p(th, "failureCause");
        k0(0, hd.a.INTERNAL_ERROR, j1.f32248u.p(th));
    }

    public j0 g() {
        return this.f32697l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r1.a(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(io.grpc.internal.s.a r9, java.util.concurrent.Executor r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f32696k
            monitor-enter(r0)
            fd.b r1 = r8.f32694i     // Catch:{ all -> 0x0054 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000b
            r1 = 1
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            r6.o.u(r1)     // Catch:{ all -> 0x0054 }
            boolean r1 = r8.f32710y     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x001c
            java.lang.Throwable r1 = r8.Y()     // Catch:{ all -> 0x0054 }
            io.grpc.internal.v0.g(r9, r10, r1)     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return
        L_0x001c:
            io.grpc.internal.v0 r1 = r8.f32709x     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0024
            r4 = 0
            r2 = 0
            goto L_0x0042
        L_0x0024:
            java.util.Random r1 = r8.f32689d     // Catch:{ all -> 0x0054 }
            long r4 = r1.nextLong()     // Catch:{ all -> 0x0054 }
            r6.v<r6.t> r1 = r8.f32690e     // Catch:{ all -> 0x0054 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0054 }
            r6.t r1 = (r6.t) r1     // Catch:{ all -> 0x0054 }
            r1.g()     // Catch:{ all -> 0x0054 }
            io.grpc.internal.v0 r6 = new io.grpc.internal.v0     // Catch:{ all -> 0x0054 }
            r6.<init>(r4, r1)     // Catch:{ all -> 0x0054 }
            r8.f32709x = r6     // Catch:{ all -> 0x0054 }
            io.grpc.internal.o2 r1 = r8.P     // Catch:{ all -> 0x0054 }
            r1.b()     // Catch:{ all -> 0x0054 }
            r1 = r6
        L_0x0042:
            if (r2 == 0) goto L_0x004f
            fd.b r2 = r8.f32694i     // Catch:{ all -> 0x0054 }
            r6 = 32
            long r6 = r4 >>> r6
            int r7 = (int) r6     // Catch:{ all -> 0x0054 }
            int r5 = (int) r4     // Catch:{ all -> 0x0054 }
            r2.b(r3, r7, r5)     // Catch:{ all -> 0x0054 }
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            r1.a(r9, r10)
            return
        L_0x0054:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.i.h(io.grpc.internal.s$a, java.util.concurrent.Executor):void");
    }

    /* access modifiers changed from: package-private */
    public void h0(h hVar) {
        this.F.remove(hVar);
        d0(hVar);
    }

    /* access modifiers changed from: package-private */
    public void o0(h hVar) {
        if (this.f32707v != null) {
            hVar.y().M(this.f32707v, r.a.MISCARRIED, true, new y0());
        } else if (this.f32699n.size() >= this.E) {
            this.F.add(hVar);
            j0(hVar);
        } else {
            m0(hVar);
        }
    }

    public String toString() {
        return r6.i.c(this).c("logId", this.f32697l.d()).d("address", this.f32686a).toString();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [r6.v<r6.t>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private i(fd.f.C0369f r2, java.net.InetSocketAddress r3, java.lang.String r4, java.lang.String r5, dd.a r6, r6.v<r6.t> r7, hd.j r8, dd.c0 r9, java.lang.Runnable r10) {
        /*
            r1 = this;
            r1.<init>()
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1.f32689d = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f32696k = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f32699n = r0
            r0 = 0
            r1.E = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.F = r0
            fd.i$a r0 = new fd.i$a
            r0.<init>()
            r1.Q = r0
            r0 = 30000(0x7530, float:4.2039E-41)
            r1.T = r0
            java.lang.String r0 = "address"
            java.lang.Object r0 = r6.o.p(r3, r0)
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            r1.f32686a = r0
            r1.f32687b = r4
            int r4 = r2.f32662k
            r1.f32703r = r4
            int r4 = r2.f32667p
            r1.f32691f = r4
            java.util.concurrent.Executor r4 = r2.f32654b
            java.lang.String r0 = "executor"
            java.lang.Object r4 = r6.o.p(r4, r0)
            java.util.concurrent.Executor r4 = (java.util.concurrent.Executor) r4
            r1.f32700o = r4
            io.grpc.internal.d2 r4 = new io.grpc.internal.d2
            java.util.concurrent.Executor r0 = r2.f32654b
            r4.<init>(r0)
            r1.f32701p = r4
            java.util.concurrent.ScheduledExecutorService r4 = r2.f32656d
            java.lang.String r0 = "scheduledExecutorService"
            java.lang.Object r4 = r6.o.p(r4, r0)
            java.util.concurrent.ScheduledExecutorService r4 = (java.util.concurrent.ScheduledExecutorService) r4
            r1.f32702q = r4
            r4 = 3
            r1.f32698m = r4
            javax.net.SocketFactory r4 = r2.f32658g
            if (r4 != 0) goto L_0x006d
            javax.net.SocketFactory r4 = javax.net.SocketFactory.getDefault()
        L_0x006d:
            r1.A = r4
            javax.net.ssl.SSLSocketFactory r4 = r2.f32659h
            r1.B = r4
            javax.net.ssl.HostnameVerifier r4 = r2.f32660i
            r1.C = r4
            gd.b r4 = r2.f32661j
            java.lang.String r0 = "connectionSpec"
            java.lang.Object r4 = r6.o.p(r4, r0)
            gd.b r4 = (gd.b) r4
            r1.G = r4
            java.lang.String r4 = "stopwatchFactory"
            java.lang.Object r4 = r6.o.p(r7, r4)
            r6.v r4 = (r6.v) r4
            r1.f32690e = r4
            java.lang.String r4 = "variant"
            java.lang.Object r4 = r6.o.p(r8, r4)
            hd.j r4 = (hd.j) r4
            r1.f32692g = r4
            java.lang.String r4 = "okhttp"
            java.lang.String r4 = io.grpc.internal.r0.g(r4, r5)
            r1.f32688c = r4
            r1.S = r9
            java.lang.String r4 = "tooManyPingsRunnable"
            java.lang.Object r4 = r6.o.p(r10, r4)
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r1.M = r4
            int r4 = r2.f32669r
            r1.N = r4
            io.grpc.internal.o2$b r4 = r2.f32657f
            io.grpc.internal.o2 r4 = r4.a()
            r1.P = r4
            java.lang.Class r4 = r1.getClass()
            java.lang.String r3 = r3.toString()
            dd.j0 r3 = dd.j0.a(r4, r3)
            r1.f32697l = r3
            dd.a$b r3 = dd.a.c()
            dd.a$c<dd.a> r4 = io.grpc.internal.q0.f35283b
            dd.a$b r3 = r3.d(r4, r6)
            dd.a r3 = r3.a()
            r1.f32706u = r3
            boolean r2 = r2.f32670s
            r1.O = r2
            r1.a0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.i.<init>(fd.f$f, java.net.InetSocketAddress, java.lang.String, java.lang.String, dd.a, r6.v, hd.j, dd.c0, java.lang.Runnable):void");
    }
}
