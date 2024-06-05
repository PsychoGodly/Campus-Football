package com.google.android.gms.internal.measurement;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
final class zzhi {
    static double zza(byte[] bArr, int i10) {
        return Double.longBitsToDouble(zzd(bArr, i10));
    }

    static float zzb(byte[] bArr, int i10) {
        return Float.intBitsToFloat(zzc(bArr, i10));
    }

    static int zzc(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << Ascii.CAN) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << Ascii.DLE);
    }

    static int zzd(byte[] bArr, int i10, zzhl zzhl) {
        int i11 = i10 + 1;
        long j10 = (long) bArr[i10];
        if (j10 >= 0) {
            zzhl.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & Ascii.DEL)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & Ascii.DEL)) << i13;
            int i15 = i14;
            b10 = b11;
            i12 = i15;
        }
        zzhl.zzb = j11;
        return i12;
    }

    static int zza(byte[] bArr, int i10, zzhl zzhl) throws zzji {
        int zzc = zzc(bArr, i10, zzhl);
        int i11 = zzhl.zza;
        if (i11 < 0) {
            throw zzji.zzf();
        } else if (i11 > bArr.length - zzc) {
            throw zzji.zzh();
        } else if (i11 == 0) {
            zzhl.zzc = zzhm.zza;
            return zzc;
        } else {
            zzhl.zzc = zzhm.zza(bArr, zzc, i11);
            return zzc + i11;
        }
    }

    static int zzb(byte[] bArr, int i10, zzhl zzhl) throws zzji {
        int zzc = zzc(bArr, i10, zzhl);
        int i11 = zzhl.zza;
        if (i11 < 0) {
            throw zzji.zzf();
        } else if (i11 == 0) {
            zzhl.zzc = MaxReward.DEFAULT_LABEL;
            return zzc;
        } else {
            zzhl.zzc = zzmh.zzb(bArr, zzc, i11);
            return zzc + i11;
        }
    }

    static int zzc(byte[] bArr, int i10, zzhl zzhl) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zza((int) b10, bArr, i11, zzhl);
        }
        zzhl.zza = b10;
        return i11;
    }

    static long zzd(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    static int zza(zzlb zzlb, byte[] bArr, int i10, int i11, int i12, zzhl zzhl) throws IOException {
        Object zza = zzlb.zza();
        int zza2 = zza(zza, zzlb, bArr, i10, i11, i12, zzhl);
        zzlb.zzc(zza);
        zzhl.zzc = zza;
        return zza2;
    }

    static int zza(zzlb zzlb, byte[] bArr, int i10, int i11, zzhl zzhl) throws IOException {
        Object zza = zzlb.zza();
        int zza2 = zza(zza, zzlb, bArr, i10, i11, zzhl);
        zzlb.zzc(zza);
        zzhl.zzc = zza;
        return zza2;
    }

    static int zza(zzlb<?> zzlb, int i10, byte[] bArr, int i11, int i12, zzjf<?> zzjf, zzhl zzhl) throws IOException {
        int zza = zza((zzlb) zzlb, bArr, i11, i12, zzhl);
        zzjf.add(zzhl.zzc);
        while (zza < i12) {
            int zzc = zzc(bArr, zza, zzhl);
            if (i10 != zzhl.zza) {
                break;
            }
            zza = zza((zzlb) zzlb, bArr, zzc, i12, zzhl);
            zzjf.add(zzhl.zzc);
        }
        return zza;
    }

    static int zza(byte[] bArr, int i10, zzjf<?> zzjf, zzhl zzhl) throws IOException {
        zzja zzja = (zzja) zzjf;
        int zzc = zzc(bArr, i10, zzhl);
        int i11 = zzhl.zza + zzc;
        while (zzc < i11) {
            zzc = zzc(bArr, zzc, zzhl);
            zzja.zzd(zzhl.zza);
        }
        if (zzc == i11) {
            return zzc;
        }
        throw zzji.zzh();
    }

    static int zza(int i10, byte[] bArr, int i11, int i12, zzlz zzlz, zzhl zzhl) throws zzji {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzd = zzd(bArr, i11, zzhl);
                zzlz.zza(i10, (Object) Long.valueOf(zzhl.zzb));
                return zzd;
            } else if (i13 == 1) {
                zzlz.zza(i10, (Object) Long.valueOf(zzd(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzc = zzc(bArr, i11, zzhl);
                int i14 = zzhl.zza;
                if (i14 < 0) {
                    throw zzji.zzf();
                } else if (i14 <= bArr.length - zzc) {
                    if (i14 == 0) {
                        zzlz.zza(i10, (Object) zzhm.zza);
                    } else {
                        zzlz.zza(i10, (Object) zzhm.zza(bArr, zzc, i14));
                    }
                    return zzc + i14;
                } else {
                    throw zzji.zzh();
                }
            } else if (i13 == 3) {
                zzlz zzd2 = zzlz.zzd();
                int i15 = (i10 & -8) | 4;
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzc2 = zzc(bArr, i11, zzhl);
                    int i17 = zzhl.zza;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = zzc2;
                        break;
                    }
                    int zza = zza(i16, bArr, zzc2, i12, zzd2, zzhl);
                    i16 = i17;
                    i11 = zza;
                }
                if (i11 > i12 || i16 != i15) {
                    throw zzji.zzg();
                }
                zzlz.zza(i10, (Object) zzd2);
                return i11;
            } else if (i13 == 5) {
                zzlz.zza(i10, (Object) Integer.valueOf(zzc(bArr, i11)));
                return i11 + 4;
            } else {
                throw zzji.zzc();
            }
        } else {
            throw zzji.zzc();
        }
    }

    static int zza(int i10, byte[] bArr, int i11, zzhl zzhl) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzhl.zza = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Ascii.DEL) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzhl.zza = i14 | (b11 << Ascii.SO);
            return i15;
        }
        int i16 = i14 | ((b11 & Ascii.DEL) << Ascii.SO);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzhl.zza = i16 | (b12 << Ascii.NAK);
            return i17;
        }
        int i18 = i16 | ((b12 & Ascii.DEL) << Ascii.NAK);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzhl.zza = i18 | (b13 << Ascii.FS);
            return i19;
        }
        int i20 = i18 | ((b13 & Ascii.DEL) << Ascii.FS);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzhl.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int zza(int i10, byte[] bArr, int i11, int i12, zzjf<?> zzjf, zzhl zzhl) {
        zzja zzja = (zzja) zzjf;
        int zzc = zzc(bArr, i11, zzhl);
        zzja.zzd(zzhl.zza);
        while (zzc < i12) {
            int zzc2 = zzc(bArr, zzc, zzhl);
            if (i10 != zzhl.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzhl);
            zzja.zzd(zzhl.zza);
        }
        return zzc;
    }

    static int zza(Object obj, zzlb zzlb, byte[] bArr, int i10, int i11, int i12, zzhl zzhl) throws IOException {
        int zza = ((zzkn) zzlb).zza(obj, bArr, i10, i11, i12, zzhl);
        zzhl.zzc = obj;
        return zza;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zza(java.lang.Object r6, com.google.android.gms.internal.measurement.zzlb r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.measurement.zzhl r11) throws java.io.IOException {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = zza((int) r9, (byte[]) r8, (int) r0, (com.google.android.gms.internal.measurement.zzhl) r11)
            int r9 = r11.zza
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.zza(r1, r2, r3, r4, r5)
            r11.zzc = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.measurement.zzji r6 = com.google.android.gms.internal.measurement.zzji.zzh()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhi.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzlb, byte[], int, int, com.google.android.gms.internal.measurement.zzhl):int");
    }

    static int zza(int i10, byte[] bArr, int i11, int i12, zzhl zzhl) throws zzji {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                return zzd(bArr, i11, zzhl);
            }
            if (i13 == 1) {
                return i11 + 8;
            }
            if (i13 == 2) {
                return zzc(bArr, i11, zzhl) + zzhl.zza;
            }
            if (i13 == 3) {
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (i11 < i12) {
                    i11 = zzc(bArr, i11, zzhl);
                    i15 = zzhl.zza;
                    if (i15 == i14) {
                        break;
                    }
                    i11 = zza(i15, bArr, i11, i12, zzhl);
                }
                if (i11 <= i12 && i15 == i14) {
                    return i11;
                }
                throw zzji.zzg();
            } else if (i13 == 5) {
                return i11 + 4;
            } else {
                throw zzji.zzc();
            }
        } else {
            throw zzji.zzc();
        }
    }
}
