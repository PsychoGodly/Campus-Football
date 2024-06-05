package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zztg implements zzsq, zzsp {
    /* access modifiers changed from: private */
    public final zzsq zza;
    private final long zzb;
    private zzsp zzc;

    public zztg(zzsq zzsq, long j10) {
        this.zza = zzsq;
        this.zzb = j10;
    }

    public final long zza(long j10, zzkq zzkq) {
        return this.zza.zza(j10 - this.zzb, zzkq) + this.zzb;
    }

    public final long zzb() {
        long zzb2 = this.zza.zzb();
        if (zzb2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb2 + this.zzb;
    }

    public final long zzc() {
        long zzc2 = this.zza.zzc();
        if (zzc2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc2 + this.zzb;
    }

    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    public final long zze(long j10) {
        return this.zza.zze(j10 - this.zzb) + this.zzb;
    }

    public final long zzf(zzwe[] zzweArr, boolean[] zArr, zzuj[] zzujArr, boolean[] zArr2, long j10) {
        zzuj[] zzujArr2 = zzujArr;
        zzuj[] zzujArr3 = new zzuj[zzujArr2.length];
        int i10 = 0;
        while (true) {
            zzuj zzuj = null;
            if (i10 >= zzujArr2.length) {
                break;
            }
            zzth zzth = (zzth) zzujArr2[i10];
            if (zzth != null) {
                zzuj = zzth.zzc();
            }
            zzujArr3[i10] = zzuj;
            i10++;
        }
        long zzf = this.zza.zzf(zzweArr, zArr, zzujArr3, zArr2, j10 - this.zzb);
        for (int i11 = 0; i11 < zzujArr2.length; i11++) {
            zzuj zzuj2 = zzujArr3[i11];
            if (zzuj2 == null) {
                zzujArr2[i11] = null;
            } else {
                zzuj zzuj3 = zzujArr2[i11];
                if (zzuj3 == null || ((zzth) zzuj3).zzc() != zzuj2) {
                    zzujArr2[i11] = new zzth(zzuj2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
    }

    public final /* bridge */ /* synthetic */ void zzg(zzul zzul) {
        zzsq zzsq = (zzsq) zzul;
        zzsp zzsp = this.zzc;
        Objects.requireNonNull(zzsp);
        zzsp.zzg(this);
    }

    public final zzur zzh() {
        return this.zza.zzh();
    }

    public final void zzi(zzsq zzsq) {
        zzsp zzsp = this.zzc;
        Objects.requireNonNull(zzsp);
        zzsp.zzi(this);
    }

    public final void zzj(long j10, boolean z10) {
        this.zza.zzj(j10 - this.zzb, false);
    }

    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    public final void zzl(zzsp zzsp, long j10) {
        this.zzc = zzsp;
        this.zza.zzl(this, j10 - this.zzb);
    }

    public final void zzm(long j10) {
        this.zza.zzm(j10 - this.zzb);
    }

    public final boolean zzo(long j10) {
        return this.zza.zzo(j10 - this.zzb);
    }

    public final boolean zzp() {
        return this.zza.zzp();
    }
}
