package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzain implements zzaja {
    private final zzaim zza;
    private final zzen zzb = new zzen(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzain(zzaim zzaim) {
        this.zza = zzaim;
    }

    public final void zza(zzen zzen, int i10) {
        int i11 = i10 & 1;
        int zzc2 = i11 != 0 ? zzen.zzc() + zzen.zzk() : -1;
        if (this.zzf) {
            if (i11 != 0) {
                this.zzf = false;
                zzen.zzF(zzc2);
                this.zzd = 0;
            } else {
                return;
            }
        }
        while (zzen.zza() > 0) {
            int i12 = this.zzd;
            if (i12 < 3) {
                if (i12 == 0) {
                    int zzk = zzen.zzk();
                    zzen.zzF(zzen.zzc() - 1);
                    if (zzk == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzen.zza(), 3 - this.zzd);
                zzen.zzB(this.zzb.zzH(), this.zzd, min);
                int i13 = this.zzd + min;
                this.zzd = i13;
                if (i13 == 3) {
                    this.zzb.zzF(0);
                    this.zzb.zzE(3);
                    this.zzb.zzG(1);
                    int zzk2 = this.zzb.zzk();
                    int zzk3 = this.zzb.zzk();
                    this.zze = (zzk2 & 128) != 0;
                    this.zzc = (((zzk2 & 15) << 8) | zzk3) + 3;
                    int zzb2 = this.zzb.zzb();
                    int i14 = this.zzc;
                    if (zzb2 < i14) {
                        int zzb3 = this.zzb.zzb();
                        this.zzb.zzz(Math.min(4098, Math.max(i14, zzb3 + zzb3)));
                    }
                }
            } else {
                int min2 = Math.min(zzen.zza(), this.zzc - i12);
                zzen.zzB(this.zzb.zzH(), this.zzd, min2);
                int i15 = this.zzd + min2;
                this.zzd = i15;
                int i16 = this.zzc;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.zze) {
                        this.zzb.zzE(i16);
                    } else if (zzew.zzg(this.zzb.zzH(), 0, i16, -1) != 0) {
                        this.zzf = true;
                        return;
                    } else {
                        this.zzb.zzE(this.zzc - 4);
                    }
                    this.zzb.zzF(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    public final void zzb(zzeu zzeu, zzzx zzzx, zzaiz zzaiz) {
        this.zza.zzb(zzeu, zzzx, zzaiz);
        this.zzf = true;
    }

    public final void zzc() {
        this.zzf = true;
    }
}
