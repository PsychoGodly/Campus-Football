package pc;

import java.util.ArrayList;
import java.util.List;
import lc.a;
import lc.i;
import pc.a1;

/* compiled from: GeneratedAndroidFirebaseAuth */
public final /* synthetic */ class b3 {

    /* compiled from: GeneratedAndroidFirebaseAuth */
    class a implements a1.f0<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f37043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f37044b;

        a(ArrayList arrayList, a.e eVar) {
            this.f37043a = arrayList;
            this.f37044b = eVar;
        }

        public void a(Throwable th) {
            this.f37044b.a(a1.a(th));
        }

        /* renamed from: b */
        public void success(Void voidR) {
            this.f37043a.add(0, (Object) null);
            this.f37044b.a(this.f37043a);
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    class b implements a1.f0<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f37045a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f37046b;

        b(ArrayList arrayList, a.e eVar) {
            this.f37045a = arrayList;
            this.f37046b = eVar;
        }

        public void a(Throwable th) {
            this.f37046b.a(a1.a(th));
        }

        /* renamed from: b */
        public void success(Void voidR) {
            this.f37045a.add(0, (Object) null);
            this.f37046b.a(this.f37045a);
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    class c implements a1.f0<a1.w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f37047a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f37048b;

        c(ArrayList arrayList, a.e eVar) {
            this.f37047a = arrayList;
            this.f37048b = eVar;
        }

        public void a(Throwable th) {
            this.f37048b.a(a1.a(th));
        }

        /* renamed from: b */
        public void success(a1.w wVar) {
            this.f37047a.add(0, wVar);
            this.f37048b.a(this.f37047a);
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    class d implements a1.f0<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f37049a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f37050b;

        d(ArrayList arrayList, a.e eVar) {
            this.f37049a = arrayList;
            this.f37050b = eVar;
        }

        public void a(Throwable th) {
            this.f37050b.a(a1.a(th));
        }

        /* renamed from: b */
        public void success(Void voidR) {
            this.f37049a.add(0, (Object) null);
            this.f37050b.a(this.f37049a);
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    class e implements a1.f0<List<a1.v>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f37051a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f37052b;

        e(ArrayList arrayList, a.e eVar) {
            this.f37051a = arrayList;
            this.f37052b = eVar;
        }

        public void a(Throwable th) {
            this.f37052b.a(a1.a(th));
        }

        /* renamed from: b */
        public void success(List<a1.v> list) {
            this.f37051a.add(0, list);
            this.f37052b.a(this.f37051a);
        }
    }

    public static i<Object> f() {
        return a1.n.f36955d;
    }

    public static /* synthetic */ void g(a1.m mVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        mVar.a((a1.b) arrayList.get(0), (a1.x) arrayList.get(1), (String) arrayList.get(2), new a(new ArrayList(), eVar));
    }

    public static /* synthetic */ void h(a1.m mVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        mVar.b((a1.b) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new b(new ArrayList(), eVar));
    }

    public static /* synthetic */ void j(a1.m mVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        mVar.d((a1.b) arrayList.get(0), (String) arrayList.get(1), new d(new ArrayList(), eVar));
    }

    public static void l(lc.c cVar, a1.m mVar) {
        lc.a aVar = new lc.a(cVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollPhone", f());
        if (mVar != null) {
            aVar.e(new z2(mVar));
        } else {
            aVar.e((a.d) null);
        }
        lc.a aVar2 = new lc.a(cVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollTotp", f());
        if (mVar != null) {
            aVar2.e(new x2(mVar));
        } else {
            aVar2.e((a.d) null);
        }
        lc.a aVar3 = new lc.a(cVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getSession", f());
        if (mVar != null) {
            aVar3.e(new y2(mVar));
        } else {
            aVar3.e((a.d) null);
        }
        lc.a aVar4 = new lc.a(cVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.unenroll", f());
        if (mVar != null) {
            aVar4.e(new w2(mVar));
        } else {
            aVar4.e((a.d) null);
        }
        lc.a aVar5 = new lc.a(cVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getEnrolledFactors", f());
        if (mVar != null) {
            aVar5.e(new a3(mVar));
        } else {
            aVar5.e((a.d) null);
        }
    }
}
