package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.t;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbtt implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbtv zzb;

    zzbtt(zzbtv zzbtv, Context context) {
        this.zzb = zzbtv;
        this.zza = context;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbts zzbts;
        zzbtu zzbtu = (zzbtu) this.zzb.zza.get(this.zza);
        if (zzbtu == null || zzbtu.zza + ((Long) zzbca.zza.zze()).longValue() < t.b().a()) {
            zzbts = new zzbtr(this.zza).zza();
        } else {
            zzbts = new zzbtr(this.zza, zzbtu.zzb).zza();
        }
        zzbtv zzbtv = this.zzb;
        zzbtv.zza.put(this.zza, new zzbtu(zzbtv, zzbts));
        return zzbts;
    }
}
