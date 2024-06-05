package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfgc {
    private static final zzfgc zza = new zzfgc();
    private Context zzb;

    private zzfgc() {
    }

    public static zzfgc zzb() {
        return zza;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
