package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdre implements Runnable {
    public final /* synthetic */ zzdrk zza;
    public final /* synthetic */ zzbjs zzb;

    public /* synthetic */ zzdre(zzdrk zzdrk, zzbjs zzbjs) {
        this.zza = zzdrk;
        this.zzb = zzbjs;
    }

    public final void run() {
        zzdrk zzdrk = this.zza;
        try {
            this.zzb.zzb(zzdrk.zzg());
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }
}
