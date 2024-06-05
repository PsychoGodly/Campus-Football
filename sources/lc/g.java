package lc;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JSONMethodCodec */
public final class g implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final g f36115a = new g();

    private g() {
    }

    public j a(ByteBuffer byteBuffer) {
        try {
            Object b10 = f.f36114a.b(byteBuffer);
            if (b10 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) b10;
                Object obj = jSONObject.get("method");
                Object g10 = g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new j((String) obj, g10);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + b10);
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }

    public ByteBuffer b(j jVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", jVar.f36116a);
            jSONObject.put("args", h.a(jVar.f36117b));
            return f.f36114a.a(jSONObject);
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }

    public ByteBuffer c(Object obj) {
        return f.f36114a.a(new JSONArray().put(h.a(obj)));
    }

    public ByteBuffer d(String str, String str2, Object obj, String str3) {
        return f.f36114a.a(new JSONArray().put(str).put(h.a(str2)).put(h.a(obj)).put(h.a(str3)));
    }

    public ByteBuffer e(String str, String str2, Object obj) {
        return f.f36114a.a(new JSONArray().put(str).put(h.a(str2)).put(h.a(obj)));
    }

    public Object f(ByteBuffer byteBuffer) {
        try {
            Object b10 = f.f36114a.b(byteBuffer);
            if (b10 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) b10;
                if (jSONArray.length() == 1) {
                    return g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object g10 = g(jSONArray.opt(1));
                    Object g11 = g(jSONArray.opt(2));
                    if ((obj instanceof String) && (g10 == null || (g10 instanceof String))) {
                        throw new e((String) obj, (String) g10, g11);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + b10);
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public Object g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
