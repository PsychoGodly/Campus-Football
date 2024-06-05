package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.ArrayList;
import m5.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzedo implements zzedi {
    private final zzdes zza;
    private final zzfuu zzb;
    private final zzdiw zzc;
    private final zzezt zzd;
    private final zzdll zze;

    public zzedo(zzdes zzdes, zzfuu zzfuu, zzdiw zzdiw, zzezt zzezt, zzdll zzdll) {
        this.zza = zzdes;
        this.zzb = zzfuu;
        this.zzc = zzdiw;
        this.zzd = zzezt;
        this.zze = zzdll;
    }

    private final zzfut zzg(zzeyo zzeyo, zzeyc zzeyc, JSONObject jSONObject) {
        zzfut zza2 = this.zzd.zza();
        zzfut zza3 = this.zzc.zza(zzeyo, zzeyc, jSONObject);
        return zzfuj.zzc(zza2, zza3).zza(new zzedj(this, zza3, zza2, zzeyo, zzeyc, jSONObject), this.zzb);
    }

    public final zzfut zza(zzeyo zzeyo, zzeyc zzeyc) {
        return zzfuj.zzm(zzfuj.zzm(this.zzd.zza(), new zzedl(this, zzeyc), this.zzb), new zzedm(this, zzeyo, zzeyc), this.zzb);
    }

    public final boolean zzb(zzeyo zzeyo, zzeyc zzeyc) {
        zzeyh zzeyh = zzeyc.zzt;
        return (zzeyh == null || zzeyh.zzc == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdgd zzc(zzfut zzfut, zzfut zzfut2, zzeyo zzeyo, zzeyc zzeyc, JSONObject jSONObject) throws Exception {
        zzdgi zzdgi = (zzdgi) zzfut.get();
        zzdlf zzdlf = (zzdlf) zzfut2.get();
        zzdgj zzd2 = this.zza.zzd(new zzcrb(zzeyo, zzeyc, (String) null), new zzdgu(zzdgi), new zzdfh(jSONObject, zzdlf));
        zzd2.zzh().zzb();
        zzd2.zzk().zza(zzdlf);
        zzd2.zzg().zza(zzdgi.zzr());
        zzd2.zzl().zza(this.zze);
        return zzd2.zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzd(zzdlf zzdlf, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzfuj.zzh(zzdlf));
        if (jSONObject.optBoolean("success")) {
            return zzfuj.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzblu("process json failed");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zze(zzeyc zzeyc, zzdlf zzdlf) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) a0.c().zzb(zzbar.zzhP)).booleanValue() && m.l()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzeyc.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzfuj.zzm(zzdlf.zzd("google.afma.nativeAds.preProcessJson", jSONObject2), new zzedk(this, zzdlf), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzf(zzeyo zzeyo, zzeyc zzeyc, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzfuj.zzg(new zzdtf(3));
        }
        if (zzeyo.zza.zza.zzk <= 1) {
            return zzfuj.zzl(zzg(zzeyo, zzeyc, jSONArray.getJSONObject(0)), zzedn.zza, this.zzb);
        }
        int length = jSONArray.length();
        this.zzd.zzc(Math.min(length, zzeyo.zza.zza.zzk));
        ArrayList arrayList = new ArrayList(zzeyo.zza.zza.zzk);
        for (int i10 = 0; i10 < zzeyo.zza.zza.zzk; i10++) {
            if (i10 < length) {
                arrayList.add(zzg(zzeyo, zzeyc, jSONArray.getJSONObject(i10)));
            } else {
                arrayList.add(zzfuj.zzg(new zzdtf(3)));
            }
        }
        return zzfuj.zzh(arrayList);
    }
}
