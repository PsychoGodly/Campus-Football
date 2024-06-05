package j1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.webkit.internal.a;
import androidx.webkit.internal.c;
import androidx.webkit.internal.c0;
import androidx.webkit.internal.e;
import androidx.webkit.internal.f;
import androidx.webkit.internal.g0;
import androidx.webkit.internal.h;
import androidx.webkit.internal.h0;
import androidx.webkit.internal.i0;
import androidx.webkit.internal.j0;
import androidx.webkit.internal.y;
import com.applovin.mediation.MaxReward;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: WebViewCompat */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Uri f19227a = Uri.parse("*");

    /* renamed from: b  reason: collision with root package name */
    private static final Uri f19228b = Uri.parse(MaxReward.DEFAULT_LABEL);

    /* compiled from: WebViewCompat */
    public interface a {
        void onComplete(long j10);
    }

    /* compiled from: WebViewCompat */
    public interface b {
        void onPostMessage(WebView webView, l lVar, Uri uri, boolean z10, b bVar);
    }

    @Deprecated
    public static f a(WebView webView, String str, Set<String> set) {
        if (g0.W.c()) {
            return j(webView).a(str, (String[]) set.toArray(new String[0]));
        }
        throw g0.a();
    }

    public static void b(WebView webView, String str, Set<String> set, b bVar) {
        if (g0.V.c()) {
            j(webView).b(str, (String[]) set.toArray(new String[0]), bVar);
            return;
        }
        throw g0.a();
    }

    private static WebViewProviderBoundaryInterface c(WebView webView) {
        return g().createWebView(webView);
    }

    public static m[] d(WebView webView) {
        a.b bVar = g0.E;
        if (bVar.b()) {
            return c0.k(c.c(webView));
        }
        if (bVar.c()) {
            return j(webView).c();
        }
        throw g0.a();
    }

    public static PackageInfo e() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21) {
            return null;
        }
        if (i10 >= 26) {
            return e.a();
        }
        try {
            return h();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static PackageInfo f(Context context) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PackageInfo e10 = e();
        if (e10 != null) {
            return e10;
        }
        return i(context);
    }

    private static j0 g() {
        return h0.d();
    }

    private static PackageInfo h() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke((Object) null, new Object[0]);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.pm.PackageInfo i(android.content.Context r5) {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            r2 = 21
            r3 = 0
            if (r1 < r2) goto L_0x0023
            r2 = 23
            if (r1 > r2) goto L_0x0023
            java.lang.String r1 = "android.webkit.WebViewFactory"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.String r2 = "getWebViewPackageName"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            goto L_0x0039
        L_0x0023:
            java.lang.String r1 = "android.webkit.WebViewUpdateService"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.String r2 = "getCurrentWebViewPackageName"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
        L_0x0039:
            if (r1 != 0) goto L_0x003c
            return r0
        L_0x003c:
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r3)     // Catch:{  }
            return r5
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.r.i(android.content.Context):android.content.pm.PackageInfo");
    }

    private static i0 j(WebView webView) {
        return new i0(c(webView));
    }

    public static Uri k() {
        a.f fVar = g0.f5007j;
        if (fVar.b()) {
            return f.b();
        }
        if (fVar.c()) {
            return g().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw g0.a();
    }

    public static String l() {
        if (g0.Y.c()) {
            return g().getStatics().getVariationsHeader();
        }
        throw g0.a();
    }

    public static boolean m() {
        if (g0.S.c()) {
            return g().getStatics().isMultiProcessEnabled();
        }
        throw g0.a();
    }

    public static void n(WebView webView, l lVar, Uri uri) {
        if (f19227a.equals(uri)) {
            uri = f19228b;
        }
        a.b bVar = g0.F;
        if (bVar.b() && lVar.e() == 0) {
            c.j(webView, c0.f(lVar), uri);
        } else if (!bVar.c() || !y.a(lVar.e())) {
            throw g0.a();
        } else {
            j(webView).d(lVar, uri);
        }
    }

    public static void o(WebView webView, String str) {
        if (g0.V.c()) {
            j(webView).e(str);
            return;
        }
        throw g0.a();
    }

    public static void p(Set<String> set, ValueCallback<Boolean> valueCallback) {
        a.f fVar = g0.f5006i;
        a.f fVar2 = g0.f5005h;
        if (fVar.c()) {
            g().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (fVar2.b()) {
            f.d(arrayList, valueCallback);
        } else if (fVar2.c()) {
            g().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else {
            throw g0.a();
        }
    }

    @Deprecated
    public static void q(List<String> list, ValueCallback<Boolean> valueCallback) {
        p(new HashSet(list), valueCallback);
    }

    public static void r(WebView webView, u uVar) {
        a.h hVar = g0.O;
        if (hVar.b()) {
            h.e(webView, uVar);
        } else if (hVar.c()) {
            j(webView).f((Executor) null, uVar);
        } else {
            throw g0.a();
        }
    }

    public static void s(Context context, ValueCallback<Boolean> valueCallback) {
        a.f fVar = g0.f5002e;
        if (fVar.b()) {
            f.f(context, valueCallback);
        } else if (fVar.c()) {
            g().getStatics().initSafeBrowsing(context, valueCallback);
        } else {
            throw g0.a();
        }
    }
}
