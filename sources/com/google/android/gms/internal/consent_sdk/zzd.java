package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzd implements Callable {
    public final /* synthetic */ zzf zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ JSONObject zzc;

    public /* synthetic */ zzd(zzf zzf, String str, JSONObject jSONObject) {
        this.zza = zzf;
        this.zzb = str;
        this.zzc = jSONObject;
    }

    public final Object call() {
        return Boolean.valueOf(this.zza.zzb(this.zzb, this.zzc));
    }
}
