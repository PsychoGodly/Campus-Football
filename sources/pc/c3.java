package pc;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.d;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c3 implements FirebaseAuth.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f37058a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f37059b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.b f37060c;

    public /* synthetic */ c3(AtomicBoolean atomicBoolean, Map map, d.b bVar) {
        this.f37058a = atomicBoolean;
        this.f37059b = map;
        this.f37060c = bVar;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        d3.b(this.f37058a, this.f37059b, this.f37060c, firebaseAuth);
    }
}
