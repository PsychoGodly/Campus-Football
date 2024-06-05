package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzahx {
    private final zzabb zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzahx(zzabb zzabb) {
        this.zza = zzabb;
    }

    private final void zze(int i10) {
        long j10 = this.zzl;
        if (j10 != -9223372036854775807L) {
            this.zza.zzs(j10, this.zzm ? 1 : 0, (int) (this.zzb - this.zzk), i10, (zzaba) null);
        }
    }

    public final void zza(long j10, int i10, boolean z10) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z10 && this.zzi) {
                zze(i10 + ((int) (j10 - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }

    public final void zzb(byte[] bArr, int i10, int i11) {
        if (this.zzf) {
            int i12 = this.zzd;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                this.zzg = (bArr[i13] & 128) != 0;
                this.zzf = false;
                return;
            }
            this.zzd = i12 + (i11 - i10);
        }
    }

    public final void zzc() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zzd(long j10, int i10, int i11, long j11, boolean z10) {
        boolean z11 = false;
        this.zzg = false;
        this.zzh = false;
        this.zze = j11;
        this.zzd = 0;
        this.zzb = j10;
        if (i11 >= 32 && i11 != 40) {
            if (this.zzi && !this.zzj) {
                if (z10) {
                    zze(i10);
                }
                this.zzi = false;
            }
            if (i11 <= 35 || i11 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z12 = i11 >= 16 && i11 <= 21;
        this.zzc = z12;
        if (z12 || i11 <= 9) {
            z11 = true;
        }
        this.zzf = z11;
    }
}
