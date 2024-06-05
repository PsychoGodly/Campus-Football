package com.startapp;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: Sta */
public class mb extends u9.a {

    /* renamed from: f  reason: collision with root package name */
    public WebView f16145f;

    /* renamed from: g  reason: collision with root package name */
    public Long f16146g = null;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, v9> f16147h;

    /* renamed from: i  reason: collision with root package name */
    public final String f16148i;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final WebView f16149a;

        public a(mb mbVar) {
            this.f16149a = mbVar.f16145f;
        }

        public void run() {
            this.f16149a.destroy();
        }
    }

    public mb(Map<String, v9> map, String str) {
        this.f16147h = map;
        this.f16148i = str;
    }

    public void a(eb ebVar, q qVar) {
        JSONObject jSONObject = new JSONObject();
        Map<String, v9> unmodifiableMap = Collections.unmodifiableMap(qVar.f16272d);
        for (String next : unmodifiableMap.keySet()) {
            qb.a(jSONObject, next, unmodifiableMap.get(next));
        }
        a(ebVar, qVar, jSONObject);
    }

    public void b() {
        long j10;
        this.f30666a.clear();
        if (this.f16146g == null) {
            j10 = 4000;
        } else {
            j10 = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f16146g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new a(this), Math.max(4000 - j10, 2000));
        this.f16145f = null;
    }

    public void d() {
        WebView webView = new WebView(zb.f17611b.f17612a);
        this.f16145f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f30666a = new sb(this.f16145f);
        WebView webView2 = this.f16145f;
        String str = this.f16148i;
        if (webView2 != null && !TextUtils.isEmpty(str)) {
            webView2.loadUrl("javascript: " + str);
        }
        for (String next : this.f16147h.keySet()) {
            String externalForm = this.f16147h.get(next).f17429b.toExternalForm();
            WebView webView3 = this.f16145f;
            if (externalForm != null && !TextUtils.isEmpty(next)) {
                String replace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", next);
                if (webView3 != null && !TextUtils.isEmpty(replace)) {
                    webView3.loadUrl("javascript: " + replace);
                }
            }
        }
        this.f16146g = Long.valueOf(System.nanoTime());
    }
}
