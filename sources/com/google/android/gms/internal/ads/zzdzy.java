package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdzy implements Callable {
    public final /* synthetic */ zzeaf zza;

    public /* synthetic */ zzdzy(zzeaf zzeaf) {
        this.zza = zzeaf;
    }

    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}
