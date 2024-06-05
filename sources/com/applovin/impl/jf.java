package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.of;
import com.applovin.impl.ro;
import com.applovin.impl.ta;
import com.applovin.impl.we;
import java.io.EOFException;

public final class jf implements i8 {

    /* renamed from: u  reason: collision with root package name */
    public static final m8 f8743u = ky.f9104b;

    /* renamed from: v  reason: collision with root package name */
    private static final ta.a f8744v = ly.f9285a;

    /* renamed from: a  reason: collision with root package name */
    private final int f8745a;

    /* renamed from: b  reason: collision with root package name */
    private final long f8746b;

    /* renamed from: c  reason: collision with root package name */
    private final yg f8747c;

    /* renamed from: d  reason: collision with root package name */
    private final of.a f8748d;

    /* renamed from: e  reason: collision with root package name */
    private final x9 f8749e;

    /* renamed from: f  reason: collision with root package name */
    private final va f8750f;

    /* renamed from: g  reason: collision with root package name */
    private final ro f8751g;

    /* renamed from: h  reason: collision with root package name */
    private k8 f8752h;

    /* renamed from: i  reason: collision with root package name */
    private ro f8753i;

    /* renamed from: j  reason: collision with root package name */
    private ro f8754j;

    /* renamed from: k  reason: collision with root package name */
    private int f8755k;

    /* renamed from: l  reason: collision with root package name */
    private we f8756l;

    /* renamed from: m  reason: collision with root package name */
    private long f8757m;

    /* renamed from: n  reason: collision with root package name */
    private long f8758n;

    /* renamed from: o  reason: collision with root package name */
    private long f8759o;

    /* renamed from: p  reason: collision with root package name */
    private int f8760p;

    /* renamed from: q  reason: collision with root package name */
    private hj f8761q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f8762r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f8763s;

    /* renamed from: t  reason: collision with root package name */
    private long f8764t;

    public jf() {
        this(0);
    }

