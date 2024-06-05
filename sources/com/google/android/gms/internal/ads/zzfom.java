package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzfom extends zzfsk {
    private final int zza;
    private int zzb;

    protected zzfom(int i10, int i11) {
        zzfnu.zzb(i11, i10, "index");
        this.zza = i10;
        this.zzb = i11;
    }

    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i10 = this.zzb;
            this.zzb = i10 + 1;
            return zza(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.zzb;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.zzb - 1;
            this.zzb = i10;
            return zza(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.zzb - 1;
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(int i10);
}
