package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbmq implements zzbic {
    final /* synthetic */ zzbmr zza;
    private final zzbzs zzb;

    public zzbmq(zzbmr zzbmr, zzbzs zzbzs) {
        this.zza = zzbmr;
        this.zzb = zzbzs;
    }

    public final void zza(String str) {
        if (str == null) {
            try {
                this.zzb.zze(new zzblu());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.zzb.zze(new zzblu(str));
        }
    }

    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzd(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e10) {
            this.zzb.zze(e10);
        }
    }
}
