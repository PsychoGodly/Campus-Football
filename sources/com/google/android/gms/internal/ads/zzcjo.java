package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.z4;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcjo implements zzewh {
    private final zzchy zza;
    private Context zzb;
    private String zzc;
    private z4 zzd;

    /* synthetic */ zzcjo(zzchy zzchy, zzcjn zzcjn) {
        this.zza = zzchy;
    }

    public final /* synthetic */ zzewh zza(z4 z4Var) {
        Objects.requireNonNull(z4Var);
        this.zzd = z4Var;
        return this;
    }

    public final /* synthetic */ zzewh zzb(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ zzewh zzc(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    public final zzewi zzd() {
        zzgxg.zzc(this.zzb, Context.class);
        zzgxg.zzc(this.zzc, String.class);
        zzgxg.zzc(this.zzd, z4.class);
        return new zzcjq(this.zza, this.zzb, this.zzc, this.zzd, (zzcjp) null);
    }
}
