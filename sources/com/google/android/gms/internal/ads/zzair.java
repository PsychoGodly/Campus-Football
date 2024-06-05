package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzair {
    private final zzeu zza = new zzeu(0);
    private final zzen zzb = new zzen();
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;

    zzair(int i10) {
    }

    private final int zze(zzzv zzzv) {
        zzen zzen = this.zzb;
        byte[] bArr = zzew.zzf;
        int length = bArr.length;
        zzen.zzD(bArr, 0);
        this.zzc = true;
        zzzv.zzj();
        return 0;
    }

    public final int zza(zzzv zzzv, zzaau zzaau, int i10) throws IOException {
        if (i10 <= 0) {
            zze(zzzv);
            return 0;
        }
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long zzd2 = zzzv.zzd();
            int min = (int) Math.min(112800, zzd2);
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
            int zzd3 = zzen.zzd();
            int i11 = zzd3 - 188;
            while (true) {
                if (i11 < zzc2) {
                    break;
                }
                byte[] zzH = zzen.zzH();
                int i12 = -4;
                int i13 = 0;
                while (true) {
                    if (i12 > 4) {
                        break;
                    }
                    int i14 = (i12 * 188) + i11;
                    if (i14 < zzc2 || i14 >= zzd3 || zzH[i14] != 71) {
                        i13 = 0;
                    } else {
                        i13++;
                        if (i13 == 5) {
                            long zzb2 = zzajb.zzb(zzen, i11, i10);
                            if (zzb2 != -9223372036854775807L) {
                                j10 = zzb2;
                                break;
                            }
                        }
                    }
                    i12++;
                }
                i11--;
            }
            this.zzg = j10;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zze(zzzv);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(112800, zzzv.zzd());
            if (zzzv.zzf() != 0) {
                zzaau.zza = 0;
                return 1;
            }
            this.zzb.zzC(min2);
            zzzv.zzj();
            ((zzzk) zzzv).zzm(this.zzb.zzH(), 0, min2, false);
            zzen zzen2 = this.zzb;
            int zzc3 = zzen2.zzc();
            int zzd4 = zzen2.zzd();
            while (true) {
                if (zzc3 >= zzd4) {
                    break;
                }
                if (zzen2.zzH()[zzc3] == 71) {
                    long zzb3 = zzajb.zzb(zzen2, zzc3, i10);
                    if (zzb3 != -9223372036854775807L) {
                        j10 = zzb3;
                        break;
                    }
                }
                zzc3++;
            }
            this.zzf = j10;
            this.zzd = true;
            return 0;
        } else {
            long j12 = this.zzf;
            if (j12 == -9223372036854775807L) {
                zze(zzzv);
                return 0;
            }
            long zzb4 = this.zza.zzb(this.zzg) - this.zza.zzb(j12);
            this.zzh = zzb4;
            if (zzb4 < 0) {
                zzee.zze("TsDurationReader", "Invalid duration: " + zzb4 + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zze(zzzv);
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzeu zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
