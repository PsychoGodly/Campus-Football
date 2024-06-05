package pc;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.d;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements FirebaseAuth.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f36890a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f36891b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.b f36892c;

    public /* synthetic */ a(AtomicBoolean atomicBoolean, Map map, d.b bVar) {
        this.f36890a = atomicBoolean;
        this.f36891b = map;
        this.f36892c = bVar;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        b.b(this.f36890a, this.f36891b, this.f36892c, firebaseAuth);
    }
}
