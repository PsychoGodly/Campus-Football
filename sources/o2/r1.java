package o2;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import k4.n0;
import n2.c4;
import o2.c;
import o2.t1;
import p3.x;
import r6.v;

/* compiled from: DefaultPlaybackSessionManager */
public final class r1 implements t1 {

    /* renamed from: h  reason: collision with root package name */
    public static final v<String> f21018h = q1.f36684a;

    /* renamed from: i  reason: collision with root package name */
    private static final Random f21019i = new Random();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c4.d f21020a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final c4.b f21021b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, a> f21022c;

    /* renamed from: d  reason: collision with root package name */
    private final v<String> f21023d;

    /* renamed from: e  reason: collision with root package name */
    private t1.a f21024e;

    /* renamed from: f  reason: collision with root package name */
    private c4 f21025f;

    /* renamed from: g  reason: collision with root package name */
    private String f21026g;

    /* compiled from: DefaultPlaybackSessionManager */
    private final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f21027a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f21028b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public long f21029c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public x.b f21030d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f21031e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public boolean f21032f;

        public a(String str, int i10, x.b bVar) {
            long j10;
            this.f21027a = str;
            this.f21028b = i10;
            if (bVar == null) {
                j10 = -1;
            } else {
                j10 = bVar.f21680d;
            }
            this.f21029c = j10;
            if (bVar != null && bVar.b()) {
                this.f21030d = bVar;
            }
        }

        private int l(c4 c4Var, c4 c4Var2, int i10) {
            if (i10 < c4Var.t()) {
                c4Var.r(i10, r1.this.f21020a);
                for (int i11 = r1.this.f21020a.f20249p; i11 <= r1.this.f21020a.f20250q; i11++) {
                    int f10 = c4Var2.f(c4Var.q(i11));
                    if (f10 != -1) {
                        return c4Var2.j(f10, r1.this.f21021b).f20218c;
                    }
                }
                return -1;
            } else if (i10 < c4Var2.t()) {
                return i10;
            } else {
                return -1;
            }
        }

        public boolean i(int i10, x.b bVar) {
            if (bVar == null) {
                return i10 == this.f21028b;
            }
            x.b bVar2 = this.f21030d;
            if (bVar2 == null) {
                if (bVar.b() || bVar.f21680d != this.f21029c) {
                    return false;
                }
                return true;
            } else if (bVar.f21680d == bVar2.f21680d && bVar.f21678b == bVar2.f21678b && bVar.f21679c == bVar2.f21679c) {
                return true;
            } else {
                return false;
            }
        }

        public boolean j(c.a aVar) {
            x.b bVar = aVar.f20994d;
            if (bVar != null) {
                long j10 = this.f21029c;
                if (j10 == -1) {
                    return false;
                }
                if (bVar.f21680d > j10) {
                    return true;
                }
                if (this.f21030d == null) {
                    return false;
                }
                int f10 = aVar.f20992b.f(bVar.f21677a);
                int f11 = aVar.f20992b.f(this.f21030d.f21677a);
                x.b bVar2 = aVar.f20994d;
                if (bVar2.f21680d < this.f21030d.f21680d || f10 < f11) {
                    return false;
                }
                if (f10 > f11) {
                    return true;
                }
                if (bVar2.b()) {
                    x.b bVar3 = aVar.f20994d;
                    int i10 = bVar3.f21678b;
                    int i11 = bVar3.f21679c;
                    x.b bVar4 = this.f21030d;
                    int i12 = bVar4.f21678b;
                    if (i10 > i12) {
                        return true;
                    }
                    if (i10 != i12 || i11 <= bVar4.f21679c) {
                        return false;
                    }
                    return true;
                }
                int i13 = aVar.f20994d.f21681e;
                if (i13 == -1 || i13 > this.f21030d.f21678b) {
                    return true;
                }
                return false;
            } else if (this.f21028b != aVar.f20993c) {
                return true;
            } else {
                return false;
            }
        }

