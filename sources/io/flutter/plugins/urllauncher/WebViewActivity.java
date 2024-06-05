package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WebViewActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private final BroadcastReceiver f34167a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final WebViewClient f34168b = new b();

    /* renamed from: c  reason: collision with root package name */
    WebView f34169c;

    /* renamed from: d  reason: collision with root package name */
    private final IntentFilter f34170d = new IntentFilter("close action");

    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("close action".equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    class c extends WebChromeClient {

        class a extends WebViewClient {
            a() {
            }

            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f34169c.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f34169c.loadUrl(str);
                return true;
            }
        }

        c() {
        }

        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            a aVar = new a();
            WebView webView2 = new WebView(WebViewActivity.this.f34169c.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent a(Context context, String str, boolean z10, boolean z11, Bundle bundle) {
        return new Intent(context, WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", z10).putExtra("enableDomStorage", z11).putExtra("com.android.browser.headers", bundle);
    }

    public static Map<String, String> b(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f34169c = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        this.f34169c.loadUrl(stringExtra, b(intent.getBundleExtra("com.android.browser.headers")));
        this.f34169c.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f34169c.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f34169c.setWebViewClient(this.f34168b);
        this.f34169c.getSettings().setSupportMultipleWindows(true);
        this.f34169c.setWebChromeClient(new c());
        androidx.core.content.a.registerReceiver(this, this.f34167a, this.f34170d, 2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f34167a);
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !this.f34169c.canGoBack()) {
            return super.onKeyDown(i10, keyEvent);
        }
        this.f34169c.goBack();
        return true;
    }

    class b extends WebViewClient {
        b() {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (Build.VERSION.SDK_INT >= 21) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            webView.loadUrl(str);
            return false;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (Build.VERSION.SDK_INT < 21) {
                return false;
            }
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }
    }
}
