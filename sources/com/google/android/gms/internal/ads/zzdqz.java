package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdqz implements Runnable {
    public final /* synthetic */ zzdrk zza;
    public final /* synthetic */ zzbzs zzb;

    public /* synthetic */ zzdqz(zzdrk zzdrk, zzbzs zzbzs) {
        this.zza = zzdrk;
        this.zzb = zzbzs;
    }

    public final void run() {
        zzbzs zzbzs = this.zzb;
        String zzc = t.q().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            zzbzs.zzd(zzc);
        } else {
            zzbzs.zze(new Exception());
        }
    }
}
