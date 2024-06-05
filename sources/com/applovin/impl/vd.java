package com.applovin.impl;

import android.os.Handler;
import android.util.Pair;
import com.applovin.impl.ab;
import com.applovin.impl.go;
import com.applovin.impl.wd;
import java.util.List;

final class vd {

    /* renamed from: a  reason: collision with root package name */
    private final go.b f12722a = new go.b();

    /* renamed from: b  reason: collision with root package name */
    private final go.d f12723b = new go.d();

    /* renamed from: c  reason: collision with root package name */
    private final r0 f12724c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f12725d;

    /* renamed from: e  reason: collision with root package name */
    private long f12726e;

    /* renamed from: f  reason: collision with root package name */
    private int f12727f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12728g;

    /* renamed from: h  reason: collision with root package name */
    private sd f12729h;

    /* renamed from: i  reason: collision with root package name */
    private sd f12730i;

    /* renamed from: j  reason: collision with root package name */
    private sd f12731j;

    /* renamed from: k  reason: collision with root package name */
    private int f12732k;

    /* renamed from: l  reason: collision with root package name */
    private Object f12733l;

    /* renamed from: m  reason: collision with root package name */
    private long f12734m;

    public vd(r0 r0Var, Handler handler) {
        this.f12724c = r0Var;
        this.f12725d = handler;
    }

