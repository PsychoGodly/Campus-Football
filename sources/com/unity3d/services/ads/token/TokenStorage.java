package com.unity3d.services.ads.token;

import org.json.JSONArray;
import org.json.JSONException;
import sd.w;

/* compiled from: TokenStorage.kt */
public interface TokenStorage {
    void appendTokens(JSONArray jSONArray) throws JSONException;

    void createTokens(JSONArray jSONArray) throws JSONException;

    void deleteTokens();

    w getNativeGeneratedToken();

    String getToken();

    void setInitToken(String str);
}
