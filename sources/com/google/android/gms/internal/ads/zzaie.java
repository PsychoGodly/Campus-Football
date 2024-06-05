package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaie implements zzaja {
    private final zzahn zza;
    private final zzem zzb = new zzem(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzeu zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzaie(zzahn zzahn) {
        this.zza = zzahn;
    }

    private final void zzd(int i10) {
        this.zzc = i10;
        this.zzd = 0;
    }

    private final boolean zze(zzen zzen, byte[] bArr, int i10) {
        int min = Math.min(zzen.zza(), i10 - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzen.zzG(min);
        } else {
            zzen.zzB(bArr, this.zzd, min);
        }
        int i11 = this.zzd + min;
        this.zzd = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    public final void zza(zzen zzen, int i10) throws zzbu {
        long j10;
        int i11;
        zzen zzen2 = zzen;
        zzdl.zzb(this.zze);
        int i12 = -1;
        int i13 = 2;
        int i14 = 1;
        if ((i10 & 1) != 0) {
            int i15 = this.zzc;
            if (!(i15 == 0 || i15 == 1)) {
                if (i15 != 2) {
                    int i16 = this.zzj;
                    if (i16 != -1) {
                        zzee.zze("PesReader", "Unexpected start indicator: expected " + i16 + " more bytes");
                    }
                    this.zza.zzc();
                } else {
                    zzee.zze("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i17 = i10;
        while (zzen.zza() > 0) {
            int i18 = this.zzc;
            if (i18 != 0) {
                int i19 = 0;
                if (i18 != i14) {
                    if (i18 != i13) {
                        int zza2 = zzen.zza();
                        int i20 = this.zzj;
                        if (i20 != i12) {
                            i19 = zza2 - i20;
                        }
                        if (i19 > 0) {
                            zza2 -= i19;
                            zzen2.zzE(zzen.zzc() + zza2);
                        }
                        this.zza.zza(zzen2);
                        int i21 = this.zzj;
                        if (i21 != i12) {
                            int i22 = i21 - zza2;
                            this.zzj = i22;
                            if (i22 == 0) {
                                this.zza.zzc();
                                zzd(i14);
                            }
                        }
                    } else {
                        if (zze(zzen2, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzen2, (byte[]) null, this.zzi)) {
                            this.zzb.zzj(0);
                            if (this.zzf) {
                                this.zzb.zzl(4);
                                long zzd2 = (long) this.zzb.zzd(3);
                                this.zzb.zzl(i14);
                                int zzd3 = this.zzb.zzd(15) << 15;
                                this.zzb.zzl(i14);
                                long zzd4 = (long) this.zzb.zzd(15);
                                this.zzb.zzl(i14);
                                if (this.zzh || !this.zzg) {
                                    i11 = zzd3;
                                } else {
                                    this.zzb.zzl(4);
                                    this.zzb.zzl(i14);
                                    this.zzb.zzl(i14);
                                    long zzd5 = (long) this.zzb.zzd(15);
                                    this.zzb.zzl(i14);
                                    i11 = zzd3;
                                    this.zze.zzb((((long) this.zzb.zzd(3)) << 30) | ((long) (this.zzb.zzd(15) << 15)) | zzd5);
                                    this.zzh = true;
                                }
                                j10 = this.zze.zzb((zzd2 << 30) | ((long) i11) | zzd4);
                            } else {
                                j10 = -9223372036854775807L;
                            }
                            i17 |= true != this.zzk ? 0 : 4;
                            this.zza.zzd(j10, i17);
                            zzd(3);
                            i12 = -1;
                            i13 = 2;
                            i14 = 1;
                        }
                    }
                } else if (zze(zzen2, this.zzb.zza, 9)) {
                    int i23 = 0;
                    this.zzb.zzj(0);
                    int zzd6 = this.zzb.zzd(24);
                    i14 = 1;
                    if (zzd6 != 1) {
                        zzee.zze("PesReader", "Unexpected start code prefix: " + zzd6);
                        i12 = -1;
                        this.zzj = -1;
                    } else {
                        this.zzb.zzl(8);
                        int zzd7 = this.zzb.zzd(16);
                        this.zzb.zzl(5);
                        this.zzk = this.zzb.zzn();
                        this.zzb.zzl(2);
                        this.zzf = this.zzb.zzn();
                        this.zzg = this.zzb.zzn();
                        this.zzb.zzl(6);
                        int zzd8 = this.zzb.zzd(8);
                        this.zzi = zzd8;
                        if (zzd7 == 0) {
                            this.zzj = -1;
                        } else {
                            int i24 = (zzd7 - 3) - zzd8;
                            this.zzj = i24;
                            if (i24 < 0) {
                                zzee.zze("PesReader", "Found negative packet payload size: " + i24);
                                i12 = -1;
                                this.zzj = -1;
                                i23 = 2;
                            }
                        }
                        i12 = -1;
                        i23 = 2;
                    }
                    zzd(i23);
                } else {
                    i12 = -1;
                    i14 = 1;
                }
            } else {
                zzen2.zzG(zzen.zza());
            }
            i13 = 2;
        }
    }

    public final void zzb(zzeu zzeu, zzzx zzzx, zzaiz zzaiz) {
        this.zze = zzeu;
        this.zza.zzb(zzzx, zzaiz);
    }

    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
