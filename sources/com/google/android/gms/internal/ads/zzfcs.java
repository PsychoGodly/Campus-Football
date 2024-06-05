package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzfcs {
    /* access modifiers changed from: private */
    public static final zzfut zza = zzfuj.zzh((Object) null);
    /* access modifiers changed from: private */
    public final zzfuu zzb;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService zzc;
    /* access modifiers changed from: private */
    public final zzfct zzd;

    public zzfcs(zzfuu zzfuu, ScheduledExecutorService scheduledExecutorService, zzfct zzfct) {
        this.zzb = zzfuu;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfct;
    }

    public final zzfci zza(Object obj, zzfut... zzfutArr) {
        return new zzfci(this, obj, Arrays.asList(zzfutArr), (zzfch) null);
    }

    public final zzfcr zzb(Object obj, zzfut zzfut) {
        return new zzfcr(this, obj, (String) null, zzfut, Collections.singletonList(zzfut), zzfut, (zzfcq) null);
    }

    /* access modifiers changed from: protected */
    public abstract String zzf(Object obj);
}
