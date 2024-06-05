package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzccp implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ zzccu zzk;

    zzccp(zzccu zzccu, String str, String str2, long j10, long j11, long j12, long j13, long j14, boolean z10, int i10, int i11) {
        this.zzk = zzccu;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = j14;
        this.zzh = z10;
        this.zzi = i10;
        this.zzj = i11;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bufferedDuration", Long.toString(this.zzc));
        hashMap.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) a0.c().zzb(zzbar.zzbG)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.zze));
            hashMap.put("qoeCachedBytes", Long.toString(this.zzf));
            hashMap.put("totalBytes", Long.toString(this.zzg));
            hashMap.put("reportTime", Long.toString(t.b().a()));
        }
        hashMap.put("cacheReady", true != this.zzh ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        hashMap.put("playerCount", Integer.toString(this.zzi));
        hashMap.put("playerPreparedCount", Integer.toString(this.zzj));
        zzccu.zze(this.zzk, "onPrecacheEvent", hashMap);
    }
}
