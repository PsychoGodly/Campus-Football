package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.d5;
import com.google.android.gms.ads.internal.client.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdrt implements zzcur, zzcxj, zzcwg {
    private final zzdsf zza;
    private final String zzb;
    private final String zzc;
    private int zzd = 0;
    private zzdrs zze = zzdrs.AD_REQUESTED;
    private zzcuh zzf;
    private c3 zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private boolean zzk;

    zzdrt(zzdsf zzdsf, zzeyx zzeyx, String str) {
        this.zza = zzdsf;
        this.zzc = str;
        this.zzb = zzeyx.zzf;
    }

    private static JSONObject zzh(c3 c3Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", c3Var.f14429c);
        jSONObject.put("errorCode", c3Var.f14427a);
        jSONObject.put("errorDescription", c3Var.f14428b);
        c3 c3Var2 = c3Var.f14430d;
        jSONObject.put("underlyingError", c3Var2 == null ? null : zzh(c3Var2));
        return jSONObject;
    }

    private final JSONObject zzi(zzcuh zzcuh) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("winningAdapterClassName", zzcuh.zzg());
        jSONObject2.put("responseSecsSinceEpoch", zzcuh.zzc());
        jSONObject2.put("responseId", zzcuh.zzi());
        if (((Boolean) a0.c().zzb(zzbar.zziw)).booleanValue()) {
            String zzd2 = zzcuh.zzd();
            if (!TextUtils.isEmpty(zzd2)) {
                zzbza.zze("Bidding data: ".concat(String.valueOf(zzd2)));
                jSONObject2.put("biddingData", new JSONObject(zzd2));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject2.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject2.put("postBody", this.zzi);
        }
        JSONArray jSONArray = new JSONArray();
        for (d5 d5Var : zzcuh.zzj()) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("adapterClassName", d5Var.f14450a);
            jSONObject3.put("latencyMillis", d5Var.f14451b);
            if (((Boolean) a0.c().zzb(zzbar.zzix)).booleanValue()) {
                jSONObject3.put("credentials", x.b().zzi(d5Var.f14453d));
            }
            c3 c3Var = d5Var.f14452c;
            if (c3Var == null) {
                jSONObject = null;
            } else {
                jSONObject = zzh(c3Var);
            }
            jSONObject3.put("error", jSONObject);
            jSONArray.put(jSONObject3);
        }
        jSONObject2.put("adNetworks", jSONArray);
        return jSONObject2;
    }

    public final void zza(c3 c3Var) {
        this.zze = zzdrs.AD_LOAD_FAILED;
        this.zzg = c3Var;
        if (((Boolean) a0.c().zzb(zzbar.zziB)).booleanValue()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    public final void zzb(zzeyo zzeyo) {
        if (!zzeyo.zzb.zza.isEmpty()) {
            this.zzd = ((zzeyc) zzeyo.zzb.zza.get(0)).zzb;
        }
        if (!TextUtils.isEmpty(zzeyo.zzb.zzb.zzk)) {
            this.zzh = zzeyo.zzb.zzb.zzk;
        }
        if (!TextUtils.isEmpty(zzeyo.zzb.zzb.zzl)) {
            this.zzi = zzeyo.zzb.zzb.zzl;
        }
    }

    public final void zzbA(zzbtn zzbtn) {
        if (!((Boolean) a0.c().zzb(zzbar.zziB)).booleanValue()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    public final void zzbD(zzcqm zzcqm) {
        this.zzf = zzcqm.zzl();
        this.zze = zzdrs.AD_LOADED;
        if (((Boolean) a0.c().zzb(zzbar.zziB)).booleanValue()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() throws JSONException {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zze);
        jSONObject.put("format", zzeyc.zza(this.zzd));
        if (((Boolean) a0.c().zzb(zzbar.zziB)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.zzj);
            if (this.zzj) {
                jSONObject.put("shown", this.zzk);
            }
        }
        zzcuh zzcuh = this.zzf;
        JSONObject jSONObject2 = null;
        if (zzcuh != null) {
            jSONObject2 = zzi(zzcuh);
        } else {
            c3 c3Var = this.zzg;
            if (!(c3Var == null || (iBinder = c3Var.f14431f) == null)) {
                zzcuh zzcuh2 = (zzcuh) iBinder;
                jSONObject2 = zzi(zzcuh2);
                if (zzcuh2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    public final void zze() {
        this.zzj = true;
    }

    public final void zzf() {
        this.zzk = true;
    }

    public final boolean zzg() {
        return this.zze != zzdrs.AD_REQUESTED;
    }
}
