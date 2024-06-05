package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfo implements zzff {
    private final zzgc zza = new zzgc();
    private zzgi zzb;
    private String zzc;
    private int zzd = 8000;
    private int zze = 8000;
    private boolean zzf;

    public final zzfo zzb(boolean z10) {
        this.zzf = true;
        return this;
    }

    public final zzfo zzc(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzfo zzd(int i10) {
        this.zze = i10;
        return this;
    }

    public final zzfo zze(zzgi zzgi) {
        this.zzb = zzgi;
        return this;
    }

    public final zzfo zzf(String str) {
        this.zzc = str;
        return this;
    }

    /* renamed from: zzg */
    public final zzft zza() {
        zzft zzft = new zzft(this.zzc, this.zzd, this.zze, this.zzf, this.zza, (zzfnv) null, false, (zzfs) null);
        zzgi zzgi = this.zzb;
        if (zzgi != null) {
            zzft.zzf(zzgi);
        }
        return zzft;
    }
}
