package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzafp implements zzafm {
    private final zzen zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzafp(zzafi zzafi) {
        zzen zzen = zzafi.zza;
        this.zza = zzen;
        zzen.zzF(12);
        this.zzc = zzen.zzn() & 255;
        this.zzb = zzen.zzn();
    }

    public final int zza() {
        return -1;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        int i10 = this.zzc;
        if (i10 == 8) {
            return this.zza.zzk();
        }
        if (i10 == 16) {
            return this.zza.zzo();
        }
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        if (i11 % 2 != 0) {
            return this.zze & 15;
        }
        int zzk = this.zza.zzk();
        this.zze = zzk;
        return (zzk & 240) >> 4;
    }
}
