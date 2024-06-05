package com.google.android.gms.internal.ads;

import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfru extends zzfqk {
    final /* synthetic */ zzfrv zza;

    zzfru(zzfrv zzfrv) {
        this.zza = zzfrv;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzfnu.zza(i10, this.zza.zzc, "index");
        zzfrv zzfrv = this.zza;
        int i11 = i10 + i10;
        Object obj = zzfrv.zzb[i11];
        obj.getClass();
        Object obj2 = zzfrv.zzb[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzc;
    }

    public final boolean zzf() {
        return true;
    }
}
