package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzdrz {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private final int zzf;
    private final boolean zzg;

    public zzdrz(String str, String str2, String str3, int i10, String str4, int i11, boolean z10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = i10;
        this.zze = str4;
        this.zzf = i11;
        this.zzg = z10;
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.zza);
        jSONObject.put("version", this.zzc);
        if (((Boolean) a0.c().zzb(zzbar.zziz)).booleanValue()) {
            jSONObject.put("sdkVersion", this.zzb);
        }
        jSONObject.put("status", this.zzd);
        jSONObject.put("description", this.zze);
        jSONObject.put("initializationLatencyMillis", this.zzf);
        if (((Boolean) a0.c().zzb(zzbar.zziA)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.zzg);
        }
        return jSONObject;
    }
}
