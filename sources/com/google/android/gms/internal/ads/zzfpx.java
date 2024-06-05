package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfpx extends zzfpz {
    zzfpx() {
        super((zzfpx) null);
    }

    static final zzfpz zzf(int i10) {
        return i10 < 0 ? zzfpz.zzb : i10 > 0 ? zzfpz.zzc : zzfpz.zza;
    }

    public final int zza() {
        return 0;
    }

    public final zzfpz zzb(int i10, int i11) {
        return zzf(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
    }

    public final zzfpz zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    public final zzfpz zzd(boolean z10, boolean z11) {
        return zzf(zzfsq.zza(z10, z11));
    }

    public final zzfpz zze(boolean z10, boolean z11) {
        return zzf(zzfsq.zza(false, false));
    }
}
