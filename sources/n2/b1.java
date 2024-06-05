package n2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import i4.b0;
import i4.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import k4.d0;
import k4.g;
import k4.l;
import k4.n;
import k4.n0;
import k4.q;
import k4.r;
import l4.j;
import l4.m;
import l4.z;
import m4.f;
import n2.b;
import n2.c4;
import n2.d;
import n2.g3;
import n2.k3;
import n2.n1;
import n2.s;
import n2.x2;
import n2.x3;
import o2.s1;
import o2.u1;
import p2.i;
import p2.t;
import p3.s0;
import p3.x;
import p3.z0;
import s6.u;

/* compiled from: ExoPlayerImpl */
final class b1 extends e implements s {
    private final d A;
    /* access modifiers changed from: private */
    public final x3 B;
    private final i4 C;
    private final j4 D;
    private final long E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private int K;
    private u3 L;
    private s0 M;
    private boolean N;
    private g3.b O;
    /* access modifiers changed from: private */
    public e2 P;
    private e2 Q;
    /* access modifiers changed from: private */
    public r1 R;
    /* access modifiers changed from: private */
    public r1 S;
    private AudioTrack T;
    /* access modifiers changed from: private */
    public Object U;
    private Surface V;
    private SurfaceHolder W;
    private f X;
    /* access modifiers changed from: private */
    public boolean Y;
    private TextureView Z;

    /* renamed from: a0  reason: collision with root package name */
    private int f20143a0;

    /* renamed from: b  reason: collision with root package name */
    final c0 f20144b;

    /* renamed from: b0  reason: collision with root package name */
    private int f20145b0;

    /* renamed from: c  reason: collision with root package name */
    final g3.b f20146c;

    /* renamed from: c0  reason: collision with root package name */
    private d0 f20147c0;

    /* renamed from: d  reason: collision with root package name */
    private final g f20148d;
    /* access modifiers changed from: private */

    /* renamed from: d0  reason: collision with root package name */
    public q2.e f20149d0;

    /* renamed from: e  reason: collision with root package name */
    private final Context f20150e;
    /* access modifiers changed from: private */

    /* renamed from: e0  reason: collision with root package name */
    public q2.e f20151e0;

    /* renamed from: f  reason: collision with root package name */
    private final g3 f20152f;

    /* renamed from: f0  reason: collision with root package name */
    private int f20153f0;

    /* renamed from: g  reason: collision with root package name */
    private final p3[] f20154g;

    /* renamed from: g0  reason: collision with root package name */
    private p2.e f20155g0;

    /* renamed from: h  reason: collision with root package name */
    private final b0 f20156h;

    /* renamed from: h0  reason: collision with root package name */
    private float f20157h0;

    /* renamed from: i  reason: collision with root package name */
    private final n f20158i;
    /* access modifiers changed from: private */

    /* renamed from: i0  reason: collision with root package name */
    public boolean f20159i0;

    /* renamed from: j  reason: collision with root package name */
    private final n1.f f20160j;
    /* access modifiers changed from: private */

    /* renamed from: j0  reason: collision with root package name */
    public y3.e f20161j0;

    /* renamed from: k  reason: collision with root package name */
    private final n1 f20162k;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f20163k0;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final q<g3.d> f20164l;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f20165l0;

    /* renamed from: m  reason: collision with root package name */
    private final CopyOnWriteArraySet<s.a> f20166m;

    /* renamed from: m0  reason: collision with root package name */
    private k4.c0 f20167m0;

    /* renamed from: n  reason: collision with root package name */
    private final c4.b f20168n;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f20169n0;

    /* renamed from: o  reason: collision with root package name */
    private final List<e> f20170o;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f20171o0;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f20172p;
    /* access modifiers changed from: private */

    /* renamed from: p0  reason: collision with root package name */
    public o f20173p0;

    /* renamed from: q  reason: collision with root package name */
    private final x.a f20174q;
    /* access modifiers changed from: private */

    /* renamed from: q0  reason: collision with root package name */
    public z f20175q0;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final o2.a f20176r;
    /* access modifiers changed from: private */

    /* renamed from: r0  reason: collision with root package name */
    public e2 f20177r0;

    /* renamed from: s  reason: collision with root package name */
    private final Looper f20178s;

    /* renamed from: s0  reason: collision with root package name */
    private d3 f20179s0;

    /* renamed from: t  reason: collision with root package name */
    private final j4.f f20180t;

    /* renamed from: t0  reason: collision with root package name */
    private int f20181t0;

    /* renamed from: u  reason: collision with root package name */
    private final long f20182u;

    /* renamed from: u0  reason: collision with root package name */
    private int f20183u0;

    /* renamed from: v  reason: collision with root package name */
    private final long f20184v;

    /* renamed from: v0  reason: collision with root package name */
    private long f20185v0;

    /* renamed from: w  reason: collision with root package name */
    private final k4.d f20186w;

    /* renamed from: x  reason: collision with root package name */
    private final c f20187x;

    /* renamed from: y  reason: collision with root package name */
    private final d f20188y;

    /* renamed from: z  reason: collision with root package name */
    private final b f20189z;

    /* compiled from: ExoPlayerImpl */
    private static final class b {
        public static u1 a(Context context, b1 b1Var, boolean z10) {
            s1 B0 = s1.B0(context);
            if (B0 == null) {
                r.i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new u1(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z10) {
                b1Var.X0(B0);
            }
            return new u1(B0.I0());
        }
    }

    /* compiled from: ExoPlayerImpl */
    private final class c implements l4.x, t, y3.n, f3.f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, f.a, d.b, b.C0216b, x3.b, s.a {
        private c() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void S(g3.d dVar) {
            dVar.D(b1.this.P);
        }

        public void A(boolean z10) {
            b1.this.m2();
        }

        public void B(float f10) {
            b1.this.a2();
        }

        public void C(int i10) {
            boolean m10 = b1.this.m();
            b1.this.j2(m10, i10, b1.l1(m10, i10));
        }

        public void D(Surface surface) {
            b1.this.f2((Object) null);
        }

        public void E(int i10, boolean z10) {
            b1.this.f20164l.k(30, new c1(i10, z10));
        }

        public /* synthetic */ void F(r1 r1Var) {
            i.a(this, r1Var);
        }

        public /* synthetic */ void G(boolean z10) {
            r.b(this, z10);
        }

        public /* synthetic */ void H(boolean z10) {
            r.a(this, z10);
        }

        public void a(boolean z10) {
            if (b1.this.f20159i0 != z10) {
                boolean unused = b1.this.f20159i0 = z10;
                b1.this.f20164l.k(23, new j1(z10));
            }
        }

        public void b(Exception exc) {
            b1.this.f20176r.b(exc);
        }

        public void c(String str) {
            b1.this.f20176r.c(str);
        }

        public void d(int i10) {
            o M0 = b1.b1(b1.this.B);
            if (!M0.equals(b1.this.f20173p0)) {
                o unused = b1.this.f20173p0 = M0;
                b1.this.f20164l.k(29, new g1(M0));
            }
        }

        public void e(String str, long j10, long j11) {
            b1.this.f20176r.e(str, j10, j11);
        }

        public void f(r1 r1Var, q2.i iVar) {
            r1 unused = b1.this.S = r1Var;
            b1.this.f20176r.f(r1Var, iVar);
        }

        public void g(q2.e eVar) {
            q2.e unused = b1.this.f20149d0 = eVar;
            b1.this.f20176r.g(eVar);
        }

        public void h(r1 r1Var, q2.i iVar) {
            r1 unused = b1.this.R = r1Var;
            b1.this.f20176r.h(r1Var, iVar);
        }

        public void i(String str) {
            b1.this.f20176r.i(str);
        }

        public void j(String str, long j10, long j11) {
            b1.this.f20176r.j(str, j10, j11);
        }

        public void k(int i10, long j10) {
            b1.this.f20176r.k(i10, j10);
        }

        public void l(q2.e eVar) {
            q2.e unused = b1.this.f20151e0 = eVar;
            b1.this.f20176r.l(eVar);
        }

        public void m(Object obj, long j10) {
            b1.this.f20176r.m(obj, j10);
            if (b1.this.U == obj) {
                b1.this.f20164l.k(26, k1.f36407a);
            }
        }

        public void n(f3.a aVar) {
            b1 b1Var = b1.this;
            e2 unused = b1Var.f20177r0 = b1Var.f20177r0.b().K(aVar).H();
            e2 B0 = b1.this.a1();
            if (!B0.equals(b1.this.P)) {
                e2 unused2 = b1.this.P = B0;
                b1.this.f20164l.i(14, new h1(this));
            }
            b1.this.f20164l.i(28, new d1(aVar));
            b1.this.f20164l.f();
        }

