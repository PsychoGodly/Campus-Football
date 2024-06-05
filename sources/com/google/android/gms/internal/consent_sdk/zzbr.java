package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzbr implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;

    public zzbr(zzdr zzdr, zzdr zzdr2) {
        this.zza = zzdr;
        this.zzb = zzdr2;
    }

    public final /* synthetic */ Object zzb() {
        zzdr zzdr = this.zza;
        Executor executor = zzct.zzb;
        zzdq.zza(executor);
        return new zzbq(zzdr, executor);
    }
}
