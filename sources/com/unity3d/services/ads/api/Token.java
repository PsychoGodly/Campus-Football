package com.unity3d.services.ads.api;

import com.unity3d.services.ads.token.TokenError;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import org.json.JSONArray;
import org.json.JSONException;

public class Token {
    private static final TokenStorage tokenStorage = ((TokenStorage) Utilities.getService(TokenStorage.class));

    @WebViewExposed
    public static void appendTokens(JSONArray jSONArray, WebViewCallback webViewCallback) {
        try {
            tokenStorage.appendTokens(jSONArray);
            webViewCallback.invoke(new Object[0]);
        } catch (JSONException e10) {
            webViewCallback.error(TokenError.JSON_EXCEPTION, e10.getMessage());
        }
    }

    @WebViewExposed
    public static void createTokens(JSONArray jSONArray, WebViewCallback webViewCallback) {
        try {
            tokenStorage.createTokens(jSONArray);
            webViewCallback.invoke(new Object[0]);
        } catch (JSONException e10) {
            webViewCallback.error(TokenError.JSON_EXCEPTION, e10.getMessage());
        }
    }

    @WebViewExposed
    public static void deleteTokens(WebViewCallback webViewCallback) {
        tokenStorage.deleteTokens();
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void getNativeGeneratedToken(WebViewCallback webViewCallback) {
        tokenStorage.getNativeGeneratedToken();
        webViewCallback.invoke(new Object[0]);
    }
}
