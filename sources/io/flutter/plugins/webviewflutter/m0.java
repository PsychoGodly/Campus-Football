package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import lc.a;
import lc.c;
import lc.i;
import lc.r;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class m0 {
    public static i<Object> b() {
        return new r();
    }

    public static /* synthetic */ void c(n.p pVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            pVar.clear();
            arrayList.add(0, (Object) null);
        } catch (Throwable th) {
            arrayList = n.a(th);
        }
        eVar.a(arrayList);
    }

    public static void d(c cVar, n.p pVar) {
        a aVar = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.InstanceManagerHostApi.clear", b());
        if (pVar != null) {
            aVar.e(new l0(pVar));
        } else {
            aVar.e((a.d) null);
        }
    }
}
