package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzccs implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzccu zzd;

    zzccs(zzccu zzccu, String str, String str2, long j10) {
        this.zzd = zzccu;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalDuration", Long.toString(this.zzc));
        zzccu.zze(this.zzd, "onPrecacheEvent", hashMap);
    }
}
