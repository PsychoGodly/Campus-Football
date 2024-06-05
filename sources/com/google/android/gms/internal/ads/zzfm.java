package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfm implements zzff {
    private final Context zza;
    private final zzff zzb;

    public zzfm(Context context) {
        zzfo zzfo = new zzfo();
        this.zza = context.getApplicationContext();
        this.zzb = zzfo;
    }

    public final /* bridge */ /* synthetic */ zzfg zza() {
        return new zzfn(this.zza, ((zzfo) this.zzb).zza());
    }
}
