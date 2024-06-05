package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzca {
    private final zzy zza = new zzy();

    public final zzca zza(int i10) {
        this.zza.zza(i10);
        return this;
    }

    public final zzca zzb(zzcc zzcc) {
        zzy zzy = this.zza;
        zzaa zza2 = zzcc.zzd;
        for (int i10 = 0; i10 < zza2.zzb(); i10++) {
            zzy.zza(zza2.zza(i10));
        }
        return this;
    }

    public final zzca zzc(int... iArr) {
        zzy zzy = this.zza;
        for (int i10 = 0; i10 < 21; i10++) {
            zzy.zza(iArr[i10]);
        }
        return this;
    }

    public final zzca zzd(int i10, boolean z10) {
        zzy zzy = this.zza;
        if (z10) {
            zzy.zza(i10);
        }
        return this;
    }

    public final zzcc zze() {
        return new zzcc(this.zza.zzb(), (zzcb) null);
    }
}
