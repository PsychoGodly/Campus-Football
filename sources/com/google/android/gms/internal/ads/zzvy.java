package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzvy {
    public final int zza;
    public final zzcp zzb;
    public final int zzc;
    public final zzaf zzd;

    public zzvy(int i10, zzcp zzcp, int i11) {
        this.zza = i10;
        this.zzb = zzcp;
        this.zzc = i11;
        this.zzd = zzcp.zzb(i11);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzvy zzvy);
}
