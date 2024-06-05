package da;

import ea.b;
import ea.d;
import ea.e;
import ea.f;
import java.util.HashSet;
import org.json.JSONObject;

public class c implements b.C0300b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f28728a;

    /* renamed from: b  reason: collision with root package name */
    private final ea.c f28729b;

    public c(ea.c cVar) {
        this.f28729b = cVar;
    }

    public JSONObject a() {
        return this.f28728a;
    }

    public void a(JSONObject jSONObject) {
        this.f28728a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f28729b.c(new e(this, hashSet, jSONObject, j10));
    }

    public void c() {
        this.f28729b.c(new d(this));
    }

    public void d(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f28729b.c(new f(this, hashSet, jSONObject, j10));
    }
}
