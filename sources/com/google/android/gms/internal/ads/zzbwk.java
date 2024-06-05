package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.p1;
import java.util.Objects;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbwk {
    private Context zza;
    private e zzb;
    private p1 zzc;
    private zzbxf zzd;

    private zzbwk() {
    }

    /* synthetic */ zzbwk(zzbwj zzbwj) {
    }

    public final zzbwk zza(p1 p1Var) {
        this.zzc = p1Var;
        return this;
    }

    public final zzbwk zzb(Context context) {
        Objects.requireNonNull(context);
        this.zza = context;
        return this;
    }

    public final zzbwk zzc(e eVar) {
        Objects.requireNonNull(eVar);
        this.zzb = eVar;
        return this;
    }

    public final zzbwk zzd(zzbxf zzbxf) {
        this.zzd = zzbxf;
        return this;
    }

    public final zzbxg zze() {
        zzgxg.zzc(this.zza, Context.class);
        zzgxg.zzc(this.zzb, e.class);
        zzgxg.zzc(this.zzc, p1.class);
        zzgxg.zzc(this.zzd, zzbxf.class);
        return new zzbwm(this.zza, this.zzb, this.zzc, this.zzd, (zzbwl) null);
    }
}
