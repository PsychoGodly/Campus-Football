package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdiw {
    private final zzfuu zza;
    private final zzdjj zzb;
    private final zzdjo zzc;

    public zzdiw(zzfuu zzfuu, zzdjj zzdjj, zzdjo zzdjo) {
        this.zza = zzfuu;
        this.zzb = zzdjj;
        this.zzc = zzdjo;
    }

    public final zzfut zza(zzeyo zzeyo, zzeyc zzeyc, JSONObject jSONObject) {
        zzfut zzm;
        zzeyo zzeyo2 = zzeyo;
        zzeyc zzeyc2 = zzeyc;
        JSONObject jSONObject2 = jSONObject;
        zzfut zzb2 = this.zza.zzb(new zzdiu(this, zzeyo2, zzeyc2, jSONObject2));
        zzfut zzf = this.zzb.zzf(jSONObject2, "images");
        zzfut zzg = this.zzb.zzg(jSONObject2, "images", zzeyc2, zzeyo2.zzb.zzb);
        zzfut zze = this.zzb.zze(jSONObject2, "secondary_image");
        zzfut zze2 = this.zzb.zze(jSONObject2, "app_icon");
        zzfut zzd = this.zzb.zzd(jSONObject2, "attribution");
        zzfut zzh = this.zzb.zzh(jSONObject2, zzeyc2, zzeyo2.zzb.zzb);
        zzfut zza2 = this.zzc.zza(jSONObject2, "custom_assets");
        zzdjj zzdjj = this.zzb;
        if (!jSONObject2.optBoolean("enable_omid")) {
            zzm = zzfuj.zzh((Object) null);
        } else {
            JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzm = zzfuj.zzh((Object) null);
            } else {
                String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzm = zzfuj.zzh((Object) null);
                } else {
                    zzm = zzfuj.zzm(zzfuj.zzh((Object) null), new zzdiy(zzdjj, optString), zzbzn.zze);
                }
            }
        }
        zzfut zzfut = zzm;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzb2);
        arrayList.add(zzf);
        arrayList.add(zzg);
        arrayList.add(zze);
        arrayList.add(zze2);
        arrayList.add(zzd);
        arrayList.add(zzh);
        arrayList.add(zza2);
        if (!((Boolean) a0.c().zzb(zzbar.zzeI)).booleanValue()) {
            arrayList.add(zzfut);
        }
        return zzfuj.zza(arrayList).zza(new zzdiv(this, zzb2, zzf, zze2, zze, zzd, jSONObject, zzh, zzg, zzfut, zza2), this.zza);
    }
}
