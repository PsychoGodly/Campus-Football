package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.z4;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzciq implements zzeuq {
    private final zzchy zza;
    private Context zzb;
    private String zzc;
    private z4 zzd;

    /* synthetic */ zzciq(zzchy zzchy, zzcip zzcip) {
        this.zza = zzchy;
    }

    public final /* synthetic */ zzeuq zza(z4 z4Var) {
        Objects.requireNonNull(z4Var);
        this.zzd = z4Var;
        return this;
    }

    public final /* synthetic */ zzeuq zzb(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ zzeuq zzc(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    public final zzeur zzd() {
        zzgxg.zzc(this.zzb, Context.class);
        zzgxg.zzc(this.zzc, String.class);
        zzgxg.zzc(this.zzd, z4.class);
        return new zzcis(this.zza, this.zzb, this.zzc, this.zzd, (zzcir) null);
    }
}
