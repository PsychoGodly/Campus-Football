package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcig implements zzetc {
    private final zzchy zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcig(zzchy zzchy, zzcif zzcif) {
        this.zza = zzchy;
    }

    public final /* synthetic */ zzetc zza(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ zzetc zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    public final zzetd zzc() {
        zzgxg.zzc(this.zzb, Context.class);
        zzgxg.zzc(this.zzc, String.class);
        return new zzcii(this.zza, this.zzb, this.zzc, (zzcih) null);
    }
}
