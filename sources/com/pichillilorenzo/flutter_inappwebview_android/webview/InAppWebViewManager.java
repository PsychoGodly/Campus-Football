package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j1.r;
import j1.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import lc.j;
import lc.k;

public class InAppWebViewManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "InAppWebViewManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_manager";
    public final Map<String, FlutterWebView> keepAliveWebViews = new HashMap();
    public InAppWebViewFlutterPlugin plugin;
    public int windowAutoincrementId = 0;
    public final Map<Integer, Message> windowWebViewMessages = new HashMap();

    public InAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new k(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void clearAllCache(Context context, boolean z10) {
        WebView webView = new WebView(context);
        webView.clearCache(z10);
        webView.destroy();
    }

    public Map<String, Object> convertWebViewPackageToMap(PackageInfo packageInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put("versionName", packageInfo.versionName);
        hashMap.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, packageInfo.packageName);
        return hashMap;
    }

    public void dispose() {
        super.dispose();
        for (FlutterWebView flutterWebView : this.keepAliveWebViews.values()) {
            String str = flutterWebView.keepAliveId;
            if (str != null) {
                disposeKeepAlive(str);
            }
        }
        this.keepAliveWebViews.clear();
        this.windowWebViewMessages.clear();
        this.plugin = null;
    }

    public void disposeKeepAlive(String str) {
        ViewGroup viewGroup;
        FlutterWebView flutterWebView = this.keepAliveWebViews.get(str);
        if (flutterWebView != null) {
            flutterWebView.keepAliveId = null;
            View view = flutterWebView.getView();
            if (!(view == null || (viewGroup = (ViewGroup) view.getParent()) == null)) {
                viewGroup.removeView(view);
            }
            flutterWebView.dispose();
        }
        if (this.keepAliveWebViews.containsKey(str)) {
            this.keepAliveWebViews.put(str, (Object) null);
        }
    }

    public void onMethodCall(j jVar, final k.d dVar) {
        Context context;
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1496477679:
                if (str.equals("disableWebView")) {
                    c10 = 0;
                    break;
                }
                break;
            case -910403233:
                if (str.equals("setWebContentsDebuggingEnabled")) {
                    c10 = 1;
                    break;
                }
                break;
            case -633518365:
                if (str.equals("getVariationsHeader")) {
                    c10 = 2;
                    break;
                }
                break;
            case -436220260:
                if (str.equals("clearClientCertPreferences")) {
                    c10 = 3;
                    break;
                }
                break;
            case 258673215:
                if (str.equals("getSafeBrowsingPrivacyPolicyUrl")) {
                    c10 = 4;
                    break;
                }
                break;
            case 426229521:
                if (str.equals("setSafeBrowsingAllowlist")) {
                    c10 = 5;
                    break;
                }
                break;
            case 643643439:
                if (str.equals("getDefaultUserAgent")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1033609166:
                if (str.equals("clearAllCache")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1586319888:
                if (str.equals("getCurrentWebViewPackage")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1667434977:
                if (str.equals("isMultiProcessEnabled")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1867011305:
                if (str.equals("disposeKeepAlive")) {
                    c10 = 10;
                    break;
                }
                break;
        }
        Map<String, Object> map = null;
        switch (c10) {
            case 0:
                if (Build.VERSION.SDK_INT >= 28) {
                    WebView.disableWebView();
                }
                dVar.success(Boolean.TRUE);
                return;
            case 1:
                boolean booleanValue = ((Boolean) jVar.a("debuggingEnabled")).booleanValue();
                if (Build.VERSION.SDK_INT >= 19) {
                    WebView.setWebContentsDebuggingEnabled(booleanValue);
                }
                dVar.success(Boolean.TRUE);
                return;
            case 2:
                if (s.a("GET_VARIATIONS_HEADER")) {
                    dVar.success(r.l());
                    return;
                } else {
                    dVar.success((Object) null);
                    return;
                }
            case 3:
                if (Build.VERSION.SDK_INT >= 21) {
                    WebView.clearClientCertPreferences(new Runnable() {
                        public void run() {
                            dVar.success(Boolean.TRUE);
                        }
                    });
                    return;
                } else {
                    dVar.success(Boolean.FALSE);
                    return;
                }
            case 4:
                if (s.a("SAFE_BROWSING_PRIVACY_POLICY_URL")) {
                    dVar.success(r.k().toString());
                    return;
                } else {
                    dVar.success((Object) null);
                    return;
                }
            case 5:
                if (s.a("SAFE_BROWSING_ALLOWLIST")) {
                    r.p(new HashSet((List) jVar.a("hosts")), new ValueCallback<Boolean>() {
                        public void onReceiveValue(Boolean bool) {
                            dVar.success(bool);
                        }
                    });
                    return;
                } else if (s.a("SAFE_BROWSING_WHITELIST")) {
                    r.q((List) jVar.a("hosts"), new ValueCallback<Boolean>() {
                        public void onReceiveValue(Boolean bool) {
                            dVar.success(bool);
                        }
                    });
                    return;
                } else {
                    dVar.success(Boolean.FALSE);
                    return;
                }
            case 6:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
                if (inAppWebViewFlutterPlugin != null) {
                    dVar.success(WebSettings.getDefaultUserAgent(inAppWebViewFlutterPlugin.applicationContext));
                    return;
                } else {
                    dVar.success((Object) null);
                    return;
                }
            case 7:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                if (inAppWebViewFlutterPlugin2 != null) {
                    Context context2 = inAppWebViewFlutterPlugin2.activity;
                    if (context2 == null) {
                        context2 = inAppWebViewFlutterPlugin2.applicationContext;
                    }
                    if (context2 != null) {
                        clearAllCache(context2, ((Boolean) jVar.a("includeDiskFiles")).booleanValue());
                    }
                }
                dVar.success(Boolean.TRUE);
                return;
            case 8:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.plugin;
                if (inAppWebViewFlutterPlugin3 != null) {
                    context = inAppWebViewFlutterPlugin3.activity;
                    if (context == null) {
                        context = inAppWebViewFlutterPlugin3.applicationContext;
                    }
                } else {
                    context = null;
                }
                PackageInfo f10 = context != null ? r.f(context) : null;
                if (f10 != null) {
                    map = convertWebViewPackageToMap(f10);
                }
                dVar.success(map);
                return;
            case 9:
                if (s.a("MULTI_PROCESS")) {
                    dVar.success(Boolean.valueOf(r.m()));
                    return;
                } else {
                    dVar.success(Boolean.FALSE);
                    return;
                }
            case 10:
                String str2 = (String) jVar.a("keepAliveId");
                if (str2 != null) {
                    disposeKeepAlive(str2);
                }
                dVar.success(Boolean.TRUE);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
