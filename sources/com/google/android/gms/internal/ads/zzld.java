package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzld {
    private final zzaa zza;
    private final SparseArray zzb;

    public zzld(zzaa zzaa, SparseArray sparseArray) {
        this.zza = zzaa;
        SparseArray sparseArray2 = new SparseArray(zzaa.zzb());
        for (int i10 = 0; i10 < zzaa.zzb(); i10++) {
            int zza2 = zzaa.zza(i10);
            zzlc zzlc = (zzlc) sparseArray.get(zza2);
            Objects.requireNonNull(zzlc);
            sparseArray2.append(zza2, zzlc);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i10) {
        return this.zza.zza(i10);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzlc zzc(int i10) {
        zzlc zzlc = (zzlc) this.zzb.get(i10);
        Objects.requireNonNull(zzlc);
        return zzlc;
    }

    public final boolean zzd(int i10) {
        return this.zza.zzc(i10);
    }
}
