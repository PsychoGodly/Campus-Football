package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzgwt {
    final LinkedHashMap zza;

    zzgwt(int i10) {
        this.zza = zzgwv.zzb(i10);
    }

    /* access modifiers changed from: package-private */
    public final zzgwt zza(Object obj, zzgxl zzgxl) {
        LinkedHashMap linkedHashMap = this.zza;
        zzgxg.zza(obj, "key");
        zzgxg.zza(zzgxl, "provider");
        linkedHashMap.put(obj, zzgxl);
        return this;
    }
}
