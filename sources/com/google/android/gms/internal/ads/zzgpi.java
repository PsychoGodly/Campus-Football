package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgpi extends zzgpm {
    private final Iterable zze;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj = a.e.API_PRIORITY_OTHER;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    /* synthetic */ zzgpi(Iterable iterable, int i10, boolean z10, zzgph zzgph) {
        super((zzgpl) null);
        this.zzh = i10;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i10 == 0) {
            this.zzg = zzgqw.zze;
            this.zzm = 0;
            this.zzn = 0;
            this.zzo = 0;
            return;
        }
        zzN();
    }

    private final int zzJ() {
        return (int) ((((long) (this.zzh - this.zzl)) - this.zzm) + this.zzn);
    }

    private final void zzK() throws zzgqy {
        if (this.zzf.hasNext()) {
            zzN();
            return;
        }
        throw zzgqy.zzj();
    }

    private final void zzL(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 <= zzJ()) {
            int i12 = i11;
            while (i12 > 0) {
                if (this.zzo - this.zzm == 0) {
                    zzK();
                }
                int min = Math.min(i12, (int) (this.zzo - this.zzm));
                long j10 = (long) min;
                zzgtq.zzo(this.zzm, bArr, (long) (i11 - i12), j10);
                i12 -= min;
                this.zzm += j10;
            }
        } else if (i11 > 0) {
            throw zzgqy.zzj();
        }
    }

    private final void zzM() {
        int i10 = this.zzh + this.zzi;
        this.zzh = i10;
        int i11 = this.zzj;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.zzi = i12;
            this.zzh = i10 - i12;
            return;
        }
        this.zzi = 0;
    }

    private final void zzN() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long position = (long) byteBuffer.position();
        this.zzm = position;
        this.zzn = position;
        this.zzo = (long) this.zzg.limit();
        long zze2 = zzgtq.zze(this.zzg);
        this.zzm += zze2;
        this.zzn += zze2;
        this.zzo += zze2;
    }

    public final void zzA(int i10) {
        this.zzj = i10;
        zzM();
    }

    public final void zzB(int i10) throws IOException {
        if (i10 >= 0) {
            if (((long) i10) <= (((long) (this.zzh - this.zzl)) - this.zzm) + this.zzn) {
                while (i10 > 0) {
                    if (this.zzo - this.zzm == 0) {
                        zzK();
                    }
                    int min = Math.min(i10, (int) (this.zzo - this.zzm));
                    i10 -= min;
                    this.zzm += (long) min;
                }
                return;
            }
        }
        if (i10 < 0) {
            throw zzgqy.zzf();
        }
        throw zzgqy.zzj();
    }

    public final boolean zzC() throws IOException {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    public final boolean zzE(int i10) throws IOException {
        int zzm2;
        int i11 = i10 & 7;
        if (i11 == 0) {
            for (int i12 = 0; i12 < 10; i12++) {
                if (zza() >= 0) {
                    return true;
                }
            }
            throw zzgqy.zze();
        } else if (i11 == 1) {
            zzB(8);
            return true;
        } else if (i11 == 2) {
            zzB(zzj());
            return true;
        } else if (i11 == 3) {
            do {
                zzm2 = zzm();
                if (zzm2 == 0 || !zzE(zzm2)) {
                    zzz(((i10 >>> 3) << 3) | 4);
                }
                zzm2 = zzm();
                break;
            } while (!zzE(zzm2));
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
        if (this.zzo - this.zzm == 0) {
            zzK();
        }
        long j10 = this.zzm;
        this.zzm = 1 + j10;
        return zzgtq.zza(j10);
    }

    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    public final int zzd() {
        return (int) ((((long) this.zzl) + this.zzm) - this.zzn);
    }

    public final int zze(int i10) throws zzgqy {
        if (i10 >= 0) {
            int zzd = i10 + zzd();
            int i11 = this.zzj;
            if (zzd <= i11) {
                this.zzj = zzd;
                zzM();
                return i11;
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
        long j10 = this.zzo;
        long j11 = this.zzm;
        if (j10 - j11 >= 4) {
            this.zzm = 4 + j11;
            return (zzgtq.zza(j11) & 255) | ((zzgtq.zza(1 + j11) & 255) << 8) | ((zzgtq.zza(2 + j11) & 255) << Ascii.DLE) | ((zzgtq.zza(j11 + 3) & 255) << Ascii.CAN);
        }
        return (zza() & 255) | ((zza() & 255) << 8) | ((zza() & 255) << Ascii.DLE) | ((zza() & 255) << Ascii.CAN);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        if (com.google.android.gms.internal.ads.zzgtq.zza(r4) >= 0) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzj() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.zzm
            long r2 = r10.zzo
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x000a
            goto L_0x008c
        L_0x000a:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzgtq.zza(r0)
            if (r0 < 0) goto L_0x001a
            long r4 = r10.zzm
            long r4 = r4 + r2
            r10.zzm = r4
            return r0
        L_0x001a:
            long r6 = r10.zzo
            long r8 = r10.zzm
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x008c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgtq.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0033
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0089
        L_0x0033:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgtq.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0042
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x0040:
            r6 = r4
            goto L_0x0089
        L_0x0042:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgtq.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0052
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L_0x0089
        L_0x0052:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgtq.zza(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgtq.zza(r4)
            if (r1 >= 0) goto L_0x0089
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgtq.zza(r6)
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgtq.zza(r4)
            if (r1 >= 0) goto L_0x0089
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgtq.zza(r6)
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgtq.zza(r4)
            if (r1 < 0) goto L_0x008c
        L_0x0089:
            r10.zzm = r6
            return r0
        L_0x008c:
            long r0 = r10.zzs()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgpi.zzj():int");
    }

    public final int zzk() throws IOException {
        return zzi();
    }

    public final int zzl() throws IOException {
        return zzgpm.zzF(zzj());
    }

    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzk = 0;
            return 0;
        }
        int zzj2 = zzj();
        this.zzk = zzj2;
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
        long j10 = this.zzo;
        long j11 = this.zzm;
        if (j10 - j11 >= 8) {
            this.zzm = 8 + j11;
            byte zza = zzgtq.zza(j11 + 5);
            long zza2 = (((long) zzgtq.zza(4 + j11)) & 255) << 32;
            byte zza3 = zzgtq.zza(j11 + 6);
            return (((long) zzgtq.zza(j11)) & 255) | ((((long) zzgtq.zza(1 + j11)) & 255) << 8) | ((((long) zzgtq.zza(j11 + 2)) & 255) << 16) | ((((long) zzgtq.zza(j11 + 3)) & 255) << 24) | zza2 | ((((long) zza) & 255) << 40) | ((((long) zza3) & 255) << 48) | ((((long) zzgtq.zza(j11 + 7)) & 255) << 56);
        }
        long zza4 = (((long) zza()) & 255) << 40;
        return (((long) zza()) & 255) | ((((long) zza()) & 255) << 8) | ((((long) zza()) & 255) << 16) | ((((long) zza()) & 255) << 24) | ((((long) zza()) & 255) << 32) | zza4 | ((((long) zza()) & 255) << 48) | ((((long) zza()) & 255) << 56);
    }

    public final long zzr() throws IOException {
        long j10;
        long j11;
        long j12;
        byte b10;
        long j13 = this.zzm;
        if (this.zzo != j13) {
            long j14 = j13 + 1;
            byte zza = zzgtq.zza(j13);
            if (zza >= 0) {
                this.zzm++;
                return (long) zza;
            } else if (this.zzo - this.zzm >= 10) {
                long j15 = j14 + 1;
                byte zza2 = zza ^ (zzgtq.zza(j14) << 7);
                if (zza2 < 0) {
                    b10 = zza2 ^ Byte.MIN_VALUE;
                } else {
                    long j16 = j15 + 1;
                    byte zza3 = zza2 ^ (zzgtq.zza(j15) << Ascii.SO);
                    if (zza3 >= 0) {
                        j10 = (long) (zza3 ^ 16256);
                    } else {
                        j15 = j16 + 1;
                        byte zza4 = zza3 ^ (zzgtq.zza(j16) << Ascii.NAK);
                        if (zza4 < 0) {
                            b10 = zza4 ^ -2080896;
                        } else {
                            j16 = j15 + 1;
                            long zza5 = ((long) zza4) ^ (((long) zzgtq.zza(j15)) << 28);
                            if (zza5 >= 0) {
                                j12 = 266354560;
                            } else {
                                long j17 = j16 + 1;
                                long zza6 = zza5 ^ (((long) zzgtq.zza(j16)) << 35);
                                if (zza6 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    j16 = j17 + 1;
                                    zza5 = zza6 ^ (((long) zzgtq.zza(j17)) << 42);
                                    if (zza5 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        j17 = j16 + 1;
                                        zza6 = zza5 ^ (((long) zzgtq.zza(j16)) << 49);
                                        if (zza6 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            j16 = j17 + 1;
                                            j10 = (zza6 ^ (((long) zzgtq.zza(j17)) << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                long j18 = 1 + j16;
                                                if (((long) zzgtq.zza(j16)) >= 0) {
                                                    j15 = j18;
                                                    this.zzm = j15;
                                                    return j10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j10 = zza6 ^ j11;
                                j15 = j17;
                                this.zzm = j15;
                                return j10;
                            }
                            j10 = zza5 ^ j12;
                        }
                    }
                    j15 = j16;
                    this.zzm = j15;
                    return j10;
                }
                j10 = (long) b10;
                this.zzm = j15;
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
            long j10 = this.zzo;
            long j11 = this.zzm;
            long j12 = (long) zzj2;
            if (j12 <= j10 - j11) {
                byte[] bArr = new byte[zzj2];
                zzgtq.zzo(j11, bArr, 0, j12);
                this.zzm += j12;
                return zzgpe.zzz(bArr);
            }
        }
        if (zzj2 > 0 && zzj2 <= zzJ()) {
            byte[] bArr2 = new byte[zzj2];
            zzL(bArr2, 0, zzj2);
            return zzgpe.zzz(bArr2);
        } else if (zzj2 == 0) {
            return zzgpe.zzb;
        } else {
            if (zzj2 < 0) {
                throw zzgqy.zzf();
            }
            throw zzgqy.zzj();
        }
    }

    public final String zzx() throws IOException {
        int zzj2 = zzj();
        if (zzj2 > 0) {
            long j10 = this.zzo;
            long j11 = this.zzm;
            long j12 = (long) zzj2;
            if (j12 <= j10 - j11) {
                byte[] bArr = new byte[zzj2];
                zzgtq.zzo(j11, bArr, 0, j12);
                String str = new String(bArr, zzgqw.zzb);
                this.zzm += j12;
                return str;
            }
        }
        if (zzj2 > 0 && zzj2 <= zzJ()) {
            byte[] bArr2 = new byte[zzj2];
            zzL(bArr2, 0, zzj2);
            return new String(bArr2, zzgqw.zzb);
        } else if (zzj2 == 0) {
            return MaxReward.DEFAULT_LABEL;
        } else {
            if (zzj2 < 0) {
                throw zzgqy.zzf();
            }
            throw zzgqy.zzj();
        }
    }

    public final String zzy() throws IOException {
        int zzj2 = zzj();
        if (zzj2 > 0) {
            long j10 = this.zzo;
            long j11 = this.zzm;
            long j12 = (long) zzj2;
            if (j12 <= j10 - j11) {
                String zzg2 = zzgtv.zzg(this.zzg, (int) (j11 - this.zzn), zzj2);
                this.zzm += j12;
                return zzg2;
            }
        }
        if (zzj2 >= 0 && zzj2 <= zzJ()) {
            byte[] bArr = new byte[zzj2];
            zzL(bArr, 0, zzj2);
            return zzgtv.zzh(bArr, 0, zzj2);
        } else if (zzj2 == 0) {
            return MaxReward.DEFAULT_LABEL;
        } else {
            if (zzj2 <= 0) {
                throw zzgqy.zzf();
            }
            throw zzgqy.zzj();
        }
    }

    public final void zzz(int i10) throws zzgqy {
        if (this.zzk != i10) {
            throw zzgqy.zzb();
        }
    }
}
