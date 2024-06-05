package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.w0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdgm extends zzdgn {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final JSONObject zzh;

    public zzdgm(zzeyc zzeyc, JSONObject jSONObject) {
        super(zzeyc);
        this.zzb = w0.g(jSONObject, "tracking_urls_and_actions", "active_view");
        boolean z10 = false;
        this.zzc = w0.k(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzd = w0.k(false, jSONObject, "attribution", "allow_pub_rendering");
        this.zze = w0.k(false, jSONObject, "enable_omid");
        this.zzg = w0.b(MaxReward.DEFAULT_LABEL, jSONObject, "watermark_overlay_png_base64");
        this.zzf = jSONObject.optJSONObject("overlay") != null ? true : z10;
        this.zzh = ((Boolean) a0.c().zzb(zzbar.zzeG)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    public final zzeza zza() {
        JSONObject jSONObject = this.zzh;
        return jSONObject != null ? new zzeza(jSONObject) : this.zza.zzW;
    }

    public final String zzb() {
        return this.zzg;
    }

    public final JSONObject zzc() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zza.zzA);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zzf;
    }
}
