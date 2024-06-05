package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdrf implements Runnable {
    public final /* synthetic */ zzdrk zza;
    public final /* synthetic */ zzezs zzb;
    public final /* synthetic */ zzbjp zzc;
    public final /* synthetic */ List zzd;
    public final /* synthetic */ String zze;

    public /* synthetic */ zzdrf(zzdrk zzdrk, zzezs zzezs, zzbjp zzbjp, List list, String str) {
        this.zza = zzdrk;
        this.zzb = zzezs;
        this.zzc = zzbjp;
        this.zzd = list;
        this.zze = str;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
