package com.applovin.sdk;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.x;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxReward;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f14115a = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f14116b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public WebView f14117c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public EventListener f14118d;

    public interface EventListener {
        void onReceivedEvent(String str);
    }

    class a extends x {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f14119a;

        a(k kVar) {
            this.f14119a = kVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(k kVar) {
            if (!((Boolean) kVar.a(oj.O5)).booleanValue() || !AppLovinWebViewActivity.this.f14115a.compareAndSet(false, true)) {
                AppLovinWebViewActivity.this.finish();
                return;
            }
            AppLovinWebViewActivity.this.a(kVar);
            if (StringUtils.isValidString(AppLovinWebViewActivity.this.f14116b)) {
                AppLovinWebViewActivity.this.f14117c.loadUrl(AppLovinWebViewActivity.this.f14116b);
            }
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (AppLovinWebViewActivity.this.f14117c == webView) {
                AppLovinWebViewActivity.this.f14117c.destroy();
                WebView unused = AppLovinWebViewActivity.this.f14117c = null;
                AppLovinWebViewActivity.this.runOnUiThread(new c(this, this.f14119a));
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            this.f14119a.L();
            if (t.a()) {
                t L = this.f14119a.L();
                L.a("AppLovinWebViewActivity", "Handling url load: " + str);
            }
            if (!"applovin".equalsIgnoreCase(scheme) || !"com.applovin.sdk".equalsIgnoreCase(host) || AppLovinWebViewActivity.this.f14118d == null) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            if (!path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                return true;
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            String str2 = queryParameterNames.isEmpty() ? MaxReward.DEFAULT_LABEL : (String) queryParameterNames.toArray()[0];
            if (StringUtils.isValidString(str2)) {
                String queryParameter = parse.getQueryParameter(str2);
                this.f14119a.L();
                if (t.a()) {
                    t L2 = this.f14119a.L();
                    L2.a("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str2 + " and value: " + queryParameter);
                }
                AppLovinWebViewActivity.this.f14118d.onReceivedEvent(queryParameter);
                return true;
            }
            this.f14119a.L();
            if (!t.a()) {
                return true;
            }
            this.f14119a.L().b("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
            return true;
        }
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f14118d = eventListener;
        this.f14116b = str;
        this.f14115a.set(false);
        WebView webView = this.f14117c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public void onBackPressed() {
        EventListener eventListener = this.f14118d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY);
        if (TextUtils.isEmpty(stringExtra)) {
            t.h("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        a(AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(getApplicationContext()), getApplicationContext()).a());
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        String stringExtra2 = getIntent().getStringExtra(INTENT_EXTRA_KEY_LOAD_URL);
        if (StringUtils.isValidString(stringExtra2)) {
            this.f14116b = stringExtra2;
        }
        if (StringUtils.isValidString(this.f14116b)) {
            this.f14117c.loadUrl(this.f14116b);
        }
    }

    /* access modifiers changed from: private */
    public void a(k kVar) {
        WebView b10 = zp.b((Context) this, "WebView Activity");
        this.f14117c = b10;
        if (b10 == null) {
            finish();
            return;
        }
        setContentView(b10);
        WebSettings settings = this.f14117c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f14117c.setVerticalScrollBarEnabled(true);
        this.f14117c.setHorizontalScrollBarEnabled(true);
        this.f14117c.setScrollBarStyle(33554432);
        this.f14117c.setWebViewClient(new a(kVar));
    }
}
