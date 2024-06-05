package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcco implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzccu zze;

    zzcco(zzccu zzccu, String str, String str2, int i10, int i11, boolean z10) {
        this.zze = zzccu;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("cacheReady", "0");
        zzccu.zze(this.zze, "onPrecacheEvent", hashMap);
    }
}
