package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

import android.content.Context;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import java.util.HashMap;
import java.util.Map;
import lc.j;
import lc.k;

public class HeadlessInAppWebViewManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "HeadlessInAppWebViewManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_headless_inappwebview";
    public InAppWebViewFlutterPlugin plugin;
    public final Map<String, HeadlessInAppWebView> webViews = new HashMap();

    public HeadlessInAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new k(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void dispose() {
        super.dispose();
        for (HeadlessInAppWebView next : this.webViews.values()) {
            if (next != null) {
                next.dispose();
            }
        }
        this.webViews.clear();
        this.plugin = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = (String) jVar.a("id");
        String str2 = jVar.f36116a;
        str2.hashCode();
        if (!str2.equals("run")) {
            dVar.notImplemented();
            return;
        }
        run(str, (HashMap) jVar.a("params"));
        dVar.success(Boolean.TRUE);
    }

    public void run(String str, HashMap<String, Object> hashMap) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            Context context = inAppWebViewFlutterPlugin.activity;
            if (context != null || inAppWebViewFlutterPlugin.applicationContext != null) {
                if (context == null) {
                    context = inAppWebViewFlutterPlugin.applicationContext;
                }
                FlutterWebView flutterWebView = new FlutterWebView(inAppWebViewFlutterPlugin, context, str, hashMap);
                HeadlessInAppWebView headlessInAppWebView = new HeadlessInAppWebView(this.plugin, str, flutterWebView);
                this.webViews.put(str, headlessInAppWebView);
                headlessInAppWebView.prepare(hashMap);
                headlessInAppWebView.onWebViewCreated();
                flutterWebView.makeInitialLoad(hashMap);
            }
        }
    }
}