        public void o(q2.e eVar) {
            b1.this.f20176r.o(eVar);
            r1 unused = b1.this.S = null;
            q2.e unused2 = b1.this.f20151e0 = null;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            b1.this.e2(surfaceTexture);
            b1.this.U1(i10, i11);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            b1.this.f2((Object) null);
            b1.this.U1(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            b1.this.U1(i10, i11);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void p() {
            b1.this.j2(false, -1, 3);
        }

        public void q(List<y3.b> list) {
            b1.this.f20164l.k(27, new e1(list));
        }

        public void r(long j10) {
            b1.this.f20176r.r(j10);
        }

        public void s(z zVar) {
            z unused = b1.this.f20175q0 = zVar;
            b1.this.f20164l.k(25, new f1(zVar));
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            b1.this.U1(i11, i12);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (b1.this.Y) {
                b1.this.f2(surfaceHolder.getSurface());
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (b1.this.Y) {
                b1.this.f2((Object) null);
            }
            b1.this.U1(0, 0);
        }

        public void t(Exception exc) {
            b1.this.f20176r.t(exc);
        }

        public void u(y3.e eVar) {
            y3.e unused = b1.this.f20161j0 = eVar;
            b1.this.f20164l.k(27, new i1(eVar));
        }

        public void v(Exception exc) {
            b1.this.f20176r.v(exc);
        }

        public void w(q2.e eVar) {
            b1.this.f20176r.w(eVar);
            r1 unused = b1.this.R = null;
            q2.e unused2 = b1.this.f20149d0 = null;
        }

        public void x(int i10, long j10, long j11) {
            b1.this.f20176r.x(i10, j10, j11);
        }

        public void y(long j10, int i10) {
            b1.this.f20176r.y(j10, i10);
        }

        public /* synthetic */ void z(r1 r1Var) {
            m.a(this, r1Var);
        }
    }

    /* compiled from: ExoPlayerImpl */
    private static final class d implements j, m4.a, k3.b {

        /* renamed from: a  reason: collision with root package name */
        private j f20191a;

        /* renamed from: b  reason: collision with root package name */
        private m4.a f20192b;

        /* renamed from: c  reason: collision with root package name */
        private j f20193c;

        /* renamed from: d  reason: collision with root package name */
        private m4.a f20194d;

        private d() {
        }

        public void a(long j10, float[] fArr) {
            m4.a aVar = this.f20194d;
            if (aVar != null) {
                aVar.a(j10, fArr);
            }
            m4.a aVar2 = this.f20192b;
            if (aVar2 != null) {
                aVar2.a(j10, fArr);
            }
        }

        public void c() {
            m4.a aVar = this.f20194d;
            if (aVar != null) {
                aVar.c();
            }
            m4.a aVar2 = this.f20192b;
            if (aVar2 != null) {
                aVar2.c();
            }
        }

        public void e(long j10, long j11, r1 r1Var, MediaFormat mediaFormat) {
            j jVar = this.f20193c;
            if (jVar != null) {
                jVar.e(j10, j11, r1Var, mediaFormat);
            }
            j jVar2 = this.f20191a;
            if (jVar2 != null) {
                jVar2.e(j10, j11, r1Var, mediaFormat);
            }
        }

        public void p(int i10, Object obj) {
            if (i10 == 7) {
                this.f20191a = (j) obj;
            } else if (i10 == 8) {
                this.f20192b = (m4.a) obj;
            } else if (i10 == 10000) {
                f fVar = (f) obj;
                if (fVar == null) {
                    this.f20193c = null;
                    this.f20194d = null;
                    return;
                }
                this.f20193c = fVar.getVideoFrameMetadataListener();
                this.f20194d = fVar.getCameraMotionListener();
            }
        }
    }

    /* compiled from: ExoPlayerImpl */
    private static final class e implements j2 {

        /* renamed from: a  reason: collision with root package name */
        private final Object f20195a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public c4 f20196b;

        public e(Object obj, c4 c4Var) {
            this.f20195a = obj;
            this.f20196b = c4Var;
        }

        public c4 a() {
            return this.f20196b;
        }

        public Object c() {
            return this.f20195a;
        }
    }

    static {
        o1.a("goog.exo.exoplayer");
    }

    /* JADX WARNING: type inference failed for: r40v0, types: [n2.g3] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b1(n2.s.b r39, n2.g3 r40) {
        /*
            r38 = this;
            r1 = r38
            r0 = r39
            r38.<init>()
            k4.g r2 = new k4.g
            r2.<init>()
            r1.f20148d = r2
            java.lang.String r3 = "ExoPlayerImpl"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0348 }
            r4.<init>()     // Catch:{ all -> 0x0348 }
            java.lang.String r5 = "Init "
            r4.append(r5)     // Catch:{ all -> 0x0348 }
            int r5 = java.lang.System.identityHashCode(r38)     // Catch:{ all -> 0x0348 }
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch:{ all -> 0x0348 }
            r4.append(r5)     // Catch:{ all -> 0x0348 }
            java.lang.String r5 = " ["
            r4.append(r5)     // Catch:{ all -> 0x0348 }
            java.lang.String r5 = "ExoPlayerLib/2.18.7"
            r4.append(r5)     // Catch:{ all -> 0x0348 }
            java.lang.String r5 = "] ["
            r4.append(r5)     // Catch:{ all -> 0x0348 }
            java.lang.String r5 = k4.n0.f19742e     // Catch:{ all -> 0x0348 }
            r4.append(r5)     // Catch:{ all -> 0x0348 }
            java.lang.String r5 = "]"
            r4.append(r5)     // Catch:{ all -> 0x0348 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0348 }
            k4.r.f(r3, r4)     // Catch:{ all -> 0x0348 }
            android.content.Context r3 = r0.f20694a     // Catch:{ all -> 0x0348 }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0348 }
            r1.f20150e = r3     // Catch:{ all -> 0x0348 }
            r6.g<k4.d, o2.a> r4 = r0.f20702i     // Catch:{ all -> 0x0348 }
            k4.d r5 = r0.f20695b     // Catch:{ all -> 0x0348 }
            java.lang.Object r4 = r4.apply(r5)     // Catch:{ all -> 0x0348 }
            o2.a r4 = (o2.a) r4     // Catch:{ all -> 0x0348 }
            r1.f20176r = r4     // Catch:{ all -> 0x0348 }
            k4.c0 r5 = r0.f20704k     // Catch:{ all -> 0x0348 }
            r1.f20167m0 = r5     // Catch:{ all -> 0x0348 }
            p2.e r5 = r0.f20705l     // Catch:{ all -> 0x0348 }
            r1.f20155g0 = r5     // Catch:{ all -> 0x0348 }
            int r5 = r0.f20710q     // Catch:{ all -> 0x0348 }
            r1.f20143a0 = r5     // Catch:{ all -> 0x0348 }
            int r5 = r0.f20711r     // Catch:{ all -> 0x0348 }
            r1.f20145b0 = r5     // Catch:{ all -> 0x0348 }
            boolean r5 = r0.f20709p     // Catch:{ all -> 0x0348 }
            r1.f20159i0 = r5     // Catch:{ all -> 0x0348 }
            long r5 = r0.f20718y     // Catch:{ all -> 0x0348 }
            r1.E = r5     // Catch:{ all -> 0x0348 }
            n2.b1$c r15 = new n2.b1$c     // Catch:{ all -> 0x0348 }
            r14 = 0
            r15.<init>()     // Catch:{ all -> 0x0348 }
            r1.f20187x = r15     // Catch:{ all -> 0x0348 }
            n2.b1$d r13 = new n2.b1$d     // Catch:{ all -> 0x0348 }
            r13.<init>()     // Catch:{ all -> 0x0348 }
            r1.f20188y = r13     // Catch:{ all -> 0x0348 }
            android.os.Handler r6 = new android.os.Handler     // Catch:{ all -> 0x0348 }
            android.os.Looper r5 = r0.f20703j     // Catch:{ all -> 0x0348 }
            r6.<init>(r5)     // Catch:{ all -> 0x0348 }
            r6.v<n2.t3> r5 = r0.f20697d     // Catch:{ all -> 0x0348 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0348 }
            r7 = r5
            n2.t3 r7 = (n2.t3) r7     // Catch:{ all -> 0x0348 }
            r8 = r6
            r9 = r15
            r10 = r15
            r11 = r15
            r12 = r15
            n2.p3[] r7 = r7.a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0348 }
            r1.f20154g = r7     // Catch:{ all -> 0x0348 }
            int r5 = r7.length     // Catch:{ all -> 0x0348 }
            r12 = 0
            if (r5 <= 0) goto L_0x00a1
            r5 = 1
            goto L_0x00a2
        L_0x00a1:
            r5 = 0
        L_0x00a2:
            k4.a.f(r5)     // Catch:{ all -> 0x0348 }
            r6.v<i4.b0> r5 = r0.f20699f     // Catch:{ all -> 0x0348 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0348 }
            r10 = r5
            i4.b0 r10 = (i4.b0) r10     // Catch:{ all -> 0x0348 }
            r1.f20156h = r10     // Catch:{ all -> 0x0348 }
            r6.v<p3.x$a> r5 = r0.f20698e     // Catch:{ all -> 0x0348 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0348 }
            p3.x$a r5 = (p3.x.a) r5     // Catch:{ all -> 0x0348 }
            r1.f20174q = r5     // Catch:{ all -> 0x0348 }
            r6.v<j4.f> r5 = r0.f20701h     // Catch:{ all -> 0x0348 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0348 }
            r9 = r5
            j4.f r9 = (j4.f) r9     // Catch:{ all -> 0x0348 }
            r1.f20180t = r9     // Catch:{ all -> 0x0348 }
            boolean r5 = r0.f20712s     // Catch:{ all -> 0x0348 }
            r1.f20172p = r5     // Catch:{ all -> 0x0348 }
            n2.u3 r5 = r0.f20713t     // Catch:{ all -> 0x0348 }
            r1.L = r5     // Catch:{ all -> 0x0348 }
            r16 = r15
            long r14 = r0.f20714u     // Catch:{ all -> 0x0348 }
            r1.f20182u = r14     // Catch:{ all -> 0x0348 }
            long r14 = r0.f20715v     // Catch:{ all -> 0x0348 }
            r1.f20184v = r14     // Catch:{ all -> 0x0348 }
            boolean r5 = r0.f20719z     // Catch:{ all -> 0x0348 }
            r1.N = r5     // Catch:{ all -> 0x0348 }
            android.os.Looper r15 = r0.f20703j     // Catch:{ all -> 0x0348 }
            r1.f20178s = r15     // Catch:{ all -> 0x0348 }
            k4.d r14 = r0.f20695b     // Catch:{ all -> 0x0348 }
            r1.f20186w = r14     // Catch:{ all -> 0x0348 }
            if (r40 != 0) goto L_0x00e7
            r5 = r1
            goto L_0x00e9
        L_0x00e7:
            r5 = r40
        L_0x00e9:
            r1.f20152f = r5     // Catch:{ all -> 0x0348 }
            k4.q r8 = new k4.q     // Catch:{ all -> 0x0348 }
            n2.r0 r11 = new n2.r0     // Catch:{ all -> 0x0348 }
            r11.<init>(r1)     // Catch:{ all -> 0x0348 }
            r8.<init>(r15, r14, r11)     // Catch:{ all -> 0x0348 }
            r1.f20164l = r8     // Catch:{ all -> 0x0348 }
            java.util.concurrent.CopyOnWriteArraySet r8 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ all -> 0x0348 }
            r8.<init>()     // Catch:{ all -> 0x0348 }
            r1.f20166m = r8     // Catch:{ all -> 0x0348 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0348 }
            r8.<init>()     // Catch:{ all -> 0x0348 }
            r1.f20170o = r8     // Catch:{ all -> 0x0348 }
            p3.s0$a r8 = new p3.s0$a     // Catch:{ all -> 0x0348 }
            r8.<init>(r12)     // Catch:{ all -> 0x0348 }
            r1.M = r8     // Catch:{ all -> 0x0348 }
            i4.c0 r8 = new i4.c0     // Catch:{ all -> 0x0348 }
            int r11 = r7.length     // Catch:{ all -> 0x0348 }
            n2.s3[] r11 = new n2.s3[r11]     // Catch:{ all -> 0x0348 }
            int r12 = r7.length     // Catch:{ all -> 0x0348 }
            i4.s[] r12 = new i4.s[r12]     // Catch:{ all -> 0x0348 }
            r20 = r6
            n2.h4 r6 = n2.h4.f20422b     // Catch:{ all -> 0x0348 }
            r21 = r9
            r9 = 0
            r8.<init>(r11, r12, r6, r9)     // Catch:{ all -> 0x0348 }
            r1.f20144b = r8     // Catch:{ all -> 0x0348 }
            n2.c4$b r6 = new n2.c4$b     // Catch:{ all -> 0x0348 }
            r6.<init>()     // Catch:{ all -> 0x0348 }
            r1.f20168n = r6     // Catch:{ all -> 0x0348 }
            n2.g3$b$a r6 = new n2.g3$b$a     // Catch:{ all -> 0x0348 }
            r6.<init>()     // Catch:{ all -> 0x0348 }
            r12 = 21
            int[] r9 = new int[r12]     // Catch:{ all -> 0x0348 }
            r11 = 1
            r18 = 0
            r9[r18] = r11     // Catch:{ all -> 0x0348 }
            r12 = 2
            r9[r11] = r12     // Catch:{ all -> 0x0348 }
            r24 = r2
            r2 = 3
            r9[r12] = r2     // Catch:{ all -> 0x0348 }
            r19 = 13
            r9[r2] = r19     // Catch:{ all -> 0x0348 }
            r22 = 14
            r2 = 4
            r9[r2] = r22     // Catch:{ all -> 0x0348 }
            r23 = 15
            r2 = 5
            r9[r2] = r23     // Catch:{ all -> 0x0348 }
            r25 = 16
            r2 = 6
            r9[r2] = r25     // Catch:{ all -> 0x0348 }
            r26 = 17
            r2 = 7
            r9[r2] = r26     // Catch:{ all -> 0x0348 }
            r27 = 18
            r2 = 8
            r9[r2] = r27     // Catch:{ all -> 0x0348 }
            r28 = 19
            r2 = 9
            r9[r2] = r28     // Catch:{ all -> 0x0348 }
            r11 = 31
            r2 = 10
            r9[r2] = r11     // Catch:{ all -> 0x0348 }
            r29 = 11
            r30 = 20
            r9[r29] = r30     // Catch:{ all -> 0x0348 }
            r29 = 12
            r31 = 30
            r9[r29] = r31     // Catch:{ all -> 0x0348 }
            r29 = 21
            r9[r19] = r29     // Catch:{ all -> 0x0348 }
            r19 = 22
            r9[r22] = r19     // Catch:{ all -> 0x0348 }
            r19 = 23
            r9[r23] = r19     // Catch:{ all -> 0x0348 }
            r19 = 24
            r9[r25] = r19     // Catch:{ all -> 0x0348 }
            r19 = 25
            r9[r26] = r19     // Catch:{ all -> 0x0348 }
            r19 = 26
            r9[r27] = r19     // Catch:{ all -> 0x0348 }
            r19 = 27
            r9[r28] = r19     // Catch:{ all -> 0x0348 }
            r19 = 28
            r9[r30] = r19     // Catch:{ all -> 0x0348 }
            n2.g3$b$a r6 = r6.c(r9)     // Catch:{ all -> 0x0348 }
            r9 = 29
            boolean r12 = r10.d()     // Catch:{ all -> 0x0348 }
            n2.g3$b$a r6 = r6.d(r9, r12)     // Catch:{ all -> 0x0348 }
            n2.g3$b r6 = r6.e()     // Catch:{ all -> 0x0348 }
            r1.f20146c = r6     // Catch:{ all -> 0x0348 }
            n2.g3$b$a r9 = new n2.g3$b$a     // Catch:{ all -> 0x0348 }
            r9.<init>()     // Catch:{ all -> 0x0348 }
            n2.g3$b$a r6 = r9.b(r6)     // Catch:{ all -> 0x0348 }
            r9 = 4
            n2.g3$b$a r6 = r6.a(r9)     // Catch:{ all -> 0x0348 }
            n2.g3$b$a r6 = r6.a(r2)     // Catch:{ all -> 0x0348 }
            n2.g3$b r6 = r6.e()     // Catch:{ all -> 0x0348 }
            r1.O = r6     // Catch:{ all -> 0x0348 }
            r12 = 0
            k4.n r6 = r14.d(r15, r12)     // Catch:{ all -> 0x0348 }
            r1.f20158i = r6     // Catch:{ all -> 0x0348 }
            n2.s0 r9 = new n2.s0     // Catch:{ all -> 0x0348 }
            r9.<init>(r1)     // Catch:{ all -> 0x0348 }
            r1.f20160j = r9     // Catch:{ all -> 0x0348 }
            n2.d3 r6 = n2.d3.j(r8)     // Catch:{ all -> 0x0348 }
            r1.f20179s0 = r6     // Catch:{ all -> 0x0348 }
            r4.S(r5, r15)     // Catch:{ all -> 0x0348 }
            int r6 = k4.n0.f19738a     // Catch:{ all -> 0x0348 }
            if (r6 >= r11) goto L_0x01e0
            o2.u1 r5 = new o2.u1     // Catch:{ all -> 0x0348 }
            r5.<init>()     // Catch:{ all -> 0x0348 }
            goto L_0x01e6
        L_0x01e0:
            boolean r5 = r0.A     // Catch:{ all -> 0x0348 }
            o2.u1 r5 = n2.b1.b.a(r3, r1, r5)     // Catch:{ all -> 0x0348 }
        L_0x01e6:
            r22 = r5
            n2.n1 r11 = new n2.n1     // Catch:{ all -> 0x0348 }
            r6.v<n2.x1> r5 = r0.f20700g     // Catch:{ all -> 0x0348 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0348 }
            r17 = r5
            n2.x1 r17 = (n2.x1) r17     // Catch:{ all -> 0x0348 }
            int r5 = r1.F     // Catch:{ all -> 0x0348 }
            boolean r12 = r1.G     // Catch:{ all -> 0x0348 }
            n2.u3 r2 = r1.L     // Catch:{ all -> 0x0348 }
            r23 = r15
            n2.w1 r15 = r0.f20716w     // Catch:{ all -> 0x0348 }
            r27 = r2
            r26 = r3
            long r2 = r0.f20717x     // Catch:{ all -> 0x0348 }
            r30 = r2
            boolean r2 = r1.N     // Catch:{ all -> 0x0348 }
            android.os.Looper r3 = r0.B     // Catch:{ all -> 0x0348 }
            r28 = r5
            r5 = r11
            r0 = r6
            r32 = r20
            r6 = r7
            r7 = r10
            r33 = r21
            r21 = r9
            r9 = r17
            r34 = r10
            r10 = r33
            r35 = r0
            r0 = r11
            r11 = r28
            r17 = 0
            r36 = r13
            r13 = r4
            r20 = r14
            r28 = r17
            r14 = r27
            r37 = r16
            r40 = r23
            r16 = r30
            r18 = r2
            r19 = r40
            r23 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0348 }
            r1.f20162k = r0     // Catch:{ all -> 0x0348 }
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.f20157h0 = r2     // Catch:{ all -> 0x0348 }
            r2 = 0
            r1.F = r2     // Catch:{ all -> 0x0348 }
            n2.e2 r3 = n2.e2.J     // Catch:{ all -> 0x0348 }
            r1.P = r3     // Catch:{ all -> 0x0348 }
            r1.Q = r3     // Catch:{ all -> 0x0348 }
            r1.f20177r0 = r3     // Catch:{ all -> 0x0348 }
            r3 = -1
            r1.f20181t0 = r3     // Catch:{ all -> 0x0348 }
            r3 = r35
            r5 = 21
            if (r3 >= r5) goto L_0x025c
            int r3 = r1.r1(r2)     // Catch:{ all -> 0x0348 }
            r1.f20153f0 = r3     // Catch:{ all -> 0x0348 }
            goto L_0x0262
        L_0x025c:
            int r3 = k4.n0.F(r26)     // Catch:{ all -> 0x0348 }
            r1.f20153f0 = r3     // Catch:{ all -> 0x0348 }
        L_0x0262:
            y3.e r3 = y3.e.f23862c     // Catch:{ all -> 0x0348 }
            r1.f20161j0 = r3     // Catch:{ all -> 0x0348 }
            r3 = 1
            r1.f20163k0 = r3     // Catch:{ all -> 0x0348 }
            r1.u(r4)     // Catch:{ all -> 0x0348 }
            android.os.Handler r5 = new android.os.Handler     // Catch:{ all -> 0x0348 }
            r6 = r40
            r5.<init>(r6)     // Catch:{ all -> 0x0348 }
            r6 = r33
            r6.i(r5, r4)     // Catch:{ all -> 0x0348 }
            r4 = r37
            r1.Y0(r4)     // Catch:{ all -> 0x0348 }
            r5 = r39
            long r6 = r5.f20696c     // Catch:{ all -> 0x0348 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x028a
            r0.u(r6)     // Catch:{ all -> 0x0348 }
        L_0x028a:
            n2.b r0 = new n2.b     // Catch:{ all -> 0x0348 }
            android.content.Context r6 = r5.f20694a     // Catch:{ all -> 0x0348 }
            r7 = r32
            r0.<init>(r6, r7, r4)     // Catch:{ all -> 0x0348 }
            r1.f20189z = r0     // Catch:{ all -> 0x0348 }
            boolean r6 = r5.f20708o     // Catch:{ all -> 0x0348 }
            r0.b(r6)     // Catch:{ all -> 0x0348 }
            n2.d r0 = new n2.d     // Catch:{ all -> 0x0348 }
            android.content.Context r6 = r5.f20694a     // Catch:{ all -> 0x0348 }
            r0.<init>(r6, r7, r4)     // Catch:{ all -> 0x0348 }
            r1.A = r0     // Catch:{ all -> 0x0348 }
            boolean r6 = r5.f20706m     // Catch:{ all -> 0x0348 }
            if (r6 == 0) goto L_0x02aa
            p2.e r14 = r1.f20155g0     // Catch:{ all -> 0x0348 }
            goto L_0x02ac
        L_0x02aa:
            r14 = r28
        L_0x02ac:
            r0.m(r14)     // Catch:{ all -> 0x0348 }
            n2.x3 r0 = new n2.x3     // Catch:{ all -> 0x0348 }
            android.content.Context r6 = r5.f20694a     // Catch:{ all -> 0x0348 }
            r0.<init>(r6, r7, r4)     // Catch:{ all -> 0x0348 }
            r1.B = r0     // Catch:{ all -> 0x0348 }
            p2.e r4 = r1.f20155g0     // Catch:{ all -> 0x0348 }
            int r4 = r4.f21243c     // Catch:{ all -> 0x0348 }
            int r4 = k4.n0.f0(r4)     // Catch:{ all -> 0x0348 }
            r0.h(r4)     // Catch:{ all -> 0x0348 }
            n2.i4 r4 = new n2.i4     // Catch:{ all -> 0x0348 }
            android.content.Context r6 = r5.f20694a     // Catch:{ all -> 0x0348 }
            r4.<init>(r6)     // Catch:{ all -> 0x0348 }
            r1.C = r4     // Catch:{ all -> 0x0348 }
            int r6 = r5.f20707n     // Catch:{ all -> 0x0348 }
            if (r6 == 0) goto L_0x02d2
            r12 = 1
            goto L_0x02d3
        L_0x02d2:
            r12 = 0
        L_0x02d3:
            r4.a(r12)     // Catch:{ all -> 0x0348 }
            n2.j4 r4 = new n2.j4     // Catch:{ all -> 0x0348 }
            android.content.Context r6 = r5.f20694a     // Catch:{ all -> 0x0348 }
            r4.<init>(r6)     // Catch:{ all -> 0x0348 }
            r1.D = r4     // Catch:{ all -> 0x0348 }
            int r5 = r5.f20707n     // Catch:{ all -> 0x0348 }
            r6 = 2
            if (r5 != r6) goto L_0x02e6
            r12 = 1
            goto L_0x02e7
        L_0x02e6:
            r12 = 0
        L_0x02e7:
            r4.a(r12)     // Catch:{ all -> 0x0348 }
            n2.o r0 = b1(r0)     // Catch:{ all -> 0x0348 }
            r1.f20173p0 = r0     // Catch:{ all -> 0x0348 }
            l4.z r0 = l4.z.f19998f     // Catch:{ all -> 0x0348 }
            r1.f20175q0 = r0     // Catch:{ all -> 0x0348 }
            k4.d0 r0 = k4.d0.f19685c     // Catch:{ all -> 0x0348 }
            r1.f20147c0 = r0     // Catch:{ all -> 0x0348 }
            p2.e r0 = r1.f20155g0     // Catch:{ all -> 0x0348 }
            r5 = r34
            r5.h(r0)     // Catch:{ all -> 0x0348 }
            int r0 = r1.f20153f0     // Catch:{ all -> 0x0348 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0348 }
            r2 = 10
            r1.Z1(r3, r2, r0)     // Catch:{ all -> 0x0348 }
            int r0 = r1.f20153f0     // Catch:{ all -> 0x0348 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0348 }
            r1.Z1(r6, r2, r0)     // Catch:{ all -> 0x0348 }
            p2.e r0 = r1.f20155g0     // Catch:{ all -> 0x0348 }
            r2 = 3
            r1.Z1(r3, r2, r0)     // Catch:{ all -> 0x0348 }
            int r0 = r1.f20143a0     // Catch:{ all -> 0x0348 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0348 }
            r2 = 4
            r1.Z1(r6, r2, r0)     // Catch:{ all -> 0x0348 }
            int r0 = r1.f20145b0     // Catch:{ all -> 0x0348 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0348 }
            r2 = 5
            r1.Z1(r6, r2, r0)     // Catch:{ all -> 0x0348 }
            boolean r0 = r1.f20159i0     // Catch:{ all -> 0x0348 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0348 }
            r2 = 9
            r1.Z1(r3, r2, r0)     // Catch:{ all -> 0x0348 }
            r0 = r36
            r2 = 7
            r1.Z1(r6, r2, r0)     // Catch:{ all -> 0x0348 }
            r2 = 8
            r3 = 6
            r1.Z1(r3, r2, r0)     // Catch:{ all -> 0x0348 }
            r24.e()
            return
        L_0x0348:
            r0 = move-exception
            k4.g r2 = r1.f20148d
            r2.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.b1.<init>(n2.s$b, n2.g3):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void D1(g3.d dVar) {
        dVar.N(this.O);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void F1(int i10, g3.e eVar, g3.e eVar2, g3.d dVar) {
        dVar.C(i10);
        dVar.A(eVar, eVar2, i10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void L1(d3 d3Var, g3.d dVar) {
        dVar.B(d3Var.f20270g);
        dVar.H(d3Var.f20270g);
    }

    private d3 S1(d3 d3Var, c4 c4Var, Pair<Object, Long> pair) {
        int i10;
        long j10;
        c4 c4Var2 = c4Var;
        Pair<Object, Long> pair2 = pair;
        k4.a.a(c4Var.u() || pair2 != null);
        c4 c4Var3 = d3Var.f20264a;
        d3 i11 = d3Var.i(c4Var);
        if (c4Var.u()) {
            x.b k10 = d3.k();
            long C0 = n0.C0(this.f20185v0);
            d3 b10 = i11.c(k10, C0, C0, C0, 0, z0.f21693d, this.f20144b, u.y()).b(k10);
            b10.f20279p = b10.f20281r;
            return b10;
        }
        Object obj = i11.f20265b.f21677a;
        boolean z10 = !obj.equals(((Pair) n0.j(pair)).first);
        x.b bVar = z10 ? new x.b(pair2.first) : i11.f20265b;
        long longValue = ((Long) pair2.second).longValue();
        long C02 = n0.C0(x());
        if (!c4Var3.u()) {
            C02 -= c4Var3.l(obj, this.f20168n).q();
        }
        if (z10 || longValue < C02) {
            x.b bVar2 = bVar;
            k4.a.f(!bVar2.b());
            x.b bVar3 = bVar2;
            d3 b11 = i11.c(bVar3, longValue, longValue, longValue, 0, z10 ? z0.f21693d : i11.f20271h, z10 ? this.f20144b : i11.f20272i, z10 ? u.y() : i11.f20273j).b(bVar3);
            b11.f20279p = longValue;
            return b11;
        }
        if (i10 == 0) {
            int f10 = c4Var2.f(i11.f20274k.f21677a);
            if (f10 == -1 || c4Var2.j(f10, this.f20168n).f20218c != c4Var2.l(bVar.f21677a, this.f20168n).f20218c) {
                c4Var2.l(bVar.f21677a, this.f20168n);
                if (bVar.b()) {
                    j10 = this.f20168n.e(bVar.f21678b, bVar.f21679c);
                } else {
                    j10 = this.f20168n.f20219d;
                }
                i11 = i11.c(bVar, i11.f20281r, i11.f20281r, i11.f20267d, j10 - i11.f20281r, i11.f20271h, i11.f20272i, i11.f20273j).b(bVar);
                i11.f20279p = j10;
            }
        } else {
            x.b bVar4 = bVar;
            k4.a.f(!bVar4.b());
            long max = Math.max(0, i11.f20280q - (longValue - C02));
            long j11 = i11.f20279p;
            if (i11.f20274k.equals(i11.f20265b)) {
                j11 = longValue + max;
            }
            i11 = i11.c(bVar4, longValue, longValue, longValue, max, i11.f20271h, i11.f20272i, i11.f20273j);
            i11.f20279p = j11;
        }
        return i11;
    }

    private Pair<Object, Long> T1(c4 c4Var, int i10, long j10) {
        if (c4Var.u()) {
            this.f20181t0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f20185v0 = j10;
            this.f20183u0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= c4Var.t()) {
            i10 = c4Var.e(this.G);
            j10 = c4Var.r(i10, this.f20282a).d();
        }
        return c4Var.n(this.f20282a, this.f20168n, i10, n0.C0(j10));
    }

    /* access modifiers changed from: private */
    public void U1(int i10, int i11) {
        if (i10 != this.f20147c0.b() || i11 != this.f20147c0.a()) {
            this.f20147c0 = new d0(i10, i11);
            this.f20164l.k(24, new u0(i10, i11));
        }
    }

    private long V1(c4 c4Var, x.b bVar, long j10) {
        c4Var.l(bVar.f21677a, this.f20168n);
        return j10 + this.f20168n.q();
    }

    private d3 W1(int i10, int i11) {
        int G2 = G();
        c4 J2 = J();
        int size = this.f20170o.size();
        boolean z10 = true;
        this.H++;
        X1(i10, i11);
        c4 c12 = c1();
        d3 S1 = S1(this.f20179s0, c12, k1(J2, c12));
        int i12 = S1.f20268e;
        if (i12 == 1 || i12 == 4 || i10 >= i11 || i11 != size || G2 < S1.f20264a.t()) {
            z10 = false;
        }
        if (z10) {
            S1 = S1.g(4);
        }
        this.f20162k.o0(i10, i11, this.M);
        return S1;
    }

    private void X1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f20170o.remove(i12);
        }
        this.M = this.M.c(i10, i11);
    }

