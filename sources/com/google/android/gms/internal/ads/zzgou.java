package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgou extends zzgow {
    final /* synthetic */ zzgpe zza;
    private int zzb = 0;
    private final int zzc;

    zzgou(zzgpe zzgpe) {
        this.zza = zzgpe;
        this.zzc = zzgpe.zzd();
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i10 = this.zzb;
        if (i10 < this.zzc) {
            this.zzb = i10 + 1;
            return this.zza.zzb(i10);
        }
        throw new NoSuchElementException();
    }
}
