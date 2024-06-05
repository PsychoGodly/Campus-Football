package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzecl implements Callable {
    public final /* synthetic */ zzeco zza;
    public final /* synthetic */ zzeyo zzb;
    public final /* synthetic */ zzeyc zzc;

    public /* synthetic */ zzecl(zzeco zzeco, zzeyo zzeyo, zzeyc zzeyc) {
        this.zza = zzeco;
        this.zzb = zzeyo;
        this.zzc = zzeyc;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb, this.zzc);
    }
}
