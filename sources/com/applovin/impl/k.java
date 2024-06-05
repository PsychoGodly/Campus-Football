package com.applovin.impl;

import com.applovin.impl.d9;
import java.nio.ByteBuffer;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f8816a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f8817b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f8818c = {24000, 22050, 16000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f8819d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f8820e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f8821f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f8822a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8823b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8824c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8825d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8826e;

        /* renamed from: f  reason: collision with root package name */
        public final int f8827f;

        private b(String str, int i10, int i11, int i12, int i13, int i14) {
            this.f8822a = str;
            this.f8823b = i10;
            this.f8825d = i11;
            this.f8824c = i12;
            this.f8826e = i13;
            this.f8827f = i14;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((yp.a(byteBuffer, i10 + 4) & -2) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    public static int b(ByteBuffer byteBuffer) {
        int i10 = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i10 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f8816a[i10] * 256;
    }

    private static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f8817b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f8821f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f8820e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static d9 b(yg ygVar, String str, String str2, w6 w6Var) {
        ygVar.g(2);
        int i10 = f8817b[(ygVar.w() & 192) >> 6];
        int w10 = ygVar.w();
        int i11 = f8819d[(w10 & 14) >> 1];
        if ((w10 & 1) != 0) {
            i11++;
        }
        if (((ygVar.w() & 30) >> 1) > 0 && (2 & ygVar.w()) != 0) {
            i11 += 2;
        }
        return new d9.b().c(str).f((ygVar.a() <= 0 || (ygVar.w() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").c(i11).n(i10).a(w6Var).e(str2).a();
    }

    public static d9 a(yg ygVar, String str, String str2, w6 w6Var) {
        int i10 = f8817b[(ygVar.w() & 192) >> 6];
        int w10 = ygVar.w();
        int i11 = f8819d[(w10 & 56) >> 3];
        if ((w10 & 4) != 0) {
            i11++;
        }
        return new d9.b().c(str).f("audio/ac3").c(i11).n(i10).a(w6Var).e(str2).a();
    }

    public static b a(xg xgVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        xg xgVar2 = xgVar;
        int e10 = xgVar.e();
        xgVar2.d(40);
        boolean z10 = xgVar2.a(5) > 10;
        xgVar2.c(e10);
        int i21 = -1;
        if (z10) {
            xgVar2.d(16);
            int a10 = xgVar2.a(2);
            if (a10 == 0) {
                i21 = 0;
            } else if (a10 == 1) {
                i21 = 1;
            } else if (a10 == 2) {
                i21 = 2;
            }
            xgVar2.d(3);
            int a11 = (xgVar2.a(11) + 1) * 2;
            int a12 = xgVar2.a(2);
            if (a12 == 3) {
                i15 = f8818c[xgVar2.a(2)];
                i17 = 3;
                i16 = 6;
            } else {
                i17 = xgVar2.a(2);
                i16 = f8816a[i17];
                i15 = f8817b[a12];
            }
            int i22 = i16 * 256;
            int a13 = xgVar2.a(3);
            boolean f10 = xgVar.f();
            int i23 = f8819d[a13] + (f10 ? 1 : 0);
            xgVar2.d(10);
            if (xgVar.f()) {
                xgVar2.d(8);
            }
            if (a13 == 0) {
                xgVar2.d(5);
                if (xgVar.f()) {
                    xgVar2.d(8);
                }
            }
            if (i21 == 1 && xgVar.f()) {
                xgVar2.d(16);
            }
            if (xgVar.f()) {
                if (a13 > 2) {
                    xgVar2.d(2);
                }
                if ((a13 & 1) == 0 || a13 <= 2) {
                    i19 = 6;
                } else {
                    i19 = 6;
                    xgVar2.d(6);
                }
                if ((a13 & 4) != 0) {
                    xgVar2.d(i19);
                }
                if (f10 && xgVar.f()) {
                    xgVar2.d(5);
                }
                if (i21 == 0) {
                    if (xgVar.f()) {
                        i20 = 6;
                        xgVar2.d(6);
                    } else {
                        i20 = 6;
                    }
                    if (a13 == 0 && xgVar.f()) {
                        xgVar2.d(i20);
                    }
                    if (xgVar.f()) {
                        xgVar2.d(i20);
                    }
                    int a14 = xgVar2.a(2);
                    if (a14 == 1) {
                        xgVar2.d(5);
                    } else if (a14 == 2) {
                        xgVar2.d(12);
                    } else if (a14 == 3) {
                        int a15 = xgVar2.a(5);
                        if (xgVar.f()) {
                            xgVar2.d(5);
                            if (xgVar.f()) {
                                xgVar2.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar2.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar2.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar2.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar2.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar2.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar2.d(4);
                            }
                            if (xgVar.f()) {
                                if (xgVar.f()) {
                                    xgVar2.d(4);
                                }
                                if (xgVar.f()) {
                                    xgVar2.d(4);
                                }
                            }
                        }
                        if (xgVar.f()) {
                            xgVar2.d(5);
                            if (xgVar.f()) {
                                xgVar2.d(7);
                                if (xgVar.f()) {
                                    xgVar2.d(8);
                                }
                            }
                        }
                        xgVar2.d((a15 + 2) * 8);
                        xgVar.c();
                    }
                    if (a13 < 2) {
                        if (xgVar.f()) {
                            xgVar2.d(14);
                        }
                        if (a13 == 0 && xgVar.f()) {
                            xgVar2.d(14);
                        }
                    }
                    if (xgVar.f()) {
                        if (i17 == 0) {
                            xgVar2.d(5);
                        } else {
                            for (int i24 = 0; i24 < i16; i24++) {
                                if (xgVar.f()) {
                                    xgVar2.d(5);
                                }
                            }
                        }
                    }
                }
            }
            if (xgVar.f()) {
                xgVar2.d(5);
                if (a13 == 2) {
                    xgVar2.d(4);
                }
                if (a13 >= 6) {
                    xgVar2.d(2);
                }
                if (xgVar.f()) {
                    xgVar2.d(8);
                }
                if (a13 == 0 && xgVar.f()) {
                    xgVar2.d(8);
                }
                if (a12 < 3) {
                    xgVar.g();
                }
            }
            if (i21 == 0 && i17 != 3) {
                xgVar.g();
            }
            if (i21 != 2 || (i17 != 3 && !xgVar.f())) {
                i18 = 6;
            } else {
                i18 = 6;
                xgVar2.d(6);
            }
            str = (xgVar.f() && xgVar2.a(i18) == 1 && xgVar2.a(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i14 = i21;
            i10 = i22;
            i11 = a11;
            i12 = i15;
            i13 = i23;
        } else {
            xgVar2.d(32);
            int a16 = xgVar2.a(2);
            String str2 = a16 == 3 ? null : "audio/ac3";
            int a17 = a(a16, xgVar2.a(6));
            xgVar2.d(8);
            int a18 = xgVar2.a(3);
            if (!((a18 & 1) == 0 || a18 == 1)) {
                xgVar2.d(2);
            }
            if ((a18 & 4) != 0) {
                xgVar2.d(2);
            }
            if (a18 == 2) {
                xgVar2.d(2);
            }
            int[] iArr = f8817b;
            str = str2;
            i11 = a17;
            i12 = a16 < iArr.length ? iArr[a16] : -1;
            i13 = f8819d[a18] + (xgVar.f() ? 1 : 0);
            i14 = -1;
            i10 = 1536;
        }
        return new b(str, i14, i13, i12, i11, i10);
    }

    public static int b(byte[] bArr) {
        boolean z10 = false;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                if ((b10 & 255) == 187) {
                    z10 = true;
                }
                return 40 << ((bArr[z10 ? (char) 9 : 8] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return a((b10 & 192) >> 6, (int) b10 & 63);
    }

    public static int a(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
