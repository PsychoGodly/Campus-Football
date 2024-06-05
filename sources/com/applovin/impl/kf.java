package com.applovin.impl;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.applovin.impl.i1;
import com.applovin.impl.ro;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public final class kf implements i8, ej {

    /* renamed from: y  reason: collision with root package name */
    public static final m8 f8981y = vy.f12888b;

    /* renamed from: a  reason: collision with root package name */
    private final int f8982a;

    /* renamed from: b  reason: collision with root package name */
    private final yg f8983b;

    /* renamed from: c  reason: collision with root package name */
    private final yg f8984c;

    /* renamed from: d  reason: collision with root package name */
    private final yg f8985d;

    /* renamed from: e  reason: collision with root package name */
    private final yg f8986e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque f8987f;

    /* renamed from: g  reason: collision with root package name */
    private final ij f8988g;

    /* renamed from: h  reason: collision with root package name */
    private final List f8989h;

    /* renamed from: i  reason: collision with root package name */
    private int f8990i;

    /* renamed from: j  reason: collision with root package name */
    private int f8991j;

    /* renamed from: k  reason: collision with root package name */
    private long f8992k;

    /* renamed from: l  reason: collision with root package name */
    private int f8993l;

    /* renamed from: m  reason: collision with root package name */
    private yg f8994m;

    /* renamed from: n  reason: collision with root package name */
    private int f8995n;

    /* renamed from: o  reason: collision with root package name */
    private int f8996o;

    /* renamed from: p  reason: collision with root package name */
    private int f8997p;

    /* renamed from: q  reason: collision with root package name */
    private int f8998q;

    /* renamed from: r  reason: collision with root package name */
    private k8 f8999r;

    /* renamed from: s  reason: collision with root package name */
    private a[] f9000s;

    /* renamed from: t  reason: collision with root package name */
    private long[][] f9001t;

    /* renamed from: u  reason: collision with root package name */
    private int f9002u;

    /* renamed from: v  reason: collision with root package name */
    private long f9003v;

    /* renamed from: w  reason: collision with root package name */
    private int f9004w;

    /* renamed from: x  reason: collision with root package name */
    private Cif f9005x;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final mo f9006a;

        /* renamed from: b  reason: collision with root package name */
        public final so f9007b;

        /* renamed from: c  reason: collision with root package name */
        public final ro f9008c;

        /* renamed from: d  reason: collision with root package name */
        public int f9009d;

        public a(mo moVar, so soVar, ro roVar) {
            this.f9006a = moVar;
            this.f9007b = soVar;
            this.f9008c = roVar;
        }
    }

    public kf() {
        this(0);
    }

    private static int a(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mo a(mo moVar) {
        return moVar;
    }

    private static long[][] a(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f9007b.f12159b];
            jArr2[i10] = aVarArr[i10].f9007b.f12163f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            so soVar = aVarArr[i12].f9007b;
            j10 += (long) soVar.f12161d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = soVar.f12163f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private static boolean b(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    private int c(long j10) {
        int i10 = -1;
        int i11 = -1;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < ((a[]) yp.a((Object) this.f9000s)).length; i12++) {
            a aVar = this.f9000s[i12];
            int i13 = aVar.f9009d;
            so soVar = aVar.f9007b;
            if (i13 != soVar.f12159b) {
                long j14 = soVar.f12160c[i13];
                long j15 = ((long[][]) yp.a((Object) this.f9001t))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    private static boolean c(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private void e() {
        this.f8990i = 0;
        this.f8993l = 0;
    }

    private void f(long j10) {
        for (a aVar : this.f9000s) {
            so soVar = aVar.f9007b;
            int a10 = soVar.a(j10);
            if (a10 == -1) {
                a10 = soVar.b(j10);
            }
            aVar.f9009d = a10;
        }
    }

    private void g() {
        we weVar;
        if (this.f9004w == 2 && (this.f8982a & 2) != 0) {
            k8 k8Var = (k8) a1.a((Object) this.f8999r);
            ro a10 = k8Var.a(0, 4);
            if (this.f9005x == null) {
                weVar = null;
            } else {
                weVar = new we(this.f9005x);
            }
            a10.a(new d9.b().a(weVar).a());
            k8Var.c();
            k8Var.a(new ej.b(-9223372036854775807L));
        }
    }

    public void a() {
    }

    public ej.a b(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        int b10;
        if (((a[]) a1.a((Object) this.f9000s)).length == 0) {
            return new ej.a(gj.f8033c);
        }
        int i10 = this.f9002u;
        if (i10 != -1) {
            so soVar = this.f9000s[i10].f9007b;
            int a10 = a(soVar, j10);
            if (a10 == -1) {
                return new ej.a(gj.f8033c);
            }
            long j15 = soVar.f12163f[a10];
            j11 = soVar.f12160c[a10];
            if (j15 >= j10 || a10 >= soVar.f12159b - 1 || (b10 = soVar.b(j10)) == -1 || b10 == a10) {
                j14 = -1;
                j13 = -9223372036854775807L;
            } else {
                j13 = soVar.f12163f[b10];
                j14 = soVar.f12160c[b10];
            }
            j12 = j14;
            j10 = j15;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -1;
            j13 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f9000s;
            if (i11 >= aVarArr.length) {
                break;
            }
            if (i11 != this.f9002u) {
                so soVar2 = aVarArr[i11].f9007b;
                long a11 = a(soVar2, j10, j11);
                if (j13 != -9223372036854775807L) {
                    j12 = a(soVar2, j13, j12);
                }
                j11 = a11;
            }
            i11++;
        }
        gj gjVar = new gj(j10, j11);
        if (j13 == -9223372036854775807L) {
            return new ej.a(gjVar);
        }
        return new ej.a(gjVar, new gj(j13, j12));
    }

    public boolean b() {
        return true;
    }

    public long d() {
        return this.f9003v;
    }

    public kf(int i10) {
        this.f8982a = i10;
        this.f8990i = (i10 & 4) != 0 ? 3 : 0;
        this.f8988g = new ij();
        this.f8989h = new ArrayList();
        this.f8986e = new yg(16);
        this.f8987f = new ArrayDeque();
        this.f8983b = new yg(uf.f12561a);
        this.f8984c = new yg(4);
        this.f8985d = new yg();
        this.f8995n = -1;
    }

    private void d(long j10) {
        while (!this.f8987f.isEmpty() && ((i1.a) this.f8987f.peek()).f8404b == j10) {
            i1.a aVar = (i1.a) this.f8987f.pop();
            if (aVar.f8403a == 1836019574) {
                a(aVar);
                this.f8987f.clear();
                this.f8990i = 2;
            } else if (!this.f8987f.isEmpty()) {
                ((i1.a) this.f8987f.peek()).a(aVar);
            }
        }
        if (this.f8990i != 2) {
            e();
        }
    }

    private void e(long j10) {
        if (this.f8991j == 1836086884) {
            long j11 = (long) this.f8993l;
            this.f9005x = new Cif(0, j10, -9223372036854775807L, j10 + j11, this.f8992k - j11);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i8[] f() {
        return new i8[]{new kf()};
    }

    private boolean c(j8 j8Var) {
        i1.a aVar;
        if (this.f8993l == 0) {
            if (!j8Var.a(this.f8986e.c(), 0, 8, true)) {
                g();
                return false;
            }
            this.f8993l = 8;
            this.f8986e.f(0);
            this.f8992k = this.f8986e.y();
            this.f8991j = this.f8986e.j();
        }
        long j10 = this.f8992k;
        if (j10 == 1) {
            j8Var.d(this.f8986e.c(), 8, 8);
            this.f8993l += 8;
            this.f8992k = this.f8986e.B();
        } else if (j10 == 0) {
            long a10 = j8Var.a();
            if (a10 == -1 && (aVar = (i1.a) this.f8987f.peek()) != null) {
                a10 = aVar.f8404b;
            }
            if (a10 != -1) {
                this.f8992k = (a10 - j8Var.f()) + ((long) this.f8993l);
            }
        }
        if (this.f8992k >= ((long) this.f8993l)) {
            if (b(this.f8991j)) {
                long f10 = j8Var.f();
                long j11 = this.f8992k;
                long j12 = (long) this.f8993l;
                long j13 = (f10 + j11) - j12;
                if (j11 != j12 && this.f8991j == 1835365473) {
                    b(j8Var);
                }
                this.f8987f.push(new i1.a(this.f8991j, j13));
                if (this.f8992k == ((long) this.f8993l)) {
                    d(j13);
                } else {
                    e();
                }
            } else if (c(this.f8991j)) {
                a1.b(this.f8993l == 8);
                a1.b(this.f8992k <= 2147483647L);
                yg ygVar = new yg((int) this.f8992k);
                System.arraycopy(this.f8986e.c(), 0, ygVar.c(), 0, 8);
                this.f8994m = ygVar;
                this.f8990i = 1;
            } else {
                e(j8Var.f() - ((long) this.f8993l));
                this.f8994m = null;
                this.f8990i = 1;
            }
            return true;
        }
        throw ah.a("Atom size less than header length (unsupported).");
    }

    private int d(j8 j8Var, qh qhVar) {
        int a10 = this.f8988g.a(j8Var, qhVar, this.f8989h);
        if (a10 == 1 && qhVar.f10991a == 0) {
            e();
        }
        return a10;
    }

    private static int a(so soVar, long j10) {
        int a10 = soVar.a(j10);
        return a10 == -1 ? soVar.b(j10) : a10;
    }

    public void a(k8 k8Var) {
        this.f8999r = k8Var;
    }

    private static long a(so soVar, long j10, long j11) {
        int a10 = a(soVar, j10);
        if (a10 == -1) {
            return j11;
        }
        return Math.min(soVar.f12160c[a10], j11);
    }

    private void b(j8 j8Var) {
        this.f8985d.d(8);
        j8Var.c(this.f8985d.c(), 0, 8);
        j1.a(this.f8985d);
        j8Var.a(this.f8985d.d());
        j8Var.b();
    }

    private static int a(yg ygVar) {
        ygVar.f(8);
        int a10 = a(ygVar.j());
        if (a10 != 0) {
            return a10;
        }
        ygVar.g(4);
        while (ygVar.a() > 0) {
            int a11 = a(ygVar.j());
            if (a11 != 0) {
                return a11;
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(com.applovin.impl.j8 r10, com.applovin.impl.qh r11) {
        /*
            r9 = this;
            long r0 = r9.f8992k
            int r2 = r9.f8993l
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.f()
            long r2 = r2 + r0
            com.applovin.impl.yg r4 = r9.f8994m
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0044
            byte[] r11 = r4.c()
            int r7 = r9.f8993l
            int r1 = (int) r0
            r10.d(r11, r7, r1)
            int r10 = r9.f8991j
            r11 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r11) goto L_0x0029
            int r10 = a((com.applovin.impl.yg) r4)
            r9.f9004w = r10
            goto L_0x004f
        L_0x0029:
            java.util.ArrayDeque r10 = r9.f8987f
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x004f
            java.util.ArrayDeque r10 = r9.f8987f
            java.lang.Object r10 = r10.peek()
            com.applovin.impl.i1$a r10 = (com.applovin.impl.i1.a) r10
            com.applovin.impl.i1$b r11 = new com.applovin.impl.i1$b
            int r0 = r9.f8991j
            r11.<init>(r0, r4)
            r10.a((com.applovin.impl.i1.b) r11)
            goto L_0x004f
        L_0x0044:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0051
            int r11 = (int) r0
            r10.a(r11)
        L_0x004f:
            r10 = 0
            goto L_0x0059
        L_0x0051:
            long r7 = r10.f()
            long r7 = r7 + r0
            r11.f10991a = r7
            r10 = 1
        L_0x0059:
            r9.d(r2)
            if (r10 == 0) goto L_0x0064
            int r10 = r9.f8990i
            r11 = 2
            if (r10 == r11) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.kf.b(com.applovin.impl.j8, com.applovin.impl.qh):boolean");
    }

    private void a(i1.a aVar) {
        we weVar;
        we weVar2;
        int i10;
        List list;
        ArrayList arrayList;
        int i11;
        we weVar3;
        char c10;
        int i12;
        i1.a aVar2 = aVar;
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = this.f9004w == 1;
        x9 x9Var = new x9();
        i1.b e10 = aVar2.e(1969517665);
        if (e10 != null) {
            Pair a10 = j1.a(e10);
            we weVar4 = (we) a10.first;
            we weVar5 = (we) a10.second;
            if (weVar4 != null) {
                x9Var.a(weVar4);
            }
            weVar2 = weVar5;
            weVar = weVar4;
        } else {
            weVar2 = null;
            weVar = null;
        }
        i1.a d10 = aVar2.d(1835365473);
        we b10 = d10 != null ? j1.b(d10) : null;
        List a11 = j1.a(aVar, x9Var, -9223372036854775807L, (w6) null, (this.f8982a & 1) != 0, z10, (Function) uy.f12641a);
        k8 k8Var = (k8) a1.a((Object) this.f8999r);
        int size = a11.size();
        int i13 = 0;
        int i14 = -1;
        long j10 = -9223372036854775807L;
        while (i13 < size) {
            so soVar = (so) a11.get(i13);
            if (soVar.f12159b == 0) {
                list = a11;
                i10 = size;
                i11 = i14;
                arrayList = arrayList2;
            } else {
                mo moVar = soVar.f12158a;
                int i15 = i14;
                arrayList = arrayList2;
                long j11 = moVar.f9813e;
                if (j11 == -9223372036854775807L) {
                    j11 = soVar.f12165h;
                }
                long max = Math.max(j10, j11);
                list = a11;
                i10 = size;
                a aVar3 = new a(moVar, soVar, k8Var.a(i13, moVar.f9810b));
                long j12 = max;
                d9.b a12 = moVar.f9814f.a();
                a12.i(soVar.f12162e + 30);
                if (moVar.f9810b == 2 && j11 > 0 && (i12 = soVar.f12159b) > 1) {
                    a12.a(((float) i12) / (((float) j11) / 1000000.0f));
                }
                cf.a(moVar.f9810b, x9Var, a12);
                int i16 = moVar.f9810b;
                we[] weVarArr = new we[2];
                weVarArr[0] = weVar2;
                if (this.f8989h.isEmpty()) {
                    c10 = 1;
                    weVar3 = null;
                } else {
                    weVar3 = new we(this.f8989h);
                    c10 = 1;
                }
                weVarArr[c10] = weVar3;
                cf.a(i16, weVar, b10, a12, weVarArr);
                aVar3.f9008c.a(a12.a());
                int i17 = i15;
                if (moVar.f9810b == 2) {
                    if (i17 == -1) {
                        i11 = arrayList.size();
                        arrayList.add(aVar3);
                        j10 = j12;
                    }
                }
                i11 = i17;
                arrayList.add(aVar3);
                j10 = j12;
            }
            i13++;
            i14 = i11;
            arrayList2 = arrayList;
            a11 = list;
            size = i10;
        }
        this.f9002u = i14;
        this.f9003v = j10;
        a[] aVarArr = (a[]) arrayList2.toArray(new a[0]);
        this.f9000s = aVarArr;
        this.f9001t = a(aVarArr);
        k8Var.c();
        k8Var.a(this);
    }

    private int c(j8 j8Var, qh qhVar) {
        long f10 = j8Var.f();
        if (this.f8995n == -1) {
            int c10 = c(f10);
            this.f8995n = c10;
            if (c10 == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) yp.a((Object) this.f9000s))[this.f8995n];
        ro roVar = aVar.f9008c;
        int i10 = aVar.f9009d;
        so soVar = aVar.f9007b;
        long j10 = soVar.f12160c[i10];
        int i11 = soVar.f12161d[i10];
        long j11 = (j10 - f10) + ((long) this.f8996o);
        if (j11 < 0 || j11 >= 262144) {
            qhVar.f10991a = j10;
            return 1;
        }
        if (aVar.f9006a.f9815g == 1) {
            j11 += 8;
            i11 -= 8;
        }
        j8Var.a((int) j11);
        mo moVar = aVar.f9006a;
        if (moVar.f9818j == 0) {
            if ("audio/ac4".equals(moVar.f9814f.f7153m)) {
                if (this.f8997p == 0) {
                    n.a(i11, this.f8985d);
                    roVar.a(this.f8985d, 7);
                    this.f8997p += 7;
                }
                i11 += 7;
            }
            while (true) {
                int i12 = this.f8997p;
                if (i12 >= i11) {
                    break;
                }
                int a10 = roVar.a((e5) j8Var, i11 - i12, false);
                this.f8996o += a10;
                this.f8997p += a10;
                this.f8998q -= a10;
            }
        } else {
            byte[] c11 = this.f8984c.c();
            c11[0] = 0;
            c11[1] = 0;
            c11[2] = 0;
            int i13 = aVar.f9006a.f9818j;
            int i14 = 4 - i13;
            while (this.f8997p < i11) {
                int i15 = this.f8998q;
                if (i15 == 0) {
                    j8Var.d(c11, i14, i13);
                    this.f8996o += i13;
                    this.f8984c.f(0);
                    int j12 = this.f8984c.j();
                    if (j12 >= 0) {
                        this.f8998q = j12;
                        this.f8983b.f(0);
                        roVar.a(this.f8983b, 4);
                        this.f8997p += 4;
                        i11 += i14;
                    } else {
                        throw ah.a("Invalid NAL length", (Throwable) null);
                    }
                } else {
                    int a11 = roVar.a((e5) j8Var, i15, false);
                    this.f8996o += a11;
                    this.f8997p += a11;
                    this.f8998q -= a11;
                }
            }
        }
        so soVar2 = aVar.f9007b;
        roVar.a(soVar2.f12163f[i10], soVar2.f12164g[i10], i11, 0, (ro.a) null);
        aVar.f9009d++;
        this.f8995n = -1;
        this.f8996o = 0;
        this.f8997p = 0;
        this.f8998q = 0;
        return 0;
    }

    public int a(j8 j8Var, qh qhVar) {
        while (true) {
            int i10 = this.f8990i;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return c(j8Var, qhVar);
                    }
                    if (i10 == 3) {
                        return d(j8Var, qhVar);
                    }
                    throw new IllegalStateException();
                } else if (b(j8Var, qhVar)) {
                    return 1;
                }
            } else if (!c(j8Var)) {
                return -1;
            }
        }
    }

    public void a(long j10, long j11) {
        this.f8987f.clear();
        this.f8993l = 0;
        this.f8995n = -1;
        this.f8996o = 0;
        this.f8997p = 0;
        this.f8998q = 0;
        if (j10 == 0) {
            if (this.f8990i != 3) {
                e();
                return;
            }
            this.f8988g.a();
            this.f8989h.clear();
        } else if (this.f9000s != null) {
            f(j11);
        }
    }

    public boolean a(j8 j8Var) {
        return ik.a(j8Var, (this.f8982a & 2) != 0);
    }
}
