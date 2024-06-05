package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgpk extends zzgpm {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl = a.e.API_PRIORITY_OTHER;

    /* synthetic */ zzgpk(InputStream inputStream, int i10, zzgpj zzgpj) {
        super((zzgpl) null);
        zzgqw.zzf(inputStream, "input");
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzJ(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.zze.read(bArr, i11, min - i11);
                if (read != -1) {
                    this.zzk += read;
                    i11 += read;
                } else {
                    throw zzgqy.zzj();
                }
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzK() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = this.zzk + i10;
        int i12 = this.zzl;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.zzh = i13;
            this.zzg = i10 - i13;
            return;
        }
        this.zzh = 0;
    }

    private final void zzL(int i10) throws IOException {
        if (zzM(i10)) {
            return;
        }
        if (i10 > (a.e.API_PRIORITY_OTHER - this.zzk) - this.zzi) {
            throw zzgqy.zzi();
        }
        throw zzgqy.zzj();
    }

    private final boolean zzM(int i10) throws IOException {
        int i11 = this.zzi;
        int i12 = i11 + i10;
        int i13 = this.zzg;
        if (i12 > i13) {
            int i14 = this.zzk;
            if (i10 > (a.e.API_PRIORITY_OTHER - i14) - i11 || i14 + i11 + i10 > this.zzl) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.zzf;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                i14 = this.zzk + i11;
                this.zzk = i14;
                i13 = this.zzg - i11;
                this.zzg = i13;
                this.zzi = 0;
            }
            try {
                int read = this.zze.read(this.zzf, i13, Math.min(4096 - i13, (a.e.API_PRIORITY_OTHER - i14) - i13));
                if (read == 0 || read < -1 || read > 4096) {
                    throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.zzg += read;
                    zzK();
                    if (this.zzg >= i10) {
                        return true;
                    }
                    return zzM(i10);
                }
            } catch (zzgqy e10) {
                e10.zzk();
                throw e10;
            }
        } else {
            throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
        }
    }

    private final byte[] zzN(int i10, boolean z10) throws IOException {
        byte[] zzO = zzO(i10);
        if (zzO != null) {
            return zzO;
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzJ = zzJ(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] bArr2 : zzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    private final byte[] zzO(int i10) throws IOException {
        if (i10 == 0) {
            return zzgqw.zzd;
        }
        if (i10 >= 0) {
            int i11 = this.zzk;
            int i12 = this.zzi;
            int i13 = i11 + i12 + i10;
            if (-2147483647 + i13 <= 0) {
                int i14 = this.zzl;
                if (i13 <= i14) {
                    int i15 = this.zzg - i12;
                    int i16 = i10 - i15;
                    if (i16 >= 4096) {
                        try {
                            if (i16 > this.zze.available()) {
                                return null;
                            }
                        } catch (zzgqy e10) {
                            e10.zzk();
                            throw e10;
                        }
                    }
                    byte[] bArr = new byte[i10];
                    System.arraycopy(this.zzf, this.zzi, bArr, 0, i15);
                    this.zzk += this.zzg;
                    this.zzi = 0;
                    this.zzg = 0;
                    while (i15 < i10) {
                        try {
                            int read = this.zze.read(bArr, i15, i10 - i15);
                            if (read != -1) {
                                this.zzk += read;
                                i15 += read;
                            } else {
                                throw zzgqy.zzj();
                            }
                        } catch (zzgqy e11) {
                            e11.zzk();
                            throw e11;
                        }
                    }
                    return bArr;
                }
                zzB((i14 - i11) - i12);
                throw zzgqy.zzj();
            }
            throw zzgqy.zzi();
        }
        throw zzgqy.zzf();
    }

    public final void zzA(int i10) {
        this.zzl = i10;
        zzK();
    }

    public final void zzB(int i10) throws IOException {
        int i11 = this.zzg;
        int i12 = this.zzi;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.zzi = i12 + i10;
        } else if (i10 >= 0) {
            int i14 = this.zzk;
            int i15 = i14 + i12;
            int i16 = this.zzl;
            if (i15 + i10 <= i16) {
                this.zzk = i15;
                this.zzg = 0;
                this.zzi = 0;
                while (i13 < i10) {
                    try {
                        long j10 = (long) (i10 - i13);
                        long skip = this.zze.skip(j10);
                        int i17 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i17 < 0 || skip > j10) {
                            throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        } else if (i17 == 0) {
                            break;
                        } else {
                            i13 += (int) skip;
                        }
                    } catch (zzgqy e10) {
                        e10.zzk();
                        throw e10;
                    } catch (Throwable th) {
                        this.zzk += i13;
                        zzK();
                        throw th;
                    }
                }
                this.zzk += i13;
                zzK();
                if (i13 < i10) {
                    int i18 = this.zzg;
                    int i19 = i18 - this.zzi;
                    this.zzi = i18;
                    zzL(1);
                    while (true) {
                        int i20 = i10 - i19;
                        int i21 = this.zzg;
                        if (i20 > i21) {
                            i19 += i21;
                            this.zzi = i21;
                            zzL(1);
                        } else {
                            this.zzi = i20;
                            return;
                        }
                    }
                }
            } else {
                zzB((i16 - i14) - i12);
                throw zzgqy.zzj();
            }
        } else {
            throw zzgqy.zzf();
        }
    }

    public final boolean zzC() throws IOException {
        return this.zzi == this.zzg && !zzM(1);
    }

    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    public final boolean zzE(int i10) throws IOException {
        int zzm;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzg - this.zzi >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.zzf;
                    int i13 = this.zzi;
                    this.zzi = i13 + 1;
                    if (bArr[i13] < 0) {
                        i12++;
                    }
                }
                throw zzgqy.zze();
            }
            while (i12 < 10) {
                if (zza() < 0) {
                    i12++;
                }
            }
            throw zzgqy.zze();
            return true;
        } else if (i11 == 1) {
            zzB(8);
            return true;
        } else if (i11 == 2) {
            zzB(zzj());
            return true;
        } else if (i11 == 3) {
            do {
                zzm = zzm();
                if (zzm == 0 || !zzE(zzm)) {
                    zzz(((i10 >>> 3) << 3) | 4);
                }
                zzm = zzm();
                break;
            } while (!zzE(zzm));
            zzz(((i10 >>> 3) << 3) | 4);
            return true;
        } else if (i11 == 4) {
            return false;
        } else {
            if (i11 == 5) {
                zzB(4);
                return true;
            }
            throw zzgqy.zza();
        }
    }

    public final byte zza() throws IOException {
        if (this.zzi == this.zzg) {
            zzL(1);
        }
        byte[] bArr = this.zzf;
        int i10 = this.zzi;
        this.zzi = i10 + 1;
        return bArr[i10];
    }

    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    public final int zzd() {
        return this.zzk + this.zzi;
    }

    public final int zze(int i10) throws zzgqy {
        if (i10 >= 0) {
            int i11 = this.zzk + this.zzi;
            int i12 = this.zzl;
            int i13 = i10 + i11;
            if (i13 <= i12) {
                this.zzl = i13;
                zzK();
                return i12;
            }
            throw zzgqy.zzj();
        }
        throw zzgqy.zzf();
    }

    public final int zzf() throws IOException {
        return zzj();
    }

    public final int zzg() throws IOException {
        return zzi();
    }

    public final int zzh() throws IOException {
        return zzj();
    }

    public final int zzi() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            zzL(4);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 4;
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << Ascii.CAN) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << Ascii.DLE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] < 0) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzj() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzi
            int r1 = r5.zzg
            if (r1 != r0) goto L_0x0007
            goto L_0x006d
        L_0x0007:
            byte[] r2 = r5.zzf
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.zzi = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x006a
        L_0x0023:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r3
            goto L_0x006a
        L_0x0030:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x006a
        L_0x003e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x006a
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x006a
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x006a
            goto L_0x006d
        L_0x006a:
            r5.zzi = r1
            return r0
        L_0x006d:
            long r0 = r5.zzs()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgpk.zzj():int");
    }

    public final int zzk() throws IOException {
        return zzi();
    }

    public final int zzl() throws IOException {
        return zzgpm.zzF(zzj());
    }

    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int zzj2 = zzj();
        this.zzj = zzj2;
        if ((zzj2 >>> 3) != 0) {
            return zzj2;
        }
        throw zzgqy.zzc();
    }

    public final int zzn() throws IOException {
        return zzj();
    }

    public final long zzo() throws IOException {
        return zzq();
    }

    public final long zzp() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            zzL(8);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 8;
        long j10 = (long) bArr[i10 + 2];
        long j11 = (long) bArr[i10 + 3];
        long j12 = (long) bArr[i10 + 4];
        long j13 = (long) bArr[i10 + 5];
        long j14 = (long) bArr[i10 + 6];
        long j15 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24);
        return ((((long) bArr[i10 + 7]) & 255) << 56) | j15 | ((j12 & 255) << 32) | ((j13 & 255) << 40) | ((j14 & 255) << 48);
    }

    public final long zzr() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        byte b10;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zzf;
            int i12 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 >= 0) {
                this.zzi = i12;
                return (long) b11;
            } else if (i11 - i12 >= 9) {
                int i13 = i12 + 1;
                byte b12 = b11 ^ (bArr[i12] << 7);
                if (b12 < 0) {
                    b10 = b12 ^ Byte.MIN_VALUE;
                } else {
                    int i14 = i13 + 1;
                    byte b13 = b12 ^ (bArr[i13] << Ascii.SO);
                    if (b13 >= 0) {
                        j11 = (long) (b13 ^ 16256);
                    } else {
                        i13 = i14 + 1;
                        byte b14 = b13 ^ (bArr[i14] << Ascii.NAK);
                        if (b14 < 0) {
                            b10 = b14 ^ -2080896;
                        } else {
                            i14 = i13 + 1;
                            long j14 = ((long) b14) ^ (((long) bArr[i13]) << 28);
                            if (j14 >= 0) {
                                j13 = 266354560;
                            } else {
                                int i15 = i14 + 1;
                                long j15 = j14 ^ (((long) bArr[i14]) << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i14 = i15 + 1;
                                    j14 = j15 ^ (((long) bArr[i15]) << 42);
                                    if (j14 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i15 = i14 + 1;
                                        j15 = j14 ^ (((long) bArr[i14]) << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i14 = i15 + 1;
                                            j11 = (j15 ^ (((long) bArr[i15]) << 56)) ^ 71499008037633920L;
                                            if (j11 < 0) {
                                                i15 = i14 + 1;
                                                if (((long) bArr[i14]) >= 0) {
                                                    j10 = j11;
                                                    i13 = i15;
                                                    this.zzi = i13;
                                                    return j10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j10 = j12 ^ j15;
                                i13 = i15;
                                this.zzi = i13;
                                return j10;
                            }
                            j11 = j14 ^ j13;
                        }
                    }
                    i13 = i14;
                    j10 = j11;
                    this.zzi = i13;
                    return j10;
                }
                j10 = (long) b10;
                this.zzi = i13;
                return j10;
            }
        }
        return zzs();
    }

    /* access modifiers changed from: package-private */
    public final long zzs() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte zza = zza();
            j10 |= ((long) (zza & Ascii.DEL)) << i10;
            if ((zza & 128) == 0) {
                return j10;
            }
        }
        throw zzgqy.zze();
    }

    public final long zzt() throws IOException {
        return zzq();
    }

    public final long zzu() throws IOException {
        return zzgpm.zzG(zzr());
    }

    public final long zzv() throws IOException {
        return zzr();
    }

    public final zzgpe zzw() throws IOException {
        int zzj2 = zzj();
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (zzj2 <= i10 - i11 && zzj2 > 0) {
            zzgpe zzw = zzgpe.zzw(this.zzf, i11, zzj2);
            this.zzi += zzj2;
            return zzw;
        } else if (zzj2 == 0) {
            return zzgpe.zzb;
        } else {
            byte[] zzO = zzO(zzj2);
            if (zzO != null) {
                return zzgpe.zzv(zzO);
            }
            int i12 = this.zzi;
            int i13 = this.zzg;
            int i14 = i13 - i12;
            this.zzk += i13;
            this.zzi = 0;
            this.zzg = 0;
            List<byte[]> zzJ = zzJ(zzj2 - i14);
            byte[] bArr = new byte[zzj2];
            System.arraycopy(this.zzf, i12, bArr, 0, i14);
            for (byte[] bArr2 : zzJ) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i14, length);
                i14 += length;
            }
            return zzgpe.zzz(bArr);
        }
    }

    public final String zzx() throws IOException {
        int zzj2 = zzj();
        if (zzj2 > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (zzj2 <= i10 - i11) {
                String str = new String(this.zzf, i11, zzj2, zzgqw.zzb);
                this.zzi += zzj2;
                return str;
            }
        }
        if (zzj2 == 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        if (zzj2 > this.zzg) {
            return new String(zzN(zzj2, false), zzgqw.zzb);
        }
        zzL(zzj2);
        String str2 = new String(this.zzf, this.zzi, zzj2, zzgqw.zzb);
        this.zzi += zzj2;
        return str2;
    }

    public final String zzy() throws IOException {
        byte[] bArr;
        int zzj2 = zzj();
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (zzj2 <= i11 - i10 && zzj2 > 0) {
            bArr = this.zzf;
            this.zzi = i10 + zzj2;
        } else if (zzj2 == 0) {
            return MaxReward.DEFAULT_LABEL;
        } else {
            if (zzj2 <= i11) {
                zzL(zzj2);
                bArr = this.zzf;
                this.zzi = zzj2;
            } else {
                bArr = zzN(zzj2, false);
            }
            i10 = 0;
        }
        return zzgtv.zzh(bArr, i10, zzj2);
    }

    public final void zzz(int i10) throws zzgqy {
        if (this.zzj != i10) {
            throw zzgqy.zzb();
        }
    }
}
