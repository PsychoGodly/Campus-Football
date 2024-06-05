package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.applovin.impl.ro;
import java.io.EOFException;
import java.util.Arrays;

public final class q0 implements i8 {

    /* renamed from: p  reason: collision with root package name */
    public static final m8 f10768p = t10.f12233b;

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f10769q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f10770r;

    /* renamed from: s  reason: collision with root package name */
    private static final byte[] f10771s = yp.c("#!AMR\n");

    /* renamed from: t  reason: collision with root package name */
    private static final byte[] f10772t = yp.c("#!AMR-WB\n");

    /* renamed from: u  reason: collision with root package name */
    private static final int f10773u;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f10774a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10775b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10776c;

    /* renamed from: d  reason: collision with root package name */
    private long f10777d;

    /* renamed from: e  reason: collision with root package name */
    private int f10778e;

    /* renamed from: f  reason: collision with root package name */
    private int f10779f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10780g;

    /* renamed from: h  reason: collision with root package name */
    private long f10781h;

    /* renamed from: i  reason: collision with root package name */
    private int f10782i;

    /* renamed from: j  reason: collision with root package name */
    private int f10783j;

    /* renamed from: k  reason: collision with root package name */
    private long f10784k;

    /* renamed from: l  reason: collision with root package name */
    private k8 f10785l;

    /* renamed from: m  reason: collision with root package name */
    private ro f10786m;

    /* renamed from: n  reason: collision with root package name */
    private ej f10787n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10788o;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f10770r = iArr;
        f10773u = iArr[8];
    }

    public q0() {
        this(0);
    }

    private static int a(int i10, long j10) {
        return (int) ((((long) (i10 * 8)) * 1000000) / j10);
    }

    private void b() {
        a1.b((Object) this.f10786m);
        yp.a((Object) this.f10785l);
    }

    private boolean c(int i10) {
        return i10 >= 0 && i10 <= 15 && (d(i10) || b(i10));
    }

    private boolean d(int i10) {
        return this.f10776c && (i10 < 10 || i10 > 13);
    }

    public void a() {
    }

    public q0(int i10) {
        this.f10775b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f10774a = new byte[1];
        this.f10782i = -1;
    }

    private ej a(long j10, boolean z10) {
        return new n4(j10, this.f10781h, a(this.f10782i, 20000), this.f10782i, z10);
    }

    private boolean c(j8 j8Var) {
        byte[] bArr = f10771s;
        if (a(j8Var, bArr)) {
            this.f10776c = false;
            j8Var.a(bArr.length);
            return true;
        }
        byte[] bArr2 = f10772t;
        if (!a(j8Var, bArr2)) {
            return false;
        }
        this.f10776c = true;
        j8Var.a(bArr2.length);
        return true;
    }

    private void d() {
        if (!this.f10788o) {
            this.f10788o = true;
            boolean z10 = this.f10776c;
            this.f10786m.a(new d9.b().f(z10 ? "audio/amr-wb" : "audio/3gpp").i(f10773u).c(1).n(z10 ? 16000 : 8000).a());
        }
    }

    private boolean b(int i10) {
        return !this.f10776c && (i10 < 12 || i10 > 14);
    }

    private int a(int i10) {
        if (c(i10)) {
            return this.f10776c ? f10770r[i10] : f10769q[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f10776c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw ah.a(sb2.toString(), (Throwable) null);
    }

    private int b(j8 j8Var) {
        j8Var.b();
        j8Var.c(this.f10774a, 0, 1);
        byte b10 = this.f10774a[0];
        if ((b10 & 131) <= 0) {
            return a((b10 >> 3) & 15);
        }
        throw ah.a("Invalid padding bits for frame header " + b10, (Throwable) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i8[] c() {
        return new i8[]{new q0()};
    }

    public void a(k8 k8Var) {
        this.f10785l = k8Var;
        this.f10786m = k8Var.a(0, 1);
        k8Var.c();
    }

    private void a(long j10, int i10) {
        int i11;
        if (!this.f10780g) {
            int i12 = this.f10775b;
            if ((i12 & 1) == 0 || j10 == -1 || !((i11 = this.f10782i) == -1 || i11 == this.f10778e)) {
                ej.b bVar = new ej.b(-9223372036854775807L);
                this.f10787n = bVar;
                this.f10785l.a(bVar);
                this.f10780g = true;
            } else if (this.f10783j >= 20 || i10 == -1) {
                ej a10 = a(j10, (i12 & 2) != 0);
                this.f10787n = a10;
                this.f10785l.a(a10);
                this.f10780g = true;
            }
        }
    }

    private int d(j8 j8Var) {
        if (this.f10779f == 0) {
            try {
                int b10 = b(j8Var);
                this.f10778e = b10;
                this.f10779f = b10;
                if (this.f10782i == -1) {
                    this.f10781h = j8Var.f();
                    this.f10782i = this.f10778e;
                }
                if (this.f10782i == this.f10778e) {
                    this.f10783j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a10 = this.f10786m.a((e5) j8Var, this.f10779f, true);
        if (a10 == -1) {
            return -1;
        }
        int i10 = this.f10779f - a10;
        this.f10779f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f10786m.a(this.f10784k + this.f10777d, 1, this.f10778e, 0, (ro.a) null);
        this.f10777d += 20000;
        return 0;
    }

    private static boolean a(j8 j8Var, byte[] bArr) {
        j8Var.b();
        byte[] bArr2 = new byte[bArr.length];
        j8Var.c(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    public int a(j8 j8Var, qh qhVar) {
        b();
        if (j8Var.f() != 0 || c(j8Var)) {
            d();
            int d10 = d(j8Var);
            a(j8Var.a(), d10);
            return d10;
        }
        throw ah.a("Could not find AMR header.", (Throwable) null);
    }

    public void a(long j10, long j11) {
        this.f10777d = 0;
        this.f10778e = 0;
        this.f10779f = 0;
        if (j10 != 0) {
            ej ejVar = this.f10787n;
            if (ejVar instanceof n4) {
                this.f10784k = ((n4) ejVar).d(j10);
                return;
            }
        }
        this.f10784k = 0;
    }

    public boolean a(j8 j8Var) {
        return c(j8Var);
    }
}
