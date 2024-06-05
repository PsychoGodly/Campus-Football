package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcje implements zzdqq {
    private final zzchy zza;
    private Context zzb;
    private zzbim zzc;

    /* synthetic */ zzcje(zzchy zzchy, zzcjd zzcjd) {
        this.zza = zzchy;
    }

    public final /* synthetic */ zzdqq zza(zzbim zzbim) {
        Objects.requireNonNull(zzbim);
        this.zzc = zzbim;
        return this;
    }

    public final /* synthetic */ zzdqq zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    public final zzdqr zzc() {
        zzgxg.zzc(this.zzb, Context.class);
        zzgxg.zzc(this.zzc, zzbim.class);
        return new zzcjg(this.zza, this.zzb, this.zzc, (zzcjf) null);
    }
}
