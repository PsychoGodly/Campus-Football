package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbwv implements zzbxe {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbwv(Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    public final void zza(zzcfz zzcfz) {
        Context context = this.zza;
        zzcfz.zzs(b.B1(context), this.zzb, context.getPackageName());
    }
}
