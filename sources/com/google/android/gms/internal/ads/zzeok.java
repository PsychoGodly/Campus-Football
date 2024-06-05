package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzeok implements Callable {
    public final /* synthetic */ List zza;
    public final /* synthetic */ Bundle zzb;

    public /* synthetic */ zzeok(List list, Bundle bundle) {
        this.zza = list;
        this.zzb = bundle;
    }

    public final Object call() {
        List<zzfut> list = this.zza;
        Bundle bundle = this.zzb;
        JSONArray jSONArray = new JSONArray();
        for (zzfut zzfut : list) {
            if (((JSONObject) zzfut.get()) != null) {
                jSONArray.put(zzfut.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new zzeoo(jSONArray.toString(), bundle);
    }
}
