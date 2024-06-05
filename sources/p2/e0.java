package p2;

import java.nio.ByteBuffer;
import java.util.Arrays;
import k4.z;
import n2.r1;
import r2.m;

/* compiled from: DtsUtil */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f21253a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f21254b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f21255c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(byte[] r7) {
        /*
            r0 = 0
            byte r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L_0x004a
            r2 = -1
            if (r1 == r2) goto L_0x0032
            r2 = 31
            if (r1 == r2) goto L_0x0021
            r1 = 5
            byte r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r4]
            goto L_0x0058
        L_0x0021:
            byte r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            byte r7 = r7[r1]
            goto L_0x0042
        L_0x0032:
            byte r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            byte r7 = r7[r1]
        L_0x0042:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L_0x005d
        L_0x004a:
            byte r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r3]
        L_0x0058:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L_0x005d:
            if (r0 == 0) goto L_0x0063
            int r7 = r7 * 16
            int r7 = r7 / 14
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.e0.a(byte[]):int");
    }

    private static z b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new z(bArr);
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
        z zVar = new z(copyOf);
        if (copyOf[0] == 31) {
            z zVar2 = new z(copyOf);
            while (zVar2.b() >= 16) {
                zVar2.r(2);
                zVar.f(zVar2.h(14), 14);
            }
        }
        zVar.n(copyOf);
        return zVar;
    }

    private static boolean c(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }

    public static boolean d(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    public static int e(ByteBuffer byteBuffer) {
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

    public static int f(byte[] bArr) {
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

    public static r1 g(byte[] bArr, String str, String str2, m mVar) {
        int i10;
        z b10 = b(bArr);
        b10.r(60);
        int i11 = f21253a[b10.h(6)];
        int i12 = f21254b[b10.h(4)];
        int h10 = b10.h(5);
        int[] iArr = f21255c;
        if (h10 >= iArr.length) {
            i10 = -1;
        } else {
            i10 = (iArr[h10] * 1000) / 2;
        }
        b10.r(10);
        return new r1.b().U(str).g0("audio/vnd.dts").I(i10).J(i11 + (b10.h(2) > 0 ? 1 : 0)).h0(i12).O(mVar).X(str2).G();
    }
}
