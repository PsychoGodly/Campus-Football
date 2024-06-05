package com.unity3d.services.ads.webplayer;

import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;

public class WebPlayerEventBridge {
    public static void error(String str, String str2, String str3) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.ERROR, str2, str3, str);
        }
    }

    public static void sendFrameUpdate(String str, int i10, int i11, int i12, int i13, float f10) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.FRAME_UPDATE, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Float.valueOf(f10));
        }
    }

    public static void sendGetFrameResponse(String str, String str2, int i10, int i11, int i12, int i13, float f10) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.GET_FRAME_RESPONSE, str, str2, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Float.valueOf(f10));
        }
    }
}
