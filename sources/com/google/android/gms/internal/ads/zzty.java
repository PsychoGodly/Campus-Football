package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzty implements zzte {
    private final zzff zzc;
    private int zzd = 1048576;
    private final zztx zze;
    private final zzwx zzf;
    private final zzpq zzg;

    public zzty(zzff zzff, zztx zztx, byte[] bArr) {
        zzpq zzpq = new zzpq();
        zzwx zzwx = new zzwx(-1);
        this.zzc = zzff;
        this.zze = zztx;
        this.zzg = zzpq;
        this.zzf = zzwx;
    }

    public final zzty zza(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzua zzb(zzbg zzbg) {
        Objects.requireNonNull(zzbg.zzd);
        return new zzua(zzbg, this.zzc, this.zze, zzpz.zza, this.zzf, this.zzd, (zztz) null, (byte[]) null);
    }
}
