package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfge {
    private static final zzfge zza = new zzfge();

    private zzfge() {
    }

    public static final zzfge zza() {
        return zza;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            if (r6 > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb2.append("\"\"");
                    } else if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb2.append(obj2);
                        } else {
                            sb2.append('\"');
                            sb2.append(obj2);
                            sb2.append('\"');
                        }
                    } else {
                        sb2.append(obj);
                    }
                    sb2.append(",");
                }
                sb2.setLength(sb2.length() - 1);
            }
            sb2.append(")}");
            String sb3 = sb2.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                webView.loadUrl(sb3);
            } else {
                handler.post(new zzfgd(this, webView, sb3));
            }
        } else {
            zzffh.zza.booleanValue();
        }
    }

    public final void zzc(WebView webView) {
        zzb(webView, "finishSession", new Object[0]);
    }

    public final void zzd(WebView webView, JSONObject jSONObject) {
        zzb(webView, "init", jSONObject);
    }

    public final void zze(WebView webView, float f10) {
        zzb(webView, "setDeviceVolume", Float.valueOf(f10));
    }

    public final void zzf(WebView webView, String str) {
        zzb(webView, "setNativeViewHierarchy", str);
    }

    public final void zzg(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        zzb(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
