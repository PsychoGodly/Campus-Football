package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import n4.a;
import v4.d;
import v4.m;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzbpi implements d {
    final /* synthetic */ zzboq zza;
    final /* synthetic */ zzbnl zzb;

    zzbpi(zzbpo zzbpo, zzboq zzboq, zzbnl zzbnl) {
        this.zza = zzboq;
        this.zzb = zzbnl;
    }

    public final void onFailure(a aVar) {
        try {
            this.zza.zzf(aVar.d());
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        m mVar = (m) obj;
        if (mVar == null) {
            zzbza.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zze("Adapter returned null.");
                return null;
            } catch (RemoteException e10) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
                return null;
            }
        } else {
            try {
                this.zza.zzh(new zzbog(mVar));
            } catch (RemoteException e11) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, e11);
            }
            return new zzbpp(this.zzb);
        }
    }

    public final void onFailure(String str) {
        onFailure(new a(0, str, "undefined"));
    }
}
