package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a;
import java.util.Map;
import t4.c0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbhx implements c0 {
    boolean zza = false;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ a zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    zzbhx(zzbhz zzbhz, boolean z10, a aVar, Map map, Map map2) {
        this.zzb = z10;
        this.zzc = aVar;
        this.zzd = map;
        this.zze = map2;
    }

    public final void zza(boolean z10) {
        if (!this.zza) {
            if (z10 && this.zzb) {
                ((zzdcc) this.zzc).zzr();
            }
            this.zza = true;
            this.zzd.put((String) this.zze.get("event_id"), Boolean.valueOf(z10));
            ((zzbki) this.zzc).zzd("openIntentAsync", this.zzd);
        }
    }

    public final void zzb(int i10) {
    }
}
