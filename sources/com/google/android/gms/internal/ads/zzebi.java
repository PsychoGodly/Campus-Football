package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzebi implements zzdee {
    public final /* synthetic */ zzeaw zza;

    public /* synthetic */ zzebi(zzeaw zzeaw) {
        this.zza = zzeaw;
    }

    public final void zza(boolean z10, Context context, zzcvb zzcvb) {
        zzeaw zzeaw = this.zza;
        try {
            ((zzezs) zzeaw.zzb).zzv(z10);
            ((zzezs) zzeaw.zzb).zzw(context);
        } catch (zzezc e10) {
            throw new zzded(e10.getCause());
        }
    }
}
