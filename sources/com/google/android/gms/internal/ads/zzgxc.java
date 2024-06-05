package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgxc extends zzgwu {
    private static final zzgxl zza = zzgwz.zza(Collections.emptyMap());

    /* synthetic */ zzgxc(Map map, zzgxa zzgxa) {
        super(map);
    }

    public static zzgxb zzc(int i10) {
        return new zzgxb(i10, (zzgxa) null);
    }

    /* renamed from: zzd */
    public final Map zzb() {
        LinkedHashMap zzb = zzgwv.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzgxl) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
