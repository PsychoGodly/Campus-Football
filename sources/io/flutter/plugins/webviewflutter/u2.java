package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import lc.a;
import lc.c;
import lc.i;
import lc.r;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class u2 {
    public static i<Object> c() {
        return new r();
    }

    public static /* synthetic */ void d(n.i0 i0Var, Object obj, a.e eVar) {
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
        i0Var.a(l10);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(n.i0 i0Var, Object obj, a.e eVar) {
        Long l10;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Boolean bool = (Boolean) arrayList2.get(1);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        i0Var.b(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static void f(c cVar, n.i0 i0Var) {
        a aVar = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClientHostApi.create", c());
        if (i0Var != null) {
            aVar.e(new s2(i0Var));
        } else {
            aVar.e((a.d) null);
        }
        a aVar2 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClientHostApi.setSynchronousReturnValueForShouldOverrideUrlLoading", c());
        if (i0Var != null) {
            aVar2.e(new t2(i0Var));
        } else {
            aVar2.e((a.d) null);
        }
    }
}
