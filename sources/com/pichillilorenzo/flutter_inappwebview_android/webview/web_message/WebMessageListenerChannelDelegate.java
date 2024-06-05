package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import java.util.HashMap;
import java.util.Map;
import lc.j;
import lc.k;

public class WebMessageListenerChannelDelegate extends ChannelDelegateImpl {
    private WebMessageListener webMessageListener;

    public WebMessageListenerChannelDelegate(WebMessageListener webMessageListener2, k kVar) {
        super(kVar);
        this.webMessageListener = webMessageListener2;
    }

    public void dispose() {
        super.dispose();
        this.webMessageListener = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f36116a;
        str.hashCode();
        if (!str.equals("postMessage")) {
            dVar.notImplemented();
            return;
        }
        WebMessageListener webMessageListener2 = this.webMessageListener;
        if (webMessageListener2 == null || !(webMessageListener2.webView instanceof InAppWebView)) {
            dVar.success(Boolean.FALSE);
            return;
        }
        this.webMessageListener.postMessageForInAppWebView(WebMessageCompatExt.fromMap((Map) jVar.a("message")), dVar);
    }

    public void onPostMessage(WebMessageCompatExt webMessageCompatExt, String str, boolean z10) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", webMessageCompatExt != null ? webMessageCompatExt.toMap() : null);
            hashMap.put("sourceOrigin", str);
            hashMap.put("isMainFrame", Boolean.valueOf(z10));
            channel.c("onPostMessage", hashMap);
        }
    }
}
