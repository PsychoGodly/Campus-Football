package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgsm implements Iterator {
    private final ArrayDeque zza;
    private zzgoz zzb;

    /* synthetic */ zzgsm(zzgpe zzgpe, zzgsl zzgsl) {
        if (zzgpe instanceof zzgso) {
            zzgso zzgso = (zzgso) zzgpe;
            ArrayDeque arrayDeque = new ArrayDeque(zzgso.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgso);
            this.zzb = zzb(zzgso.zzd);
            return;
        }
        this.zza = null;
        this.zzb = (zzgoz) zzgpe;
    }

    private final zzgoz zzb(zzgpe zzgpe) {
        while (zzgpe instanceof zzgso) {
            zzgso zzgso = (zzgso) zzgpe;
            this.zza.push(zzgso);
            zzgpe = zzgso.zzd;
        }
        return (zzgoz) zzgpe;
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: zza */
    public final zzgoz next() {
        zzgoz zzgoz;
        zzgoz zzgoz2 = this.zzb;
        if (zzgoz2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzgoz = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.zzb = zzgoz;
                } else {
                    zzgoz = zzb(((zzgso) this.zza.pop()).zze);
                }
            } while (zzgoz.zzD());
            this.zzb = zzgoz;
            return zzgoz2;
        }
        throw new NoSuchElementException();
    }
}
