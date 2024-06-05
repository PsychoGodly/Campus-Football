package com.applovin.impl;

import com.applovin.impl.d9;
import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class d7 {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f7134a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f7135b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f7136c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(byte[] r7) {
        /*
            r0 = 0
            byte r1 = r7[r0]
            r2 = 6
            r3 = 7
            r4 = 1
            r5 = 4
            r6 = -2
            if (r1 == r6) goto L_0x004a
            r6 = -1
            if (r1 == r6) goto L_0x0032
            r6 = 31
            if (r1 == r6) goto L_0x0021
            r1 = 5
            byte r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r5
            r1 = r1 | r2
            byte r7 = r7[r3]
            goto L_0x0058
        L_0x0021:
            byte r0 = r7[r2]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r5
            r0 = r0 | r1
            r1 = 8
            byte r7 = r7[r1]
            goto L_0x0042
        L_0x0032:
            byte r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r5
            r0 = r0 | r1
            r1 = 9
            byte r7 = r7[r1]
        L_0x0042:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r4
            r0 = 1
            goto L_0x005d
        L_0x004a:
            byte r1 = r7[r5]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r3 = r7[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r5
            r1 = r1 | r3
            byte r7 = r7[r2]
        L_0x0058:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r5
            r7 = r7 | r1
            int r7 = r7 + r4
        L_0x005d:
            if (r0 == 0) goto L_0x0063
            int r7 = r7 * 16
            int r7 = r7 / 14
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d7.a(byte[]):int");
    }

    public static boolean a(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    private static xg b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new xg(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (c(copyOf)) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte b10 = copyOf[i10];
                int i11 = i10 + 1;
                copyOf[i10] = copyOf[i11];
                copyOf[i11] = b10;
            }
        }
        xg xgVar = new xg(copyOf);
        if (copyOf[0] == 31) {
            xg xgVar2 = new xg(copyOf);
            while (xgVar2.b() >= 16) {
                xgVar2.d(2);
                xgVar.a(xgVar2.a(14), 14);
            }
        }
        xgVar.a(copyOf);
        return xgVar;
    }

    private static boolean c(byte[] bArr) {
        byte b10 = bArr[0];
        return b10 == -2 || b10 == -1;
    }

    public static int d(byte[] bArr) {
        byte b10;
        int i10;
        byte b11;
        int i11;
        byte b12;
        byte b13 = bArr[0];
        if (b13 != -2) {
            if (b13 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b12 = bArr[7];
            } else if (b13 != 31) {
                i11 = (bArr[4] & 1) << 6;
                b11 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b12 = bArr[6];
            }
            b10 = b12 & 60;
            return (((b10 >> 2) | i10) + 1) * 32;
        }
        i11 = (bArr[5] & 1) << 6;
        b11 = bArr[4];
        b10 = b11 & 252;
        return (((b10 >> 2) | i10) + 1) * 32;
    }

    public static int a(ByteBuffer byteBuffer) {
        byte b10;
        int i10;
        byte b11;
        int i11;
        byte b12;
        int position = byteBuffer.position();
        byte b13 = byteBuffer.get(position);
        if (b13 != -2) {
            if (b13 == -1) {
                i10 = (byteBuffer.get(position + 4) & 7) << 4;
                b12 = byteBuffer.get(position + 7);
            } else if (b13 != 31) {
                i11 = (byteBuffer.get(position + 4) & 1) << 6;
                b11 = byteBuffer.get(position + 5);
            } else {
                i10 = (byteBuffer.get(position + 5) & 7) << 4;
                b12 = byteBuffer.get(position + 6);
            }
            b10 = b12 & 60;
            return (((b10 >> 2) | i10) + 1) * 32;
        }
        i11 = (byteBuffer.get(position + 5) & 1) << 6;
        b11 = byteBuffer.get(position + 4);
        b10 = b11 & 252;
        return (((b10 >> 2) | i10) + 1) * 32;
    }

    public static d9 a(byte[] bArr, String str, String str2, w6 w6Var) {
        int i10;
        xg b10 = b(bArr);
        b10.d(60);
        int i11 = f7134a[b10.a(6)];
        int i12 = f7135b[b10.a(4)];
        int a10 = b10.a(5);
        int[] iArr = f7136c;
        if (a10 >= iArr.length) {
            i10 = -1;
        } else {
            i10 = (iArr[a10] * 1000) / 2;
        }
        b10.d(10);
        return new d9.b().c(str).f("audio/vnd.dts").b(i10).c(i11 + (b10.a(2) > 0 ? 1 : 0)).n(i12).a(w6Var).e(str2).a();
    }
}
