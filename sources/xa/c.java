package xa;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.k;

/* compiled from: BatchOperation */
public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    final Map<String, Object> f23683a;

    /* renamed from: b  reason: collision with root package name */
    final a f23684b = new a();

    /* renamed from: c  reason: collision with root package name */
    final boolean f23685c;

    /* compiled from: BatchOperation */
    public class a implements f {

        /* renamed from: a  reason: collision with root package name */
        Object f23686a;

        /* renamed from: b  reason: collision with root package name */
        String f23687b;

        /* renamed from: c  reason: collision with root package name */
        String f23688c;

        /* renamed from: d  reason: collision with root package name */
        Object f23689d;

        public a() {
        }

        public void error(String str, String str2, Object obj) {
            this.f23687b = str;
            this.f23688c = str2;
            this.f23689d = obj;
        }

        public void success(Object obj) {
            this.f23686a = obj;
        }
    }

    public c(Map<String, Object> map, boolean z10) {
        this.f23683a = map;
        this.f23685c = z10;
    }

    public <T> T a(String str) {
        return this.f23683a.get(str);
    }

    public boolean c() {
        return this.f23685c;
    }

    public String f() {
        return (String) this.f23683a.get("method");
    }

    public boolean g(String str) {
        return this.f23683a.containsKey(str);
    }

    public f m() {
        return this.f23684b;
    }

    public Map<String, Object> n() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.f23684b.f23687b);
        hashMap2.put("message", this.f23684b.f23688c);
        hashMap2.put(JsonStorageKeyNames.DATA_KEY, this.f23684b.f23689d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    public Map<String, Object> o() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.f23684b.f23686a);
        return hashMap;
    }

    public void p(k.d dVar) {
        a aVar = this.f23684b;
        dVar.error(aVar.f23687b, aVar.f23688c, aVar.f23689d);
    }

    public void q(List<Map<String, Object>> list) {
        if (!c()) {
            list.add(n());
        }
    }

    public void r(List<Map<String, Object>> list) {
        if (!c()) {
            list.add(o());
        }
    }
}
