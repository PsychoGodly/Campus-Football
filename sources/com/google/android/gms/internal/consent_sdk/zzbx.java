package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzbx implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;

    public zzbx(zzdr zzdr, zzdr zzdr2, zzdr zzdr3) {
        this.zza = zzdr;
        this.zzb = zzdr2;
        this.zzc = zzdr3;
    }

    /* renamed from: zza */
    public final zzbw zzb() {
        Handler handler = zzct.zza;
        zzdq.zza(handler);
        return new zzbw((zzby) this.zza.zzb(), handler, ((zzcd) this.zzc).zzb());
    }
}
