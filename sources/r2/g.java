package r2;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import j4.g0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k4.h;
import k4.i;
import k4.n0;
import k4.r;
import o2.u1;
import p3.q;
import p3.t;
import r2.g0;
import r2.m;
import r2.o;
import r2.w;

/* compiled from: DefaultDrmSession */
class g implements o {

    /* renamed from: a  reason: collision with root package name */
    public final List<m.b> f21981a;

    /* renamed from: b  reason: collision with root package name */
    private final g0 f21982b;

    /* renamed from: c  reason: collision with root package name */
    private final a f21983c;

    /* renamed from: d  reason: collision with root package name */
    private final b f21984d;

    /* renamed from: e  reason: collision with root package name */
    private final int f21985e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f21986f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f21987g;

    /* renamed from: h  reason: collision with root package name */
    private final HashMap<String, String> f21988h;

    /* renamed from: i  reason: collision with root package name */
    private final i<w.a> f21989i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final g0 f21990j;

    /* renamed from: k  reason: collision with root package name */
    private final u1 f21991k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final n0 f21992l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final UUID f21993m;

    /* renamed from: n  reason: collision with root package name */
    private final Looper f21994n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final e f21995o;

    /* renamed from: p  reason: collision with root package name */
    private int f21996p;

    /* renamed from: q  reason: collision with root package name */
    private int f21997q;

    /* renamed from: r  reason: collision with root package name */
    private HandlerThread f21998r;

    /* renamed from: s  reason: collision with root package name */
    private c f21999s;

    /* renamed from: t  reason: collision with root package name */
    private q2.b f22000t;

    /* renamed from: u  reason: collision with root package name */
    private o.a f22001u;

    /* renamed from: v  reason: collision with root package name */
    private byte[] f22002v;

    /* renamed from: w  reason: collision with root package name */
    private byte[] f22003w;

    /* renamed from: x  reason: collision with root package name */
    private g0.a f22004x;

    /* renamed from: y  reason: collision with root package name */
    private g0.d f22005y;

    /* compiled from: DefaultDrmSession */
    public interface a {
        void a(Exception exc, boolean z10);

        void b(g gVar);

        void c();
    }

    /* compiled from: DefaultDrmSession */
    public interface b {
        void a(g gVar, int i10);

        void b(g gVar, int i10);
    }

