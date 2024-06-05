package com.applovin.impl;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.impl.hc;
import com.applovin.impl.x6;
import com.applovin.impl.x7;
import com.applovin.impl.y6;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

class v5 implements x6 {

    /* renamed from: a  reason: collision with root package name */
    public final List f12677a;

    /* renamed from: b  reason: collision with root package name */
    private final x7 f12678b;

    /* renamed from: c  reason: collision with root package name */
    private final a f12679c;

    /* renamed from: d  reason: collision with root package name */
    private final b f12680d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12681e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f12682f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f12683g;

    /* renamed from: h  reason: collision with root package name */
    private final HashMap f12684h;

    /* renamed from: i  reason: collision with root package name */
    private final s4 f12685i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final hc f12686j;

    /* renamed from: k  reason: collision with root package name */
    final ld f12687k;

    /* renamed from: l  reason: collision with root package name */
    final UUID f12688l;

    /* renamed from: m  reason: collision with root package name */
    final e f12689m;

    /* renamed from: n  reason: collision with root package name */
    private int f12690n;

    /* renamed from: o  reason: collision with root package name */
    private int f12691o;

    /* renamed from: p  reason: collision with root package name */
    private HandlerThread f12692p;

    /* renamed from: q  reason: collision with root package name */
    private c f12693q;

    /* renamed from: r  reason: collision with root package name */
    private x4 f12694r;

    /* renamed from: s  reason: collision with root package name */
    private x6.a f12695s;

    /* renamed from: t  reason: collision with root package name */
    private byte[] f12696t;

    /* renamed from: u  reason: collision with root package name */
    private byte[] f12697u;

    /* renamed from: v  reason: collision with root package name */
    private x7.a f12698v;

    /* renamed from: w  reason: collision with root package name */
    private x7.d f12699w;

    public interface a {
        void a();

        void a(v5 v5Var);

        void a(Exception exc, boolean z10);
    }

    public interface b {
        void a(v5 v5Var, int i10);

        void b(v5 v5Var, int i10);
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f12702a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12703b;

        /* renamed from: c  reason: collision with root package name */
        public final long f12704c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f12705d;

