package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class uf {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f12561a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f12562b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    private static final Object f12563c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static int[] f12564d = new int[10];

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12565a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12566b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f12567c;

        public a(int i10, int i11, boolean z10) {
            this.f12565a = i10;
            this.f12566b = i11;
            this.f12567c = z10;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f12568a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12569b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12570c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12571d;

        /* renamed from: e  reason: collision with root package name */
        public final int f12572e;

        /* renamed from: f  reason: collision with root package name */
        public final int f12573f;

        /* renamed from: g  reason: collision with root package name */
        public final float f12574g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f12575h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f12576i;

        /* renamed from: j  reason: collision with root package name */
        public final int f12577j;

        /* renamed from: k  reason: collision with root package name */
        public final int f12578k;

        /* renamed from: l  reason: collision with root package name */
        public final int f12579l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f12580m;

        public b(int i10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f12568a = i10;
            this.f12569b = i11;
            this.f12570c = i12;
            this.f12571d = i13;
            this.f12572e = i14;
            this.f12573f = i15;
            this.f12574g = f10;
            this.f12575h = z10;
            this.f12576i = z11;
            this.f12577j = i16;
            this.f12578k = i17;
            this.f12579l = i18;
            this.f12580m = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i10) {
        return bArr[i10 + 3] & Ascii.US;
    }

    public static int c(byte[] bArr, int i10) {
        int i11;
        synchronized (f12563c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                try {
                    i12 = a(bArr, i12, i10);
                    if (i12 < i10) {
                        int[] iArr = f12564d;
                        if (iArr.length <= i13) {
                            f12564d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f12564d[i13] = i12;
                        i12 += 3;
                        i13++;
                    }
                } finally {
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f12564d[i16] - i14;
                System.arraycopy(bArr, i14, bArr, i15, i17);
                int i18 = i15 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i15 = i18 + 2;
                bArr[i19] = 0;
                i14 += i17 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i15, i11 - i15);
        }
        return i11;
    }

    public static a b(byte[] bArr, int i10, int i11) {
        zg zgVar = new zg(bArr, i10, i11);
        zgVar.d(8);
        int f10 = zgVar.f();
        int f11 = zgVar.f();
        zgVar.g();
        return new a(f10, f11, zgVar.c());
    }

    public static void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 < position) {
                byte b10 = byteBuffer.get(i10) & 255;
                if (i11 == 3) {
                    if (b10 == 1 && (byteBuffer.get(i12) & Ascii.US) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i10 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b10 == 0) {
                    i11++;
                }
                if (b10 != 0) {
                    i11 = 0;
                }
                i10 = i12;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static int a(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        boolean z10 = false;
        a1.b(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        } else if (i12 <= 2 || !zArr[2] || bArr[i10] != 0 || bArr[i10 + 1] != 1) {
            int i13 = i11 - 1;
            int i14 = i10 + 2;
            while (i14 < i13) {
                byte b10 = bArr[i14];
                if ((b10 & 254) == 0) {
                    int i15 = i14 - 2;
                    if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                        a(zArr);
                        return i15;
                    }
                    i14 -= 2;
                }
                i14 += 3;
            }
            zArr[0] = i12 <= 2 ? !(i12 != 2 ? !zArr[1] || bArr[i13] != 1 : !(zArr[2] && bArr[i11 + -2] == 0 && bArr[i13] == 1)) : bArr[i11 + -3] == 0 && bArr[i11 + -2] == 0 && bArr[i13] == 1;
            zArr[1] = i12 <= 1 ? !(!zArr[2] || bArr[i13] != 0) : bArr[i11 + -2] == 0 && bArr[i13] == 0;
            if (bArr[i13] == 0) {
                z10 = true;
            }
            zArr[2] = z10;
            return i11;
        } else {
            a(zArr);
            return i10 - 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.applovin.impl.uf.b c(byte[] r22, int r23, int r24) {
        /*
            com.applovin.impl.zg r0 = new com.applovin.impl.zg
            r1 = r22
            r2 = r23
            r3 = r24
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.d(r1)
            int r3 = r0.b(r1)
            int r4 = r0.b(r1)
            int r5 = r0.b(r1)
            int r6 = r0.f()
            r2 = 3
            r9 = 1
            r10 = 100
            if (r3 == r10) goto L_0x004e
            r10 = 110(0x6e, float:1.54E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 122(0x7a, float:1.71E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 244(0xf4, float:3.42E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 44
            if (r3 == r10) goto L_0x004e
            r10 = 83
            if (r3 == r10) goto L_0x004e
            r10 = 86
            if (r3 == r10) goto L_0x004e
            r10 = 118(0x76, float:1.65E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 128(0x80, float:1.794E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 138(0x8a, float:1.93E-43)
            if (r3 != r10) goto L_0x004b
            goto L_0x004e
        L_0x004b:
            r10 = 1
            r11 = 0
            goto L_0x0087
        L_0x004e:
            int r10 = r0.f()
            if (r10 != r2) goto L_0x0059
            boolean r11 = r0.c()
            goto L_0x005a
        L_0x0059:
            r11 = 0
        L_0x005a:
            r0.f()
            r0.f()
            r0.g()
            boolean r12 = r0.c()
            if (r12 == 0) goto L_0x0087
            if (r10 == r2) goto L_0x006e
            r12 = 8
            goto L_0x0070
        L_0x006e:
            r12 = 12
        L_0x0070:
            r13 = 0
        L_0x0071:
            if (r13 >= r12) goto L_0x0087
            boolean r14 = r0.c()
            if (r14 == 0) goto L_0x0084
            r14 = 6
            if (r13 >= r14) goto L_0x007f
            r14 = 16
            goto L_0x0081
        L_0x007f:
            r14 = 64
        L_0x0081:
            a((com.applovin.impl.zg) r0, (int) r14)
        L_0x0084:
            int r13 = r13 + 1
            goto L_0x0071
        L_0x0087:
            int r12 = r0.f()
            int r12 = r12 + 4
            int r13 = r0.f()
            if (r13 != 0) goto L_0x009a
            int r14 = r0.f()
            int r14 = r14 + 4
            goto L_0x00bb
        L_0x009a:
            if (r13 != r9) goto L_0x00ba
            boolean r14 = r0.c()
            r0.e()
            r0.e()
            int r15 = r0.f()
            long r1 = (long) r15
            r15 = 0
        L_0x00ac:
            long r7 = (long) r15
            int r17 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r17 >= 0) goto L_0x00b7
            r0.f()
            int r15 = r15 + 1
            goto L_0x00ac
        L_0x00b7:
            r15 = r14
            r14 = 0
            goto L_0x00bc
        L_0x00ba:
            r14 = 0
        L_0x00bb:
            r15 = 0
        L_0x00bc:
            r0.f()
            r0.g()
            int r1 = r0.f()
            int r1 = r1 + r9
            int r2 = r0.f()
            int r2 = r2 + r9
            boolean r16 = r0.c()
            int r7 = 2 - r16
            int r2 = r2 * r7
            if (r16 != 0) goto L_0x00d9
            r0.g()
        L_0x00d9:
            r0.g()
            r8 = 16
            int r1 = r1 * 16
            int r2 = r2 * 16
            boolean r8 = r0.c()
            if (r8 == 0) goto L_0x0119
            int r8 = r0.f()
            int r17 = r0.f()
            int r18 = r0.f()
            int r19 = r0.f()
            if (r10 != 0) goto L_0x00fb
            goto L_0x010e
        L_0x00fb:
            r20 = 2
            r9 = 3
            if (r10 != r9) goto L_0x0104
            r9 = 1
            r21 = 1
            goto L_0x0107
        L_0x0104:
            r9 = 1
            r21 = 2
        L_0x0107:
            if (r10 != r9) goto L_0x010a
            r9 = 2
        L_0x010a:
            int r7 = r7 * r9
            r9 = r21
        L_0x010e:
            int r8 = r8 + r17
            int r8 = r8 * r9
            int r1 = r1 - r8
            int r18 = r18 + r19
            int r18 = r18 * r7
            int r2 = r2 - r18
        L_0x0119:
            r7 = r1
            r8 = r2
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x0165
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x0165
            r2 = 8
            int r2 = r0.b(r2)
            r9 = 255(0xff, float:3.57E-43)
            if (r2 != r9) goto L_0x0146
            r9 = 16
            int r2 = r0.b(r9)
            int r0 = r0.b(r9)
            if (r2 == 0) goto L_0x0165
            if (r0 == 0) goto L_0x0165
            float r1 = (float) r2
            float r0 = (float) r0
            float r1 = r1 / r0
            r9 = r1
            goto L_0x0167
        L_0x0146:
            float[] r0 = f12562b
            int r9 = r0.length
            if (r2 >= r9) goto L_0x014f
            r0 = r0[r2]
            r9 = r0
            goto L_0x0167
        L_0x014f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "Unexpected aspect_ratio_idc value: "
            r0.append(r9)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "NalUnitUtil"
            com.applovin.impl.kc.d(r2, r0)
        L_0x0165:
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x0167:
            com.applovin.impl.uf$b r0 = new com.applovin.impl.uf$b
            r2 = r0
            r10 = r11
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.uf.c(byte[], int, int):com.applovin.impl.uf$b");
    }

    private static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int a(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    private static void a(zg zgVar, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((zgVar.e() + i12) + 256) % 256;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }

    public static boolean a(String str, byte b10) {
        if (MimeTypes.VIDEO_H264.equals(str) && (b10 & Ascii.US) == 6) {
            return true;
        }
        if (!MimeTypes.VIDEO_H265.equals(str) || ((b10 & 126) >> 1) != 39) {
            return false;
        }
        return true;
    }
}
