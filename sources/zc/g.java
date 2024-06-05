package zc;

import java.util.ArrayList;
import java.util.Map;
import lc.a;
import lc.c;
import lc.i;
import zc.a;

/* compiled from: Messages */
public final /* synthetic */ class g {
    public static i<Object> f() {
        return a.d.f39530d;
    }

    public static /* synthetic */ void g(a.c cVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, cVar.a((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void h(a.c cVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, cVar.d((String) arrayList2.get(0), (Map) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void i(a.c cVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, cVar.e((String) arrayList2.get(0), (Boolean) arrayList2.get(1), (a.e) arrayList2.get(2), (a.C0470a) arrayList2.get(3)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void j(a.c cVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, cVar.b());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void k(a.c cVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            cVar.c();
            arrayList.add(0, (Object) null);
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static void l(c cVar, a.c cVar2) {
        lc.a aVar = new lc.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", f());
        if (cVar2 != null) {
            aVar.e(new f(cVar2));
        } else {
            aVar.e((a.d) null);
        }
        lc.a aVar2 = new lc.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", f());
        if (cVar2 != null) {
            aVar2.e(new c(cVar2));
        } else {
            aVar2.e((a.d) null);
        }
        lc.a aVar3 = new lc.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", f());
        if (cVar2 != null) {
            aVar3.e(new d(cVar2));
        } else {
            aVar3.e((a.d) null);
        }
        lc.a aVar4 = new lc.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", f());
        if (cVar2 != null) {
            aVar4.e(new e(cVar2));
        } else {
            aVar4.e((a.d) null);
        }
        lc.a aVar5 = new lc.a(cVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", f());
        if (cVar2 != null) {
            aVar5.e(new b(cVar2));
        } else {
            aVar5.e((a.d) null);
        }
    }
}
