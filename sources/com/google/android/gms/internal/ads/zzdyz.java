package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdyz implements Callable {
    public final /* synthetic */ zzdyx zza;

    public /* synthetic */ zzdyz(zzdyx zzdyx) {
        this.zza = zzdyx;
    }

    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}
