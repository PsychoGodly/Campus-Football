package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.applovin.impl.ab;
import com.applovin.impl.m2;
import com.applovin.impl.od;
import com.applovin.impl.u;

public abstract class go implements m2 {

    /* renamed from: a  reason: collision with root package name */
    public static final go f8049a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final m2.a f8050b = nx.f10033a;

    class a extends go {
        a() {
        }

        public int a() {
            return 0;
        }

        public int a(Object obj) {
            return -1;
        }

        public d a(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        public int b() {
            return 0;
        }

        public Object b(int i10) {
            throw new IndexOutOfBoundsException();
        }

        public b a(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static final class b implements m2 {

        /* renamed from: i  reason: collision with root package name */
        public static final m2.a f8051i = ox.f10548a;

        /* renamed from: a  reason: collision with root package name */
        public Object f8052a;

        /* renamed from: b  reason: collision with root package name */
        public Object f8053b;

        /* renamed from: c  reason: collision with root package name */
        public int f8054c;

        /* renamed from: d  reason: collision with root package name */
        public long f8055d;

        /* renamed from: f  reason: collision with root package name */
        public long f8056f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f8057g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public u f8058h = u.f12457h;

        private static String g(int i10) {
            return Integer.toString(i10, 36);
        }

        public int b(long j10) {
            return this.f8058h.b(j10, this.f8055d);
        }

        public long c(int i10) {
            return this.f8058h.a(i10).f12472g;
        }

        public int d(int i10) {
            return this.f8058h.a(i10).a();
        }

        public long e() {
            return this.f8056f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (b.class.equals(obj.getClass())) {
                    b bVar = (b) obj;
                    if (yp.a(this.f8052a, bVar.f8052a) && yp.a(this.f8053b, bVar.f8053b) && this.f8054c == bVar.f8054c && this.f8055d == bVar.f8055d && this.f8056f == bVar.f8056f && this.f8057g == bVar.f8057g && yp.a((Object) this.f8058h, (Object) bVar.f8058h)) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }

        public int f() {
            return this.f8058h.f12464f;
        }

        public int hashCode() {
            Object obj = this.f8052a;
            int i10 = 0;
            int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
            Object obj2 = this.f8053b;
            if (obj2 != null) {
                i10 = obj2.hashCode();
            }
            long j10 = this.f8055d;
            long j11 = this.f8056f;
            return ((((((((((hashCode + i10) * 31) + this.f8054c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f8057g ? 1 : 0)) * 31) + this.f8058h.hashCode();
        }

        /* access modifiers changed from: private */
        public static b a(Bundle bundle) {
            u uVar;
            int i10 = bundle.getInt(g(0), 0);
            long j10 = bundle.getLong(g(1), -9223372036854775807L);
            long j11 = bundle.getLong(g(2), 0);
            boolean z10 = bundle.getBoolean(g(3));
            Bundle bundle2 = bundle.getBundle(g(4));
            if (bundle2 != null) {
                uVar = (u) u.f12459j.a(bundle2);
            } else {
                uVar = u.f12457h;
            }
            u uVar2 = uVar;
            b bVar = new b();
            bVar.a((Object) null, (Object) null, i10, j10, j11, uVar2, z10);
            return bVar;
        }

        public long b(int i10) {
            return this.f8058h.a(i10).f12467a;
        }

        public long c() {
            return this.f8055d;
        }

        public long d() {
            return r2.b(this.f8056f);
        }

        public boolean e(int i10) {
            return !this.f8058h.a(i10).b();
        }

        public boolean f(int i10) {
            return this.f8058h.a(i10).f12473h;
        }

        public long b() {
            return this.f8058h.f12462c;
        }

        public int b(int i10, int i11) {
            return this.f8058h.a(i10).a(i11);
        }

        public int a(int i10) {
            return this.f8058h.a(i10).f12468b;
        }

        public long a(int i10, int i11) {
            u.a a10 = this.f8058h.a(i10);
            if (a10.f12468b != -1) {
                return a10.f12471f[i11];
            }
            return -9223372036854775807L;
        }

        public int a() {
            return this.f8058h.f12461b;
        }

        public int a(long j10) {
            return this.f8058h.a(j10, this.f8055d);
        }

        public b a(Object obj, Object obj2, int i10, long j10, long j11) {
            return a(obj, obj2, i10, j10, j11, u.f12457h, false);
        }

        public b a(Object obj, Object obj2, int i10, long j10, long j11, u uVar, boolean z10) {
            this.f8052a = obj;
            this.f8053b = obj2;
            this.f8054c = i10;
            this.f8055d = j10;
            this.f8056f = j11;
            this.f8058h = uVar;
            this.f8057g = z10;
            return this;
        }
    }

    protected go() {
    }

    /* access modifiers changed from: private */
    public static go a(Bundle bundle) {
        ab a10 = a(d.f8066v, l2.a(bundle, c(0)));
        ab a11 = a(b.f8051i, l2.a(bundle, c(1)));
        int[] intArray = bundle.getIntArray(c(2));
        if (intArray == null) {
            intArray = a(a10.size());
        }
        return new c(a10, a11, intArray);
    }

    public abstract int a();

    public abstract int a(Object obj);

    public abstract b a(int i10, b bVar, boolean z10);

    public abstract d a(int i10, d dVar, long j10);

    public abstract int b();

    public int b(boolean z10) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public abstract Object b(int i10);

    public final boolean c() {
        return b() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go)) {
            return false;
        }
        go goVar = (go) obj;
        if (goVar.b() != b() || goVar.a() != a()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i10 = 0; i10 < b(); i10++) {
            if (!a(i10, dVar).equals(goVar.a(i10, dVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < a(); i11++) {
            if (!a(i11, bVar, true).equals(goVar.a(i11, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int b10 = b() + 217;
        for (int i10 = 0; i10 < b(); i10++) {
            b10 = (b10 * 31) + a(i10, dVar).hashCode();
        }
        int a10 = (b10 * 31) + a();
        for (int i11 = 0; i11 < a(); i11++) {
            a10 = (a10 * 31) + a(i11, bVar, true).hashCode();
        }
        return a10;
    }

    public static final class c extends go {

        /* renamed from: c  reason: collision with root package name */
        private final ab f8059c;

        /* renamed from: d  reason: collision with root package name */
        private final ab f8060d;

        /* renamed from: f  reason: collision with root package name */
        private final int[] f8061f;

        /* renamed from: g  reason: collision with root package name */
        private final int[] f8062g;

        public c(ab abVar, ab abVar2, int[] iArr) {
            a1.a(abVar.size() == iArr.length);
            this.f8059c = abVar;
            this.f8060d = abVar2;
            this.f8061f = iArr;
            this.f8062g = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f8062g[iArr[i10]] = i10;
            }
        }

        public int a(boolean z10) {
            if (c()) {
                return -1;
            }
            if (z10) {
                return this.f8061f[0];
            }
            return 0;
        }

        public int b(boolean z10) {
            if (c()) {
                return -1;
            }
            if (z10) {
                return this.f8061f[b() - 1];
            }
            return b() - 1;
        }

        public int a(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != b(z10)) {
                return z10 ? this.f8061f[this.f8062g[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return a(z10);
            }
            return -1;
        }

        public int b(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != a(z10)) {
                return z10 ? this.f8061f[this.f8062g[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return b(z10);
            }
            return -1;
        }

        public b a(int i10, b bVar, boolean z10) {
            b bVar2 = (b) this.f8060d.get(i10);
            bVar.a(bVar2.f8052a, bVar2.f8053b, bVar2.f8054c, bVar2.f8055d, bVar2.f8056f, bVar2.f8058h, bVar2.f8057g);
            return bVar;
        }

        public int b() {
            return this.f8059c.size();
        }

        public Object b(int i10) {
            throw new UnsupportedOperationException();
        }

        public int a() {
            return this.f8060d.size();
        }

        public d a(int i10, d dVar, long j10) {
            d dVar2 = dVar;
            d dVar3 = (d) this.f8059c.get(i10);
            Object obj = dVar3.f8067a;
            od odVar = dVar3.f8069c;
            od odVar2 = odVar;
            d dVar4 = dVar3;
            d dVar5 = dVar;
            dVar5.a(obj, odVar2, dVar3.f8070d, dVar3.f8071f, dVar3.f8072g, dVar3.f8073h, dVar3.f8074i, dVar3.f8075j, dVar3.f8077l, dVar3.f8079n, dVar4.f8080o, dVar4.f8081p, dVar4.f8082q, dVar4.f8083r);
            d dVar6 = dVar;
            dVar6.f8078m = dVar4.f8078m;
            return dVar6;
        }

        public int a(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public int b(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 == 2) {
                return i10 == a(z10) ? b(z10) : i10 - 1;
            }
            throw new IllegalStateException();
        } else if (i10 == a(z10)) {
            return -1;
        } else {
            return i10 - 1;
        }
    }

    public final boolean b(int i10, b bVar, d dVar, int i11, boolean z10) {
        return a(i10, bVar, dVar, i11, z10) == -1;
    }

    private static ab a(m2.a aVar, IBinder iBinder) {
        if (iBinder == null) {
            return ab.h();
        }
        ab.a aVar2 = new ab.a();
        ab a10 = k2.a(iBinder);
        for (int i10 = 0; i10 < a10.size(); i10++) {
            aVar2.b(aVar.a((Bundle) a10.get(i10)));
        }
        return aVar2.a();
    }

    private static int[] a(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    public int a(boolean z10) {
        return c() ? -1 : 0;
    }

    public static final class d implements m2 {

        /* renamed from: s  reason: collision with root package name */
        public static final Object f8063s = new Object();

        /* renamed from: t  reason: collision with root package name */
        private static final Object f8064t = new Object();

        /* renamed from: u  reason: collision with root package name */
        private static final od f8065u = new od.c().b("com.applovin.exoplayer2.Timeline").a(Uri.EMPTY).a();

        /* renamed from: v  reason: collision with root package name */
        public static final m2.a f8066v = px.f10762a;

        /* renamed from: a  reason: collision with root package name */
        public Object f8067a = f8063s;

        /* renamed from: b  reason: collision with root package name */
        public Object f8068b;

        /* renamed from: c  reason: collision with root package name */
        public od f8069c = f8065u;

        /* renamed from: d  reason: collision with root package name */
        public Object f8070d;

        /* renamed from: f  reason: collision with root package name */
        public long f8071f;

        /* renamed from: g  reason: collision with root package name */
        public long f8072g;

        /* renamed from: h  reason: collision with root package name */
        public long f8073h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f8074i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f8075j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f8076k;

        /* renamed from: l  reason: collision with root package name */
        public od.f f8077l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f8078m;

        /* renamed from: n  reason: collision with root package name */
        public long f8079n;

        /* renamed from: o  reason: collision with root package name */
        public long f8080o;

        /* renamed from: p  reason: collision with root package name */
        public int f8081p;

        /* renamed from: q  reason: collision with root package name */
        public int f8082q;

        /* renamed from: r  reason: collision with root package name */
        public long f8083r;

        /* JADX WARNING: type inference failed for: r1v19, types: [com.applovin.impl.m2] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.applovin.impl.go.d a(android.os.Bundle r26) {
            /*
                r0 = r26
                r1 = 1
                java.lang.String r1 = a((int) r1)
                android.os.Bundle r1 = r0.getBundle(r1)
                r2 = 0
                if (r1 == 0) goto L_0x0018
                com.applovin.impl.m2$a r3 = com.applovin.impl.od.f10103h
                com.applovin.impl.m2 r1 = r3.a(r1)
                com.applovin.impl.od r1 = (com.applovin.impl.od) r1
                r5 = r1
                goto L_0x0019
            L_0x0018:
                r5 = r2
            L_0x0019:
                r1 = 2
                java.lang.String r1 = a((int) r1)
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                long r7 = r0.getLong(r1, r3)
                r1 = 3
                java.lang.String r1 = a((int) r1)
                long r9 = r0.getLong(r1, r3)
                r1 = 4
                java.lang.String r1 = a((int) r1)
                long r11 = r0.getLong(r1, r3)
                r1 = 5
                java.lang.String r1 = a((int) r1)
                r6 = 0
                boolean r13 = r0.getBoolean(r1, r6)
                r1 = 6
                java.lang.String r1 = a((int) r1)
                boolean r14 = r0.getBoolean(r1, r6)
                r1 = 7
                java.lang.String r1 = a((int) r1)
                android.os.Bundle r1 = r0.getBundle(r1)
                if (r1 == 0) goto L_0x0060
                com.applovin.impl.m2$a r2 = com.applovin.impl.od.f.f10147h
                com.applovin.impl.m2 r1 = r2.a(r1)
                r2 = r1
                com.applovin.impl.od$f r2 = (com.applovin.impl.od.f) r2
            L_0x0060:
                r15 = r2
                r1 = 8
                java.lang.String r1 = a((int) r1)
                boolean r1 = r0.getBoolean(r1, r6)
                r2 = 9
                java.lang.String r2 = a((int) r2)
                r24 = r7
                r6 = 0
                long r16 = r0.getLong(r2, r6)
                r2 = 10
                java.lang.String r2 = a((int) r2)
                long r18 = r0.getLong(r2, r3)
                r2 = 11
                java.lang.String r2 = a((int) r2)
                r3 = 0
                int r20 = r0.getInt(r2, r3)
                r2 = 12
                java.lang.String r2 = a((int) r2)
                int r21 = r0.getInt(r2, r3)
                r2 = 13
                java.lang.String r2 = a((int) r2)
                long r22 = r0.getLong(r2, r6)
                com.applovin.impl.go$d r0 = new com.applovin.impl.go$d
                r3 = r0
                r0.<init>()
                java.lang.Object r4 = f8064t
                r6 = 0
                r7 = r24
                r3.a(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
                r0.f8078m = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.go.d.a(android.os.Bundle):com.applovin.impl.go$d");
        }

        public long b() {
            return r2.b(this.f8079n);
        }

        public long c() {
            return this.f8079n;
        }

        public long d() {
            return r2.b(this.f8080o);
        }

        public boolean e() {
            a1.b(this.f8076k == (this.f8077l != null));
            if (this.f8077l != null) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (d.class.equals(obj.getClass())) {
                    d dVar = (d) obj;
                    if (yp.a(this.f8067a, dVar.f8067a) && yp.a((Object) this.f8069c, (Object) dVar.f8069c) && yp.a(this.f8070d, dVar.f8070d) && yp.a((Object) this.f8077l, (Object) dVar.f8077l) && this.f8071f == dVar.f8071f && this.f8072g == dVar.f8072g && this.f8073h == dVar.f8073h && this.f8074i == dVar.f8074i && this.f8075j == dVar.f8075j && this.f8078m == dVar.f8078m && this.f8079n == dVar.f8079n && this.f8080o == dVar.f8080o && this.f8081p == dVar.f8081p && this.f8082q == dVar.f8082q && this.f8083r == dVar.f8083r) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }

        public int hashCode() {
            int hashCode = (((this.f8067a.hashCode() + 217) * 31) + this.f8069c.hashCode()) * 31;
            Object obj = this.f8070d;
            int i10 = 0;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            od.f fVar = this.f8077l;
            if (fVar != null) {
                i10 = fVar.hashCode();
            }
            long j10 = this.f8071f;
            long j11 = this.f8072g;
            long j12 = this.f8073h;
            long j13 = this.f8079n;
            long j14 = this.f8080o;
            long j15 = this.f8083r;
            return ((((((((((((((((((((((hashCode2 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f8074i ? 1 : 0)) * 31) + (this.f8075j ? 1 : 0)) * 31) + (this.f8078m ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f8081p) * 31) + this.f8082q) * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }

        public long a() {
            return yp.a(this.f8073h);
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
            r1 = r1.f10105b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.applovin.impl.go.d a(java.lang.Object r6, com.applovin.impl.od r7, java.lang.Object r8, long r9, long r11, long r13, boolean r15, boolean r16, com.applovin.impl.od.f r17, long r18, long r20, int r22, int r23, long r24) {
            /*
                r5 = this;
                r0 = r5
                r1 = r7
                r2 = r17
                r3 = r6
                r0.f8067a = r3
                if (r1 == 0) goto L_0x000b
                r3 = r1
                goto L_0x000d
            L_0x000b:
                com.applovin.impl.od r3 = f8065u
            L_0x000d:
                r0.f8069c = r3
                if (r1 == 0) goto L_0x0018
                com.applovin.impl.od$g r1 = r1.f10105b
                if (r1 == 0) goto L_0x0018
                java.lang.Object r1 = r1.f10164g
                goto L_0x0019
            L_0x0018:
                r1 = 0
            L_0x0019:
                r0.f8068b = r1
                r1 = r8
                r0.f8070d = r1
                r3 = r9
                r0.f8071f = r3
                r3 = r11
                r0.f8072g = r3
                r3 = r13
                r0.f8073h = r3
                r1 = r15
                r0.f8074i = r1
                r1 = r16
                r0.f8075j = r1
                r1 = 0
                if (r2 == 0) goto L_0x0033
                r3 = 1
                goto L_0x0034
            L_0x0033:
                r3 = 0
            L_0x0034:
                r0.f8076k = r3
                r0.f8077l = r2
                r2 = r18
                r0.f8079n = r2
                r2 = r20
                r0.f8080o = r2
                r2 = r22
                r0.f8081p = r2
                r2 = r23
                r0.f8082q = r2
                r2 = r24
                r0.f8083r = r2
                r0.f8078m = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.go.d.a(java.lang.Object, com.applovin.impl.od, java.lang.Object, long, long, long, boolean, boolean, com.applovin.impl.od$f, long, long, int, int, long):com.applovin.impl.go$d");
        }
    }

    public final int a(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = a(i10, bVar).f8054c;
        if (a(i12, dVar).f8082q != i10) {
            return i10 + 1;
        }
        int a10 = a(i12, i11, z10);
        if (a10 == -1) {
            return -1;
        }
        return a(a10, dVar).f8081p;
    }

    public int a(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 == 2) {
                return i10 == b(z10) ? a(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else if (i10 == b(z10)) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public final b a(int i10, b bVar) {
        return a(i10, bVar, false);
    }

    public b a(Object obj, b bVar) {
        return a(a(obj), bVar, true);
    }

    public final Pair a(d dVar, b bVar, int i10, long j10) {
        return (Pair) a1.a((Object) a(dVar, bVar, i10, j10, 0));
    }

    public final Pair a(d dVar, b bVar, int i10, long j10, long j11) {
        a1.a(i10, 0, b());
        a(i10, dVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.c();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.f8081p;
        a(i11, bVar);
        while (i11 < dVar.f8082q && bVar.f8056f != j10) {
            int i12 = i11 + 1;
            if (a(i12, bVar).f8056f > j10) {
                break;
            }
            i11 = i12;
        }
        a(i11, bVar, true);
        long j12 = j10 - bVar.f8056f;
        long j13 = bVar.f8055d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        return Pair.create(a1.a(bVar.f8053b), Long.valueOf(Math.max(0, j12)));
    }

    public final d a(int i10, d dVar) {
        return a(i10, dVar, 0);
    }
}
