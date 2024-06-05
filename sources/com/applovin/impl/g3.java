package com.applovin.impl;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

abstract class g3 {
    private static String a(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String b(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    public static byte[] a(byte[] bArr) {
        if (yp.f13662a >= 27) {
            return bArr;
        }
        return yp.c(a(yp.a(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (yp.f13662a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(yp.a(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(b(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(b(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return yp.c(sb2.toString());
        } catch (JSONException e10) {
            kc.a("ClearKeyUtil", "Failed to adjust response data: " + yp.a(bArr), e10);
            return bArr;
        }
    }
}
