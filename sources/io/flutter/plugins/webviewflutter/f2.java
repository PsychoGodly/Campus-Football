package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import lc.a;
import lc.c;
import lc.i;
import lc.r;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class f2 {
    public static /* synthetic */ void A(n.e0 e0Var, Object obj, a.e eVar) {
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
        e0Var.m(l10, str);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void B(n.e0 e0Var, Object obj, a.e eVar) {
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
        e0Var.k(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void C(n.e0 e0Var, Object obj, a.e eVar) {
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
        e0Var.l(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void D(n.e0 e0Var, Object obj, a.e eVar) {
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
        e0Var.h(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void E(n.e0 e0Var, Object obj, a.e eVar) {
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
        e0Var.i(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static void F(c cVar, n.e0 e0Var) {
        a aVar = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.create", p());
        if (e0Var != null) {
            aVar.e(new w1(e0Var));
        } else {
            aVar.e((a.d) null);
        }
        a aVar2 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setDomStorageEnabled", p());
        if (e0Var != null) {
            aVar2.e(new c2(e0Var));
        } else {
            aVar2.e((a.d) null);
        }
        a aVar3 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setJavaScriptCanOpenWindowsAutomatically", p());
        if (e0Var != null) {
            aVar3.e(new t1(e0Var));
        } else {
            aVar3.e((a.d) null);
        }
        a aVar4 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setSupportMultipleWindows", p());
        if (e0Var != null) {
            aVar4.e(new a2(e0Var));
        } else {
            aVar4.e((a.d) null);
        }
        a aVar5 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setJavaScriptEnabled", p());
        if (e0Var != null) {
            aVar5.e(new e2(e0Var));
        } else {
            aVar5.e((a.d) null);
        }
        a aVar6 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setUserAgentString", p());
        if (e0Var != null) {
            aVar6.e(new r1(e0Var));
        } else {
            aVar6.e((a.d) null);
        }
        a aVar7 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setMediaPlaybackRequiresUserGesture", p());
        if (e0Var != null) {
            aVar7.e(new y1(e0Var));
        } else {
            aVar7.e((a.d) null);
        }
        a aVar8 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setSupportZoom", p());
        if (e0Var != null) {
            aVar8.e(new z1(e0Var));
        } else {
            aVar8.e((a.d) null);
        }
        a aVar9 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setLoadWithOverviewMode", p());
        if (e0Var != null) {
            aVar9.e(new q1(e0Var));
        } else {
            aVar9.e((a.d) null);
        }
        a aVar10 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setUseWideViewPort", p());
        if (e0Var != null) {
            aVar10.e(new x1(e0Var));
        } else {
            aVar10.e((a.d) null);
        }
        a aVar11 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setDisplayZoomControls", p());
        if (e0Var != null) {
            aVar11.e(new v1(e0Var));
        } else {
            aVar11.e((a.d) null);
        }
        a aVar12 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setBuiltInZoomControls", p());
        if (e0Var != null) {
            aVar12.e(new d2(e0Var));
        } else {
            aVar12.e((a.d) null);
        }
        a aVar13 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setAllowFileAccess", p());
        if (e0Var != null) {
            aVar13.e(new b2(e0Var));
        } else {
            aVar13.e((a.d) null);
        }
        a aVar14 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setTextZoom", p());
        if (e0Var != null) {
            aVar14.e(new s1(e0Var));
        } else {
            aVar14.e((a.d) null);
        }
        a aVar15 = new a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.getUserAgentString", p());
        if (e0Var != null) {
            aVar15.e(new u1(e0Var));
        } else {
            aVar15.e((a.d) null);
        }
    }

    public static i<Object> p() {
        return new r();
    }

    public static /* synthetic */ void q(n.e0 e0Var, Object obj, a.e eVar) {
        Long l10;
        Long l11;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Number number2 = (Number) arrayList2.get(1);
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
        e0Var.d(l10, l11);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void r(n.e0 e0Var, Object obj, a.e eVar) {
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
        e0Var.b(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void s(n.e0 e0Var, Object obj, a.e eVar) {
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
        e0Var.c(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void t(n.e0 e0Var, Object obj, a.e eVar) {
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
        e0Var.o(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void u(n.e0 e0Var, Object obj, a.e eVar) {
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
        e0Var.f(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void v(n.e0 e0Var, Object obj, a.e eVar) {
        Long l10;
        Long l11;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Number number2 = (Number) arrayList2.get(1);
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
        e0Var.g(l10, l11);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void w(n.e0 e0Var, Object obj, a.e eVar) {
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
        arrayList.add(0, e0Var.a(l10));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void x(n.e0 e0Var, Object obj, a.e eVar) {
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
        e0Var.n(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void y(n.e0 e0Var, Object obj, a.e eVar) {
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
        e0Var.e(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void z(n.e0 e0Var, Object obj, a.e eVar) {
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
        e0Var.j(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }
}
