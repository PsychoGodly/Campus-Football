package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import lc.a;
import lc.c;
import lc.i;
import lc.r;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class k0 {
    public static i<Object> d() {
        return new r();
    }

    public static /* synthetic */ void e(n.o oVar, Object obj, a.e eVar) {
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
        arrayList.add(0, oVar.b(l10));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(n.o oVar, Object obj, a.e eVar) {
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
        oVar.a(l10);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void g(n.o oVar, Object obj, a.e eVar) {
        Long l10;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        String str = (String) arrayList2.get(1);
        String str2 = (String) arrayList2.get(2);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        oVar.c(l10, str, str2);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static void h(c cVar, n.o oVar) {
        a aVar = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.useHttpAuthUsernamePassword", d());
        if (oVar != null) {
            aVar.e(new j0(oVar));
        } else {
            aVar.e((a.d) null);
        }
        a aVar2 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.cancel", d());
        if (oVar != null) {
            aVar2.e(new h0(oVar));
        } else {
            aVar2.e((a.d) null);
        }
        a aVar3 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.proceed", d());
        if (oVar != null) {
            aVar3.e(new i0(oVar));
        } else {
            aVar3.e((a.d) null);
        }
    }
}
