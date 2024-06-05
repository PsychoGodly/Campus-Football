package com.unity3d.services.core.api;

import com.unity3d.services.core.broadcast.BroadcastError;
import com.unity3d.services.core.broadcast.BroadcastMonitor;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import org.json.JSONArray;
import org.json.JSONException;

public class Broadcast {
    @WebViewExposed
    public static void addBroadcastListener(String str, JSONArray jSONArray, WebViewCallback webViewCallback) {
        addBroadcastListener(str, (String) null, jSONArray, webViewCallback);
    }

    @WebViewExposed
    public static void removeAllBroadcastListeners(WebViewCallback webViewCallback) {
        BroadcastMonitor.getInstance().removeAllBroadcastListeners();
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void removeBroadcastListener(String str, WebViewCallback webViewCallback) {
        BroadcastMonitor.getInstance().removeBroadcastListener(str);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void addBroadcastListener(String str, String str2, JSONArray jSONArray, WebViewCallback webViewCallback) {
        try {
            if (jSONArray.length() > 0) {
                String[] strArr = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr[i10] = jSONArray.getString(i10);
                }
                BroadcastMonitor.getInstance().addBroadcastListener(str, str2, strArr);
            }
            webViewCallback.invoke(new Object[0]);
        } catch (JSONException unused) {
            webViewCallback.error(BroadcastError.JSON_ERROR, new Object[0]);
        }
    }
}
