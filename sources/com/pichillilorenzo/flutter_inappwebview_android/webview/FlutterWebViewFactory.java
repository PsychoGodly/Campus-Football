package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import io.flutter.plugin.platform.g;
import lc.r;

public class FlutterWebViewFactory extends g {
    public static final String VIEW_TYPE_ID = "com.pichillilorenzo/flutter_inappwebview";
    private final InAppWebViewFlutterPlugin plugin;

    public FlutterWebViewFactory(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(r.f36128a);
        this.plugin = inAppWebViewFlutterPlugin;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.flutter.plugin.platform.f create(android.content.Context r6, int r7, java.lang.Object r8) {
        /*
            r5 = this;
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = "keepAliveId"
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "headlessWebViewId"
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin r2 = r5.plugin
            com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebViewManager r2 = r2.headlessInAppWebViewManager
            if (r1 == 0) goto L_0x0031
            if (r2 == 0) goto L_0x0031
            java.util.Map<java.lang.String, com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebView> r2 = r2.webViews
            java.lang.Object r1 = r2.get(r1)
            com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebView r1 = (com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebView) r1
            if (r1 == 0) goto L_0x0031
            com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView r1 = r1.disposeAndGetFlutterWebView()
            if (r1 == 0) goto L_0x0032
            r1.keepAliveId = r0
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin r2 = r5.plugin
            com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager r2 = r2.inAppWebViewManager
            if (r0 == 0) goto L_0x0057
            if (r1 != 0) goto L_0x0057
            if (r2 == 0) goto L_0x0057
            java.util.Map<java.lang.String, com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView> r1 = r2.keepAliveWebViews
            java.lang.Object r1 = r1.get(r0)
            com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView r1 = (com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView) r1
            if (r1 == 0) goto L_0x0057
            android.view.View r3 = r1.getView()
            if (r3 == 0) goto L_0x0057
            android.view.ViewParent r4 = r3.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == 0) goto L_0x0057
            r4.removeView(r3)
        L_0x0057:
            if (r1 != 0) goto L_0x005b
            r3 = 1
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            if (r1 != 0) goto L_0x0068
            if (r0 == 0) goto L_0x0061
            r7 = r0
        L_0x0061:
            com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView r1 = new com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView
            com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin r4 = r5.plugin
            r1.<init>(r4, r6, r7, r8)
        L_0x0068:
            if (r0 == 0) goto L_0x0071
            if (r2 == 0) goto L_0x0071
            java.util.Map<java.lang.String, com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView> r6 = r2.keepAliveWebViews
            r6.put(r0, r1)
        L_0x0071:
            if (r3 == 0) goto L_0x0076
            r1.makeInitialLoad(r8)
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.webview.FlutterWebViewFactory.create(android.content.Context, int, java.lang.Object):io.flutter.plugin.platform.f");
    }
}
