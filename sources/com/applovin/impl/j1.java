package com.applovin.impl;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.impl.d9;
import com.applovin.impl.i1;
import com.applovin.impl.we;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class j1 {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f8635a = yp.c("OpusHead");

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f8636a;

        /* renamed from: b  reason: collision with root package name */
        public int f8637b;

        /* renamed from: c  reason: collision with root package name */
        public int f8638c;

        /* renamed from: d  reason: collision with root package name */
        public long f8639d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f8640e;

        /* renamed from: f  reason: collision with root package name */
        private final yg f8641f;

        /* renamed from: g  reason: collision with root package name */
        private final yg f8642g;

        /* renamed from: h  reason: collision with root package name */
        private int f8643h;

        /* renamed from: i  reason: collision with root package name */
        private int f8644i;

        public a(yg ygVar, yg ygVar2, boolean z10) {
            this.f8642g = ygVar;
            this.f8641f = ygVar2;
            this.f8640e = z10;
            ygVar2.f(12);
            this.f8636a = ygVar2.A();
            ygVar.f(12);
            this.f8644i = ygVar.A();
            l8.a(ygVar.j() != 1 ? false : true, "first_chunk must be 1");
            this.f8637b = -1;
        }

        public boolean a() {
            long j10;
            int i10 = this.f8637b + 1;
            this.f8637b = i10;
            if (i10 == this.f8636a) {
                return false;
            }
            if (this.f8640e) {
                j10 = this.f8641f.B();
            } else {
                j10 = this.f8641f.y();
            }
            this.f8639d = j10;
            if (this.f8637b == this.f8643h) {
                this.f8638c = this.f8642g.A();
                this.f8642g.g(4);
                int i11 = this.f8644i - 1;
                this.f8644i = i11;
                this.f8643h = i11 > 0 ? this.f8642g.A() - 1 : -1;
            }
            return true;
        }
    }

    private interface b {
        int a();

        int b();

        int c();
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final no[] f8645a;

        /* renamed from: b  reason: collision with root package name */
        public d9 f8646b;

        /* renamed from: c  reason: collision with root package name */
        public int f8647c;

        /* renamed from: d  reason: collision with root package name */
        public int f8648d = 0;

        public c(int i10) {
            this.f8645a = new no[i10];
        }
    }

    static final class d implements b {

        /* renamed from: a  reason: collision with root package name */
        private final int f8649a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8650b;

        /* renamed from: c  reason: collision with root package name */
        private final yg f8651c;

        public d(i1.b bVar, d9 d9Var) {
            yg ygVar = bVar.f8407b;
            this.f8651c = ygVar;
            ygVar.f(12);
            int A = ygVar.A();
            if ("audio/raw".equals(d9Var.f7153m)) {
                int b10 = yp.b(d9Var.B, d9Var.f7166z);
                if (A == 0 || A % b10 != 0) {
                    kc.d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + b10 + ", stsz sample size: " + A);
                    A = b10;
                }
            }
            this.f8649a = A == 0 ? -1 : A;
            this.f8650b = ygVar.A();
        }

        public int a() {
            return this.f8649a;
        }

        public int b() {
            return this.f8650b;
        }

        public int c() {
            int i10 = this.f8649a;
            return i10 == -1 ? this.f8651c.A() : i10;
        }
    }

    static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        private final yg f8652a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8653b;

        /* renamed from: c  reason: collision with root package name */
        private final int f8654c;

        /* renamed from: d  reason: collision with root package name */
        private int f8655d;

        /* renamed from: e  reason: collision with root package name */
        private int f8656e;

        public e(i1.b bVar) {
            yg ygVar = bVar.f8407b;
            this.f8652a = ygVar;
            ygVar.f(12);
            this.f8654c = ygVar.A() & 255;
            this.f8653b = ygVar.A();
        }

        public int a() {
            return -1;
        }

        public int b() {
            return this.f8653b;
        }

        public int c() {
            int i10 = this.f8654c;
            if (i10 == 8) {
                return this.f8652a.w();
            }
            if (i10 == 16) {
                return this.f8652a.C();
            }
            int i11 = this.f8655d;
            this.f8655d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f8656e & 15;
            }
            int w10 = this.f8652a.w();
            this.f8656e = w10;
            return (w10 & 240) >> 4;
        }
    }

    private static final class f {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f8657a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f8658b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f8659c;

        public f(int i10, long j10, int i11) {
            this.f8657a = i10;
            this.f8658b = j10;
            this.f8659c = i11;
        }
    }

    private static int a(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    private static boolean a(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        int a10 = yp.a(4, 0, length);
        int a11 = yp.a(jArr.length - 4, 0, length);
        if (jArr[0] > j11 || j11 >= jArr[a10] || jArr[a11] >= j12 || j12 > j10) {
            return false;
        }
        return true;
    }

    static Pair b(yg ygVar, int i10, int i11) {
        int i12 = i10 + 8;
        boolean z10 = false;
        String str = null;
        Integer num = null;
        int i13 = -1;
        int i14 = 0;
        while (i12 - i10 < i11) {
            ygVar.f(i12);
            int j10 = ygVar.j();
            int j11 = ygVar.j();
            if (j11 == 1718775137) {
                num = Integer.valueOf(ygVar.j());
            } else if (j11 == 1935894637) {
                ygVar.g(4);
                str = ygVar.c(4);
            } else if (j11 == 1935894633) {
                i13 = i12;
                i14 = j10;
            }
            i12 += j10;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        l8.a(num != null, "frma atom is mandatory");
        l8.a(i13 != -1, "schi atom is mandatory");
        no a10 = a(ygVar, i13, i14, str);
        if (a10 != null) {
            z10 = true;
        }
        l8.a(z10, "tenc atom is mandatory");
        return Pair.create(num, (no) yp.a((Object) a10));
    }

    private static int c(yg ygVar) {
        ygVar.f(16);
        return ygVar.j();
    }

    private static Pair d(yg ygVar) {
        int i10 = 8;
        ygVar.f(8);
        int c10 = i1.c(ygVar.j());
        ygVar.g(c10 == 0 ? 8 : 16);
        long y10 = ygVar.y();
        if (c10 == 0) {
            i10 = 4;
        }
        ygVar.g(i10);
        int C = ygVar.C();
        return Pair.create(Long.valueOf(y10), MaxReward.DEFAULT_LABEL + ((char) (((C >> 10) & 31) + 96)) + ((char) (((C >> 5) & 31) + 96)) + ((char) ((C & 31) + 96)));
    }

    private static long e(yg ygVar) {
        int i10 = 8;
        ygVar.f(8);
        if (i1.c(ygVar.j()) != 0) {
            i10 = 16;
        }
        ygVar.g(i10);
        return ygVar.y();
    }

    private static f f(yg ygVar) {
        long j10;
        int i10 = 8;
        ygVar.f(8);
        int c10 = i1.c(ygVar.j());
        ygVar.g(c10 == 0 ? 8 : 16);
        int j11 = ygVar.j();
        ygVar.g(4);
        int d10 = ygVar.d();
        if (c10 == 0) {
            i10 = 4;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i12 >= i10) {
                ygVar.g(i10);
                break;
            } else if (ygVar.c()[d10 + i12] != -1) {
                long y10 = c10 == 0 ? ygVar.y() : ygVar.B();
                if (y10 != 0) {
                    j10 = y10;
                }
            } else {
                i12++;
            }
        }
        ygVar.g(16);
        int j12 = ygVar.j();
        int j13 = ygVar.j();
        ygVar.g(4);
        int j14 = ygVar.j();
        int j15 = ygVar.j();
        if (j12 == 0 && j13 == 65536 && j14 == -65536 && j15 == 0) {
            i11 = 90;
        } else if (j12 == 0 && j13 == -65536 && j14 == 65536 && j15 == 0) {
            i11 = 270;
        } else if (j12 == -65536 && j13 == 0 && j14 == 0 && j15 == -65536) {
            i11 = 180;
        }
        return new f(j11, j10, i11);
    }

    private static float c(yg ygVar, int i10) {
        ygVar.f(i10 + 8);
        return ((float) ygVar.A()) / ((float) ygVar.A());
    }

    private static int a(yg ygVar, int i10, int i11) {
        int d10 = ygVar.d();
        while (d10 - i10 < i11) {
            ygVar.f(d10);
            int j10 = ygVar.j();
            l8.a(j10 > 0, "childAtomSize must be positive");
            if (ygVar.j() == 1702061171) {
                return d10;
            }
            d10 += j10;
        }
        return -1;
    }

    private static byte[] c(yg ygVar, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            ygVar.f(i12);
            int j10 = ygVar.j();
            if (ygVar.j() == 1886547818) {
                return Arrays.copyOfRange(ygVar.c(), i12, j10 + i12);
            }
            i12 += j10;
        }
        return null;
    }

    private static we e(yg ygVar, int i10) {
        ygVar.g(8);
        a(ygVar);
        while (ygVar.d() < i10) {
            int d10 = ygVar.d();
            int j10 = ygVar.j();
            if (ygVar.j() == 1768715124) {
                ygVar.f(d10);
                return b(ygVar, d10 + j10);
            }
            ygVar.f(d10 + j10);
        }
        return null;
    }

    private static Pair d(yg ygVar, int i10, int i11) {
        Pair b10;
        int d10 = ygVar.d();
        while (d10 - i10 < i11) {
            ygVar.f(d10);
            int j10 = ygVar.j();
            l8.a(j10 > 0, "childAtomSize must be positive");
            if (ygVar.j() == 1936289382 && (b10 = b(ygVar, d10, j10)) != null) {
                return b10;
            }
            d10 += j10;
        }
        return null;
    }

    public static void a(yg ygVar) {
        int d10 = ygVar.d();
        ygVar.g(4);
        if (ygVar.j() != 1751411826) {
            d10 += 4;
        }
        ygVar.f(d10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x02c4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:154:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.applovin.impl.yg r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, com.applovin.impl.w6 r27, com.applovin.impl.j1.c r28, int r29) {
        /*
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r27
            r6 = r28
            int r7 = r1 + 16
            r0.f(r7)
            r7 = 6
            if (r26 == 0) goto L_0x001e
            int r9 = r20.C()
            r0.g(r7)
            goto L_0x0024
        L_0x001e:
            r9 = 8
            r0.g(r9)
            r9 = 0
        L_0x0024:
            r10 = 2
            r11 = 16
            r12 = 1
            if (r9 == 0) goto L_0x0046
            if (r9 != r12) goto L_0x002d
            goto L_0x0046
        L_0x002d:
            if (r9 != r10) goto L_0x0045
            r0.g(r11)
            double r13 = r20.h()
            long r13 = java.lang.Math.round(r13)
            int r7 = (int) r13
            int r9 = r20.A()
            r11 = 20
            r0.g(r11)
            goto L_0x0057
        L_0x0045:
            return
        L_0x0046:
            int r13 = r20.C()
            r0.g(r7)
            int r7 = r20.x()
            if (r9 != r12) goto L_0x0056
            r0.g(r11)
        L_0x0056:
            r9 = r13
        L_0x0057:
            int r11 = r20.d()
            r13 = 1701733217(0x656e6361, float:7.0359778E22)
            r15 = r21
            if (r15 != r13) goto L_0x008d
            android.util.Pair r13 = d(r0, r1, r2)
            if (r13 == 0) goto L_0x0088
            java.lang.Object r15 = r13.first
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            if (r5 != 0) goto L_0x0074
            r14 = 0
            goto L_0x007f
        L_0x0074:
            java.lang.Object r14 = r13.second
            com.applovin.impl.no r14 = (com.applovin.impl.no) r14
            java.lang.String r14 = r14.f10008b
            com.applovin.impl.w6 r5 = r5.a((java.lang.String) r14)
            r14 = r5
        L_0x007f:
            com.applovin.impl.no[] r5 = r6.f8645a
            java.lang.Object r13 = r13.second
            com.applovin.impl.no r13 = (com.applovin.impl.no) r13
            r5[r29] = r13
            goto L_0x0089
        L_0x0088:
            r14 = r5
        L_0x0089:
            r0.f(r11)
            goto L_0x008e
        L_0x008d:
            r14 = r5
        L_0x008e:
            r5 = 1633889587(0x61632d33, float:2.6191674E20)
            r13 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r17 = "audio/raw"
            if (r15 != r5) goto L_0x009e
            java.lang.String r5 = "audio/ac3"
        L_0x009a:
            r17 = r5
            goto L_0x0147
        L_0x009e:
            r5 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r15 != r5) goto L_0x00a6
            java.lang.String r5 = "audio/eac3"
            goto L_0x009a
        L_0x00a6:
            r5 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r15 != r5) goto L_0x00ae
            java.lang.String r5 = "audio/ac4"
            goto L_0x009a
        L_0x00ae:
            r5 = 1685353315(0x64747363, float:1.803728E22)
            if (r15 != r5) goto L_0x00b6
            java.lang.String r5 = "audio/vnd.dts"
            goto L_0x009a
        L_0x00b6:
            r5 = 1685353320(0x64747368, float:1.8037286E22)
            if (r15 == r5) goto L_0x0143
            r5 = 1685353324(0x6474736c, float:1.803729E22)
            if (r15 != r5) goto L_0x00c2
            goto L_0x0143
        L_0x00c2:
            r5 = 1685353317(0x64747365, float:1.8037282E22)
            if (r15 != r5) goto L_0x00ca
            java.lang.String r5 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x009a
        L_0x00ca:
            r5 = 1685353336(0x64747378, float:1.8037304E22)
            if (r15 != r5) goto L_0x00d2
            java.lang.String r5 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x009a
        L_0x00d2:
            r5 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r15 != r5) goto L_0x00da
            java.lang.String r5 = "audio/3gpp"
            goto L_0x009a
        L_0x00da:
            r5 = 1935767394(0x73617762, float:1.7863284E31)
            if (r15 != r5) goto L_0x00e2
            java.lang.String r5 = "audio/amr-wb"
            goto L_0x009a
        L_0x00e2:
            r5 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r15 == r5) goto L_0x0141
            r5 = 1936684916(0x736f7774, float:1.89725E31)
            if (r15 != r5) goto L_0x00ed
            goto L_0x0141
        L_0x00ed:
            r5 = 1953984371(0x74776f73, float:7.841539E31)
            if (r15 != r5) goto L_0x00f5
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0148
        L_0x00f5:
            r5 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r15 == r5) goto L_0x013d
            r5 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r15 != r5) goto L_0x0100
            goto L_0x013d
        L_0x0100:
            r5 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r15 != r5) goto L_0x0108
            java.lang.String r5 = "audio/mha1"
            goto L_0x009a
        L_0x0108:
            r5 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r15 != r5) goto L_0x0110
            java.lang.String r5 = "audio/mhm1"
            goto L_0x009a
        L_0x0110:
            if (r15 != r13) goto L_0x0115
            java.lang.String r5 = "audio/alac"
            goto L_0x009a
        L_0x0115:
            r5 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r15 != r5) goto L_0x011e
            java.lang.String r5 = "audio/g711-alaw"
            goto L_0x009a
        L_0x011e:
            r5 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r15 != r5) goto L_0x0127
            java.lang.String r5 = "audio/g711-mlaw"
            goto L_0x009a
        L_0x0127:
            r5 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r15 != r5) goto L_0x0130
            java.lang.String r5 = "audio/opus"
            goto L_0x009a
        L_0x0130:
            r5 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r15 != r5) goto L_0x0139
            java.lang.String r5 = "audio/flac"
            goto L_0x009a
        L_0x0139:
            r5 = -1
            r17 = 0
            goto L_0x0148
        L_0x013d:
            java.lang.String r5 = "audio/mpeg"
            goto L_0x009a
        L_0x0141:
            r5 = 2
            goto L_0x0148
        L_0x0143:
            java.lang.String r5 = "audio/vnd.dts.hd"
            goto L_0x009a
        L_0x0147:
            r5 = -1
        L_0x0148:
            r10 = r17
            r15 = 0
            r19 = 0
        L_0x014d:
            int r13 = r11 - r1
            if (r13 >= r2) goto L_0x02c0
            r0.f(r11)
            int r13 = r20.j()
            if (r13 <= 0) goto L_0x015b
            goto L_0x015c
        L_0x015b:
            r12 = 0
        L_0x015c:
            java.lang.String r8 = "childAtomSize must be positive"
            com.applovin.impl.l8.a((boolean) r12, (java.lang.String) r8)
            int r8 = r20.j()
            r12 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r8 != r12) goto L_0x0185
            int r8 = r13 + -13
            byte[] r12 = new byte[r8]
            int r1 = r11 + 13
            r0.f(r1)
            r1 = 0
            r0.a(r12, r1, r8)
            com.applovin.impl.ab r1 = com.applovin.impl.ab.a((java.lang.Object) r12)
        L_0x017b:
            r19 = r1
        L_0x017d:
            r8 = -1
            r12 = 1
            r16 = 2
        L_0x0181:
            r17 = 0
            goto L_0x02b9
        L_0x0185:
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r8 == r1) goto L_0x0280
            if (r26 == 0) goto L_0x0193
            r12 = 2002876005(0x77617665, float:4.5729223E33)
            if (r8 != r12) goto L_0x0193
            goto L_0x0280
        L_0x0193:
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r8 != r1) goto L_0x01a8
            int r1 = r11 + 8
            r0.f(r1)
            java.lang.String r1 = java.lang.Integer.toString(r24)
            com.applovin.impl.d9 r1 = com.applovin.impl.k.a(r0, r1, r4, r14)
            r6.f8646b = r1
            goto L_0x017d
        L_0x01a8:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r8 != r1) goto L_0x01bd
            int r1 = r11 + 8
            r0.f(r1)
            java.lang.String r1 = java.lang.Integer.toString(r24)
            com.applovin.impl.d9 r1 = com.applovin.impl.k.b(r0, r1, r4, r14)
            r6.f8646b = r1
            goto L_0x017d
        L_0x01bd:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r8 != r1) goto L_0x01d2
            int r1 = r11 + 8
            r0.f(r1)
            java.lang.String r1 = java.lang.Integer.toString(r24)
            com.applovin.impl.d9 r1 = com.applovin.impl.n.a(r0, r1, r4, r14)
            r6.f8646b = r1
            goto L_0x017d
        L_0x01d2:
            r1 = 1684305011(0x64647473, float:1.6856995E22)
            if (r8 != r1) goto L_0x01fb
            com.applovin.impl.d9$b r1 = new com.applovin.impl.d9$b
            r1.<init>()
            com.applovin.impl.d9$b r1 = r1.h((int) r3)
            com.applovin.impl.d9$b r1 = r1.f((java.lang.String) r10)
            com.applovin.impl.d9$b r1 = r1.c((int) r9)
            com.applovin.impl.d9$b r1 = r1.n((int) r7)
            com.applovin.impl.d9$b r1 = r1.a((com.applovin.impl.w6) r14)
            com.applovin.impl.d9$b r1 = r1.e((java.lang.String) r4)
            com.applovin.impl.d9 r1 = r1.a()
            r6.f8646b = r1
            goto L_0x017d
        L_0x01fb:
            r1 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r8 != r1) goto L_0x0219
            int r1 = r13 + -8
            byte[] r8 = f8635a
            int r12 = r8.length
            int r12 = r12 + r1
            byte[] r12 = java.util.Arrays.copyOf(r8, r12)
            int r2 = r11 + 8
            r0.f(r2)
            int r2 = r8.length
            r0.a(r12, r2, r1)
            java.util.List r1 = com.applovin.impl.rg.a((byte[]) r12)
            goto L_0x017b
        L_0x0219:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r8 != r1) goto L_0x024b
            int r1 = r13 + -12
            int r2 = r13 + -8
            byte[] r2 = new byte[r2]
            r8 = 102(0x66, float:1.43E-43)
            r12 = 0
            r2[r12] = r8
            r8 = 76
            r12 = 1
            r2[r12] = r8
            r8 = 97
            r16 = 2
            r2[r16] = r8
            r8 = 3
            r18 = 67
            r2[r8] = r18
            int r8 = r11 + 12
            r0.f(r8)
            r8 = 4
            r0.a(r2, r8, r1)
            com.applovin.impl.ab r1 = com.applovin.impl.ab.a((java.lang.Object) r2)
            r19 = r1
        L_0x0248:
            r8 = -1
            goto L_0x0181
        L_0x024b:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r12 = 1
            r16 = 2
            if (r8 != r2) goto L_0x0248
            int r1 = r13 + -12
            byte[] r7 = new byte[r1]
            int r8 = r11 + 12
            r0.f(r8)
            r8 = 0
            r0.a(r7, r8, r1)
            android.util.Pair r1 = com.applovin.impl.m3.a((byte[]) r7)
            java.lang.Object r9 = r1.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.applovin.impl.ab r7 = com.applovin.impl.ab.a((java.lang.Object) r7)
            r19 = r7
            r7 = r9
            r8 = -1
            r17 = 0
            r9 = r1
            goto L_0x02b9
        L_0x0280:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r12 = 1
            r16 = 2
            r17 = 0
            if (r8 != r1) goto L_0x028c
            r1 = r11
            goto L_0x0290
        L_0x028c:
            int r1 = a((com.applovin.impl.yg) r0, (int) r11, (int) r13)
        L_0x0290:
            r8 = -1
            if (r1 == r8) goto L_0x02b9
            android.util.Pair r1 = a(r0, r1)
            java.lang.Object r10 = r1.first
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r1 = r1.second
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x02b9
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x02b3
            com.applovin.impl.a$b r2 = com.applovin.impl.a.a((byte[]) r1)
            int r7 = r2.f6273a
            int r9 = r2.f6274b
            java.lang.String r15 = r2.f6275c
        L_0x02b3:
            com.applovin.impl.ab r1 = com.applovin.impl.ab.a((java.lang.Object) r1)
            r19 = r1
        L_0x02b9:
            int r11 = r11 + r13
            r1 = r22
            r2 = r23
            goto L_0x014d
        L_0x02c0:
            com.applovin.impl.d9 r0 = r6.f8646b
            if (r0 != 0) goto L_0x02f7
            if (r10 == 0) goto L_0x02f7
            com.applovin.impl.d9$b r0 = new com.applovin.impl.d9$b
            r0.<init>()
            com.applovin.impl.d9$b r0 = r0.h((int) r3)
            com.applovin.impl.d9$b r0 = r0.f((java.lang.String) r10)
            com.applovin.impl.d9$b r0 = r0.a((java.lang.String) r15)
            com.applovin.impl.d9$b r0 = r0.c((int) r9)
            com.applovin.impl.d9$b r0 = r0.n((int) r7)
            com.applovin.impl.d9$b r0 = r0.j((int) r5)
            r1 = r19
            com.applovin.impl.d9$b r0 = r0.a((java.util.List) r1)
            com.applovin.impl.d9$b r0 = r0.a((com.applovin.impl.w6) r14)
            com.applovin.impl.d9$b r0 = r0.e((java.lang.String) r4)
            com.applovin.impl.d9 r0 = r0.a()
            r6.f8646b = r0
        L_0x02f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.j1.a(com.applovin.impl.yg, int, int, int, int, java.lang.String, boolean, com.applovin.impl.w6, com.applovin.impl.j1$c, int):void");
    }

    private static int b(yg ygVar) {
        int w10 = ygVar.w();
        int i10 = w10 & 127;
        while ((w10 & 128) == 128) {
            w10 = ygVar.w();
            i10 = (i10 << 7) | (w10 & 127);
        }
        return i10;
    }

    private static we d(yg ygVar, int i10) {
        ygVar.g(12);
        while (ygVar.d() < i10) {
            int d10 = ygVar.d();
            int j10 = ygVar.j();
            if (ygVar.j() != 1935766900) {
                ygVar.f(d10 + j10);
            } else if (j10 < 14) {
                return null;
            } else {
                ygVar.g(5);
                int w10 = ygVar.w();
                if (w10 != 12 && w10 != 13) {
                    return null;
                }
                float f10 = w10 == 12 ? 240.0f : 120.0f;
                ygVar.g(1);
                return new we(new hk(f10, ygVar.w()));
            }
        }
        return null;
    }

    private static we b(yg ygVar, int i10) {
        ygVar.g(8);
        ArrayList arrayList = new ArrayList();
        while (ygVar.d() < i10) {
            we.b b10 = cf.b(ygVar);
            if (b10 != null) {
                arrayList.add(b10);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new we((List) arrayList);
    }

    public static we b(i1.a aVar) {
        i1.b e10 = aVar.e(1751411826);
        i1.b e11 = aVar.e(1801812339);
        i1.b e12 = aVar.e(1768715124);
        if (e10 == null || e11 == null || e12 == null || c(e10.f8407b) != 1835299937) {
            return null;
        }
        yg ygVar = e11.f8407b;
        ygVar.f(12);
        int j10 = ygVar.j();
        String[] strArr = new String[j10];
        for (int i10 = 0; i10 < j10; i10++) {
            int j11 = ygVar.j();
            ygVar.g(4);
            strArr[i10] = ygVar.c(j11 - 8);
        }
        yg ygVar2 = e12.f8407b;
        ygVar2.f(8);
        ArrayList arrayList = new ArrayList();
        while (ygVar2.a() > 8) {
            int d10 = ygVar2.d();
            int j12 = ygVar2.j();
            int j13 = ygVar2.j() - 1;
            if (j13 < 0 || j13 >= j10) {
                kc.d("AtomParsers", "Skipped metadata with unknown key index: " + j13);
            } else {
                ad a10 = cf.a(ygVar2, d10 + j12, strArr[j13]);
                if (a10 != null) {
                    arrayList.add(a10);
                }
            }
            ygVar2.f(d10 + j12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new we((List) arrayList);
    }

    private static Pair a(i1.a aVar) {
        i1.b e10 = aVar.e(1701606260);
        if (e10 == null) {
            return null;
        }
        yg ygVar = e10.f8407b;
        ygVar.f(8);
        int c10 = i1.c(ygVar.j());
        int A = ygVar.A();
        long[] jArr = new long[A];
        long[] jArr2 = new long[A];
        int i10 = 0;
        while (i10 < A) {
            jArr[i10] = c10 == 1 ? ygVar.B() : ygVar.y();
            jArr2[i10] = c10 == 1 ? ygVar.s() : (long) ygVar.j();
            if (ygVar.u() == 1) {
                ygVar.g(2);
                i10++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair a(yg ygVar, int i10) {
        ygVar.f(i10 + 12);
        ygVar.g(1);
        b(ygVar);
        ygVar.g(2);
        int w10 = ygVar.w();
        if ((w10 & 128) != 0) {
            ygVar.g(2);
        }
        if ((w10 & 64) != 0) {
            ygVar.g(ygVar.C());
        }
        if ((w10 & 32) != 0) {
            ygVar.g(2);
        }
        ygVar.g(1);
        b(ygVar);
        String a10 = df.a(ygVar.w());
        if ("audio/mpeg".equals(a10) || "audio/vnd.dts".equals(a10) || "audio/vnd.dts.hd".equals(a10)) {
            return Pair.create(a10, (Object) null);
        }
        ygVar.g(12);
        ygVar.g(1);
        int b10 = b(ygVar);
        byte[] bArr = new byte[b10];
        ygVar.a(bArr, 0, b10);
        return Pair.create(a10, bArr);
    }

    private static void a(yg ygVar, int i10, int i11, int i12, c cVar) {
        ygVar.f(i11 + 16);
        if (i10 == 1835365492) {
            ygVar.t();
            String t10 = ygVar.t();
            if (t10 != null) {
                cVar.f8646b = new d9.b().h(i12).f(t10).a();
            }
        }
    }

    private static no a(yg ygVar, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            ygVar.f(i14);
            int j10 = ygVar.j();
            if (ygVar.j() == 1952804451) {
                int c10 = i1.c(ygVar.j());
                ygVar.g(1);
                if (c10 == 0) {
                    ygVar.g(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int w10 = ygVar.w();
                    i12 = w10 & 15;
                    i13 = (w10 & 240) >> 4;
                }
                boolean z10 = ygVar.w() == 1;
                int w11 = ygVar.w();
                byte[] bArr2 = new byte[16];
                ygVar.a(bArr2, 0, 16);
                if (z10 && w11 == 0) {
                    int w12 = ygVar.w();
                    bArr = new byte[w12];
                    ygVar.a(bArr, 0, w12);
                }
                return new no(z10, str, w11, bArr2, i13, i12, bArr);
            }
            i14 += j10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.impl.so a(com.applovin.impl.mo r38, com.applovin.impl.i1.a r39, com.applovin.impl.x9 r40) {
        /*
            r1 = r38
            r0 = r39
            r2 = r40
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            com.applovin.impl.i1$b r3 = r0.e(r3)
            if (r3 == 0) goto L_0x0017
            com.applovin.impl.j1$d r5 = new com.applovin.impl.j1$d
            com.applovin.impl.d9 r6 = r1.f9814f
            r5.<init>(r3, r6)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            com.applovin.impl.i1$b r3 = r0.e(r3)
            if (r3 == 0) goto L_0x050a
            com.applovin.impl.j1$e r5 = new com.applovin.impl.j1$e
            r5.<init>(r3)
        L_0x0025:
            int r3 = r5.b()
            r6 = 0
            if (r3 != 0) goto L_0x0040
            com.applovin.impl.so r9 = new com.applovin.impl.so
            long[] r2 = new long[r6]
            int[] r3 = new int[r6]
            long[] r5 = new long[r6]
            int[] r6 = new int[r6]
            r4 = 0
            r7 = 0
            r0 = r9
            r1 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0040:
            r7 = 1937007471(0x7374636f, float:1.9362445E31)
            com.applovin.impl.i1$b r7 = r0.e(r7)
            r8 = 1
            if (r7 != 0) goto L_0x0059
            r7 = 1668232756(0x636f3634, float:4.4126776E21)
            com.applovin.impl.i1$b r7 = r0.e(r7)
            java.lang.Object r7 = com.applovin.impl.a1.a((java.lang.Object) r7)
            com.applovin.impl.i1$b r7 = (com.applovin.impl.i1.b) r7
            r9 = 1
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            com.applovin.impl.yg r7 = r7.f8407b
            r10 = 1937011555(0x73747363, float:1.9367382E31)
            com.applovin.impl.i1$b r10 = r0.e(r10)
            java.lang.Object r10 = com.applovin.impl.a1.a((java.lang.Object) r10)
            com.applovin.impl.i1$b r10 = (com.applovin.impl.i1.b) r10
            com.applovin.impl.yg r10 = r10.f8407b
            r11 = 1937011827(0x73747473, float:1.9367711E31)
            com.applovin.impl.i1$b r11 = r0.e(r11)
            java.lang.Object r11 = com.applovin.impl.a1.a((java.lang.Object) r11)
            com.applovin.impl.i1$b r11 = (com.applovin.impl.i1.b) r11
            com.applovin.impl.yg r11 = r11.f8407b
            r12 = 1937011571(0x73747373, float:1.9367401E31)
            com.applovin.impl.i1$b r12 = r0.e(r12)
            if (r12 == 0) goto L_0x0086
            com.applovin.impl.yg r12 = r12.f8407b
            goto L_0x0087
        L_0x0086:
            r12 = 0
        L_0x0087:
            r13 = 1668576371(0x63747473, float:4.5093966E21)
            com.applovin.impl.i1$b r0 = r0.e(r13)
            if (r0 == 0) goto L_0x0093
            com.applovin.impl.yg r0 = r0.f8407b
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            com.applovin.impl.j1$a r13 = new com.applovin.impl.j1$a
            r13.<init>(r10, r7, r9)
            r7 = 12
            r11.f(r7)
            int r9 = r11.A()
            int r9 = r9 - r8
            int r10 = r11.A()
            int r14 = r11.A()
            if (r0 == 0) goto L_0x00b5
            r0.f(r7)
            int r15 = r0.A()
            goto L_0x00b6
        L_0x00b5:
            r15 = 0
        L_0x00b6:
            r4 = -1
            if (r12 == 0) goto L_0x00cb
            r12.f(r7)
            int r7 = r12.A()
            if (r7 <= 0) goto L_0x00c9
            int r16 = r12.A()
            int r16 = r16 + -1
            goto L_0x00ce
        L_0x00c9:
            r12 = 0
            goto L_0x00cc
        L_0x00cb:
            r7 = 0
        L_0x00cc:
            r16 = -1
        L_0x00ce:
            int r6 = r5.a()
            com.applovin.impl.d9 r8 = r1.f9814f
            java.lang.String r8 = r8.f7153m
            if (r6 == r4) goto L_0x00fa
            java.lang.String r4 = "audio/raw"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f0
            java.lang.String r4 = "audio/g711-mlaw"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f0
            java.lang.String r4 = "audio/g711-alaw"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x00fa
        L_0x00f0:
            if (r9 != 0) goto L_0x00fa
            if (r15 != 0) goto L_0x00fa
            if (r7 != 0) goto L_0x00fa
            r39 = r7
            r4 = 1
            goto L_0x00fd
        L_0x00fa:
            r39 = r7
            r4 = 0
        L_0x00fd:
            if (r4 == 0) goto L_0x0131
            int r0 = r13.f8636a
            long[] r4 = new long[r0]
            int[] r0 = new int[r0]
        L_0x0105:
            boolean r5 = r13.a()
            if (r5 == 0) goto L_0x0116
            int r5 = r13.f8637b
            long r9 = r13.f8639d
            r4[r5] = r9
            int r9 = r13.f8638c
            r0[r5] = r9
            goto L_0x0105
        L_0x0116:
            long r9 = (long) r14
            com.applovin.impl.q8$b r0 = com.applovin.impl.q8.a(r6, r4, r0, r9)
            long[] r4 = r0.f10887a
            int[] r5 = r0.f10888b
            int r6 = r0.f10889c
            long[] r9 = r0.f10890d
            int[] r10 = r0.f10891e
            long r11 = r0.f10892f
            r14 = r1
            r0 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r13 = r10
            r15 = r11
            r12 = r9
            goto L_0x029c
        L_0x0131:
            long[] r4 = new long[r3]
            int[] r6 = new int[r3]
            long[] r7 = new long[r3]
            int[] r8 = new int[r3]
            r23 = r11
            r2 = r16
            r1 = 0
            r11 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r16 = r15
            r15 = r14
            r14 = r10
            r37 = r9
            r9 = r39
        L_0x0151:
            r39 = r37
            java.lang.String r10 = "AtomParsers"
            if (r1 >= r3) goto L_0x0215
            r28 = r27
            r27 = r22
            r22 = 1
        L_0x015d:
            if (r27 != 0) goto L_0x017a
            boolean r22 = r13.a()
            if (r22 == 0) goto L_0x017a
            r30 = r14
            r31 = r15
            long r14 = r13.f8639d
            r32 = r3
            int r3 = r13.f8638c
            r27 = r3
            r28 = r14
            r14 = r30
            r15 = r31
            r3 = r32
            goto L_0x015d
        L_0x017a:
            r32 = r3
            r30 = r14
            r31 = r15
            if (r22 != 0) goto L_0x019e
            java.lang.String r2 = "Unexpected end of chunk data"
            com.applovin.impl.kc.d(r10, r2)
            long[] r4 = java.util.Arrays.copyOf(r4, r1)
            int[] r6 = java.util.Arrays.copyOf(r6, r1)
            long[] r7 = java.util.Arrays.copyOf(r7, r1)
            int[] r8 = java.util.Arrays.copyOf(r8, r1)
            r3 = r1
            r2 = r21
            r1 = r27
            goto L_0x021d
        L_0x019e:
            if (r0 == 0) goto L_0x01b1
        L_0x01a0:
            if (r24 != 0) goto L_0x01af
            if (r16 <= 0) goto L_0x01af
            int r24 = r0.A()
            int r21 = r0.j()
            int r16 = r16 + -1
            goto L_0x01a0
        L_0x01af:
            int r24 = r24 + -1
        L_0x01b1:
            r3 = r21
            r4[r1] = r28
            int r10 = r5.c()
            r6[r1] = r10
            if (r10 <= r11) goto L_0x01be
            r11 = r10
        L_0x01be:
            long r14 = (long) r3
            long r14 = r25 + r14
            r7[r1] = r14
            if (r12 != 0) goto L_0x01c7
            r10 = 1
            goto L_0x01c8
        L_0x01c7:
            r10 = 0
        L_0x01c8:
            r8[r1] = r10
            if (r1 != r2) goto L_0x01de
            r10 = 1
            r8[r1] = r10
            int r9 = r9 + -1
            if (r9 <= 0) goto L_0x01de
            java.lang.Object r2 = com.applovin.impl.a1.a((java.lang.Object) r12)
            com.applovin.impl.yg r2 = (com.applovin.impl.yg) r2
            int r2 = r2.A()
            int r2 = r2 - r10
        L_0x01de:
            r15 = r2
            r10 = r3
            r14 = r31
            long r2 = (long) r14
            long r25 = r25 + r2
            int r2 = r30 + -1
            if (r2 != 0) goto L_0x01f6
            if (r39 <= 0) goto L_0x01f6
            int r2 = r23.A()
            int r3 = r23.j()
            int r14 = r39 + -1
            goto L_0x01f9
        L_0x01f6:
            r3 = r14
            r14 = r39
        L_0x01f9:
            r39 = r2
            r2 = r6[r1]
            r21 = r3
            long r2 = (long) r2
            long r2 = r28 + r2
            int r22 = r27 + -1
            int r1 = r1 + 1
            r27 = r2
            r2 = r15
            r15 = r21
            r3 = r32
            r21 = r10
            r37 = r14
            r14 = r39
            goto L_0x0151
        L_0x0215:
            r32 = r3
            r30 = r14
            r2 = r21
            r1 = r22
        L_0x021d:
            long r12 = (long) r2
            long r12 = r25 + r12
            if (r0 == 0) goto L_0x0232
        L_0x0222:
            if (r16 <= 0) goto L_0x0232
            int r2 = r0.A()
            if (r2 == 0) goto L_0x022c
            r0 = 0
            goto L_0x0233
        L_0x022c:
            r0.j()
            int r16 = r16 + -1
            goto L_0x0222
        L_0x0232:
            r0 = 1
        L_0x0233:
            if (r9 != 0) goto L_0x0245
            if (r30 != 0) goto L_0x0245
            if (r1 != 0) goto L_0x0245
            if (r39 != 0) goto L_0x0245
            r2 = r24
            if (r2 != 0) goto L_0x0247
            if (r0 != 0) goto L_0x0242
            goto L_0x0247
        L_0x0242:
            r14 = r38
            goto L_0x0295
        L_0x0245:
            r2 = r24
        L_0x0247:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r14 = "Inconsistent stbl box for track "
            r5.append(r14)
            r14 = r38
            int r15 = r14.f9809a
            r5.append(r15)
            java.lang.String r15 = ": remainingSynchronizationSamples "
            r5.append(r15)
            r5.append(r9)
            java.lang.String r9 = ", remainingSamplesAtTimestampDelta "
            r5.append(r9)
            r9 = r30
            r5.append(r9)
            java.lang.String r9 = ", remainingSamplesInChunk "
            r5.append(r9)
            r5.append(r1)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r5.append(r1)
            r9 = r39
            r5.append(r9)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r5.append(r1)
            r5.append(r2)
            if (r0 != 0) goto L_0x0289
            java.lang.String r0 = ", ctts invalid"
            goto L_0x028b
        L_0x0289:
            java.lang.String r0 = ""
        L_0x028b:
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.applovin.impl.kc.d(r10, r0)
        L_0x0295:
            r0 = r3
            r2 = r4
            r3 = r6
            r4 = r11
            r15 = r12
            r12 = r7
            r13 = r8
        L_0x029c:
            long r9 = r14.f9811c
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r5 = r15
            long r7 = com.applovin.impl.yp.c(r5, r7, r9)
            long[] r1 = r14.f9816h
            r10 = 1000000(0xf4240, double:4.940656E-318)
            if (r1 != 0) goto L_0x02bd
            long r0 = r14.f9811c
            com.applovin.impl.yp.a((long[]) r12, (long) r10, (long) r0)
            com.applovin.impl.so r9 = new com.applovin.impl.so
            r0 = r9
            r1 = r38
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x02bd:
            int r1 = r1.length
            r5 = 1
            if (r1 != r5) goto L_0x035a
            int r1 = r14.f9810b
            if (r1 != r5) goto L_0x035a
            int r1 = r12.length
            r5 = 2
            if (r1 < r5) goto L_0x035a
            long[] r1 = r14.f9817i
            java.lang.Object r1 = com.applovin.impl.a1.a((java.lang.Object) r1)
            long[] r1 = (long[]) r1
            r5 = 0
            r21 = r1[r5]
            long[] r1 = r14.f9816h
            r23 = r1[r5]
            long r5 = r14.f9811c
            long r7 = r14.f9812d
            r25 = r5
            r27 = r7
            long r5 = com.applovin.impl.yp.c(r23, r25, r27)
            long r23 = r21 + r5
            r5 = r12
            r6 = r15
            r8 = r21
            r25 = r0
            r0 = r10
            r10 = r23
            boolean r5 = a((long[]) r5, (long) r6, (long) r8, (long) r10)
            if (r5 == 0) goto L_0x035c
            long r6 = r15 - r23
            r5 = 0
            r8 = r12[r5]
            long r26 = r21 - r8
            com.applovin.impl.d9 r5 = r14.f9814f
            int r5 = r5.A
            long r8 = (long) r5
            long r10 = r14.f9811c
            r28 = r8
            r30 = r10
            long r10 = com.applovin.impl.yp.c(r26, r28, r30)
            com.applovin.impl.d9 r5 = r14.f9814f
            int r5 = r5.A
            long r8 = (long) r5
            long r0 = r14.f9811c
            r39 = r4
            r4 = r10
            r10 = r0
            long r0 = com.applovin.impl.yp.c(r6, r8, r10)
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0324
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x035e
        L_0x0324:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x035e
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x035e
            int r5 = (int) r4
            r4 = r40
            r4.f13304a = r5
            int r1 = (int) r0
            r4.f13305b = r1
            long r0 = r14.f9811c
            r4 = 1000000(0xf4240, double:4.940656E-318)
            com.applovin.impl.yp.a((long[]) r12, (long) r4, (long) r0)
            long[] r0 = r14.f9816h
            r1 = 0
            r4 = r0[r1]
            long r8 = r14.f9812d
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = com.applovin.impl.yp.c(r4, r6, r8)
            com.applovin.impl.so r9 = new com.applovin.impl.so
            r0 = r9
            r1 = r38
            r4 = r39
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x035a:
            r25 = r0
        L_0x035c:
            r39 = r4
        L_0x035e:
            long[] r0 = r14.f9816h
            int r1 = r0.length
            r4 = 1
            if (r1 != r4) goto L_0x03a9
            r1 = 0
            r4 = r0[r1]
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x03a9
            long[] r0 = r14.f9817i
            java.lang.Object r0 = com.applovin.impl.a1.a((java.lang.Object) r0)
            long[] r0 = (long[]) r0
            r4 = r0[r1]
            r6 = 0
        L_0x0378:
            int r0 = r12.length
            if (r6 >= r0) goto L_0x038f
            r0 = r12[r6]
            long r17 = r0 - r4
            long r0 = r14.f9811c
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r0
            long r0 = com.applovin.impl.yp.c(r17, r19, r21)
            r12[r6] = r0
            int r6 = r6 + 1
            goto L_0x0378
        L_0x038f:
            long r17 = r15 - r4
            long r0 = r14.f9811c
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r0
            long r7 = com.applovin.impl.yp.c(r17, r19, r21)
            com.applovin.impl.so r9 = new com.applovin.impl.so
            r0 = r9
            r1 = r38
            r4 = r39
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x03a9:
            int r1 = r14.f9810b
            r4 = 1
            if (r1 != r4) goto L_0x03b0
            r10 = 1
            goto L_0x03b1
        L_0x03b0:
            r10 = 0
        L_0x03b1:
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r0 = r0.length
            int[] r0 = new int[r0]
            long[] r4 = r14.f9817i
            java.lang.Object r4 = com.applovin.impl.a1.a((java.lang.Object) r4)
            long[] r4 = (long[]) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x03c3:
            long[] r9 = r14.f9816h
            int r11 = r9.length
            if (r5 >= r11) goto L_0x0426
            r11 = r2
            r15 = r3
            r2 = r4[r5]
            r21 = -1
            int r16 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r16 == 0) goto L_0x0415
            r26 = r9[r5]
            r40 = r7
            r9 = r8
            long r7 = r14.f9811c
            r21 = r9
            r16 = r10
            long r9 = r14.f9812d
            r28 = r7
            r30 = r9
            long r7 = com.applovin.impl.yp.c(r26, r28, r30)
            r10 = 1
            int r9 = com.applovin.impl.yp.b((long[]) r12, (long) r2, (boolean) r10, (boolean) r10)
            r1[r5] = r9
            long r2 = r2 + r7
            r8 = r16
            r7 = 0
            int r2 = com.applovin.impl.yp.a((long[]) r12, (long) r2, (boolean) r8, (boolean) r7)
            r0[r5] = r2
        L_0x03f8:
            r2 = r1[r5]
            r3 = r0[r5]
            if (r2 >= r3) goto L_0x0408
            r9 = r13[r2]
            r9 = r9 & r10
            if (r9 != 0) goto L_0x0408
            int r2 = r2 + 1
            r1[r5] = r2
            goto L_0x03f8
        L_0x0408:
            int r9 = r3 - r2
            int r6 = r6 + r9
            r9 = r21
            if (r9 == r2) goto L_0x0411
            r2 = 1
            goto L_0x0412
        L_0x0411:
            r2 = 0
        L_0x0412:
            r2 = r40 | r2
            goto L_0x041e
        L_0x0415:
            r40 = r7
            r9 = r8
            r8 = r10
            r7 = 0
            r10 = 1
            r2 = r40
            r3 = r9
        L_0x041e:
            int r5 = r5 + 1
            r7 = r2
            r10 = r8
            r2 = r11
            r8 = r3
            r3 = r15
            goto L_0x03c3
        L_0x0426:
            r11 = r2
            r15 = r3
            r40 = r7
            r3 = r25
            r7 = 0
            r10 = 1
            if (r6 == r3) goto L_0x0432
            r8 = 1
            goto L_0x0433
        L_0x0432:
            r8 = 0
        L_0x0433:
            r2 = r40 | r8
            if (r2 == 0) goto L_0x043a
            long[] r3 = new long[r6]
            goto L_0x043b
        L_0x043a:
            r3 = r11
        L_0x043b:
            if (r2 == 0) goto L_0x0440
            int[] r4 = new int[r6]
            goto L_0x0441
        L_0x0440:
            r4 = r15
        L_0x0441:
            if (r2 == 0) goto L_0x0445
            r5 = 0
            goto L_0x0447
        L_0x0445:
            r5 = r39
        L_0x0447:
            if (r2 == 0) goto L_0x044c
            int[] r8 = new int[r6]
            goto L_0x044d
        L_0x044c:
            r8 = r13
        L_0x044d:
            long[] r6 = new long[r6]
            r40 = r5
            r39 = r15
            r9 = 0
            r15 = 0
        L_0x0456:
            long[] r5 = r14.f9816h
            int r5 = r5.length
            if (r7 >= r5) goto L_0x04eb
            long[] r5 = r14.f9817i
            r16 = r5[r7]
            r5 = r1[r7]
            r18 = r1
            r1 = r0[r7]
            r27 = r0
            if (r2 == 0) goto L_0x0479
            int r0 = r1 - r5
            java.lang.System.arraycopy(r11, r5, r3, r15, r0)
            r28 = r11
            r11 = r39
            java.lang.System.arraycopy(r11, r5, r4, r15, r0)
            java.lang.System.arraycopy(r13, r5, r8, r15, r0)
            goto L_0x047d
        L_0x0479:
            r28 = r11
            r11 = r39
        L_0x047d:
            r0 = r40
        L_0x047f:
            if (r5 >= r1) goto L_0x04c7
            r30 = r7
            r29 = r8
            long r7 = r14.f9812d
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r9
            r25 = r7
            long r7 = com.applovin.impl.yp.c(r21, r23, r25)
            r21 = r12[r5]
            r23 = r12
            r39 = r13
            long r12 = r21 - r16
            r21 = r9
            r9 = 0
            long r31 = java.lang.Math.max(r9, r12)
            long r12 = r14.f9811c
            r33 = 1000000(0xf4240, double:4.940656E-318)
            r35 = r12
            long r12 = com.applovin.impl.yp.c(r31, r33, r35)
            long r7 = r7 + r12
            r6[r15] = r7
            if (r2 == 0) goto L_0x04b8
            r7 = r4[r15]
            if (r7 <= r0) goto L_0x04b8
            r0 = r11[r5]
        L_0x04b8:
            int r15 = r15 + 1
            int r5 = r5 + 1
            r13 = r39
            r9 = r21
            r12 = r23
            r8 = r29
            r7 = r30
            goto L_0x047f
        L_0x04c7:
            r30 = r7
            r29 = r8
            r21 = r9
            r23 = r12
            r39 = r13
            r9 = 0
            long[] r1 = r14.f9816h
            r7 = r1[r30]
            long r7 = r21 + r7
            int r1 = r30 + 1
            r40 = r0
            r9 = r7
            r39 = r11
            r0 = r27
            r11 = r28
            r8 = r29
            r7 = r1
            r1 = r18
            goto L_0x0456
        L_0x04eb:
            r29 = r8
            r21 = r9
            long r0 = r14.f9812d
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r25 = r0
            long r7 = com.applovin.impl.yp.c(r21, r23, r25)
            com.applovin.impl.so r9 = new com.applovin.impl.so
            r0 = r9
            r1 = r38
            r2 = r3
            r3 = r4
            r4 = r40
            r5 = r6
            r6 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x050a:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            com.applovin.impl.ah r0 = com.applovin.impl.ah.a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.j1.a(com.applovin.impl.mo, com.applovin.impl.i1$a, com.applovin.impl.x9):com.applovin.impl.so");
    }

    private static c a(yg ygVar, int i10, int i11, String str, w6 w6Var, boolean z10) {
        int i12;
        yg ygVar2 = ygVar;
        int i13 = i10;
        ygVar2.f(12);
        int j10 = ygVar.j();
        c cVar = new c(j10);
        for (int i14 = 0; i14 < j10; i14++) {
            int d10 = ygVar.d();
            int j11 = ygVar.j();
            l8.a(j11 > 0, "childAtomSize must be positive");
            int j12 = ygVar.j();
            if (j12 == 1635148593 || j12 == 1635148595 || j12 == 1701733238 || j12 == 1831958048 || j12 == 1836070006 || j12 == 1752589105 || j12 == 1751479857 || j12 == 1932670515 || j12 == 1211250227 || j12 == 1987063864 || j12 == 1987063865 || j12 == 1635135537 || j12 == 1685479798 || j12 == 1685479729 || j12 == 1685481573 || j12 == 1685481521) {
                i12 = d10;
                a(ygVar, j12, i12, j11, i10, i11, w6Var, cVar, i14);
            } else if (j12 == 1836069985 || j12 == 1701733217 || j12 == 1633889587 || j12 == 1700998451 || j12 == 1633889588 || j12 == 1685353315 || j12 == 1685353317 || j12 == 1685353320 || j12 == 1685353324 || j12 == 1685353336 || j12 == 1935764850 || j12 == 1935767394 || j12 == 1819304813 || j12 == 1936684916 || j12 == 1953984371 || j12 == 778924082 || j12 == 778924083 || j12 == 1835557169 || j12 == 1835560241 || j12 == 1634492771 || j12 == 1634492791 || j12 == 1970037111 || j12 == 1332770163 || j12 == 1716281667) {
                i12 = d10;
                a(ygVar, j12, d10, j11, i10, str, z10, w6Var, cVar, i14);
            } else {
                if (j12 == 1414810956 || j12 == 1954034535 || j12 == 2004251764 || j12 == 1937010800 || j12 == 1664495672) {
                    a(ygVar, j12, d10, j11, i10, str, cVar);
                } else if (j12 == 1835365492) {
                    a(ygVar2, j12, d10, i13, cVar);
                } else if (j12 == 1667329389) {
                    cVar.f8646b = new d9.b().h(i13).f("application/x-camera-motion").a();
                }
                i12 = d10;
            }
            ygVar2.f(i12 + j11);
        }
        return cVar;
    }

    private static void a(yg ygVar, int i10, int i11, int i12, int i13, String str, c cVar) {
        ygVar.f(i11 + 16);
        String str2 = "application/ttml+xml";
        ab abVar = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = i12 - 16;
                byte[] bArr = new byte[i14];
                ygVar.a(bArr, 0, i14);
                abVar = ab.a((Object) bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else if (i10 == 1664495672) {
                cVar.f8648d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f8646b = new d9.b().h(i13).f(str2).e(str).a(j10).a((List) abVar).a();
    }

    private static mo a(i1.a aVar, i1.b bVar, long j10, w6 w6Var, boolean z10, boolean z11) {
        long j11;
        i1.b bVar2;
        long[] jArr;
        long[] jArr2;
        i1.a d10;
        Pair a10;
        i1.a aVar2 = aVar;
        i1.a aVar3 = (i1.a) a1.a((Object) aVar2.d(1835297121));
        int a11 = a(c(((i1.b) a1.a((Object) aVar3.e(1751411826))).f8407b));
        if (a11 == -1) {
            return null;
        }
        f f10 = f(((i1.b) a1.a((Object) aVar2.e(1953196132))).f8407b);
        long j12 = -9223372036854775807L;
        if (j10 == -9223372036854775807L) {
            bVar2 = bVar;
            j11 = f10.f8658b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long e10 = e(bVar2.f8407b);
        if (j11 != -9223372036854775807L) {
            j12 = yp.c(j11, 1000000, e10);
        }
        long j13 = j12;
        Pair d11 = d(((i1.b) a1.a((Object) aVar3.e(1835296868))).f8407b);
        c a12 = a(((i1.b) a1.a((Object) ((i1.a) a1.a((Object) ((i1.a) a1.a((Object) aVar3.d(1835626086))).d(1937007212))).e(1937011556))).f8407b, f10.f8657a, f10.f8659c, (String) d11.second, w6Var, z11);
        if (z10 || (d10 = aVar2.d(1701082227)) == null || (a10 = a(d10)) == null) {
            jArr2 = null;
            jArr = null;
        } else {
            jArr = (long[]) a10.second;
            jArr2 = (long[]) a10.first;
        }
        if (a12.f8646b == null) {
            return null;
        }
        return new mo(f10.f8657a, a11, ((Long) d11.first).longValue(), e10, j13, a12.f8646b, a12.f8648d, a12.f8645a, a12.f8647c, jArr2, jArr);
    }

    public static Pair a(i1.b bVar) {
        yg ygVar = bVar.f8407b;
        ygVar.f(8);
        we weVar = null;
        we weVar2 = null;
        while (ygVar.a() >= 8) {
            int d10 = ygVar.d();
            int j10 = ygVar.j();
            int j11 = ygVar.j();
            if (j11 == 1835365473) {
                ygVar.f(d10);
                weVar = e(ygVar, d10 + j10);
            } else if (j11 == 1936553057) {
                ygVar.f(d10);
                weVar2 = d(ygVar, d10 + j10);
            }
            ygVar.f(d10 + j10);
        }
        return Pair.create(weVar, weVar2);
    }

    private static void a(yg ygVar, int i10, int i11, int i12, int i13, int i14, w6 w6Var, c cVar, int i15) {
        w6 w6Var2;
        String str;
        yg ygVar2 = ygVar;
        int i16 = i11;
        int i17 = i12;
        w6 w6Var3 = w6Var;
        c cVar2 = cVar;
        ygVar2.f(i16 + 16);
        ygVar2.g(16);
        int C = ygVar.C();
        int C2 = ygVar.C();
        ygVar2.g(50);
        int d10 = ygVar.d();
        int i18 = i10;
        if (i18 == 1701733238) {
            Pair d11 = d(ygVar2, i16, i17);
            if (d11 != null) {
                i18 = ((Integer) d11.first).intValue();
                if (w6Var3 == null) {
                    w6Var3 = null;
                } else {
                    w6Var3 = w6Var3.a(((no) d11.second).f10008b);
                }
                cVar2.f8645a[i15] = (no) d11.second;
            }
            ygVar2.f(d10);
        }
        String str2 = "video/3gpp";
        String str3 = i18 == 1831958048 ? "video/mpeg" : i18 == 1211250227 ? str2 : null;
        int i19 = -1;
        float f10 = 1.0f;
        String str4 = null;
        List list = null;
        byte[] bArr = null;
        p3 p3Var = null;
        boolean z10 = false;
        while (true) {
            if (d10 - i16 >= i17) {
                w6Var2 = w6Var3;
                break;
            }
            ygVar2.f(d10);
            int d12 = ygVar.d();
            String str5 = str2;
            int j10 = ygVar.j();
            if (j10 == 0) {
                w6Var2 = w6Var3;
                if (ygVar.d() - i16 == i17) {
                    break;
                }
            } else {
                w6Var2 = w6Var3;
            }
            l8.a(j10 > 0, "childAtomSize must be positive");
            int j11 = ygVar.j();
            if (j11 == 1635148611) {
                l8.a(str3 == null, (String) null);
                ygVar2.f(d12 + 8);
                v1 b10 = v1.b(ygVar);
                list = b10.f12650a;
                cVar2.f8647c = b10.f12651b;
                if (!z10) {
                    f10 = b10.f12654e;
                }
                str4 = b10.f12655f;
                str = MimeTypes.VIDEO_H264;
            } else if (j11 == 1752589123) {
                l8.a(str3 == null, (String) null);
                ygVar2.f(d12 + 8);
                ka a10 = ka.a(ygVar);
                list = a10.f8935a;
                cVar2.f8647c = a10.f8936b;
                str4 = a10.f8937c;
                str = MimeTypes.VIDEO_H265;
            } else if (j11 == 1685480259 || j11 == 1685485123) {
                v6 a11 = v6.a(ygVar);
                if (a11 != null) {
                    str4 = a11.f12711c;
                    str3 = "video/dolby-vision";
                }
                d10 += j10;
                ygVar2 = ygVar;
                i16 = i11;
                i17 = i12;
                str2 = str5;
                w6Var3 = w6Var2;
            } else if (j11 == 1987076931) {
                l8.a(str3 == null, (String) null);
                str = i18 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
            } else {
                if (j11 == 1635135811) {
                    l8.a(str3 == null, (String) null);
                    str3 = MimeTypes.VIDEO_AV1;
                } else if (j11 == 1681012275) {
                    l8.a(str3 == null, (String) null);
                    str3 = str5;
                } else if (j11 == 1702061171) {
                    l8.a(str3 == null, (String) null);
                    Pair a12 = a(ygVar2, d12);
                    String str6 = (String) a12.first;
                    byte[] bArr2 = (byte[]) a12.second;
                    if (bArr2 != null) {
                        list = ab.a((Object) bArr2);
                    }
                    str3 = str6;
                } else if (j11 == 1885434736) {
                    f10 = c(ygVar2, d12);
                    z10 = true;
                } else if (j11 == 1937126244) {
                    bArr = c(ygVar2, d12, j10);
                } else if (j11 == 1936995172) {
                    int w10 = ygVar.w();
                    ygVar2.g(3);
                    if (w10 == 0) {
                        int w11 = ygVar.w();
                        if (w11 == 0) {
                            i19 = 0;
                        } else if (w11 == 1) {
                            i19 = 1;
                        } else if (w11 == 2) {
                            i19 = 2;
                        } else if (w11 == 3) {
                            i19 = 3;
                        }
                    }
                } else if (j11 == 1668246642) {
                    int j12 = ygVar.j();
                    boolean z11 = j12 == 1852009592;
                    if (z11 || j12 == 1852009571) {
                        int C3 = ygVar.C();
                        int C4 = ygVar.C();
                        ygVar2.g(2);
                        p3Var = new p3(p3.a(C3), z11 && (ygVar.w() & 128) != 0 ? 1 : 2, p3.b(C4), (byte[]) null);
                    } else {
                        kc.d("AtomParsers", "Unsupported color type: " + i1.a(j12));
                    }
                }
                d10 += j10;
                ygVar2 = ygVar;
                i16 = i11;
                i17 = i12;
                str2 = str5;
                w6Var3 = w6Var2;
            }
            str3 = str;
            d10 += j10;
            ygVar2 = ygVar;
            i16 = i11;
            i17 = i12;
            str2 = str5;
            w6Var3 = w6Var2;
        }
        if (str3 != null) {
            cVar2.f8646b = new d9.b().h(i13).f(str3).a(str4).q(C).g(C2).b(f10).m(i14).a(bArr).p(i19).a(list).a(w6Var2).a(p3Var).a();
        }
    }

    public static List a(i1.a aVar, x9 x9Var, long j10, w6 w6Var, boolean z10, boolean z11, Function function) {
        i1.a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVar2.f8406d.size(); i10++) {
            i1.a aVar3 = (i1.a) aVar2.f8406d.get(i10);
            if (aVar3.f8403a != 1953653099) {
                x9 x9Var2 = x9Var;
                Function function2 = function;
            } else {
                mo moVar = (mo) function.apply(a(aVar3, (i1.b) a1.a((Object) aVar.e(1836476516)), j10, w6Var, z10, z11));
                if (moVar == null) {
                    x9 x9Var3 = x9Var;
                } else {
                    x9 x9Var4 = x9Var;
                    arrayList.add(a(moVar, (i1.a) a1.a((Object) ((i1.a) a1.a((Object) ((i1.a) a1.a((Object) aVar3.d(1835297121))).d(1835626086))).d(1937007212)), x9Var));
                }
            }
        }
        return arrayList;
    }
}
