package com.google.android.gms.internal.ads;

import a5.b;
import android.os.RemoteException;
import com.google.android.gms.common.internal.q;
import n4.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbvm {
    private final zzbnl zza;

    public zzbvm(zzbnl zzbnl) {
        this.zza = zzbnl;
    }

    public final void onAdClosed() {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToShow(a aVar) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdFailedToShow.");
        int a10 = aVar.a();
        String c10 = aVar.c();
        String b10 = aVar.b();
        zzbza.zzj("Mediation ad failed to show: Error Code = " + a10 + ". Error Message = " + c10 + " Error Domain = " + b10);
        try {
            this.zza.zzk(aVar.d());
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdOpened() {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onUserEarnedReward(b bVar) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onUserEarnedReward.");
        try {
            this.zza.zzt(new zzbvn(bVar));
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onVideoComplete() {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onVideoComplete.");
        try {
            this.zza.zzu();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onVideoStart() {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onVideoStart.");
        try {
            this.zza.zzy();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void reportAdClicked() {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called reportAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void reportAdImpression() {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called reportAdImpression.");
        try {
            this.zza.zzm();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToShow(String str) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdFailedToShow.");
        zzbza.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.zza.zzl(str);
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }
}
