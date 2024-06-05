package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzcd implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;
    private final zzdr zzd;
    private final zzdr zze;
    private final zzdr zzf;
    private final zzdr zzg;
    private final zzdr zzh;

    public zzcd(zzdr zzdr, zzdr zzdr2, zzdr zzdr3, zzdr zzdr4, zzdr zzdr5, zzdr zzdr6, zzdr zzdr7, zzdr zzdr8) {
        this.zza = zzdr;
        this.zzb = zzdr2;
        this.zzc = zzdr3;
        this.zzd = zzdr4;
        this.zze = zzdr5;
        this.zzf = zzdr6;
        this.zzg = zzdr7;
        this.zzh = zzdr8;
    }

    /* renamed from: zza */
    public final zzcc zzb() {
        Handler handler = zzct.zza;
        zzdq.zza(handler);
        Executor executor = zzct.zzb;
        zzdq.zza(executor);
        return new zzcc((Application) this.zza.zzb(), (zzby) this.zzb.zzb(), handler, executor, (zzg) this.zze.zzb(), ((zzar) this.zzf).zzb(), (zzbe) this.zzg.zzb(), (zzas) this.zzh.zzb());
    }
}
