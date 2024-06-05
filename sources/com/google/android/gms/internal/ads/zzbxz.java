package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import h5.g;
import h5.h;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbxz implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbzs zzb;

    zzbxz(zzbya zzbya, Context context, zzbzs zzbzs) {
        this.zza = context;
        this.zzb = zzbzs;
    }

    public final void run() {
        try {
            this.zzb.zzd(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (g | h | IOException | IllegalStateException e10) {
            this.zzb.zze(e10);
            zzbza.zzh("Exception while getting advertising Id info", e10);
        }
    }
}
