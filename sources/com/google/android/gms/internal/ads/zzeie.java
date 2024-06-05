package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.b5;
import com.google.android.gms.ads.internal.client.i2;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeie implements zzcwz {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(i2 i2Var) {
        this.zza.set(i2Var);
    }

    public final void zzh(b5 b5Var) {
        zzevh.zza(this.zza, new zzeid(b5Var));
    }
}
