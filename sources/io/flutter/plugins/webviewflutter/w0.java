package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import java.util.List;
import lc.a;
import lc.c;
import lc.i;
import lc.r;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class w0 {
    public static i<Object> c() {
        return new r();
    }

    public static /* synthetic */ void d(n.v vVar, Object obj, a.e eVar) {
        Long l10;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        List list = (List) arrayList2.get(1);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        vVar.a(l10, list);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(n.v vVar, Object obj, a.e eVar) {
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
        vVar.b(l10);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static void f(c cVar, n.v vVar) {
        a aVar = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestHostApi.grant", c());
        if (vVar != null) {
            aVar.e(new u0(vVar));
        } else {
            aVar.e((a.d) null);
        }
        a aVar2 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestHostApi.deny", c());
        if (vVar != null) {
            aVar2.e(new v0(vVar));
        } else {
            aVar2.e((a.d) null);
        }
    }
}
