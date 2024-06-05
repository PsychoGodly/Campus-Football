package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzfgl {
    private zzfhj zza = new zzfhj((WebView) null);
    private long zzb;
    private int zzc;

    public zzfgl() {
        zzb();
    }

    public final WebView zza() {
        return (WebView) this.zza.get();
    }

    public final void zzb() {
        this.zzb = System.nanoTime();
        this.zzc = 1;
    }

    public void zzc() {
        this.zza.clear();
    }

    public final void zzd(String str, long j10) {
        if (j10 >= this.zzb && this.zzc != 3) {
            this.zzc = 3;
            zzfge.zza().zzf(zza(), str);
        }
    }

    public final void zze(String str, long j10) {
        if (j10 >= this.zzb) {
            this.zzc = 2;
            zzfge.zza().zzf(zza(), str);
        }
    }

    public void zzf(zzffo zzffo, zzffm zzffm) {
        zzg(zzffo, zzffm, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    public final void zzg(zzffo zzffo, zzffm zzffm, JSONObject jSONObject) {
        String zzh = zzffo.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfgp.zzh(jSONObject2, "environment", "app");
        zzfgp.zzh(jSONObject2, "adSessionType", zzffm.zzd());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzfgp.zzh(jSONObject3, "deviceType", str + "; " + str2);
        zzfgp.zzh(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfgp.zzh(jSONObject3, "os", "Android");
        zzfgp.zzh(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfgp.zzh(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfgp.zzh(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, zzffm.zze().zzb());
        zzfgp.zzh(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, zzffm.zze().zzc());
        zzfgp.zzh(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfgp.zzh(jSONObject5, "libraryVersion", "1.3.37-google_20220829");
        zzfgp.zzh(jSONObject5, "appId", zzfgc.zzb().zza().getApplicationContext().getPackageName());
        zzfgp.zzh(jSONObject2, "app", jSONObject5);
        if (zzffm.zzf() != null) {
            zzfgp.zzh(jSONObject2, "contentUrl", zzffm.zzf());
        }
        zzfgp.zzh(jSONObject2, "customReferenceData", zzffm.zzg());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzffm.zzh().iterator();
        if (!it.hasNext()) {
            zzfge.zza().zzg(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
        } else {
            zzffu zzffu = (zzffu) it.next();
            throw null;
        }
    }

    public final void zzh(float f10) {
        zzfge.zza().zze(zza(), f10);
    }

    /* access modifiers changed from: package-private */
    public final void zzi(WebView webView) {
        this.zza = new zzfhj(webView);
    }

    public void zzj() {
    }

    public final boolean zzk() {
        return this.zza.get() != null;
    }
}
