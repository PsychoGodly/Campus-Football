package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import lc.a;
import lc.c;
import lc.i;
import lc.r;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class i2 {
    public static i<Object> c() {
        return new r();
    }

    public static /* synthetic */ void d(n.f0 f0Var, Object obj, a.e eVar) {
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
        f0Var.a(l10);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(n.f0 f0Var, Object obj, a.e eVar) {
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
        f0Var.b(l10);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static void f(c cVar, n.f0 f0Var) {
        a aVar = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebStorageHostApi.create", c());
        if (f0Var != null) {
            aVar.e(new h2(f0Var));
        } else {
            aVar.e((a.d) null);
        }
        a aVar2 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebStorageHostApi.deleteAllData", c());
        if (f0Var != null) {
            aVar2.e(new g2(f0Var));
        } else {
            aVar2.e((a.d) null);
        }
    }
}
