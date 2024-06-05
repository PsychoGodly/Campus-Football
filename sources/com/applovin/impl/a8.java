package com.applovin.impl;

import android.os.Looper;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.impl.ae;
import com.applovin.impl.c8;
import com.applovin.impl.cc;
import com.applovin.impl.go;
import com.applovin.impl.nh;
import com.applovin.impl.oh;
import com.applovin.impl.wd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

final class a8 extends c2 {
    private fj A;
    private tj B;
    private boolean C;
    private nh.b D;
    private qd E;
    private qd F;
    private lh G;
    private int H;
    private int I;
    private long J;

    /* renamed from: b  reason: collision with root package name */
    final xo f6309b;

    /* renamed from: c  reason: collision with root package name */
    final nh.b f6310c;

    /* renamed from: d  reason: collision with root package name */
    private final li[] f6311d;

    /* renamed from: e  reason: collision with root package name */
    private final wo f6312e;

    /* renamed from: f  reason: collision with root package name */
    private final ha f6313f;

    /* renamed from: g  reason: collision with root package name */
    private final c8.f f6314g;

    /* renamed from: h  reason: collision with root package name */
    private final c8 f6315h;

    /* renamed from: i  reason: collision with root package name */
    private final cc f6316i;

    /* renamed from: j  reason: collision with root package name */
    private final CopyOnWriteArraySet f6317j;

    /* renamed from: k  reason: collision with root package name */
    private final go.b f6318k;

    /* renamed from: l  reason: collision with root package name */
    private final List f6319l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f6320m;

    /* renamed from: n  reason: collision with root package name */
    private final yd f6321n;

    /* renamed from: o  reason: collision with root package name */
    private final r0 f6322o;

    /* renamed from: p  reason: collision with root package name */
    private final Looper f6323p;

    /* renamed from: q  reason: collision with root package name */
    private final x1 f6324q;

    /* renamed from: r  reason: collision with root package name */
    private final long f6325r;

    /* renamed from: s  reason: collision with root package name */
    private final long f6326s;

    /* renamed from: t  reason: collision with root package name */
    private final j3 f6327t;

    /* renamed from: u  reason: collision with root package name */
    private int f6328u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f6329v;

    /* renamed from: w  reason: collision with root package name */
    private int f6330w;

    /* renamed from: x  reason: collision with root package name */
    private int f6331x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f6332y;

    /* renamed from: z  reason: collision with root package name */
    private int f6333z;

    private static final class a implements zd {

        /* renamed from: a  reason: collision with root package name */
        private final Object f6334a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public go f6335b;

        public a(Object obj, go goVar) {
            this.f6334a = obj;
            this.f6335b = goVar;
        }

        public go b() {
            return this.f6335b;
        }

        public Object a() {
            return this.f6334a;
        }
    }

