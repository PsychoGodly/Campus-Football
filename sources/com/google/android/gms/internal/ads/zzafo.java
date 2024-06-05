package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzafo implements zzafm {
    private final int zza;
    private final int zzb;
    private final zzen zzc;

    public zzafo(zzafi zzafi, zzaf zzaf) {
        zzen zzen = zzafi.zza;
        this.zzc = zzen;
        zzen.zzF(12);
        int zzn = zzen.zzn();
        if ("audio/raw".equals(zzaf.zzm)) {
            int zzo = zzew.zzo(zzaf.zzB, zzaf.zzz);
            if (zzn == 0 || zzn % zzo != 0) {
                zzee.zze("AtomParsers", "Audio sample size mismatch. stsd sample size: " + zzo + ", stsz sample size: " + zzn);
                zzn = zzo;
            }
        }
        this.zza = zzn == 0 ? -1 : zzn;
        this.zzb = zzen.zzn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        int i10 = this.zza;
        return i10 == -1 ? this.zzc.zzn() : i10;
    }
}
