package r2;

import k4.n0;
import k4.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ClearKeyUtil */
final class a {
    public static byte[] a(byte[] bArr) {
        if (n0.f19738a >= 27) {
            return bArr;
        }
        return n0.m0(c(n0.D(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (n0.f19738a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(n0.D(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return n0.m0(sb2.toString());
        } catch (JSONException e10) {
            r.d("ClearKeyUtil", "Failed to adjust response data: " + n0.D(bArr), e10);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
