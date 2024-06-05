package pc;

import java.util.ArrayList;
import lc.a;
import lc.c;
import lc.i;
import pc.a1;

/* compiled from: GeneratedAndroidFirebaseAuth */
public final /* synthetic */ class o2 {

    /* compiled from: GeneratedAndroidFirebaseAuth */
    class a implements a1.f0<a1.a0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f37159a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f37160b;

        a(ArrayList arrayList, a.e eVar) {
            this.f37159a = arrayList;
            this.f37160b = eVar;
        }

        public void a(Throwable th) {
            this.f37160b.a(a1.a(th));
        }

        /* renamed from: b */
        public void success(a1.a0 a0Var) {
            this.f37159a.add(0, a0Var);
            this.f37160b.a(this.f37159a);
        }
    }

    public static i<Object> b() {
        return a1.i.f36953d;
    }

    public static /* synthetic */ void c(a1.h hVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        hVar.e((String) arrayList.get(0), (a1.x) arrayList.get(1), (String) arrayList.get(2), new a(new ArrayList(), eVar));
    }

    public static void d(c cVar, a1.h hVar) {
        lc.a aVar = new lc.a(cVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactoResolverHostApi.resolveSignIn", b());
        if (hVar != null) {
            aVar.e(new n2(hVar));
        } else {
            aVar.e((a.d) null);
        }
    }
}
