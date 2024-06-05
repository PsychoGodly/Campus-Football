package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzahz implements zzahn {
    private final zzen zza = new zzen(10);
    private zzabb zzb;
    private boolean zzc;
    private long zzd = -9223372036854775807L;
    private int zze;
    private int zzf;

    public final void zza(zzen zzen) {
        zzdl.zzb(this.zzb);
        if (this.zzc) {
            int zza2 = zzen.zza();
            int i10 = this.zzf;
            if (i10 < 10) {
                int min = Math.min(zza2, 10 - i10);
                System.arraycopy(zzen.zzH(), zzen.zzc(), this.zza.zzH(), this.zzf, min);
                if (this.zzf + min == 10) {
                    this.zza.zzF(0);
                    if (this.zza.zzk() == 73 && this.zza.zzk() == 68 && this.zza.zzk() == 51) {
                        this.zza.zzG(3);
                        this.zze = this.zza.zzj() + 10;
                    } else {
                        zzee.zze("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzc = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(zza2, this.zze - this.zzf);
            this.zzb.zzq(zzen, min2);
            this.zzf += min2;
        }
    }

    public final void zzb(zzzx zzzx, zzaiz zzaiz) {
        zzaiz.zzc();
        zzabb zzv = zzzx.zzv(zzaiz.zza(), 5);
        this.zzb = zzv;
        zzad zzad = new zzad();
        zzad.zzH(zzaiz.zzb());
        zzad.zzS("application/id3");
        zzv.zzk(zzad.zzY());
    }

    public final void zzc() {
        int i10;
        zzdl.zzb(this.zzb);
        if (this.zzc && (i10 = this.zze) != 0 && this.zzf == i10) {
            long j10 = this.zzd;
            if (j10 != -9223372036854775807L) {
                this.zzb.zzs(j10, 1, i10, 0, (zzaba) null);
            }
            this.zzc = false;
        }
    }

    public final void zzd(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.zzc = true;
            if (j10 != -9223372036854775807L) {
                this.zzd = j10;
            }
            this.zze = 0;
            this.zzf = 0;
        }
    }

    public final void zze() {
        this.zzc = false;
        this.zzd = -9223372036854775807L;
    }
}
