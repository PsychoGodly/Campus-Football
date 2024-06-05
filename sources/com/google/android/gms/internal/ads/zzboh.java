package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.internal.q;
import n4.a;
import n4.a0;
import q4.f;
import v4.k;
import v4.p;
import v4.r;
import v4.x;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzboh implements k, p, r {
    private final zzbnl zza;
    private x zzb;
    private f zzc;

    public zzboh(zzbnl zzbnl) {
        this.zza = zzbnl;
    }

    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i10) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdFailedToLoad with error. " + i10);
        try {
            this.zza.zzg(i10);
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        q.f("#008 Must be called on the main UI thread.");
        x xVar = this.zzb;
        if (this.zzc == null) {
            if (xVar == null) {
                zzbza.zzl("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (!xVar.m()) {
                zzbza.zze("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzbza.zze("Adapter called onAdImpression.");
        try {
            this.zza.zzm();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdLoaded.");
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onVideoEnd.");
        try {
            this.zza.zzv();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final f zza() {
        return this.zzc;
    }

    public final x zzb() {
        return this.zzb;
    }

    public final void zzc(MediationNativeAdapter mediationNativeAdapter, f fVar) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdLoaded with template id ".concat(String.valueOf(fVar.getCustomTemplateId())));
        this.zzc = fVar;
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzd(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAppEvent.");
        try {
            this.zza.zzq(str, str2);
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zze(MediationNativeAdapter mediationNativeAdapter, f fVar, String str) {
        if (fVar instanceof zzbes) {
            try {
                this.zza.zzr(((zzbes) fVar).zza(), str);
            } catch (RemoteException e10) {
                zzbza.zzl("#007 Could not call remote method.", e10);
            }
        } else {
            zzbza.zzj("Unexpected native custom template ad type.");
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, a aVar) {
        q.f("#008 Must be called on the main UI thread.");
        int a10 = aVar.a();
        String c10 = aVar.c();
        String b10 = aVar.b();
        zzbza.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + a10 + ". ErrorMessage: " + c10 + ". ErrorDomain: " + b10);
        try {
            this.zza.zzh(aVar.d());
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdLoaded.");
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        q.f("#008 Must be called on the main UI thread.");
        x xVar = this.zzb;
        if (this.zzc == null) {
            if (xVar == null) {
                zzbza.zzl("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (!xVar.l()) {
                zzbza.zze("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzbza.zze("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, x xVar) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdLoaded.");
        this.zzb = xVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            a0 a0Var = new a0();
            a0Var.c(new zzbnv());
            if (xVar != null && xVar.r()) {
                xVar.K(a0Var);
            }
        }
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i10) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdFailedToLoad with error " + i10 + ".");
        try {
            this.zza.zzg(i10);
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, a aVar) {
        q.f("#008 Must be called on the main UI thread.");
        int a10 = aVar.a();
        String c10 = aVar.c();
        String b10 = aVar.b();
        zzbza.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + a10 + ". ErrorMessage: " + c10 + ". ErrorDomain: " + b10);
        try {
            this.zza.zzh(aVar.d());
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i10) {
        q.f("#008 Must be called on the main UI thread.");
        zzbza.zze("Adapter called onAdFailedToLoad with error " + i10 + ".");
        try {
            this.zza.zzg(i10);
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, a aVar) {
        q.f("#008 Must be called on the main UI thread.");
        int a10 = aVar.a();
        String c10 = aVar.c();
        String b10 = aVar.b();
        zzbza.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + a10 + ". ErrorMessage: " + c10 + ". ErrorDomain: " + b10);
        try {
            this.zza.zzh(aVar.d());
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }
}
