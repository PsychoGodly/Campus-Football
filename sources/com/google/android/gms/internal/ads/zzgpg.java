package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgpg extends zzgpm {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk = a.e.API_PRIORITY_OTHER;

    /* synthetic */ zzgpg(byte[] bArr, int i10, int i11, boolean z10, zzgpf zzgpf) {
        super((zzgpl) null);
        this.zze = bArr;
        this.zzf = i11 + i10;
        this.zzh = i10;
        this.zzi = i10;
    }

    private final void zzJ() {
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        int i11 = i10 - this.zzi;
        int i12 = this.zzk;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.zzg = i13;
            this.zzf = i10 - i13;
            return;
        }
        this.zzg = 0;
    }

    public final void zzA(int i10) {
        this.zzk = i10;
        zzJ();
    }

    public final void zzB(int i10) throws IOException {
        if (i10 >= 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (i10 <= i11 - i12) {
                this.zzh = i12 + i10;
                return;
            }
        }
        if (i10 < 0) {
            throw zzgqy.zzf();
        }
        throw zzgqy.zzj();
    }

    public final boolean zzC() throws IOException {
        return this.zzh == this.zzf;
    }

    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    public final boolean zzE(int i10) throws IOException {
        int zzm;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzf - this.zzh >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.zze;
                    int i13 = this.zzh;
                    this.zzh = i13 + 1;
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
        int i10 = this.zzh;
        if (i10 != this.zzf) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 1;
            return bArr[i10];
        }
        throw zzgqy.zzj();
    }

    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    public final int zzd() {
        return this.zzh - this.zzi;
    }

    public final int zze(int i10) throws zzgqy {
        if (i10 >= 0) {
            int i11 = i10 + (this.zzh - this.zzi);
            if (i11 >= 0) {
                int i12 = this.zzk;
                if (i11 <= i12) {
                    this.zzk = i11;
                    zzJ();
                    return i12;
                }
                throw zzgqy.zzj();
            }
            throw zzgqy.zzg();
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
        int i10 = this.zzh;
        if (this.zzf - i10 >= 4) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 4;
            int i11 = (bArr[i10 + 1] & 255) << 8;
            return ((bArr[i10 + 3] & 255) << Ascii.CAN) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << Ascii.DLE);
        }
        throw zzgqy.zzj();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] < 0) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzj() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 != r0) goto L_0x0007
            goto L_0x006d
        L_0x0007:
            byte[] r2 = r5.zze
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.zzh = r3
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
            r5.zzh = r1
            return r0
        L_0x006d:
            long r0 = r5.zzs()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgpg.zzj():int");
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
        int i10 = this.zzh;
        if (this.zzf - i10 >= 8) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 8;
            long j10 = (long) bArr[i10 + 2];
            long j11 = (long) bArr[i10 + 3];
            long j12 = (long) bArr[i10 + 4];
            long j13 = (long) bArr[i10 + 5];
            long j14 = (long) bArr[i10 + 6];
            long j15 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24);
            return ((((long) bArr[i10 + 7]) & 255) << 56) | j15 | ((j12 & 255) << 32) | ((j13 & 255) << 40) | ((j14 & 255) << 48);
        }
        throw zzgqy.zzj();
    }

    public final long zzr() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        byte b10;
        int i10 = this.zzh;
        int i11 = this.zzf;
        if (i11 != i10) {
            byte[] bArr = this.zze;
            int i12 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 >= 0) {
                this.zzh = i12;
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
                                                    this.zzh = i13;
                                                    return j10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j10 = j12 ^ j15;
                                i13 = i15;
                                this.zzh = i13;
                                return j10;
                            }
                            j11 = j14 ^ j13;
                        }
                    }
                    i13 = i14;
                    j10 = j11;
                    this.zzh = i13;
                    return j10;
                }
                j10 = (long) b10;
                this.zzh = i13;
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
        if (zzj2 > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzj2 <= i10 - i11) {
                zzgpe zzw = zzgpe.zzw(this.zze, i11, zzj2);
                this.zzh += zzj2;
                return zzw;
            }
        }
        if (zzj2 == 0) {
            return zzgpe.zzb;
        }
        if (zzj2 > 0) {
            int i12 = this.zzf;
            int i13 = this.zzh;
            if (zzj2 <= i12 - i13) {
                int i14 = zzj2 + i13;
                this.zzh = i14;
                return zzgpe.zzz(Arrays.copyOfRange(this.zze, i13, i14));
            }
        }
        if (zzj2 <= 0) {
            throw zzgqy.zzf();
        }
        throw zzgqy.zzj();
    }

    public final String zzx() throws IOException {
        int zzj2 = zzj();
        if (zzj2 > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzj2 <= i10 - i11) {
                String str = new String(this.zze, i11, zzj2, zzgqw.zzb);
                this.zzh += zzj2;
                return str;
            }
        }
        if (zzj2 == 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        if (zzj2 < 0) {
            throw zzgqy.zzf();
        }
        throw zzgqy.zzj();
    }

    public final String zzy() throws IOException {
        int zzj2 = zzj();
        if (zzj2 > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzj2 <= i10 - i11) {
                String zzh2 = zzgtv.zzh(this.zze, i11, zzj2);
                this.zzh += zzj2;
                return zzh2;
            }
        }
        if (zzj2 == 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        if (zzj2 <= 0) {
            throw zzgqy.zzf();
        }
        throw zzgqy.zzj();
    }

    public final void zzz(int i10) throws zzgqy {
        if (this.zzj != i10) {
            throw zzgqy.zzb();
        }
    }
}
