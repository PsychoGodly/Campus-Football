package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.t;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcmt implements zzfuf {
    final /* synthetic */ zzcmv zza;

    zzcmt(zzcmv zzcmv) {
        this.zza = zzcmv;
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcmv zzcmv = this.zza;
        zzezg zzd = zzcmv.zzh;
        List zzd2 = zzcmv.zzg.zzd(zzcmv.zze, zzcmv.zzf, false, MaxReward.DEFAULT_LABEL, (String) obj, zzcmv.zzf.zzc);
        int i10 = 1;
        if (true == t.q().zzx(this.zza.zza)) {
            i10 = 2;
        }
        zzd.zzc(zzd2, i10);
    }
}
