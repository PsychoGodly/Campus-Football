package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.n1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzerr implements zzepn {
    private final JSONObject zza;

    zzerr(Context context) {
        this.zza = zzbtx.zzc(context);
    }

    public final int zza() {
        return 46;
    }

    public final zzfut zzb() {
        return zzfuj.zzh(new zzerq(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            n1.a("Failed putting version constants.");
        }
    }
}
