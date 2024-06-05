package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.d1;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbld implements zzbhp {
    final /* synthetic */ zzbkm zza;
    final /* synthetic */ d1 zzb;
    final /* synthetic */ zzblr zzc;

    zzbld(zzblr zzblr, zzapw zzapw, zzbkm zzbkm, d1 d1Var) {
        this.zzc = zzblr;
        this.zza = zzbkm;
        this.zzb = d1Var;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbhp, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzbls zzbls = (zzbls) obj;
        synchronized (this.zzc.zza) {
            zzbza.zzi("JS Engine is requesting an update");
            if (this.zzc.zzi == 0) {
                zzbza.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd((zzapw) null);
            }
            this.zza.zzr("/requestReload", this.zzb.a());
        }
    }
}
