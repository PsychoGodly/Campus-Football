package lc;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: JSONMessageCodec */
public final class f implements i<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f36114a = new f();

    private f() {
    }

    public ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object a10 = h.a(obj);
        if (a10 instanceof String) {
            return t.f36134b.a(JSONObject.quote((String) a10));
        }
        return t.f36134b.a(a10.toString());
    }

    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(t.f36134b.b(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }
}
