package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.util.ArrayList;
import java.util.Map;
import lc.a;
import lc.c;
import lc.i;

/* compiled from: GeneratedAndroidWebView */
public final /* synthetic */ class x3 {

    /* compiled from: GeneratedAndroidWebView */
    class a implements n.w<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f34484a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f34485b;

        a(ArrayList arrayList, a.e eVar) {
            this.f34484a = arrayList;
            this.f34485b = eVar;
        }

        /* renamed from: a */
        public void success(String str) {
            this.f34484a.add(0, str);
            this.f34485b.a(this.f34484a);
        }
    }

    public static i<Object> A() {
        return n.l0.f34367d;
    }

    public static /* synthetic */ void B(n.k0 k0Var, Object obj, a.e eVar) {
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
        k0Var.a(l10);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void C(n.k0 k0Var, Object obj, a.e eVar) {
        Long l10;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        String str = (String) arrayList2.get(1);
        String str2 = (String) arrayList2.get(2);
        String str3 = (String) arrayList2.get(3);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        k0Var.c(l10, str, str2, str3);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void D(n.k0 k0Var, Object obj, a.e eVar) {
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
        k0Var.p(l10);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void E(n.k0 k0Var, Object obj, a.e eVar) {
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
        k0Var.i(l10, bool);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void F(n.k0 k0Var, Object obj, a.e eVar) {
        Long l10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        String str = (String) arrayList2.get(1);
        a aVar = new a(arrayList, eVar);
        if (number == null) {
            l10 = null;
        } else {
            l10 = Long.valueOf(number.longValue());
        }
        k0Var.j(l10, str, aVar);
    }

    public static /* synthetic */ void G(n.k0 k0Var, Object obj, a.e eVar) {
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
        arrayList.add(0, k0Var.o(l10));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void H(n.k0 k0Var, Object obj, a.e eVar) {
        Long l10;
        Long l11;
        Long l12;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Number number2 = (Number) arrayList2.get(1);
        Number number3 = (Number) arrayList2.get(2);
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
        if (number3 == null) {
            l12 = null;
        } else {
            l12 = Long.valueOf(number3.longValue());
        }
        k0Var.k(l10, l11, l12);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void I(n.k0 k0Var, Object obj, a.e eVar) {
        Long l10;
        Long l11;
        Long l12;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        Number number2 = (Number) arrayList2.get(1);
        Number number3 = (Number) arrayList2.get(2);
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
        if (number3 == null) {
            l12 = null;
        } else {
            l12 = Long.valueOf(number3.longValue());
        }
        k0Var.y(l10, l11, l12);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void J(n.k0 k0Var, Object obj, a.e eVar) {
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
        arrayList.add(0, k0Var.b(l10));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void K(n.k0 k0Var, Object obj, a.e eVar) {
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
        arrayList.add(0, k0Var.m(l10));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void L(n.k0 k0Var, Object obj, a.e eVar) {
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
        arrayList.add(0, k0Var.n(l10));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void M(n.k0 k0Var, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            k0Var.e((Boolean) ((ArrayList) obj).get(0));
            arrayList.add(0, (Object) null);
        } catch (Throwable th) {
            arrayList = n.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void N(n.k0 k0Var, Object obj, a.e eVar) {
        Long l10;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        String str = (String) arrayList2.get(1);
        String str2 = (String) arrayList2.get(2);
        String str3 = (String) arrayList2.get(3);
        String str4 = (String) arrayList2.get(4);
        String str5 = (String) arrayList2.get(5);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        k0Var.r(l10, str, str2, str3, str4, str5);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void O(n.k0 k0Var, Object obj, a.e eVar) {
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
        k0Var.z(l10, l11);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void P(n.k0 k0Var, Object obj, a.e eVar) {
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
        k0Var.d(l10, l11);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void Q(n.k0 k0Var, Object obj, a.e eVar) {
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
        k0Var.l(l10, l11);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void R(n.k0 k0Var, Object obj, a.e eVar) {
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
        k0Var.u(l10, l11);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void S(n.k0 k0Var, Object obj, a.e eVar) {
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
        k0Var.f(l10, l11);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void T(n.k0 k0Var, Object obj, a.e eVar) {
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
        k0Var.t(l10, l11);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void U(n.k0 k0Var, Object obj, a.e eVar) {
        Long l10;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        String str = (String) arrayList2.get(1);
        Map map = (Map) arrayList2.get(2);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        k0Var.h(l10, str, map);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void V(n.k0 k0Var, Object obj, a.e eVar) {
        Long l10;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        Number number = (Number) arrayList2.get(0);
        String str = (String) arrayList2.get(1);
        byte[] bArr = (byte[]) arrayList2.get(2);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = n.a(th);
            }
        }
        k0Var.x(l10, str, bArr);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void W(n.k0 k0Var, Object obj, a.e eVar) {
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
        arrayList.add(0, k0Var.w(l10));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void X(n.k0 k0Var, Object obj, a.e eVar) {
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
        arrayList.add(0, k0Var.v(l10));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void Y(n.k0 k0Var, Object obj, a.e eVar) {
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
        arrayList.add(0, k0Var.q(l10));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void Z(n.k0 k0Var, Object obj, a.e eVar) {
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
        k0Var.s(l10);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static /* synthetic */ void a0(n.k0 k0Var, Object obj, a.e eVar) {
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
        k0Var.g(l10);
        arrayList.add(0, (Object) null);
        eVar.a(arrayList);
    }

    public static void b0(c cVar, n.k0 k0Var) {
        lc.a aVar = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.create", A());
        if (k0Var != null) {
            aVar.e(new o3(k0Var));
        } else {
            aVar.e((a.d) null);
        }
        lc.a aVar2 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadData", A());
        if (k0Var != null) {
            aVar2.e(new y2(k0Var));
        } else {
            aVar2.e((a.d) null);
        }
        lc.a aVar3 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadDataWithBaseUrl", A());
        if (k0Var != null) {
            aVar3.e(new v3(k0Var));
        } else {
            aVar3.e((a.d) null);
        }
        lc.a aVar4 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadUrl", A());
        if (k0Var != null) {
            aVar4.e(new w3(k0Var));
        } else {
            aVar4.e((a.d) null);
        }
        lc.a aVar5 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.postUrl", A());
        if (k0Var != null) {
            aVar5.e(new k3(k0Var));
        } else {
            aVar5.e((a.d) null);
        }
        lc.a aVar6 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getUrl", A());
        if (k0Var != null) {
            aVar6.e(new n3(k0Var));
        } else {
            aVar6.e((a.d) null);
        }
        lc.a aVar7 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.canGoBack", A());
        if (k0Var != null) {
            aVar7.e(new e3(k0Var));
        } else {
            aVar7.e((a.d) null);
        }
        lc.a aVar8 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.canGoForward", A());
        if (k0Var != null) {
            aVar8.e(new i3(k0Var));
        } else {
            aVar8.e((a.d) null);
        }
        lc.a aVar9 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.goBack", A());
        if (k0Var != null) {
            aVar9.e(new d3(k0Var));
        } else {
            aVar9.e((a.d) null);
        }
        lc.a aVar10 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.goForward", A());
        if (k0Var != null) {
            aVar10.e(new q3(k0Var));
        } else {
            aVar10.e((a.d) null);
        }
        lc.a aVar11 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.reload", A());
        if (k0Var != null) {
            aVar11.e(new g3(k0Var));
        } else {
            aVar11.e((a.d) null);
        }
        lc.a aVar12 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.clearCache", A());
        if (k0Var != null) {
            aVar12.e(new b3(k0Var));
        } else {
            aVar12.e((a.d) null);
        }
        lc.a aVar13 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.evaluateJavascript", A());
        if (k0Var != null) {
            aVar13.e(new z2(k0Var));
        } else {
            aVar13.e((a.d) null);
        }
        lc.a aVar14 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getTitle", A());
        if (k0Var != null) {
            aVar14.e(new c3(k0Var));
        } else {
            aVar14.e((a.d) null);
        }
        lc.a aVar15 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.scrollTo", A());
        if (k0Var != null) {
            aVar15.e(new p3(k0Var));
        } else {
            aVar15.e((a.d) null);
        }
        lc.a aVar16 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.scrollBy", A());
        if (k0Var != null) {
            aVar16.e(new x2(k0Var));
        } else {
            aVar16.e((a.d) null);
        }
        lc.a aVar17 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollX", A());
        if (k0Var != null) {
            aVar17.e(new s3(k0Var));
        } else {
            aVar17.e((a.d) null);
        }
        lc.a aVar18 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollY", A());
        if (k0Var != null) {
            aVar18.e(new l3(k0Var));
        } else {
            aVar18.e((a.d) null);
        }
        lc.a aVar19 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollPosition", A());
        if (k0Var != null) {
            aVar19.e(new u3(k0Var));
        } else {
            aVar19.e((a.d) null);
        }
        lc.a aVar20 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebContentsDebuggingEnabled", A());
        if (k0Var != null) {
            aVar20.e(new m3(k0Var));
        } else {
            aVar20.e((a.d) null);
        }
        lc.a aVar21 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebViewClient", A());
        if (k0Var != null) {
            aVar21.e(new t3(k0Var));
        } else {
            aVar21.e((a.d) null);
        }
        lc.a aVar22 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.addJavaScriptChannel", A());
        if (k0Var != null) {
            aVar22.e(new f3(k0Var));
        } else {
            aVar22.e((a.d) null);
        }
        lc.a aVar23 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.removeJavaScriptChannel", A());
        if (k0Var != null) {
            aVar23.e(new a3(k0Var));
        } else {
            aVar23.e((a.d) null);
        }
        lc.a aVar24 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setDownloadListener", A());
        if (k0Var != null) {
            aVar24.e(new h3(k0Var));
        } else {
            aVar24.e((a.d) null);
        }
        lc.a aVar25 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebChromeClient", A());
        if (k0Var != null) {
            aVar25.e(new r3(k0Var));
        } else {
            aVar25.e((a.d) null);
        }
        lc.a aVar26 = new lc.a(cVar, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setBackgroundColor", A());
        if (k0Var != null) {
            aVar26.e(new j3(k0Var));
        } else {
            aVar26.e((a.d) null);
        }
    }
}
