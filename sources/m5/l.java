package m5;

import com.applovin.exoplayer2.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class l {
    public static int a(byte[] bArr, int i10, int i11, int i12) {
        int i13 = (i11 & -4) + i10;
        while (i10 < i13) {
            int i14 = ((bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << Ascii.DLE) | (bArr[i10 + 3] << Ascii.CAN)) * -862048943;
            int i15 = i12 ^ (((i14 << 15) | (i14 >>> 17)) * 461845907);
            i12 = (((i15 >>> 19) | (i15 << 13)) * 5) - 430675100;
            i10 += 4;
        }
        int i16 = i11 & 3;
        int i17 = 0;
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 == 3) {
                    i17 = (bArr[i13 + 2] & 255) << Ascii.DLE;
                }
                int i18 = i12 ^ i11;
                int i19 = (i18 ^ (i18 >>> 16)) * -2048144789;
                int i20 = (i19 ^ (i19 >>> 13)) * -1028477387;
                return i20 ^ (i20 >>> 16);
            }
            i17 |= (bArr[i13 + 1] & 255) << 8;
        }
        int i21 = ((bArr[i13] & 255) | i17) * -862048943;
        i12 ^= ((i21 >>> 17) | (i21 << 15)) * 461845907;
        int i182 = i12 ^ i11;
        int i192 = (i182 ^ (i182 >>> 16)) * -2048144789;
        int i202 = (i192 ^ (i192 >>> 13)) * -1028477387;
        return i202 ^ (i202 >>> 16);
    }
}
