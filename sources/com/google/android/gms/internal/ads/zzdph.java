package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdph {
    final /* synthetic */ zzdpi zza;
    private final Map zzb = new ConcurrentHashMap();

    zzdph(zzdpi zzdpi) {
        this.zza = zzdpi;
    }

    public final zzdph zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdph zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdph zzd(zzeyc zzeyc) {
        this.zzb.put("aai", zzeyc.zzx);
        if (((Boolean) a0.c().zzb(zzbar.zzgC)).booleanValue()) {
            zzc("rid", zzeyc.zzao);
        }
        return this;
    }

    public final zzdph zze(zzeyf zzeyf) {
        this.zzb.put("gqi", zzeyf.zzb);
        return this;
    }

    public final String zzf() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzg() {
        this.zza.zzb.execute(new zzdpg(this));
    }

    public final void zzh() {
        this.zza.zzb.execute(new zzdpf(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        this.zza.zza.zze(this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj() {
        this.zza.zza.zzd(this.zzb);
    }
}
