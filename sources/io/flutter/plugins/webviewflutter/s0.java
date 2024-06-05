package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import lc.a;
import lc.c;
import lc.i;
import lc.r;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class s0 {
    public static i<Object> b() {
        return new r();
    }

    public static /* synthetic */ void c(n.t tVar, Object obj, a.e eVar) {
        Long l10;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        String str = (String) arrayList2.get(1);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        tVar.a(l10, str);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static void d(c cVar, n.t tVar) {
        a aVar = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannelHostApi.create", b());
        if (tVar != null) {
            aVar.e(new r0(tVar));
        } else {
            aVar.e((a.d) null);
        }
    }
}
