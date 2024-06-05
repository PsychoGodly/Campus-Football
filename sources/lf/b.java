package lf;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.UnsupportedEncodingException;

/* compiled from: Base64 */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f36248a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f36249b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    public static String a(byte[] bArr) {
        return b(bArr, f36248a);
    }

    private static String b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int i12 = i10 + 1;
            bArr3[i10] = bArr2[(bArr[i11] & 255) >> 2];
            int i13 = i12 + 1;
            int i14 = i11 + 1;
            bArr3[i12] = bArr2[((bArr[i11] & 3) << 4) | ((bArr[i14] & 255) >> 4)];
            int i15 = i13 + 1;
            int i16 = i11 + 2;
            bArr3[i13] = bArr2[((bArr[i14] & Ascii.SI) << 2) | ((bArr[i16] & 255) >> 6)];
            i10 = i15 + 1;
            bArr3[i15] = bArr2[bArr[i16] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i17 = i10 + 1;
            bArr3[i10] = bArr2[(bArr[length] & 255) >> 2];
            int i18 = i17 + 1;
            bArr3[i17] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i18] = 61;
            bArr3[i18 + 1] = 61;
        } else if (length2 == 2) {
            int i19 = i10 + 1;
            bArr3[i10] = bArr2[(bArr[length] & 255) >> 2];
            int i20 = i19 + 1;
            int i21 = length + 1;
            bArr3[i19] = bArr2[((bArr[i21] & 255) >> 4) | ((bArr[length] & 3) << 4)];
            bArr3[i20] = bArr2[(bArr[i21] & Ascii.SI) << 2];
            bArr3[i20 + 1] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}
