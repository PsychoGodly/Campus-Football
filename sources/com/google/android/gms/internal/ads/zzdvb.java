package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdvb implements zzcxj {
    private final Context zza;
    private final zzbxf zzb;

    zzdvb(Context context, zzbxf zzbxf) {
        this.zza = context;
        this.zzb = zzbxf;
    }

    public final void zzb(zzeyo zzeyo) {
        if (!TextUtils.isEmpty(zzeyo.zzb.zzb.zzd)) {
            this.zzb.zzp(this.zza, zzeyo.zza.zza.zzd);
            this.zzb.zzl(this.zza, zzeyo.zzb.zzb.zzd);
        }
    }

    public final void zzbA(zzbtn zzbtn) {
    }
}
