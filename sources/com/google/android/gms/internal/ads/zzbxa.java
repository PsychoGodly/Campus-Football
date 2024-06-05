package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbxa implements Callable {
    public final /* synthetic */ zzbxf zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzbxa(zzbxf zzbxf, Context context) {
        this.zza = zzbxf;
        this.zzb = context;
    }

    public final Object call() {
        return this.zza.zzg(this.zzb);
    }
}