    /* JADX WARNING: type inference failed for: r37v0, types: [com.applovin.impl.nh] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a8(com.applovin.impl.li[] r19, com.applovin.impl.wo r20, com.applovin.impl.yd r21, com.applovin.impl.gc r22, com.applovin.impl.x1 r23, com.applovin.impl.r0 r24, boolean r25, com.applovin.impl.fj r26, long r27, long r29, com.applovin.impl.fc r31, long r32, boolean r34, com.applovin.impl.j3 r35, android.os.Looper r36, com.applovin.impl.nh r37, com.applovin.impl.nh.b r38) {
        /*
            r18 = this;
            r0 = r18
            r2 = r19
            r6 = r23
            r9 = r24
            r15 = r35
            r14 = r36
            r18.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Init "
            r1.append(r3)
            int r3 = java.lang.System.identityHashCode(r18)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r1.append(r3)
            java.lang.String r3 = " ["
            r1.append(r3)
            java.lang.String r3 = "ExoPlayerLib/2.15.1"
            r1.append(r3)
            java.lang.String r3 = "] ["
            r1.append(r3)
            java.lang.String r3 = com.applovin.impl.yp.f13666e
            r1.append(r3)
            java.lang.String r3 = "]"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "ExoPlayerImpl"
            com.applovin.impl.kc.c(r3, r1)
            int r1 = r2.length
            r3 = 0
            if (r1 <= 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            com.applovin.impl.a1.b((boolean) r1)
            java.lang.Object r1 = com.applovin.impl.a1.a((java.lang.Object) r19)
            com.applovin.impl.li[] r1 = (com.applovin.impl.li[]) r1
            r0.f6311d = r1
            java.lang.Object r1 = com.applovin.impl.a1.a((java.lang.Object) r20)
            com.applovin.impl.wo r1 = (com.applovin.impl.wo) r1
            r0.f6312e = r1
            r1 = r21
            r0.f6321n = r1
            r0.f6324q = r6
            r0.f6322o = r9
            r1 = r25
            r0.f6320m = r1
            r10 = r26
            r0.A = r10
            r4 = r27
            r0.f6325r = r4
            r4 = r29
            r0.f6326s = r4
            r12 = r34
            r0.C = r12
            r0.f6323p = r14
            r0.f6327t = r15
            r0.f6328u = r3
            if (r37 == 0) goto L_0x0087
            r1 = r37
            goto L_0x0088
        L_0x0087:
            r1 = r0
        L_0x0088:
            com.applovin.impl.cc r4 = new com.applovin.impl.cc
            com.applovin.impl.ws r5 = new com.applovin.impl.ws
            r5.<init>(r1)
            r4.<init>(r14, r15, r5)
            r0.f6316i = r4
            java.util.concurrent.CopyOnWriteArraySet r4 = new java.util.concurrent.CopyOnWriteArraySet
            r4.<init>()
            r0.f6317j = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.f6319l = r4
            com.applovin.impl.tj$a r4 = new com.applovin.impl.tj$a
            r4.<init>(r3)
            r0.B = r4
            com.applovin.impl.xo r4 = new com.applovin.impl.xo
            int r3 = r2.length
            com.applovin.impl.ni[] r3 = new com.applovin.impl.ni[r3]
            int r5 = r2.length
            com.applovin.impl.f8[] r5 = new com.applovin.impl.f8[r5]
            r7 = 0
            r4.<init>(r3, r5, r7)
            r0.f6309b = r4
            com.applovin.impl.go$b r3 = new com.applovin.impl.go$b
            r3.<init>()
            r0.f6318k = r3
            com.applovin.impl.nh$b$a r3 = new com.applovin.impl.nh$b$a
            r3.<init>()
            r5 = 10
            int[] r5 = new int[r5]
            r5 = {1, 2, 12, 13, 14, 15, 16, 17, 18, 19} // fill-array
            com.applovin.impl.nh$b$a r3 = r3.a((int[]) r5)
            boolean r5 = r20.b()
            r8 = 28
            com.applovin.impl.nh$b$a r3 = r3.a(r8, r5)
            r5 = r38
            com.applovin.impl.nh$b$a r3 = r3.a((com.applovin.impl.nh.b) r5)
            com.applovin.impl.nh$b r3 = r3.a()
            r0.f6310c = r3
            com.applovin.impl.nh$b$a r5 = new com.applovin.impl.nh$b$a
            r5.<init>()
            com.applovin.impl.nh$b$a r3 = r5.a((com.applovin.impl.nh.b) r3)
            r5 = 3
            com.applovin.impl.nh$b$a r3 = r3.a((int) r5)
            r5 = 9
            com.applovin.impl.nh$b$a r3 = r3.a((int) r5)
            com.applovin.impl.nh$b r3 = r3.a()
            r0.D = r3
            com.applovin.impl.qd r3 = com.applovin.impl.qd.H
            r0.E = r3
            r0.F = r3
            r3 = -1
            r0.H = r3
            com.applovin.impl.ha r3 = r15.a(r14, r7)
            r0.f6313f = r3
            com.applovin.impl.js r13 = new com.applovin.impl.js
            r13.<init>(r0)
            r0.f6314g = r13
            com.applovin.impl.lh r3 = com.applovin.impl.lh.a((com.applovin.impl.xo) r4)
            r0.G = r3
            if (r9 == 0) goto L_0x012a
            r9.a((com.applovin.impl.nh) r1, (android.os.Looper) r14)
            r0.b((com.applovin.impl.nh.e) r9)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r14)
            r6.a(r1, r9)
        L_0x012a:
            com.applovin.impl.c8 r11 = new com.applovin.impl.c8
            r1 = r11
            int r7 = r0.f6328u
            boolean r8 = r0.f6329v
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r23
            r9 = r24
            r10 = r26
            r0 = r11
            r11 = r31
            r17 = r13
            r12 = r32
            r14 = r34
            r15 = r36
            r16 = r35
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)
            r1 = r0
            r0 = r18
            r0.f6315h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.a8.<init>(com.applovin.impl.li[], com.applovin.impl.wo, com.applovin.impl.yd, com.applovin.impl.gc, com.applovin.impl.x1, com.applovin.impl.r0, boolean, com.applovin.impl.fj, long, long, com.applovin.impl.fc, long, boolean, com.applovin.impl.j3, android.os.Looper, com.applovin.impl.nh, com.applovin.impl.nh$b):void");
    }

    private go R() {
        return new ph(this.f6319l, this.B);
    }

    private int U() {
        if (this.G.f9219a.c()) {
            return this.H;
        }
        lh lhVar = this.G;
        return lhVar.f9219a.a(lhVar.f9220b.f12394a, this.f6318k).f8054c;
    }

    private void X() {
        nh.b bVar = this.D;
        nh.b a10 = a(this.f6310c);
        this.D = a10;
        if (!a10.equals(bVar)) {
            this.f6316i.a(13, (cc.a) new zs(this));
        }
    }

    private nh.f d(long j10) {
        int i10;
        Object obj;
        od odVar;
        int t10 = t();
        Object obj2 = null;
        if (!this.G.f9219a.c()) {
            lh lhVar = this.G;
            Object obj3 = lhVar.f9220b.f12394a;
            lhVar.f9219a.a(obj3, this.f6318k);
            i10 = this.G.f9219a.a(obj3);
            obj = obj3;
            obj2 = this.G.f9219a.a(t10, this.f6820a).f8067a;
            odVar = this.f6820a.f8069c;
        } else {
            odVar = null;
            obj = null;
            i10 = -1;
        }
        long b10 = r2.b(j10);
        long b11 = this.G.f9220b.a() ? r2.b(b(this.G)) : b10;
        wd.a aVar = this.G.f9220b;
        return new nh.f(obj2, t10, odVar, obj, i10, b10, b11, aVar.f12395b, aVar.f12396c);
    }

    public uo A() {
        return new uo(this.G.f9227i.f13434c);
    }

    public qd C() {
        return this.E;
    }

    public int E() {
        if (d()) {
            return this.G.f9220b.f12395b;
        }
        return -1;
    }

    public long F() {
        return this.f6325r;
    }

    public boolean S() {
        return this.G.f9234p;
    }

    /* renamed from: T */
    public ab x() {
        return ab.h();
    }

