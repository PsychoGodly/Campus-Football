package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcjs implements zzexv {
    private final zzchy zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcjs(zzchy zzchy, zzcjr zzcjr) {
        this.zza = zzchy;
    }

    public final /* synthetic */ zzexv zza(String str) {
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ zzexv zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    public final zzexw zzc() {
        zzgxg.zzc(this.zzb, Context.class);
        return new zzcju(this.zza, this.zzb, this.zzc, (zzcjt) null);
    }
}