    private void Y1() {
        if (this.X != null) {
            d1(this.f20188y).n(10000).m((Object) null).l();
            this.X.d(this.f20187x);
            this.X = null;
        }
        TextureView textureView = this.Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f20187x) {
                r.i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Z.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.Z = null;
        }
        SurfaceHolder surfaceHolder = this.W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f20187x);
            this.W = null;
        }
    }

    private List<x2.c> Z0(int i10, List<x> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            x2.c cVar = new x2.c(list.get(i11), this.f20172p);
            arrayList.add(cVar);
            this.f20170o.add(i11 + i10, new e(cVar.f20762b, cVar.f20761a.c0()));
        }
        this.M = this.M.g(i10, arrayList.size());
        return arrayList;
    }

    private void Z1(int i10, int i11, Object obj) {
        for (p3 p3Var : this.f20154g) {
            if (p3Var.f() == i10) {
                d1(p3Var).n(i11).m(obj).l();
            }
        }
    }

    /* access modifiers changed from: private */
    public e2 a1() {
        c4 J2 = J();
        if (J2.u()) {
            return this.f20177r0;
        }
        return this.f20177r0.b().J(J2.r(G(), this.f20282a).f20237c.f20788f).H();
    }

    /* access modifiers changed from: private */
    public void a2() {
        Z1(1, 2, Float.valueOf(this.f20157h0 * this.A.g()));
    }

    /* access modifiers changed from: private */
    public static o b1(x3 x3Var) {
        return new o(0, x3Var.d(), x3Var.c());
    }

    private c4 c1() {
        return new l3(this.f20170o, this.M);
    }

    private k3 d1(k3.b bVar) {
        int j12 = j1();
        n1 n1Var = this.f20162k;
        return new k3(n1Var, bVar, this.f20179s0.f20264a, j12 == -1 ? 0 : j12, this.f20186w, n1Var.C());
    }

    private void d2(List<x> list, int i10, long j10, boolean z10) {
        int i11;
        long j11;
        int i12 = i10;
        int j12 = j1();
        long currentPosition = getCurrentPosition();
        boolean z11 = true;
        this.H++;
        if (!this.f20170o.isEmpty()) {
            X1(0, this.f20170o.size());
        }
        List<x2.c> Z0 = Z0(0, list);
        c4 c12 = c1();
        if (c12.u() || i12 < c12.t()) {
            long j13 = j10;
            if (z10) {
                j11 = -9223372036854775807L;
                i11 = c12.e(this.G);
            } else if (i12 == -1) {
                i11 = j12;
                j11 = currentPosition;
            } else {
                i11 = i12;
                j11 = j13;
            }
            d3 S1 = S1(this.f20179s0, c12, T1(c12, i11, j11));
            int i13 = S1.f20268e;
            if (!(i11 == -1 || i13 == 1)) {
                i13 = (c12.u() || i11 >= c12.t()) ? 4 : 2;
            }
            d3 g10 = S1.g(i13);
            this.f20162k.O0(Z0, i11, n0.C0(j11), this.M);
            if (this.f20179s0.f20265b.f21677a.equals(g10.f20265b.f21677a) || this.f20179s0.f20264a.u()) {
                z11 = false;
            }
            k2(g10, 0, 1, false, z11, 4, i1(g10), -1, false);
            return;
        }
        throw new v1(c12, i12, j10);
    }

    private Pair<Boolean, Integer> e1(d3 d3Var, d3 d3Var2, boolean z10, int i10, boolean z11, boolean z12) {
        c4 c4Var = d3Var2.f20264a;
        c4 c4Var2 = d3Var.f20264a;
        if (c4Var2.u() && c4Var.u()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (c4Var2.u() != c4Var.u()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (!c4Var.r(c4Var.l(d3Var2.f20265b.f21677a, this.f20168n).f20218c, this.f20282a).f20235a.equals(c4Var2.r(c4Var2.l(d3Var.f20265b.f21677a, this.f20168n).f20218c, this.f20282a).f20235a)) {
            if (z10 && i10 == 0) {
                i11 = 1;
            } else if (z10 && i10 == 1) {
                i11 = 2;
            } else if (!z11) {
                throw new IllegalStateException();
            }
            return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
        } else if (z10 && i10 == 0 && d3Var2.f20265b.f21680d < d3Var.f20265b.f21680d) {
            return new Pair<>(Boolean.TRUE, 0);
        } else {
            if (!z10 || i10 != 1 || !z12) {
                return new Pair<>(Boolean.FALSE, -1);
            }
            return new Pair<>(Boolean.TRUE, 2);
        }
    }

    /* access modifiers changed from: private */
    public void e2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        f2(surface);
        this.V = surface;
    }

    /* access modifiers changed from: private */
    public void f2(Object obj) {
        boolean z10;
        ArrayList<k3> arrayList = new ArrayList<>();
        p3[] p3VarArr = this.f20154g;
        int length = p3VarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            p3 p3Var = p3VarArr[i10];
            if (p3Var.f() == 2) {
                arrayList.add(d1(p3Var).n(1).m(obj).l());
            }
            i10++;
        }
        Object obj2 = this.U;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                for (k3 a10 : arrayList) {
                    a10.a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.U;
            Surface surface = this.V;
            if (obj3 == surface) {
                surface.release();
                this.V = null;
            }
        }
        this.U = obj;
        if (z10) {
            h2(false, q.i(new p1(3), 1003));
        }
    }

    private void h2(boolean z10, q qVar) {
        d3 d3Var;
        if (z10) {
            d3Var = W1(0, this.f20170o.size()).e((q) null);
        } else {
            d3 d3Var2 = this.f20179s0;
            d3Var = d3Var2.b(d3Var2.f20265b);
            d3Var.f20279p = d3Var.f20281r;
            d3Var.f20280q = 0;
        }
        d3 g10 = d3Var.g(1);
        if (qVar != null) {
            g10 = g10.e(qVar);
        }
        d3 d3Var3 = g10;
        this.H++;
        this.f20162k.i1();
        k2(d3Var3, 0, 1, false, d3Var3.f20264a.u() && !this.f20179s0.f20264a.u(), 4, i1(d3Var3), -1, false);
    }

    private long i1(d3 d3Var) {
        if (d3Var.f20264a.u()) {
            return n0.C0(this.f20185v0);
        }
        if (d3Var.f20265b.b()) {
            return d3Var.f20281r;
        }
        return V1(d3Var.f20264a, d3Var.f20265b, d3Var.f20281r);
    }

    private void i2() {
        g3.b bVar = this.O;
        g3.b H2 = n0.H(this.f20152f, this.f20146c);
        this.O = H2;
        if (!H2.equals(bVar)) {
            this.f20164l.i(13, new w0(this));
        }
    }

    private int j1() {
        if (this.f20179s0.f20264a.u()) {
            return this.f20181t0;
        }
        d3 d3Var = this.f20179s0;
        return d3Var.f20264a.l(d3Var.f20265b.f21677a, this.f20168n).f20218c;
    }

    /* access modifiers changed from: private */
    public void j2(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        d3 d3Var = this.f20179s0;
        if (d3Var.f20275l != z11 || d3Var.f20276m != i12) {
            this.H++;
            d3 d10 = d3Var.d(z11, i12);
            this.f20162k.R0(z11, i12);
            k2(d10, 0, i11, false, false, 5, -9223372036854775807L, -1, false);
        }
    }

    private Pair<Object, Long> k1(c4 c4Var, c4 c4Var2) {
        long x10 = x();
        int i10 = -1;
        if (c4Var.u() || c4Var2.u()) {
            boolean z10 = !c4Var.u() && c4Var2.u();
            if (!z10) {
                i10 = j1();
            }
            if (z10) {
                x10 = -9223372036854775807L;
            }
            return T1(c4Var2, i10, x10);
        }
        Pair<Object, Long> n10 = c4Var.n(this.f20282a, this.f20168n, G(), n0.C0(x10));
        Object obj = ((Pair) n0.j(n10)).first;
        if (c4Var2.f(obj) != -1) {
            return n10;
        }
        Object z02 = n1.z0(this.f20282a, this.f20168n, this.F, this.G, obj, c4Var, c4Var2);
        if (z02 == null) {
            return T1(c4Var2, -1, -9223372036854775807L);
        }
        c4Var2.l(z02, this.f20168n);
        int i11 = this.f20168n.f20218c;
        return T1(c4Var2, i11, c4Var2.r(i11, this.f20282a).d());
    }

    private void k2(d3 d3Var, int i10, int i11, boolean z10, boolean z11, int i12, long j10, int i13, boolean z12) {
        d3 d3Var2 = d3Var;
        int i14 = i12;
        d3 d3Var3 = this.f20179s0;
        this.f20179s0 = d3Var2;
        boolean z13 = !d3Var3.f20264a.equals(d3Var2.f20264a);
        Pair<Boolean, Integer> e12 = e1(d3Var, d3Var3, z11, i12, z13, z12);
        boolean booleanValue = ((Boolean) e12.first).booleanValue();
        int intValue = ((Integer) e12.second).intValue();
        e2 e2Var = this.P;
        z1 z1Var = null;
        if (booleanValue) {
            if (!d3Var2.f20264a.u()) {
                z1Var = d3Var2.f20264a.r(d3Var2.f20264a.l(d3Var2.f20265b.f21677a, this.f20168n).f20218c, this.f20282a).f20237c;
            }
            this.f20177r0 = e2.J;
        }
        if (booleanValue || !d3Var3.f20273j.equals(d3Var2.f20273j)) {
            this.f20177r0 = this.f20177r0.b().L(d3Var2.f20273j).H();
            e2Var = a1();
        }
        boolean z14 = !e2Var.equals(this.P);
        this.P = e2Var;
        boolean z15 = d3Var3.f20275l != d3Var2.f20275l;
        boolean z16 = d3Var3.f20268e != d3Var2.f20268e;
        if (z16 || z15) {
            m2();
        }
        boolean z17 = d3Var3.f20270g;
        boolean z18 = d3Var2.f20270g;
        boolean z19 = z17 != z18;
        if (z19) {
            l2(z18);
        }
        if (z13) {
            this.f20164l.i(0, new j0(d3Var2, i10));
        }
        if (z11) {
            this.f20164l.i(11, new v0(i14, o1(i14, d3Var3, i13), n1(j10)));
        }
        if (booleanValue) {
            this.f20164l.i(1, new x0(z1Var, intValue));
        }
        if (d3Var3.f20269f != d3Var2.f20269f) {
            this.f20164l.i(10, new z0(d3Var2));
            if (d3Var2.f20269f != null) {
                this.f20164l.i(10, new g0(d3Var2));
            }
        }
        c0 c0Var = d3Var3.f20272i;
        c0 c0Var2 = d3Var2.f20272i;
        if (c0Var != c0Var2) {
            this.f20156h.e(c0Var2.f18967e);
            this.f20164l.i(2, new c0(d3Var2));
        }
        if (z14) {
            this.f20164l.i(14, new y0(this.P));
        }
        if (z19) {
            this.f20164l.i(3, new i0(d3Var2));
        }
        if (z16 || z15) {
            this.f20164l.i(-1, new h0(d3Var2));
        }
        if (z16) {
            this.f20164l.i(4, new a1(d3Var2));
        }
        if (z15) {
            this.f20164l.i(5, new k0(d3Var2, i11));
        }
        if (d3Var3.f20276m != d3Var2.f20276m) {
            this.f20164l.i(6, new d0(d3Var2));
        }
        if (s1(d3Var3) != s1(d3Var)) {
            this.f20164l.i(7, new f0(d3Var2));
        }
        if (!d3Var3.f20277n.equals(d3Var2.f20277n)) {
            this.f20164l.i(12, new e0(d3Var2));
        }
        if (z10) {
            this.f20164l.i(-1, q0.f36432a);
        }
        i2();
        this.f20164l.f();
        if (d3Var3.f20278o != d3Var2.f20278o) {
            Iterator<s.a> it = this.f20166m.iterator();
            while (it.hasNext()) {
                it.next().A(d3Var2.f20278o);
            }
        }
    }

    /* access modifiers changed from: private */
    public static int l1(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    private void l2(boolean z10) {
        k4.c0 c0Var = this.f20167m0;
        if (c0Var == null) {
            return;
        }
        if (z10 && !this.f20169n0) {
            c0Var.a(0);
            this.f20169n0 = true;
        } else if (!z10 && this.f20169n0) {
            c0Var.b(0);
            this.f20169n0 = false;
        }
    }

    /* access modifiers changed from: private */
    public void m2() {
        int b10 = b();
        boolean z10 = true;
        if (b10 != 1) {
            if (b10 == 2 || b10 == 3) {
                boolean f12 = f1();
                i4 i4Var = this.C;
                if (!m() || f12) {
                    z10 = false;
                }
                i4Var.b(z10);
                this.D.b(m());
                return;
            } else if (b10 != 4) {
                throw new IllegalStateException();
            }
        }
        this.C.b(false);
        this.D.b(false);
    }

    private g3.e n1(long j10) {
        int i10;
        Object obj;
        z1 z1Var;
        int G2 = G();
        Object obj2 = null;
        if (!this.f20179s0.f20264a.u()) {
            d3 d3Var = this.f20179s0;
            Object obj3 = d3Var.f20265b.f21677a;
            d3Var.f20264a.l(obj3, this.f20168n);
            i10 = this.f20179s0.f20264a.f(obj3);
            obj = obj3;
            obj2 = this.f20179s0.f20264a.r(G2, this.f20282a).f20235a;
            z1Var = this.f20282a.f20237c;
        } else {
            z1Var = null;
            obj = null;
            i10 = -1;
        }
        long Z0 = n0.Z0(j10);
        long Z02 = this.f20179s0.f20265b.b() ? n0.Z0(p1(this.f20179s0)) : Z0;
        x.b bVar = this.f20179s0.f20265b;
        return new g3.e(obj2, G2, z1Var, obj, i10, Z0, Z02, bVar.f21678b, bVar.f21679c);
    }

    private void n2() {
        this.f20148d.b();
        if (Thread.currentThread() != g1().getThread()) {
            String C2 = n0.C("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), g1().getThread().getName());
            if (!this.f20163k0) {
                r.j("ExoPlayerImpl", C2, this.f20165l0 ? null : new IllegalStateException());
                this.f20165l0 = true;
                return;
            }
            throw new IllegalStateException(C2);
        }
    }

    private g3.e o1(int i10, d3 d3Var, int i11) {
        int i12;
        Object obj;
        z1 z1Var;
        int i13;
        Object obj2;
        long j10;
        long j11;
        d3 d3Var2 = d3Var;
        c4.b bVar = new c4.b();
        if (!d3Var2.f20264a.u()) {
            Object obj3 = d3Var2.f20265b.f21677a;
            d3Var2.f20264a.l(obj3, bVar);
            int i14 = bVar.f20218c;
            i13 = i14;
            obj = obj3;
            i12 = d3Var2.f20264a.f(obj3);
            obj2 = d3Var2.f20264a.r(i14, this.f20282a).f20235a;
            z1Var = this.f20282a.f20237c;
        } else {
            i13 = i11;
            obj2 = null;
            z1Var = null;
            obj = null;
            i12 = -1;
        }
        if (i10 == 0) {
            if (d3Var2.f20265b.b()) {
                x.b bVar2 = d3Var2.f20265b;
                j11 = bVar.e(bVar2.f21678b, bVar2.f21679c);
                j10 = p1(d3Var);
                long Z0 = n0.Z0(j11);
                long Z02 = n0.Z0(j10);
                x.b bVar3 = d3Var2.f20265b;
                return new g3.e(obj2, i13, z1Var, obj, i12, Z0, Z02, bVar3.f21678b, bVar3.f21679c);
            } else if (d3Var2.f20265b.f21681e != -1) {
                j11 = p1(this.f20179s0);
            } else {
                j11 = bVar.f20220f + bVar.f20219d;
            }
        } else if (d3Var2.f20265b.b()) {
            j11 = d3Var2.f20281r;
            j10 = p1(d3Var);
            long Z03 = n0.Z0(j11);
            long Z022 = n0.Z0(j10);
            x.b bVar32 = d3Var2.f20265b;
            return new g3.e(obj2, i13, z1Var, obj, i12, Z03, Z022, bVar32.f21678b, bVar32.f21679c);
        } else {
            j11 = bVar.f20220f + d3Var2.f20281r;
        }
        j10 = j11;
        long Z032 = n0.Z0(j11);
        long Z0222 = n0.Z0(j10);
        x.b bVar322 = d3Var2.f20265b;
        return new g3.e(obj2, i13, z1Var, obj, i12, Z032, Z0222, bVar322.f21678b, bVar322.f21679c);
    }

    private static long p1(d3 d3Var) {
        c4.d dVar = new c4.d();
        c4.b bVar = new c4.b();
        d3Var.f20264a.l(d3Var.f20265b.f21677a, bVar);
        if (d3Var.f20266c == -9223372036854775807L) {
            return d3Var.f20264a.r(bVar.f20218c, dVar).e();
        }
        return bVar.q() + d3Var.f20266c;
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public void v1(n1.e eVar) {
        long j10;
        boolean z10;
        long j11;
        int i10 = this.H - eVar.f20585c;
        this.H = i10;
        boolean z11 = true;
        if (eVar.f20586d) {
            this.I = eVar.f20587e;
            this.J = true;
        }
        if (eVar.f20588f) {
            this.K = eVar.f20589g;
        }
        if (i10 == 0) {
            c4 c4Var = eVar.f20584b.f20264a;
            if (!this.f20179s0.f20264a.u() && c4Var.u()) {
                this.f20181t0 = -1;
                this.f20185v0 = 0;
                this.f20183u0 = 0;
            }
            if (!c4Var.u()) {
                List<c4> I2 = ((l3) c4Var).I();
                k4.a.f(I2.size() == this.f20170o.size());
                for (int i11 = 0; i11 < I2.size(); i11++) {
                    c4 unused = this.f20170o.get(i11).f20196b = I2.get(i11);
                }
            }
            if (this.J) {
                if (eVar.f20584b.f20265b.equals(this.f20179s0.f20265b) && eVar.f20584b.f20267d == this.f20179s0.f20281r) {
                    z11 = false;
                }
                if (z11) {
                    if (c4Var.u() || eVar.f20584b.f20265b.b()) {
                        j11 = eVar.f20584b.f20267d;
                    } else {
                        d3 d3Var = eVar.f20584b;
                        j11 = V1(c4Var, d3Var.f20265b, d3Var.f20267d);
                    }
                    j10 = j11;
                } else {
                    j10 = -9223372036854775807L;
                }
                z10 = z11;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.J = false;
            k2(eVar.f20584b, 1, this.K, false, z10, this.I, j10, -1, false);
        }
    }

    private int r1(int i10) {
        AudioTrack audioTrack = this.T;
        if (!(audioTrack == null || audioTrack.getAudioSessionId() == i10)) {
            this.T.release();
            this.T = null;
        }
        if (this.T == null) {
            this.T = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.T.getAudioSessionId();
    }

    private static boolean s1(d3 d3Var) {
        return d3Var.f20268e == 3 && d3Var.f20275l && d3Var.f20276m == 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u1(g3.d dVar, l lVar) {
        dVar.f0(this.f20152f, new g3.c(lVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w1(n1.e eVar) {
        this.f20158i.b(new b0(this, eVar));
    }

    public r1 B() {
        n2();
        return this.R;
    }

    public h4 C() {
        n2();
        return this.f20179s0.f20272i.f18966d;
    }

    public void D(boolean z10) {
        n2();
        this.f20162k.v(z10);
        Iterator<s.a> it = this.f20166m.iterator();
        while (it.hasNext()) {
            it.next().H(z10);
        }
    }

    public int F() {
        n2();
        if (i()) {
            return this.f20179s0.f20265b.f21678b;
        }
        return -1;
    }

    public int G() {
        n2();
        int j12 = j1();
        if (j12 == -1) {
            return 0;
        }
        return j12;
    }

    public int I() {
        n2();
        return this.f20179s0.f20276m;
    }

    public c4 J() {
        n2();
        return this.f20179s0.f20264a;
    }

    public boolean K() {
        n2();
        return this.G;
    }

    public void L(p2.e eVar, boolean z10) {
        n2();
        if (!this.f20171o0) {
            if (!n0.c(this.f20155g0, eVar)) {
                this.f20155g0 = eVar;
                Z1(1, 3, eVar);
                this.B.h(n0.f0(eVar.f21243c));
                this.f20164l.i(20, new l0(eVar));
            }
            this.A.m(z10 ? eVar : null);
            this.f20156h.h(eVar);
            boolean m10 = m();
            int p10 = this.A.p(m10, b());
            j2(m10, p10, l1(m10, p10));
            this.f20164l.f();
        }
    }

    public void S(int i10, long j10, int i11, boolean z10) {
        int i12 = i10;
        n2();
        int i13 = 1;
        k4.a.a(i12 >= 0);
        this.f20176r.Q();
        c4 c4Var = this.f20179s0.f20264a;
        if (c4Var.u() || i12 < c4Var.t()) {
            this.H++;
            if (i()) {
                r.i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                n1.e eVar = new n1.e(this.f20179s0);
                eVar.b(1);
                this.f20160j.a(eVar);
                return;
            }
            if (b() != 1) {
                i13 = 2;
            }
            int G2 = G();
            long j11 = j10;
            d3 S1 = S1(this.f20179s0.g(i13), c4Var, T1(c4Var, i10, j10));
            this.f20162k.B0(c4Var, i10, n0.C0(j10));
            k2(S1, 0, 1, true, true, 1, i1(S1), G2, z10);
        }
    }

    public void X0(o2.c cVar) {
        this.f20176r.n0((o2.c) k4.a.e(cVar));
    }

    public void Y0(s.a aVar) {
        this.f20166m.add(aVar);
    }

    public void a() {
        n2();
        boolean m10 = m();
        int i10 = 2;
        int p10 = this.A.p(m10, 2);
        j2(m10, p10, l1(m10, p10));
        d3 d3Var = this.f20179s0;
        if (d3Var.f20268e == 1) {
            d3 e10 = d3Var.e((q) null);
            if (e10.f20264a.u()) {
                i10 = 4;
            }
            d3 g10 = e10.g(i10);
            this.H++;
            this.f20162k.j0();
            k2(g10, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public int b() {
        n2();
        return this.f20179s0.f20268e;
    }

    public void b2(List<x> list) {
        n2();
        c2(list, true);
    }

    public void c(f3 f3Var) {
        n2();
        if (f3Var == null) {
            f3Var = f3.f20380d;
        }
        if (!this.f20179s0.f20277n.equals(f3Var)) {
            d3 f10 = this.f20179s0.f(f3Var);
            this.H++;
            this.f20162k.T0(f3Var);
            k2(f10, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public void c2(List<x> list, boolean z10) {
        n2();
        d2(list, -1, -9223372036854775807L, z10);
    }

    public void d(int i10) {
        n2();
        if (this.F != i10) {
            this.F = i10;
            this.f20162k.V0(i10);
            this.f20164l.i(8, new t0(i10));
            i2();
            this.f20164l.f();
        }
    }

    public f3 e() {
        n2();
        return this.f20179s0.f20277n;
    }

    public boolean f1() {
        n2();
        return this.f20179s0.f20278o;
    }

    public void g(boolean z10) {
        n2();
        if (this.f20159i0 != z10) {
            this.f20159i0 = z10;
            Z1(1, 9, Boolean.valueOf(z10));
            this.f20164l.k(23, new o0(z10));
        }
    }

    public Looper g1() {
        return this.f20178s;
    }

    public void g2(boolean z10) {
        n2();
        this.A.p(m(), 1);
        h2(z10, (q) null);
        this.f20161j0 = new y3.e(u.y(), this.f20179s0.f20281r);
    }

    public int getAudioSessionId() {
        n2();
        return this.f20153f0;
    }

    public long getCurrentPosition() {
        n2();
        return n0.Z0(i1(this.f20179s0));
    }

    public long getDuration() {
        n2();
        if (!i()) {
            return N();
        }
        d3 d3Var = this.f20179s0;
        x.b bVar = d3Var.f20265b;
        d3Var.f20264a.l(bVar.f21677a, this.f20168n);
        return n0.Z0(this.f20168n.e(bVar.f21678b, bVar.f21679c));
    }

    public void h(Surface surface) {
        n2();
        Y1();
        f2(surface);
        int i10 = surface == null ? 0 : -1;
        U1(i10, i10);
    }

    public long h1() {
        n2();
        if (this.f20179s0.f20264a.u()) {
            return this.f20185v0;
        }
        d3 d3Var = this.f20179s0;
        if (d3Var.f20274k.f21680d != d3Var.f20265b.f21680d) {
            return d3Var.f20264a.r(G(), this.f20282a).f();
        }
        long j10 = d3Var.f20279p;
        if (this.f20179s0.f20274k.b()) {
            d3 d3Var2 = this.f20179s0;
            c4.b l10 = d3Var2.f20264a.l(d3Var2.f20274k.f21677a, this.f20168n);
            long i10 = l10.i(this.f20179s0.f20274k.f21678b);
            j10 = i10 == Long.MIN_VALUE ? l10.f20219d : i10;
        }
        d3 d3Var3 = this.f20179s0;
        return n0.Z0(V1(d3Var3.f20264a, d3Var3.f20274k, j10));
    }

    public boolean i() {
        n2();
        return this.f20179s0.f20265b.b();
    }

    public long j() {
        n2();
        return n0.Z0(this.f20179s0.f20280q);
    }

    public int k() {
        n2();
        return this.F;
    }

    public boolean m() {
        n2();
        return this.f20179s0.f20275l;
    }

    /* renamed from: m1 */
    public q v() {
        n2();
        return this.f20179s0.f20269f;
    }

    public void n(boolean z10) {
        n2();
        if (this.G != z10) {
            this.G = z10;
            this.f20162k.Y0(z10);
            this.f20164l.i(9, new n0(z10));
            i2();
            this.f20164l.f();
        }
    }

    public void o(x xVar) {
        n2();
        b2(Collections.singletonList(xVar));
    }

    public int p() {
        n2();
        if (this.f20179s0.f20264a.u()) {
            return this.f20183u0;
        }
        d3 d3Var = this.f20179s0;
        return d3Var.f20264a.f(d3Var.f20265b.f21677a);
    }

    public void release() {
        AudioTrack audioTrack;
        r.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + "ExoPlayerLib/2.18.7" + "] [" + n0.f19742e + "] [" + o1.b() + "]");
        n2();
        if (n0.f19738a < 21 && (audioTrack = this.T) != null) {
            audioTrack.release();
            this.T = null;
        }
        this.f20189z.b(false);
        this.B.g();
        this.C.b(false);
        this.D.b(false);
        this.A.i();
        if (!this.f20162k.l0()) {
            this.f20164l.k(10, p0.f36429a);
        }
        this.f20164l.j();
        this.f20158i.k((Object) null);
        this.f20180t.b(this.f20176r);
        d3 g10 = this.f20179s0.g(1);
        this.f20179s0 = g10;
        d3 b10 = g10.b(g10.f20265b);
        this.f20179s0 = b10;
        b10.f20279p = b10.f20281r;
        this.f20179s0.f20280q = 0;
        this.f20176r.release();
        this.f20156h.f();
        Y1();
        Surface surface = this.V;
        if (surface != null) {
            surface.release();
            this.V = null;
        }
        if (this.f20169n0) {
            ((k4.c0) k4.a.e(this.f20167m0)).b(0);
            this.f20169n0 = false;
        }
        this.f20161j0 = y3.e.f23862c;
        this.f20171o0 = true;
    }

    public int s() {
        n2();
        if (i()) {
            return this.f20179s0.f20265b.f21679c;
        }
        return -1;
    }

    public void setVolume(float f10) {
        n2();
        float p10 = n0.p(f10, 0.0f, 1.0f);
        if (this.f20157h0 != p10) {
            this.f20157h0 = p10;
            a2();
            this.f20164l.k(22, new m0(p10));
        }
    }

    public void stop() {
        n2();
        g2(false);
    }

    public void u(g3.d dVar) {
        this.f20164l.c((g3.d) k4.a.e(dVar));
    }

    public void w(boolean z10) {
        n2();
        int p10 = this.A.p(z10, b());
        j2(z10, p10, l1(z10, p10));
    }

    public long x() {
        n2();
        if (!i()) {
            return getCurrentPosition();
        }
        d3 d3Var = this.f20179s0;
        d3Var.f20264a.l(d3Var.f20265b.f21677a, this.f20168n);
        d3 d3Var2 = this.f20179s0;
        if (d3Var2.f20266c == -9223372036854775807L) {
            return d3Var2.f20264a.r(G(), this.f20282a).d();
        }
        return this.f20168n.p() + n0.Z0(this.f20179s0.f20266c);
    }

    public long y() {
        n2();
        if (!i()) {
            return h1();
        }
        d3 d3Var = this.f20179s0;
        if (d3Var.f20274k.equals(d3Var.f20265b)) {
            return n0.Z0(this.f20179s0.f20279p);
        }
        return getDuration();
    }
}
