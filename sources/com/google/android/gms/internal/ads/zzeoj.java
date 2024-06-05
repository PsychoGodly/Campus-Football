package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzeoj implements Runnable {
    public final /* synthetic */ zzeon zza;
    public final /* synthetic */ zzbpc zzb;
    public final /* synthetic */ Bundle zzc;
    public final /* synthetic */ List zzd;
    public final /* synthetic */ zzeha zze;
    public final /* synthetic */ zzbzs zzf;

    public /* synthetic */ zzeoj(zzeon zzeon, zzbpc zzbpc, Bundle bundle, List list, zzeha zzeha, zzbzs zzbzs) {
        this.zza = zzeon;
        this.zzb = zzbpc;
        this.zzc = bundle;
        this.zzd = list;
        this.zze = zzeha;
        this.zzf = zzbzs;
    }

    public final void run() {
        this.zza.zze(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
