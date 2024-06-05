package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgqt extends AbstractList {
    private final List zza;
    private final zzgqs zzb;

    public zzgqt(List list, zzgqs zzgqs) {
        this.zza = list;
        this.zzb = zzgqs;
    }

    public final Object get(int i10) {
        zzaxc zzb2 = zzaxc.zzb(((Integer) this.zza.get(i10)).intValue());
        return zzb2 == null ? zzaxc.AD_FORMAT_TYPE_UNSPECIFIED : zzb2;
    }

    public final int size() {
        return this.zza.size();
    }
}