        public void k(int i10, x.b bVar) {
            if (this.f21029c == -1 && i10 == this.f21028b && bVar != null) {
                this.f21029c = bVar.f21680d;
            }
        }

        public boolean m(c4 c4Var, c4 c4Var2) {
            int l10 = l(c4Var, c4Var2, this.f21028b);
            this.f21028b = l10;
            if (l10 == -1) {
                return false;
            }
            x.b bVar = this.f21030d;
            if (bVar != null && c4Var2.f(bVar.f21677a) == -1) {
                return false;
            }
            return true;
        }
    }

    public r1() {
        this(f21018h);
    }

    /* access modifiers changed from: private */
    public static String k() {
        byte[] bArr = new byte[12];
        f21019i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private a l(int i10, x.b bVar) {
        int i11;
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a next : this.f21022c.values()) {
            next.k(i10, bVar);
            if (next.i(i10, bVar)) {
                long b10 = next.f21029c;
                if (b10 == -1 || b10 < j10) {
                    aVar = next;
                    j10 = b10;
                } else if (!(i11 != 0 || ((a) n0.j(aVar)).f21030d == null || next.f21030d == null)) {
                    aVar = next;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f21023d.get();
        a aVar2 = new a(str, i10, bVar);
        this.f21022c.put(str, aVar2);
        return aVar2;
    }

    private void m(c.a aVar) {
        if (aVar.f20992b.u()) {
            this.f21026g = null;
            return;
        }
        a aVar2 = this.f21022c.get(this.f21026g);
        a l10 = l(aVar.f20993c, aVar.f20994d);
        this.f21026g = l10.f21027a;
        c(aVar);
        x.b bVar = aVar.f20994d;
        if (bVar != null && bVar.b()) {
            if (aVar2 == null || aVar2.f21029c != aVar.f20994d.f21680d || aVar2.f21030d == null || aVar2.f21030d.f21678b != aVar.f20994d.f21678b || aVar2.f21030d.f21679c != aVar.f20994d.f21679c) {
                x.b bVar2 = aVar.f20994d;
                this.f21024e.W(aVar, l(aVar.f20993c, new x.b(bVar2.f21677a, bVar2.f21680d)).f21027a, l10.f21027a);
            }
        }
    }

    public synchronized String a() {
        return this.f21026g;
    }

    public synchronized String b(c4 c4Var, x.b bVar) {
        return l(c4Var.l(bVar.f21677a, this.f21021b).f20218c, bVar).f21027a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0117, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c(o2.c.a r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            monitor-enter(r24)
            o2.t1$a r2 = r1.f21024e     // Catch:{ all -> 0x0118 }
            k4.a.e(r2)     // Catch:{ all -> 0x0118 }
            n2.c4 r2 = r0.f20992b     // Catch:{ all -> 0x0118 }
            boolean r2 = r2.u()     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x0014
            monitor-exit(r24)
            return
        L_0x0014:
            java.util.HashMap<java.lang.String, o2.r1$a> r2 = r1.f21022c     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r1.f21026g     // Catch:{ all -> 0x0118 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0118 }
            o2.r1$a r2 = (o2.r1.a) r2     // Catch:{ all -> 0x0118 }
            p3.x$b r3 = r0.f20994d     // Catch:{ all -> 0x0118 }
            r4 = 1
            if (r3 == 0) goto L_0x004b
            if (r2 == 0) goto L_0x004b
            long r5 = r2.f21029c     // Catch:{ all -> 0x0118 }
            r7 = -1
            r3 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x003a
            int r2 = r2.f21028b     // Catch:{ all -> 0x0118 }
            int r5 = r0.f20993c     // Catch:{ all -> 0x0118 }
            if (r2 == r5) goto L_0x0047
        L_0x0038:
            r3 = 1
            goto L_0x0047
        L_0x003a:
            p3.x$b r5 = r0.f20994d     // Catch:{ all -> 0x0118 }
            long r5 = r5.f21680d     // Catch:{ all -> 0x0118 }
            long r7 = r2.f21029c     // Catch:{ all -> 0x0118 }
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0047
            goto L_0x0038
        L_0x0047:
            if (r3 == 0) goto L_0x004b
            monitor-exit(r24)
            return
        L_0x004b:
            int r2 = r0.f20993c     // Catch:{ all -> 0x0118 }
            p3.x$b r3 = r0.f20994d     // Catch:{ all -> 0x0118 }
            o2.r1$a r2 = r1.l(r2, r3)     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r1.f21026g     // Catch:{ all -> 0x0118 }
            if (r3 != 0) goto L_0x005d
            java.lang.String r3 = r2.f21027a     // Catch:{ all -> 0x0118 }
            r1.f21026g = r3     // Catch:{ all -> 0x0118 }
        L_0x005d:
            p3.x$b r3 = r0.f20994d     // Catch:{ all -> 0x0118 }
            if (r3 == 0) goto L_0x00d9
            boolean r3 = r3.b()     // Catch:{ all -> 0x0118 }
            if (r3 == 0) goto L_0x00d9
            p3.x$b r10 = new p3.x$b     // Catch:{ all -> 0x0118 }
            p3.x$b r3 = r0.f20994d     // Catch:{ all -> 0x0118 }
            java.lang.Object r5 = r3.f21677a     // Catch:{ all -> 0x0118 }
            long r6 = r3.f21680d     // Catch:{ all -> 0x0118 }
            int r3 = r3.f21678b     // Catch:{ all -> 0x0118 }
            r10.<init>(r5, r6, r3)     // Catch:{ all -> 0x0118 }
            int r3 = r0.f20993c     // Catch:{ all -> 0x0118 }
            o2.r1$a r3 = r1.l(r3, r10)     // Catch:{ all -> 0x0118 }
            boolean r5 = r3.f21031e     // Catch:{ all -> 0x0118 }
            if (r5 != 0) goto L_0x00d9
            boolean unused = r3.f21031e = r4     // Catch:{ all -> 0x0118 }
            n2.c4 r5 = r0.f20992b     // Catch:{ all -> 0x0118 }
            p3.x$b r6 = r0.f20994d     // Catch:{ all -> 0x0118 }
            java.lang.Object r6 = r6.f21677a     // Catch:{ all -> 0x0118 }
            n2.c4$b r7 = r1.f21021b     // Catch:{ all -> 0x0118 }
            r5.l(r6, r7)     // Catch:{ all -> 0x0118 }
            n2.c4$b r5 = r1.f21021b     // Catch:{ all -> 0x0118 }
            p3.x$b r6 = r0.f20994d     // Catch:{ all -> 0x0118 }
            int r6 = r6.f21678b     // Catch:{ all -> 0x0118 }
            long r5 = r5.i(r6)     // Catch:{ all -> 0x0118 }
            long r5 = k4.n0.Z0(r5)     // Catch:{ all -> 0x0118 }
            n2.c4$b r7 = r1.f21021b     // Catch:{ all -> 0x0118 }
            long r7 = r7.p()     // Catch:{ all -> 0x0118 }
            long r5 = r5 + r7
            r7 = 0
            long r11 = java.lang.Math.max(r7, r5)     // Catch:{ all -> 0x0118 }
            o2.c$a r15 = new o2.c$a     // Catch:{ all -> 0x0118 }
            long r6 = r0.f20991a     // Catch:{ all -> 0x0118 }
            n2.c4 r8 = r0.f20992b     // Catch:{ all -> 0x0118 }
            int r9 = r0.f20993c     // Catch:{ all -> 0x0118 }
            n2.c4 r13 = r0.f20996f     // Catch:{ all -> 0x0118 }
            int r14 = r0.f20997g     // Catch:{ all -> 0x0118 }
            p3.x$b r5 = r0.f20998h     // Catch:{ all -> 0x0118 }
            r16 = r5
            long r4 = r0.f20999i     // Catch:{ all -> 0x0118 }
            r20 = r2
            r21 = r3
            long r2 = r0.f21000j     // Catch:{ all -> 0x0118 }
            r22 = r4
            r4 = r16
            r16 = r22
            r5 = r15
            r0 = r15
            r15 = r4
            r18 = r2
            r5.<init>(r6, r8, r9, r10, r11, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0118 }
            o2.t1$a r2 = r1.f21024e     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r21.f21027a     // Catch:{ all -> 0x0118 }
            r2.t(r0, r3)     // Catch:{ all -> 0x0118 }
            goto L_0x00db
        L_0x00d9:
            r20 = r2
        L_0x00db:
            boolean r0 = r20.f21031e     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x00f3
            r0 = r20
            r2 = 1
            boolean unused = r0.f21031e = r2     // Catch:{ all -> 0x0118 }
            o2.t1$a r2 = r1.f21024e     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r0.f21027a     // Catch:{ all -> 0x0118 }
            r4 = r25
            r2.t(r4, r3)     // Catch:{ all -> 0x0118 }
            goto L_0x00f7
        L_0x00f3:
            r4 = r25
            r0 = r20
        L_0x00f7:
            java.lang.String r2 = r0.f21027a     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r1.f21026g     // Catch:{ all -> 0x0118 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x0116
            boolean r2 = r0.f21032f     // Catch:{ all -> 0x0118 }
            if (r2 != 0) goto L_0x0116
            r2 = 1
            boolean unused = r0.f21032f = r2     // Catch:{ all -> 0x0118 }
            o2.t1$a r2 = r1.f21024e     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r0.f21027a     // Catch:{ all -> 0x0118 }
            r2.E(r4, r0)     // Catch:{ all -> 0x0118 }
        L_0x0116:
            monitor-exit(r24)
            return
        L_0x0118:
            r0 = move-exception
            monitor-exit(r24)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.r1.c(o2.c$a):void");
    }

    public synchronized void d(c.a aVar) {
        t1.a aVar2;
        this.f21026g = null;
        Iterator<a> it = this.f21022c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.f21031e && (aVar2 = this.f21024e) != null) {
                aVar2.p0(aVar, next.f21027a, false);
            }
        }
    }

    public synchronized void e(c.a aVar) {
        k4.a.e(this.f21024e);
        c4 c4Var = this.f21025f;
        this.f21025f = aVar.f20992b;
        Iterator<a> it = this.f21022c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.m(c4Var, this.f21025f) || next.j(aVar)) {
                it.remove();
                if (next.f21031e) {
                    if (next.f21027a.equals(this.f21026g)) {
                        this.f21026g = null;
                    }
                    this.f21024e.p0(aVar, next.f21027a, false);
                }
            }
        }
        m(aVar);
    }

    public synchronized void f(c.a aVar, int i10) {
        k4.a.e(this.f21024e);
        boolean z10 = i10 == 0;
        Iterator<a> it = this.f21022c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.j(aVar)) {
                it.remove();
                if (next.f21031e) {
                    boolean equals = next.f21027a.equals(this.f21026g);
                    boolean z11 = z10 && equals && next.f21032f;
                    if (equals) {
                        this.f21026g = null;
                    }
                    this.f21024e.p0(aVar, next.f21027a, z11);
                }
            }
        }
        m(aVar);
    }

    public void g(t1.a aVar) {
        this.f21024e = aVar;
    }

    public r1(v<String> vVar) {
        this.f21023d = vVar;
        this.f21020a = new c4.d();
        this.f21021b = new c4.b();
        this.f21022c = new HashMap<>();
        this.f21025f = c4.f20205a;
    }
}
