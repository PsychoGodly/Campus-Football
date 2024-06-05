package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import v4.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzbnz implements b {
    final /* synthetic */ zzbjp zza;

    zzbnz(zzbof zzbof, zzbjp zzbjp) {
        this.zza = zzbjp;
    }

    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }
}
