package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.t;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfdj {
    private final HashMap zza;
    private final zzfdp zzb = new zzfdp(t.b());

    private zzfdj() {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        hashMap.put("new_csi", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
    }

    public static zzfdj zzb(String str) {
        zzfdj zzfdj = new zzfdj();
        zzfdj.zza.put("action", str);
        return zzfdj;
    }

    public static zzfdj zzc(String str) {
        zzfdj zzfdj = new zzfdj();
        zzfdj.zza.put("request_id", str);
        return zzfdj;
    }

    public final zzfdj zza(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzfdj zzd(String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzfdj zze(String str, String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzfdj zzf(zzeyc zzeyc) {
        this.zza.put("aai", zzeyc.zzx);
        return this;
    }

    public final zzfdj zzg(zzeyf zzeyf) {
        if (!TextUtils.isEmpty(zzeyf.zzb)) {
            this.zza.put("gqi", zzeyf.zzb);
        }
        return this;
    }

    public final zzfdj zzh(zzeyo zzeyo, zzbyn zzbyn) {
        zzeyn zzeyn = zzeyo.zzb;
        zzg(zzeyn.zzb);
        if (!zzeyn.zza.isEmpty()) {
            switch (((zzeyc) zzeyn.zza.get(0)).zzb) {
                case 1:
                    this.zza.put("ad_format", "banner");
                    break;
                case 2:
                    this.zza.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.zza.put("ad_format", "native_express");
                    break;
                case 4:
                    this.zza.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.zza.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.zza.put("ad_format", "app_open_ad");
                    if (zzbyn != null) {
                        this.zza.put("as", true != zzbyn.zzj() ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                        break;
                    }
                    break;
                default:
                    this.zza.put("ad_format", "unknown");
                    break;
            }
        }
        return this;
    }

    public final zzfdj zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzfdo zzfdo : this.zzb.zza()) {
            hashMap.put(zzfdo.zza, zzfdo.zzb);
        }
        return hashMap;
    }
}
