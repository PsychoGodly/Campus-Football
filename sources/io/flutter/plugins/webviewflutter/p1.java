package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import lc.a;
import lc.c;
import lc.i;
import lc.r;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class p1 {
    public static i<Object> g() {
        return new r();
    }

    public static /* synthetic */ void h(n.a0 a0Var, Object obj, a.e eVar) {
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
        a0Var.a(l10);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void i(n.a0 a0Var, Object obj, a.e eVar) {
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
        a0Var.b(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void j(n.a0 a0Var, Object obj, a.e eVar) {
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
        a0Var.e(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void k(n.a0 a0Var, Object obj, a.e eVar) {
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
        a0Var.d(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void l(n.a0 a0Var, Object obj, a.e eVar) {
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
        a0Var.f(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void m(n.a0 a0Var, Object obj, a.e eVar) {
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
        a0Var.c(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static void n(c cVar, n.a0 a0Var) {
        a aVar = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.create", g());
        if (a0Var != null) {
            aVar.e(new j1(a0Var));
        } else {
            aVar.e((a.d) null);
        }
        a aVar2 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnShowFileChooser", g());
        if (a0Var != null) {
            aVar2.e(new l1(a0Var));
        } else {
            aVar2.e((a.d) null);
        }
        a aVar3 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnConsoleMessage", g());
        if (a0Var != null) {
            aVar3.e(new o1(a0Var));
        } else {
            aVar3.e((a.d) null);
        }
        a aVar4 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsAlert", g());
        if (a0Var != null) {
            aVar4.e(new n1(a0Var));
        } else {
            aVar4.e((a.d) null);
        }
        a aVar5 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsConfirm", g());
        if (a0Var != null) {
            aVar5.e(new k1(a0Var));
        } else {
            aVar5.e((a.d) null);
        }
        a aVar6 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsPrompt", g());
        if (a0Var != null) {
            aVar6.e(new m1(a0Var));
        } else {
            aVar6.e((a.d) null);
        }
    }
}
