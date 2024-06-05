package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaig implements zzzf {
    private final zzeu zza;
    private final zzen zzb = new zzen();

    /* synthetic */ zzaig(zzeu zzeu, zzaif zzaif) {
        this.zza = zzeu;
    }

    public final zzze zza(zzzv zzzv, long j10) throws IOException {
        int zzh;
        long j11;
        long zzf = zzzv.zzf();
        int min = (int) Math.min(20000, zzzv.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzzk) zzzv).zzm(this.zzb.zzH(), 0, min, false);
        zzen zzen = this.zzb;
        int i10 = -1;
        long j12 = -9223372036854775807L;
        int i11 = -1;
        while (zzen.zza() >= 4) {
            if (zzaih.zzh(zzen.zzH(), zzen.zzc()) != 442) {
                zzen.zzG(1);
            } else {
                zzen.zzG(4);
                long zzc = zzaii.zzc(zzen);
                if (zzc != -9223372036854775807L) {
                    long zzb2 = this.zza.zzb(zzc);
                    if (zzb2 > j10) {
                        if (j12 == -9223372036854775807L) {
                            return zzze.zzd(zzb2, zzf);
                        }
                        j11 = (long) i11;
                    } else if (100000 + zzb2 > j10) {
                        j11 = (long) zzen.zzc();
                    } else {
                        i11 = zzen.zzc();
                        j12 = zzb2;
                    }
                    return zzze.zze(zzf + j11);
                }
                int zzd = zzen.zzd();
                if (zzen.zza() >= 10) {
                    zzen.zzG(9);
                    int zzk = zzen.zzk() & 7;
                    if (zzen.zza() >= zzk) {
                        zzen.zzG(zzk);
                        if (zzen.zza() >= 4) {
                            if (zzaih.zzh(zzen.zzH(), zzen.zzc()) == 443) {
                                zzen.zzG(4);
                                int zzo = zzen.zzo();
                                if (zzen.zza() < zzo) {
                                    zzen.zzF(zzd);
                                } else {
                                    zzen.zzG(zzo);
                                }
                            }
                            while (true) {
                                if (zzen.zza() < 4 || (zzh = zzaih.zzh(zzen.zzH(), zzen.zzc())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzen.zzG(4);
                                if (zzen.zza() < 2) {
                                    zzen.zzF(zzd);
                                    break;
                                }
                                zzen.zzF(Math.min(zzen.zzd(), zzen.zzc() + zzen.zzo()));
                            }
                        } else {
                            zzen.zzF(zzd);
                        }
                    } else {
                        zzen.zzF(zzd);
                    }
                } else {
                    zzen.zzF(zzd);
                }
                i10 = zzen.zzc();
            }
        }
        return j12 != -9223372036854775807L ? zzze.zzf(j12, zzf + ((long) i10)) : zzze.zza;
    }

    public final void zzb() {
        zzen zzen = this.zzb;
        byte[] bArr = zzew.zzf;
        int length = bArr.length;
        zzen.zzD(bArr, 0);
    }
}
