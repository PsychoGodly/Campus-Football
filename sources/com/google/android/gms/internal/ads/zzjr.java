package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzjr {
    public final zzsq zza;
    public final Object zzb;
    public final zzuj[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzjs zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzko[] zzi;
    private final zzwk zzj;
    private final zzkg zzk;
    private zzjr zzl;
    private zzur zzm = zzur.zza;
    private zzwl zzn;
    private long zzo;

    public zzjr(zzko[] zzkoArr, long j10, zzwk zzwk, zzwt zzwt, zzkg zzkg, zzjs zzjs, zzwl zzwl, byte[] bArr) {
        zzjs zzjs2 = zzjs;
        this.zzi = zzkoArr;
        this.zzo = j10;
        this.zzj = zzwk;
        this.zzk = zzkg;
        zzss zzss = zzjs2.zza;
        this.zzb = zzss.zza;
        this.zzf = zzjs2;
        this.zzn = zzwl;
        this.zzc = new zzuj[2];
        this.zzh = new boolean[2];
        long j11 = zzjs2.zzb;
        long j12 = zzjs2.zzd;
        zzwt zzwt2 = zzwt;
        zzsq zzo2 = zzkg.zzo(zzss, zzwt, j11);
        this.zza = j12 != -9223372036854775807L ? new zzrx(zzo2, true, 0, j12) : zzo2;
    }

    private final void zzs() {
        if (zzu()) {
            int i10 = 0;
            while (true) {
                zzwl zzwl = this.zzn;
                if (i10 < zzwl.zza) {
                    zzwl.zzb(i10);
                    zzwe zzwe = this.zzn.zzc[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private final void zzt() {
        if (zzu()) {
            int i10 = 0;
            while (true) {
                zzwl zzwl = this.zzn;
                if (i10 < zzwl.zza) {
                    zzwl.zzb(i10);
                    zzwe zzwe = this.zzn.zzc[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzwl zzwl, long j10, boolean z10) {
        return zzb(zzwl, j10, false, new boolean[2]);
    }

    public final long zzb(zzwl zzwl, long j10, boolean z10, boolean[] zArr) {
        zzwl zzwl2 = zzwl;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= zzwl2.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z10 || !zzwl.zza(this.zzn, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            zzko[] zzkoArr = this.zzi;
            if (i11 >= 2) {
                break;
            }
            zzkoArr[i11].zzb();
            i11++;
        }
        zzs();
        this.zzn = zzwl2;
        zzt();
        long zzf2 = this.zza.zzf(zzwl2.zzc, this.zzh, this.zzc, zArr, j10);
        int i12 = 0;
        while (true) {
            zzko[] zzkoArr2 = this.zzi;
            if (i12 >= 2) {
                break;
            }
            zzkoArr2[i12].zzb();
            i12++;
        }
        this.zze = false;
        int i13 = 0;
        while (true) {
            zzuj[] zzujArr = this.zzc;
            if (i13 >= 2) {
                return zzf2;
            }
            if (zzujArr[i13] != null) {
                zzdl.zzf(zzwl.zzb(i13));
                this.zzi[i13].zzb();
                this.zze = true;
            } else {
                zzdl.zzf(zzwl2.zzc[i13] == null);
            }
            i13++;
        }
    }

    public final long zzc() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long zzb2 = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
        return zzb2 == Long.MIN_VALUE ? this.zzf.zze : zzb2;
    }

    public final long zzd() {
        if (!this.zzd) {
            return 0;
        }
        return this.zza.zzc();
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzjr zzg() {
        return this.zzl;
    }

    public final zzur zzh() {
        return this.zzm;
    }

    public final zzwl zzi() {
        return this.zzn;
    }

    public final zzwl zzj(float f10, zzcn zzcn) throws zzhj {
        zzwl zzn2 = this.zzj.zzn(this.zzi, this.zzm, this.zzf.zza, zzcn);
        for (zzwe zzwe : zzn2.zzc) {
        }
        return zzn2;
    }

    public final void zzk(long j10) {
        zzdl.zzf(zzu());
        this.zza.zzo(j10 - this.zzo);
    }

    public final void zzl(float f10, zzcn zzcn) throws zzhj {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzwl zzj2 = zzj(f10, zzcn);
        zzjs zzjs = this.zzf;
        long j10 = zzjs.zzb;
        long j11 = zzjs.zze;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0, j11 - 1);
        }
        long zza2 = zza(zzj2, j10, false);
        long j12 = this.zzo;
        zzjs zzjs2 = this.zzf;
        this.zzo = j12 + (zzjs2.zzb - zza2);
        this.zzf = zzjs2.zzb(zza2);
    }

    public final void zzm(long j10) {
        zzdl.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j10 - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzkg zzkg = this.zzk;
        zzsq zzsq = this.zza;
        try {
            if (zzsq instanceof zzrx) {
                zzkg.zzh(((zzrx) zzsq).zza);
            } else {
                zzkg.zzh(zzsq);
            }
        } catch (RuntimeException e10) {
            zzee.zzc("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final void zzo(zzjr zzjr) {
        if (zzjr != this.zzl) {
            zzs();
            this.zzl = zzjr;
            zzt();
        }
    }

    public final void zzp(long j10) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zzsq zzsq = this.zza;
        if (zzsq instanceof zzrx) {
            long j10 = this.zzf.zzd;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((zzrx) zzsq).zzn(0, j10);
        }
    }

    public final boolean zzr() {
        return this.zzd && (!this.zze || this.zza.zzb() == Long.MIN_VALUE);
    }
}
