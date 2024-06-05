package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzy implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;
    private final zzdr zzd;
    private final zzdr zze;
    private final zzdr zzf;
    private final zzdr zzg;
    private final zzdr zzh;
    private final zzdr zzi;

    public zzy(zzdr zzdr, zzdr zzdr2, zzdr zzdr3, zzdr zzdr4, zzdr zzdr5, zzdr zzdr6, zzdr zzdr7, zzdr zzdr8, zzdr zzdr9) {
        this.zza = zzdr;
        this.zzb = zzdr2;
        this.zzc = zzdr3;
        this.zzd = zzdr4;
        this.zze = zzdr5;
        this.zzf = zzdr6;
        this.zzg = zzdr7;
        this.zzh = zzdr8;
        this.zzi = zzdr9;
    }

    /* renamed from: zza */
    public final zzx zzb() {
        Handler handler = zzct.zza;
        zzdq.zza(handler);
        Executor executor = zzct.zzb;
        zzdq.zza(executor);
        return new zzx((Application) this.zza.zzb(), (zzae) this.zzb.zzb(), handler, executor, (zzas) this.zze.zzb(), (zzbq) this.zzf.zzb(), ((zzq) this.zzg).zzb(), ((zzad) this.zzh).zzb(), (zzg) this.zzi.zzb());
    }
}