    /* renamed from: V */
    public y7 c() {
        return this.G.f9224f;
    }

    public void W() {
        kc.c("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + "ExoPlayerLib/2.15.1" + "] [" + yp.f13666e + "] [" + d8.a() + "]");
        if (!this.f6315h.x()) {
            this.f6316i.b(10, ts.f12445a);
        }
        this.f6316i.b();
        this.f6313f.a((Object) null);
        r0 r0Var = this.f6322o;
        if (r0Var != null) {
            this.f6324q.a(r0Var);
        }
        lh a10 = this.G.a(1);
        this.G = a10;
        lh a11 = a10.a(a10.f9220b);
        this.G = a11;
        a11.f9235q = a11.f9237s;
        this.G.f9236r = 0;
    }

    public void a(SurfaceView surfaceView) {
    }

    public void a(TextureView textureView) {
    }

    public void a(z7 z7Var) {
        this.f6317j.add(z7Var);
    }

    public void b(SurfaceView surfaceView) {
    }

    public void b(TextureView textureView) {
    }

    public void b(nh.e eVar) {
        a((nh.c) eVar);
    }

    public void c(long j10) {
        this.f6315h.a(j10);
    }

    public long e() {
        return this.f6326s;
    }

    public int f() {
        if (d()) {
            return this.G.f9220b.f12396c;
        }
        return -1;
    }

    public long g() {
        if (!d()) {
            return getCurrentPosition();
        }
        lh lhVar = this.G;
        lhVar.f9219a.a(lhVar.f9220b.f12394a, this.f6318k);
        lh lhVar2 = this.G;
        if (lhVar2.f9221c == -9223372036854775807L) {
            return lhVar2.f9219a.a(t(), this.f6820a).b();
        }
        return this.f6318k.d() + r2.b(this.G.f9221c);
    }

    public long getCurrentPosition() {
        return r2.b(a(this.G));
    }

    public long getDuration() {
        if (!d()) {
            return G();
        }
        lh lhVar = this.G;
        wd.a aVar = lhVar.f9220b;
        lhVar.f9219a.a(aVar.f12394a, this.f6318k);
        return r2.b(this.f6318k.a(aVar.f12395b, aVar.f12396c));
    }

    public long h() {
        return r2.b(this.G.f9236r);
    }

    public nh.b i() {
        return this.D;
    }

    public int j() {
        return this.G.f9231m;
    }

    public qo k() {
        return this.G.f9226h;
    }

