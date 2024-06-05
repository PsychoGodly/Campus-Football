package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzub implements zzwn {
    public long zza;
    public long zzb;
    public zzwm zzc;
    public zzub zzd;

    public zzub(long j10, int i10) {
        zze(j10, 65536);
    }

    public final int zza(long j10) {
        long j11 = j10 - this.zza;
        int i10 = this.zzc.zzb;
        return (int) j11;
    }

    public final zzub zzb() {
        this.zzc = null;
        zzub zzub = this.zzd;
        this.zzd = null;
        return zzub;
    }

    public final zzwm zzc() {
        zzwm zzwm = this.zzc;
        Objects.requireNonNull(zzwm);
        return zzwm;
    }

    public final zzwn zzd() {
        zzub zzub = this.zzd;
        if (zzub == null || zzub.zzc == null) {
            return null;
        }
        return zzub;
    }

    public final void zze(long j10, int i10) {
        zzdl.zzf(this.zzc == null);
        this.zza = j10;
        this.zzb = j10 + 65536;
    }
}
