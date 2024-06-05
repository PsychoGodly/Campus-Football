package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaii {
    private final zzeu zza = new zzeu(0);
    private final zzen zzb = new zzen();
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;

    zzaii() {
    }

    public static long zzc(zzen zzen) {
        zzen zzen2 = zzen;
        int zzc2 = zzen.zzc();
        if (zzen.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzen2.zzB(bArr, 0, 9);
        zzen2.zzF(zzc2);
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j10 = (long) bArr[0];
        long j11 = (long) bArr[2];
        long j12 = 255 & ((long) bArr[3]);
        long j13 = ((long) bArr[4]) & 248;
        return (j12 << 5) | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((j11 & 3) << 13) | (j13 >> 3);
    }

    private final int zzf(zzzv zzzv) {
        zzen zzen = this.zzb;
        byte[] bArr = zzew.zzf;
        int length = bArr.length;
        zzen.zzD(bArr, 0);
        this.zzc = true;
        zzzv.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << Ascii.CAN) | ((bArr[i10 + 1] & 255) << Ascii.DLE) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final int zza(zzzv zzzv, zzaau zzaau) throws IOException {
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long zzd2 = zzzv.zzd();
            int min = (int) Math.min(20000, zzd2);
            long j11 = zzd2 - ((long) min);
            if (zzzv.zzf() != j11) {
                zzaau.zza = j11;
                return 1;
            }
            this.zzb.zzC(min);
            zzzv.zzj();
            ((zzzk) zzzv).zzm(this.zzb.zzH(), 0, min, false);
            zzen zzen = this.zzb;
            int zzc2 = zzen.zzc();
            int zzd3 = zzen.zzd() - 4;
            while (true) {
                if (zzd3 < zzc2) {
                    break;
                }
                if (zzg(zzen.zzH(), zzd3) == 442) {
                    zzen.zzF(zzd3 + 4);
                    long zzc3 = zzc(zzen);
                    if (zzc3 != -9223372036854775807L) {
                        j10 = zzc3;
                        break;
                    }
                }
                zzd3--;
            }
            this.zzg = j10;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zzzv);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(20000, zzzv.zzd());
            if (zzzv.zzf() != 0) {
                zzaau.zza = 0;
                return 1;
            }
            this.zzb.zzC(min2);
            zzzv.zzj();
            ((zzzk) zzzv).zzm(this.zzb.zzH(), 0, min2, false);
            zzen zzen2 = this.zzb;
            int zzc4 = zzen2.zzc();
            int zzd4 = zzen2.zzd();
            while (true) {
                if (zzc4 >= zzd4 - 3) {
                    break;
                }
                if (zzg(zzen2.zzH(), zzc4) == 442) {
                    zzen2.zzF(zzc4 + 4);
                    long zzc5 = zzc(zzen2);
                    if (zzc5 != -9223372036854775807L) {
                        j10 = zzc5;
                        break;
                    }
                }
                zzc4++;
            }
            this.zzf = j10;
            this.zzd = true;
            return 0;
        } else {
            long j12 = this.zzf;
            if (j12 == -9223372036854775807L) {
                zzf(zzzv);
                return 0;
            }
            long zzb2 = this.zza.zzb(this.zzg) - this.zza.zzb(j12);
            this.zzh = zzb2;
            if (zzb2 < 0) {
                zzee.zze("PsDurationReader", "Invalid duration: " + zzb2 + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zzf(zzzv);
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzeu zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
