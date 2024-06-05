package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class zzah implements Iterator<zzaq> {
    private int zza = 0;
    private final /* synthetic */ zzaf zzb;

    zzah(zzaf zzaf) {
        this.zzb = zzaf;
    }

    public final boolean hasNext() {
        return this.zza < this.zzb.zzb();
    }

    public final /* synthetic */ Object next() {
        if (this.zza < this.zzb.zzb()) {
            zzaf zzaf = this.zzb;
            int i10 = this.zza;
            this.zza = i10 + 1;
            return zzaf.zza(i10);
        }
        int i11 = this.zza;
        throw new NoSuchElementException("Out of bounds index: " + i11);
    }
}
