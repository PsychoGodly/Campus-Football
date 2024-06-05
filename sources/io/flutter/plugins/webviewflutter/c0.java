package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import lc.a;
import lc.c;
import lc.i;
import lc.r;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class c0 {
    public static i<Object> c() {
        return new r();
    }

    public static /* synthetic */ void d(n.j jVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, jVar.b((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = n.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(n.j jVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, jVar.a((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = n.a(th);
        }
        eVar.a(arrayList);
    }

    public static void f(c cVar, n.j jVar) {
        a aVar = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManagerHostApi.list", c());
        if (jVar != null) {
            aVar.e(new b0(jVar));
        } else {
            aVar.e((a.d) null);
        }
        a aVar2 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManagerHostApi.getAssetFilePathByName", c());
        if (jVar != null) {
            aVar2.e(new a0(jVar));
        } else {
            aVar2.e((a.d) null);
        }
    }
}
