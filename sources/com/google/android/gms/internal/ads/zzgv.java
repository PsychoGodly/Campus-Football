package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgv {
    private final Context zza;
    private final zzgt zzb;

    public zzgv(Context context, Handler handler, zzgu zzgu) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzgt(this, handler, zzgu);
    }
}
