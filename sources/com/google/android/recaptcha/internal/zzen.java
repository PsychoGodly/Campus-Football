package com.google.android.recaptcha.internal;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import java.io.IOException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzen {
    static int zza(byte[] bArr, int i10, zzem zzem) throws zzgy {
        int zzj = zzj(bArr, i10, zzem);
        int i11 = zzem.zza;
        if (i11 < 0) {
            throw zzgy.zzf();
        } else if (i11 > bArr.length - zzj) {
            throw zzgy.zzj();
        } else if (i11 == 0) {
            zzem.zzc = zzez.zzb;
            return zzj;
        } else {
            zzem.zzc = zzez.zzm(bArr, zzj, i11);
            return zzj + i11;
        }
    }

    static int zzb(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << Ascii.CAN) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << Ascii.DLE);
    }

    static int zzc(zzil zzil, byte[] bArr, int i10, int i11, int i12, zzem zzem) throws IOException {
        Object zze = zzil.zze();
        int zzn = zzn(zze, zzil, bArr, i10, i11, i12, zzem);
        zzil.zzf(zze);
        zzem.zzc = zze;
        return zzn;
    }

    static int zzd(zzil zzil, byte[] bArr, int i10, int i11, zzem zzem) throws IOException {
        Object zze = zzil.zze();
        int zzo = zzo(zze, zzil, bArr, i10, i11, zzem);
        zzil.zzf(zze);
        zzem.zzc = zze;
        return zzo;
    }

    static int zze(zzil zzil, int i10, byte[] bArr, int i11, int i12, zzgv zzgv, zzem zzem) throws IOException {
        int zzd = zzd(zzil, bArr, i11, i12, zzem);
        zzgv.add(zzem.zzc);
        while (zzd < i12) {
            int zzj = zzj(bArr, zzd, zzem);
            if (i10 != zzem.zza) {
                break;
            }
            zzd = zzd(zzil, bArr, zzj, i12, zzem);
            zzgv.add(zzem.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i10, zzgv zzgv, zzem zzem) throws IOException {
        zzgp zzgp = (zzgp) zzgv;
        int zzj = zzj(bArr, i10, zzem);
        int i11 = zzem.zza + zzj;
        while (zzj < i11) {
            zzj = zzj(bArr, zzj, zzem);
            zzgp.zzg(zzem.zza);
        }
        if (zzj == i11) {
            return zzj;
        }
        throw zzgy.zzj();
    }

    static int zzg(byte[] bArr, int i10, zzem zzem) throws zzgy {
        int zzj = zzj(bArr, i10, zzem);
        int i11 = zzem.zza;
        if (i11 < 0) {
            throw zzgy.zzf();
        } else if (i11 == 0) {
            zzem.zzc = MaxReward.DEFAULT_LABEL;
            return zzj;
        } else {
            zzem.zzc = new String(bArr, zzj, i11, zzgw.zzb);
            return zzj + i11;
        }
    }

    static int zzh(byte[] bArr, int i10, zzem zzem) throws zzgy {
        int zzj = zzj(bArr, i10, zzem);
        int i11 = zzem.zza;
        if (i11 < 0) {
            throw zzgy.zzf();
        } else if (i11 == 0) {
            zzem.zzc = MaxReward.DEFAULT_LABEL;
            return zzj;
        } else {
            zzem.zzc = zzju.zzd(bArr, zzj, i11);
            return zzj + i11;
        }
    }

    static int zzi(int i10, byte[] bArr, int i11, int i12, zzjg zzjg, zzem zzem) throws zzgy {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzm = zzm(bArr, i11, zzem);
                zzjg.zzj(i10, Long.valueOf(zzem.zzb));
                return zzm;
            } else if (i13 == 1) {
                zzjg.zzj(i10, Long.valueOf(zzq(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzj = zzj(bArr, i11, zzem);
                int i14 = zzem.zza;
                if (i14 < 0) {
                    throw zzgy.zzf();
                } else if (i14 <= bArr.length - zzj) {
                    if (i14 == 0) {
                        zzjg.zzj(i10, zzez.zzb);
                    } else {
                        zzjg.zzj(i10, zzez.zzm(bArr, zzj, i14));
                    }
                    return zzj + i14;
                } else {
                    throw zzgy.zzj();
                }
            } else if (i13 == 3) {
                int i15 = (i10 & -8) | 4;
                zzjg zzf = zzjg.zzf();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i11, zzem);
                    int i17 = zzem.zza;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = zzj2;
                        break;
                    }
                    int zzi = zzi(i16, bArr, zzj2, i12, zzf, zzem);
                    i16 = i17;
                    i11 = zzi;
                }
                if (i11 > i12 || i16 != i15) {
                    throw zzgy.zzg();
                }
                zzjg.zzj(i10, zzf);
                return i11;
            } else if (i13 == 5) {
                zzjg.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
                return i11 + 4;
            } else {
                throw zzgy.zzc();
            }
        } else {
            throw zzgy.zzc();
        }
    }

    static int zzj(byte[] bArr, int i10, zzem zzem) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzk(b10, bArr, i11, zzem);
        }
        zzem.zza = b10;
        return i11;
    }

    static int zzk(int i10, byte[] bArr, int i11, zzem zzem) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzem.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Ascii.DEL) << 7);
        int i15 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzem.zza = i14 | (b11 << Ascii.SO);
            return i15;
        }
        int i16 = i14 | ((b11 & Ascii.DEL) << Ascii.SO);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzem.zza = i16 | (b12 << Ascii.NAK);
            return i17;
        }
        int i18 = i16 | ((b12 & Ascii.DEL) << Ascii.NAK);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzem.zza = i18 | (b13 << Ascii.FS);
            return i19;
        }
        int i20 = i18 | ((b13 & Ascii.DEL) << Ascii.FS);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                zzem.zza = i20;
                return i21;
            }
        }
    }

    static int zzl(int i10, byte[] bArr, int i11, int i12, zzgv zzgv, zzem zzem) {
        zzgp zzgp = (zzgp) zzgv;
        int zzj = zzj(bArr, i11, zzem);
        zzgp.zzg(zzem.zza);
        while (zzj < i12) {
            int zzj2 = zzj(bArr, zzj, zzem);
            if (i10 != zzem.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzem);
            zzgp.zzg(zzem.zza);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i10, zzem zzem) {
        long j10 = (long) bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzem.zzb = j10;
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
            byte b12 = b11;
            i12 = i14;
            b10 = b12;
        }
        zzem.zzb = j11;
        return i12;
    }

    static int zzn(Object obj, zzil zzil, byte[] bArr, int i10, int i11, int i12, zzem zzem) throws IOException {
        int zzc = ((zzib) zzil).zzc(obj, bArr, i10, i11, i12, zzem);
        zzem.zzc = obj;
        return zzc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zzo(java.lang.Object r6, com.google.android.recaptcha.internal.zzil r7, byte[] r8, int r9, int r10, com.google.android.recaptcha.internal.zzem r11) throws java.io.IOException {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = zzk(r9, r8, r0, r11)
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
            r0.zzi(r1, r2, r3, r4, r5)
            r11.zzc = r6
            return r9
        L_0x001e:
            com.google.android.recaptcha.internal.zzgy r6 = com.google.android.recaptcha.internal.zzgy.zzj()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzen.zzo(java.lang.Object, com.google.android.recaptcha.internal.zzil, byte[], int, int, com.google.android.recaptcha.internal.zzem):int");
    }

    static int zzp(int i10, byte[] bArr, int i11, int i12, zzem zzem) throws zzgy {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                return zzm(bArr, i11, zzem);
            }
            if (i13 == 1) {
                return i11 + 8;
            }
            if (i13 == 2) {
                return zzj(bArr, i11, zzem) + zzem.zza;
            }
            if (i13 == 3) {
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (i11 < i12) {
                    i11 = zzj(bArr, i11, zzem);
                    i15 = zzem.zza;
                    if (i15 == i14) {
                        break;
                    }
                    i11 = zzp(i15, bArr, i11, i12, zzem);
                }
                if (i11 <= i12 && i15 == i14) {
                    return i11;
                }
                throw zzgy.zzg();
            } else if (i13 == 5) {
                return i11 + 4;
            } else {
                throw zzgy.zzc();
            }
        } else {
            throw zzgy.zzc();
        }
    }

    static long zzq(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}
