package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.n1;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzerz implements zzepm {
    private final List zza;

    public zzerz(List list) {
        this.zza = list;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.zza));
        } catch (JSONException unused) {
            n1.a("Failed putting experiment ids.");
        }
    }
}