    public boolean l() {
        return this.G.f9230l;
    }

    public int m() {
        return this.f6328u;
    }

    public go n() {
        return this.G.f9219a;
    }

    public int o() {
        return this.G.f9223e;
    }

    public Looper p() {
        return this.f6323p;
    }

    public long q() {
        return 3000;
    }

    public boolean r() {
        return this.f6329v;
    }

    public long s() {
        if (this.G.f9219a.c()) {
            return this.J;
        }
        lh lhVar = this.G;
        if (lhVar.f9229k.f12397d != lhVar.f9220b.f12397d) {
            return lhVar.f9219a.a(t(), this.f6820a).d();
        }
        long j10 = lhVar.f9235q;
        if (this.G.f9229k.a()) {
            lh lhVar2 = this.G;
            go.b a10 = lhVar2.f9219a.a(lhVar2.f9229k.f12394a, this.f6318k);
            long b10 = a10.b(this.G.f9229k.f12395b);
            j10 = b10 == Long.MIN_VALUE ? a10.f8055d : b10;
        }
        lh lhVar3 = this.G;
        return r2.b(a(lhVar3.f9219a, lhVar3.f9229k, j10));
    }

    public int t() {
        int U = U();
        if (U == -1) {
            return 0;
        }
        return U;
    }

    public int v() {
        if (this.G.f9219a.c()) {
            return this.I;
        }
        lh lhVar = this.G;
        return lhVar.f9219a.a(lhVar.f9220b.f12394a);
    }

    public yq z() {
        return yq.f13677f;
    }

    private static long b(lh lhVar) {
        go.d dVar = new go.d();
        go.b bVar = new go.b();
        lhVar.f9219a.a(lhVar.f9220b.f12394a, bVar);
        if (lhVar.f9221c == -9223372036854775807L) {
            return lhVar.f9219a.a(bVar.f8054c, dVar).c();
        }
        return bVar.e() + lhVar.f9221c;
    }

    public void a(nh.c cVar) {
        this.f6316i.a((Object) cVar);
    }

