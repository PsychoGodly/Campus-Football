package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzccq implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzccu zzj;

    zzccq(zzccu zzccu, String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        this.zzj = zzccu;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = z10;
        this.zzh = i12;
        this.zzi = i13;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("bufferedDuration", Long.toString(this.zze));
        hashMap.put("totalDuration", Long.toString(this.zzf));
        hashMap.put("cacheReady", true != this.zzg ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        hashMap.put("playerCount", Integer.toString(this.zzh));
        hashMap.put("playerPreparedCount", Integer.toString(this.zzi));
        zzccu.zze(this.zzj, "onPrecacheEvent", hashMap);
    }
}
