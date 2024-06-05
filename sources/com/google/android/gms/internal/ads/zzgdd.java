package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgdd {
    private static final zzgdd zza = new zzgdd();
    private static final zzgdc zzb = new zzgdc((zzgdb) null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgdd zza() {
        return zza;
    }

    public final zzggn zzb() {
        zzggn zzggn = (zzggn) this.zzc.get();
        return zzggn == null ? zzb : zzggn;
    }
}
