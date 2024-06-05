package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzq implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;

    public zzq(zzdr zzdr, zzdr zzdr2, zzdr zzdr3) {
        this.zza = zzdr;
        this.zzb = zzdr2;
        this.zzc = zzdr3;
    }

    /* renamed from: zza */
    public final zzn zzb() {
        return new zzn((Application) this.zza.zzb(), ((zzb) this.zzb).zzb(), (zzas) this.zzc.zzb());
    }
}
