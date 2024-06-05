package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgor {
    static int zza(byte[] bArr, int i10, zzgoq zzgoq) throws zzgqy {
        int zzj = zzj(bArr, i10, zzgoq);
        int i11 = zzgoq.zza;
        if (i11 < 0) {
            throw zzgqy.zzf();
        } else if (i11 > bArr.length - zzj) {
            throw zzgqy.zzj();
        } else if (i11 == 0) {
            zzgoq.zzc = zzgpe.zzb;
            return zzj;
        } else {
            zzgoq.zzc = zzgpe.zzw(bArr, zzj, i11);
            return zzj + i11;
        }
    }

    static int zzb(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << Ascii.CAN) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << Ascii.DLE);
    }

    static int zzc(zzgsp zzgsp, byte[] bArr, int i10, int i11, int i12, zzgoq zzgoq) throws IOException {
        Object zze = zzgsp.zze();
        int zzn = zzn(zze, zzgsp, bArr, i10, i11, i12, zzgoq);
        zzgsp.zzf(zze);
        zzgoq.zzc = zze;
        return zzn;
    }

    static int zzd(zzgsp zzgsp, byte[] bArr, int i10, int i11, zzgoq zzgoq) throws IOException {
        Object zze = zzgsp.zze();
        int zzo = zzo(zze, zzgsp, bArr, i10, i11, zzgoq);
        zzgsp.zzf(zze);
        zzgoq.zzc = zze;
        return zzo;
    }

    static int zze(zzgsp zzgsp, int i10, byte[] bArr, int i11, int i12, zzgqv zzgqv, zzgoq zzgoq) throws IOException {
        int zzd = zzd(zzgsp, bArr, i11, i12, zzgoq);
        zzgqv.add(zzgoq.zzc);
        while (zzd < i12) {
            int zzj = zzj(bArr, zzd, zzgoq);
            if (i10 != zzgoq.zza) {
                break;
            }
            zzd = zzd(zzgsp, bArr, zzj, i12, zzgoq);
            zzgqv.add(zzgoq.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i10, zzgqv zzgqv, zzgoq zzgoq) throws IOException {
        zzgqn zzgqn = (zzgqn) zzgqv;
        int zzj = zzj(bArr, i10, zzgoq);
        int i11 = zzgoq.zza + zzj;
        while (zzj < i11) {
            zzj = zzj(bArr, zzj, zzgoq);
            zzgqn.zzh(zzgoq.zza);
        }
        if (zzj == i11) {
            return zzj;
        }
        throw zzgqy.zzj();
    }

    static int zzg(byte[] bArr, int i10, zzgoq zzgoq) throws zzgqy {
        int zzj = zzj(bArr, i10, zzgoq);
        int i11 = zzgoq.zza;
        if (i11 < 0) {
            throw zzgqy.zzf();
        } else if (i11 == 0) {
            zzgoq.zzc = MaxReward.DEFAULT_LABEL;
            return zzj;
        } else {
            zzgoq.zzc = new String(bArr, zzj, i11, zzgqw.zzb);
            return zzj + i11;
        }
    }

    static int zzh(byte[] bArr, int i10, zzgoq zzgoq) throws zzgqy {
        int zzj = zzj(bArr, i10, zzgoq);
        int i11 = zzgoq.zza;
        if (i11 < 0) {
            throw zzgqy.zzf();
        } else if (i11 == 0) {
            zzgoq.zzc = MaxReward.DEFAULT_LABEL;
            return zzj;
        } else {
            zzgoq.zzc = zzgtv.zzh(bArr, zzj, i11);
            return zzj + i11;
        }
    }

    static int zzi(int i10, byte[] bArr, int i11, int i12, zzgth zzgth, zzgoq zzgoq) throws zzgqy {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzm = zzm(bArr, i11, zzgoq);
                zzgth.zzj(i10, Long.valueOf(zzgoq.zzb));
                return zzm;
            } else if (i13 == 1) {
                zzgth.zzj(i10, Long.valueOf(zzp(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzj = zzj(bArr, i11, zzgoq);
                int i14 = zzgoq.zza;
                if (i14 < 0) {
                    throw zzgqy.zzf();
                } else if (i14 <= bArr.length - zzj) {
                    if (i14 == 0) {
                        zzgth.zzj(i10, zzgpe.zzb);
                    } else {
                        zzgth.zzj(i10, zzgpe.zzw(bArr, zzj, i14));
                    }
                    return zzj + i14;
                } else {
                    throw zzgqy.zzj();
                }
            } else if (i13 == 3) {
                int i15 = (i10 & -8) | 4;
                zzgth zzf = zzgth.zzf();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i11, zzgoq);
                    int i17 = zzgoq.zza;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = zzj2;
                        break;
                    }
                    int zzi = zzi(i16, bArr, zzj2, i12, zzf, zzgoq);
                    i16 = i17;
                    i11 = zzi;
                }
                if (i11 > i12 || i16 != i15) {
                    throw zzgqy.zzg();
                }
                zzgth.zzj(i10, zzf);
                return i11;
            } else if (i13 == 5) {
                zzgth.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
                return i11 + 4;
            } else {
                throw zzgqy.zzc();
            }
        } else {
            throw zzgqy.zzc();
        }
    }

    static int zzj(byte[] bArr, int i10, zzgoq zzgoq) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzk(b10, bArr, i11, zzgoq);
        }
        zzgoq.zza = b10;
        return i11;
    }

    static int zzk(int i10, byte[] bArr, int i11, zzgoq zzgoq) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzgoq.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Ascii.DEL) << 7);
        int i15 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzgoq.zza = i14 | (b11 << Ascii.SO);
            return i15;
        }
        int i16 = i14 | ((b11 & Ascii.DEL) << Ascii.SO);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzgoq.zza = i16 | (b12 << Ascii.NAK);
            return i17;
        }
        int i18 = i16 | ((b12 & Ascii.DEL) << Ascii.NAK);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzgoq.zza = i18 | (b13 << Ascii.FS);
            return i19;
        }
        int i20 = i18 | ((b13 & Ascii.DEL) << Ascii.FS);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                zzgoq.zza = i20;
                return i21;
            }
        }
    }

    static int zzl(int i10, byte[] bArr, int i11, int i12, zzgqv zzgqv, zzgoq zzgoq) {
        zzgqn zzgqn = (zzgqn) zzgqv;
        int zzj = zzj(bArr, i11, zzgoq);
        zzgqn.zzh(zzgoq.zza);
        while (zzj < i12) {
            int zzj2 = zzj(bArr, zzj, zzgoq);
            if (i10 != zzgoq.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzgoq);
            zzgqn.zzh(zzgoq.zza);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i10, zzgoq zzgoq) {
        long j10 = (long) bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzgoq.zzb = j10;
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
        zzgoq.zzb = j11;
        return i12;
    }

    static int zzn(Object obj, zzgsp zzgsp, byte[] bArr, int i10, int i11, int i12, zzgoq zzgoq) throws IOException {
        int zzc = ((zzgrz) zzgsp).zzc(obj, bArr, i10, i11, i12, zzgoq);
        zzgoq.zzc = obj;
        return zzc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zzo(java.lang.Object r6, com.google.android.gms.internal.ads.zzgsp r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.ads.zzgoq r11) throws java.io.IOException {
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
            com.google.android.gms.internal.ads.zzgqy r6 = com.google.android.gms.internal.ads.zzgqy.zzj()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgor.zzo(java.lang.Object, com.google.android.gms.internal.ads.zzgsp, byte[], int, int, com.google.android.gms.internal.ads.zzgoq):int");
    }

    static long zzp(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}
