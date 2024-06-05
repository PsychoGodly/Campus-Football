package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfia {
    private final Context zza;
    private final Looper zzb;

    public zzfia(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfio zza2 = zzfiq.zza();
        zza2.zza(this.zza.getPackageName());
        zza2.zzc(2);
        zzfil zza3 = zzfim.zza();
        zza3.zza(str);
        zza3.zzb(2);
        zza2.zzb(zza3);
        new zzfib(this.zza, this.zzb, (zzfiq) zza2.zzal()).zza();
    }
}