    private Pair a(lh lhVar, lh lhVar2, boolean z10, int i10, boolean z11) {
        go goVar = lhVar2.f9219a;
        go goVar2 = lhVar.f9219a;
        if (goVar2.c() && goVar.c()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (goVar2.c() != goVar.c()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (!goVar.a(goVar.a(lhVar2.f9220b.f12394a, this.f6318k).f8054c, this.f6820a).f8067a.equals(goVar2.a(goVar2.a(lhVar.f9220b.f12394a, this.f6318k).f8054c, this.f6820a).f8067a)) {
            if (z10 && i10 == 0) {
                i11 = 1;
            } else if (z10 && i10 == 1) {
                i11 = 2;
            } else if (!z11) {
                throw new IllegalStateException();
            }
            return new Pair(Boolean.TRUE, Integer.valueOf(i11));
        } else if (!z10 || i10 != 0 || lhVar2.f9220b.f12397d >= lhVar.f9220b.f12397d) {
            return new Pair(Boolean.FALSE, -1);
        } else {
            return new Pair(Boolean.TRUE, 0);
        }
    }

    private static boolean c(lh lhVar) {
        return lhVar.f9223e == 3 && lhVar.f9230l && lhVar.f9231m == 0;
    }

    public void e(nh.c cVar) {
        this.f6316i.b(cVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(c8.e eVar) {
        this.f6313f.a((Runnable) new xs(this, eVar));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(lh lhVar, nh.c cVar) {
        cVar.e(lhVar.f9225g);
        cVar.c(lhVar.f9225g);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(nh.c cVar) {
        cVar.a(this.E);
    }

    public void b() {
        lh lhVar = this.G;
        if (lhVar.f9223e == 1) {
            lh a10 = lhVar.a((y7) null);
            lh a11 = a10.a(a10.f9219a.c() ? 4 : 2);
            this.f6330w++;
            this.f6315h.v();
            a(a11, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public boolean d() {
        return this.G.f9220b.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(nh.c cVar) {
        cVar.a(this.D);
    }

    private void b(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f6319l.remove(i12);
        }
        this.B = this.B.a(i10, i11);
    }

    public void b(boolean z10) {
        if (this.f6329v != z10) {
            this.f6329v = z10;
            this.f6315h.f(z10);
            this.f6316i.a(9, (cc.a) new ss(z10));
            X();
            this.f6316i.a();
        }
    }

    private long a(lh lhVar) {
        if (lhVar.f9219a.c()) {
            return r2.a(this.J);
        }
        if (lhVar.f9220b.a()) {
            return lhVar.f9237s;
        }
        return a(lhVar.f9219a, lhVar.f9220b, lhVar.f9237s);
    }

    private Pair a(go goVar, go goVar2) {
        long g10 = g();
        int i10 = -1;
        if (goVar.c() || goVar2.c()) {
            boolean z10 = !goVar.c() && goVar2.c();
            if (!z10) {
                i10 = U();
            }
            if (z10) {
                g10 = -9223372036854775807L;
            }
            return a(goVar2, i10, g10);
        }
        Pair a10 = goVar.a(this.f6820a, this.f6318k, t(), r2.a(g10));
        Object obj = ((Pair) yp.a((Object) a10)).first;
        if (goVar2.a(obj) != -1) {
            return a10;
        }
        Object a11 = c8.a(this.f6820a, this.f6318k, this.f6328u, this.f6329v, obj, goVar, goVar2);
        if (a11 == null) {
            return a(goVar2, -1, -9223372036854775807L);
        }
        goVar2.a(a11, this.f6318k);
        int i11 = this.f6318k.f8054c;
        return a(goVar2, i11, goVar2.a(i11, this.f6820a).b());
    }

    private Pair a(go goVar, int i10, long j10) {
        if (goVar.c()) {
            this.H = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.J = j10;
            this.I = 0;
            return null;
        }
        if (i10 == -1 || i10 >= goVar.b()) {
            i10 = goVar.a(this.f6329v);
            j10 = goVar.a(i10, this.f6820a).b();
        }
        return goVar.a(this.f6820a, this.f6318k, i10, r2.a(j10));
    }

    public mh a() {
        return this.G.f9232n;
    }

    private nh.f a(int i10, lh lhVar, int i11) {
        int i12;
        Object obj;
        od odVar;
        int i13;
        Object obj2;
        long j10;
        long j11;
        long j12;
        long j13;
        lh lhVar2 = lhVar;
        go.b bVar = new go.b();
        if (!lhVar2.f9219a.c()) {
            Object obj3 = lhVar2.f9220b.f12394a;
            lhVar2.f9219a.a(obj3, bVar);
            int i14 = bVar.f8054c;
            i13 = i14;
            obj = obj3;
            i12 = lhVar2.f9219a.a(obj3);
            obj2 = lhVar2.f9219a.a(i14, this.f6820a).f8067a;
            odVar = this.f6820a.f8069c;
        } else {
            i13 = i11;
            obj2 = null;
            odVar = null;
            obj = null;
            i12 = -1;
        }
        if (i10 == 0) {
            j10 = bVar.f8056f + bVar.f8055d;
            if (lhVar2.f9220b.a()) {
                wd.a aVar = lhVar2.f9220b;
                j12 = bVar.a(aVar.f12395b, aVar.f12396c);
                j13 = b(lhVar);
            } else {
                if (lhVar2.f9220b.f12398e != -1 && this.G.f9220b.a()) {
                    j10 = b(this.G);
                }
                j11 = j10;
                long b10 = r2.b(j11);
                long b11 = r2.b(j10);
                wd.a aVar2 = lhVar2.f9220b;
                return new nh.f(obj2, i13, odVar, obj, i12, b10, b11, aVar2.f12395b, aVar2.f12396c);
            }
        } else if (lhVar2.f9220b.a()) {
            j12 = lhVar2.f9237s;
            j13 = b(lhVar);
        } else {
            j10 = bVar.f8056f + lhVar2.f9237s;
            j11 = j10;
            long b102 = r2.b(j11);
            long b112 = r2.b(j10);
            wd.a aVar22 = lhVar2.f9220b;
            return new nh.f(obj2, i13, odVar, obj, i12, b102, b112, aVar22.f12395b, aVar22.f12396c);
        }
        long j14 = j13;
        j11 = j12;
        j10 = j14;
        long b1022 = r2.b(j11);
        long b1122 = r2.b(j10);
        wd.a aVar222 = lhVar2.f9220b;
        return new nh.f(obj2, i13, odVar, obj, i12, b1022, b1122, aVar222.f12395b, aVar222.f12396c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void b(c8.e eVar) {
        long j10;
        boolean z10;
        long j11;
        int i10 = this.f6330w - eVar.f6917c;
        this.f6330w = i10;
        boolean z11 = true;
        if (eVar.f6918d) {
            this.f6331x = eVar.f6919e;
            this.f6332y = true;
        }
        if (eVar.f6920f) {
            this.f6333z = eVar.f6921g;
        }
        if (i10 == 0) {
            go goVar = eVar.f6916b.f9219a;
            if (!this.G.f9219a.c() && goVar.c()) {
                this.H = -1;
                this.J = 0;
                this.I = 0;
            }
            if (!goVar.c()) {
                List d10 = ((ph) goVar).d();
                a1.b(d10.size() == this.f6319l.size());
                for (int i11 = 0; i11 < d10.size(); i11++) {
                    go unused = ((a) this.f6319l.get(i11)).f6335b = (go) d10.get(i11);
                }
            }
            if (this.f6332y) {
                if (eVar.f6916b.f9220b.equals(this.G.f9220b) && eVar.f6916b.f9222d == this.G.f9237s) {
                    z11 = false;
                }
                if (z11) {
                    if (goVar.c() || eVar.f6916b.f9220b.a()) {
                        j11 = eVar.f6916b.f9222d;
                    } else {
                        lh lhVar = eVar.f6916b;
                        j11 = a(goVar, lhVar.f9220b, lhVar.f9222d);
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
            this.f6332y = false;
            a(eVar.f6916b, 1, this.f6333z, false, z10, this.f6331x, j10, -1);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(int i10, nh.f fVar, nh.f fVar2, nh.c cVar) {
        cVar.e(i10);
        cVar.a(fVar, fVar2, i10);
    }

    private lh a(lh lhVar, go goVar, Pair pair) {
        xo xoVar;
        wd.a aVar;
        int i10;
        lh lhVar2;
        long j10;
        go goVar2 = goVar;
        Pair pair2 = pair;
        a1.a(goVar.c() || pair2 != null);
        go goVar3 = lhVar.f9219a;
        lh a10 = lhVar.a(goVar);
        if (goVar.c()) {
            wd.a a11 = lh.a();
            long a12 = r2.a(this.J);
            lh a13 = a10.a(a11, a12, a12, a12, 0, qo.f11064d, this.f6309b, ab.h()).a(a11);
            a13.f9235q = a13.f9237s;
            return a13;
        }
        Object obj = a10.f9220b.f12394a;
        boolean z10 = !obj.equals(((Pair) yp.a((Object) pair)).first);
        wd.a aVar2 = z10 ? new wd.a(pair2.first) : a10.f9220b;
        long longValue = ((Long) pair2.second).longValue();
        long a14 = r2.a(g());
        if (!goVar3.c()) {
            a14 -= goVar3.a(obj, this.f6318k).e();
        }
        if (z10 || longValue < a14) {
            wd.a aVar3 = aVar2;
            a1.b(!aVar3.a());
            qo qoVar = z10 ? qo.f11064d : a10.f9226h;
            if (z10) {
                aVar = aVar3;
                xoVar = this.f6309b;
            } else {
                aVar = aVar3;
                xoVar = a10.f9227i;
            }
            lh a15 = a10.a(aVar, longValue, longValue, longValue, 0, qoVar, xoVar, z10 ? ab.h() : a10.f9228j).a(aVar);
            a15.f9235q = longValue;
            return a15;
        }
        if (i10 == 0) {
            int a16 = goVar2.a(a10.f9229k.f12394a);
            if (a16 != -1 && goVar2.a(a16, this.f6318k).f8054c == goVar2.a(aVar2.f12394a, this.f6318k).f8054c) {
                return a10;
            }
            goVar2.a(aVar2.f12394a, this.f6318k);
            if (aVar2.a()) {
                j10 = this.f6318k.a(aVar2.f12395b, aVar2.f12396c);
            } else {
                j10 = this.f6318k.f8055d;
            }
            lhVar2 = a10.a(aVar2, a10.f9237s, a10.f9237s, a10.f9222d, j10 - a10.f9237s, a10.f9226h, a10.f9227i, a10.f9228j).a(aVar2);
            lhVar2.f9235q = j10;
        } else {
            wd.a aVar4 = aVar2;
            a1.b(!aVar4.a());
            long max = Math.max(0, a10.f9236r - (longValue - a14));
            long j11 = a10.f9235q;
            if (a10.f9229k.equals(a10.f9220b)) {
                j11 = longValue + max;
            }
            lhVar2 = a10.a(aVar4, longValue, longValue, longValue, max, a10.f9226h, a10.f9227i, a10.f9228j);
            lhVar2.f9235q = j11;
        }
        return lhVar2;
    }

    public void a(we weVar) {
        qd a10 = this.E.a().a(weVar).a();
        if (!a10.equals(this.E)) {
            this.E = a10;
            this.f6316i.b(14, new at(this));
        }
    }

    private long a(go goVar, wd.a aVar, long j10) {
        goVar.a(aVar.f12394a, this.f6318k);
        return j10 + this.f6318k.e();
    }

    public void a(nh.e eVar) {
        e(eVar);
    }

    private lh a(int i10, int i11) {
        a1.a(i10 >= 0 && i11 >= i10 && i11 <= this.f6319l.size());
        int t10 = t();
        go n10 = n();
        int size = this.f6319l.size();
        this.f6330w++;
        b(i10, i11);
        go R = R();
        lh a10 = a(this.G, R, a(n10, R));
        int i12 = a10.f9223e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && t10 >= a10.f9219a.b()) {
            a10 = a10.a(4);
        }
        this.f6315h.b(i10, i11, this.B);
        return a10;
    }

    public void a(int i10, long j10) {
        go goVar = this.G.f9219a;
        if (i10 < 0 || (!goVar.c() && i10 >= goVar.b())) {
            throw new xa(goVar, i10, j10);
        }
        int i11 = 1;
        this.f6330w++;
        if (d()) {
            kc.d("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            c8.e eVar = new c8.e(this.G);
            eVar.a(1);
            this.f6314g.a(eVar);
            return;
        }
        if (o() != 1) {
            i11 = 2;
        }
        int t10 = t();
        lh a10 = a(this.G.a(i11), goVar, a(goVar, i10, j10));
        this.f6315h.a(goVar, i10, r2.a(j10));
        a(a10, 0, 1, true, true, 1, a(a10), t10);
    }

    public void a(wd wdVar) {
        a(Collections.singletonList(wdVar));
    }

    public void a(List list) {
        a(list, true);
    }

    public void a(List list, boolean z10) {
        a(list, -1, -9223372036854775807L, z10);
    }

    private void a(List list, int i10, long j10, boolean z10) {
        int i11;
        long j11;
        int i12 = i10;
        int U = U();
        long currentPosition = getCurrentPosition();
        boolean z11 = true;
        this.f6330w++;
        if (!this.f6319l.isEmpty()) {
            b(0, this.f6319l.size());
        }
        List a10 = a(0, list);
        go R = R();
        if (R.c() || i12 < R.b()) {
            long j12 = j10;
            if (z10) {
                j11 = -9223372036854775807L;
                i11 = R.a(this.f6329v);
            } else if (i12 == -1) {
                i11 = U;
                j11 = currentPosition;
            } else {
                i11 = i12;
                j11 = j12;
            }
            lh a11 = a(this.G, R, a(R, i11, j11));
            int i13 = a11.f9223e;
            if (!(i11 == -1 || i13 == 1)) {
                i13 = (R.c() || i11 >= R.b()) ? 4 : 2;
            }
            lh a12 = a11.a(i13);
            this.f6315h.a(a10, i11, r2.a(j11), this.B);
            if (this.G.f9220b.f12394a.equals(a12.f9220b.f12394a) || this.G.f9219a.c()) {
                z11 = false;
            }
            a(a12, 0, 1, false, z11, 4, a(a12), -1);
            return;
        }
        throw new xa(R, i12, j10);
    }

    public void a(boolean z10) {
        a(z10, 0, 1);
    }

    public void a(boolean z10, int i10, int i11) {
        lh lhVar = this.G;
        if (lhVar.f9230l != z10 || lhVar.f9231m != i10) {
            this.f6330w++;
            lh a10 = lhVar.a(z10, i10);
            this.f6315h.a(z10, i10);
            a(a10, 0, i11, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public void a(int i10) {
        if (this.f6328u != i10) {
            this.f6328u = i10;
            this.f6315h.a(i10);
            this.f6316i.a(8, (cc.a) new us(i10));
            X();
            this.f6316i.a();
        }
    }

    public void a(boolean z10, y7 y7Var) {
        lh lhVar;
        if (z10) {
            lhVar = a(0, this.f6319l.size()).a((y7) null);
        } else {
            lh lhVar2 = this.G;
            lhVar = lhVar2.a(lhVar2.f9220b);
            lhVar.f9235q = lhVar.f9237s;
            lhVar.f9236r = 0;
        }
        lh a10 = lhVar.a(1);
        if (y7Var != null) {
            a10 = a10.a(y7Var);
        }
        lh lhVar3 = a10;
        this.f6330w++;
        this.f6315h.G();
        a(lhVar3, 0, 1, false, lhVar3.f9219a.c() && !this.G.f9219a.c(), 4, a(lhVar3), -1);
    }

    private void a(lh lhVar, int i10, int i11, boolean z10, boolean z11, int i12, long j10, int i13) {
        lh lhVar2 = lhVar;
        int i14 = i12;
        lh lhVar3 = this.G;
        this.G = lhVar2;
        Pair a10 = a(lhVar, lhVar3, z11, i12, !lhVar3.f9219a.equals(lhVar2.f9219a));
        boolean booleanValue = ((Boolean) a10.first).booleanValue();
        int intValue = ((Integer) a10.second).intValue();
        qd qdVar = this.E;
        od odVar = null;
        if (booleanValue) {
            if (!lhVar2.f9219a.c()) {
                odVar = lhVar2.f9219a.a(lhVar2.f9219a.a(lhVar2.f9220b.f12394a, this.f6318k).f8054c, this.f6820a).f8069c;
            }
            qdVar = odVar != null ? odVar.f10107d : qd.H;
        }
        if (!lhVar3.f9228j.equals(lhVar2.f9228j)) {
            qdVar = qdVar.a().a(lhVar2.f9228j).a();
        }
        boolean z12 = !qdVar.equals(this.E);
        this.E = qdVar;
        if (!lhVar3.f9219a.equals(lhVar2.f9219a)) {
            int i15 = i10;
            this.f6316i.a(0, (cc.a) new os(lhVar, i10));
        }
        if (z11) {
            this.f6316i.a(11, (cc.a) new ys(i14, a(i14, lhVar3, i13), d(j10)));
        }
        if (booleanValue) {
            this.f6316i.a(1, (cc.a) new qs(odVar, intValue));
        }
        if (lhVar3.f9224f != lhVar2.f9224f) {
            this.f6316i.a(10, (cc.a) new ls(lhVar));
            if (lhVar2.f9224f != null) {
                this.f6316i.a(10, (cc.a) new ct(lhVar));
            }
        }
        xo xoVar = lhVar3.f9227i;
        xo xoVar2 = lhVar2.f9227i;
        if (xoVar != xoVar2) {
            this.f6312e.a(xoVar2.f13435d);
            this.f6316i.a(2, (cc.a) new ps(lhVar, new uo(lhVar2.f9227i.f13434c)));
        }
        if (z12) {
            this.f6316i.a(14, (cc.a) new rs(this.E));
        }
        if (lhVar3.f9225g != lhVar2.f9225g) {
            this.f6316i.a(3, (cc.a) new bt(lhVar));
        }
        if (!(lhVar3.f9223e == lhVar2.f9223e && lhVar3.f9230l == lhVar2.f9230l)) {
            this.f6316i.a(-1, (cc.a) new dt(lhVar));
        }
        if (lhVar3.f9223e != lhVar2.f9223e) {
            this.f6316i.a(4, (cc.a) new et(lhVar));
        }
        if (lhVar3.f9230l != lhVar2.f9230l) {
            this.f6316i.a(5, (cc.a) new ns(lhVar, i11));
        }
        if (lhVar3.f9231m != lhVar2.f9231m) {
            this.f6316i.a(6, (cc.a) new ks(lhVar));
        }
        if (c(lhVar3) != c(lhVar)) {
            this.f6316i.a(7, (cc.a) new ms(lhVar));
        }
        if (!lhVar3.f9232n.equals(lhVar2.f9232n)) {
            this.f6316i.a(12, (cc.a) new ft(lhVar));
        }
        if (z10) {
            this.f6316i.a(-1, (cc.a) vs.f12877a);
        }
        X();
        this.f6316i.a();
        if (lhVar3.f9233o != lhVar2.f9233o) {
            Iterator it = this.f6317j.iterator();
            while (it.hasNext()) {
                ((z7) it.next()).f(lhVar2.f9233o);
            }
        }
        if (lhVar3.f9234p != lhVar2.f9234p) {
            Iterator it2 = this.f6317j.iterator();
            while (it2.hasNext()) {
                ((z7) it2.next()).g(lhVar2.f9234p);
            }
        }
    }

    public oh a(oh.b bVar) {
        return new oh(this.f6315h, bVar, this.G.f9219a, t(), this.f6327t, this.f6315h.g());
    }

    private List a(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ae.c cVar = new ae.c((wd) list.get(i11), this.f6320m);
            arrayList.add(cVar);
            this.f6319l.add(i11 + i10, new a(cVar.f6523b, cVar.f6522a.i()));
        }
        this.B = this.B.b(i10, arrayList.size());
        return arrayList;
    }
}
