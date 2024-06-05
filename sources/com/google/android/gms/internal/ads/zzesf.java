package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.ads.internal.util.w0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzesf implements zzepm {
    private final Bundle zza;

    public zzesf(Bundle bundle) {
        this.zza = bundle;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.zza != null) {
            try {
                w0.f(w0.f(jSONObject, "device"), "play_store").put("parental_controls", x.b().zzi(this.zza));
            } catch (JSONException unused) {
                n1.a("Failed putting parental controls bundle.");
            }
        }
    }
}
