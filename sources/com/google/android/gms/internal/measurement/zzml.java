package com.google.android.gms.internal.measurement;

import com.applovin.exoplayer2.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
final class zzml extends zzmi {
    zzml() {
    }

    /* access modifiers changed from: package-private */
    public final int zza(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char charAt;
        int length = charSequence.length();
        int i15 = i11 + i10;
        int i16 = 0;
        while (i16 < length && (i14 = i16 + i10) < i15 && (charAt = charSequence.charAt(i16)) < 128) {
            bArr[i14] = (byte) charAt;
            i16++;
        }
        if (i16 == length) {
            return i10 + length;
        }
        int i17 = i10 + i16;
        while (i16 < length) {
            char charAt2 = charSequence.charAt(i16);
            if (charAt2 < 128 && i17 < i15) {
                i13 = i17 + 1;
                bArr[i17] = (byte) charAt2;
            } else if (charAt2 < 2048 && i17 <= i15 - 2) {
                int i18 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                i17 = i18 + 1;
                bArr[i18] = (byte) ((charAt2 & '?') | 128);
                i16++;
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i17 <= i15 - 3) {
                int i19 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 >>> 12) | 480);
                int i20 = i19 + 1;
                bArr[i19] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i13 = i20 + 1;
                bArr[i20] = (byte) ((charAt2 & '?') | 128);
            } else if (i17 <= i15 - 4) {
                int i21 = i16 + 1;
                if (i21 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i21);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i22 = i17 + 1;
                        bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                        int i23 = i22 + 1;
                        bArr[i22] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i24 = i23 + 1;
                        bArr[i23] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i17 = i24 + 1;
                        bArr[i24] = (byte) ((codePoint & 63) | 128);
                        i16 = i21;
                        i16++;
                    } else {
                        i16 = i21;
                    }
                }
                throw new zzmk(i16 - 1, length);
            } else if (55296 > charAt2 || charAt2 > 57343 || ((i12 = i16 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i17);
            } else {
                throw new zzmk(i16, length);
            }
            i17 = i13;
            i16++;
        }
        return i17;
    }

    /* access modifiers changed from: package-private */
    public final int zza(int i10, byte[] bArr, int i11, int i12) {
        while (r9 < i12 && bArr[r9] >= 0) {
            i11 = r9 + 1;
        }
        if (r9 >= i12) {
            return 0;
        }
        while (r9 < i12) {
            int i13 = r9 + 1;
            byte b10 = bArr[r9];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i13 >= i12) {
                        return b10;
                    }
                    if (b10 >= -62) {
                        r9 = i13 + 1;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                } else if (b10 < -16) {
                    if (i13 >= i12 - 1) {
                        return zzmh.zza(bArr, i13, i12);
                    }
                    int i14 = i13 + 1;
                    byte b11 = bArr[i13];
                    if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                        r9 = i14 + 1;
                        if (bArr[i14] > -65) {
                        }
                    }
                    return -1;
                } else if (i13 >= i12 - 2) {
                    return zzmh.zza(bArr, i13, i12);
                } else {
                    int i15 = i13 + 1;
                    byte b12 = bArr[i13];
                    if (b12 <= -65 && (((b10 << Ascii.FS) + (b12 + 112)) >> 30) == 0) {
                        int i16 = i15 + 1;
                        if (bArr[i15] <= -65) {
                            i13 = i16 + 1;
                            if (bArr[i16] > -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
            r9 = i13;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final String zza(byte[] bArr, int i10, int i11) throws zzji {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (r13 < i12) {
                byte b10 = bArr[r13];
                if (!(b10 >= 0)) {
                    break;
                }
                i10 = r13 + 1;
                zzmj.zza(b10, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (r13 < i12) {
                int i15 = r13 + 1;
                byte b11 = bArr[r13];
                if (b11 >= 0) {
                    int i16 = i14 + 1;
                    zzmj.zza(b11, cArr, i14);
                    while (i15 < i12) {
                        byte b12 = bArr[i15];
                        if (!(b12 >= 0)) {
                            break;
                        }
                        i15++;
                        zzmj.zza(b12, cArr, i16);
                        i16++;
                    }
                    r13 = i15;
                    i14 = i16;
                } else if (b11 < -32) {
                    if (i15 < i12) {
                        zzmj.zza(b11, bArr[i15], cArr, i14);
                        r13 = i15 + 1;
                        i14++;
                    } else {
                        throw zzji.zzd();
                    }
                } else if (b11 < -16) {
                    if (i15 < i12 - 1) {
                        int i17 = i15 + 1;
                        zzmj.zza(b11, bArr[i15], bArr[i17], cArr, i14);
                        r13 = i17 + 1;
                        i14++;
                    } else {
                        throw zzji.zzd();
                    }
                } else if (i15 < i12 - 2) {
                    int i18 = i15 + 1;
                    byte b13 = bArr[i15];
                    int i19 = i18 + 1;
                    zzmj.zza(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                    r13 = i19 + 1;
                    i14 = i14 + 1 + 1;
                } else {
                    throw zzji.zzd();
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)}));
    }
}
