package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import j1.l;
import j1.m;
import j1.r;
import j1.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.c;
import lc.k;

public class WebMessageChannel implements Disposable {
    protected static final String LOG_TAG = "WebMessageChannel";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_channel_";
    public WebMessageChannelChannelDelegate channelDelegate;
    public final List<m> compatPorts;

    /* renamed from: id  reason: collision with root package name */
    public String f28504id;
    public final List<WebMessagePort> ports;
    public InAppWebViewInterface webView;

    public WebMessageChannel(String str, InAppWebViewInterface inAppWebViewInterface) {
        this.f28504id = str;
        c cVar = inAppWebViewInterface.getPlugin().messenger;
        this.channelDelegate = new WebMessageChannelChannelDelegate(this, new k(cVar, METHOD_CHANNEL_NAME_PREFIX + str));
        if (inAppWebViewInterface instanceof InAppWebView) {
            this.compatPorts = new ArrayList(Arrays.asList(r.d((InAppWebView) inAppWebViewInterface)));
            this.ports = new ArrayList();
        } else {
            this.ports = Arrays.asList(new WebMessagePort[]{new WebMessagePort("port1", this), new WebMessagePort("port2", this)});
            this.compatPorts = new ArrayList();
        }
        this.webView = inAppWebViewInterface;
    }

    public void closeForInAppWebView(Integer num, k.d dVar) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !s.a("WEB_MESSAGE_PORT_CLOSE")) {
            dVar.success(Boolean.TRUE);
            return;
        }
        try {
            this.compatPorts.get(num.intValue()).a();
            dVar.success(Boolean.TRUE);
        } catch (Exception e10) {
            dVar.error(LOG_TAG, e10.getMessage(), (Object) null);
        }
    }

    public void dispose() {
        if (s.a("WEB_MESSAGE_PORT_CLOSE")) {
            for (m a10 : this.compatPorts) {
                try {
                    a10.a();
                } catch (Exception unused) {
                }
            }
        }
        WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
        if (webMessageChannelChannelDelegate != null) {
            webMessageChannelChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.compatPorts.clear();
        this.webView = null;
    }

    public void initJsInstance(InAppWebViewInterface inAppWebViewInterface, final ValueCallback<WebMessageChannel> valueCallback) {
        if (inAppWebViewInterface != null) {
            inAppWebViewInterface.evaluateJavascript("(function() {window.flutter_inappwebview._webMessageChannels['" + this.f28504id + "'] = new MessageChannel();})();", (ContentWorld) null, new ValueCallback<String>() {
                public void onReceiveValue(String str) {
                    valueCallback.onReceiveValue(this);
                }
            });
            return;
        }
        valueCallback.onReceiveValue(this);
    }

    public void onMessage(int i10, WebMessageCompatExt webMessageCompatExt) {
        WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
        if (webMessageChannelChannelDelegate != null) {
            webMessageChannelChannelDelegate.onMessage(i10, webMessageCompatExt);
        }
    }

    public void postMessageForInAppWebView(Integer num, WebMessageCompatExt webMessageCompatExt, k.d dVar) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !s.a("WEB_MESSAGE_PORT_POST_MESSAGE")) {
            dVar.success(Boolean.TRUE);
            return;
        }
        m mVar = this.compatPorts.get(num.intValue());
        ArrayList arrayList = new ArrayList();
        List<WebMessagePortCompatExt> ports2 = webMessageCompatExt.getPorts();
        if (ports2 != null) {
            for (WebMessagePortCompatExt next : ports2) {
                WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get(next.getWebMessageChannelId());
                if (webMessageChannel != null) {
                    arrayList.add(webMessageChannel.compatPorts.get(next.getIndex()));
                }
            }
        }
        Object data = webMessageCompatExt.getData();
        try {
            if (!s.a("WEB_MESSAGE_ARRAY_BUFFER") || data == null || webMessageCompatExt.getType() != 1) {
                mVar.d(new l(data != null ? data.toString() : null, (m[]) arrayList.toArray(new m[0])));
            } else {
                mVar.d(new l((byte[]) data, (m[]) arrayList.toArray(new m[0])));
            }
            dVar.success(Boolean.TRUE);
        } catch (Exception e10) {
            dVar.error(LOG_TAG, e10.getMessage(), (Object) null);
        }
    }

    public void setWebMessageCallbackForInAppWebView(final int i10, k.d dVar) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !s.a("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK")) {
            dVar.success(Boolean.TRUE);
            return;
        }
        try {
            this.compatPorts.get(i10).e(new m.a() {
                public void onMessage(m mVar, l lVar) {
                    super.onMessage(mVar, lVar);
                    this.onMessage(i10, lVar != null ? WebMessageCompatExt.fromMapWebMessageCompat(lVar) : null);
                }
            });
            dVar.success(Boolean.TRUE);
        } catch (Exception e10) {
            dVar.error(LOG_TAG, e10.getMessage(), (Object) null);
        }
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.f28504id);
        return hashMap;
    }
}
