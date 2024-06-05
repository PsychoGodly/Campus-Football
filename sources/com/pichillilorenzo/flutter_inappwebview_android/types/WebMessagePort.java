package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import java.util.ArrayList;
import java.util.List;

public class WebMessagePort {
    public boolean isClosed = false;
    public boolean isStarted = false;
    public boolean isTransferred = false;
    public String name;
    public WebMessageChannel webMessageChannel;

    public WebMessagePort(String str, WebMessageChannel webMessageChannel2) {
        this.name = str;
        this.webMessageChannel = webMessageChannel2;
    }

    public void close(final ValueCallback<Void> valueCallback) throws Exception {
        InAppWebViewInterface inAppWebViewInterface;
        if (!this.isTransferred) {
            this.isClosed = true;
            WebMessageChannel webMessageChannel2 = this.webMessageChannel;
            if (webMessageChannel2 == null || (inAppWebViewInterface = webMessageChannel2.webView) == null) {
                inAppWebViewInterface = null;
            }
            if (inAppWebViewInterface != null) {
                inAppWebViewInterface.evaluateJavascript("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['" + this.webMessageChannel.f28504id + "'];  if (webMessageChannel != null) {      webMessageChannel." + this.name + ".close();  }})();", (ContentWorld) null, new ValueCallback<String>() {
                    public void onReceiveValue(String str) {
                        valueCallback.onReceiveValue((Object) null);
                    }
                });
                return;
            }
            valueCallback.onReceiveValue((Object) null);
            return;
        }
        throw new Exception("Port is already transferred");
    }

    public void dispose() {
        this.isClosed = true;
        this.webMessageChannel = null;
    }

    public void postMessage(WebMessage webMessage, final ValueCallback<Void> valueCallback) throws Exception {
        InAppWebViewInterface inAppWebViewInterface;
        String str;
        if (this.isClosed || this.isTransferred) {
            throw new Exception("Port is already closed or transferred");
        }
        WebMessageChannel webMessageChannel2 = this.webMessageChannel;
        if (webMessageChannel2 == null || (inAppWebViewInterface = webMessageChannel2.webView) == null) {
            inAppWebViewInterface = null;
        }
        if (inAppWebViewInterface != null) {
            List<WebMessagePort> list = webMessage.ports;
            String str2 = "null";
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (WebMessagePort next : list) {
                    if (next == this) {
                        throw new Exception("Source port cannot be transferred");
                    } else if (next.isStarted) {
                        throw new Exception("Port is already started");
                    } else if (next.isClosed || next.isTransferred) {
                        throw new Exception("Port is already closed or transferred");
                    } else {
                        next.isTransferred = true;
                        arrayList.add("window.flutter_inappwebview._webMessageChannels['" + this.webMessageChannel.f28504id + "']." + next.name);
                    }
                }
                str = "[" + TextUtils.join(", ", arrayList) + "]";
            } else {
                str = str2;
            }
            String str3 = webMessage.data;
            if (str3 != null) {
                str2 = Util.replaceAll(str3, "'", "\\'");
            }
            inAppWebViewInterface.evaluateJavascript("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['" + this.webMessageChannel.f28504id + "'];  if (webMessageChannel != null) {      webMessageChannel." + this.name + ".postMessage('" + str2 + "', " + str + ");  }})();", (ContentWorld) null, new ValueCallback<String>() {
                public void onReceiveValue(String str) {
                    valueCallback.onReceiveValue((Object) null);
                }
            });
        } else {
            valueCallback.onReceiveValue((Object) null);
        }
        webMessage.dispose();
    }

    public void setWebMessageCallback(final ValueCallback<Void> valueCallback) throws Exception {
        InAppWebViewInterface inAppWebViewInterface;
        if (this.isClosed || this.isTransferred) {
            throw new Exception("Port is already closed or transferred");
        }
        this.isStarted = true;
        WebMessageChannel webMessageChannel2 = this.webMessageChannel;
        if (webMessageChannel2 == null || (inAppWebViewInterface = webMessageChannel2.webView) == null) {
            inAppWebViewInterface = null;
        }
        if (inAppWebViewInterface != null) {
            inAppWebViewInterface.evaluateJavascript("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['" + this.webMessageChannel.f28504id + "'];  if (webMessageChannel != null) {      webMessageChannel." + this.name + ".onmessage = function (event) {          window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + ".callHandler('onWebMessagePortMessageReceived', {              'webMessageChannelId': '" + this.webMessageChannel.f28504id + "',              'index': " + (true ^ this.name.equals("port1") ? 1 : 0) + ",              'message': event.data          });      }  }})();", (ContentWorld) null, new ValueCallback<String>() {
                public void onReceiveValue(String str) {
                    ValueCallback valueCallback = valueCallback;
                    if (valueCallback != null) {
                        valueCallback.onReceiveValue((Object) null);
                    }
                }
            });
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue((Object) null);
        }
    }
}