        /* renamed from: e  reason: collision with root package name */
        public int f12706e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f12702a = j10;
            this.f12703b = z10;
            this.f12704c = j11;
            this.f12705d = obj;
        }
    }

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
                v5.this.b(obj, obj2);
            } else if (i10 == 1) {
                v5.this.a(obj, obj2);
            }
        }
    }

    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public v5(UUID uuid, x7 x7Var, a aVar, b bVar, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, ld ldVar, Looper looper, hc hcVar) {
        if (i10 == 1 || i10 == 3) {
            a1.a((Object) bArr);
        }
        this.f12688l = uuid;
        this.f12679c = aVar;
        this.f12680d = bVar;
        this.f12678b = x7Var;
        this.f12681e = i10;
        this.f12682f = z10;
        this.f12683g = z11;
        if (bArr != null) {
            this.f12697u = bArr;
            this.f12677a = null;
        } else {
            this.f12677a = Collections.unmodifiableList((List) a1.a((Object) list));
        }
        this.f12684h = hashMap;
        this.f12687k = ldVar;
        this.f12685i = new s4();
        this.f12686j = hcVar;
        this.f12690n = 2;
        this.f12689m = new e(looper);
    }

    private boolean g() {
        int i10 = this.f12690n;
        return i10 == 3 || i10 == 4;
    }

    private void h() {
        if (this.f12681e == 0 && this.f12690n == 4) {
            yp.a((Object) this.f12696t);
            a(false);
        }
    }

    private boolean j() {
        if (g()) {
            return true;
        }
        try {
            byte[] d10 = this.f12678b.d();
            this.f12696t = d10;
            this.f12694r = this.f12678b.d(d10);
            this.f12690n = 3;
            a((p4) new d60(3));
            a1.a((Object) this.f12696t);
            return true;
        } catch (NotProvisionedException unused) {
            this.f12679c.a(this);
            return false;
        } catch (Exception e10) {
            a(e10, 1);
            return false;
        }
    }

    private boolean l() {
        try {
            this.f12678b.a(this.f12696t, this.f12697u);
            return true;
        } catch (Exception e10) {
            a(e10, 1);
            return false;
        }
    }

    public boolean c() {
        return this.f12682f;
    }

    public Map d() {
        byte[] bArr = this.f12696t;
        if (bArr == null) {
            return null;
        }
        return this.f12678b.b(bArr);
    }

    public final UUID e() {
        return this.f12688l;
    }

    public final x4 f() {
        return this.f12694r;
    }

    public final x6.a getError() {
        if (this.f12690n == 1) {
            return this.f12695s;
        }
        return null;
    }

    public void i() {
        if (j()) {
            a(true);
        }
    }

    public void k() {
        this.f12699w = this.f12678b.b();
        ((c) yp.a((Object) this.f12693q)).a(0, a1.a((Object) this.f12699w), true);
    }

    public void b(y6.a aVar) {
        boolean z10 = false;
        a1.b(this.f12691o >= 0);
        if (aVar != null) {
            this.f12685i.a(aVar);
        }
        int i10 = this.f12691o + 1;
        this.f12691o = i10;
        if (i10 == 1) {
            if (this.f12690n == 2) {
                z10 = true;
            }
            a1.b(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f12692p = handlerThread;
            handlerThread.start();
            this.f12693q = new c(this.f12692p.getLooper());
            if (j()) {
                a(true);
            }
        } else if (aVar != null && g() && this.f12685i.b(aVar) == 1) {
            aVar.a(this.f12690n);
        }
        this.f12680d.a(this, this.f12691o);
    }

    private void a(p4 p4Var) {
        for (y6.a accept : this.f12685i.a()) {
            p4Var.accept(accept);
        }
    }

    private void a(boolean z10) {
        if (!this.f12683g) {
            byte[] bArr = (byte[]) yp.a((Object) this.f12696t);
            int i10 = this.f12681e;
            if (i10 == 0 || i10 == 1) {
                if (this.f12697u == null) {
                    a(bArr, 1, z10);
                } else if (this.f12690n == 4 || l()) {
                    long a10 = a();
                    if (this.f12681e == 0 && a10 <= 60) {
                        kc.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + a10);
                        a(bArr, 2, z10);
                    } else if (a10 <= 0) {
                        a((Exception) new ub(), 2);
                    } else {
                        this.f12690n = 4;
                        a((p4) h60.f8245a);
                    }
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    a1.a((Object) this.f12697u);
                    a1.a((Object) this.f12696t);
                    a(this.f12697u, 3, z10);
                }
            } else if (this.f12697u == null || l()) {
                a(bArr, 2, z10);
            }
        }
    }

    public final int b() {
        return this.f12690n;
    }

    public void b(Exception exc, boolean z10) {
        a(exc, z10 ? 1 : 3);
    }

    /* access modifiers changed from: private */
    public void b(Object obj, Object obj2) {
        if (obj != this.f12699w) {
            return;
        }
        if (this.f12690n == 2 || g()) {
            this.f12699w = null;
            if (obj2 instanceof Exception) {
                this.f12679c.a((Exception) obj2, false);
                return;
            }
            try {
                this.f12678b.a((byte[]) obj2);
                this.f12679c.a();
            } catch (Exception e10) {
                this.f12679c.a(e10, true);
            }
        }
    }

    private class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private boolean f12700a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, md mdVar) {
            IOException iOException;
            md mdVar2 = mdVar;
            d dVar = (d) message.obj;
            if (!dVar.f12703b) {
                return false;
            }
            int i10 = dVar.f12706e + 1;
            dVar.f12706e = i10;
            if (i10 > v5.this.f12686j.a(3)) {
                return false;
            }
            ic icVar = new ic(dVar.f12702a, mdVar2.f9344a, mdVar2.f9345b, mdVar2.f9346c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f12704c, mdVar2.f9347d);
            pd pdVar = new pd(3);
            if (mdVar.getCause() instanceof IOException) {
                iOException = (IOException) mdVar.getCause();
            } else {
                iOException = new f(mdVar.getCause());
            }
            long a10 = v5.this.f12686j.a(new hc.a(icVar, pdVar, iOException, dVar.f12706e));
            if (a10 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f12700a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), a10);
                return true;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.applovin.impl.md} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.applovin.impl.md} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.applovin.impl.md} */
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
                com.applovin.impl.v5$d r0 = (com.applovin.impl.v5.d) r0
                int r1 = r6.what     // Catch:{ md -> 0x0038, Exception -> 0x002f }
                if (r1 == 0) goto L_0x0020
                r2 = 1
                if (r1 != r2) goto L_0x001a
                com.applovin.impl.v5 r1 = com.applovin.impl.v5.this     // Catch:{ md -> 0x0038, Exception -> 0x002f }
                com.applovin.impl.ld r2 = r1.f12687k     // Catch:{ md -> 0x0038, Exception -> 0x002f }
                java.util.UUID r1 = r1.f12688l     // Catch:{ md -> 0x0038, Exception -> 0x002f }
                java.lang.Object r3 = r0.f12705d     // Catch:{ md -> 0x0038, Exception -> 0x002f }
                com.applovin.impl.x7$a r3 = (com.applovin.impl.x7.a) r3     // Catch:{ md -> 0x0038, Exception -> 0x002f }
                byte[] r1 = r2.a((java.util.UUID) r1, (com.applovin.impl.x7.a) r3)     // Catch:{ md -> 0x0038, Exception -> 0x002f }
                goto L_0x0040
            L_0x001a:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ md -> 0x0038, Exception -> 0x002f }
                r1.<init>()     // Catch:{ md -> 0x0038, Exception -> 0x002f }
                throw r1     // Catch:{ md -> 0x0038, Exception -> 0x002f }
            L_0x0020:
                com.applovin.impl.v5 r1 = com.applovin.impl.v5.this     // Catch:{ md -> 0x0038, Exception -> 0x002f }
                com.applovin.impl.ld r2 = r1.f12687k     // Catch:{ md -> 0x0038, Exception -> 0x002f }
                java.util.UUID r1 = r1.f12688l     // Catch:{ md -> 0x0038, Exception -> 0x002f }
                java.lang.Object r3 = r0.f12705d     // Catch:{ md -> 0x0038, Exception -> 0x002f }
                com.applovin.impl.x7$d r3 = (com.applovin.impl.x7.d) r3     // Catch:{ md -> 0x0038, Exception -> 0x002f }
                byte[] r1 = r2.a((java.util.UUID) r1, (com.applovin.impl.x7.d) r3)     // Catch:{ md -> 0x0038, Exception -> 0x002f }
                goto L_0x0040
            L_0x002f:
                r1 = move-exception
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                com.applovin.impl.kc.c(r2, r3, r1)
                goto L_0x0040
            L_0x0038:
                r1 = move-exception
                boolean r2 = r5.a(r6, r1)
                if (r2 == 0) goto L_0x0040
                return
            L_0x0040:
                com.applovin.impl.v5 r2 = com.applovin.impl.v5.this
                com.applovin.impl.hc r2 = r2.f12686j
                long r3 = r0.f12702a
                r2.a((long) r3)
                monitor-enter(r5)
                boolean r2 = r5.f12700a     // Catch:{ all -> 0x0065 }
                if (r2 != 0) goto L_0x0063
                com.applovin.impl.v5 r2 = com.applovin.impl.v5.this     // Catch:{ all -> 0x0065 }
                com.applovin.impl.v5$e r2 = r2.f12689m     // Catch:{ all -> 0x0065 }
                int r6 = r6.what     // Catch:{ all -> 0x0065 }
                java.lang.Object r0 = r0.f12705d     // Catch:{ all -> 0x0065 }
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x0065 }
                android.os.Message r6 = r2.obtainMessage(r6, r0)     // Catch:{ all -> 0x0065 }
                r6.sendToTarget()     // Catch:{ all -> 0x0065 }
            L_0x0063:
                monitor-exit(r5)     // Catch:{ all -> 0x0065 }
                return
            L_0x0065:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0065 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.v5.c.handleMessage(android.os.Message):void");
        }

        /* access modifiers changed from: package-private */
        public void a(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(ic.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void a() {
            removeCallbacksAndMessages((Object) null);
            this.f12700a = true;
        }
    }

    public boolean a(byte[] bArr) {
        return Arrays.equals(this.f12696t, bArr);
    }

    private void a(Exception exc, int i10) {
        this.f12695s = new x6.a(exc, b7.a(exc, i10));
        kc.a("DefaultDrmSession", "DRM session error", exc);
        a((p4) new e60(exc));
        if (this.f12690n != 4) {
            this.f12690n = 1;
        }
    }

    /* access modifiers changed from: private */
    public void a(Object obj, Object obj2) {
        if (obj == this.f12698v && g()) {
            this.f12698v = null;
            if (obj2 instanceof Exception) {
                a((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f12681e == 3) {
                    this.f12678b.b((byte[]) yp.a((Object) this.f12697u), bArr);
                    a((p4) g60.f7920a);
                    return;
                }
                byte[] b10 = this.f12678b.b(this.f12696t, bArr);
                int i10 = this.f12681e;
                if (!((i10 != 2 && (i10 != 0 || this.f12697u == null)) || b10 == null || b10.length == 0)) {
                    this.f12697u = b10;
                }
                this.f12690n = 4;
                a((p4) f60.f7636a);
            } catch (Exception e10) {
                a(e10, true);
            }
        }
    }

    private void a(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f12679c.a(this);
        } else {
            a(exc, z10 ? 1 : 2);
        }
    }

    public void a(int i10) {
        if (i10 == 2) {
            h();
        }
    }

    private void a(byte[] bArr, int i10, boolean z10) {
        try {
            this.f12698v = this.f12678b.a(bArr, this.f12677a, i10, this.f12684h);
            ((c) yp.a((Object) this.f12693q)).a(1, a1.a((Object) this.f12698v), z10);
        } catch (Exception e10) {
            a(e10, true);
        }
    }

    public void a(y6.a aVar) {
        a1.b(this.f12691o > 0);
        int i10 = this.f12691o - 1;
        this.f12691o = i10;
        if (i10 == 0) {
            this.f12690n = 0;
            ((e) yp.a((Object) this.f12689m)).removeCallbacksAndMessages((Object) null);
            ((c) yp.a((Object) this.f12693q)).a();
            this.f12693q = null;
            ((HandlerThread) yp.a((Object) this.f12692p)).quit();
            this.f12692p = null;
            this.f12694r = null;
            this.f12695s = null;
            this.f12698v = null;
            this.f12699w = null;
            byte[] bArr = this.f12696t;
            if (bArr != null) {
                this.f12678b.c(bArr);
                this.f12696t = null;
            }
        }
        if (aVar != null) {
            this.f12685i.c(aVar);
            if (this.f12685i.b(aVar) == 0) {
                aVar.d();
            }
        }
        this.f12680d.b(this, this.f12691o);
    }

    public boolean a(String str) {
        return this.f12678b.a((byte[]) a1.b((Object) this.f12696t), str);
    }

    private long a() {
        if (!r2.f11116d.equals(this.f12688l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) a1.a((Object) cs.a(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }
}
