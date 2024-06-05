package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzahd implements zzahn {
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

    public zzahd() {
        this((String) null);
    }

    public final void zza(zzen zzen) {
        zzdl.zzb(this.zze);
        while (zzen.zza() > 0) {
            int i10 = this.zzf;
            if (i10 == 0) {
                while (true) {
                    if (zzen.zza() <= 0) {
                        break;
                    } else if (!this.zzh) {
                        this.zzh = zzen.zzk() == 11;
                    } else {
                        int zzk2 = zzen.zzk();
                        if (zzk2 == 119) {
                            this.zzh = false;
                            this.zzf = 1;
                            zzen zzen2 = this.zzb;
                            zzen2.zzH()[0] = Ascii.VT;
                            zzen2.zzH()[1] = 119;
                            this.zzg = 2;
                            break;
                        }
                        this.zzh = zzk2 == 11;
                    }
                }
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
                byte[] zzH = this.zzb.zzH();
                int min2 = Math.min(zzen.zza(), 128 - this.zzg);
                zzen.zzB(zzH, this.zzg, min2);
                int i13 = this.zzg + min2;
                this.zzg = i13;
                if (i13 == 128) {
                    this.zza.zzj(0);
                    zzyu zze2 = zzyv.zze(this.zza);
                    zzaf zzaf = this.zzj;
                    if (zzaf == null || zze2.zzc != zzaf.zzz || zze2.zzb != zzaf.zzA || !zzew.zzU(zze2.zza, zzaf.zzm)) {
                        zzad zzad = new zzad();
                        zzad.zzH(this.zzd);
                        zzad.zzS(zze2.zza);
                        zzad.zzw(zze2.zzc);
                        zzad.zzT(zze2.zzb);
                        zzad.zzK(this.zzc);
                        zzad.zzO(zze2.zzf);
                        if ("audio/ac3".equals(zze2.zza)) {
                            zzad.zzv(zze2.zzf);
                        }
                        zzaf zzY = zzad.zzY();
                        this.zzj = zzY;
                        this.zze.zzk(zzY);
                    }
                    this.zzk = zze2.zzd;
                    this.zzi = (((long) zze2.zze) * 1000000) / ((long) this.zzj.zzA);
                    this.zzb.zzF(0);
                    this.zze.zzq(this.zzb, 128);
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

    public zzahd(String str) {
        zzem zzem = new zzem(new byte[128], 128);
        this.zza = zzem;
        this.zzb = new zzen(zzem.zza);
        this.zzf = 0;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
