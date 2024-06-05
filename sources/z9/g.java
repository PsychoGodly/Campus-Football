package z9;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import ca.d;
import org.json.JSONObject;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static g f31531a = new g();

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebView f31532a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31533b;

        a(WebView webView, String str) {
            this.f31532a = webView;
            this.f31533b = str;
        }

        public void run() {
            g.this.o(this.f31532a, this.f31533b);
        }
    }

    private g() {
    }

    public static final g a() {
        return f31531a;
    }

    public void b(WebView webView, String str) {
        g(webView, "finishSession", str);
    }

    public void c(WebView webView, String str, float f10) {
        g(webView, "setDeviceVolume", Float.valueOf(f10), str);
    }

    public void d(WebView webView, String str, String str2) {
        g(webView, "setNativeViewHierarchy", str2, str);
    }

    public void e(WebView webView, String str, JSONObject jSONObject) {
        g(webView, "init", jSONObject, str);
    }

    public void f(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        g(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    public void g(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            j(sb2, objArr);
            sb2.append(")}");
            h(webView, sb2);
            return;
        }
        d.a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    public void h(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            o(webView, sb3);
        } else {
            handler.post(new a(webView, sb3));
        }
    }

    public void i(WebView webView, JSONObject jSONObject) {
        g(webView, "setLastActivity", jSONObject);
    }

    /* access modifiers changed from: package-private */
    public void j(StringBuilder sb2, Object[] objArr) {
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

    public void k(WebView webView, String str) {
        g(webView, "publishImpressionEvent", str);
    }

    public void l(WebView webView, String str, String str2) {
        g(webView, "setState", str2, str);
    }

    public void m(WebView webView, String str, JSONObject jSONObject) {
        g(webView, "publishLoadedEvent", jSONObject, str);
    }

    public void n(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            o(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    public boolean o(WebView webView, String str) {
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
}
