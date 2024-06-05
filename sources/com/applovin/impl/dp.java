package com.applovin.impl;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.applovin.impl.ej;
import com.applovin.impl.ep;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class dp implements i8 {

    /* renamed from: t  reason: collision with root package name */
    public static final m8 f7292t = gw.f8152b;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f7293a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7294b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final List f7295c;

    /* renamed from: d  reason: collision with root package name */
    private final yg f7296d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseIntArray f7297e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final ep.c f7298f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final SparseArray f7299g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final SparseBooleanArray f7300h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final SparseBooleanArray f7301i;

    /* renamed from: j  reason: collision with root package name */
    private final cp f7302j;

    /* renamed from: k  reason: collision with root package name */
    private bp f7303k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public k8 f7304l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f7305m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f7306n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f7307o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7308p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public ep f7309q;

    /* renamed from: r  reason: collision with root package name */
    private int f7310r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public int f7311s;

    private class a implements cj {

        /* renamed from: a  reason: collision with root package name */
        private final xg f7312a = new xg(new byte[4]);

        public a() {
        }

        public void a(io ioVar, k8 k8Var, ep.d dVar) {
        }

        public void a(yg ygVar) {
            if (ygVar.w() == 0 && (ygVar.w() & 128) != 0) {
                ygVar.g(6);
                int a10 = ygVar.a() / 4;
                for (int i10 = 0; i10 < a10; i10++) {
                    ygVar.a(this.f7312a, 4);
                    int a11 = this.f7312a.a(16);
                    this.f7312a.d(3);
                    if (a11 == 0) {
                        this.f7312a.d(13);
                    } else {
                        int a12 = this.f7312a.a(13);
                        if (dp.this.f7299g.get(a12) == null) {
                            dp.this.f7299g.put(a12, new dj(new b(a12)));
                            dp.d(dp.this);
                        }
                    }
                }
                if (dp.this.f7293a != 2) {
                    dp.this.f7299g.remove(0);
                }
            }
        }
    }

    public dp() {
        this(0);
    }

    static /* synthetic */ int d(dp dpVar) {
        int i10 = dpVar.f7305m;
        dpVar.f7305m = i10 + 1;
        return i10;
    }

    public void a() {
    }

    public dp(int i10) {
        this(1, i10, 112800);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i8[] c() {
        return new i8[]{new dp()};
    }

    private void d() {
        this.f7300h.clear();
        this.f7299g.clear();
        SparseArray a10 = this.f7298f.a();
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7299g.put(a10.keyAt(i10), (ep) a10.valueAt(i10));
        }
        this.f7299g.put(0, new dj(new a()));
        this.f7309q = null;
    }

    public dp(int i10, int i11, int i12) {
        this(i10, new io(0), new l6(i11), i12);
    }

    private boolean b(j8 j8Var) {
        byte[] c10 = this.f7296d.c();
        if (9400 - this.f7296d.d() < 188) {
            int a10 = this.f7296d.a();
            if (a10 > 0) {
                System.arraycopy(c10, this.f7296d.d(), c10, 0, a10);
            }
            this.f7296d.a(c10, a10);
        }
        while (this.f7296d.a() < 188) {
            int e10 = this.f7296d.e();
            int a11 = j8Var.a(c10, e10, 9400 - e10);
            if (a11 == -1) {
                return false;
            }
            this.f7296d.e(e10 + a11);
        }
        return true;
    }

    public dp(int i10, io ioVar, ep.c cVar, int i11) {
        this.f7298f = (ep.c) a1.a((Object) cVar);
        this.f7294b = i11;
        this.f7293a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f7295c = Collections.singletonList(ioVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f7295c = arrayList;
            arrayList.add(ioVar);
        }
        this.f7296d = new yg(new byte[9400], 0);
        this.f7300h = new SparseBooleanArray();
        this.f7301i = new SparseBooleanArray();
        this.f7299g = new SparseArray();
        this.f7297e = new SparseIntArray();
        this.f7302j = new cp(i11);
        this.f7304l = k8.f8929e;
        this.f7311s = -1;
        d();
    }

    public void a(k8 k8Var) {
        this.f7304l = k8Var;
    }

    private void a(long j10) {
        if (!this.f7307o) {
            this.f7307o = true;
            if (this.f7302j.a() != -9223372036854775807L) {
                bp bpVar = new bp(this.f7302j.b(), this.f7302j.a(), j10, this.f7311s, this.f7294b);
                this.f7303k = bpVar;
                this.f7304l.a(bpVar.a());
                return;
            }
            this.f7304l.a(new ej.b(this.f7302j.a()));
        }
    }

    private int b() {
        int d10 = this.f7296d.d();
        int e10 = this.f7296d.e();
        int a10 = fp.a(this.f7296d.c(), d10, e10);
        this.f7296d.f(a10);
        int i10 = a10 + 188;
        if (i10 > e10) {
            int i11 = this.f7310r + (a10 - d10);
            this.f7310r = i11;
            if (this.f7293a == 2 && i11 > 376) {
                throw ah.a("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
            }
        } else {
            this.f7310r = 0;
        }
        return i10;
    }

    public int a(j8 j8Var, qh qhVar) {
        j8 j8Var2 = j8Var;
        qh qhVar2 = qhVar;
        long a10 = j8Var.a();
        if (this.f7306n) {
            if (a10 != -1 && this.f7293a != 2 && !this.f7302j.c()) {
                return this.f7302j.a(j8Var2, qhVar2, this.f7311s);
            }
            a(a10);
            if (this.f7308p) {
                this.f7308p = false;
                a(0, 0);
                if (j8Var.f() != 0) {
                    qhVar2.f10991a = 0;
                    return 1;
                }
            }
            bp bpVar = this.f7303k;
            if (bpVar != null && bpVar.b()) {
                return this.f7303k.a(j8Var2, qhVar2);
            }
        }
        if (!b(j8Var)) {
            return -1;
        }
        int b10 = b();
        int e10 = this.f7296d.e();
        if (b10 > e10) {
            return 0;
        }
        int j10 = this.f7296d.j();
        if ((8388608 & j10) != 0) {
            this.f7296d.f(b10);
            return 0;
        }
        int i10 = (4194304 & j10) != 0 ? 1 : 0;
        int i11 = (2096896 & j10) >> 8;
        boolean z10 = (j10 & 32) != 0;
        ep epVar = (j10 & 16) != 0 ? (ep) this.f7299g.get(i11) : null;
        if (epVar == null) {
            this.f7296d.f(b10);
            return 0;
        }
        if (this.f7293a != 2) {
            int i12 = j10 & 15;
            int i13 = this.f7297e.get(i11, i12 - 1);
            this.f7297e.put(i11, i12);
            if (i13 == i12) {
                this.f7296d.f(b10);
                return 0;
            } else if (i12 != ((i13 + 1) & 15)) {
                epVar.a();
            }
        }
        if (z10) {
            int w10 = this.f7296d.w();
            i10 |= (this.f7296d.w() & 64) != 0 ? 2 : 0;
            this.f7296d.g(w10 - 1);
        }
        boolean z11 = this.f7306n;
        if (a(i11)) {
            this.f7296d.e(b10);
            epVar.a(this.f7296d, i10);
            this.f7296d.e(e10);
        }
        if (this.f7293a != 2 && !z11 && this.f7306n && a10 != -1) {
            this.f7308p = true;
        }
        this.f7296d.f(b10);
        return 0;
    }

    public void a(long j10, long j11) {
        bp bpVar;
        a1.b(this.f7293a != 2);
        int size = this.f7295c.size();
        for (int i10 = 0; i10 < size; i10++) {
            io ioVar = (io) this.f7295c.get(i10);
            boolean z10 = ioVar.c() == -9223372036854775807L;
            if (!z10) {
                long a10 = ioVar.a();
                if (a10 != -9223372036854775807L) {
                    if (a10 != 0) {
                        if (a10 == j11) {
                        }
                    }
                }
            } else if (!z10) {
            }
            ioVar.d(j11);
        }
        if (!(j11 == 0 || (bpVar = this.f7303k) == null)) {
            bpVar.b(j11);
        }
        this.f7296d.d(0);
        this.f7297e.clear();
        for (int i11 = 0; i11 < this.f7299g.size(); i11++) {
            ((ep) this.f7299g.valueAt(i11)).a();
        }
        this.f7310r = 0;
    }

    private boolean a(int i10) {
        if (this.f7293a == 2 || this.f7306n || !this.f7301i.get(i10, false)) {
            return true;
        }
        return false;
    }

    private class b implements cj {

        /* renamed from: a  reason: collision with root package name */
        private final xg f7314a = new xg(new byte[5]);

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray f7315b = new SparseArray();

        /* renamed from: c  reason: collision with root package name */
        private final SparseIntArray f7316c = new SparseIntArray();

        /* renamed from: d  reason: collision with root package name */
        private final int f7317d;

        public b(int i10) {
            this.f7317d = i10;
        }

        public void a(io ioVar, k8 k8Var, ep.d dVar) {
        }

        public void a(yg ygVar) {
            io ioVar;
            ep epVar;
            yg ygVar2 = ygVar;
            if (ygVar.w() == 2) {
                if (dp.this.f7293a == 1 || dp.this.f7293a == 2 || dp.this.f7305m == 1) {
                    ioVar = (io) dp.this.f7295c.get(0);
                } else {
                    ioVar = new io(((io) dp.this.f7295c.get(0)).a());
                    dp.this.f7295c.add(ioVar);
                }
                if ((ygVar.w() & 128) != 0) {
                    ygVar2.g(1);
                    int C = ygVar.C();
                    int i10 = 3;
                    ygVar2.g(3);
                    ygVar2.a(this.f7314a, 2);
                    this.f7314a.d(3);
                    int i11 = 13;
                    int unused = dp.this.f7311s = this.f7314a.a(13);
                    ygVar2.a(this.f7314a, 2);
                    int i12 = 4;
                    this.f7314a.d(4);
                    ygVar2.g(this.f7314a.a(12));
                    if (dp.this.f7293a == 2 && dp.this.f7309q == null) {
                        ep.b bVar = new ep.b(21, (String) null, (List) null, yp.f13667f);
                        dp dpVar = dp.this;
                        ep unused2 = dpVar.f7309q = dpVar.f7298f.a(21, bVar);
                        if (dp.this.f7309q != null) {
                            dp.this.f7309q.a(ioVar, dp.this.f7304l, new ep.d(C, 21, 8192));
                        }
                    }
                    this.f7315b.clear();
                    this.f7316c.clear();
                    int a10 = ygVar.a();
                    while (a10 > 0) {
                        ygVar2.a(this.f7314a, 5);
                        int a11 = this.f7314a.a(8);
                        this.f7314a.d(i10);
                        int a12 = this.f7314a.a(i11);
                        this.f7314a.d(i12);
                        int a13 = this.f7314a.a(12);
                        ep.b a14 = a(ygVar2, a13);
                        if (a11 == 6 || a11 == 5) {
                            a11 = a14.f7490a;
                        }
                        a10 -= a13 + 5;
                        int i13 = dp.this.f7293a == 2 ? a11 : a12;
                        if (!dp.this.f7300h.get(i13)) {
                            if (dp.this.f7293a == 2 && a11 == 21) {
                                epVar = dp.this.f7309q;
                            } else {
                                epVar = dp.this.f7298f.a(a11, a14);
                            }
                            if (dp.this.f7293a != 2 || a12 < this.f7316c.get(i13, 8192)) {
                                this.f7316c.put(i13, a12);
                                this.f7315b.put(i13, epVar);
                            }
                        }
                        i10 = 3;
                        i12 = 4;
                        i11 = 13;
                    }
                    int size = this.f7316c.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        int keyAt = this.f7316c.keyAt(i14);
                        int valueAt = this.f7316c.valueAt(i14);
                        dp.this.f7300h.put(keyAt, true);
                        dp.this.f7301i.put(valueAt, true);
                        ep epVar2 = (ep) this.f7315b.valueAt(i14);
                        if (epVar2 != null) {
                            if (epVar2 != dp.this.f7309q) {
                                epVar2.a(ioVar, dp.this.f7304l, new ep.d(C, keyAt, 8192));
                            }
                            dp.this.f7299g.put(valueAt, epVar2);
                        }
                    }
                    if (dp.this.f7293a != 2) {
                        dp.this.f7299g.remove(this.f7317d);
                        dp dpVar2 = dp.this;
                        int unused3 = dpVar2.f7305m = dpVar2.f7293a == 1 ? 0 : dp.this.f7305m - 1;
                        if (dp.this.f7305m == 0) {
                            dp.this.f7304l.c();
                            boolean unused4 = dp.this.f7306n = true;
                        }
                    } else if (!dp.this.f7306n) {
                        dp.this.f7304l.c();
                        int unused5 = dp.this.f7305m = 0;
                        boolean unused6 = dp.this.f7306n = true;
                    }
                }
            }
        }

        private ep.b a(yg ygVar, int i10) {
            int d10 = ygVar.d();
            int i11 = i10 + d10;
            String str = null;
            ArrayList arrayList = null;
            int i12 = -1;
            while (ygVar.d() < i11) {
                int w10 = ygVar.w();
                int d11 = ygVar.d() + ygVar.w();
                if (d11 > i11) {
                    break;
                }
                if (w10 == 5) {
                    long y10 = ygVar.y();
                    if (y10 != 1094921523) {
                        if (y10 != 1161904947) {
                            if (y10 != 1094921524) {
                                if (y10 == 1212503619) {
                                    i12 = 36;
                                }
                                ygVar.g(d11 - ygVar.d());
                            }
                            i12 = 172;
                            ygVar.g(d11 - ygVar.d());
                        }
                        i12 = 135;
                        ygVar.g(d11 - ygVar.d());
                    }
                } else if (w10 != 106) {
                    if (w10 != 122) {
                        if (w10 == 127) {
                            if (ygVar.w() != 21) {
                            }
                            i12 = 172;
                        } else if (w10 == 123) {
                            i12 = 138;
                        } else if (w10 == 10) {
                            str = ygVar.c(3).trim();
                        } else if (w10 == 89) {
                            arrayList = new ArrayList();
                            while (ygVar.d() < d11) {
                                String trim = ygVar.c(3).trim();
                                int w11 = ygVar.w();
                                byte[] bArr = new byte[4];
                                ygVar.a(bArr, 0, 4);
                                arrayList.add(new ep.a(trim, w11, bArr));
                            }
                            i12 = 89;
                        } else if (w10 == 111) {
                            i12 = 257;
                        }
                        ygVar.g(d11 - ygVar.d());
                    }
                    i12 = 135;
                    ygVar.g(d11 - ygVar.d());
                }
                i12 = 129;
                ygVar.g(d11 - ygVar.d());
            }
            ygVar.f(i11);
            return new ep.b(i12, str, arrayList, Arrays.copyOfRange(ygVar.c(), d10, i11));
        }
    }

    public boolean a(j8 j8Var) {
        byte[] c10 = this.f7296d.c();
        j8Var.c(c10, 0, 940);
        int i10 = 0;
        while (i10 < 188) {
            int i11 = 0;
            while (i11 < 5) {
                if (c10[(i11 * 188) + i10] != 71) {
                    i10++;
                } else {
                    i11++;
                }
            }
            j8Var.a(i10);
            return true;
        }
        return false;
    }
}
