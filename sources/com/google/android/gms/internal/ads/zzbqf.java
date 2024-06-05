package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzbqf {
    private final zzcei zza;
    private final String zzb;

    public zzbqf(zzcei zzcei, String str) {
        this.zza = zzcei;
        this.zzb = str;
    }

    public final void zzf(int i10, int i11, int i12, int i13) {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            zzbza.zzh("Error occurred while dispatching default position.", e10);
        }
    }

    public final void zzg(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzb);
            zzcei zzcei = this.zza;
            if (zzcei != null) {
                zzcei.zze("onError", put);
            }
        } catch (JSONException e10) {
            zzbza.zzh("Error occurred while dispatching error event.", e10);
        }
    }

    public final void zzh(String str) {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e10) {
            zzbza.zzh("Error occurred while dispatching ready Event.", e10);
        }
    }

    public final void zzi(int i10, int i11, int i12, int i13, float f10, int i14) {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put("width", i10).put("height", i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", (double) f10).put("rotation", i14));
        } catch (JSONException e10) {
            zzbza.zzh("Error occurred while obtaining screen information.", e10);
        }
    }

    public final void zzj(int i10, int i11, int i12, int i13) {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            zzbza.zzh("Error occurred while dispatching size change.", e10);
        }
    }

    public final void zzk(String str) {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e10) {
            zzbza.zzh("Error occurred while dispatching state change.", e10);
        }
    }
}
