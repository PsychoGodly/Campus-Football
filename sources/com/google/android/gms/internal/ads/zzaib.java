package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaib implements zzahn {
    private final zzen zza;
    private final zzaan zzb;
    private final String zzc;
    private zzabb zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzaib() {
        this((String) null);
    }

    public final void zza(zzen zzen) {
        zzdl.zzb(this.zzd);
        while (zzen.zza() > 0) {
            int i10 = this.zzf;
            if (i10 == 0) {
                byte[] zzH = zzen.zzH();
                int zzc2 = zzen.zzc();
                int zzd2 = zzen.zzd();
                while (true) {
                    if (zzc2 >= zzd2) {
                        zzen.zzF(zzd2);
                        break;
                    }
                    byte b10 = zzH[zzc2];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.zzi && (b10 & 224) == 224;
                    this.zzi = z10;
                    if (z11) {
                        zzen.zzF(zzc2 + 1);
                        this.zzi = false;
                        this.zza.zzH()[1] = zzH[zzc2];
                        this.zzg = 2;
                        this.zzf = 1;
                        break;
                    }
                    zzc2++;
                }
            } else if (i10 != 1) {
                int min = Math.min(zzen.zza(), this.zzk - this.zzg);
                this.zzd.zzq(zzen, min);
                int i11 = this.zzg + min;
                this.zzg = i11;
                int i12 = this.zzk;
                if (i11 >= i12) {
                    long j10 = this.zzl;
                    if (j10 != -9223372036854775807L) {
                        this.zzd.zzs(j10, 1, i12, 0, (zzaba) null);
                        this.zzl += this.zzj;
                    }
                    this.zzg = 0;
                    this.zzf = 0;
                }
            } else {
                int min2 = Math.min(zzen.zza(), 4 - this.zzg);
                zzen.zzB(this.zza.zzH(), this.zzg, min2);
                int i13 = this.zzg + min2;
                this.zzg = i13;
                if (i13 >= 4) {
                    this.zza.zzF(0);
                    if (!this.zzb.zza(this.zza.zze())) {
                        this.zzg = 0;
                        this.zzf = 1;
                    } else {
                        zzaan zzaan = this.zzb;
                        this.zzk = zzaan.zzc;
                        if (!this.zzh) {
                            this.zzj = (((long) zzaan.zzg) * 1000000) / ((long) zzaan.zzd);
                            zzad zzad = new zzad();
                            zzad.zzH(this.zze);
                            zzad.zzS(this.zzb.zzb);
                            zzad.zzL(4096);
                            zzad.zzw(this.zzb.zze);
                            zzad.zzT(this.zzb.zzd);
                            zzad.zzK(this.zzc);
                            this.zzd.zzk(zzad.zzY());
                            this.zzh = true;
                        }
                        this.zza.zzF(0);
                        this.zzd.zzq(this.zza, 4);
                        this.zzf = 2;
                    }
                }
            }
        }
    }

    public final void zzb(zzzx zzzx, zzaiz zzaiz) {
        zzaiz.zzc();
        this.zze = zzaiz.zzb();
        this.zzd = zzzx.zzv(zzaiz.zza(), 1);
    }

    public final void zzc() {
    }

    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzl = j10;
        }
    }

    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzi = false;
        this.zzl = -9223372036854775807L;
    }

    public zzaib(String str) {
        this.zzf = 0;
        zzen zzen = new zzen(4);
        this.zza = zzen;
        zzen.zzH()[0] = -1;
        this.zzb = new zzaan();
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
