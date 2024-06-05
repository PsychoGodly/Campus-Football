package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class zzav implements Iterator<zzaq> {
    private int zza = 0;
    private final /* synthetic */ zzas zzb;

    zzav(zzas zzas) {
        this.zzb = zzas;
    }

    public final boolean hasNext() {
        return this.zza < this.zzb.zza.length();
    }

    public final /* synthetic */ Object next() {
        if (this.zza < this.zzb.zza.length()) {
            int i10 = this.zza;
            this.zza = i10 + 1;
            return new zzas(String.valueOf(i10));
        }
        throw new NoSuchElementException();
    }
}
