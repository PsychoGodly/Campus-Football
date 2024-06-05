package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfbh {
    private final long zza;
    private final zzfbg zzb = new zzfbg();
    private long zzc;
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfbh() {
        long a10 = t.b().a();
        this.zza = a10;
        this.zzc = a10;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfbg zzd() {
        zzfbg zza2 = this.zzb.clone();
        zzfbg zzfbg = this.zzb;
        zzfbg.zza = false;
        zzfbg.zzb = 0;
        return zza2;
    }

    public final String zze() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }

    public final void zzf() {
        this.zzc = t.b().a();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}
