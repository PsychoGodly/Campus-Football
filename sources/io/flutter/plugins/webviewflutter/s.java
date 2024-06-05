package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import lc.a;
import lc.c;
import lc.i;
import lc.r;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class s {

    /* compiled from: GeneratedAndroidWebView */
    class a implements n.w<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f34417a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f34418b;

        a(ArrayList arrayList, a.e eVar) {
            this.f34417a = arrayList;
            this.f34418b = eVar;
        }

        /* renamed from: a */
        public void success(Boolean bool) {
            this.f34417a.add(0, bool);
            this.f34418b.a(this.f34417a);
        }
    }

    public static i<Object> e() {
        return new r();
    }

    public static /* synthetic */ void f(n.c cVar, Object obj, a.e eVar) {
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
        cVar.b(l10);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void g(n.c cVar, Object obj, a.e eVar) {
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
        cVar.d(l10, str, str2);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void h(n.c cVar, Object obj, a.e eVar) {
        Long l10;
        ArrayList arrayList = new ArrayList();
        Number number = (Number) ((ArrayList) obj).get(0);
        a aVar = new a(arrayList, eVar);
        if (number == null) {
            l10 = null;
        } else {
            l10 = Long.valueOf(number.longValue());
        }
        cVar.a(l10, aVar);
    }

    public static /* synthetic */ void i(n.c cVar, Object obj, a.e eVar) {
        Long l10;
        Long l11;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Number number2 = (Number) arrayList2.get(1);
        Boolean bool = (Boolean) arrayList2.get(2);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        if (number2 == null) {
            l11 = null;
        } else {
            l11 = Long.valueOf(number2.longValue());
        }
        cVar.c(l10, l11, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static void j(c cVar, n.c cVar2) {
        lc.a aVar = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.attachInstance", e());
        if (cVar2 != null) {
            aVar.e(new o(cVar2));
        } else {
            aVar.e((a.d) null);
        }
        lc.a aVar2 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.setCookie", e());
        if (cVar2 != null) {
            aVar2.e(new q(cVar2));
        } else {
            aVar2.e((a.d) null);
        }
        lc.a aVar3 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.removeAllCookies", e());
        if (cVar2 != null) {
            aVar3.e(new r(cVar2));
        } else {
            aVar3.e((a.d) null);
        }
        lc.a aVar4 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.setAcceptThirdPartyCookies", e());
        if (cVar2 != null) {
            aVar4.e(new p(cVar2));
        } else {
            aVar4.e((a.d) null);
        }
    }
}
