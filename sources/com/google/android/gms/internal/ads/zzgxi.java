package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgxi {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzgxi(int i10, int i11, zzgxh zzgxh) {
        this.zza = zzgwv.zzc(i10);
        this.zzb = zzgwv.zzc(i11);
    }

    public final zzgxi zza(zzgxl zzgxl) {
        this.zzb.add(zzgxl);
        return this;
    }

    public final zzgxi zzb(zzgxl zzgxl) {
        this.zza.add(zzgxl);
        return this;
    }

    public final zzgxj zzc() {
        return new zzgxj(this.zza, this.zzb, (zzgxh) null);
    }
}
