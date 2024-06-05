package com.google.android.gms.internal.ads;

import a5.b;
import android.os.RemoteException;
import n4.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzbpp {
    final zzbnl zza;

    zzbpp(zzbnl zzbnl) {
        this.zza = zzbnl;
    }

    public final void onAdClosed() {
        try {
            this.zza.zzf();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdFailedToShow(a aVar) {
        try {
            int a10 = aVar.a();
            String c10 = aVar.c();
            String b10 = aVar.b();
            zzbza.zzj("Mediated ad failed to show: Error Code = " + a10 + ". Error Message = " + c10 + " Error Domain = " + b10);
            this.zza.zzk(aVar.d());
        } catch (RemoteException unused) {
        }
    }

    public final void onAdLeftApplication() {
        try {
            this.zza.zzn();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdOpened() {
        try {
            this.zza.zzp();
        } catch (RemoteException unused) {
        }
    }

    public final void onUserEarnedReward(b bVar) {
        try {
            this.zza.zzt(new zzbvn(bVar));
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoComplete() {
        try {
            this.zza.zzv();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoMute() {
    }

    public final void onVideoPause() {
        try {
            this.zza.zzw();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoPlay() {
        try {
            this.zza.zzx();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoStart() {
        try {
            this.zza.zzy();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoUnmute() {
    }

    public final void reportAdClicked() {
        try {
            this.zza.zze();
        } catch (RemoteException unused) {
        }
    }

    public final void reportAdImpression() {
        try {
            this.zza.zzm();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdFailedToShow(String str) {
        try {
            zzbza.zzj("Mediated ad failed to show: " + str);
            this.zza.zzl(str);
        } catch (RemoteException unused) {
        }
    }
}
