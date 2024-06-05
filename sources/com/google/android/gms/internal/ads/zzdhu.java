package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.z4;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdhu {
    private final zzdmq zza;
    private final zzdlf zzb;
    private final zzcnq zzc;
    private final zzdgq zzd;

    public zzdhu(zzdmq zzdmq, zzdlf zzdlf, zzcnq zzcnq, zzdgq zzdgq) {
        this.zza = zzdmq;
        this.zzb = zzdlf;
        this.zzc = zzcnq;
        this.zzd = zzdgq;
    }

    public final View zza() throws zzcet {
        zzcei zza2 = this.zza.zza(z4.w(), (zzeyc) null, (zzeyf) null);
        ((View) zza2).setVisibility(8);
        zza2.zzad("/sendMessageToSdk", new zzdho(this));
        zza2.zzad("/adMuted", new zzdhp(this));
        this.zzb.zzj(new WeakReference(zza2), "/loadHtml", new zzdhq(this));
        this.zzb.zzj(new WeakReference(zza2), "/showOverlay", new zzdhr(this));
        this.zzb.zzj(new WeakReference(zza2), "/hideOverlay", new zzdhs(this));
        return (View) zza2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcei zzcei, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcei zzcei, Map map) {
        this.zzd.zzg();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcei zzcei, Map map) {
        zzbza.zzi("Showing native ads overlay.");
        zzcei.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcei zzcei, Map map) {
        zzbza.zzi("Hiding native ads overlay.");
        zzcei.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
