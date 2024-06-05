package xa;

import java.util.HashMap;
import java.util.Map;
import va.d0;

/* compiled from: SqlErrorInfo */
public class h {
    public static Map<String, Object> a(e eVar) {
        d0 b10 = eVar.b();
        if (b10 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", b10.c());
        hashMap.put("arguments", b10.b());
        return hashMap;
    }
}
