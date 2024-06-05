package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.c;
import com.unity3d.services.core.device.MimeTypes;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcnc implements zzbly {
    private final Context zza;
    private final zzatb zzb;
    private final PowerManager zzc;

    public zzcnc(Context context, zzatb zzatb) {
        this.zza = context;
        this.zzb = zzatb;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: zza */
    public final JSONObject zzb(zzcnf zzcnf) throws JSONException {
        JSONObject jSONObject;
        boolean z10;
        Integer num;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzate zzate = zzcnf.zzf;
        if (zzate == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzd() != null) {
            boolean z11 = zzate.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcnf.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcnf.zzb).put("isNative", this.zzb.zze());
            if (Build.VERSION.SDK_INT >= 20) {
                z10 = this.zzc.isInteractive();
            } else {
                z10 = this.zzc.isScreenOn();
            }
            put.put("isScreenOn", z10).put("appMuted", t.t().e()).put("appVolume", (double) t.t().a()).put("deviceVolume", (double) c.b(this.zza.getApplicationContext()));
            if (((Boolean) a0.c().zzb(zzbar.zzfl)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                if (audioManager == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(audioManager.getMode());
                }
                if (num != null) {
                    jSONObject3.put("audioMode", num);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzate.zzb).put("isAttachedToWindow", z11).put("viewBox", new JSONObject().put("top", zzate.zzc.top).put("bottom", zzate.zzc.bottom).put("left", zzate.zzc.left).put("right", zzate.zzc.right)).put("adBox", new JSONObject().put("top", zzate.zzd.top).put("bottom", zzate.zzd.bottom).put("left", zzate.zzd.left).put("right", zzate.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzate.zze.top).put("bottom", zzate.zze.bottom).put("left", zzate.zze.left).put("right", zzate.zze.right)).put("globalVisibleBoxVisible", zzate.zzf).put("localVisibleBox", new JSONObject().put("top", zzate.zzg.top).put("bottom", zzate.zzg.bottom).put("left", zzate.zzg.left).put("right", zzate.zzg.right)).put("localVisibleBoxVisible", zzate.zzh).put("hitBox", new JSONObject().put("top", zzate.zzi.top).put("bottom", zzate.zzi.bottom).put("left", zzate.zzi.left).put("right", zzate.zzi.right)).put("screenDensity", (double) this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcnf.zza);
            if (((Boolean) a0.c().zzb(zzbar.zzbi)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzate.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcnf.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
