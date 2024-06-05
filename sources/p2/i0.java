package p2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: OpusUtil */
public class i0 {
    public static List<byte[]> a(byte[] bArr) {
        long h10 = h((long) f(bArr));
        long h11 = h(3840);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b(h10));
        arrayList.add(b(h11));
        return arrayList;
    }

    private static byte[] b(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }

    public static int c(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static long d(byte b10, byte b11) {
        byte b12 = b10 & 255;
        byte b13 = b12 & 3;
        byte b14 = 2;
        if (b13 == 0) {
            b14 = 1;
        } else if (!(b13 == 1 || b13 == 2)) {
            b14 = b11 & 63;
        }
        int i10 = b12 >> 3;
        int i11 = i10 & 3;
        return ((long) b14) * ((long) (i10 >= 16 ? 2500 << i11 : i10 >= 12 ? 10000 << (i11 & 1) : i11 == 3 ? 60000 : 10000 << i11));
    }

    public static long e(byte[] bArr) {
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return d(b11, b10);
    }

    private static int f(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int g(ByteBuffer byteBuffer) {
        byte b10 = 0;
        byte b11 = byteBuffer.get(0);
        if (byteBuffer.limit() > 1) {
            b10 = byteBuffer.get(1);
        }
        return (int) ((d(b11, b10) * 48000) / 1000000);
    }

    private static long h(long j10) {
        return (j10 * 1000000000) / 48000;
    }
}
