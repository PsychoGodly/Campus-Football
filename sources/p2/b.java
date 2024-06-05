package p2;

import java.nio.ByteBuffer;
import k4.a0;
import k4.n0;
import k4.z;
import n2.r1;
import r2.m;

/* compiled from: Ac3Util */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f21135a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f21136b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f21137c = {24000, 22050, 16000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f21138d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f21139e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f21140f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: p2.b$b  reason: collision with other inner class name */
    /* compiled from: Ac3Util */
    public static final class C0222b {

        /* renamed from: a  reason: collision with root package name */
        public final String f21141a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21142b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21143c;

        /* renamed from: d  reason: collision with root package name */
        public final int f21144d;

        /* renamed from: e  reason: collision with root package name */
        public final int f21145e;

        /* renamed from: f  reason: collision with root package name */
        public final int f21146f;

        /* renamed from: g  reason: collision with root package name */
        public final int f21147g;

        private C0222b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f21141a = str;
            this.f21142b = i10;
            this.f21144d = i11;
            this.f21143c = i12;
            this.f21145e = i13;
            this.f21146f = i14;
            this.f21147g = i15;
        }
    }

    private static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((n0.I(byteBuffer, i10 + 4) & -2) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    private static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f21136b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f21140f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f21139e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static r1 d(a0 a0Var, String str, String str2, m mVar) {
        z zVar = new z();
        zVar.m(a0Var);
        int i10 = f21136b[zVar.h(2)];
        zVar.r(8);
        int i11 = f21138d[zVar.h(3)];
        if (zVar.h(1) != 0) {
            i11++;
        }
        int i12 = f21139e[zVar.h(5)] * 1000;
        zVar.c();
        a0Var.T(zVar.d());
        return new r1.b().U(str).g0("audio/ac3").J(i11).h0(i10).O(mVar).X(str2).I(i12).b0(i12).G();
    }

    public static int e(ByteBuffer byteBuffer) {
        int i10 = 3;
        if (!(((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10)) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i10 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f21135a[i10] * 256;
    }

    public static C0222b f(z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        z zVar2 = zVar;
        int e10 = zVar.e();
        zVar2.r(40);
        boolean z10 = zVar2.h(5) > 10;
        zVar2.p(e10);
        int i22 = -1;
        if (z10) {
            zVar2.r(16);
            int h10 = zVar2.h(2);
            if (h10 == 0) {
                i22 = 0;
            } else if (h10 == 1) {
                i22 = 1;
            } else if (h10 == 2) {
                i22 = 2;
            }
            zVar2.r(3);
            int h11 = (zVar2.h(11) + 1) * 2;
            int h12 = zVar2.h(2);
            if (h12 == 3) {
                i18 = f21137c[zVar2.h(2)];
                i17 = 3;
                i16 = 6;
            } else {
                int h13 = zVar2.h(2);
                int i23 = f21135a[h13];
                i17 = h13;
                i18 = f21136b[h12];
                i16 = i23;
            }
            int i24 = i16 * 256;
            int a10 = a(h11, i18, i16);
            int h14 = zVar2.h(3);
            boolean g10 = zVar.g();
            int i25 = f21138d[h14] + (g10 ? 1 : 0);
            zVar2.r(10);
            if (zVar.g()) {
                zVar2.r(8);
            }
            if (h14 == 0) {
                zVar2.r(5);
                if (zVar.g()) {
                    zVar2.r(8);
                }
            }
            if (i22 == 1 && zVar.g()) {
                zVar2.r(16);
            }
            if (zVar.g()) {
                if (h14 > 2) {
                    zVar2.r(2);
                }
                if ((h14 & 1) == 0 || h14 <= 2) {
                    i20 = 6;
                } else {
                    i20 = 6;
                    zVar2.r(6);
                }
                if ((h14 & 4) != 0) {
                    zVar2.r(i20);
                }
                if (g10 && zVar.g()) {
                    zVar2.r(5);
                }
                if (i22 == 0) {
                    if (zVar.g()) {
                        i21 = 6;
                        zVar2.r(6);
                    } else {
                        i21 = 6;
                    }
                    if (h14 == 0 && zVar.g()) {
                        zVar2.r(i21);
                    }
                    if (zVar.g()) {
                        zVar2.r(i21);
                    }
                    int h15 = zVar2.h(2);
                    if (h15 == 1) {
                        zVar2.r(5);
                    } else if (h15 == 2) {
                        zVar2.r(12);
                    } else if (h15 == 3) {
                        int h16 = zVar2.h(5);
                        if (zVar.g()) {
                            zVar2.r(5);
                            if (zVar.g()) {
                                zVar2.r(4);
                            }
                            if (zVar.g()) {
                                zVar2.r(4);
                            }
                            if (zVar.g()) {
                                zVar2.r(4);
                            }
                            if (zVar.g()) {
                                zVar2.r(4);
                            }
                            if (zVar.g()) {
                                zVar2.r(4);
                            }
                            if (zVar.g()) {
                                zVar2.r(4);
                            }
                            if (zVar.g()) {
                                zVar2.r(4);
                            }
                            if (zVar.g()) {
                                if (zVar.g()) {
                                    zVar2.r(4);
                                }
                                if (zVar.g()) {
                                    zVar2.r(4);
                                }
                            }
                        }
                        if (zVar.g()) {
                            zVar2.r(5);
                            if (zVar.g()) {
                                zVar2.r(7);
                                if (zVar.g()) {
                                    zVar2.r(8);
                                }
                            }
                        }
                        zVar2.r((h16 + 2) * 8);
                        zVar.c();
                    }
                    if (h14 < 2) {
                        if (zVar.g()) {
                            zVar2.r(14);
                        }
                        if (h14 == 0 && zVar.g()) {
                            zVar2.r(14);
                        }
                    }
                    if (zVar.g()) {
                        if (i17 == 0) {
                            zVar2.r(5);
                        } else {
                            for (int i26 = 0; i26 < i16; i26++) {
                                if (zVar.g()) {
                                    zVar2.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (zVar.g()) {
                zVar2.r(5);
                if (h14 == 2) {
                    zVar2.r(4);
                }
                if (h14 >= 6) {
                    zVar2.r(2);
                }
                if (zVar.g()) {
                    zVar2.r(8);
                }
                if (h14 == 0 && zVar.g()) {
                    zVar2.r(8);
                }
                if (h12 < 3) {
                    zVar.q();
                }
            }
            if (i22 == 0 && i17 != 3) {
                zVar.q();
            }
            if (i22 != 2 || (i17 != 3 && !zVar.g())) {
                i19 = 6;
            } else {
                i19 = 6;
                zVar2.r(6);
            }
            str = (zVar.g() && zVar2.h(i19) == 1 && zVar2.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i15 = i22;
            i11 = i24;
            i12 = h11;
            i13 = i18;
            i10 = a10;
            i14 = i25;
        } else {
            zVar2.r(32);
            int h17 = zVar2.h(2);
            String str2 = h17 == 3 ? null : "audio/ac3";
            int h18 = zVar2.h(6);
            int i27 = f21139e[h18 / 2] * 1000;
            int c10 = c(h17, h18);
            zVar2.r(8);
            int h19 = zVar2.h(3);
            if (!((h19 & 1) == 0 || h19 == 1)) {
                zVar2.r(2);
            }
            if ((h19 & 4) != 0) {
                zVar2.r(2);
            }
            if (h19 == 2) {
                zVar2.r(2);
            }
            int[] iArr = f21136b;
            str = str2;
            i10 = i27;
            i12 = c10;
            i13 = h17 < iArr.length ? iArr[h17] : -1;
            i14 = f21138d[h19] + (zVar.g() ? 1 : 0);
            i15 = -1;
            i11 = 1536;
        }
        return new C0222b(str, i15, i14, i13, i12, i11, i10);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (!(((bArr[5] & 248) >> 3) > 10)) {
            return c((bArr[4] & 192) >> 6, bArr[4] & 63);
        }
        return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
    }

    public static r1 h(a0 a0Var, String str, String str2, m mVar) {
        String str3;
        z zVar = new z();
        zVar.m(a0Var);
        int h10 = zVar.h(13) * 1000;
        zVar.r(3);
        int i10 = f21136b[zVar.h(2)];
        zVar.r(10);
        int i11 = f21138d[zVar.h(3)];
        if (zVar.h(1) != 0) {
            i11++;
        }
        zVar.r(3);
        int h11 = zVar.h(4);
        zVar.r(1);
        if (h11 > 0) {
            zVar.s(6);
            if (zVar.h(1) != 0) {
                i11 += 2;
            }
            zVar.r(1);
        }
        if (zVar.b() > 7) {
            zVar.r(7);
            if (zVar.h(1) != 0) {
                str3 = "audio/eac3-joc";
                zVar.c();
                a0Var.T(zVar.d());
                return new r1.b().U(str).g0(str3).J(i11).h0(i10).O(mVar).X(str2).b0(h10).G();
            }
        }
        str3 = "audio/eac3";
        zVar.c();
        a0Var.T(zVar.d());
        return new r1.b().U(str).g0(str3).J(i11).h0(i10).O(mVar).X(str2).b0(h10).G();
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        boolean z10 = false;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        if ((bArr[7] & 255) == 187) {
            z10 = true;
        }
        return 40 << ((bArr[z10 ? (char) 9 : 8] >> 4) & 7);
    }
}
