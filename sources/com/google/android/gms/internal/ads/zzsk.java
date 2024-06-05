package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzsk implements zzsq, zzsp {
    public final zzss zza;
    private final long zzb;
    private zzsu zzc;
    private zzsq zzd;
    private zzsp zze;
    private long zzf = -9223372036854775807L;
    private final zzwt zzg;

    public zzsk(zzss zzss, zzwt zzwt, long j10, byte[] bArr) {
        this.zza = zzss;
        this.zzg = zzwt;
        this.zzb = j10;
    }

    private final long zzv(long j10) {
        long j11 = this.zzf;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    public final long zza(long j10, zzkq zzkq) {
        zzsq zzsq = this.zzd;
        int i10 = zzew.zza;
        return zzsq.zza(j10, zzkq);
    }

    public final long zzb() {
        zzsq zzsq = this.zzd;
        int i10 = zzew.zza;
        return zzsq.zzb();
    }

    public final long zzc() {
        zzsq zzsq = this.zzd;
        int i10 = zzew.zza;
        return zzsq.zzc();
    }

    public final long zzd() {
        zzsq zzsq = this.zzd;
        int i10 = zzew.zza;
        return zzsq.zzd();
    }

    public final long zze(long j10) {
        zzsq zzsq = this.zzd;
        int i10 = zzew.zza;
        return zzsq.zze(j10);
    }

    public final long zzf(zzwe[] zzweArr, boolean[] zArr, zzuj[] zzujArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.zzf;
        if (j12 == -9223372036854775807L || j10 != this.zzb) {
            j11 = j10;
        } else {
            this.zzf = -9223372036854775807L;
            j11 = j12;
        }
        zzsq zzsq = this.zzd;
        int i10 = zzew.zza;
        return zzsq.zzf(zzweArr, zArr, zzujArr, zArr2, j11);
    }

    public final /* bridge */ /* synthetic */ void zzg(zzul zzul) {
        zzsq zzsq = (zzsq) zzul;
        zzsp zzsp = this.zze;
        int i10 = zzew.zza;
        zzsp.zzg(this);
    }

    public final zzur zzh() {
        zzsq zzsq = this.zzd;
        int i10 = zzew.zza;
        return zzsq.zzh();
    }

    public final void zzi(zzsq zzsq) {
        zzsp zzsp = this.zze;
        int i10 = zzew.zza;
        zzsp.zzi(this);
    }

    public final void zzj(long j10, boolean z10) {
        zzsq zzsq = this.zzd;
        int i10 = zzew.zza;
        zzsq.zzj(j10, false);
    }

    public final void zzk() throws IOException {
        try {
            zzsq zzsq = this.zzd;
            if (zzsq != null) {
                zzsq.zzk();
                return;
            }
            zzsu zzsu = this.zzc;
            if (zzsu != null) {
                zzsu.zzy();
            }
        } catch (IOException e10) {
            throw e10;
        }
    }

    public final void zzl(zzsp zzsp, long j10) {
        this.zze = zzsp;
        zzsq zzsq = this.zzd;
        if (zzsq != null) {
            zzsq.zzl(this, zzv(this.zzb));
        }
    }

    public final void zzm(long j10) {
        zzsq zzsq = this.zzd;
        int i10 = zzew.zza;
        zzsq.zzm(j10);
    }

    public final long zzn() {
        return this.zzf;
    }

    public final boolean zzo(long j10) {
        zzsq zzsq = this.zzd;
        return zzsq != null && zzsq.zzo(j10);
    }

    public final boolean zzp() {
        zzsq zzsq = this.zzd;
        return zzsq != null && zzsq.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzss zzss) {
        long zzv = zzv(this.zzb);
        zzsu zzsu = this.zzc;
        Objects.requireNonNull(zzsu);
        zzsq zzH = zzsu.zzH(zzss, this.zzg, zzv);
        this.zzd = zzH;
        if (this.zze != null) {
            zzH.zzl(this, zzv);
        }
    }

    public final void zzs(long j10) {
        this.zzf = j10;
    }

    public final void zzt() {
        zzsq zzsq = this.zzd;
        if (zzsq != null) {
            zzsu zzsu = this.zzc;
            Objects.requireNonNull(zzsu);
            zzsu.zzF(zzsq);
        }
    }

    public final void zzu(zzsu zzsu) {
        zzdl.zzf(this.zzc == null);
        this.zzc = zzsu;
    }
}
