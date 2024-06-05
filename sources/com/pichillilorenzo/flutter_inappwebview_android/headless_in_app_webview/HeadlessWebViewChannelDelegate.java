package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import java.util.HashMap;
import java.util.Map;
import lc.j;
import lc.k;

public class HeadlessWebViewChannelDelegate extends ChannelDelegateImpl {
    private HeadlessInAppWebView headlessWebView;

    public HeadlessWebViewChannelDelegate(HeadlessInAppWebView headlessInAppWebView, k kVar) {
        super(kVar);
        this.headlessWebView = headlessInAppWebView;
    }

    public void dispose() {
        super.dispose();
        this.headlessWebView = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -75151241:
                if (str.equals("getSize")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1671767583:
                if (str.equals("dispose")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1984958339:
                if (str.equals("setSize")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                HeadlessInAppWebView headlessInAppWebView = this.headlessWebView;
                Map<String, Object> map = null;
                if (headlessInAppWebView != null) {
                    Size2D size = headlessInAppWebView.getSize();
                    if (size != null) {
                        map = size.toMap();
                    }
                    dVar.success(map);
                    return;
                }
                dVar.success((Object) null);
                return;
            case 1:
                HeadlessInAppWebView headlessInAppWebView2 = this.headlessWebView;
                if (headlessInAppWebView2 != null) {
                    headlessInAppWebView2.dispose();
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            case 2:
                if (this.headlessWebView != null) {
                    Size2D fromMap = Size2D.fromMap((Map) jVar.a("size"));
                    if (fromMap != null) {
                        this.headlessWebView.setSize(fromMap);
                    }
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }

    public void onWebViewCreated() {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onWebViewCreated", new HashMap());
        }
    }
}
