package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzgts {
    zzgts() {
    }

    static final String zzd(ByteBuffer byteBuffer, int i10, int i11) throws zzgqy {
        if ((((byteBuffer.limit() - i10) - i11) | i10 | i11) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (r11 < i12) {
                byte b10 = byteBuffer.get(r11);
                if (!zzgtr.zzd(b10)) {
                    break;
                }
                i10 = r11 + 1;
                cArr[i13] = (char) b10;
                i13++;
            }
            int i14 = i13;
            while (r11 < i12) {
                int i15 = r11 + 1;
                byte b11 = byteBuffer.get(r11);
                if (zzgtr.zzd(b11)) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b11;
                    r11 = i15;
                    while (true) {
                        i14 = i16;
                        if (r11 >= i12) {
                            break;
                        }
                        byte b12 = byteBuffer.get(r11);
                        if (!zzgtr.zzd(b12)) {
                            break;
                        }
                        r11++;
                        i16 = i14 + 1;
                        cArr[i14] = (char) b12;
                    }
                } else if (zzgtr.zzf(b11)) {
                    if (i15 < i12) {
                        zzgtr.zzc(b11, byteBuffer.get(i15), cArr, i14);
                        r11 = i15 + 1;
                        i14++;
                    } else {
                        throw zzgqy.zzd();
                    }
                } else if (zzgtr.zze(b11)) {
                    if (i15 < i12 - 1) {
                        int i17 = i15 + 1;
                        zzgtr.zzb(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                        r11 = i17 + 1;
                        i14++;
                    } else {
                        throw zzgqy.zzd();
                    }
                } else if (i15 < i12 - 2) {
                    int i18 = i15 + 1;
                    byte b13 = byteBuffer.get(i15);
                    int i19 = i18 + 1;
                    zzgtr.zza(b11, b13, byteBuffer.get(i18), byteBuffer.get(i19), cArr, i14);
                    i14 += 2;
                    r11 = i19 + 1;
                } else {
                    throw zzgqy.zzd();
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)}));
    }

    /* access modifiers changed from: package-private */
    public abstract int zza(int i10, byte[] bArr, int i11, int i12);

    /* access modifiers changed from: package-private */
    public abstract String zzb(byte[] bArr, int i10, int i11) throws zzgqy;

    /* access modifiers changed from: package-private */
    public final boolean zzc(byte[] bArr, int i10, int i11) {
        return zza(0, bArr, i10, i11) == 0;
    }
}
