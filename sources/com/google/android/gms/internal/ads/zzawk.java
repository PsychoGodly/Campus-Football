package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzawk {
    zzata zza;
    boolean zzb;
    /* access modifiers changed from: private */
    public final ExecutorService zzc;

    public zzawk() {
        this.zzc = zzbyp.zzb;
    }

    public zzawk(Context context) {
        ExecutorService executorService = zzbyp.zzb;
        this.zzc = executorService;
        executorService.execute(new zzawf(this, context));
    }
}
