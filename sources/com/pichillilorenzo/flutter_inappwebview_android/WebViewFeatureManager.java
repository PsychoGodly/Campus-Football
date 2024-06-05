package com.pichillilorenzo.flutter_inappwebview_android;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import j1.s;
import lc.j;
import lc.k;

public class WebViewFeatureManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "WebViewFeatureManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webviewfeature";
    public InAppWebViewFlutterPlugin plugin;

    public WebViewFeatureManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new k(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f36116a;
        str.hashCode();
        if (str.equals("isStartupFeatureSupported")) {
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
            if (inAppWebViewFlutterPlugin != null && inAppWebViewFlutterPlugin.activity != null) {
                dVar.success(Boolean.valueOf(s.b(this.plugin.activity, (String) jVar.a("startupFeature"))));
            }
        } else if (!str.equals("isFeatureSupported")) {
            dVar.notImplemented();
        } else {
            dVar.success(Boolean.valueOf(s.a((String) jVar.a("feature"))));
        }
    }
}
