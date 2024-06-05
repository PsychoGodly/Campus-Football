package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdqm {
    private final zzbim zza;

    zzdqm(zzbim zzbim) {
        this.zza = zzbim;
    }

    private final void zzs(zzdql zzdql) throws RemoteException {
        String zza2 = zzdql.zza(zzdql);
        zzbza.zzi("Dispatching AFMA event on publisher webview: ".concat(zza2));
        this.zza.zzb(zza2);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdql(MobileAdsBridgeBase.initializeMethodName, (zzdqk) null));
    }

    public final void zzb(long j10) throws RemoteException {
        zzdql zzdql = new zzdql("interstitial", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "onAdClicked";
        this.zza.zzb(zzdql.zza(zzdql));
    }

    public final void zzc(long j10) throws RemoteException {
        zzdql zzdql = new zzdql("interstitial", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "onAdClosed";
        zzs(zzdql);
    }

    public final void zzd(long j10, int i10) throws RemoteException {
        zzdql zzdql = new zzdql("interstitial", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "onAdFailedToLoad";
        zzdql.zzd = Integer.valueOf(i10);
        zzs(zzdql);
    }

    public final void zze(long j10) throws RemoteException {
        zzdql zzdql = new zzdql("interstitial", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "onAdLoaded";
        zzs(zzdql);
    }

    public final void zzf(long j10) throws RemoteException {
        zzdql zzdql = new zzdql("interstitial", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdql);
    }

    public final void zzg(long j10) throws RemoteException {
        zzdql zzdql = new zzdql("interstitial", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "onAdOpened";
        zzs(zzdql);
    }

    public final void zzh(long j10) throws RemoteException {
        zzdql zzdql = new zzdql("creation", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "nativeObjectCreated";
        zzs(zzdql);
    }

    public final void zzi(long j10) throws RemoteException {
        zzdql zzdql = new zzdql("creation", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "nativeObjectNotCreated";
        zzs(zzdql);
    }

    public final void zzj(long j10) throws RemoteException {
        zzdql zzdql = new zzdql("rewarded", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "onAdClicked";
        zzs(zzdql);
    }

    public final void zzk(long j10) throws RemoteException {
        zzdql zzdql = new zzdql("rewarded", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "onRewardedAdClosed";
        zzs(zzdql);
    }

    public final void zzl(long j10, zzbut zzbut) throws RemoteException {
        zzdql zzdql = new zzdql("rewarded", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "onUserEarnedReward";
        zzdql.zze = zzbut.zzf();
        zzdql.zzf = Integer.valueOf(zzbut.zze());
        zzs(zzdql);
    }

    public final void zzm(long j10, int i10) throws RemoteException {
        zzdql zzdql = new zzdql("rewarded", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "onRewardedAdFailedToLoad";
        zzdql.zzd = Integer.valueOf(i10);
        zzs(zzdql);
    }

    public final void zzn(long j10, int i10) throws RemoteException {
        zzdql zzdql = new zzdql("rewarded", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "onRewardedAdFailedToShow";
        zzdql.zzd = Integer.valueOf(i10);
        zzs(zzdql);
    }

    public final void zzo(long j10) throws RemoteException {
        zzdql zzdql = new zzdql("rewarded", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "onAdImpression";
        zzs(zzdql);
    }

    public final void zzp(long j10) throws RemoteException {
        zzdql zzdql = new zzdql("rewarded", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "onRewardedAdLoaded";
        zzs(zzdql);
    }

    public final void zzq(long j10) throws RemoteException {
        zzdql zzdql = new zzdql("rewarded", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdql);
    }

    public final void zzr(long j10) throws RemoteException {
        zzdql zzdql = new zzdql("rewarded", (zzdqk) null);
        zzdql.zza = Long.valueOf(j10);
        zzdql.zzc = "onRewardedAdOpened";
        zzs(zzdql);
    }
}
