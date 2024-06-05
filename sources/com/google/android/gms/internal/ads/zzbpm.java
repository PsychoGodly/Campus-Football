package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import n4.a;
import x4.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzbpm implements b {
    final /* synthetic */ zzbpf zza;

    zzbpm(zzbpo zzbpo, zzbpf zzbpf) {
        this.zza = zzbpf;
    }

    public final void onFailure(a aVar) {
        try {
            this.zza.zzg(aVar.d());
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final void onSuccess(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final void onFailure(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }
}
