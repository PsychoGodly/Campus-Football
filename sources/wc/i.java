package wc;

import java.util.ArrayList;
import lc.a;
import lc.c;
import lc.r;
import wc.a;

/* compiled from: Messages */
public final /* synthetic */ class i {
    public static lc.i<Object> h() {
        return new r();
    }

    public static /* synthetic */ void i(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.c());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void j(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.f());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void k(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.e());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void l(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.d());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void m(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.b());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void n(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.a());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void o(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.g(arrayList2.get(0) == null ? null : a.c.values()[((Integer) arrayList2.get(0)).intValue()]));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static void p(c cVar, a.b bVar) {
        lc.a aVar = new lc.a(cVar, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", h(), cVar.b());
        if (bVar != null) {
            aVar.e(new e(bVar));
        } else {
            aVar.e((a.d) null);
        }
        lc.a aVar2 = new lc.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", h(), cVar.b());
        if (bVar != null) {
            aVar2.e(new h(bVar));
        } else {
            aVar2.e((a.d) null);
        }
        lc.a aVar3 = new lc.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", h(), cVar.b());
        if (bVar != null) {
            aVar3.e(new f(bVar));
        } else {
            aVar3.e((a.d) null);
        }
        lc.a aVar4 = new lc.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationCachePath", h(), cVar.b());
        if (bVar != null) {
            aVar4.e(new b(bVar));
        } else {
            aVar4.e((a.d) null);
        }
        lc.a aVar5 = new lc.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", h(), cVar.b());
        if (bVar != null) {
            aVar5.e(new g(bVar));
        } else {
            aVar5.e((a.d) null);
        }
        lc.a aVar6 = new lc.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", h(), cVar.b());
        if (bVar != null) {
            aVar6.e(new d(bVar));
        } else {
            aVar6.e((a.d) null);
        }
        lc.a aVar7 = new lc.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", h(), cVar.b());
        if (bVar != null) {
            aVar7.e(new c(bVar));
        } else {
            aVar7.e((a.d) null);
        }
    }
}