    private boolean a(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private void g() {
        if (this.f12724c != null) {
            ab.a f10 = ab.f();
            for (sd sdVar = this.f12729h; sdVar != null; sdVar = sdVar.d()) {
                f10.b(sdVar.f11365f.f12551a);
            }
            sd sdVar2 = this.f12730i;
            this.f12725d.post(new m60(this, f10, sdVar2 == null ? null : sdVar2.f11365f.f12551a));
        }
    }

    public sd a() {
        sd sdVar = this.f12729h;
        if (sdVar == null) {
            return null;
        }
        if (sdVar == this.f12730i) {
            this.f12730i = sdVar.d();
        }
        this.f12729h.l();
        int i10 = this.f12732k - 1;
        this.f12732k = i10;
        if (i10 == 0) {
            this.f12731j = null;
            sd sdVar2 = this.f12729h;
            this.f12733l = sdVar2.f11361b;
            this.f12734m = sdVar2.f11365f.f12551a.f12397d;
        }
        this.f12729h = this.f12729h.d();
        g();
        return this.f12729h;
    }

    public sd b() {
        sd sdVar = this.f12730i;
        a1.b((sdVar == null || sdVar.d() == null) ? false : true);
        this.f12730i = this.f12730i.d();
        g();
        return this.f12730i;
    }

    public void c() {
        if (this.f12732k != 0) {
            sd sdVar = (sd) a1.b((Object) this.f12729h);
            this.f12733l = sdVar.f11361b;
            this.f12734m = sdVar.f11365f.f12551a.f12397d;
            while (sdVar != null) {
                sdVar.l();
                sdVar = sdVar.d();
            }
            this.f12729h = null;
            this.f12731j = null;
            this.f12730i = null;
            this.f12732k = 0;
            g();
        }
    }

    public sd d() {
        return this.f12731j;
    }

    public sd e() {
        return this.f12729h;
    }

    public sd f() {
        return this.f12730i;
    }

    public boolean h() {
        sd sdVar = this.f12731j;
        return sdVar == null || (!sdVar.f11365f.f12559i && sdVar.j() && this.f12731j.f11365f.f12555e != -9223372036854775807L && this.f12732k < 100);
    }

    private boolean a(ud udVar, ud udVar2) {
        return udVar.f12552b == udVar2.f12552b && udVar.f12551a.equals(udVar2.f12551a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 != -9223372036854775807L) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.impl.sd a(com.applovin.impl.mi[] r12, com.applovin.impl.wo r13, com.applovin.impl.n0 r14, com.applovin.impl.ae r15, com.applovin.impl.ud r16, com.applovin.impl.xo r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            com.applovin.impl.sd r1 = r0.f12731j
            if (r1 != 0) goto L_0x001e
            com.applovin.impl.wd$a r1 = r8.f12551a
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x001b
            long r1 = r8.f12553c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            r1 = 0
            goto L_0x002c
        L_0x001e:
            long r1 = r1.f()
            com.applovin.impl.sd r3 = r0.f12731j
            com.applovin.impl.ud r3 = r3.f11365f
            long r3 = r3.f12555e
            long r1 = r1 + r3
            long r3 = r8.f12552b
            long r1 = r1 - r3
        L_0x002c:
            r3 = r1
            com.applovin.impl.sd r10 = new com.applovin.impl.sd
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            com.applovin.impl.sd r1 = r0.f12731j
            if (r1 == 0) goto L_0x0043
            r1.a((com.applovin.impl.sd) r10)
            goto L_0x0047
        L_0x0043:
            r0.f12729h = r10
            r0.f12730i = r10
        L_0x0047:
            r1 = 0
            r0.f12733l = r1
            r0.f12731j = r10
            int r1 = r0.f12732k
            int r1 = r1 + 1
            r0.f12732k = r1
            r11.g()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.vd.a(com.applovin.impl.mi[], com.applovin.impl.wo, com.applovin.impl.n0, com.applovin.impl.ae, com.applovin.impl.ud, com.applovin.impl.xo):com.applovin.impl.sd");
    }

    private ud a(lh lhVar) {
        return a(lhVar.f9219a, lhVar.f9220b, lhVar.f9221c, lhVar.f9237s);
    }

    private ud a(go goVar, sd sdVar, long j10) {
        long j11;
        go goVar2 = goVar;
        ud udVar = sdVar.f11365f;
        long f10 = (sdVar.f() + udVar.f12555e) - j10;
        if (udVar.f12557g) {
            long j12 = 0;
            int a10 = goVar.a(goVar2.a(udVar.f12551a.f12394a), this.f12722a, this.f12723b, this.f12727f, this.f12728g);
            if (a10 == -1) {
                return null;
            }
            int i10 = goVar2.a(a10, this.f12722a, true).f8054c;
            Object obj = this.f12722a.f8053b;
            long j13 = udVar.f12551a.f12397d;
            if (goVar2.a(i10, this.f12723b).f8081p == a10) {
                Pair a11 = goVar.a(this.f12723b, this.f12722a, i10, -9223372036854775807L, Math.max(0, f10));
                if (a11 == null) {
                    return null;
                }
                obj = a11.first;
                long longValue = ((Long) a11.second).longValue();
                sd d10 = sdVar.d();
                if (d10 == null || !d10.f11361b.equals(obj)) {
                    j13 = this.f12726e;
                    this.f12726e = 1 + j13;
                } else {
                    j13 = d10.f11365f.f12551a.f12397d;
                }
                j11 = longValue;
                j12 = -9223372036854775807L;
            } else {
                j11 = 0;
            }
            return a(goVar, a(goVar, obj, j11, j13, this.f12722a), j12, j11);
        }
        wd.a aVar = udVar.f12551a;
        goVar2.a(aVar.f12394a, this.f12722a);
        if (aVar.a()) {
            int i11 = aVar.f12395b;
            int a12 = this.f12722a.a(i11);
            if (a12 == -1) {
                return null;
            }
            int b10 = this.f12722a.b(i11, aVar.f12396c);
            if (b10 < a12) {
                return a(goVar, aVar.f12394a, i11, b10, udVar.f12553c, aVar.f12397d);
            }
            long j14 = udVar.f12553c;
            if (j14 == -9223372036854775807L) {
                go.d dVar = this.f12723b;
                go.b bVar = this.f12722a;
                Pair a13 = goVar.a(dVar, bVar, bVar.f8054c, -9223372036854775807L, Math.max(0, f10));
                if (a13 == null) {
                    return null;
                }
                j14 = ((Long) a13.second).longValue();
            }
            return a(goVar, aVar.f12394a, Math.max(a(goVar2, aVar.f12394a, aVar.f12395b), j14), udVar.f12553c, aVar.f12397d);
        }
        int d11 = this.f12722a.d(aVar.f12398e);
        if (d11 == this.f12722a.a(aVar.f12398e)) {
            return a(goVar, aVar.f12394a, a(goVar2, aVar.f12394a, aVar.f12398e), udVar.f12555e, aVar.f12397d);
        }
        return a(goVar, aVar.f12394a, aVar.f12398e, d11, udVar.f12555e, aVar.f12397d);
    }

    private ud a(go goVar, wd.a aVar, long j10, long j11) {
        wd.a aVar2 = aVar;
        go goVar2 = goVar;
        goVar.a(aVar2.f12394a, this.f12722a);
        if (aVar.a()) {
            return a(goVar, aVar2.f12394a, aVar2.f12395b, aVar2.f12396c, j10, aVar2.f12397d);
        }
        return a(goVar, aVar2.f12394a, j11, j10, aVar2.f12397d);
    }

    private ud a(go goVar, Object obj, int i10, int i11, long j10, long j11) {
        int i12 = i11;
        wd.a aVar = new wd.a(obj, i10, i12, j11);
        long a10 = goVar.a(aVar.f12394a, this.f12722a).a(aVar.f12395b, aVar.f12396c);
        long b10 = i12 == this.f12722a.d(i10) ? this.f12722a.b() : 0;
        return new ud(aVar, (a10 == -9223372036854775807L || b10 < a10) ? b10 : Math.max(0, a10 - 1), j10, -9223372036854775807L, a10, this.f12722a.f(aVar.f12395b), false, false, false);
    }

    private ud a(go goVar, Object obj, long j10, long j11, long j12) {
        long j13;
        go goVar2 = goVar;
        Object obj2 = obj;
        long j14 = j10;
        goVar2.a(obj2, this.f12722a);
        int a10 = this.f12722a.a(j14);
        wd.a aVar = new wd.a(obj2, j12, a10);
        boolean a11 = a(aVar);
        boolean a12 = a(goVar2, aVar);
        boolean a13 = a(goVar2, aVar, a11);
        boolean z10 = a10 != -1 && this.f12722a.f(a10);
        long b10 = a10 != -1 ? this.f12722a.b(a10) : -9223372036854775807L;
        if (b10 == -9223372036854775807L || b10 == Long.MIN_VALUE) {
            j13 = this.f12722a.f8055d;
        } else {
            j13 = b10;
        }
        if (j13 != -9223372036854775807L && j14 >= j13) {
            j14 = Math.max(0, j13 - 1);
        }
        return new ud(aVar, j14, j11, b10, j13, z10, a11, a12, a13);
    }

    private long a(go goVar, Object obj, int i10) {
        goVar.a(obj, this.f12722a);
        long b10 = this.f12722a.b(i10);
        if (b10 == Long.MIN_VALUE) {
            return this.f12722a.f8055d;
        }
        return b10 + this.f12722a.c(i10);
    }

    public ud a(long j10, lh lhVar) {
        sd sdVar = this.f12731j;
        if (sdVar == null) {
            return a(lhVar);
        }
        return a(lhVar.f9219a, sdVar, j10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0029, code lost:
        r1 = r3.f12398e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.impl.ud a(com.applovin.impl.go r19, com.applovin.impl.ud r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.applovin.impl.wd$a r3 = r2.f12551a
            boolean r12 = r0.a((com.applovin.impl.wd.a) r3)
            boolean r13 = r0.a((com.applovin.impl.go) r1, (com.applovin.impl.wd.a) r3)
            boolean r14 = r0.a((com.applovin.impl.go) r1, (com.applovin.impl.wd.a) r3, (boolean) r12)
            com.applovin.impl.wd$a r4 = r2.f12551a
            java.lang.Object r4 = r4.f12394a
            com.applovin.impl.go$b r5 = r0.f12722a
            r1.a((java.lang.Object) r4, (com.applovin.impl.go.b) r5)
            boolean r1 = r3.a()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0035
            int r1 = r3.f12398e
            if (r1 != r4) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            com.applovin.impl.go$b r7 = r0.f12722a
            long r7 = r7.b((int) r1)
            goto L_0x0036
        L_0x0035:
            r7 = r5
        L_0x0036:
            boolean r1 = r3.a()
            if (r1 == 0) goto L_0x0048
            com.applovin.impl.go$b r1 = r0.f12722a
            int r5 = r3.f12395b
            int r6 = r3.f12396c
            long r5 = r1.a(r5, r6)
        L_0x0046:
            r9 = r5
            goto L_0x005c
        L_0x0048:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0055
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r9 = r7
            goto L_0x005c
        L_0x0055:
            com.applovin.impl.go$b r1 = r0.f12722a
            long r5 = r1.c()
            goto L_0x0046
        L_0x005c:
            boolean r1 = r3.a()
            if (r1 == 0) goto L_0x006c
            com.applovin.impl.go$b r1 = r0.f12722a
            int r4 = r3.f12395b
            boolean r1 = r1.f(r4)
            r11 = r1
            goto L_0x007d
        L_0x006c:
            int r1 = r3.f12398e
            if (r1 == r4) goto L_0x007b
            com.applovin.impl.go$b r4 = r0.f12722a
            boolean r1 = r4.f(r1)
            if (r1 == 0) goto L_0x007b
            r1 = 1
            r11 = 1
            goto L_0x007d
        L_0x007b:
            r1 = 0
            r11 = 0
        L_0x007d:
            com.applovin.impl.ud r15 = new com.applovin.impl.ud
            long r4 = r2.f12552b
            long r1 = r2.f12553c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.vd.a(com.applovin.impl.go, com.applovin.impl.ud):com.applovin.impl.ud");
    }

    private boolean a(wd.a aVar) {
        return !aVar.a() && aVar.f12398e == -1;
    }

    private boolean a(go goVar, wd.a aVar, boolean z10) {
        int a10 = goVar.a(aVar.f12394a);
        if (!goVar.a(goVar.a(a10, this.f12722a).f8054c, this.f12723b).f8075j) {
            return goVar.b(a10, this.f12722a, this.f12723b, this.f12727f, this.f12728g) && z10;
        }
    }

    private boolean a(go goVar, wd.a aVar) {
        if (!a(aVar)) {
            return false;
        }
        int i10 = goVar.a(aVar.f12394a, this.f12722a).f8054c;
        if (goVar.a(i10, this.f12723b).f8082q == goVar.a(aVar.f12394a)) {
            return true;
        }
        return false;
    }

    public boolean a(rd rdVar) {
        sd sdVar = this.f12731j;
        return sdVar != null && sdVar.f11360a == rdVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ab.a aVar, wd.a aVar2) {
        this.f12724c.a((List) aVar.a(), aVar2);
    }

    public void a(long j10) {
        sd sdVar = this.f12731j;
        if (sdVar != null) {
            sdVar.b(j10);
        }
    }

    public boolean a(sd sdVar) {
        boolean z10 = false;
        a1.b(sdVar != null);
        if (sdVar.equals(this.f12731j)) {
            return false;
        }
        this.f12731j = sdVar;
        while (sdVar.d() != null) {
            sdVar = sdVar.d();
            if (sdVar == this.f12730i) {
                this.f12730i = this.f12729h;
                z10 = true;
            }
            sdVar.l();
            this.f12732k--;
        }
        this.f12731j.a((sd) null);
        g();
        return z10;
    }

    public wd.a a(go goVar, Object obj, long j10) {
        return a(goVar, obj, j10, a(goVar, obj), this.f12722a);
    }

    private static wd.a a(go goVar, Object obj, long j10, long j11, go.b bVar) {
        goVar.a(obj, bVar);
        int b10 = bVar.b(j10);
        if (b10 == -1) {
            return new wd.a(obj, j11, bVar.a(j10));
        }
        return new wd.a(obj, b10, bVar.d(b10), j11);
    }

    private long a(go goVar, Object obj) {
        int a10;
        int i10 = goVar.a(obj, this.f12722a).f8054c;
        Object obj2 = this.f12733l;
        if (obj2 != null && (a10 = goVar.a(obj2)) != -1 && goVar.a(a10, this.f12722a).f8054c == i10) {
            return this.f12734m;
        }
        for (sd sdVar = this.f12729h; sdVar != null; sdVar = sdVar.d()) {
            if (sdVar.f11361b.equals(obj)) {
                return sdVar.f11365f.f12551a.f12397d;
            }
        }
        for (sd sdVar2 = this.f12729h; sdVar2 != null; sdVar2 = sdVar2.d()) {
            int a11 = goVar.a(sdVar2.f11361b);
            if (a11 != -1 && goVar.a(a11, this.f12722a).f8054c == i10) {
                return sdVar2.f11365f.f12551a.f12397d;
            }
        }
        long j10 = this.f12726e;
        this.f12726e = 1 + j10;
        if (this.f12729h == null) {
            this.f12733l = obj;
            this.f12734m = j10;
        }
        return j10;
    }

    private boolean a(go goVar) {
        sd sdVar = this.f12729h;
        if (sdVar == null) {
            return true;
        }
        int a10 = goVar.a(sdVar.f11361b);
        while (true) {
            a10 = goVar.a(a10, this.f12722a, this.f12723b, this.f12727f, this.f12728g);
            while (sdVar.d() != null && !sdVar.f11365f.f12557g) {
                sdVar = sdVar.d();
            }
            sd d10 = sdVar.d();
            if (a10 == -1 || d10 == null || goVar.a(d10.f11361b) != a10) {
                boolean a11 = a(sdVar);
                sdVar.f11365f = a(goVar, sdVar.f11365f);
            } else {
                sdVar = d10;
            }
        }
        boolean a112 = a(sdVar);
        sdVar.f11365f = a(goVar, sdVar.f11365f);
        return !a112;
    }

    public boolean a(go goVar, long j10, long j11) {
        ud udVar;
        long j12;
        boolean a10;
        sd sdVar = this.f12729h;
        sd sdVar2 = null;
        while (sdVar != null) {
            ud udVar2 = sdVar.f11365f;
            if (sdVar2 == null) {
                udVar = a(goVar, udVar2);
            } else {
                ud a11 = a(goVar, sdVar2, j10);
                if (a11 == null) {
                    a10 = a(sdVar2);
                } else if (!a(udVar2, a11)) {
                    a10 = a(sdVar2);
                } else {
                    udVar = a11;
                }
                return !a10;
            }
            sdVar.f11365f = udVar.a(udVar2.f12553c);
            if (!a(udVar2.f12555e, udVar.f12555e)) {
                sdVar.m();
                long j13 = udVar.f12555e;
                if (j13 == -9223372036854775807L) {
                    j12 = Long.MAX_VALUE;
                } else {
                    j12 = sdVar.e(j13);
                }
                boolean z10 = sdVar == this.f12730i && !sdVar.f11365f.f12556f && (j11 == Long.MIN_VALUE || j11 >= j12);
                if (a(sdVar) || z10) {
                    return false;
                }
                return true;
            }
            sdVar2 = sdVar;
            sdVar = sdVar.d();
        }
        return true;
    }

    public boolean a(go goVar, int i10) {
        this.f12727f = i10;
        return a(goVar);
    }

    public boolean a(go goVar, boolean z10) {
        this.f12728g = z10;
        return a(goVar);
    }
}