    /* compiled from: DefaultDrmSession */
    private class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private boolean f22006a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, o0 o0Var) {
            IOException iOException;
            o0 o0Var2 = o0Var;
            d dVar = (d) message.obj;
            if (!dVar.f22009b) {
                return false;
            }
            int i10 = dVar.f22012e + 1;
            dVar.f22012e = i10;
            if (i10 > g.this.f21990j.d(3)) {
                return false;
            }
            q qVar = new q(dVar.f22008a, o0Var2.f22087a, o0Var2.f22088b, o0Var2.f22089c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f22010c, o0Var2.f22090d);
            t tVar = new t(3);
            if (o0Var.getCause() instanceof IOException) {
                iOException = (IOException) o0Var.getCause();
            } else {
                iOException = new f(o0Var.getCause());
            }
            long c10 = g.this.f21990j.c(new g0.c(qVar, tVar, iOException, dVar.f22012e));
            if (c10 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f22006a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), c10);
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(q.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages((Object) null);
            this.f22006a = true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: r2.o0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: r2.o0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: r2.o0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Throwable, java.lang.Exception] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r6.obj
                r2.g$d r0 = (r2.g.d) r0
                int r1 = r6.what     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                if (r1 == 0) goto L_0x0026
                r2 = 1
                if (r1 != r2) goto L_0x0020
                r2.g r1 = r2.g.this     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                r2.n0 r1 = r1.f21992l     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                r2.g r2 = r2.g.this     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                java.util.UUID r2 = r2.f21993m     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                java.lang.Object r3 = r0.f22011d     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                r2.g0$a r3 = (r2.g0.a) r3     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                byte[] r1 = r1.b(r2, r3)     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                goto L_0x004c
            L_0x0020:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                r1.<init>()     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                throw r1     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
            L_0x0026:
                r2.g r1 = r2.g.this     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                r2.n0 r1 = r1.f21992l     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                r2.g r2 = r2.g.this     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                java.util.UUID r2 = r2.f21993m     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                java.lang.Object r3 = r0.f22011d     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                r2.g0$d r3 = (r2.g0.d) r3     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                byte[] r1 = r1.a(r2, r3)     // Catch:{ o0 -> 0x0044, Exception -> 0x003b }
                goto L_0x004c
            L_0x003b:
                r1 = move-exception
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                k4.r.j(r2, r3, r1)
                goto L_0x004c
            L_0x0044:
                r1 = move-exception
                boolean r2 = r5.a(r6, r1)
                if (r2 == 0) goto L_0x004c
                return
            L_0x004c:
                r2.g r2 = r2.g.this
                j4.g0 r2 = r2.f21990j
                long r3 = r0.f22008a
                r2.b(r3)
                monitor-enter(r5)
                boolean r2 = r5.f22006a     // Catch:{ all -> 0x0073 }
                if (r2 != 0) goto L_0x0071
                r2.g r2 = r2.g.this     // Catch:{ all -> 0x0073 }
                r2.g$e r2 = r2.f21995o     // Catch:{ all -> 0x0073 }
                int r6 = r6.what     // Catch:{ all -> 0x0073 }
                java.lang.Object r0 = r0.f22011d     // Catch:{ all -> 0x0073 }
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x0073 }
                android.os.Message r6 = r2.obtainMessage(r6, r0)     // Catch:{ all -> 0x0073 }
                r6.sendToTarget()     // Catch:{ all -> 0x0073 }
            L_0x0071:
                monitor-exit(r5)     // Catch:{ all -> 0x0073 }
                return
            L_0x0073:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0073 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: r2.g.c.handleMessage(android.os.Message):void");
        }
    }

    /* compiled from: DefaultDrmSession */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f22008a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f22009b;

        /* renamed from: c  reason: collision with root package name */
        public final long f22010c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f22011d;

        /* renamed from: e  reason: collision with root package name */
        public int f22012e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f22008a = j10;
            this.f22009b = z10;
            this.f22010c = j11;
            this.f22011d = obj;
        }
    }

    /* compiled from: DefaultDrmSession */
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                g.this.D(obj, obj2);
            } else if (i10 == 1) {
                g.this.x(obj, obj2);
            }
        }
    }

    /* compiled from: DefaultDrmSession */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public g(UUID uuid, g0 g0Var, a aVar, b bVar, List<m.b> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> hashMap, n0 n0Var, Looper looper, j4.g0 g0Var2, u1 u1Var) {
        if (i10 == 1 || i10 == 3) {
            k4.a.e(bArr);
        }
        this.f21993m = uuid;
        this.f21983c = aVar;
        this.f21984d = bVar;
        this.f21982b = g0Var;
        this.f21985e = i10;
        this.f21986f = z10;
        this.f21987g = z11;
        if (bArr != null) {
            this.f22003w = bArr;
            this.f21981a = null;
        } else {
            this.f21981a = Collections.unmodifiableList((List) k4.a.e(list));
        }
        this.f21988h = hashMap;
        this.f21992l = n0Var;
        this.f21989i = new i<>();
        this.f21990j = g0Var2;
        this.f21991k = u1Var;
        this.f21996p = 2;
        this.f21994n = looper;
        this.f21995o = new e(looper);
    }

    /* access modifiers changed from: private */
    public void D(Object obj, Object obj2) {
        if (obj != this.f22005y) {
            return;
        }
        if (this.f21996p == 2 || t()) {
            this.f22005y = null;
            if (obj2 instanceof Exception) {
                this.f21983c.a((Exception) obj2, false);
                return;
            }
            try {
                this.f21982b.k((byte[]) obj2);
                this.f21983c.c();
            } catch (Exception e10) {
                this.f21983c.a(e10, true);
            }
        }
    }

    private boolean E() {
        if (t()) {
            return true;
        }
        try {
            byte[] e10 = this.f21982b.e();
            this.f22002v = e10;
            this.f21982b.f(e10, this.f21991k);
            this.f22000t = this.f21982b.c(this.f22002v);
            this.f21996p = 3;
            p(new b(3));
            k4.a.e(this.f22002v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f21983c.b(this);
            return false;
        } catch (Exception e11) {
            w(e11, 1);
            return false;
        }
    }

    private void F(byte[] bArr, int i10, boolean z10) {
        try {
            this.f22004x = this.f21982b.l(bArr, this.f21981a, i10, this.f21988h);
            ((c) n0.j(this.f21999s)).b(1, k4.a.e(this.f22004x), z10);
        } catch (Exception e10) {
            y(e10, true);
        }
    }

    private boolean H() {
        try {
            this.f21982b.h(this.f22002v, this.f22003w);
            return true;
        } catch (Exception e10) {
            w(e10, 1);
            return false;
        }
    }

    private void I() {
        if (Thread.currentThread() != this.f21994n.getThread()) {
            r.j("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f21994n.getThread().getName(), new IllegalStateException());
        }
    }

    private void p(h<w.a> hVar) {
        for (w.a accept : this.f21989i.j()) {
            hVar.accept(accept);
        }
    }

    private void q(boolean z10) {
        if (!this.f21987g) {
            byte[] bArr = (byte[]) n0.j(this.f22002v);
            int i10 = this.f21985e;
            if (i10 == 0 || i10 == 1) {
                if (this.f22003w == null) {
                    F(bArr, 1, z10);
                } else if (this.f21996p == 4 || H()) {
                    long r10 = r();
                    if (this.f21985e == 0 && r10 <= 60) {
                        r.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + r10);
                        F(bArr, 2, z10);
                    } else if (r10 <= 0) {
                        w(new m0(), 2);
                    } else {
                        this.f21996p = 4;
                        p(f.f37782a);
                    }
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    k4.a.e(this.f22003w);
                    k4.a.e(this.f22002v);
                    F(this.f22003w, 3, z10);
                }
            } else if (this.f22003w == null || H()) {
                F(bArr, 2, z10);
            }
        }
    }

    private long r() {
        if (!n2.i.f20439d.equals(this.f21993m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) k4.a.e(q0.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean t() {
        int i10 = this.f21996p;
        return i10 == 3 || i10 == 4;
    }

    private void w(Exception exc, int i10) {
        this.f22001u = new o.a(exc, c0.a(exc, i10));
        r.d("DefaultDrmSession", "DRM session error", exc);
        p(new c(exc));
        if (this.f21996p != 4) {
            this.f21996p = 1;
        }
    }

    /* access modifiers changed from: private */
    public void x(Object obj, Object obj2) {
        if (obj == this.f22004x && t()) {
            this.f22004x = null;
            if (obj2 instanceof Exception) {
                y((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f21985e == 3) {
                    this.f21982b.j((byte[]) n0.j(this.f22003w), bArr);
                    p(e.f37781a);
                    return;
                }
                byte[] j10 = this.f21982b.j(this.f22002v, bArr);
                int i10 = this.f21985e;
                if (!((i10 != 2 && (i10 != 0 || this.f22003w == null)) || j10 == null || j10.length == 0)) {
                    this.f22003w = j10;
                }
                this.f21996p = 4;
                p(d.f37780a);
            } catch (Exception e10) {
                y(e10, true);
            }
        }
    }

    private void y(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f21983c.b(this);
        } else {
            w(exc, z10 ? 1 : 2);
        }
    }

    private void z() {
        if (this.f21985e == 0 && this.f21996p == 4) {
            n0.j(this.f22002v);
            q(false);
        }
    }

    public void A(int i10) {
        if (i10 == 2) {
            z();
        }
    }

    public void B() {
        if (E()) {
            q(true);
        }
    }

    public void C(Exception exc, boolean z10) {
        w(exc, z10 ? 1 : 3);
    }

    public void G() {
        this.f22005y = this.f21982b.b();
        ((c) n0.j(this.f21999s)).b(0, k4.a.e(this.f22005y), true);
    }

    public void a(w.a aVar) {
        I();
        boolean z10 = false;
        if (this.f21997q < 0) {
            r.c("DefaultDrmSession", "Session reference count less than zero: " + this.f21997q);
            this.f21997q = 0;
        }
        if (aVar != null) {
            this.f21989i.b(aVar);
        }
        int i10 = this.f21997q + 1;
        this.f21997q = i10;
        if (i10 == 1) {
            if (this.f21996p == 2) {
                z10 = true;
            }
            k4.a.f(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f21998r = handlerThread;
            handlerThread.start();
            this.f21999s = new c(this.f21998r.getLooper());
            if (E()) {
                q(true);
            }
        } else if (aVar != null && t() && this.f21989i.c(aVar) == 1) {
            aVar.k(this.f21996p);
        }
        this.f21984d.a(this, this.f21997q);
    }

    public final UUID b() {
        I();
        return this.f21993m;
    }

    public boolean c() {
        I();
        return this.f21986f;
    }

    public Map<String, String> d() {
        I();
        byte[] bArr = this.f22002v;
        if (bArr == null) {
            return null;
        }
        return this.f21982b.a(bArr);
    }

    public void e(w.a aVar) {
        I();
        int i10 = this.f21997q;
        if (i10 <= 0) {
            r.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f21997q = i11;
        if (i11 == 0) {
            this.f21996p = 0;
            ((e) n0.j(this.f21995o)).removeCallbacksAndMessages((Object) null);
            ((c) n0.j(this.f21999s)).c();
            this.f21999s = null;
            ((HandlerThread) n0.j(this.f21998r)).quit();
            this.f21998r = null;
            this.f22000t = null;
            this.f22001u = null;
            this.f22004x = null;
            this.f22005y = null;
            byte[] bArr = this.f22002v;
            if (bArr != null) {
                this.f21982b.i(bArr);
                this.f22002v = null;
            }
        }
        if (aVar != null) {
            this.f21989i.e(aVar);
            if (this.f21989i.c(aVar) == 0) {
                aVar.m();
            }
        }
        this.f21984d.b(this, this.f21997q);
    }

    public boolean f(String str) {
        I();
        return this.f21982b.g((byte[]) k4.a.h(this.f22002v), str);
    }

    public final q2.b g() {
        I();
        return this.f22000t;
    }

    public final o.a getError() {
        I();
        if (this.f21996p == 1) {
            return this.f22001u;
        }
        return null;
    }

    public final int getState() {
        I();
        return this.f21996p;
    }

    public boolean s(byte[] bArr) {
        I();
        return Arrays.equals(this.f22002v, bArr);
    }
}
