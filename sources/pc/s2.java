package pc;

import java.util.ArrayList;
import lc.a;
import lc.i;
import pc.a1;

/* compiled from: GeneratedAndroidFirebaseAuth */
public final /* synthetic */ class s2 {

    /* compiled from: GeneratedAndroidFirebaseAuth */
    class a implements a1.f0<a1.z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f37176a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f37177b;

        a(ArrayList arrayList, a.e eVar) {
            this.f37176a = arrayList;
            this.f37177b = eVar;
        }

        public void a(Throwable th) {
            this.f37177b.a(a1.a(th));
        }

        /* renamed from: b */
        public void success(a1.z zVar) {
            this.f37176a.add(0, zVar);
            this.f37177b.a(this.f37176a);
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    class b implements a1.f0<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f37178a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f37179b;

        b(ArrayList arrayList, a.e eVar) {
            this.f37178a = arrayList;
            this.f37179b = eVar;
        }

        public void a(Throwable th) {
            this.f37179b.a(a1.a(th));
        }

        /* renamed from: b */
        public void success(String str) {
            this.f37178a.add(0, str);
            this.f37179b.a(this.f37178a);
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    class c implements a1.f0<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f37180a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f37181b;

        c(ArrayList arrayList, a.e eVar) {
            this.f37180a = arrayList;
            this.f37181b = eVar;
        }

        public void a(Throwable th) {
            this.f37181b.a(a1.a(th));
        }

        /* renamed from: b */
        public void success(String str) {
            this.f37180a.add(0, str);
            this.f37181b.a(this.f37180a);
        }
    }

    public static i<Object> d() {
        return a1.k.f36954d;
    }

    public static /* synthetic */ void f(a1.j jVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        jVar.a((String) arrayList.get(0), (String) arrayList.get(1), new b(new ArrayList(), eVar));
    }

    public static /* synthetic */ void g(a1.j jVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        jVar.c((String) arrayList.get(0), (String) arrayList.get(1), new c(new ArrayList(), eVar));
    }

    public static void h(lc.c cVar, a1.j jVar) {
        lc.a aVar = new lc.a(cVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.generateSecret", d());
        if (jVar != null) {
            aVar.e(new p2(jVar));
        } else {
            aVar.e((a.d) null);
        }
        lc.a aVar2 = new lc.a(cVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForEnrollment", d());
        if (jVar != null) {
            aVar2.e(new r2(jVar));
        } else {
            aVar2.e((a.d) null);
        }
        lc.a aVar3 = new lc.a(cVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForSignIn", d());
        if (jVar != null) {
            aVar3.e(new q2(jVar));
        } else {
            aVar3.e((a.d) null);
        }
    }
}
