package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfck {
    public static final zzfcr zza(Callable callable, Object obj, zzfcs zzfcs) {
        return zzb(callable, zzfcs.zzb, obj, zzfcs);
    }

    public static final zzfcr zzb(Callable callable, zzfuu zzfuu, Object obj, zzfcs zzfcs) {
        return new zzfcr(zzfcs, obj, (String) null, zzfcs.zza, Collections.emptyList(), zzfuu.zzb(callable), (zzfcq) null);
    }

    public static final zzfcr zzc(zzfut zzfut, Object obj, zzfcs zzfcs) {
        return new zzfcr(zzfcs, obj, (String) null, zzfcs.zza, Collections.emptyList(), zzfut, (zzfcq) null);
    }

    public static final zzfcr zzd(zzfce zzfce, zzfuu zzfuu, Object obj, zzfcs zzfcs) {
        return zzb(new zzfcj(zzfce), zzfuu, obj, zzfcs);
    }
}
