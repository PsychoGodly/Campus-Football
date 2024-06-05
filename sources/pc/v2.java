package pc;

import java.util.ArrayList;
import lc.a;
import lc.c;
import lc.i;
import lc.r;
import pc.a1;

/* compiled from: GeneratedAndroidFirebaseAuth */
public final /* synthetic */ class v2 {

    /* compiled from: GeneratedAndroidFirebaseAuth */
    class a implements a1.f0<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f37200a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f37201b;

        a(ArrayList arrayList, a.e eVar) {
            this.f37200a = arrayList;
            this.f37201b = eVar;
        }

        public void a(Throwable th) {
            this.f37201b.a(a1.a(th));
        }

        /* renamed from: b */
        public void success(String str) {
            this.f37200a.add(0, str);
            this.f37201b.a(this.f37200a);
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    class b implements a1.f0<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f37202a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f37203b;

        b(ArrayList arrayList, a.e eVar) {
            this.f37202a = arrayList;
            this.f37203b = eVar;
        }

        public void a(Throwable th) {
            this.f37203b.a(a1.a(th));
        }

        /* renamed from: b */
        public void success(Void voidR) {
            this.f37202a.add(0, (Object) null);
            this.f37203b.a(this.f37202a);
        }
    }

    public static i<Object> c() {
        return new r();
    }

    public static /* synthetic */ void d(a1.l lVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        lVar.b((String) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new a(new ArrayList(), eVar));
    }

    public static /* synthetic */ void e(a1.l lVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        lVar.a((String) arrayList.get(0), (String) arrayList.get(1), new b(new ArrayList(), eVar));
    }

    public static void f(c cVar, a1.l lVar) {
        lc.a aVar = new lc.a(cVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.generateQrCodeUrl", c());
        if (lVar != null) {
            aVar.e(new t2(lVar));
        } else {
            aVar.e((a.d) null);
        }
        lc.a aVar2 = new lc.a(cVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.openInOtpApp", c());
        if (lVar != null) {
            aVar2.e(new u2(lVar));
        } else {
            aVar2.e((a.d) null);
        }
    }
}
