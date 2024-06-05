package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzafw {
    public final zzabb zza;
    public final zzagi zzb = new zzagi();
    public final zzen zzc = new zzen();
    public zzagj zzd;
    public zzafs zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzen zzj = new zzen(1);
    private final zzen zzk = new zzen();
    /* access modifiers changed from: private */
    public boolean zzl;

    public zzafw(zzabb zzabb, zzagj zzagj, zzafs zzafs) {
        this.zza = zzabb;
        this.zzd = zzagj;
        this.zze = zzafs;
        zzh(zzagj, zzafs);
    }

    public final int zza() {
        int i10;
        if (!this.zzl) {
            i10 = this.zzd.zzg[this.zzf];
        } else {
            i10 = this.zzb.zzj[this.zzf] ? 1 : 0;
        }
        return zzf() != null ? i10 | 1073741824 : i10;
    }

    public final int zzb() {
        if (!this.zzl) {
            return this.zzd.zzd[this.zzf];
        }
        return this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i10, int i11) {
        zzen zzen;
        zzagh zzf2 = zzf();
        if (zzf2 == null) {
            return 0;
        }
        int i12 = zzf2.zzd;
        if (i12 != 0) {
            zzen = this.zzb.zzn;
        } else {
            byte[] bArr = (byte[]) zzew.zzH(zzf2.zze);
            zzen zzen2 = this.zzk;
            int length = bArr.length;
            zzen2.zzD(bArr, length);
            zzen = this.zzk;
            i12 = length;
        }
        boolean zzb2 = this.zzb.zzb(this.zzf);
        boolean z10 = zzb2 || i11 != 0;
        zzen zzen3 = this.zzj;
        zzen3.zzH()[0] = (byte) ((true != z10 ? 0 : 128) | i12);
        zzen3.zzF(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzen, i12, 1);
        if (!z10) {
            return i12 + 1;
        }
        if (!zzb2) {
            this.zzc.zzC(8);
            zzen zzen4 = this.zzc;
            byte[] zzH = zzen4.zzH();
            zzH[0] = 0;
            zzH[1] = 1;
            zzH[2] = 0;
            zzH[3] = (byte) i11;
            zzH[4] = (byte) ((i10 >> 24) & 255);
            zzH[5] = (byte) ((i10 >> 16) & 255);
            zzH[6] = (byte) ((i10 >> 8) & 255);
            zzH[7] = (byte) (i10 & 255);
            this.zza.zzr(zzen4, 8, 1);
            return i12 + 9;
        }
        zzen zzen5 = this.zzb.zzn;
        int zzo = zzen5.zzo();
        zzen5.zzG(-2);
        int i13 = (zzo * 6) + 2;
        if (i11 != 0) {
            this.zzc.zzC(i13);
            byte[] zzH2 = this.zzc.zzH();
            zzen5.zzB(zzH2, 0, i13);
            int i14 = (((zzH2[2] & 255) << 8) | (zzH2[3] & 255)) + i11;
            zzH2[2] = (byte) ((i14 >> 8) & 255);
            zzH2[3] = (byte) (i14 & 255);
            zzen5 = this.zzc;
        }
        this.zza.zzr(zzen5, i13, 1);
        return i12 + 1 + i13;
    }

    public final long zzd() {
        if (!this.zzl) {
            return this.zzd.zzc[this.zzf];
        }
        return this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzagi zzagi = this.zzb;
        return zzagi.zzi[this.zzf];
    }

    public final zzagh zzf() {
        if (!this.zzl) {
            return null;
        }
        zzagi zzagi = this.zzb;
        zzafs zzafs = zzagi.zza;
        int i10 = zzew.zza;
        int i11 = zzafs.zza;
        zzagh zzagh = zzagi.zzm;
        if (zzagh == null) {
            zzagh = this.zzd.zza.zza(i11);
        }
        if (zzagh == null || !zzagh.zza) {
            return null;
        }
        return zzagh;
    }

    public final void zzh(zzagj zzagj, zzafs zzafs) {
        this.zzd = zzagj;
        this.zze = zzafs;
        this.zza.zzk(zzagj.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzagi zzagi = this.zzb;
        zzagi.zzd = 0;
        zzagi.zzp = 0;
        zzagi.zzq = false;
        zzagi.zzk = false;
        zzagi.zzo = false;
        zzagi.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i10 = this.zzg + 1;
        this.zzg = i10;
        int[] iArr = this.zzb.zzg;
        int i11 = this.zzh;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.zzh = i11 + 1;
        this.zzg = 0;
        return false;
    }
}
