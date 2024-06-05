package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzy {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzy zza(int i10) {
        zzdl.zzf(!this.zzb);
        this.zza.append(i10, true);
        return this;
    }

    public final zzaa zzb() {
        zzdl.zzf(!this.zzb);
        this.zzb = true;
        return new zzaa(this.zza, (zzz) null);
    }
}