    private long a(long j10) {
        return this.f8757m + ((j10 * 1000000) / ((long) this.f8748d.f10231d));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    private static boolean a(int i10, long j10) {
        return ((long) (i10 & -128000)) == (j10 & -128000);
    }

    private void b() {
        a1.b((Object) this.f8753i);
        yp.a((Object) this.f8752h);
    }

    private boolean d(j8 j8Var) {
        hj hjVar = this.f8761q;
        if (hjVar != null) {
            long c10 = hjVar.c();
            if (c10 != -1 && j8Var.d() > c10 - 4) {
                return true;
            }
        }
        try {
            return !j8Var.b(this.f8747c.c(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int e(j8 j8Var) {
        if (this.f8755k == 0) {
            try {
                b(j8Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f8761q == null) {
            hj b10 = b(j8Var);
            this.f8761q = b10;
            this.f8752h.a(b10);
            this.f8754j.a(new d9.b().f(this.f8748d.f10229b).i(4096).c(this.f8748d.f10232e).n(this.f8748d.f10231d).e(this.f8749e.f13304a).f(this.f8749e.f13305b).a((this.f8745a & 8) != 0 ? null : this.f8756l).a());
            this.f8759o = j8Var.f();
        } else if (this.f8759o != 0) {
            long f10 = j8Var.f();
            long j10 = this.f8759o;
            if (f10 < j10) {
                j8Var.a((int) (j10 - f10));
            }
        }
        return f(j8Var);
    }

    private int f(j8 j8Var) {
        if (this.f8760p == 0) {
            j8Var.b();
            if (d(j8Var)) {
                return -1;
            }
            this.f8747c.f(0);
            int j10 = this.f8747c.j();
            if (!a(j10, (long) this.f8755k) || of.b(j10) == -1) {
                j8Var.a(1);
                this.f8755k = 0;
                return 0;
            }
            this.f8748d.a(j10);
            if (this.f8757m == -9223372036854775807L) {
                this.f8757m = this.f8761q.a(j8Var.f());
                if (this.f8746b != -9223372036854775807L) {
                    this.f8757m += this.f8746b - this.f8761q.a(0);
                }
            }
            of.a aVar = this.f8748d;
            this.f8760p = aVar.f10230c;
            hj hjVar = this.f8761q;
            if (hjVar instanceof jb) {
                jb jbVar = (jb) hjVar;
                jbVar.a(a(this.f8758n + ((long) aVar.f10234g)), j8Var.f() + ((long) this.f8748d.f10230c));
                if (this.f8763s && jbVar.c(this.f8764t)) {
                    this.f8763s = false;
                    this.f8754j = this.f8753i;
                }
            }
        }
        int a10 = this.f8754j.a((e5) j8Var, this.f8760p, true);
        if (a10 == -1) {
            return -1;
        }
        int i10 = this.f8760p - a10;
        this.f8760p = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f8754j.a(a(this.f8758n), 1, this.f8748d.f10230c, 0, (ro.a) null);
        this.f8758n += (long) this.f8748d.f10234g;
        this.f8760p = 0;
        return 0;
    }

    public void a() {
    }

    public void c() {
        this.f8762r = true;
    }

    public jf(int i10) {
        this(i10, -9223372036854775807L);
    }

    private hj a(j8 j8Var, boolean z10) {
        j8Var.c(this.f8747c.c(), 0, 4);
        this.f8747c.f(0);
        this.f8748d.a(this.f8747c.j());
        return new o4(j8Var.a(), j8Var.f(), this.f8748d, z10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.impl.hj c(com.applovin.impl.j8 r11) {
        /*
            r10 = this;
            com.applovin.impl.yg r5 = new com.applovin.impl.yg
            com.applovin.impl.of$a r0 = r10.f8748d
            int r0 = r0.f10230c
            r5.<init>((int) r0)
            byte[] r0 = r5.c()
            com.applovin.impl.of$a r1 = r10.f8748d
            int r1 = r1.f10230c
            r6 = 0
            r11.c(r0, r6, r1)
            com.applovin.impl.of$a r0 = r10.f8748d
            int r1 = r0.f10228a
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0026
            int r0 = r0.f10232e
            if (r0 == r2) goto L_0x002a
            r0 = 36
            r7 = 36
            goto L_0x0033
        L_0x0026:
            int r0 = r0.f10232e
            if (r0 == r2) goto L_0x002f
        L_0x002a:
            r0 = 21
            r7 = 21
            goto L_0x0033
        L_0x002f:
            r0 = 13
            r7 = 13
        L_0x0033:
            int r8 = a((com.applovin.impl.yg) r5, (int) r7)
            r0 = 1483304551(0x58696e67, float:1.02664153E15)
            r9 = 1231971951(0x496e666f, float:976486.94)
            if (r8 == r0) goto L_0x0062
            if (r8 != r9) goto L_0x0042
            goto L_0x0062
        L_0x0042:
            r0 = 1447187017(0x56425249, float:5.3414667E13)
            if (r8 != r0) goto L_0x005d
            long r0 = r11.a()
            long r2 = r11.f()
            com.applovin.impl.of$a r4 = r10.f8748d
            com.applovin.impl.qq r0 = com.applovin.impl.qq.a(r0, r2, r4, r5)
            com.applovin.impl.of$a r1 = r10.f8748d
            int r1 = r1.f10230c
            r11.a(r1)
            goto L_0x00b2
        L_0x005d:
            r0 = 0
            r11.b()
            goto L_0x00b2
        L_0x0062:
            long r0 = r11.a()
            long r2 = r11.f()
            com.applovin.impl.of$a r4 = r10.f8748d
            com.applovin.impl.es r0 = com.applovin.impl.es.a(r0, r2, r4, r5)
            if (r0 == 0) goto L_0x009c
            com.applovin.impl.x9 r1 = r10.f8749e
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x009c
            r11.b()
            int r7 = r7 + 141
            r11.c(r7)
            com.applovin.impl.yg r1 = r10.f8747c
            byte[] r1 = r1.c()
            r2 = 3
            r11.c(r1, r6, r2)
            com.applovin.impl.yg r1 = r10.f8747c
            r1.f(r6)
            com.applovin.impl.x9 r1 = r10.f8749e
            com.applovin.impl.yg r2 = r10.f8747c
            int r2 = r2.z()
            r1.a((int) r2)
        L_0x009c:
            com.applovin.impl.of$a r1 = r10.f8748d
            int r1 = r1.f10230c
            r11.a(r1)
            if (r0 == 0) goto L_0x00b2
            boolean r1 = r0.b()
            if (r1 != 0) goto L_0x00b2
            if (r8 != r9) goto L_0x00b2
            com.applovin.impl.hj r11 = r10.a((com.applovin.impl.j8) r11, (boolean) r6)
            return r11
        L_0x00b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.jf.c(com.applovin.impl.j8):com.applovin.impl.hj");
    }

    public jf(int i10, long j10) {
        this.f8745a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f8746b = j10;
        this.f8747c = new yg(10);
        this.f8748d = new of.a();
        this.f8749e = new x9();
        this.f8757m = -9223372036854775807L;
        this.f8750f = new va();
        g7 g7Var = new g7();
        this.f8751g = g7Var;
        this.f8754j = g7Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.applovin.impl.hj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.applovin.impl.ff} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.applovin.impl.jb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.applovin.impl.jb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.applovin.impl.jb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.applovin.impl.jb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.applovin.impl.jb} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r0 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.impl.hj b(com.applovin.impl.j8 r12) {
        /*
            r11 = this;
            com.applovin.impl.hj r0 = r11.c(r12)
            com.applovin.impl.we r1 = r11.f8756l
            long r2 = r12.f()
            com.applovin.impl.ff r1 = a((com.applovin.impl.we) r1, (long) r2)
            boolean r2 = r11.f8762r
            if (r2 == 0) goto L_0x0018
            com.applovin.impl.hj$a r12 = new com.applovin.impl.hj$a
            r12.<init>()
            return r12
        L_0x0018:
            r2 = 0
            int r3 = r11.f8745a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x004c
            r2 = -1
            if (r1 == 0) goto L_0x002e
            long r2 = r1.d()
            long r0 = r1.c()
        L_0x002b:
            r9 = r0
            r5 = r2
            goto L_0x0041
        L_0x002e:
            if (r0 == 0) goto L_0x0039
            long r2 = r0.d()
            long r0 = r0.c()
            goto L_0x002b
        L_0x0039:
            com.applovin.impl.we r0 = r11.f8756l
            long r0 = a((com.applovin.impl.we) r0)
            r5 = r0
            r9 = r2
        L_0x0041:
            com.applovin.impl.jb r0 = new com.applovin.impl.jb
            long r7 = r12.f()
            r4 = r0
            r4.<init>(r5, r7, r9)
            goto L_0x0054
        L_0x004c:
            if (r1 == 0) goto L_0x0050
            r0 = r1
            goto L_0x0054
        L_0x0050:
            if (r0 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            r1 = 1
            if (r0 == 0) goto L_0x0062
            boolean r2 = r0.b()
            if (r2 != 0) goto L_0x006e
            int r2 = r11.f8745a
            r2 = r2 & r1
            if (r2 == 0) goto L_0x006e
        L_0x0062:
            int r0 = r11.f8745a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            com.applovin.impl.hj r0 = r11.a((com.applovin.impl.j8) r12, (boolean) r1)
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.jf.b(com.applovin.impl.j8):com.applovin.impl.hj");
    }

    private static long a(we weVar) {
        if (weVar == null) {
            return -9223372036854775807L;
        }
        int c10 = weVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            we.b a10 = weVar.a(i10);
            if (a10 instanceof ao) {
                ao aoVar = (ao) a10;
                if (aoVar.f12545a.equals("TLEN")) {
                    return r2.a(Long.parseLong(aoVar.f6564c));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i8[] d() {
        return new i8[]{new jf()};
    }

    private static int a(yg ygVar, int i10) {
        if (ygVar.e() >= i10 + 4) {
            ygVar.f(i10);
            int j10 = ygVar.j();
            if (j10 == 1483304551 || j10 == 1231971951) {
                return j10;
            }
        }
        if (ygVar.e() < 40) {
            return 0;
        }
        ygVar.f(36);
        return ygVar.j() == 1447187017 ? 1447187017 : 0;
    }

    private boolean b(j8 j8Var, boolean z10) {
        int i10;
        int i11;
        int b10;
        ta.a aVar;
        int i12 = z10 ? 32768 : 131072;
        j8Var.b();
        if (j8Var.f() == 0) {
            if ((this.f8745a & 8) == 0) {
                aVar = null;
            } else {
                aVar = f8744v;
            }
            we a10 = this.f8750f.a(j8Var, aVar);
            this.f8756l = a10;
            if (a10 != null) {
                this.f8749e.a(a10);
            }
            i10 = (int) j8Var.d();
            if (!z10) {
                j8Var.a(i10);
            }
            i11 = 0;
        } else {
            i11 = 0;
            i10 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (!d(j8Var)) {
                this.f8747c.f(0);
                int j10 = this.f8747c.j();
                if ((i11 == 0 || a(j10, (long) i11)) && (b10 = of.b(j10)) != -1) {
                    i13++;
                    if (i13 != 1) {
                        if (i13 == 4) {
                            break;
                        }
                    } else {
                        this.f8748d.a(j10);
                        i11 = j10;
                    }
                    j8Var.c(b10 - 4);
                } else {
                    int i15 = i14 + 1;
                    if (i14 != i12) {
                        if (z10) {
                            j8Var.b();
                            j8Var.c(i10 + i15);
                        } else {
                            j8Var.a(1);
                        }
                        i14 = i15;
                        i11 = 0;
                        i13 = 0;
                    } else if (z10) {
                        return false;
                    } else {
                        throw ah.a("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i13 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            j8Var.a(i10 + i14);
        } else {
            j8Var.b();
        }
        this.f8755k = i11;
        return true;
    }

    public void a(k8 k8Var) {
        this.f8752h = k8Var;
        ro a10 = k8Var.a(0, 1);
        this.f8753i = a10;
        this.f8754j = a10;
        this.f8752h.c();
    }

    private static ff a(we weVar, long j10) {
        if (weVar == null) {
            return null;
        }
        int c10 = weVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            we.b a10 = weVar.a(i10);
            if (a10 instanceof ef) {
                return ff.a(j10, (ef) a10, a(weVar));
            }
        }
        return null;
    }

    public int a(j8 j8Var, qh qhVar) {
        b();
        int e10 = e(j8Var);
        if (e10 == -1 && (this.f8761q instanceof jb)) {
            long a10 = a(this.f8758n);
            if (this.f8761q.d() != a10) {
                ((jb) this.f8761q).d(a10);
                this.f8752h.a(this.f8761q);
            }
        }
        return e10;
    }

    public void a(long j10, long j11) {
        this.f8755k = 0;
        this.f8757m = -9223372036854775807L;
        this.f8758n = 0;
        this.f8760p = 0;
        this.f8764t = j11;
        hj hjVar = this.f8761q;
        if ((hjVar instanceof jb) && !((jb) hjVar).c(j11)) {
            this.f8763s = true;
            this.f8754j = this.f8751g;
        }
    }

    public boolean a(j8 j8Var) {
        return b(j8Var, true);
    }
}
