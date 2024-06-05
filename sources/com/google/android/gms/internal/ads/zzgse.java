package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgse {
    private static final zzgse zza = new zzgse();
    private final zzgsq zzb = new zzgro();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    private zzgse() {
    }

    public static zzgse zza() {
        return zza;
    }

    public final zzgsp zzb(Class cls) {
        zzgqw.zzf(cls, "messageType");
        zzgsp zzgsp = (zzgsp) this.zzc.get(cls);
        if (zzgsp == null) {
            zzgsp = this.zzb.zza(cls);
            zzgqw.zzf(cls, "messageType");
            zzgqw.zzf(zzgsp, "schema");
            zzgsp zzgsp2 = (zzgsp) this.zzc.putIfAbsent(cls, zzgsp);
            return zzgsp2 == null ? zzgsp : zzgsp2;
        }
    }
}
