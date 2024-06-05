package com.applovin.impl;

import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.applovin.impl.i1;
import com.applovin.impl.ro;
import com.applovin.impl.w6;
import com.google.android.gms.common.api.a;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class h9 implements i8 {
    public static final m8 I = tx.f12454b;
    private static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final d9 K = new d9.b().f("application/x-emsg").a();
    private int A;
    private int B;
    private int C;
    private boolean D;
    private k8 E;
    private ro[] F;
    private ro[] G;
    private boolean H;

    /* renamed from: a  reason: collision with root package name */
    private final int f8250a;

    /* renamed from: b  reason: collision with root package name */
    private final mo f8251b;

    /* renamed from: c  reason: collision with root package name */
    private final List f8252c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray f8253d;

    /* renamed from: e  reason: collision with root package name */
    private final yg f8254e;

    /* renamed from: f  reason: collision with root package name */
    private final yg f8255f;

    /* renamed from: g  reason: collision with root package name */
    private final yg f8256g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f8257h;

    /* renamed from: i  reason: collision with root package name */
    private final yg f8258i;

    /* renamed from: j  reason: collision with root package name */
    private final io f8259j;

    /* renamed from: k  reason: collision with root package name */
    private final w7 f8260k;

    /* renamed from: l  reason: collision with root package name */
    private final yg f8261l;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayDeque f8262m;

    /* renamed from: n  reason: collision with root package name */
    private final ArrayDeque f8263n;

    /* renamed from: o  reason: collision with root package name */
    private final ro f8264o;

    /* renamed from: p  reason: collision with root package name */
    private int f8265p;

    /* renamed from: q  reason: collision with root package name */
    private int f8266q;

    /* renamed from: r  reason: collision with root package name */
    private long f8267r;

    /* renamed from: s  reason: collision with root package name */
    private int f8268s;

    /* renamed from: t  reason: collision with root package name */
    private yg f8269t;

    /* renamed from: u  reason: collision with root package name */
    private long f8270u;

    /* renamed from: v  reason: collision with root package name */
    private int f8271v;

    /* renamed from: w  reason: collision with root package name */
    private long f8272w;

    /* renamed from: x  reason: collision with root package name */
    private long f8273x;

    /* renamed from: y  reason: collision with root package name */
    private long f8274y;

    /* renamed from: z  reason: collision with root package name */
    private b f8275z;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f8276a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8277b;

        public a(long j10, int i10) {
            this.f8276a = j10;
            this.f8277b = i10;
        }
    }

    public h9() {
        this(0);
    }

    private static int a(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw ah.a("Unexpected negative value: " + i10, (Throwable) null);
    }

    private void b() {
        this.f8265p = 0;
        this.f8268s = 0;
    }

    private static boolean b(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private void c() {
        int i10;
        ro[] roVarArr = new ro[2];
        this.F = roVarArr;
        ro roVar = this.f8264o;
        int i11 = 0;
        if (roVar != null) {
            roVarArr[0] = roVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f8250a & 4) != 0) {
            roVarArr[i10] = this.E.a(100, 5);
            i10++;
            i12 = 101;
        }
        ro[] roVarArr2 = (ro[]) yp.a((Object[]) this.F, i10);
        this.F = roVarArr2;
        for (ro a10 : roVarArr2) {
            a10.a(K);
        }
        this.G = new ro[this.f8252c.size()];
        while (i11 < this.G.length) {
            ro a11 = this.E.a(i12, 3);
            a11.a((d9) this.f8252c.get(i11));
            this.G[i11] = a11;
            i11++;
            i12++;
        }
    }

    private static boolean c(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    private static Pair d(yg ygVar) {
        ygVar.f(12);
        return Pair.create(Integer.valueOf(ygVar.j()), new j6(ygVar.j() - 1, ygVar.j(), ygVar.j(), ygVar.j()));
    }

    private boolean e(j8 j8Var) {
        int i10;
        j8 j8Var2 = j8Var;
        b bVar = this.f8275z;
        Throwable th = null;
        if (bVar == null) {
            bVar = a(this.f8253d);
            if (bVar == null) {
                int f10 = (int) (this.f8270u - j8Var.f());
                if (f10 >= 0) {
                    j8Var2.a(f10);
                    b();
                    return false;
                }
                throw ah.a("Offset to end of mdat was negative.", (Throwable) null);
            }
            int b10 = (int) (bVar.b() - j8Var.f());
            if (b10 < 0) {
                kc.d("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                b10 = 0;
            }
            j8Var2.a(b10);
            this.f8275z = bVar;
        }
        int i11 = 4;
        int i12 = 1;
        if (this.f8265p == 3) {
            int d10 = bVar.d();
            this.A = d10;
            if (bVar.f8283f < bVar.f8286i) {
                j8Var2.a(d10);
                bVar.h();
                if (!bVar.f()) {
                    this.f8275z = null;
                }
                this.f8265p = 3;
                return true;
            }
            if (bVar.f8281d.f12158a.f9815g == 1) {
                this.A = d10 - 8;
                j8Var2.a(8);
            }
            if ("audio/ac4".equals(bVar.f8281d.f12158a.f9814f.f7153m)) {
                this.B = bVar.a(this.A, 7);
                n.a(this.A, this.f8258i);
                bVar.f8278a.a(this.f8258i, 7);
                this.B += 7;
            } else {
                this.B = bVar.a(this.A, 0);
            }
            this.A += this.B;
            this.f8265p = 4;
            this.C = 0;
        }
        mo moVar = bVar.f8281d.f12158a;
        ro roVar = bVar.f8278a;
        long c10 = bVar.c();
        io ioVar = this.f8259j;
        if (ioVar != null) {
            c10 = ioVar.a(c10);
        }
        long j10 = c10;
        if (moVar.f9818j == 0) {
            while (true) {
                int i13 = this.B;
                int i14 = this.A;
                if (i13 >= i14) {
                    break;
                }
                this.B += roVar.a((e5) j8Var2, i14 - i13, false);
            }
        } else {
            byte[] c11 = this.f8255f.c();
            c11[0] = 0;
            c11[1] = 0;
            c11[2] = 0;
            int i15 = moVar.f9818j;
            int i16 = i15 + 1;
            int i17 = 4 - i15;
            while (this.B < this.A) {
                int i18 = this.C;
                if (i18 == 0) {
                    j8Var2.d(c11, i17, i16);
                    this.f8255f.f(0);
                    int j11 = this.f8255f.j();
                    if (j11 >= i12) {
                        this.C = j11 - 1;
                        this.f8254e.f(0);
                        roVar.a(this.f8254e, i11);
                        roVar.a(this.f8255f, i12);
                        this.D = this.G.length > 0 && uf.a(moVar.f9814f.f7153m, c11[i11]);
                        this.B += 5;
                        this.A += i17;
                    } else {
                        throw ah.a("Invalid NAL length", th);
                    }
                } else {
                    if (this.D) {
                        this.f8256g.d(i18);
                        j8Var2.d(this.f8256g.c(), 0, this.C);
                        roVar.a(this.f8256g, this.C);
                        i10 = this.C;
                        int c12 = uf.c(this.f8256g.c(), this.f8256g.e());
                        this.f8256g.f(MimeTypes.VIDEO_H265.equals(moVar.f9814f.f7153m) ? 1 : 0);
                        this.f8256g.e(c12);
                        a3.a(j10, this.f8256g, this.G);
                    } else {
                        i10 = roVar.a((e5) j8Var2, i18, false);
                    }
                    this.B += i10;
                    this.C -= i10;
                    th = null;
                    i11 = 4;
                    i12 = 1;
                }
            }
        }
        int a10 = bVar.a();
        no e10 = bVar.e();
        roVar.a(j10, a10, this.A, 0, e10 != null ? e10.f10009c : null);
        a(j10);
        if (!bVar.f()) {
            this.f8275z = null;
        }
        this.f8265p = 3;
        return true;
    }

    /* access modifiers changed from: protected */
    public mo a(mo moVar) {
        return moVar;
    }

    public void a() {
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ro f8278a;

        /* renamed from: b  reason: collision with root package name */
        public final oo f8279b = new oo();

        /* renamed from: c  reason: collision with root package name */
        public final yg f8280c = new yg();

        /* renamed from: d  reason: collision with root package name */
        public so f8281d;

        /* renamed from: e  reason: collision with root package name */
        public j6 f8282e;

        /* renamed from: f  reason: collision with root package name */
        public int f8283f;

        /* renamed from: g  reason: collision with root package name */
        public int f8284g;

        /* renamed from: h  reason: collision with root package name */
        public int f8285h;

        /* renamed from: i  reason: collision with root package name */
        public int f8286i;

        /* renamed from: j  reason: collision with root package name */
        private final yg f8287j = new yg(1);

        /* renamed from: k  reason: collision with root package name */
        private final yg f8288k = new yg();
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public boolean f8289l;

        public b(ro roVar, so soVar, j6 j6Var) {
            this.f8278a = roVar;
            this.f8281d = soVar;
            this.f8282e = j6Var;
            a(soVar, j6Var);
        }

        public long b() {
            if (!this.f8289l) {
                return this.f8281d.f12160c[this.f8283f];
            }
            return this.f8279b.f10505g[this.f8285h];
        }

        public long c() {
            if (!this.f8289l) {
                return this.f8281d.f12163f[this.f8283f];
            }
            return this.f8279b.a(this.f8283f);
        }

        public int d() {
            if (!this.f8289l) {
                return this.f8281d.f12161d[this.f8283f];
            }
            return this.f8279b.f10507i[this.f8283f];
        }

        public no e() {
            if (!this.f8289l) {
                return null;
            }
            int i10 = ((j6) yp.a((Object) this.f8279b.f10499a)).f8697a;
            no noVar = this.f8279b.f10513o;
            if (noVar == null) {
                noVar = this.f8281d.f12158a.a(i10);
            }
            if (noVar == null || !noVar.f10007a) {
                return null;
            }
            return noVar;
        }

        public boolean f() {
            this.f8283f++;
            if (!this.f8289l) {
                return false;
            }
            int i10 = this.f8284g + 1;
            this.f8284g = i10;
            int[] iArr = this.f8279b.f10506h;
            int i11 = this.f8285h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f8285h = i11 + 1;
            this.f8284g = 0;
            return false;
        }

        public void g() {
            this.f8279b.a();
            this.f8283f = 0;
            this.f8285h = 0;
            this.f8284g = 0;
            this.f8286i = 0;
            this.f8289l = false;
        }

        public void h() {
            no e10 = e();
            if (e10 != null) {
                yg ygVar = this.f8279b.f10514p;
                int i10 = e10.f10010d;
                if (i10 != 0) {
                    ygVar.g(i10);
                }
                if (this.f8279b.c(this.f8283f)) {
                    ygVar.g(ygVar.C() * 6);
                }
            }
        }

        public int a() {
            int i10;
            if (!this.f8289l) {
                i10 = this.f8281d.f12164g[this.f8283f];
            } else {
                i10 = this.f8279b.f10510l[this.f8283f] ? 1 : 0;
            }
            return e() != null ? i10 | 1073741824 : i10;
        }

        public int a(int i10, int i11) {
            yg ygVar;
            no e10 = e();
            if (e10 == null) {
                return 0;
            }
            int i12 = e10.f10010d;
            if (i12 != 0) {
                ygVar = this.f8279b.f10514p;
            } else {
                byte[] bArr = (byte[]) yp.a((Object) e10.f10011e);
                this.f8288k.a(bArr, bArr.length);
                yg ygVar2 = this.f8288k;
                i12 = bArr.length;
                ygVar = ygVar2;
            }
            boolean c10 = this.f8279b.c(this.f8283f);
            boolean z10 = c10 || i11 != 0;
            this.f8287j.c()[0] = (byte) ((z10 ? 128 : 0) | i12);
            this.f8287j.f(0);
            this.f8278a.a(this.f8287j, 1, 1);
            this.f8278a.a(ygVar, i12, 1);
            if (!z10) {
                return i12 + 1;
            }
            if (!c10) {
                this.f8280c.d(8);
                byte[] c11 = this.f8280c.c();
                c11[0] = 0;
                c11[1] = 1;
                c11[2] = (byte) ((i11 >> 8) & 255);
                c11[3] = (byte) (i11 & 255);
                c11[4] = (byte) ((i10 >> 24) & 255);
                c11[5] = (byte) ((i10 >> 16) & 255);
                c11[6] = (byte) ((i10 >> 8) & 255);
                c11[7] = (byte) (i10 & 255);
                this.f8278a.a(this.f8280c, 8, 1);
                return i12 + 9;
            }
            yg ygVar3 = this.f8279b.f10514p;
            int C = ygVar3.C();
            ygVar3.g(-2);
            int i13 = (C * 6) + 2;
            if (i11 != 0) {
                this.f8280c.d(i13);
                byte[] c12 = this.f8280c.c();
                ygVar3.a(c12, 0, i13);
                int i14 = (((c12[2] & 255) << 8) | (c12[3] & 255)) + i11;
                c12[2] = (byte) ((i14 >> 8) & 255);
                c12[3] = (byte) (i14 & 255);
                ygVar3 = this.f8280c;
            }
            this.f8278a.a(ygVar3, i13, 1);
            return i12 + 1 + i13;
        }

        public void a(so soVar, j6 j6Var) {
            this.f8281d = soVar;
            this.f8282e = j6Var;
            this.f8278a.a(soVar.f12158a.f9814f);
            g();
        }

        public void a(long j10) {
            int i10 = this.f8283f;
            while (true) {
                oo ooVar = this.f8279b;
                if (i10 < ooVar.f10504f && ooVar.a(i10) < j10) {
                    if (this.f8279b.f10510l[i10]) {
                        this.f8286i = i10;
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }

        public void a(w6 w6Var) {
            no a10 = this.f8281d.f12158a.a(((j6) yp.a((Object) this.f8279b.f10499a)).f8697a);
            this.f8278a.a(this.f8281d.f12158a.f9814f.a().a(w6Var.a(a10 != null ? a10.f10008b : null)).a());
        }
    }

    public h9(int i10) {
        this(i10, (io) null);
    }

    private j6 a(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (j6) sparseArray.valueAt(0);
        }
        return (j6) a1.a((Object) (j6) sparseArray.get(i10));
    }

    public h9(int i10, io ioVar) {
        this(i10, ioVar, (mo) null, Collections.emptyList());
    }

    private void b(i1.a aVar) {
        a(aVar, this.f8253d, this.f8251b != null, this.f8250a, this.f8257h);
        w6 a10 = a(aVar.f8405c);
        if (a10 != null) {
            int size = this.f8253d.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f8253d.valueAt(i10)).a(a10);
            }
        }
        if (this.f8272w != -9223372036854775807L) {
            int size2 = this.f8253d.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((b) this.f8253d.valueAt(i11)).a(this.f8272w);
            }
            this.f8272w = -9223372036854775807L;
        }
    }

    public h9(int i10, io ioVar, mo moVar, List list) {
        this(i10, ioVar, moVar, list, (ro) null);
    }

    public h9(int i10, io ioVar, mo moVar, List list, ro roVar) {
        this.f8250a = i10;
        this.f8259j = ioVar;
        this.f8251b = moVar;
        this.f8252c = Collections.unmodifiableList(list);
        this.f8264o = roVar;
        this.f8260k = new w7();
        this.f8261l = new yg(16);
        this.f8254e = new yg(uf.f12561a);
        this.f8255f = new yg(5);
        this.f8256g = new yg();
        byte[] bArr = new byte[16];
        this.f8257h = bArr;
        this.f8258i = new yg(bArr);
        this.f8262m = new ArrayDeque();
        this.f8263n = new ArrayDeque();
        this.f8253d = new SparseArray();
        this.f8273x = -9223372036854775807L;
        this.f8272w = -9223372036854775807L;
        this.f8274y = -9223372036854775807L;
        this.E = k8.f8929e;
        this.F = new ro[0];
        this.G = new ro[0];
    }

    private static w6 a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            i1.b bVar = (i1.b) list.get(i10);
            if (bVar.f8403a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] c10 = bVar.f8407b.c();
                UUID c11 = fi.c(c10);
                if (c11 == null) {
                    kc.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new w6.b(c11, "video/mp4", c10));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new w6((List) arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.applovin.impl.h9$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(com.applovin.impl.j8 r10) {
        /*
            r9 = this;
            android.util.SparseArray r0 = r9.f8253d
            int r0 = r0.size()
            r1 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r5 = r1
        L_0x000e:
            if (r4 >= r0) goto L_0x0031
            android.util.SparseArray r6 = r9.f8253d
            java.lang.Object r6 = r6.valueAt(r4)
            com.applovin.impl.h9$b r6 = (com.applovin.impl.h9.b) r6
            com.applovin.impl.oo r6 = r6.f8279b
            boolean r7 = r6.f10515q
            if (r7 == 0) goto L_0x002e
            long r6 = r6.f10502d
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x002e
            android.util.SparseArray r2 = r9.f8253d
            java.lang.Object r2 = r2.valueAt(r4)
            r5 = r2
            com.applovin.impl.h9$b r5 = (com.applovin.impl.h9.b) r5
            r2 = r6
        L_0x002e:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0031:
            if (r5 != 0) goto L_0x0037
            r10 = 3
            r9.f8265p = r10
            return
        L_0x0037:
            long r6 = r10.f()
            long r2 = r2 - r6
            int r0 = (int) r2
            if (r0 < 0) goto L_0x0048
            r10.a(r0)
            com.applovin.impl.oo r0 = r5.f8279b
            r0.a((com.applovin.impl.j8) r10)
            return
        L_0x0048:
            java.lang.String r10 = "Offset to encryption data was negative."
            com.applovin.impl.ah r10 = com.applovin.impl.ah.a(r10, r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.h9.d(com.applovin.impl.j8):void");
    }

    private static long b(yg ygVar) {
        ygVar.f(8);
        return i1.c(ygVar.j()) == 0 ? ygVar.y() : ygVar.B();
    }

    private static b a(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) sparseArray.valueAt(i10);
            if ((bVar2.f8289l || bVar2.f8283f != bVar2.f8281d.f12159b) && (!bVar2.f8289l || bVar2.f8285h != bVar2.f8279b.f10503e)) {
                long b10 = bVar2.b();
                if (b10 < j10) {
                    bVar = bVar2;
                    j10 = b10;
                }
            }
        }
        return bVar;
    }

    private void c(i1.a aVar) {
        boolean z10 = true;
        int i10 = 0;
        a1.b(this.f8251b == null, "Unexpected moov box.");
        w6 a10 = a(aVar.f8405c);
        i1.a aVar2 = (i1.a) a1.a((Object) aVar.d(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.f8405c.size();
        long j10 = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            i1.b bVar = (i1.b) aVar2.f8405c.get(i11);
            int i12 = bVar.f8403a;
            if (i12 == 1953654136) {
                Pair d10 = d(bVar.f8407b);
                sparseArray.put(((Integer) d10.first).intValue(), (j6) d10.second);
            } else if (i12 == 1835362404) {
                j10 = b(bVar.f8407b);
            }
        }
        List a11 = j1.a(aVar, new x9(), j10, a10, (this.f8250a & 16) != 0, false, (Function) new sx(this));
        int size2 = a11.size();
        if (this.f8253d.size() == 0) {
            while (i10 < size2) {
                so soVar = (so) a11.get(i10);
                mo moVar = soVar.f12158a;
                this.f8253d.put(moVar.f9809a, new b(this.E.a(i10, moVar.f9810b), soVar, a(sparseArray, moVar.f9809a)));
                this.f8273x = Math.max(this.f8273x, moVar.f9813e);
                i10++;
            }
            this.E.c();
            return;
        }
        if (this.f8253d.size() != size2) {
            z10 = false;
        }
        a1.b(z10);
        while (i10 < size2) {
            so soVar2 = (so) a11.get(i10);
            mo moVar2 = soVar2.f12158a;
            ((b) this.f8253d.get(moVar2.f9809a)).a(soVar2, a(sparseArray, moVar2.f9809a));
            i10++;
        }
    }

    private static void b(yg ygVar, oo ooVar) {
        a(ygVar, 0, ooVar);
    }

    private static void b(i1.a aVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) {
        b a10 = a(((i1.b) a1.a((Object) aVar.e(1952868452))).f8407b, sparseArray, z10);
        if (a10 != null) {
            oo ooVar = a10.f8279b;
            long j10 = ooVar.f10516r;
            boolean z11 = ooVar.f10517s;
            a10.g();
            boolean unused = a10.f8289l = true;
            i1.b e10 = aVar.e(1952867444);
            if (e10 == null || (i10 & 2) != 0) {
                ooVar.f10516r = j10;
                ooVar.f10517s = z11;
            } else {
                ooVar.f10516r = c(e10.f8407b);
                ooVar.f10517s = true;
            }
            a(aVar, a10, i10);
            no a11 = a10.f8281d.f12158a.a(((j6) a1.a((Object) ooVar.f10499a)).f8697a);
            i1.b e11 = aVar.e(1935763834);
            if (e11 != null) {
                a((no) a1.a((Object) a11), e11.f8407b, ooVar);
            }
            i1.b e12 = aVar.e(1935763823);
            if (e12 != null) {
                a(e12.f8407b, ooVar);
            }
            i1.b e13 = aVar.e(1936027235);
            if (e13 != null) {
                b(e13.f8407b, ooVar);
            }
            a(aVar, a11 != null ? a11.f10008b : null, ooVar);
            int size = aVar.f8405c.size();
            for (int i11 = 0; i11 < size; i11++) {
                i1.b bVar = (i1.b) aVar.f8405c.get(i11);
                if (bVar.f8403a == 1970628964) {
                    a(bVar.f8407b, ooVar, bArr);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i8[] d() {
        return new i8[]{new h9()};
    }

    public void a(k8 k8Var) {
        this.E = k8Var;
        b();
        c();
        mo moVar = this.f8251b;
        if (moVar != null) {
            this.f8253d.put(0, new b(k8Var.a(0, moVar.f9810b), new so(this.f8251b, new long[0], new int[0], 0, new long[0], new int[0], 0), new j6(0, 0, 0, 0)));
            this.E.c();
        }
    }

    private void a(i1.a aVar) {
        int i10 = aVar.f8403a;
        if (i10 == 1836019574) {
            c(aVar);
        } else if (i10 == 1836019558) {
            b(aVar);
        } else if (!this.f8262m.isEmpty()) {
            ((i1.a) this.f8262m.peek()).a(aVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.applovin.impl.yg r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            com.applovin.impl.ro[] r2 = r0.F
            int r2 = r2.length
            if (r2 != 0) goto L_0x000a
            return
        L_0x000a:
            r2 = 8
            r1.f(r2)
            int r2 = r27.j()
            int r2 = com.applovin.impl.i1.c(r2)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0074
            r5 = 1
            if (r2 == r5) goto L_0x0038
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentedMp4Extractor"
            com.applovin.impl.kc.d(r2, r1)
            return
        L_0x0038:
            long r11 = r27.y()
            long r5 = r27.B()
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r9 = r11
            long r13 = com.applovin.impl.yp.c(r5, r7, r9)
            long r5 = r27.y()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = com.applovin.impl.yp.c(r5, r7, r9)
            long r7 = r27.y()
            java.lang.String r2 = r27.t()
            java.lang.Object r2 = com.applovin.impl.a1.a((java.lang.Object) r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r9 = r27.t()
            java.lang.Object r9 = com.applovin.impl.a1.a((java.lang.Object) r9)
            java.lang.String r9 = (java.lang.String) r9
            r19 = r2
            r21 = r5
            r23 = r7
            r20 = r9
            r7 = r3
            goto L_0x00be
        L_0x0074:
            java.lang.String r2 = r27.t()
            java.lang.Object r2 = com.applovin.impl.a1.a((java.lang.Object) r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = r27.t()
            java.lang.Object r5 = com.applovin.impl.a1.a((java.lang.Object) r5)
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            long r5 = r27.y()
            long r10 = r27.y()
            r12 = 1000000(0xf4240, double:4.940656E-318)
            r14 = r5
            long r7 = com.applovin.impl.yp.c(r10, r12, r14)
            long r10 = r0.f8274y
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x00a3
            long r10 = r10 + r7
            r16 = r10
            goto L_0x00a5
        L_0x00a3:
            r16 = r3
        L_0x00a5:
            long r10 = r27.y()
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = r5
            long r5 = com.applovin.impl.yp.c(r10, r12, r14)
            long r10 = r27.y()
            r19 = r2
            r21 = r5
            r20 = r9
            r23 = r10
            r13 = r16
        L_0x00be:
            int r2 = r27.a()
            byte[] r2 = new byte[r2]
            int r5 = r27.a()
            r6 = 0
            r1.a(r2, r6, r5)
            com.applovin.impl.u7 r1 = new com.applovin.impl.u7
            r18 = r1
            r25 = r2
            r18.<init>(r19, r20, r21, r23, r25)
            com.applovin.impl.yg r2 = new com.applovin.impl.yg
            com.applovin.impl.w7 r5 = r0.f8260k
            byte[] r1 = r5.a(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.a()
            com.applovin.impl.ro[] r5 = r0.F
            int r9 = r5.length
            r10 = 0
        L_0x00e8:
            if (r10 >= r9) goto L_0x00f5
            r11 = r5[r10]
            r2.f(r6)
            r11.a(r2, r1)
            int r10 = r10 + 1
            goto L_0x00e8
        L_0x00f5:
            int r2 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0109
            java.util.ArrayDeque r2 = r0.f8263n
            com.applovin.impl.h9$a r3 = new com.applovin.impl.h9$a
            r3.<init>(r7, r1)
            r2.addLast(r3)
            int r2 = r0.f8271v
            int r2 = r2 + r1
            r0.f8271v = r2
            goto L_0x0128
        L_0x0109:
            com.applovin.impl.io r2 = r0.f8259j
            if (r2 == 0) goto L_0x0111
            long r13 = r2.a(r13)
        L_0x0111:
            com.applovin.impl.ro[] r2 = r0.F
            int r3 = r2.length
        L_0x0114:
            if (r6 >= r3) goto L_0x0128
            r15 = r2[r6]
            r18 = 1
            r20 = 0
            r21 = 0
            r16 = r13
            r19 = r1
            r15.a(r16, r18, r19, r20, r21)
            int r6 = r6 + 1
            goto L_0x0114
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.h9.a(com.applovin.impl.yg):void");
    }

    private static long c(yg ygVar) {
        ygVar.f(8);
        return i1.c(ygVar.j()) == 1 ? ygVar.B() : ygVar.y();
    }

    private void b(long j10) {
        while (!this.f8262m.isEmpty() && ((i1.a) this.f8262m.peek()).f8404b == j10) {
            a((i1.a) this.f8262m.pop());
        }
        b();
    }

    private boolean b(j8 j8Var) {
        if (this.f8268s == 0) {
            if (!j8Var.a(this.f8261l.c(), 0, 8, true)) {
                return false;
            }
            this.f8268s = 8;
            this.f8261l.f(0);
            this.f8267r = this.f8261l.y();
            this.f8266q = this.f8261l.j();
        }
        long j10 = this.f8267r;
        if (j10 == 1) {
            j8Var.d(this.f8261l.c(), 8, 8);
            this.f8268s += 8;
            this.f8267r = this.f8261l.B();
        } else if (j10 == 0) {
            long a10 = j8Var.a();
            if (a10 == -1 && !this.f8262m.isEmpty()) {
                a10 = ((i1.a) this.f8262m.peek()).f8404b;
            }
            if (a10 != -1) {
                this.f8267r = (a10 - j8Var.f()) + ((long) this.f8268s);
            }
        }
        if (this.f8267r >= ((long) this.f8268s)) {
            long f10 = j8Var.f() - ((long) this.f8268s);
            int i10 = this.f8266q;
            if ((i10 == 1836019558 || i10 == 1835295092) && !this.H) {
                this.E.a(new ej.b(this.f8273x, f10));
                this.H = true;
            }
            if (this.f8266q == 1836019558) {
                int size = this.f8253d.size();
                for (int i11 = 0; i11 < size; i11++) {
                    oo ooVar = ((b) this.f8253d.valueAt(i11)).f8279b;
                    ooVar.f10500b = f10;
                    ooVar.f10502d = f10;
                    ooVar.f10501c = f10;
                }
            }
            int i12 = this.f8266q;
            if (i12 == 1835295092) {
                this.f8275z = null;
                this.f8270u = f10 + this.f8267r;
                this.f8265p = 2;
                return true;
            }
            if (b(i12)) {
                long f11 = (j8Var.f() + this.f8267r) - 8;
                this.f8262m.push(new i1.a(this.f8266q, f11));
                if (this.f8267r == ((long) this.f8268s)) {
                    b(f11);
                } else {
                    b();
                }
            } else if (c(this.f8266q)) {
                if (this.f8268s == 8) {
                    long j11 = this.f8267r;
                    if (j11 <= 2147483647L) {
                        yg ygVar = new yg((int) j11);
                        System.arraycopy(this.f8261l.c(), 0, ygVar.c(), 0, 8);
                        this.f8269t = ygVar;
                        this.f8265p = 1;
                    } else {
                        throw ah.a("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw ah.a("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f8267r <= 2147483647L) {
                this.f8269t = null;
                this.f8265p = 1;
            } else {
                throw ah.a("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw ah.a("Atom size less than header length (unsupported).");
    }

    private void c(j8 j8Var) {
        int i10 = ((int) this.f8267r) - this.f8268s;
        yg ygVar = this.f8269t;
        if (ygVar != null) {
            j8Var.d(ygVar.c(), 8, i10);
            a(new i1.b(this.f8266q, ygVar), j8Var.f());
        } else {
            j8Var.a(i10);
        }
        b(j8Var.f());
    }

    private void a(i1.b bVar, long j10) {
        if (!this.f8262m.isEmpty()) {
            ((i1.a) this.f8262m.peek()).a(bVar);
            return;
        }
        int i10 = bVar.f8403a;
        if (i10 == 1936286840) {
            Pair a10 = a(bVar.f8407b, j10);
            this.f8274y = ((Long) a10.first).longValue();
            this.E.a((ej) a10.second);
            this.H = true;
        } else if (i10 == 1701671783) {
            a(bVar.f8407b);
        }
    }

    private void a(long j10) {
        while (!this.f8263n.isEmpty()) {
            a aVar = (a) this.f8263n.removeFirst();
            this.f8271v -= aVar.f8277b;
            long j11 = aVar.f8276a + j10;
            io ioVar = this.f8259j;
            if (ioVar != null) {
                j11 = ioVar.a(j11);
            }
            for (ro a10 : this.F) {
                a10.a(j11, 1, aVar.f8277b, this.f8271v, (ro.a) null);
            }
        }
    }

    private static void a(i1.a aVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) {
        int size = aVar.f8406d.size();
        for (int i11 = 0; i11 < size; i11++) {
            i1.a aVar2 = (i1.a) aVar.f8406d.get(i11);
            if (aVar2.f8403a == 1953653094) {
                b(aVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void a(yg ygVar, oo ooVar) {
        ygVar.f(8);
        int j10 = ygVar.j();
        if ((i1.b(j10) & 1) == 1) {
            ygVar.g(8);
        }
        int A2 = ygVar.A();
        if (A2 == 1) {
            ooVar.f10502d += i1.c(j10) == 0 ? ygVar.y() : ygVar.B();
            return;
        }
        throw ah.a("Unexpected saio entry count: " + A2, (Throwable) null);
    }

    private static void a(no noVar, yg ygVar, oo ooVar) {
        int i10;
        int i11 = noVar.f10010d;
        ygVar.f(8);
        boolean z10 = true;
        if ((i1.b(ygVar.j()) & 1) == 1) {
            ygVar.g(8);
        }
        int w10 = ygVar.w();
        int A2 = ygVar.A();
        if (A2 <= ooVar.f10504f) {
            if (w10 == 0) {
                boolean[] zArr = ooVar.f10512n;
                i10 = 0;
                for (int i12 = 0; i12 < A2; i12++) {
                    int w11 = ygVar.w();
                    i10 += w11;
                    zArr[i12] = w11 > i11;
                }
            } else {
                if (w10 <= i11) {
                    z10 = false;
                }
                i10 = w10 * A2;
                Arrays.fill(ooVar.f10512n, 0, A2, z10);
            }
            Arrays.fill(ooVar.f10512n, A2, ooVar.f10504f, false);
            if (i10 > 0) {
                ooVar.b(i10);
                return;
            }
            return;
        }
        throw ah.a("Saiz sample count " + A2 + " is greater than fragment sample count" + ooVar.f10504f, (Throwable) null);
    }

    private static void a(i1.a aVar, String str, oo ooVar) {
        i1.a aVar2 = aVar;
        oo ooVar2 = ooVar;
        byte[] bArr = null;
        yg ygVar = null;
        yg ygVar2 = null;
        for (int i10 = 0; i10 < aVar2.f8405c.size(); i10++) {
            i1.b bVar = (i1.b) aVar2.f8405c.get(i10);
            yg ygVar3 = bVar.f8407b;
            int i11 = bVar.f8403a;
            if (i11 == 1935828848) {
                ygVar3.f(12);
                if (ygVar3.j() == 1936025959) {
                    ygVar = ygVar3;
                }
            } else if (i11 == 1936158820) {
                ygVar3.f(12);
                if (ygVar3.j() == 1936025959) {
                    ygVar2 = ygVar3;
                }
            }
        }
        if (ygVar != null && ygVar2 != null) {
            ygVar.f(8);
            int c10 = i1.c(ygVar.j());
            ygVar.g(4);
            if (c10 == 1) {
                ygVar.g(4);
            }
            if (ygVar.j() == 1) {
                ygVar2.f(8);
                int c11 = i1.c(ygVar2.j());
                ygVar2.g(4);
                if (c11 == 1) {
                    if (ygVar2.y() == 0) {
                        throw ah.a("Variable length description in sgpd found (unsupported)");
                    }
                } else if (c11 >= 2) {
                    ygVar2.g(4);
                }
                if (ygVar2.y() == 1) {
                    ygVar2.g(1);
                    int w10 = ygVar2.w();
                    int i12 = (w10 & 240) >> 4;
                    int i13 = w10 & 15;
                    boolean z10 = ygVar2.w() == 1;
                    if (z10) {
                        int w11 = ygVar2.w();
                        byte[] bArr2 = new byte[16];
                        ygVar2.a(bArr2, 0, 16);
                        if (w11 == 0) {
                            int w12 = ygVar2.w();
                            bArr = new byte[w12];
                            ygVar2.a(bArr, 0, w12);
                        }
                        ooVar2.f10511m = true;
                        ooVar2.f10513o = new no(z10, str, w11, bArr2, i12, i13, bArr);
                        return;
                    }
                    return;
                }
                throw ah.a("Entry count in sgpd != 1 (unsupported).");
            }
            throw ah.a("Entry count in sbgp != 1 (unsupported).");
        }
    }

    private static void a(yg ygVar, int i10, oo ooVar) {
        ygVar.f(i10 + 8);
        int b10 = i1.b(ygVar.j());
        if ((b10 & 1) == 0) {
            boolean z10 = (b10 & 2) != 0;
            int A2 = ygVar.A();
            if (A2 == 0) {
                Arrays.fill(ooVar.f10512n, 0, ooVar.f10504f, false);
            } else if (A2 == ooVar.f10504f) {
                Arrays.fill(ooVar.f10512n, 0, A2, z10);
                ooVar.b(ygVar.a());
                ooVar.a(ygVar);
            } else {
                throw ah.a("Senc sample count " + A2 + " is different from fragment sample count" + ooVar.f10504f, (Throwable) null);
            }
        } else {
            throw ah.a("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    private static Pair a(yg ygVar, long j10) {
        long j11;
        long j12;
        yg ygVar2 = ygVar;
        ygVar2.f(8);
        int c10 = i1.c(ygVar.j());
        ygVar2.g(4);
        long y10 = ygVar.y();
        if (c10 == 0) {
            j12 = ygVar.y();
            j11 = ygVar.y();
        } else {
            j12 = ygVar.B();
            j11 = ygVar.B();
        }
        long j13 = j12;
        long j14 = j10 + j11;
        long c11 = yp.c(j13, 1000000, y10);
        ygVar2.g(2);
        int C2 = ygVar.C();
        int[] iArr = new int[C2];
        long[] jArr = new long[C2];
        long[] jArr2 = new long[C2];
        long[] jArr3 = new long[C2];
        long j15 = j13;
        long j16 = c11;
        int i10 = 0;
        while (i10 < C2) {
            int j17 = ygVar.j();
            if ((j17 & RecyclerView.UNDEFINED_DURATION) == 0) {
                long y11 = ygVar.y();
                iArr[i10] = j17 & a.e.API_PRIORITY_OTHER;
                jArr[i10] = j14;
                jArr3[i10] = j16;
                long j18 = j15 + y11;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i11 = C2;
                int[] iArr2 = iArr;
                long c12 = yp.c(j18, 1000000, y10);
                jArr4[i10] = c12 - jArr5[i10];
                ygVar2.g(4);
                j14 += (long) iArr2[i10];
                i10++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                C2 = i11;
                long j19 = c12;
                j15 = j18;
                j16 = j19;
            } else {
                throw ah.a("Unhandled indirect reference", (Throwable) null);
            }
        }
        return Pair.create(Long.valueOf(c11), new e3(iArr, jArr, jArr2, jArr3));
    }

    private static b a(yg ygVar, SparseArray sparseArray, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        ygVar.f(8);
        int b10 = i1.b(ygVar.j());
        b bVar = (b) (z10 ? sparseArray.valueAt(0) : sparseArray.get(ygVar.j()));
        if (bVar == null) {
            return null;
        }
        if ((b10 & 1) != 0) {
            long B2 = ygVar.B();
            oo ooVar = bVar.f8279b;
            ooVar.f10501c = B2;
            ooVar.f10502d = B2;
        }
        j6 j6Var = bVar.f8282e;
        if ((b10 & 2) != 0) {
            i10 = ygVar.j() - 1;
        } else {
            i10 = j6Var.f8697a;
        }
        if ((b10 & 8) != 0) {
            i11 = ygVar.j();
        } else {
            i11 = j6Var.f8698b;
        }
        if ((b10 & 16) != 0) {
            i12 = ygVar.j();
        } else {
            i12 = j6Var.f8699c;
        }
        if ((b10 & 32) != 0) {
            i13 = ygVar.j();
        } else {
            i13 = j6Var.f8700d;
        }
        bVar.f8279b.f10499a = new j6(i10, i11, i12, i13);
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(com.applovin.impl.h9.b r36, int r37, int r38, com.applovin.impl.yg r39, int r40) {
        /*
            r0 = r36
            r1 = 8
            r2 = r39
            r2.f(r1)
            int r1 = r39.j()
            int r1 = com.applovin.impl.i1.b(r1)
            com.applovin.impl.so r3 = r0.f8281d
            com.applovin.impl.mo r3 = r3.f12158a
            com.applovin.impl.oo r4 = r0.f8279b
            com.applovin.impl.j6 r5 = r4.f10499a
            java.lang.Object r5 = com.applovin.impl.yp.a((java.lang.Object) r5)
            com.applovin.impl.j6 r5 = (com.applovin.impl.j6) r5
            int[] r6 = r4.f10506h
            int r7 = r39.A()
            r6[r37] = r7
            long[] r6 = r4.f10505g
            long r7 = r4.f10501c
            r6[r37] = r7
            r9 = r1 & 1
            if (r9 == 0) goto L_0x0039
            int r9 = r39.j()
            long r9 = (long) r9
            long r7 = r7 + r9
            r6[r37] = r7
        L_0x0039:
            r6 = r1 & 4
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0041
            r6 = 1
            goto L_0x0042
        L_0x0041:
            r6 = 0
        L_0x0042:
            int r9 = r5.f8700d
            if (r6 == 0) goto L_0x004a
            int r9 = r39.j()
        L_0x004a:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0050
            r10 = 1
            goto L_0x0051
        L_0x0050:
            r10 = 0
        L_0x0051:
            r11 = r1 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0057
            r11 = 1
            goto L_0x0058
        L_0x0057:
            r11 = 0
        L_0x0058:
            r12 = r1 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005e
            r12 = 1
            goto L_0x005f
        L_0x005e:
            r12 = 0
        L_0x005f:
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0065
            r1 = 1
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            long[] r13 = r3.f9816h
            if (r13 == 0) goto L_0x008b
            int r14 = r13.length
            if (r14 != r8) goto L_0x008b
            r14 = r13[r7]
            r16 = 0
            int r13 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x008d
            long[] r13 = r3.f9817i
            java.lang.Object r13 = com.applovin.impl.yp.a((java.lang.Object) r13)
            long[] r13 = (long[]) r13
            r14 = r13[r7]
            long r7 = r3.f9811c
            r16 = 1000000(0xf4240, double:4.940656E-318)
            r18 = r7
            long r14 = com.applovin.impl.yp.c(r14, r16, r18)
            goto L_0x008f
        L_0x008b:
            r16 = 0
        L_0x008d:
            r14 = r16
        L_0x008f:
            int[] r7 = r4.f10507i
            int[] r8 = r4.f10508j
            long[] r13 = r4.f10509k
            boolean[] r2 = r4.f10510l
            r17 = r9
            int r9 = r3.f9810b
            r18 = r2
            r2 = 2
            if (r9 != r2) goto L_0x00a7
            r2 = 1
            r9 = r38 & 1
            if (r9 == 0) goto L_0x00a7
            r2 = 1
            goto L_0x00a8
        L_0x00a7:
            r2 = 0
        L_0x00a8:
            int[] r9 = r4.f10506h
            r9 = r9[r37]
            int r9 = r40 + r9
            r38 = r2
            long r2 = r3.f9811c
            r27 = r14
            r15 = r13
            long r13 = r4.f10516r
            r29 = r13
            r13 = r40
        L_0x00bb:
            if (r13 >= r9) goto L_0x015e
            if (r10 == 0) goto L_0x00c4
            int r14 = r39.j()
            goto L_0x00c6
        L_0x00c4:
            int r14 = r5.f8698b
        L_0x00c6:
            int r14 = a((int) r14)
            if (r11 == 0) goto L_0x00d7
            int r19 = r39.j()
            r35 = r19
            r19 = r10
            r10 = r35
            goto L_0x00db
        L_0x00d7:
            r19 = r10
            int r10 = r5.f8699c
        L_0x00db:
            int r10 = a((int) r10)
            if (r12 == 0) goto L_0x00ea
            int r21 = r39.j()
            r31 = r6
            r6 = r21
            goto L_0x00f7
        L_0x00ea:
            if (r13 != 0) goto L_0x00f3
            if (r6 == 0) goto L_0x00f3
            r31 = r6
            r6 = r17
            goto L_0x00f7
        L_0x00f3:
            r31 = r6
            int r6 = r5.f8700d
        L_0x00f7:
            if (r1 == 0) goto L_0x0110
            r32 = r1
            int r1 = r39.j()
            r33 = r11
            r34 = r12
            long r11 = (long) r1
            r21 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r11 * r21
            long r11 = r11 / r2
            int r1 = (int) r11
            r8[r13] = r1
            r16 = 0
            goto L_0x011a
        L_0x0110:
            r32 = r1
            r33 = r11
            r34 = r12
            r16 = 0
            r8[r13] = r16
        L_0x011a:
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r29
            r25 = r2
            long r11 = com.applovin.impl.yp.c(r21, r23, r25)
            long r11 = r11 - r27
            r15[r13] = r11
            boolean r1 = r4.f10517s
            if (r1 != 0) goto L_0x0134
            com.applovin.impl.so r1 = r0.f8281d
            long r0 = r1.f12165h
            long r11 = r11 + r0
            r15[r13] = r11
        L_0x0134:
            r7[r13] = r10
            int r0 = r6 >> 16
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0142
            if (r38 == 0) goto L_0x0140
            if (r13 != 0) goto L_0x0142
        L_0x0140:
            r0 = 1
            goto L_0x0143
        L_0x0142:
            r0 = 0
        L_0x0143:
            r18[r13] = r0
            long r10 = (long) r14
            r20 = r2
            r1 = r29
            long r29 = r1 + r10
            int r13 = r13 + 1
            r0 = r36
            r10 = r19
            r2 = r20
            r6 = r31
            r1 = r32
            r11 = r33
            r12 = r34
            goto L_0x00bb
        L_0x015e:
            r1 = r29
            r4.f10516r = r1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.h9.a(com.applovin.impl.h9$b, int, int, com.applovin.impl.yg, int):int");
    }

    private static void a(i1.a aVar, b bVar, int i10) {
        List list = aVar.f8405c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i1.b bVar2 = (i1.b) list.get(i13);
            if (bVar2.f8403a == 1953658222) {
                yg ygVar = bVar2.f8407b;
                ygVar.f(12);
                int A2 = ygVar.A();
                if (A2 > 0) {
                    i12 += A2;
                    i11++;
                }
            }
        }
        bVar.f8285h = 0;
        bVar.f8284g = 0;
        bVar.f8283f = 0;
        bVar.f8279b.a(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            i1.b bVar3 = (i1.b) list.get(i16);
            if (bVar3.f8403a == 1953658222) {
                i15 = a(bVar, i14, i10, bVar3.f8407b, i15);
                i14++;
            }
        }
    }

    private static void a(yg ygVar, oo ooVar, byte[] bArr) {
        ygVar.f(8);
        ygVar.a(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            a(ygVar, 16, ooVar);
        }
    }

    public int a(j8 j8Var, qh qhVar) {
        while (true) {
            int i10 = this.f8265p;
            if (i10 != 0) {
                if (i10 == 1) {
                    c(j8Var);
                } else if (i10 == 2) {
                    d(j8Var);
                } else if (e(j8Var)) {
                    return 0;
                }
            } else if (!b(j8Var)) {
                return -1;
            }
        }
    }

    public void a(long j10, long j11) {
        int size = this.f8253d.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) this.f8253d.valueAt(i10)).g();
        }
        this.f8263n.clear();
        this.f8271v = 0;
        this.f8272w = j11;
        this.f8262m.clear();
        b();
    }

    public boolean a(j8 j8Var) {
        return ik.a(j8Var);
    }
}
