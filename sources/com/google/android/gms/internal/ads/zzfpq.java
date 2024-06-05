package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzfpq implements Iterator {
    int zzb;
    int zzc;
    int zzd = -1;
    final /* synthetic */ zzfpu zze;

    /* synthetic */ zzfpq(zzfpu zzfpu, zzfpm zzfpm) {
        this.zze = zzfpu;
        this.zzb = zzfpu.zzf;
        this.zzc = zzfpu.zze();
    }

    private final void zzb() {
        if (this.zze.zzf != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    public final Object next() {
        zzb();
        if (hasNext()) {
            int i10 = this.zzc;
            this.zzd = i10;
            Object zza = zza(i10);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        zzb();
        zzfnu.zzi(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzfpu zzfpu = this.zze;
        int i10 = this.zzd;
        Object[] objArr = zzfpu.zzb;
        objArr.getClass();
        zzfpu.remove(objArr[i10]);
        this.zzc--;
        this.zzd = -1;
    }

    /* access modifiers changed from: package-private */
    public abstract Object zza(int i10);
}
