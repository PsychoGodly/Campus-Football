package n2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.facebook.ads.AdError;
import f3.a;
import i4.b0;
import i4.c0;
import i4.s;
import j4.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k4.n;
import k4.n0;
import k4.r;
import n2.c4;
import n2.k3;
import n2.l;
import n2.p3;
import n2.x2;
import n2.z1;
import o2.u1;
import p3.q0;
import p3.s0;
import p3.u;
import p3.x;
import p3.z0;
import r2.o;
import r6.v;
import s6.u;
import s6.y0;
import y3.o;

/* compiled from: ExoPlayerImplInternal */
final class n1 implements Handler.Callback, u.a, b0.a, x2.d, l.a, k3.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean G;
    private boolean H;
    /* access modifiers changed from: private */
    public boolean I;
    private boolean J;
    private int K;
    private h L;
    private long M;
    private int N;
    private boolean O;
    private q P;
    private long Q;
    private long R = -9223372036854775807L;

    /* renamed from: a  reason: collision with root package name */
    private final p3[] f20545a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<p3> f20546b;

    /* renamed from: c  reason: collision with root package name */
    private final r3[] f20547c;

    /* renamed from: d  reason: collision with root package name */
    private final b0 f20548d;

    /* renamed from: f  reason: collision with root package name */
    private final c0 f20549f;

    /* renamed from: g  reason: collision with root package name */
    private final x1 f20550g;

    /* renamed from: h  reason: collision with root package name */
    private final j4.f f20551h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final n f20552i;

    /* renamed from: j  reason: collision with root package name */
    private final HandlerThread f20553j;

    /* renamed from: k  reason: collision with root package name */
    private final Looper f20554k;

    /* renamed from: l  reason: collision with root package name */
    private final c4.d f20555l;

    /* renamed from: m  reason: collision with root package name */
    private final c4.b f20556m;

    /* renamed from: n  reason: collision with root package name */
    private final long f20557n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f20558o;

    /* renamed from: p  reason: collision with root package name */
    private final l f20559p;

    /* renamed from: q  reason: collision with root package name */
    private final ArrayList<d> f20560q;

    /* renamed from: r  reason: collision with root package name */
    private final k4.d f20561r;

    /* renamed from: s  reason: collision with root package name */
    private final f f20562s;

    /* renamed from: t  reason: collision with root package name */
    private final i2 f20563t;

    /* renamed from: u  reason: collision with root package name */
    private final x2 f20564u;

    /* renamed from: v  reason: collision with root package name */
    private final w1 f20565v;

    /* renamed from: w  reason: collision with root package name */
    private final long f20566w;

    /* renamed from: x  reason: collision with root package name */
    private u3 f20567x;

    /* renamed from: y  reason: collision with root package name */
    private d3 f20568y;

    /* renamed from: z  reason: collision with root package name */
    private e f20569z;

    /* compiled from: ExoPlayerImplInternal */
    class a implements p3.a {
        a() {
        }

        public void a() {
            boolean unused = n1.this.I = true;
        }

        public void b() {
            n1.this.f20552i.f(2);
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List<x2.c> f20571a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final s0 f20572b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f20573c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f20574d;

        /* synthetic */ b(List list, s0 s0Var, int i10, long j10, a aVar) {
            this(list, s0Var, i10, j10);
        }

        private b(List<x2.c> list, s0 s0Var, int i10, long j10) {
            this.f20571a = list;
            this.f20572b = s0Var;
            this.f20573c = i10;
            this.f20574d = j10;
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f20575a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20576b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20577c;

        /* renamed from: d  reason: collision with root package name */
        public final s0 f20578d;
    }

    /* compiled from: ExoPlayerImplInternal */
    private static final class d implements Comparable<d> {

        /* renamed from: a  reason: collision with root package name */
        public final k3 f20579a;

        /* renamed from: b  reason: collision with root package name */
        public int f20580b;

        /* renamed from: c  reason: collision with root package name */
        public long f20581c;

        /* renamed from: d  reason: collision with root package name */
        public Object f20582d;

        public d(k3 k3Var) {
            this.f20579a = k3Var;
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            Object obj = this.f20582d;
            if ((obj == null) != (dVar.f20582d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f20580b - dVar.f20580b;
            if (i10 != 0) {
                return i10;
            }
            return n0.o(this.f20581c, dVar.f20581c);
        }

        public void c(int i10, long j10, Object obj) {
            this.f20580b = i10;
            this.f20581c = j10;
            this.f20582d = obj;
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    public static final class e {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f20583a;

        /* renamed from: b  reason: collision with root package name */
        public d3 f20584b;

        /* renamed from: c  reason: collision with root package name */
        public int f20585c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f20586d;

        /* renamed from: e  reason: collision with root package name */
        public int f20587e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f20588f;

        /* renamed from: g  reason: collision with root package name */
        public int f20589g;

        public e(d3 d3Var) {
            this.f20584b = d3Var;
        }

        public void b(int i10) {
            this.f20583a |= i10 > 0;
            this.f20585c += i10;
        }

        public void c(int i10) {
            this.f20583a = true;
            this.f20588f = true;
            this.f20589g = i10;
        }

        public void d(d3 d3Var) {
            this.f20583a |= this.f20584b != d3Var;
            this.f20584b = d3Var;
        }

        public void e(int i10) {
            boolean z10 = true;
            if (!this.f20586d || this.f20587e == 5) {
                this.f20583a = true;
                this.f20586d = true;
                this.f20587e = i10;
                return;
            }
            if (i10 != 5) {
                z10 = false;
            }
            k4.a.a(z10);
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    public interface f {
        void a(e eVar);
    }

    /* compiled from: ExoPlayerImplInternal */
    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final x.b f20590a;

        /* renamed from: b  reason: collision with root package name */
        public final long f20591b;

        /* renamed from: c  reason: collision with root package name */
        public final long f20592c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f20593d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f20594e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f20595f;

        public g(x.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f20590a = bVar;
            this.f20591b = j10;
            this.f20592c = j11;
            this.f20593d = z10;
            this.f20594e = z11;
            this.f20595f = z12;
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    private static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final c4 f20596a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20597b;

        /* renamed from: c  reason: collision with root package name */
        public final long f20598c;

        public h(c4 c4Var, int i10, long j10) {
            this.f20596a = c4Var;
            this.f20597b = i10;
            this.f20598c = j10;
        }
    }

    public n1(p3[] p3VarArr, b0 b0Var, c0 c0Var, x1 x1Var, j4.f fVar, int i10, boolean z10, o2.a aVar, u3 u3Var, w1 w1Var, long j10, boolean z11, Looper looper, k4.d dVar, f fVar2, u1 u1Var, Looper looper2) {
        p3[] p3VarArr2 = p3VarArr;
        j4.f fVar3 = fVar;
        o2.a aVar2 = aVar;
        long j11 = j10;
        k4.d dVar2 = dVar;
        u1 u1Var2 = u1Var;
        Looper looper3 = looper2;
        this.f20562s = fVar2;
        this.f20545a = p3VarArr2;
        this.f20548d = b0Var;
        this.f20549f = c0Var;
        this.f20550g = x1Var;
        this.f20551h = fVar3;
        this.F = i10;
        this.G = z10;
        this.f20567x = u3Var;
        this.f20565v = w1Var;
        this.f20566w = j11;
        this.Q = j11;
        this.B = z11;
        this.f20561r = dVar2;
        this.f20557n = x1Var.c();
        this.f20558o = x1Var.a();
        d3 j12 = d3.j(c0Var);
        this.f20568y = j12;
        this.f20569z = new e(j12);
        this.f20547c = new r3[p3VarArr2.length];
        for (int i11 = 0; i11 < p3VarArr2.length; i11++) {
            p3VarArr2[i11].i(i11, u1Var2);
            this.f20547c[i11] = p3VarArr2[i11].k();
        }
        this.f20559p = new l(this, dVar2);
        this.f20560q = new ArrayList<>();
        this.f20546b = y0.h();
        this.f20555l = new c4.d();
        this.f20556m = new c4.b();
        b0Var.b(this, fVar3);
        this.O = true;
        n d10 = dVar2.d(looper, (Handler.Callback) null);
        this.f20563t = new i2(aVar2, d10);
        this.f20564u = new x2(this, aVar2, d10, u1Var2);
        if (looper3 != null) {
            this.f20553j = null;
            this.f20554k = looper3;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f20553j = handlerThread;
            handlerThread.start();
            this.f20554k = handlerThread.getLooper();
        }
        this.f20552i = dVar2.d(this.f20554k, this);
    }

    private long A() {
        f2 q10 = this.f20563t.q();
        if (q10 == null) {
            return 0;
        }
        long l10 = q10.l();
        if (!q10.f20368d) {
            return l10;
        }
        int i10 = 0;
        while (true) {
            p3[] p3VarArr = this.f20545a;
            if (i10 >= p3VarArr.length) {
                return l10;
            }
            if (R(p3VarArr[i10]) && this.f20545a[i10].q() == q10.f20367c[i10]) {
                long t10 = this.f20545a[i10].t();
                if (t10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l10 = Math.max(t10, l10);
            }
            i10++;
        }
    }

    private void A0(long j10, long j11) {
        this.f20552i.h(2, j10 + j11);
    }

    private Pair<x.b, Long> B(c4 c4Var) {
        long j10 = 0;
        if (c4Var.u()) {
            return Pair.create(d3.k(), 0L);
        }
        c4 c4Var2 = c4Var;
        Pair<Object, Long> n10 = c4Var2.n(this.f20555l, this.f20556m, c4Var.e(this.G), -9223372036854775807L);
        x.b B2 = this.f20563t.B(c4Var, n10.first, 0);
        long longValue = ((Long) n10.second).longValue();
        if (B2.b()) {
            c4Var.l(B2.f21677a, this.f20556m);
            if (B2.f21679c == this.f20556m.n(B2.f21678b)) {
                j10 = this.f20556m.j();
            }
            longValue = j10;
        }
        return Pair.create(B2, Long.valueOf(longValue));
    }

    private void C0(boolean z10) throws q {
        x.b bVar = this.f20563t.p().f20370f.f20388a;
        long F0 = F0(bVar, this.f20568y.f20281r, true, false);
        if (F0 != this.f20568y.f20281r) {
            d3 d3Var = this.f20568y;
            this.f20568y = M(bVar, F0, d3Var.f20266c, d3Var.f20267d, z10, 5);
        }
    }

    private long D() {
        return E(this.f20568y.f20279p);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ab A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ae A[Catch:{ all -> 0x0146 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void D0(n2.n1.h r20) throws n2.q {
        /*
            r19 = this;
            r11 = r19
            r0 = r20
            n2.n1$e r1 = r11.f20569z
            r8 = 1
            r1.b(r8)
            n2.d3 r1 = r11.f20568y
            n2.c4 r1 = r1.f20264a
            int r4 = r11.F
            boolean r5 = r11.G
            n2.c4$d r6 = r11.f20555l
            n2.c4$b r7 = r11.f20556m
            r3 = 1
            r2 = r20
            android.util.Pair r1 = y0(r1, r2, r3, r4, r5, r6, r7)
            r2 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            if (r1 != 0) goto L_0x004b
            n2.d3 r7 = r11.f20568y
            n2.c4 r7 = r7.f20264a
            android.util.Pair r7 = r11.B(r7)
            java.lang.Object r9 = r7.first
            p3.x$b r9 = (p3.x.b) r9
            java.lang.Object r7 = r7.second
            java.lang.Long r7 = (java.lang.Long) r7
            long r12 = r7.longValue()
            n2.d3 r7 = r11.f20568y
            n2.c4 r7 = r7.f20264a
            boolean r7 = r7.u()
            r7 = r7 ^ r8
            r10 = r7
            r17 = r4
        L_0x0047:
            r4 = r12
            r12 = r17
            goto L_0x00a1
        L_0x004b:
            java.lang.Object r7 = r1.first
            java.lang.Object r9 = r1.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            long r9 = r0.f20598c
            int r14 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r14 != 0) goto L_0x005d
            r9 = r4
            goto L_0x005e
        L_0x005d:
            r9 = r12
        L_0x005e:
            n2.i2 r14 = r11.f20563t
            n2.d3 r15 = r11.f20568y
            n2.c4 r15 = r15.f20264a
            p3.x$b r7 = r14.B(r15, r7, r12)
            boolean r14 = r7.b()
            if (r14 == 0) goto L_0x0093
            n2.d3 r4 = r11.f20568y
            n2.c4 r4 = r4.f20264a
            java.lang.Object r5 = r7.f21677a
            n2.c4$b r12 = r11.f20556m
            r4.l(r5, r12)
            n2.c4$b r4 = r11.f20556m
            int r5 = r7.f21678b
            int r4 = r4.n(r5)
            int r5 = r7.f21679c
            if (r4 != r5) goto L_0x008d
            n2.c4$b r4 = r11.f20556m
            long r4 = r4.j()
            r12 = r4
            goto L_0x008e
        L_0x008d:
            r12 = r2
        L_0x008e:
            r4 = r12
            r12 = r9
            r10 = 1
            r9 = r7
            goto L_0x00a1
        L_0x0093:
            long r14 = r0.f20598c
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x009b
            r4 = 1
            goto L_0x009c
        L_0x009b:
            r4 = 0
        L_0x009c:
            r17 = r9
            r10 = r4
            r9 = r7
            goto L_0x0047
        L_0x00a1:
            n2.d3 r7 = r11.f20568y     // Catch:{ all -> 0x0146 }
            n2.c4 r7 = r7.f20264a     // Catch:{ all -> 0x0146 }
            boolean r7 = r7.u()     // Catch:{ all -> 0x0146 }
            if (r7 == 0) goto L_0x00ae
            r11.L = r0     // Catch:{ all -> 0x0146 }
            goto L_0x00bd
        L_0x00ae:
            r0 = 4
            if (r1 != 0) goto L_0x00c0
            n2.d3 r1 = r11.f20568y     // Catch:{ all -> 0x0146 }
            int r1 = r1.f20268e     // Catch:{ all -> 0x0146 }
            if (r1 == r8) goto L_0x00ba
            r11.b1(r0)     // Catch:{ all -> 0x0146 }
        L_0x00ba:
            r11.r0(r6, r8, r6, r8)     // Catch:{ all -> 0x0146 }
        L_0x00bd:
            r7 = r4
            goto L_0x0134
        L_0x00c0:
            n2.d3 r1 = r11.f20568y     // Catch:{ all -> 0x0146 }
            p3.x$b r1 = r1.f20265b     // Catch:{ all -> 0x0146 }
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x0146 }
            if (r1 == 0) goto L_0x010f
            n2.i2 r1 = r11.f20563t     // Catch:{ all -> 0x0146 }
            n2.f2 r1 = r1.p()     // Catch:{ all -> 0x0146 }
            if (r1 == 0) goto L_0x00e3
            boolean r7 = r1.f20368d     // Catch:{ all -> 0x0146 }
            if (r7 == 0) goto L_0x00e3
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x00e3
            p3.u r1 = r1.f20365a     // Catch:{ all -> 0x0146 }
            n2.u3 r2 = r11.f20567x     // Catch:{ all -> 0x0146 }
            long r1 = r1.d(r4, r2)     // Catch:{ all -> 0x0146 }
            goto L_0x00e4
        L_0x00e3:
            r1 = r4
        L_0x00e4:
            long r14 = k4.n0.Z0(r1)     // Catch:{ all -> 0x0146 }
            n2.d3 r3 = r11.f20568y     // Catch:{ all -> 0x0146 }
            long r6 = r3.f20281r     // Catch:{ all -> 0x0146 }
            long r6 = k4.n0.Z0(r6)     // Catch:{ all -> 0x0146 }
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0110
            n2.d3 r3 = r11.f20568y     // Catch:{ all -> 0x0146 }
            int r6 = r3.f20268e     // Catch:{ all -> 0x0146 }
            r7 = 2
            if (r6 == r7) goto L_0x00fe
            r7 = 3
            if (r6 != r7) goto L_0x0110
        L_0x00fe:
            long r7 = r3.f20281r     // Catch:{ all -> 0x0146 }
            r0 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            n2.d3 r0 = r1.M(r2, r3, r5, r7, r9, r10)
            r11.f20568y = r0
            return
        L_0x010f:
            r1 = r4
        L_0x0110:
            n2.d3 r3 = r11.f20568y     // Catch:{ all -> 0x0146 }
            int r3 = r3.f20268e     // Catch:{ all -> 0x0146 }
            if (r3 != r0) goto L_0x0118
            r0 = 1
            goto L_0x0119
        L_0x0118:
            r0 = 0
        L_0x0119:
            long r14 = r11.E0(r9, r1, r0)     // Catch:{ all -> 0x0146 }
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r8 = 0
        L_0x0123:
            r10 = r10 | r8
            n2.d3 r0 = r11.f20568y     // Catch:{ all -> 0x0143 }
            n2.c4 r4 = r0.f20264a     // Catch:{ all -> 0x0143 }
            p3.x$b r5 = r0.f20265b     // Catch:{ all -> 0x0143 }
            r8 = 1
            r1 = r19
            r2 = r4
            r3 = r9
            r6 = r12
            r1.p1(r2, r3, r4, r5, r6, r8)     // Catch:{ all -> 0x0143 }
            r7 = r14
        L_0x0134:
            r0 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            n2.d3 r0 = r1.M(r2, r3, r5, r7, r9, r10)
            r11.f20568y = r0
            return
        L_0x0143:
            r0 = move-exception
            r7 = r14
            goto L_0x0148
        L_0x0146:
            r0 = move-exception
            r7 = r4
        L_0x0148:
            r14 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r14
            n2.d3 r1 = r1.M(r2, r3, r5, r7, r9, r10)
            r11.f20568y = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.n1.D0(n2.n1$h):void");
    }

    private long E(long j10) {
        f2 j11 = this.f20563t.j();
        if (j11 == null) {
            return 0;
        }
        return Math.max(0, j10 - j11.y(this.M));
    }

    private long E0(x.b bVar, long j10, boolean z10) throws q {
        return F0(bVar, j10, this.f20563t.p() != this.f20563t.q(), z10);
    }

    private void F(u uVar) {
        if (this.f20563t.v(uVar)) {
            this.f20563t.y(this.M);
            W();
        }
    }

    private long F0(x.b bVar, long j10, boolean z10, boolean z11) throws q {
        k1();
        this.D = false;
        if (z11 || this.f20568y.f20268e == 3) {
            b1(2);
        }
        f2 p10 = this.f20563t.p();
        f2 f2Var = p10;
        while (f2Var != null && !bVar.equals(f2Var.f20370f.f20388a)) {
            f2Var = f2Var.j();
        }
        if (z10 || p10 != f2Var || (f2Var != null && f2Var.z(j10) < 0)) {
            for (p3 o10 : this.f20545a) {
                o(o10);
            }
            if (f2Var != null) {
                while (this.f20563t.p() != f2Var) {
                    this.f20563t.b();
                }
                this.f20563t.z(f2Var);
                f2Var.x(1000000000000L);
                r();
            }
        }
        if (f2Var != null) {
            this.f20563t.z(f2Var);
            if (!f2Var.f20368d) {
                f2Var.f20370f = f2Var.f20370f.b(j10);
            } else if (f2Var.f20369e) {
                long n10 = f2Var.f20365a.n(j10);
                f2Var.f20365a.t(n10 - this.f20557n, this.f20558o);
                j10 = n10;
            }
            t0(j10);
            W();
        } else {
            this.f20563t.f();
            t0(j10);
        }
        H(false);
        this.f20552i.f(2);
        return j10;
    }

    private void G(IOException iOException, int i10) {
        q g10 = q.g(iOException, i10);
        f2 p10 = this.f20563t.p();
        if (p10 != null) {
            g10 = g10.e(p10.f20370f.f20388a);
        }
        r.d("ExoPlayerImplInternal", "Playback error", g10);
        j1(false, false);
        this.f20568y = this.f20568y.e(g10);
    }

    private void G0(k3 k3Var) throws q {
        if (k3Var.f() == -9223372036854775807L) {
            H0(k3Var);
        } else if (this.f20568y.f20264a.u()) {
            this.f20560q.add(new d(k3Var));
        } else {
            d dVar = new d(k3Var);
            c4 c4Var = this.f20568y.f20264a;
            if (v0(dVar, c4Var, c4Var, this.F, this.G, this.f20555l, this.f20556m)) {
                this.f20560q.add(dVar);
                Collections.sort(this.f20560q);
                return;
            }
            k3Var.k(false);
        }
    }

    private void H(boolean z10) {
        long j10;
        f2 j11 = this.f20563t.j();
        x.b bVar = j11 == null ? this.f20568y.f20265b : j11.f20370f.f20388a;
        boolean z11 = !this.f20568y.f20274k.equals(bVar);
        if (z11) {
            this.f20568y = this.f20568y.b(bVar);
        }
        d3 d3Var = this.f20568y;
        if (j11 == null) {
            j10 = d3Var.f20281r;
        } else {
            j10 = j11.i();
        }
        d3Var.f20279p = j10;
        this.f20568y.f20280q = D();
        if ((z11 || z10) && j11 != null && j11.f20368d) {
            m1(j11.n(), j11.o());
        }
    }

    private void H0(k3 k3Var) throws q {
        if (k3Var.c() == this.f20554k) {
            n(k3Var);
            int i10 = this.f20568y.f20268e;
            if (i10 == 3 || i10 == 2) {
                this.f20552i.f(2);
                return;
            }
            return;
        }
        this.f20552i.j(15, k3Var).a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void I(n2.c4 r28, boolean r29) throws n2.q {
        /*
            r27 = this;
            r11 = r27
            r12 = r28
            n2.d3 r2 = r11.f20568y
            n2.n1$h r3 = r11.L
            n2.i2 r4 = r11.f20563t
            int r5 = r11.F
            boolean r6 = r11.G
            n2.c4$d r7 = r11.f20555l
            n2.c4$b r8 = r11.f20556m
            r1 = r28
            n2.n1$g r7 = x0(r1, r2, r3, r4, r5, r6, r7, r8)
            p3.x$b r9 = r7.f20590a
            long r13 = r7.f20592c
            boolean r0 = r7.f20593d
            long r5 = r7.f20591b
            n2.d3 r1 = r11.f20568y
            p3.x$b r1 = r1.f20265b
            boolean r1 = r1.equals(r9)
            r10 = 1
            r15 = 0
            if (r1 == 0) goto L_0x0038
            n2.d3 r1 = r11.f20568y
            long r1 = r1.f20281r
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            r16 = 0
            goto L_0x003a
        L_0x0038:
            r16 = 1
        L_0x003a:
            r17 = 3
            r8 = 0
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 4
            boolean r1 = r7.f20594e     // Catch:{ all -> 0x013d }
            if (r1 == 0) goto L_0x0053
            n2.d3 r1 = r11.f20568y     // Catch:{ all -> 0x013d }
            int r1 = r1.f20268e     // Catch:{ all -> 0x013d }
            if (r1 == r10) goto L_0x0050
            r11.b1(r4)     // Catch:{ all -> 0x013d }
        L_0x0050:
            r11.r0(r15, r15, r15, r10)     // Catch:{ all -> 0x013d }
        L_0x0053:
            if (r16 != 0) goto L_0x0077
            n2.i2 r1 = r11.f20563t     // Catch:{ all -> 0x0070 }
            long r3 = r11.M     // Catch:{ all -> 0x0070 }
            long r22 = r27.A()     // Catch:{ all -> 0x0070 }
            r2 = r28
            r10 = -1
            r20 = 4
            r25 = r5
            r5 = r22
            boolean r0 = r1.F(r2, r3, r5)     // Catch:{ all -> 0x0138 }
            if (r0 != 0) goto L_0x00b5
            r11.C0(r15)     // Catch:{ all -> 0x0138 }
            goto L_0x00b5
        L_0x0070:
            r0 = move-exception
            r10 = -1
            r20 = 4
        L_0x0074:
            r15 = r8
            goto L_0x0142
        L_0x0077:
            r25 = r5
            r10 = -1
            r20 = 4
            boolean r1 = r28.u()     // Catch:{ all -> 0x0138 }
            if (r1 != 0) goto L_0x00b5
            n2.i2 r1 = r11.f20563t     // Catch:{ all -> 0x00b1 }
            n2.f2 r1 = r1.p()     // Catch:{ all -> 0x00b1 }
        L_0x0088:
            if (r1 == 0) goto L_0x00a6
            n2.g2 r2 = r1.f20370f     // Catch:{ all -> 0x0138 }
            p3.x$b r2 = r2.f20388a     // Catch:{ all -> 0x0138 }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x0138 }
            if (r2 == 0) goto L_0x00a1
            n2.i2 r2 = r11.f20563t     // Catch:{ all -> 0x0138 }
            n2.g2 r3 = r1.f20370f     // Catch:{ all -> 0x0138 }
            n2.g2 r2 = r2.r(r12, r3)     // Catch:{ all -> 0x0138 }
            r1.f20370f = r2     // Catch:{ all -> 0x0138 }
            r1.A()     // Catch:{ all -> 0x0138 }
        L_0x00a1:
            n2.f2 r1 = r1.j()     // Catch:{ all -> 0x0138 }
            goto L_0x0088
        L_0x00a6:
            r5 = r25
            long r0 = r11.E0(r9, r5, r0)     // Catch:{ all -> 0x00af }
            r21 = r0
            goto L_0x00b9
        L_0x00af:
            r0 = move-exception
            goto L_0x0074
        L_0x00b1:
            r0 = move-exception
            r5 = r25
            goto L_0x0074
        L_0x00b5:
            r5 = r25
            r21 = r5
        L_0x00b9:
            n2.d3 r0 = r11.f20568y
            n2.c4 r4 = r0.f20264a
            p3.x$b r5 = r0.f20265b
            boolean r0 = r7.f20595f
            if (r0 == 0) goto L_0x00c6
            r6 = r21
            goto L_0x00c8
        L_0x00c6:
            r6 = r18
        L_0x00c8:
            r0 = 0
            r1 = r27
            r2 = r28
            r3 = r9
            r15 = r8
            r8 = r0
            r1.p1(r2, r3, r4, r5, r6, r8)
            if (r16 != 0) goto L_0x00dd
            n2.d3 r0 = r11.f20568y
            long r0 = r0.f20266c
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0119
        L_0x00dd:
            n2.d3 r0 = r11.f20568y
            p3.x$b r1 = r0.f20265b
            java.lang.Object r1 = r1.f21677a
            n2.c4 r0 = r0.f20264a
            if (r16 == 0) goto L_0x00fc
            if (r29 == 0) goto L_0x00fc
            boolean r2 = r0.u()
            if (r2 != 0) goto L_0x00fc
            n2.c4$b r2 = r11.f20556m
            n2.c4$b r0 = r0.l(r1, r2)
            boolean r0 = r0.f20221g
            if (r0 != 0) goto L_0x00fc
            r24 = 1
            goto L_0x00fe
        L_0x00fc:
            r24 = 0
        L_0x00fe:
            n2.d3 r0 = r11.f20568y
            long r7 = r0.f20267d
            int r0 = r12.f(r1)
            if (r0 != r10) goto L_0x010a
            r10 = 4
            goto L_0x010b
        L_0x010a:
            r10 = 3
        L_0x010b:
            r1 = r27
            r2 = r9
            r3 = r21
            r5 = r13
            r9 = r24
            n2.d3 r0 = r1.M(r2, r3, r5, r7, r9, r10)
            r11.f20568y = r0
        L_0x0119:
            r27.s0()
            n2.d3 r0 = r11.f20568y
            n2.c4 r0 = r0.f20264a
            r11.w0(r12, r0)
            n2.d3 r0 = r11.f20568y
            n2.d3 r0 = r0.i(r12)
            r11.f20568y = r0
            boolean r0 = r28.u()
            if (r0 != 0) goto L_0x0133
            r11.L = r15
        L_0x0133:
            r1 = 0
            r11.H(r1)
            return
        L_0x0138:
            r0 = move-exception
            r15 = r8
            r5 = r25
            goto L_0x0142
        L_0x013d:
            r0 = move-exception
            r15 = r8
            r10 = -1
            r20 = 4
        L_0x0142:
            n2.d3 r1 = r11.f20568y
            n2.c4 r4 = r1.f20264a
            p3.x$b r8 = r1.f20265b
            boolean r1 = r7.f20595f
            if (r1 == 0) goto L_0x014e
            r18 = r5
        L_0x014e:
            r21 = 0
            r1 = r27
            r2 = r28
            r3 = r9
            r25 = r5
            r5 = r8
            r6 = r18
            r8 = r21
            r1.p1(r2, r3, r4, r5, r6, r8)
            if (r16 != 0) goto L_0x0169
            n2.d3 r1 = r11.f20568y
            long r1 = r1.f20266c
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x01a5
        L_0x0169:
            n2.d3 r1 = r11.f20568y
            p3.x$b r2 = r1.f20265b
            java.lang.Object r2 = r2.f21677a
            n2.c4 r1 = r1.f20264a
            if (r16 == 0) goto L_0x0188
            if (r29 == 0) goto L_0x0188
            boolean r3 = r1.u()
            if (r3 != 0) goto L_0x0188
            n2.c4$b r3 = r11.f20556m
            n2.c4$b r1 = r1.l(r2, r3)
            boolean r1 = r1.f20221g
            if (r1 != 0) goto L_0x0188
            r24 = 1
            goto L_0x018a
        L_0x0188:
            r24 = 0
        L_0x018a:
            n2.d3 r1 = r11.f20568y
            long r7 = r1.f20267d
            int r1 = r12.f(r2)
            if (r1 != r10) goto L_0x0196
            r10 = 4
            goto L_0x0197
        L_0x0196:
            r10 = 3
        L_0x0197:
            r1 = r27
            r2 = r9
            r3 = r25
            r5 = r13
            r9 = r24
            n2.d3 r1 = r1.M(r2, r3, r5, r7, r9, r10)
            r11.f20568y = r1
        L_0x01a5:
            r27.s0()
            n2.d3 r1 = r11.f20568y
            n2.c4 r1 = r1.f20264a
            r11.w0(r12, r1)
            n2.d3 r1 = r11.f20568y
            n2.d3 r1 = r1.i(r12)
            r11.f20568y = r1
            boolean r1 = r28.u()
            if (r1 != 0) goto L_0x01bf
            r11.L = r15
        L_0x01bf:
            r1 = 0
            r11.H(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.n1.I(n2.c4, boolean):void");
    }

    private void I0(k3 k3Var) {
        Looper c10 = k3Var.c();
        if (!c10.getThread().isAlive()) {
            r.i("TAG", "Trying to send message on a dead thread.");
            k3Var.k(false);
            return;
        }
        this.f20561r.d(c10, (Handler.Callback) null).b(new l1(this, k3Var));
    }

    private void J(u uVar) throws q {
        if (this.f20563t.v(uVar)) {
            f2 j10 = this.f20563t.j();
            j10.p(this.f20559p.e().f20384a, this.f20568y.f20264a);
            m1(j10.n(), j10.o());
            if (j10 == this.f20563t.p()) {
                t0(j10.f20370f.f20389b);
                r();
                d3 d3Var = this.f20568y;
                x.b bVar = d3Var.f20265b;
                long j11 = j10.f20370f.f20389b;
                this.f20568y = M(bVar, j11, d3Var.f20266c, j11, false, 5);
            }
            W();
        }
    }

    private void J0(long j10) {
        for (p3 p3Var : this.f20545a) {
            if (p3Var.q() != null) {
                K0(p3Var, j10);
            }
        }
    }

    private void K(f3 f3Var, float f10, boolean z10, boolean z11) throws q {
        if (z10) {
            if (z11) {
                this.f20569z.b(1);
            }
            this.f20568y = this.f20568y.f(f3Var);
        }
        q1(f3Var.f20384a);
        for (p3 p3Var : this.f20545a) {
            if (p3Var != null) {
                p3Var.m(f10, f3Var.f20384a);
            }
        }
    }

    private void K0(p3 p3Var, long j10) {
        p3Var.j();
        if (p3Var instanceof o) {
            ((o) p3Var).Z(j10);
        }
    }

    private void L(f3 f3Var, boolean z10) throws q {
        K(f3Var, f3Var.f20384a, true, z10);
    }

    private void L0(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.H != z10) {
            this.H = z10;
            if (!z10) {
                for (p3 p3Var : this.f20545a) {
                    if (!R(p3Var) && this.f20546b.remove(p3Var)) {
                        p3Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private d3 M(x.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        s6.u<f3.a> uVar;
        c0 c0Var;
        z0 z0Var;
        z0 z0Var2;
        c0 c0Var2;
        x.b bVar2 = bVar;
        long j13 = j11;
        this.O = this.O || j10 != this.f20568y.f20281r || !bVar.equals(this.f20568y.f20265b);
        s0();
        d3 d3Var = this.f20568y;
        z0 z0Var3 = d3Var.f20271h;
        c0 c0Var3 = d3Var.f20272i;
        List<f3.a> list = d3Var.f20273j;
        if (this.f20564u.s()) {
            f2 p10 = this.f20563t.p();
            if (p10 == null) {
                z0Var2 = z0.f21693d;
            } else {
                z0Var2 = p10.n();
            }
            if (p10 == null) {
                c0Var2 = this.f20549f;
            } else {
                c0Var2 = p10.o();
            }
            s6.u<f3.a> w10 = w(c0Var2.f18965c);
            if (p10 != null) {
                g2 g2Var = p10.f20370f;
                if (g2Var.f20390c != j13) {
                    p10.f20370f = g2Var.a(j13);
                }
            }
            z0Var = z0Var2;
            c0Var = c0Var2;
            uVar = w10;
        } else if (!bVar.equals(this.f20568y.f20265b)) {
            z0Var = z0.f21693d;
            c0Var = this.f20549f;
            uVar = s6.u.y();
        } else {
            uVar = list;
            z0Var = z0Var3;
            c0Var = c0Var3;
        }
        if (z10) {
            this.f20569z.e(i10);
        }
        return this.f20568y.c(bVar, j10, j11, j12, D(), z0Var, c0Var, uVar);
    }

    private void M0(f3 f3Var) {
        this.f20552i.i(16);
        this.f20559p.c(f3Var);
    }

    private boolean N(p3 p3Var, f2 f2Var) {
        f2 j10 = f2Var.j();
        return f2Var.f20370f.f20393f && j10.f20368d && ((p3Var instanceof o) || (p3Var instanceof f3.g) || p3Var.t() >= j10.m());
    }

    private void N0(b bVar) throws q {
        this.f20569z.b(1);
        if (bVar.f20573c != -1) {
            this.L = new h(new l3(bVar.f20571a, bVar.f20572b), bVar.f20573c, bVar.f20574d);
        }
        I(this.f20564u.C(bVar.f20571a, bVar.f20572b), false);
    }

    private boolean O() {
        f2 q10 = this.f20563t.q();
        if (!q10.f20368d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            p3[] p3VarArr = this.f20545a;
            if (i10 >= p3VarArr.length) {
                return true;
            }
            p3 p3Var = p3VarArr[i10];
            q0 q0Var = q10.f20367c[i10];
            if (p3Var.q() != q0Var || (q0Var != null && !p3Var.g() && !N(p3Var, q10))) {
                return false;
            }
            i10++;
        }
        return false;
    }

    private static boolean P(boolean z10, x.b bVar, long j10, x.b bVar2, c4.b bVar3, long j11) {
        if (z10 || j10 != j11 || !bVar.f21677a.equals(bVar2.f21677a)) {
            return false;
        }
        if (!bVar.b() || !bVar3.t(bVar.f21678b)) {
            if (!bVar2.b() || !bVar3.t(bVar2.f21678b)) {
                return false;
            }
            return true;
        } else if (bVar3.k(bVar.f21678b, bVar.f21679c) == 4 || bVar3.k(bVar.f21678b, bVar.f21679c) == 2) {
            return false;
        } else {
            return true;
        }
    }

    private void P0(boolean z10) {
        if (z10 != this.J) {
            this.J = z10;
            if (!z10 && this.f20568y.f20278o) {
                this.f20552i.f(2);
            }
        }
    }

    private boolean Q() {
        f2 j10 = this.f20563t.j();
        if (j10 == null || j10.k() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private void Q0(boolean z10) throws q {
        this.B = z10;
        s0();
        if (this.C && this.f20563t.q() != this.f20563t.p()) {
            C0(true);
            H(false);
        }
    }

    private static boolean R(p3 p3Var) {
        return p3Var.getState() != 0;
    }

    private boolean S() {
        f2 p10 = this.f20563t.p();
        long j10 = p10.f20370f.f20392e;
        return p10.f20368d && (j10 == -9223372036854775807L || this.f20568y.f20281r < j10 || !e1());
    }

    private void S0(boolean z10, int i10, boolean z11, int i11) throws q {
        this.f20569z.b(z11 ? 1 : 0);
        this.f20569z.c(i11);
        this.f20568y = this.f20568y.d(z10, i10);
        this.D = false;
        g0(z10);
        if (!e1()) {
            k1();
            o1();
            return;
        }
        int i12 = this.f20568y.f20268e;
        if (i12 == 3) {
            h1();
            this.f20552i.f(2);
        } else if (i12 == 2) {
            this.f20552i.f(2);
        }
    }

    private static boolean T(d3 d3Var, c4.b bVar) {
        x.b bVar2 = d3Var.f20265b;
        c4 c4Var = d3Var.f20264a;
        return c4Var.u() || c4Var.l(bVar2.f21677a, bVar).f20221g;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean U() {
        return Boolean.valueOf(this.A);
    }

    private void U0(f3 f3Var) throws q {
        M0(f3Var);
        L(this.f20559p.e(), true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void V(k3 k3Var) {
        try {
            n(k3Var);
        } catch (q e10) {
            r.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void W() {
        boolean d12 = d1();
        this.E = d12;
        if (d12) {
            this.f20563t.j().d(this.M);
        }
        l1();
    }

    private void W0(int i10) throws q {
        this.F = i10;
        if (!this.f20563t.G(this.f20568y.f20264a, i10)) {
            C0(true);
        }
        H(false);
    }

    private void X() {
        this.f20569z.d(this.f20568y);
        if (this.f20569z.f20583a) {
            this.f20562s.a(this.f20569z);
            this.f20569z = new e(this.f20568y);
        }
    }

    private void X0(u3 u3Var) {
        this.f20567x = u3Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090 A[LOOP:1: B:24:0x0074->B:34:0x0090, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0062 A[EDGE_INSN: B:65:0x0062->B:20:0x0062 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0073 A[EDGE_INSN: B:72:0x0073->B:23:0x0073 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Y(long r8, long r10) throws n2.q {
        /*
            r7 = this;
            java.util.ArrayList<n2.n1$d> r0 = r7.f20560q
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00f7
            n2.d3 r0 = r7.f20568y
            p3.x$b r0 = r0.f20265b
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0014
            goto L_0x00f7
        L_0x0014:
            boolean r0 = r7.O
            if (r0 == 0) goto L_0x001e
            r0 = 1
            long r8 = r8 - r0
            r0 = 0
            r7.O = r0
        L_0x001e:
            n2.d3 r0 = r7.f20568y
            n2.c4 r1 = r0.f20264a
            p3.x$b r0 = r0.f20265b
            java.lang.Object r0 = r0.f21677a
            int r0 = r1.f(r0)
            int r1 = r7.N
            java.util.ArrayList<n2.n1$d> r2 = r7.f20560q
            int r2 = r2.size()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            if (r1 <= 0) goto L_0x0044
            java.util.ArrayList<n2.n1$d> r3 = r7.f20560q
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            n2.n1$d r3 = (n2.n1.d) r3
            goto L_0x0045
        L_0x0044:
            r3 = r2
        L_0x0045:
            if (r3 == 0) goto L_0x0062
            int r4 = r3.f20580b
            if (r4 > r0) goto L_0x0053
            if (r4 != r0) goto L_0x0062
            long r3 = r3.f20581c
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0062
        L_0x0053:
            int r1 = r1 + -1
            if (r1 <= 0) goto L_0x0044
            java.util.ArrayList<n2.n1$d> r3 = r7.f20560q
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            n2.n1$d r3 = (n2.n1.d) r3
            goto L_0x0045
        L_0x0062:
            java.util.ArrayList<n2.n1$d> r3 = r7.f20560q
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0073
            java.util.ArrayList<n2.n1$d> r3 = r7.f20560q
            java.lang.Object r3 = r3.get(r1)
            n2.n1$d r3 = (n2.n1.d) r3
            goto L_0x0074
        L_0x0073:
            r3 = r2
        L_0x0074:
            if (r3 == 0) goto L_0x0099
            java.lang.Object r4 = r3.f20582d
            if (r4 == 0) goto L_0x0099
            int r4 = r3.f20580b
            if (r4 < r0) goto L_0x0086
            if (r4 != r0) goto L_0x0099
            long r4 = r3.f20581c
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x0099
        L_0x0086:
            int r1 = r1 + 1
            java.util.ArrayList<n2.n1$d> r3 = r7.f20560q
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0073
            java.util.ArrayList<n2.n1$d> r3 = r7.f20560q
            java.lang.Object r3 = r3.get(r1)
            n2.n1$d r3 = (n2.n1.d) r3
            goto L_0x0074
        L_0x0099:
            if (r3 == 0) goto L_0x00f5
            java.lang.Object r4 = r3.f20582d
            if (r4 == 0) goto L_0x00f5
            int r4 = r3.f20580b
            if (r4 != r0) goto L_0x00f5
            long r4 = r3.f20581c
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x00f5
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x00f5
            n2.k3 r4 = r3.f20579a     // Catch:{ all -> 0x00de }
            r7.H0(r4)     // Catch:{ all -> 0x00de }
            n2.k3 r4 = r3.f20579a
            boolean r4 = r4.b()
            if (r4 != 0) goto L_0x00c6
            n2.k3 r3 = r3.f20579a
            boolean r3 = r3.j()
            if (r3 == 0) goto L_0x00c3
            goto L_0x00c6
        L_0x00c3:
            int r1 = r1 + 1
            goto L_0x00cb
        L_0x00c6:
            java.util.ArrayList<n2.n1$d> r3 = r7.f20560q
            r3.remove(r1)
        L_0x00cb:
            java.util.ArrayList<n2.n1$d> r3 = r7.f20560q
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00dc
            java.util.ArrayList<n2.n1$d> r3 = r7.f20560q
            java.lang.Object r3 = r3.get(r1)
            n2.n1$d r3 = (n2.n1.d) r3
            goto L_0x0099
        L_0x00dc:
            r3 = r2
            goto L_0x0099
        L_0x00de:
            r8 = move-exception
            n2.k3 r9 = r3.f20579a
            boolean r9 = r9.b()
            if (r9 != 0) goto L_0x00ef
            n2.k3 r9 = r3.f20579a
            boolean r9 = r9.j()
            if (r9 == 0) goto L_0x00f4
        L_0x00ef:
            java.util.ArrayList<n2.n1$d> r9 = r7.f20560q
            r9.remove(r1)
        L_0x00f4:
            throw r8
        L_0x00f5:
            r7.N = r1
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.n1.Y(long, long):void");
    }

    private void Z() throws q {
        g2 o10;
        this.f20563t.y(this.M);
        if (this.f20563t.D() && (o10 = this.f20563t.o(this.M, this.f20568y)) != null) {
            f2 g10 = this.f20563t.g(this.f20547c, this.f20548d, this.f20550g.g(), this.f20564u, o10, this.f20549f);
            g10.f20365a.h(this, o10.f20389b);
            if (this.f20563t.p() == g10) {
                t0(o10.f20389b);
            }
            H(false);
        }
        if (this.E) {
            this.E = Q();
            l1();
            return;
        }
        W();
    }

    private void Z0(boolean z10) throws q {
        this.G = z10;
        if (!this.f20563t.H(this.f20568y.f20264a, z10)) {
            C0(true);
        }
        H(false);
    }

    private void a0() throws q {
        boolean z10;
        boolean z11 = false;
        while (c1()) {
            if (z11) {
                X();
            }
            f2 f2Var = (f2) k4.a.e(this.f20563t.b());
            if (this.f20568y.f20265b.f21677a.equals(f2Var.f20370f.f20388a.f21677a)) {
                x.b bVar = this.f20568y.f20265b;
                if (bVar.f21678b == -1) {
                    x.b bVar2 = f2Var.f20370f.f20388a;
                    if (bVar2.f21678b == -1 && bVar.f21681e != bVar2.f21681e) {
                        z10 = true;
                        g2 g2Var = f2Var.f20370f;
                        x.b bVar3 = g2Var.f20388a;
                        long j10 = g2Var.f20389b;
                        this.f20568y = M(bVar3, j10, g2Var.f20390c, j10, !z10, 0);
                        s0();
                        o1();
                        z11 = true;
                    }
                }
            }
            z10 = false;
            g2 g2Var2 = f2Var.f20370f;
            x.b bVar32 = g2Var2.f20388a;
            long j102 = g2Var2.f20389b;
            this.f20568y = M(bVar32, j102, g2Var2.f20390c, j102, !z10, 0);
            s0();
            o1();
            z11 = true;
        }
    }

    private void a1(s0 s0Var) throws q {
        this.f20569z.b(1);
        I(this.f20564u.D(s0Var), false);
    }

    private void b0() throws q {
        f2 q10 = this.f20563t.q();
        if (q10 != null) {
            int i10 = 0;
            if (q10.j() == null || this.C) {
                if (q10.f20370f.f20396i || this.C) {
                    while (true) {
                        p3[] p3VarArr = this.f20545a;
                        if (i10 < p3VarArr.length) {
                            p3 p3Var = p3VarArr[i10];
                            q0 q0Var = q10.f20367c[i10];
                            if (q0Var != null && p3Var.q() == q0Var && p3Var.g()) {
                                long j10 = q10.f20370f.f20392e;
                                K0(p3Var, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : q10.l() + q10.f20370f.f20392e);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (O()) {
                if (q10.j().f20368d || this.M >= q10.j().m()) {
                    c0 o10 = q10.o();
                    f2 c10 = this.f20563t.c();
                    c0 o11 = c10.o();
                    c4 c4Var = this.f20568y.f20264a;
                    p1(c4Var, c10.f20370f.f20388a, c4Var, q10.f20370f.f20388a, -9223372036854775807L, false);
                    if (!c10.f20368d || c10.f20365a.r() == -9223372036854775807L) {
                        for (int i11 = 0; i11 < this.f20545a.length; i11++) {
                            boolean c11 = o10.c(i11);
                            boolean c12 = o11.c(i11);
                            if (c11 && !this.f20545a[i11].v()) {
                                boolean z10 = this.f20547c[i11].f() == -2;
                                s3 s3Var = o10.f18964b[i11];
                                s3 s3Var2 = o11.f18964b[i11];
                                if (!c12 || !s3Var2.equals(s3Var) || z10) {
                                    K0(this.f20545a[i11], c10.m());
                                }
                            }
                        }
                        return;
                    }
                    J0(c10.m());
                }
            }
        }
    }

    private void b1(int i10) {
        d3 d3Var = this.f20568y;
        if (d3Var.f20268e != i10) {
            if (i10 != 2) {
                this.R = -9223372036854775807L;
            }
            this.f20568y = d3Var.g(i10);
        }
    }

    private void c0() throws q {
        f2 q10 = this.f20563t.q();
        if (q10 != null && this.f20563t.p() != q10 && !q10.f20371g && p0()) {
            r();
        }
    }

    private boolean c1() {
        f2 p10;
        f2 j10;
        if (e1() && !this.C && (p10 = this.f20563t.p()) != null && (j10 = p10.j()) != null && this.M >= j10.m() && j10.f20371g) {
            return true;
        }
        return false;
    }

    private void d0() throws q {
        I(this.f20564u.i(), true);
    }

    private boolean d1() {
        long j10;
        if (!Q()) {
            return false;
        }
        f2 j11 = this.f20563t.j();
        long E2 = E(j11.k());
        if (j11 == this.f20563t.p()) {
            j10 = j11.y(this.M);
        } else {
            j10 = j11.y(this.M) - j11.f20370f.f20389b;
        }
        long j12 = j10;
        boolean f10 = this.f20550g.f(j12, E2, this.f20559p.e().f20384a);
        if (f10 || E2 >= 500000) {
            return f10;
        }
        if (this.f20557n <= 0 && !this.f20558o) {
            return f10;
        }
        this.f20563t.p().f20365a.t(this.f20568y.f20281r, false);
        return this.f20550g.f(j12, E2, this.f20559p.e().f20384a);
    }

    private void e0(c cVar) throws q {
        this.f20569z.b(1);
        I(this.f20564u.v(cVar.f20575a, cVar.f20576b, cVar.f20577c, cVar.f20578d), false);
    }

    private boolean e1() {
        d3 d3Var = this.f20568y;
        return d3Var.f20275l && d3Var.f20276m == 0;
    }

    private void f0() {
        for (f2 p10 = this.f20563t.p(); p10 != null; p10 = p10.j()) {
            for (s sVar : p10.o().f18965c) {
                if (sVar != null) {
                    sVar.s();
                }
            }
        }
    }

    private boolean f1(boolean z10) {
        if (this.K == 0) {
            return S();
        }
        if (!z10) {
            return false;
        }
        d3 d3Var = this.f20568y;
        if (!d3Var.f20270g) {
            return true;
        }
        long c10 = g1(d3Var.f20264a, this.f20563t.p().f20370f.f20388a) ? this.f20565v.c() : -9223372036854775807L;
        f2 j10 = this.f20563t.j();
        boolean z11 = j10.q() && j10.f20370f.f20396i;
        boolean z12 = j10.f20370f.f20388a.b() && !j10.f20368d;
        if (z11 || z12 || this.f20550g.e(D(), this.f20559p.e().f20384a, this.D, c10)) {
            return true;
        }
        return false;
    }

    private void g0(boolean z10) {
        for (f2 p10 = this.f20563t.p(); p10 != null; p10 = p10.j()) {
            for (s sVar : p10.o().f18965c) {
                if (sVar != null) {
                    sVar.i(z10);
                }
            }
        }
    }

    private boolean g1(c4 c4Var, x.b bVar) {
        if (bVar.b() || c4Var.u()) {
            return false;
        }
        c4Var.r(c4Var.l(bVar.f21677a, this.f20556m).f20218c, this.f20555l);
        if (!this.f20555l.h()) {
            return false;
        }
        c4.d dVar = this.f20555l;
        if (!dVar.f20243j || dVar.f20240g == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    private void h0() {
        for (f2 p10 = this.f20563t.p(); p10 != null; p10 = p10.j()) {
            for (s sVar : p10.o().f18965c) {
                if (sVar != null) {
                    sVar.t();
                }
            }
        }
    }

    private void h1() throws q {
        this.D = false;
        this.f20559p.g();
        for (p3 p3Var : this.f20545a) {
            if (R(p3Var)) {
                p3Var.start();
            }
        }
    }

    private void j1(boolean z10, boolean z11) {
        r0(z10 || !this.H, false, true, false);
        this.f20569z.b(z11 ? 1 : 0);
        this.f20550g.h();
        b1(1);
    }

    private void k0() {
        this.f20569z.b(1);
        r0(false, false, false, true);
        this.f20550g.onPrepared();
        b1(this.f20568y.f20264a.u() ? 4 : 2);
        this.f20564u.w(this.f20551h.f());
        this.f20552i.f(2);
    }

    private void k1() throws q {
        this.f20559p.h();
        for (p3 p3Var : this.f20545a) {
            if (R(p3Var)) {
                t(p3Var);
            }
        }
    }

    private void l(b bVar, int i10) throws q {
        this.f20569z.b(1);
        x2 x2Var = this.f20564u;
        if (i10 == -1) {
            i10 = x2Var.q();
        }
        I(x2Var.f(i10, bVar.f20571a, bVar.f20572b), false);
    }

    private void l1() {
        f2 j10 = this.f20563t.j();
        boolean z10 = this.E || (j10 != null && j10.f20365a.isLoading());
        d3 d3Var = this.f20568y;
        if (z10 != d3Var.f20270g) {
            this.f20568y = d3Var.a(z10);
        }
    }

    private void m() throws q {
        C0(true);
    }

    private void m0() {
        r0(true, false, true, false);
        this.f20550g.d();
        b1(1);
        HandlerThread handlerThread = this.f20553j;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    private void m1(z0 z0Var, c0 c0Var) {
        this.f20550g.b(this.f20545a, z0Var, c0Var.f18965c);
    }

    private void n(k3 k3Var) throws q {
        if (!k3Var.j()) {
            try {
                k3Var.g().p(k3Var.i(), k3Var.e());
            } finally {
                k3Var.k(true);
            }
        }
    }

    private void n0(int i10, int i11, s0 s0Var) throws q {
        this.f20569z.b(1);
        I(this.f20564u.A(i10, i11, s0Var), false);
    }

    private void n1() throws q {
        if (!this.f20568y.f20264a.u() && this.f20564u.s()) {
            Z();
            b0();
            c0();
            a0();
        }
    }

    private void o(p3 p3Var) throws q {
        if (R(p3Var)) {
            this.f20559p.a(p3Var);
            t(p3Var);
            p3Var.d();
            this.K--;
        }
    }

    private void o1() throws q {
        f2 p10 = this.f20563t.p();
        if (p10 != null) {
            long r10 = p10.f20368d ? p10.f20365a.r() : -9223372036854775807L;
            if (r10 != -9223372036854775807L) {
                t0(r10);
                if (r10 != this.f20568y.f20281r) {
                    d3 d3Var = this.f20568y;
                    this.f20568y = M(d3Var.f20265b, r10, d3Var.f20266c, r10, true, 5);
                }
            } else {
                long i10 = this.f20559p.i(p10 != this.f20563t.q());
                this.M = i10;
                long y10 = p10.y(i10);
                Y(this.f20568y.f20281r, y10);
                this.f20568y.f20281r = y10;
            }
            this.f20568y.f20279p = this.f20563t.j().i();
            this.f20568y.f20280q = D();
            d3 d3Var2 = this.f20568y;
            if (d3Var2.f20275l && d3Var2.f20268e == 3 && g1(d3Var2.f20264a, d3Var2.f20265b) && this.f20568y.f20277n.f20384a == 1.0f) {
                float b10 = this.f20565v.b(x(), D());
                if (this.f20559p.e().f20384a != b10) {
                    M0(this.f20568y.f20277n.d(b10));
                    K(this.f20568y.f20277n, this.f20559p.e().f20384a, false, false);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01db A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void p() throws n2.q, java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            k4.d r1 = r0.f20561r
            long r1 = r1.c()
            k4.n r3 = r0.f20552i
            r4 = 2
            r3.i(r4)
            r16.n1()
            n2.d3 r3 = r0.f20568y
            int r3 = r3.f20268e
            r5 = 1
            if (r3 == r5) goto L_0x01f8
            r6 = 4
            if (r3 != r6) goto L_0x001d
            goto L_0x01f8
        L_0x001d:
            n2.i2 r3 = r0.f20563t
            n2.f2 r3 = r3.p()
            r7 = 10
            if (r3 != 0) goto L_0x002b
            r0.A0(r1, r7)
            return
        L_0x002b:
            java.lang.String r9 = "doSomeWork"
            k4.k0.a(r9)
            r16.o1()
            boolean r9 = r3.f20368d
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            if (r9 == 0) goto L_0x00ac
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r13 = r13 * r10
            p3.u r9 = r3.f20365a
            n2.d3 r15 = r0.f20568y
            long r7 = r15.f20281r
            long r10 = r0.f20557n
            long r7 = r7 - r10
            boolean r10 = r0.f20558o
            r9.t(r7, r10)
            r7 = 0
            r8 = 1
            r9 = 1
        L_0x0051:
            n2.p3[] r10 = r0.f20545a
            int r11 = r10.length
            if (r7 >= r11) goto L_0x00b3
            r10 = r10[r7]
            boolean r11 = R(r10)
            if (r11 != 0) goto L_0x005f
            goto L_0x00a7
        L_0x005f:
            long r4 = r0.M
            r10.o(r4, r13)
            if (r8 == 0) goto L_0x006e
            boolean r4 = r10.b()
            if (r4 == 0) goto L_0x006e
            r8 = 1
            goto L_0x006f
        L_0x006e:
            r8 = 0
        L_0x006f:
            p3.q0[] r4 = r3.f20367c
            r4 = r4[r7]
            p3.q0 r5 = r10.q()
            if (r4 == r5) goto L_0x007b
            r4 = 1
            goto L_0x007c
        L_0x007b:
            r4 = 0
        L_0x007c:
            if (r4 != 0) goto L_0x0086
            boolean r5 = r10.g()
            if (r5 == 0) goto L_0x0086
            r5 = 1
            goto L_0x0087
        L_0x0086:
            r5 = 0
        L_0x0087:
            if (r4 != 0) goto L_0x009a
            if (r5 != 0) goto L_0x009a
            boolean r4 = r10.isReady()
            if (r4 != 0) goto L_0x009a
            boolean r4 = r10.b()
            if (r4 == 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            r4 = 0
            goto L_0x009b
        L_0x009a:
            r4 = 1
        L_0x009b:
            if (r9 == 0) goto L_0x00a1
            if (r4 == 0) goto L_0x00a1
            r9 = 1
            goto L_0x00a2
        L_0x00a1:
            r9 = 0
        L_0x00a2:
            if (r4 != 0) goto L_0x00a7
            r10.s()
        L_0x00a7:
            int r7 = r7 + 1
            r4 = 2
            r5 = 1
            goto L_0x0051
        L_0x00ac:
            p3.u r4 = r3.f20365a
            r4.m()
            r8 = 1
            r9 = 1
        L_0x00b3:
            n2.g2 r4 = r3.f20370f
            long r4 = r4.f20392e
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == 0) goto L_0x00d0
            boolean r7 = r3.f20368d
            if (r7 == 0) goto L_0x00d0
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x00ce
            n2.d3 r7 = r0.f20568y
            long r7 = r7.f20281r
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x00d0
        L_0x00ce:
            r4 = 1
            goto L_0x00d1
        L_0x00d0:
            r4 = 0
        L_0x00d1:
            if (r4 == 0) goto L_0x00e1
            boolean r5 = r0.C
            if (r5 == 0) goto L_0x00e1
            r0.C = r12
            n2.d3 r5 = r0.f20568y
            int r5 = r5.f20276m
            r7 = 5
            r0.S0(r12, r5, r12, r7)
        L_0x00e1:
            r5 = 3
            if (r4 == 0) goto L_0x00f1
            n2.g2 r4 = r3.f20370f
            boolean r4 = r4.f20396i
            if (r4 == 0) goto L_0x00f1
            r0.b1(r6)
            r16.k1()
            goto L_0x013a
        L_0x00f1:
            n2.d3 r4 = r0.f20568y
            int r4 = r4.f20268e
            r7 = 2
            if (r4 != r7) goto L_0x010e
            boolean r4 = r0.f1(r9)
            if (r4 == 0) goto L_0x010e
            r0.b1(r5)
            r4 = 0
            r0.P = r4
            boolean r4 = r16.e1()
            if (r4 == 0) goto L_0x013a
            r16.h1()
            goto L_0x013a
        L_0x010e:
            n2.d3 r4 = r0.f20568y
            int r4 = r4.f20268e
            if (r4 != r5) goto L_0x013a
            int r4 = r0.K
            if (r4 != 0) goto L_0x011f
            boolean r4 = r16.S()
            if (r4 == 0) goto L_0x0121
            goto L_0x013a
        L_0x011f:
            if (r9 != 0) goto L_0x013a
        L_0x0121:
            boolean r4 = r16.e1()
            r0.D = r4
            r4 = 2
            r0.b1(r4)
            boolean r4 = r0.D
            if (r4 == 0) goto L_0x0137
            r16.h0()
            n2.w1 r4 = r0.f20565v
            r4.d()
        L_0x0137:
            r16.k1()
        L_0x013a:
            n2.d3 r4 = r0.f20568y
            int r4 = r4.f20268e
            r7 = 2
            if (r4 != r7) goto L_0x017e
            r4 = 0
        L_0x0142:
            n2.p3[] r7 = r0.f20545a
            int r8 = r7.length
            if (r4 >= r8) goto L_0x0167
            r7 = r7[r4]
            boolean r7 = R(r7)
            if (r7 == 0) goto L_0x0164
            n2.p3[] r7 = r0.f20545a
            r7 = r7[r4]
            p3.q0 r7 = r7.q()
            p3.q0[] r8 = r3.f20367c
            r8 = r8[r4]
            if (r7 != r8) goto L_0x0164
            n2.p3[] r7 = r0.f20545a
            r7 = r7[r4]
            r7.s()
        L_0x0164:
            int r4 = r4 + 1
            goto L_0x0142
        L_0x0167:
            n2.d3 r3 = r0.f20568y
            boolean r4 = r3.f20270g
            if (r4 != 0) goto L_0x017e
            long r3 = r3.f20280q
            r7 = 500000(0x7a120, double:2.47033E-318)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x017e
            boolean r3 = r16.Q()
            if (r3 == 0) goto L_0x017e
            r3 = 1
            goto L_0x017f
        L_0x017e:
            r3 = 0
        L_0x017f:
            if (r3 != 0) goto L_0x0184
            r0.R = r13
            goto L_0x01a2
        L_0x0184:
            long r3 = r0.R
            int r7 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x0193
            k4.d r3 = r0.f20561r
            long r3 = r3.b()
            r0.R = r3
            goto L_0x01a2
        L_0x0193:
            k4.d r3 = r0.f20561r
            long r3 = r3.b()
            long r7 = r0.R
            long r3 = r3 - r7
            r7 = 4000(0xfa0, double:1.9763E-320)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x01f0
        L_0x01a2:
            boolean r3 = r16.e1()
            if (r3 == 0) goto L_0x01b0
            n2.d3 r3 = r0.f20568y
            int r3 = r3.f20268e
            if (r3 != r5) goto L_0x01b0
            r3 = 1
            goto L_0x01b1
        L_0x01b0:
            r3 = 0
        L_0x01b1:
            boolean r4 = r0.J
            if (r4 == 0) goto L_0x01bd
            boolean r4 = r0.I
            if (r4 == 0) goto L_0x01bd
            if (r3 == 0) goto L_0x01bd
            r15 = 1
            goto L_0x01be
        L_0x01bd:
            r15 = 0
        L_0x01be:
            n2.d3 r4 = r0.f20568y
            boolean r7 = r4.f20278o
            if (r7 == r15) goto L_0x01ca
            n2.d3 r4 = r4.h(r15)
            r0.f20568y = r4
        L_0x01ca:
            r0.I = r12
            if (r15 != 0) goto L_0x01ec
            n2.d3 r4 = r0.f20568y
            int r4 = r4.f20268e
            if (r4 != r6) goto L_0x01d5
            goto L_0x01ec
        L_0x01d5:
            if (r3 != 0) goto L_0x01e7
            r3 = 2
            if (r4 != r3) goto L_0x01db
            goto L_0x01e7
        L_0x01db:
            if (r4 != r5) goto L_0x01ec
            int r3 = r0.K
            if (r3 == 0) goto L_0x01ec
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.A0(r1, r3)
            goto L_0x01ec
        L_0x01e7:
            r3 = 10
            r0.A0(r1, r3)
        L_0x01ec:
            k4.k0.c()
            return
        L_0x01f0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Playback stuck buffering and not loading"
            r1.<init>(r2)
            throw r1
        L_0x01f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.n1.p():void");
    }

    private boolean p0() throws q {
        f2 q10 = this.f20563t.q();
        c0 o10 = q10.o();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            p3[] p3VarArr = this.f20545a;
            if (i10 >= p3VarArr.length) {
                return !z10;
            }
            p3 p3Var = p3VarArr[i10];
            if (R(p3Var)) {
                boolean z11 = p3Var.q() != q10.f20367c[i10];
                if (!o10.c(i10) || z11) {
                    if (!p3Var.v()) {
                        p3Var.h(y(o10.f18965c[i10]), q10.f20367c[i10], q10.m(), q10.l());
                    } else if (p3Var.b()) {
                        o(p3Var);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    private void p1(c4 c4Var, x.b bVar, c4 c4Var2, x.b bVar2, long j10, boolean z10) throws q {
        if (!g1(c4Var, bVar)) {
            f3 f3Var = bVar.b() ? f3.f20380d : this.f20568y.f20277n;
            if (!this.f20559p.e().equals(f3Var)) {
                M0(f3Var);
                K(this.f20568y.f20277n, f3Var.f20384a, false, false);
                return;
            }
            return;
        }
        c4Var.r(c4Var.l(bVar.f21677a, this.f20556m).f20218c, this.f20555l);
        this.f20565v.a((z1.g) n0.j(this.f20555l.f20245l));
        if (j10 != -9223372036854775807L) {
            this.f20565v.e(z(c4Var, bVar.f21677a, j10));
            return;
        }
        Object obj = this.f20555l.f20235a;
        Object obj2 = null;
        if (!c4Var2.u()) {
            obj2 = c4Var2.r(c4Var2.l(bVar2.f21677a, this.f20556m).f20218c, this.f20555l).f20235a;
        }
        if (!n0.c(obj2, obj) || z10) {
            this.f20565v.e(-9223372036854775807L);
        }
    }

    private void q(int i10, boolean z10) throws q {
        p3 p3Var = this.f20545a[i10];
        if (!R(p3Var)) {
            f2 q10 = this.f20563t.q();
            boolean z11 = q10 == this.f20563t.p();
            c0 o10 = q10.o();
            s3 s3Var = o10.f18964b[i10];
            r1[] y10 = y(o10.f18965c[i10]);
            boolean z12 = e1() && this.f20568y.f20268e == 3;
            boolean z13 = !z10 && z12;
            this.K++;
            this.f20546b.add(p3Var);
            p3Var.r(s3Var, y10, q10.f20367c[i10], this.M, z13, z11, q10.m(), q10.l());
            p3Var.p(11, new a());
            this.f20559p.b(p3Var);
            if (z12) {
                p3Var.start();
            }
        }
    }

    private void q0() throws q {
        float f10 = this.f20559p.e().f20384a;
        f2 p10 = this.f20563t.p();
        f2 q10 = this.f20563t.q();
        boolean z10 = true;
        while (p10 != null && p10.f20368d) {
            c0 v10 = p10.v(f10, this.f20568y.f20264a);
            if (!v10.a(p10.o())) {
                if (z10) {
                    f2 p11 = this.f20563t.p();
                    boolean z11 = this.f20563t.z(p11);
                    boolean[] zArr = new boolean[this.f20545a.length];
                    long b10 = p11.b(v10, this.f20568y.f20281r, z11, zArr);
                    d3 d3Var = this.f20568y;
                    boolean z12 = (d3Var.f20268e == 4 || b10 == d3Var.f20281r) ? false : true;
                    d3 d3Var2 = this.f20568y;
                    f2 f2Var = p11;
                    boolean[] zArr2 = zArr;
                    this.f20568y = M(d3Var2.f20265b, b10, d3Var2.f20266c, d3Var2.f20267d, z12, 5);
                    if (z12) {
                        t0(b10);
                    }
                    boolean[] zArr3 = new boolean[this.f20545a.length];
                    int i10 = 0;
                    while (true) {
                        p3[] p3VarArr = this.f20545a;
                        if (i10 >= p3VarArr.length) {
                            break;
                        }
                        p3 p3Var = p3VarArr[i10];
                        zArr3[i10] = R(p3Var);
                        q0 q0Var = f2Var.f20367c[i10];
                        if (zArr3[i10]) {
                            if (q0Var != p3Var.q()) {
                                o(p3Var);
                            } else if (zArr2[i10]) {
                                p3Var.u(this.M);
                            }
                        }
                        i10++;
                    }
                    s(zArr3);
                } else {
                    this.f20563t.z(p10);
                    if (p10.f20368d) {
                        p10.a(v10, Math.max(p10.f20370f.f20389b, p10.y(this.M)), false);
                    }
                }
                H(true);
                if (this.f20568y.f20268e != 4) {
                    W();
                    o1();
                    this.f20552i.f(2);
                    return;
                }
                return;
            }
            if (p10 == q10) {
                z10 = false;
            }
            p10 = p10.j();
        }
    }

    private void q1(float f10) {
        for (f2 p10 = this.f20563t.p(); p10 != null; p10 = p10.j()) {
            for (s sVar : p10.o().f18965c) {
                if (sVar != null) {
                    sVar.q(f10);
                }
            }
        }
    }

    private void r() throws q {
        s(new boolean[this.f20545a.length]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r0(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            r28 = this;
            r1 = r28
            k4.n r0 = r1.f20552i
            r2 = 2
            r0.i(r2)
            r2 = 0
            r1.P = r2
            r3 = 0
            r1.D = r3
            n2.l r0 = r1.f20559p
            r0.h()
            r4 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r1.M = r4
            n2.p3[] r4 = r1.f20545a
            int r5 = r4.length
            r6 = 0
        L_0x001e:
            java.lang.String r7 = "ExoPlayerImplInternal"
            if (r6 >= r5) goto L_0x0033
            r0 = r4[r6]
            r1.o(r0)     // Catch:{ q -> 0x002a, RuntimeException -> 0x0028 }
            goto L_0x0030
        L_0x0028:
            r0 = move-exception
            goto L_0x002b
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            java.lang.String r8 = "Disable failed."
            k4.r.d(r7, r8, r0)
        L_0x0030:
            int r6 = r6 + 1
            goto L_0x001e
        L_0x0033:
            if (r29 == 0) goto L_0x0053
            n2.p3[] r4 = r1.f20545a
            int r5 = r4.length
            r6 = 0
        L_0x0039:
            if (r6 >= r5) goto L_0x0053
            r0 = r4[r6]
            java.util.Set<n2.p3> r8 = r1.f20546b
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L_0x0050
            r0.reset()     // Catch:{ RuntimeException -> 0x0049 }
            goto L_0x0050
        L_0x0049:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            k4.r.d(r7, r0, r8)
        L_0x0050:
            int r6 = r6 + 1
            goto L_0x0039
        L_0x0053:
            r1.K = r3
            n2.d3 r0 = r1.f20568y
            p3.x$b r4 = r0.f20265b
            long r5 = r0.f20281r
            n2.d3 r0 = r1.f20568y
            p3.x$b r0 = r0.f20265b
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0075
            n2.d3 r0 = r1.f20568y
            n2.c4$b r7 = r1.f20556m
            boolean r0 = T(r0, r7)
            if (r0 == 0) goto L_0x0070
            goto L_0x0075
        L_0x0070:
            n2.d3 r0 = r1.f20568y
            long r7 = r0.f20281r
            goto L_0x0079
        L_0x0075:
            n2.d3 r0 = r1.f20568y
            long r7 = r0.f20266c
        L_0x0079:
            if (r30 == 0) goto L_0x00a6
            r1.L = r2
            n2.d3 r0 = r1.f20568y
            n2.c4 r0 = r0.f20264a
            android.util.Pair r0 = r1.B(r0)
            java.lang.Object r4 = r0.first
            p3.x$b r4 = (p3.x.b) r4
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            n2.d3 r0 = r1.f20568y
            p3.x$b r0 = r0.f20265b
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00a6
            r0 = 1
            r17 = r4
            r25 = r5
            goto L_0x00ab
        L_0x00a6:
            r17 = r4
            r25 = r5
            r0 = 0
        L_0x00ab:
            n2.i2 r4 = r1.f20563t
            r4.f()
            r1.E = r3
            n2.d3 r3 = new n2.d3
            n2.d3 r4 = r1.f20568y
            n2.c4 r5 = r4.f20264a
            int r11 = r4.f20268e
            if (r32 == 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            n2.q r2 = r4.f20269f
        L_0x00bf:
            r12 = r2
            r13 = 0
            if (r0 == 0) goto L_0x00c6
            p3.z0 r2 = p3.z0.f21693d
            goto L_0x00c8
        L_0x00c6:
            p3.z0 r2 = r4.f20271h
        L_0x00c8:
            r14 = r2
            if (r0 == 0) goto L_0x00ce
            i4.c0 r2 = r1.f20549f
            goto L_0x00d0
        L_0x00ce:
            i4.c0 r2 = r4.f20272i
        L_0x00d0:
            r15 = r2
            if (r0 == 0) goto L_0x00d8
            s6.u r0 = s6.u.y()
            goto L_0x00da
        L_0x00d8:
            java.util.List<f3.a> r0 = r4.f20273j
        L_0x00da:
            r16 = r0
            n2.d3 r0 = r1.f20568y
            boolean r2 = r0.f20275l
            r18 = r2
            int r2 = r0.f20276m
            r19 = r2
            n2.f3 r0 = r0.f20277n
            r20 = r0
            r23 = 0
            r27 = 0
            r4 = r3
            r6 = r17
            r9 = r25
            r21 = r25
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r27)
            r1.f20568y = r3
            if (r31 == 0) goto L_0x0101
            n2.x2 r0 = r1.f20564u
            r0.y()
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.n1.r0(boolean, boolean, boolean, boolean):void");
    }

    private synchronized void r1(v<Boolean> vVar, long j10) {
        long b10 = this.f20561r.b() + j10;
        boolean z10 = false;
        while (!vVar.get().booleanValue() && j10 > 0) {
            try {
                this.f20561r.e();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = b10 - this.f20561r.b();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private void s(boolean[] zArr) throws q {
        f2 q10 = this.f20563t.q();
        c0 o10 = q10.o();
        for (int i10 = 0; i10 < this.f20545a.length; i10++) {
            if (!o10.c(i10) && this.f20546b.remove(this.f20545a[i10])) {
                this.f20545a[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f20545a.length; i11++) {
            if (o10.c(i11)) {
                q(i11, zArr[i11]);
            }
        }
        q10.f20371g = true;
    }

    private void s0() {
        f2 p10 = this.f20563t.p();
        this.C = p10 != null && p10.f20370f.f20395h && this.B;
    }

    private void t(p3 p3Var) {
        if (p3Var.getState() == 2) {
            p3Var.stop();
        }
    }

    private void t0(long j10) throws q {
        long j11;
        f2 p10 = this.f20563t.p();
        if (p10 == null) {
            j11 = j10 + 1000000000000L;
        } else {
            j11 = p10.z(j10);
        }
        this.M = j11;
        this.f20559p.d(j11);
        for (p3 p3Var : this.f20545a) {
            if (R(p3Var)) {
                p3Var.u(this.M);
            }
        }
        f0();
    }

    private static void u0(c4 c4Var, d dVar, c4.d dVar2, c4.b bVar) {
        int i10 = c4Var.r(c4Var.l(dVar.f20582d, bVar).f20218c, dVar2).f20250q;
        Object obj = c4Var.k(i10, bVar, true).f20217b;
        long j10 = bVar.f20219d;
        dVar.c(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean v0(d dVar, c4 c4Var, c4 c4Var2, int i10, boolean z10, c4.d dVar2, c4.b bVar) {
        long j10;
        d dVar3 = dVar;
        c4 c4Var3 = c4Var;
        c4 c4Var4 = c4Var2;
        c4.d dVar4 = dVar2;
        c4.b bVar2 = bVar;
        Object obj = dVar3.f20582d;
        if (obj == null) {
            if (dVar3.f20579a.f() == Long.MIN_VALUE) {
                j10 = -9223372036854775807L;
            } else {
                j10 = n0.C0(dVar3.f20579a.f());
            }
            Pair<Object, Long> y02 = y0(c4Var, new h(dVar3.f20579a.h(), dVar3.f20579a.d(), j10), false, i10, z10, dVar2, bVar);
            if (y02 == null) {
                return false;
            }
            dVar.c(c4Var3.f(y02.first), ((Long) y02.second).longValue(), y02.first);
            if (dVar3.f20579a.f() == Long.MIN_VALUE) {
                u0(c4Var3, dVar, dVar4, bVar2);
            }
            return true;
        }
        int f10 = c4Var3.f(obj);
        if (f10 == -1) {
            return false;
        }
        if (dVar3.f20579a.f() == Long.MIN_VALUE) {
            u0(c4Var3, dVar, dVar4, bVar2);
            return true;
        }
        dVar3.f20580b = f10;
        c4Var4.l(dVar3.f20582d, bVar2);
        if (bVar2.f20221g && c4Var4.r(bVar2.f20218c, dVar4).f20249p == c4Var4.f(dVar3.f20582d)) {
            long q10 = dVar3.f20581c + bVar.q();
            Pair<Object, Long> n10 = c4Var.n(dVar2, bVar, c4Var3.l(dVar3.f20582d, bVar2).f20218c, q10);
            dVar.c(c4Var3.f(n10.first), ((Long) n10.second).longValue(), n10.first);
        }
        return true;
    }

    private s6.u<f3.a> w(s[] sVarArr) {
        u.a aVar = new u.a();
        boolean z10 = false;
        for (s sVar : sVarArr) {
            if (sVar != null) {
                f3.a aVar2 = sVar.b(0).f20652k;
                if (aVar2 == null) {
                    aVar.a(new f3.a(new a.b[0]));
                } else {
                    aVar.a(aVar2);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.k() : s6.u.y();
    }

    private void w0(c4 c4Var, c4 c4Var2) {
        if (!c4Var.u() || !c4Var2.u()) {
            for (int size = this.f20560q.size() - 1; size >= 0; size--) {
                if (!v0(this.f20560q.get(size), c4Var, c4Var2, this.F, this.G, this.f20555l, this.f20556m)) {
                    this.f20560q.get(size).f20579a.k(false);
                    this.f20560q.remove(size);
                }
            }
            Collections.sort(this.f20560q);
        }
    }

    private long x() {
        d3 d3Var = this.f20568y;
        return z(d3Var.f20264a, d3Var.f20265b.f21677a, d3Var.f20281r);
    }

    private static g x0(c4 c4Var, d3 d3Var, h hVar, i2 i2Var, int i10, boolean z10, c4.d dVar, c4.b bVar) {
        long j10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        x.b bVar2;
        int i12;
        long j11;
        long j12;
        i2 i2Var2;
        int i13;
        long j13;
        long j14;
        int i14;
        boolean z14;
        int i15;
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        c4 c4Var2 = c4Var;
        d3 d3Var2 = d3Var;
        h hVar2 = hVar;
        boolean z18 = z10;
        c4.b bVar3 = bVar;
        if (c4Var.u()) {
            return new g(d3.k(), 0, -9223372036854775807L, false, true, false);
        }
        x.b bVar4 = d3Var2.f20265b;
        Object obj = bVar4.f21677a;
        boolean T = T(d3Var2, bVar3);
        if (d3Var2.f20265b.b() || T) {
            j10 = d3Var2.f20266c;
        } else {
            j10 = d3Var2.f20281r;
        }
        long j15 = j10;
        boolean z19 = true;
        if (hVar2 != null) {
            x.b bVar5 = bVar4;
            i11 = -1;
            Pair<Object, Long> y02 = y0(c4Var, hVar, true, i10, z10, dVar, bVar);
            if (y02 == null) {
                i16 = c4Var2.e(z18);
                j11 = j15;
                z17 = false;
                z16 = false;
                z15 = true;
            } else {
                if (hVar2.f20598c == -9223372036854775807L) {
                    i16 = c4Var2.l(y02.first, bVar3).f20218c;
                    j11 = j15;
                    z17 = false;
                } else {
                    obj = y02.first;
                    j11 = ((Long) y02.second).longValue();
                    z17 = true;
                    i16 = -1;
                }
                z16 = d3Var2.f20268e == 4;
                z15 = false;
            }
            c4.d dVar2 = dVar;
            z11 = z17;
            z13 = z16;
            z12 = z15;
            i12 = i16;
            bVar2 = bVar5;
        } else {
            x.b bVar6 = bVar4;
            i11 = -1;
            if (d3Var2.f20264a.u()) {
                i14 = c4Var2.e(z18);
            } else if (c4Var2.f(obj) == -1) {
                Object z02 = z0(dVar, bVar, i10, z10, obj, d3Var2.f20264a, c4Var);
                if (z02 == null) {
                    i15 = c4Var2.e(z18);
                    z14 = true;
                } else {
                    i15 = c4Var2.l(z02, bVar3).f20218c;
                    z14 = false;
                }
                c4.d dVar3 = dVar;
                i12 = i15;
                z12 = z14;
                j13 = j15;
                bVar2 = bVar6;
                z13 = false;
                z11 = false;
            } else if (j15 == -9223372036854775807L) {
                i14 = c4Var2.l(obj, bVar3).f20218c;
            } else if (T) {
                bVar2 = bVar6;
                d3Var2.f20264a.l(bVar2.f21677a, bVar3);
                if (d3Var2.f20264a.r(bVar3.f20218c, dVar).f20249p == d3Var2.f20264a.f(bVar2.f21677a)) {
                    Pair<Object, Long> n10 = c4Var.n(dVar, bVar, c4Var2.l(obj, bVar3).f20218c, j15 + bVar.q());
                    obj = n10.first;
                    j14 = ((Long) n10.second).longValue();
                } else {
                    j14 = j15;
                }
                i12 = -1;
                z13 = false;
                z12 = false;
                z11 = true;
            } else {
                c4.d dVar4 = dVar;
                bVar2 = bVar6;
                j13 = j15;
                i12 = -1;
                z13 = false;
                z12 = false;
                z11 = false;
            }
            c4.d dVar5 = dVar;
            i12 = i14;
            j13 = j15;
            bVar2 = bVar6;
            z13 = false;
            z12 = false;
            z11 = false;
        }
        if (i12 != i11) {
            Pair<Object, Long> n11 = c4Var.n(dVar, bVar, i12, -9223372036854775807L);
            obj = n11.first;
            j11 = ((Long) n11.second).longValue();
            i2Var2 = i2Var;
            j12 = -9223372036854775807L;
        } else {
            i2Var2 = i2Var;
            j12 = j11;
        }
        x.b B2 = i2Var2.B(c4Var2, obj, j11);
        int i17 = B2.f21681e;
        boolean z20 = i17 == i11 || ((i13 = bVar2.f21681e) != i11 && i17 >= i13);
        if (!bVar2.f21677a.equals(obj) || bVar2.b() || B2.b() || !z20) {
            z19 = false;
        }
        x.b bVar7 = bVar2;
        boolean P2 = P(T, bVar2, j15, B2, c4Var2.l(obj, bVar3), j12);
        if (z19 || P2) {
            B2 = bVar7;
        }
        if (B2.b()) {
            if (B2.equals(bVar7)) {
                j11 = d3Var2.f20281r;
            } else {
                c4Var2.l(B2.f21677a, bVar3);
                j11 = B2.f21679c == bVar3.n(B2.f21678b) ? bVar.j() : 0;
            }
        }
        return new g(B2, j11, j12, z13, z12, z11);
    }

    private static r1[] y(s sVar) {
        int length = sVar != null ? sVar.length() : 0;
        r1[] r1VarArr = new r1[length];
        for (int i10 = 0; i10 < length; i10++) {
            r1VarArr[i10] = sVar.b(i10);
        }
        return r1VarArr;
    }

    private static Pair<Object, Long> y0(c4 c4Var, h hVar, boolean z10, int i10, boolean z11, c4.d dVar, c4.b bVar) {
        Object z02;
        c4 c4Var2 = c4Var;
        h hVar2 = hVar;
        c4.b bVar2 = bVar;
        c4 c4Var3 = hVar2.f20596a;
        if (c4Var.u()) {
            return null;
        }
        c4 c4Var4 = c4Var3.u() ? c4Var2 : c4Var3;
        try {
            Pair<Object, Long> n10 = c4Var4.n(dVar, bVar, hVar2.f20597b, hVar2.f20598c);
            if (c4Var.equals(c4Var4)) {
                return n10;
            }
            if (c4Var.f(n10.first) == -1) {
                c4.d dVar2 = dVar;
                if (z10 && (z02 = z0(dVar, bVar, i10, z11, n10.first, c4Var4, c4Var)) != null) {
                    return c4Var.n(dVar, bVar, c4Var.l(z02, bVar2).f20218c, -9223372036854775807L);
                }
                return null;
            } else if (!c4Var4.l(n10.first, bVar2).f20221g || c4Var4.r(bVar2.f20218c, dVar).f20249p != c4Var4.f(n10.first)) {
                return n10;
            } else {
                return c4Var.n(dVar, bVar, c4Var.l(n10.first, bVar2).f20218c, hVar2.f20598c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private long z(c4 c4Var, Object obj, long j10) {
        c4Var.r(c4Var.l(obj, this.f20556m).f20218c, this.f20555l);
        c4.d dVar = this.f20555l;
        if (dVar.f20240g != -9223372036854775807L && dVar.h()) {
            c4.d dVar2 = this.f20555l;
            if (dVar2.f20243j) {
                return n0.C0(dVar2.c() - this.f20555l.f20240g) - (j10 + this.f20556m.q());
            }
        }
        return -9223372036854775807L;
    }

    static Object z0(c4.d dVar, c4.b bVar, int i10, boolean z10, Object obj, c4 c4Var, c4 c4Var2) {
        int f10 = c4Var.f(obj);
        int m10 = c4Var.m();
        int i11 = f10;
        int i12 = -1;
        for (int i13 = 0; i13 < m10 && i12 == -1; i13++) {
            i11 = c4Var.h(i11, bVar, dVar, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = c4Var2.f(c4Var.q(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return c4Var2.q(i12);
    }

    public void B0(c4 c4Var, int i10, long j10) {
        this.f20552i.j(3, new h(c4Var, i10, j10)).a();
    }

    public Looper C() {
        return this.f20554k;
    }

    public void O0(List<x2.c> list, int i10, long j10, s0 s0Var) {
        this.f20552i.j(17, new b(list, s0Var, i10, j10, (a) null)).a();
    }

    public void R0(boolean z10, int i10) {
        this.f20552i.a(1, z10 ? 1 : 0, i10).a();
    }

    public void T0(f3 f3Var) {
        this.f20552i.j(4, f3Var).a();
    }

    public void V0(int i10) {
        this.f20552i.a(11, i10, 0).a();
    }

    public void Y0(boolean z10) {
        this.f20552i.a(12, z10 ? 1 : 0, 0).a();
    }

    public synchronized void a(k3 k3Var) {
        if (!this.A) {
            if (this.f20554k.getThread().isAlive()) {
                this.f20552i.j(14, k3Var).a();
                return;
            }
        }
        r.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        k3Var.k(false);
    }

    public void b() {
        this.f20552i.f(10);
    }

    public void c() {
        this.f20552i.f(22);
    }

    public void d(f3 f3Var) {
        this.f20552i.j(16, f3Var).a();
    }

    public void e(p3.u uVar) {
        this.f20552i.j(8, uVar).a();
    }

    public boolean handleMessage(Message message) {
        f2 q10;
        int i10 = 1000;
        try {
            switch (message.what) {
                case 0:
                    k0();
                    break;
                case 1:
                    S0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    p();
                    break;
                case 3:
                    D0((h) message.obj);
                    break;
                case 4:
                    U0((f3) message.obj);
                    break;
                case 5:
                    X0((u3) message.obj);
                    break;
                case 6:
                    j1(false, true);
                    break;
                case 7:
                    m0();
                    return true;
                case 8:
                    J((p3.u) message.obj);
                    break;
                case 9:
                    F((p3.u) message.obj);
                    break;
                case 10:
                    q0();
                    break;
                case 11:
                    W0(message.arg1);
                    break;
                case 12:
                    Z0(message.arg1 != 0);
                    break;
                case 13:
                    L0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    G0((k3) message.obj);
                    break;
                case 15:
                    I0((k3) message.obj);
                    break;
                case 16:
                    L((f3) message.obj, false);
                    break;
                case 17:
                    N0((b) message.obj);
                    break;
                case 18:
                    l((b) message.obj, message.arg1);
                    break;
                case 19:
                    e0((c) message.obj);
                    break;
                case 20:
                    n0(message.arg1, message.arg2, (s0) message.obj);
                    break;
                case 21:
                    a1((s0) message.obj);
                    break;
                case 22:
                    d0();
                    break;
                case 23:
                    Q0(message.arg1 != 0);
                    break;
                case 24:
                    P0(message.arg1 == 1);
                    break;
                case 25:
                    m();
                    break;
                default:
                    return false;
            }
        } catch (q e10) {
            e = e10;
            if (e.f20619j == 1 && (q10 = this.f20563t.q()) != null) {
                e = e.e(q10.f20370f.f20388a);
            }
            if (!e.f20625p || this.P != null) {
                q qVar = this.P;
                if (qVar != null) {
                    qVar.addSuppressed(e);
                    e = this.P;
                }
                r.d("ExoPlayerImplInternal", "Playback error", e);
                j1(true, false);
                this.f20568y = this.f20568y.e(e);
            } else {
                r.j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.P = e;
                n nVar = this.f20552i;
                nVar.e(nVar.j(25, e));
            }
        } catch (o.a e11) {
            G(e11, e11.f22086a);
        } catch (y2 e12) {
            int i11 = e12.f20776b;
            if (i11 == 1) {
                i10 = e12.f20775a ? AdError.MEDIATION_ERROR_CODE : 3003;
            } else if (i11 == 4) {
                i10 = e12.f20775a ? 3002 : 3004;
            }
            G(e12, i10);
        } catch (m e13) {
            G(e13, e13.f19364a);
        } catch (p3.b e14) {
            G(e14, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
        } catch (IOException e15) {
            G(e15, AdError.SERVER_ERROR_CODE);
        } catch (RuntimeException e16) {
            if ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) {
                i10 = 1004;
            }
            q i12 = q.i(e16, i10);
            r.d("ExoPlayerImplInternal", "Playback error", i12);
            j1(true, false);
            this.f20568y = this.f20568y.e(i12);
        }
        X();
        return true;
    }

    /* renamed from: i0 */
    public void j(p3.u uVar) {
        this.f20552i.j(9, uVar).a();
    }

    public void i1() {
        this.f20552i.c(6).a();
    }

    public void j0() {
        this.f20552i.c(0).a();
    }

    public synchronized boolean l0() {
        if (!this.A) {
            if (this.f20554k.getThread().isAlive()) {
                this.f20552i.f(7);
                r1(new m1(this), this.f20566w);
                return this.A;
            }
        }
        return true;
    }

    public void o0(int i10, int i11, s0 s0Var) {
        this.f20552i.g(20, i10, i11, s0Var).a();
    }

    public void u(long j10) {
        this.Q = j10;
    }

    public void v(boolean z10) {
        this.f20552i.a(24, z10 ? 1 : 0, 0).a();
    }
}
