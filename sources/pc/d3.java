package pc;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.a0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.d;

/* compiled from: IdTokenChannelStreamHandler */
public class d3 implements d.C0413d {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseAuth f37066a;

    /* renamed from: b  reason: collision with root package name */
    private FirebaseAuth.b f37067b;

    public d3(FirebaseAuth firebaseAuth) {
        this.f37066a = firebaseAuth;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(AtomicBoolean atomicBoolean, Map map, d.b bVar, FirebaseAuth firebaseAuth) {
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        a0 m10 = firebaseAuth.m();
        if (m10 == null) {
            map.put("user", (Object) null);
        } else {
            map.put("user", g3.i(m10).d());
        }
        bVar.success(map);
    }

    public void g(Object obj) {
        FirebaseAuth.b bVar = this.f37067b;
        if (bVar != null) {
            this.f37066a.s(bVar);
            this.f37067b = null;
        }
    }

    public void h(Object obj, d.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f37066a.l().q());
        c3 c3Var = new c3(new AtomicBoolean(true), hashMap, bVar);
        this.f37067b = c3Var;
        this.f37066a.f(c3Var);
    }
}
