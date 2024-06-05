package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import java.util.HashMap;
import java.util.Map;
import lc.j;
import lc.k;

public class WebMessageChannelChannelDelegate extends ChannelDelegateImpl {
    private WebMessageChannel webMessageChannel;

    public WebMessageChannelChannelDelegate(WebMessageChannel webMessageChannel2, k kVar) {
        super(kVar);
        this.webMessageChannel = webMessageChannel2;
    }

    public void dispose() {
        super.dispose();
        this.webMessageChannel = null;
    }

    public void onMessage(int i10, WebMessageCompatExt webMessageCompatExt) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("index", Integer.valueOf(i10));
            hashMap.put("message", webMessageCompatExt != null ? webMessageCompatExt.toMap() : null);
            channel.c("onMessage", hashMap);
        }
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 94756344:
                if (str.equals("close")) {
                    c10 = 0;
                    break;
                }
                break;
            case 556190586:
                if (str.equals("setWebMessageCallback")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1490029383:
                if (str.equals("postMessage")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                WebMessageChannel webMessageChannel2 = this.webMessageChannel;
                if (webMessageChannel2 == null || !(webMessageChannel2.webView instanceof InAppWebView)) {
                    dVar.success(Boolean.FALSE);
                    return;
                }
                this.webMessageChannel.closeForInAppWebView((Integer) jVar.a("index"), dVar);
                return;
            case 1:
                WebMessageChannel webMessageChannel3 = this.webMessageChannel;
                if (webMessageChannel3 == null || !(webMessageChannel3.webView instanceof InAppWebView)) {
                    dVar.success(Boolean.FALSE);
                    return;
                } else {
                    this.webMessageChannel.setWebMessageCallbackForInAppWebView(((Integer) jVar.a("index")).intValue(), dVar);
                    return;
                }
            case 2:
                WebMessageChannel webMessageChannel4 = this.webMessageChannel;
                if (webMessageChannel4 == null || !(webMessageChannel4.webView instanceof InAppWebView)) {
                    dVar.success(Boolean.FALSE);
                    return;
                }
                WebMessageCompatExt fromMap = WebMessageCompatExt.fromMap((Map) jVar.a("message"));
                this.webMessageChannel.postMessageForInAppWebView((Integer) jVar.a("index"), fromMap, dVar);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
