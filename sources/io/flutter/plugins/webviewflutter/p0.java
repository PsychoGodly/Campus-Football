package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import lc.a;
import lc.c;
import lc.i;
import lc.r;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class p0 {
    public static i<Object> b() {
        return new r();
    }

    public static /* synthetic */ void c(n.r rVar, Object obj, a.e eVar) {
        Long l10;
        ArrayList<Object> arrayList = new ArrayList<>();
        Number number = (Number) ((ArrayList) obj).get(0);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        rVar.a(l10);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static void d(c cVar, n.r rVar) {
        a aVar = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.JavaObjectHostApi.dispose", b());
        if (rVar != null) {
            aVar.e(new o0(rVar));
        } else {
            aVar.e((a.d) null);
        }
    }
}
