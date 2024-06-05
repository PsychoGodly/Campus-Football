package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdpd {
    private final ConcurrentHashMap zza;
    private final zzbyn zzb;
    private final zzeyx zzc;
    private final String zzd;
    private final String zze;

    public zzdpd(zzdpn zzdpn, zzbyn zzbyn, zzeyx zzeyx, String str, String str2) {
        ConcurrentHashMap zzc2 = zzdpn.zzc();
        this.zza = zzc2;
        this.zzb = zzbyn;
        this.zzc = zzeyx;
        this.zzd = str;
        this.zze = str2;
        if (((Boolean) a0.c().zzb(zzbar.zzgC)).booleanValue()) {
            int e10 = y4.a0.e(zzeyx);
            int i10 = e10 - 1;
            if (i10 != 0) {
                if (i10 == 1) {
                    zzc2.put("se", "query_g");
                } else if (i10 == 2) {
                    zzc2.put("se", "r_adinfo");
                } else if (i10 != 3) {
                    zzc2.put("se", "r_both");
                } else {
                    zzc2.put("se", "r_adstring");
                }
                zzc2.put("scar", "true");
                if (((Boolean) a0.c().zzb(zzbar.zzhb)).booleanValue()) {
                    zzc2.put("ad_format", str2);
                }
                if (e10 == 2) {
                    zzc2.put("rid", str);
                }
                zzd("ragent", zzeyx.zzd.f14566q);
                zzd("rtype", y4.a0.a(y4.a0.b(zzeyx.zzd)));
                return;
            }
            zzc2.put("scar", "false");
        }
    }

    private final void zzd(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zza.put(str, str2);
        }
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzeyo zzeyo) {
        if (zzeyo.zzb.zza.size() > 0) {
            switch (((zzeyc) zzeyo.zzb.zza.get(0)).zzb) {
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
                    this.zza.put("as", true != this.zzb.zzj() ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    break;
                default:
                    this.zza.put("ad_format", "unknown");
                    break;
            }
        }
        zzd("gqi", zzeyo.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
