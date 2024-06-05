package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzar implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;

    public zzar(zzdr zzdr, zzdr zzdr2, zzdr zzdr3) {
        this.zza = zzdr;
        this.zzb = zzdr2;
        this.zzc = zzdr3;
    }

    /* renamed from: zza */
    public final zzaq zzb() {
        Executor executor = zzct.zzb;
        zzdq.zza(executor);
        return new zzaq((Application) this.zza.zzb(), (zzas) this.zzb.zzb(), executor);
    }
}
