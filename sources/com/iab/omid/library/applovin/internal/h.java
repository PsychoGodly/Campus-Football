package com.iab.omid.library.applovin.internal;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.utils.d;
import org.json.JSONObject;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private static h f27397a = new h();

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebView f27398a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27399b;

        a(WebView webView, String str) {
            this.f27398a = webView;
            this.f27399b = str;
        }

        public void run() {
            h.this.c(this.f27398a, this.f27399b);
        }
    }

    private h() {
    }

    public static final h a() {
        return f27397a;
    }

    public void b(WebView webView, String str) {
        a(webView, "publishImpressionEvent", str);
    }

    public void c(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    public void a(WebView webView, String str) {
        a(webView, "finishSession", str);
    }

    public void b(WebView webView, String str, String str2) {
        a(webView, "setState", str2, str);
    }

    public boolean c(WebView webView, String str) {
        StringBuilder sb2;
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                webView.evaluateJavascript(str, (ValueCallback) null);
                return true;
            } catch (IllegalStateException unused) {
                sb2 = new StringBuilder();
            }
        } else {
            sb2 = new StringBuilder();
            sb2.append("javascript: ");
            sb2.append(str);
            webView.loadUrl(sb2.toString());
            return true;
        }
    }

    public void a(WebView webView, String str, float f10) {
        a(webView, "setDeviceVolume", Float.valueOf(f10), str);
    }

    public void b(WebView webView, String str, JSONObject jSONObject) {
        a(webView, "publishLoadedEvent", jSONObject, str);
    }

    public void a(WebView webView, String str, ErrorType errorType, String str2) {
        a(webView, "error", errorType.toString(), str2, str);
    }

    public void a(WebView webView, String str, String str2) {
        a(webView, "setNativeViewHierarchy", str2, str);
    }

    public void a(WebView webView, String str, String str2, JSONObject jSONObject) {
        a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    public void a(WebView webView, String str, JSONObject jSONObject) {
        a(webView, "init", jSONObject, str);
    }

    public void a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    public void a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            a(sb2, objArr);
            sb2.append(")}");
            a(webView, sb2);
            return;
        }
        d.a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    public void a(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            c(webView, sb3);
        } else {
            handler.post(new a(webView, sb3));
        }
    }

    public void a(WebView webView, JSONObject jSONObject) {
        a(webView, "setLastActivity", jSONObject);
    }

    /* access modifiers changed from: package-private */
    public void a(StringBuilder sb2, Object[] objArr) {
        String obj;
        if (objArr != null && objArr.length > 0) {
            for (Object obj2 : objArr) {
                if (obj2 == null) {
                    obj = "null";
                } else {
                    if (obj2 instanceof String) {
                        obj = obj2.toString();
                        if (!obj.startsWith("{")) {
                            sb2.append('\"');
                            sb2.append(obj);
                            sb2.append('\"');
                        }
                    } else {
                        sb2.append(obj2);
                    }
                    sb2.append(",");
                }
                sb2.append(obj);
                sb2.append(",");
            }
            sb2.setLength(sb2.length() - 1);
        }
    }
}
