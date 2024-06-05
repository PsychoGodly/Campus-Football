package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.ads.internal.util.w0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzere implements zzepm {
    final String zza;
    final int zzb;

    public zzere(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (!TextUtils.isEmpty(this.zza) && this.zzb != -1) {
            try {
                JSONObject f10 = w0.f(jSONObject, "pii");
                f10.put("pvid", this.zza);
                f10.put("pvid_s", this.zzb);
            } catch (JSONException e10) {
                n1.b("Failed putting gms core app set ID info.", e10);
            }
        }
    }
}
