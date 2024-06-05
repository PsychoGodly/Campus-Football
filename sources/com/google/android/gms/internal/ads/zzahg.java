package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzahg implements zzahn {
    private final zzem zza;
    private final zzen zzb;
    private final String zzc;
    private String zzd;
    private zzabb zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzaf zzj;
    private int zzk;
    private long zzl;

    public zzahg() {
        this((String) null);
    }

    public final void zza(zzen zzen) {
        int zzk2;
        byte b10;
        zzdl.zzb(this.zze);
        while (zzen.zza() > 0) {
            int i10 = this.zzf;
            if (i10 == 0) {
                while (true) {
                    if (zzen.zza() <= 0) {
                        break;
                    } else if (!this.zzh) {
                        this.zzh = zzen.zzk() == 172;
                    } else {
                        zzk2 = zzen.zzk();
                        this.zzh = zzk2 == 172;
                        b10 = 64;
                        if (zzk2 == 64) {
                            break;
                        } else if (zzk2 == 65) {
                            zzk2 = 65;
                            break;
                        }
                    }
                }
                this.zzf = 1;
                zzen zzen2 = this.zzb;
                zzen2.zzH()[0] = -84;
                byte[] zzH = zzen2.zzH();
                if (zzk2 == 65) {
                    b10 = 65;
                }
                zzH[1] = b10;
                this.zzg = 2;
            } else if (i10 != 1) {
                int min = Math.min(zzen.zza(), this.zzk - this.zzg);
                this.zze.zzq(zzen, min);
                int i11 = this.zzg + min;
                this.zzg = i11;
                int i12 = this.zzk;
                if (i11 == i12) {
                    long j10 = this.zzl;
                    if (j10 != -9223372036854775807L) {
                        this.zze.zzs(j10, 1, i12, 0, (zzaba) null);
                        this.zzl += this.zzi;
                    }
                    this.zzf = 0;
                }
            } else {
                byte[] zzH2 = this.zzb.zzH();
                int min2 = Math.min(zzen.zza(), 16 - this.zzg);
                zzen.zzB(zzH2, this.zzg, min2);
                int i13 = this.zzg + min2;
                this.zzg = i13;
                if (i13 == 16) {
                    this.zza.zzj(0);
                    zzyx zza2 = zzyy.zza(this.zza);
                    zzaf zzaf = this.zzj;
                    if (zzaf == null || zzaf.zzz != 2 || zza2.zza != zzaf.zzA || !"audio/ac4".equals(zzaf.zzm)) {
                        zzad zzad = new zzad();
                        zzad.zzH(this.zzd);
                        zzad.zzS("audio/ac4");
                        zzad.zzw(2);
                        zzad.zzT(zza2.zza);
                        zzad.zzK(this.zzc);
                        zzaf zzY = zzad.zzY();
                        this.zzj = zzY;
                        this.zze.zzk(zzY);
                    }
                    this.zzk = zza2.zzb;
                    this.zzi = (((long) zza2.zzc) * 1000000) / ((long) this.zzj.zzA);
                    this.zzb.zzF(0);
                    this.zze.zzq(this.zzb, 16);
                    this.zzf = 2;
                }
            }
        }
    }

    public final void zzb(zzzx zzzx, zzaiz zzaiz) {
        zzaiz.zzc();
        this.zzd = zzaiz.zzb();
        this.zze = zzzx.zzv(zzaiz.zza(), 1);
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
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }

    public zzahg(String str) {
        zzem zzem = new zzem(new byte[16], 16);
        this.zza = zzem;
        this.zzb = new zzen(zzem.zza);
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
